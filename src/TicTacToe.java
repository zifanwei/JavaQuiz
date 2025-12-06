import java.util.Scanner;

/** Simulation of a Tic-Tac-Toe game (does not do strategy). */
public class TicTacToe {

    // players
    public static final int X = 1;
    public static final int O = -1;
    public static final int EMPTY = 0;

    // game board
    private int[][] board = new int[3][3];

    // current player
    private int player;

    /** Constructor */
    public TicTacToe() {
        clearBoard();
    }

    /** Clears the board */
    public void clearBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
        player = X; // first player is X
    }

    /** Puts an X or O mark at position i,j. */
    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");

        board[i][j] = player; // place the mark for the current player
        player = -player; // switch players (uses fact that O = -X)
    }

    /** Checks whether the board configuration is a win for the given player. */
    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3) || // row 0
                (board[1][0] + board[1][1] + board[1][2] == mark * 3) || // row 1
                (board[2][0] + board[2][1] + board[2][2] == mark * 3) || // row 2
                (board[0][0] + board[1][0] + board[2][0] == mark * 3) || // col 0
                (board[0][1] + board[1][1] + board[2][1] == mark * 3) || // col 1
                (board[0][2] + board[1][2] + board[2][2] == mark * 3) || // col 2
                (board[0][0] + board[1][1] + board[2][2] == mark * 3) || // diagonal
                (board[2][0] + board[1][1] + board[0][2] == mark * 3));  // reverse diagonal
    }

    /** Returns the winning player's code, or 0 to indicate a tie/unfinished game. */
    public int winner() {
        if (isWin(X)) return X;
        else if (isWin(O)) return O;
        else return 0;
    }

    /** Returns a simple character string showing the current board. */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X: sb.append("X"); break;
                    case O: sb.append("O"); break;
                    case EMPTY: sb.append(" "); break;
                }
                if (j < 2) sb.append("|"); // column boundary
            }
            if (i < 2) sb.append("\n-----\n"); // row boundary
        }
        return sb.toString();
    }

    /** Simple main method to test the Tic-Tac-Toe board */
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        System.out.println(game);
        Scanner scanner = new Scanner(System.in);

        int win;

        while(true) {
            System.out.println(game.player);
            System.out.println("input x for coordinate:");
            int i = scanner.nextInt();
            System.out.println("input y for coordinate:");
            int j = scanner.nextInt();
            game.putMark(i,j);
            System.out.println(game);
            win = game.winner();
            if (win != 0) {
                break;
            }
        }



        // Sample moves
//        game.putMark(0, 0); // X
//        System.out.println(game);
//        game.putMark(0, 1); // O
//        System.out.println(game);
//        game.putMark(1, 1); // X
//        System.out.println(game);
//        game.putMark(0, 2); // O
//        System.out.println(game);
//        game.putMark(2, 2); // X wins
//        System.out.println(game);
        if (win == X) System.out.println("X wins!");
        else if (win == O) System.out.println("O wins!");
        else System.out.println("No winner yet.");
    }
}

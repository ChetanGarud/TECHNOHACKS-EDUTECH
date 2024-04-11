import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean player1Turn = true;
        boolean gameEnded = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameEnded) {
            // Display the board
            printBoard(board);

            // Get the player's move
            int row, col;
            do {
                System.out.print("Player " + (player1Turn ? "1" : "2") + ", enter your move (row[1-3] col[1-3]): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');

            // Set the player's symbol on the board
            board[row][col] = player1Turn ? 'X' : 'O';

            // Check if the game is over
            if (isGameOver(board, row, col)) {
                printBoard(board);
                System.out.println("Player " + (player1Turn ? "1" : "2") + " wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameEnded = true;
            }

            // Switch player
            player1Turn = !player1Turn;
        }

        scanner.close();
    }

    // Print the tic-tac-toe board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    // Check if the game is over
    public static boolean isGameOver(char[][] board, int row, int col) {
        // Check row
        if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
            return true;
        }
        // Check column
        if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
            return true;
        }
        // Check diagonals
        if (row == col && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (row + col == 2 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    // Check if the board is full
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

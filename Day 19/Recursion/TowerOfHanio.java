public class TowerOfHanio {

        // This function calculates the number of moves and prints the steps.
        static int towerOfHanoi(int n, int from, int to, int aux) {
            // Base case: only one disk to move
            if (n == 1) {
                System.out.println("Move disk 1 from rod " + from + " to rod " + to);
                return 1;
            }
    
            // Recursive calls
            int moves1 = towerOfHanoi(n - 1, from, aux, to); // Move n-1 disks from 'from' to 'aux'
            System.out.println("Move disk " + n + " from rod " + from + " to rod " + to); // Move nth disk to 'to'
            int moves2 = towerOfHanoi(n - 1, aux, to, from); // Move n-1 disks from 'aux' to 'to'
    
            // Total moves is the sum of moves in both recursive calls + 1 for the nth disk
            return moves1 + 1 + moves2;
        }
    
        public static void main(String[] args) {
            
            int n = 10; // Number of disks
            int totalMoves = towerOfHanoi(n, 1, 3, 2);
            System.out.println("Total moves: " + totalMoves);
        }
    }


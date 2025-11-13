// Simple Collatz program
public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);   
        char mode = args[1].charAt(0);      

        for (int i = 1; i <= n; i++) {      
            long num = i;                    
            int counter = 1;                

            if (mode == 'v') {
                System.out.print(num);       
            }

            // לולאה שרצה לפחות פעם אחת
            do {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }
                counter++;
                if (mode == 'v') {
                    System.out.print(" " + num);
                }
            } while (num != 1);

            if (mode == 'v') {
                System.out.println(" (" + counter + ")");
            }
        }

        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}

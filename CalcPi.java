public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;

        for (int i = 0; i < n; i++) 
		{
            double num = 1 + 2 * i;  

            if (i % 2 == 0) {
                sum += 1.0 / num;   
            } else {
                sum -= 1.0 / num;  
            }
        }
        double finalsum = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + finalsum);
    }
}

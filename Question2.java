import java.util.Scanner;

public class Question2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in).useDelimiter("[,\\s+]");
        float[] num = new float [3];

        System.out.print("Enter three numbers: ");
        for (int i = 0; i < 3; i++){
            num[i] = input.nextFloat();
        }
        float sum = 0;
        float mean = 0;
        for (int i = 0; i < 3; i++){
            sum += num[i];
        }
        mean = sum / 3;
        String print = String.format("The average of %.1f %.1f %.1f is %.1f", num[0], num[1], num[2], mean);
        System.out.print(print);
    }
}

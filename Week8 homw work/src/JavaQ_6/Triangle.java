package JavaQ_6;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        row();
    }
    public static void row(){
    int a,b,n;
        System.out.print("Input the number of rows : ");
        Scanner trng = new Scanner(System.in);
         n = trng.nextInt();
        for (a =1; a<=n; a++){
            for (b=1; b<=a; b++)
                System.out.print(b);
            }
            System.out.println("");
        }

}

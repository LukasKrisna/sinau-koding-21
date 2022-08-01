import java.util.Scanner;
public class Tugas2 {
    public static void main(String args[])
    {
        int bilanganPrima;
        for (int i=0; i<=20; i++){
            bilanganPrima=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bilanganPrima=bilanganPrima+1;
                }
            }
            if (bilanganPrima==2){
                System.out.print(i+" adalah bilangan prima");
                System.out.println("");
            }else if (bilanganPrima!=2){
                System.out.println(i+" bukan bilangan prima");
            }
        }
    }
}
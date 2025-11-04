import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Maukkan bilangan bulat positif");

        int n = input.nextInt();

        int hasil= 1;

        //Menghitung faktorial menggunakan for loop
         for (int i = 1; i <=n; i++){
            hasil=hasil*i;
         }
            System.out.println(" faktorial dari " +n+ " adalah " + hasil);
            input.close();
        

    }
    
}

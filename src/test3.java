import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int i;
        System.out.print("sayi giriniz: ");
        i = inp.nextInt();

        for (int s=1; s<=i; s*=4){
            System.out.println("4'un kuvvetleri: " +s);
        }
        System.out.println("-------------------");
        for (int s=1; s<=i; s*=5){
            System.out.println("5'in kuvvetleri: " +s);
        }
    }

}






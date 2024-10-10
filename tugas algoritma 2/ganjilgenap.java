import java.util.Scanner;

public class ganjilgenap {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("angka bilangan:");

        int no = x.nextInt();

        if (no % 2 == 0) {
            System.out.println("termasuk bilangan genap: " + no);
        } else {
            System.out.println("termasuk bilangan ganjil: " + no);

            x.close();
        }
    }
    
}

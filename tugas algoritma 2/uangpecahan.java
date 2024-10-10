import java.util.Scanner;

public class uangpecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        String[] namapecahan = {"lembar 100 ribuan", "lembar 50 ribuan", "lembar 20 ribuan", 
                                "lembar 10 ribuan", "lembar 5 ribuan", "lembar 2 ribuan", 
                                "lembar 1 ribuan", "keping 500", "keping 100"};

        
        for (int i = 0; i < pecahan.length; i++) {
            int jumlahPecahan = uang / pecahan[i];  
            if (jumlahPecahan > 0) {
                System.out.println(jumlahPecahan + " " + namapecahan[i]);
            }
            uang = uang % pecahan[i];  
        }
    }
}

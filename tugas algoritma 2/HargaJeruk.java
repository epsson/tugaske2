import java.util.Scanner;

public class HargaJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah jeruk yang dibeli
        System.out.print("\njumlah jeruk yang dibeli: ");
        int jumlahjeruk = scanner.nextInt();
        int totalHarga = 0;
        
        // Hitung total harga berdasarkan jumlah jeruk
        if (jumlahjeruk >= 5) {
            totalHarga += (jumlahjeruk / 5) * 10000;  
            jumlahjeruk = jumlahjeruk % 5;  
        }
        
        if (jumlahjeruk >= 2) {
            totalHarga += (jumlahjeruk / 2) * 5000;  
            jumlahjeruk = jumlahjeruk % 2;  
        }
        
        if (jumlahjeruk == 1) {
            totalHarga += 3000;  
        }
        
        // Output total harga
        System.out.println("Total harga = Rp: " + totalHarga);
    }
}

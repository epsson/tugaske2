import java.util.Scanner;

public class lulusatautidak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai dari user
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        
        // Cek apakah nilai lebih dari 75
        if (nilai > 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}

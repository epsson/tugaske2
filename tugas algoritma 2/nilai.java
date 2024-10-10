import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n masukan nilai siswa baru: ");
        int nilai = input.nextInt();

        String predikatsiswa;

        if (nilai > 85) {predikatsiswa = "A";
    } else if (nilai > 75) {predikatsiswa = "B";
    } else if (nilai > 65) {predikatsiswa = "C";
    } else if (nilai > 55) {predikatsiswa = "D";
    } else {
        predikatsiswa = "E";
    }
    System.out.println("Predikat yang diperoleh: " + predikatsiswa);
    input.close();
}
}
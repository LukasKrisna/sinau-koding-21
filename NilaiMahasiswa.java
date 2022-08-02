import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> dataMahasiswa = new ArrayList<String>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke "+i);
            System.out.print("Nama: ");
            String namaMhs = input.next();
            dataMahasiswa.add(namaMhs);

            System.out.print("Jurusan: ");
            String jurusan = input.next();
            dataMahasiswa.add(jurusan);

            System.out.print("NIS/NIM: ");
            int nim = input.nextInt();
            dataMahasiswa.add(String.valueOf(nim));

            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            dataMahasiswa.add(String.valueOf(nilai));

            System.out.print("Status lulus: ");
            String status = input.next();
            dataMahasiswa.add(status);

            System.out.println("-------------------------");
        }
        System.out.println("Nama        Jurusan     NIM     Nilai       Status");


        for (int i = 0; i < dataMahasiswa.size(); i++) {
            System.out.print(dataMahasiswa.get(i)+"\t\t");
        }

    }
}

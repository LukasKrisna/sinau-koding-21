import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih menu untuk menghitung bangun datar");
        System.out.println("---------------------------------");
        System.out.println("[1] Persegi");
        System.out.println("[2] Persegi Panjang");
        System.out.println("[3] Segitiga");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                persegi();
                break;
            case 2:
                persegiPanjang();
                break;
            case 3:
                segitiga();
                break;
            default:
                System.out.println("Exit");
        }
    }
    private static void persegi(){
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Menghitung persegi");
        System.out.println("============================");
        System.out.print("Masukkan sisi persegi: ");

        //RUMUS
        int sisi;
        sisi = input.nextInt();
        int luas = sisi * sisi;
        int keliling = 4 * sisi;

        System.out.println("============================");
        System.out.println("Luas persegi = "+ luas + " cm");
        System.out.println("============================");
        System.out.println("Keliling persegi = "+ keliling + " cm");
    }
    private static void persegiPanjang(){
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Menghitung persegi panjang");
        System.out.println("============================");

        int panjang, lebar, luas, keliling;
        System.out.println("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.println("Masukkan lebar: ");
        lebar = input.nextInt();

        //RUMUS
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("============================");
        System.out.println("Luas persegi panjang = "+ luas + " cm");
        System.out.println("============================");
        System.out.println("Keliling persegi panjang = "+ keliling + " cm");
    }
    private static void segitiga(){
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Menghitung segitiga");
        System.out.println("============================");

        int sisi1, sisi2, sisi3;

        System.out.print("Masukkan sisi 1 segitiga: ");
        sisi1 = input.nextInt();

        System.out.print("Masukkan sisi 2 segitiga: ");
        sisi2 = input.nextInt();

        System.out.print("Masukkan sisi 3 segitiga: ");
        sisi3 = input.nextInt();

        //RUMUS
        int luas = sisi1 + sisi2 + sisi3;
        int keliling = (int) (1.5 * (luas));

        System.out.println("============================");
        System.out.println("Luas segitiga = "+ luas + " cm");
        System.out.println("============================");
        System.out.println("Keliling segitiga = "+ keliling + " cm");
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int pil;
        Account a = new Account();
        String norek, nama;
        double nominal;

        do {
            System.out.println("menu");
            System.out.println("---");
            System.out.println("1. Buka rekening");
            System.out.println("2. Setor ");
            System.out.println("3. Tarik");
            System.out.println("4. Cek saldo");
            System.out.println("5. Cek rekening");
            System.out.println("6. Tutup rekening");
            System.out.println("0. Keluar");
            System.out.print("Masukan pilihan anda: ");

            Scanner sInt = new Scanner(System.in);
            Scanner sString = new Scanner(System.in);
            Scanner sDouble = new Scanner(System.in);

            pil = sInt.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukan no. rekening: ");
                    norek = sString.nextLine();

                    System.out.print("Masukan nama: ");
                    nama = sString.nextLine();

                    System.out.print("Masukan nominal awal: ");
                    nominal = sDouble.nextDouble();

                    a.bukaRekening(norek, nama, nominal);
                    break;
            
                case 2: 
                    System.out.print("Masukan nominal yang ingin disetor: ");
                    nominal = sDouble.nextDouble();
                    a.setor(nominal);
                    
                    break;
                case 3:
                    System.out.print("Masukan nominal penarikan: ");
                    nominal = sDouble.nextDouble();
                    a.tarik(nominal);
                   
                    break;
                case 4:
                    a.cekSaldo();
                    break;
            
                case 5:
                    a.cek_rekening();
                    break;
                case 6:
                    a.turek();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (pil != 0);

        System.out.println("Terima kasih!");
    }
}

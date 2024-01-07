public class Account {
    
    //attribute
    private String norek ;
    private String nama ;
    private double saldo ;
    private int status ;
    
    //method
    public Account() {
        norek = "";
        nama = "";
        saldo = 0;
        status = 0;

    }
    public void bukaRekening(String norek, String nama, double saldo) {
        this.norek = norek ;
        this.nama = nama ;
        this.saldo = saldo ;
        this.status = 1 ;
    }
    public void setor(double nominal) {
        if (status == 1)
            this.saldo += nominal ;
        else
            System.out.println("Aktifkan akun terlebih dahulu.");
    }
    public void tarik(double nominal) {
        if (status == 1) {
            if (nominal > saldo)
                System.out.println("Saldo anda tidak mencukupi.");
            else
                saldo -= nominal;
        }
        else
            System.out.println("Aktifkan akun terlebih dahulu.");
    }
    public void cekSaldo() {
        if (status == 1)
            System.out.println("saldo :" + saldo) ;
        else
            System.out.println("Aktifkan akun terlebih dahulu.");
    }
    public void turek() {
        status = 0;

        System.out.println("Akun anda sudah ditutup.");
    }
    public void cek_rekening() {
        System.out.println("no. rekening :" + norek);
        System.out.println("nama :" + nama);
        System.out.println("saldo :" + saldo);
        System.out.println("status :" + (status == 1 ? "aktif" : "tidak aktif"));
    }

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GPK kontrak=new GPK();
        GPT tetap=new GPT();
        OutputPot pott=new OutputPot();
        Manager manager=new Manager();
        Potongan potongan=new Potongan();
        Scanner sc=new Scanner(System.in);
        System.out.println("Sistem Karyawan PT. Surya Prima Semesta");
        System.out.println("1. Gaji Pegawai Kontrak\n2. Gaji Pegawai Tetap\n3. Gaji Manager");
        System.out.print("Pilihan: ");
        int pil;
        pil=sc.nextInt();
        switch (pil){
            case 1:
                System.out.println("Masukkan Jam Kerja(Jam): ");
                int jam=sc.nextInt();
                int gajik=kontrak.GPK(jam);
                System.out.println("Gaji total anda Rp. "+gajik);
                pott.OutputPot(gajik);
                int pot=potongan.Potongan(gajik);
                System.out.println("Gaji anda RP. "+pot);

                break;
            case 2:
                int gajit=tetap.gaji;
                System.out.println("Gaji anda RP. "+gajit);
                pot=potongan.Potongan(gajit);
                System.out.println("Gaji anda setelah terkena potongan Rp.  "+pot);
                break;
            case 3:
                System.out.println("Masukkan Tunjangan");
                int tun=sc.nextInt();
                gajit=manager.Manager(tun);
                System.out.println("Gaji total dengan tunjangan Rp. "+gajit);
                pot=potongan.Potongan(gajit);



        }

    }
}
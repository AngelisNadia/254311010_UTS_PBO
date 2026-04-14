public class AplikasiMadiunJek {
    public static void main(String[] args) {

        LayananTransportasi[] list = new LayananTransportasi[2];

        list[0] = new MadiunMotor("Dani", 5, 20000);
        list[1] = new MadiunMobil("Rudi", 3, 30000, 20);

        for (int i = 0; i < list.length; i++) {
            System.out.println("Tarif: Rp " + list[i].hitungTarif());

            if (list[i] instanceof MadiunMotor) {
                ((MadiunMotor) list[i]).prosesTransaksi();
            } else if (list[i] instanceof MadiunMobil) {
                ((MadiunMobil) list[i]).prosesTransaksi();
            }

            System.out.println();
        }
    }
}
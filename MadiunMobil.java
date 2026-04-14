class MadiunMobil extends LayananTransportasi {

    private int duaNim;

    public MadiunMobil(String namaDriver, double jarak, double saldoUser, int duaNim) {
        super(namaDriver, jarak, saldoUser);
        this.duaNim = duaNim;
    }

    @Override
    public double hitungTarif() {
        double tarif = jarak * 5000;
        double biayaAdmin = 3000 + (duaNim * 100);
        return tarif + biayaAdmin;
    }

    public void prosesTransaksi() {
        String nama = "ANGELIS NASTA";
        String nim = "254311010";

        System.out.println("=== Transaksi oleh " + nama + " - " + nim + " ===");

        double total = hitungTarif();

        if (saldoUser >= total) {
            saldoUser -= total;
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Gagal! Saldo tidak mencukupi!");
        }
    }
}
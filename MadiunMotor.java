class MadiunMotor extends LayananTrasportasi {

    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    public void prosesTransaksi() {
        String nama = "ANGELIS NASTA";
        String nim = "254311010";

        System.out.println("=== Transaksi oleh " + nama + " - " + nim + " ===");

        double total = hitungTarif();

        if (saldoUser >= total) {
            saldoUser -= total;
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jaral + " km");
            System.out.println("Total: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Gagal! Saldo tidak mencukupi!");
        }
    }
}
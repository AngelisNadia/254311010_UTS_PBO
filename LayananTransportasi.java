abstract class LayananTrasportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser) {
        this.namaDriver = namaDriver;

        if (jarak <= 0) {
            this.jarak = 1;
        } else {
            this.jarak;
        }

        this.saldoUser = saldoUser;
    }

    public abstract double hitungTarif();

    public String getNamaDriver() {
        return namaDriver;
    }

    public double getJarak() {
        return jarak;
    }

    public double getSaldoUser() {
        return saldoUser;
    }
}
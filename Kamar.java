public class Kamar {
    private String nomerKamar;
    private int lantai;
    private double harga;

    public Kamar(){

    }

    public Kamar(String nomerKamar, int lantai, double harga) {
        this.nomerKamar = nomerKamar;
        this.lantai = lantai;
        this.harga = harga;
    }

    public String getNomerKamar() {
        return nomerKamar;
    }

    public void setNomerKamar(String nomerKamar) {
        this.nomerKamar = nomerKamar;
    }

    public int getLantai() {
        return lantai;
    }

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

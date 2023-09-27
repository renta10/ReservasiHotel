import java.time.LocalDate;
import java.util.List;

public class Customer {
    private String nomerCustomer;
    private String namaDepan;
    private String namaBelakang;
    private LocalDate tanggalLahir;
    private String kotaLahir;
    private String noKTP;
    private LocalDate cekIn;
    private LocalDate cekOut;
    private List<Customer> daftarKeluarga;

    public Customer(){

    }

    public Customer(String nomerCustomer, String namaDepan, String namaBelakang,
                    LocalDate tanggalLahir, String kotaLahir, String noKTP,
                    LocalDate cekIn, LocalDate cekOut, List<Customer> daftarKeluarga) {
        this.nomerCustomer = nomerCustomer;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.kotaLahir = kotaLahir;

        this.noKTP = noKTP;
        this.cekIn = cekIn;
        this.cekOut = cekOut;
        this.daftarKeluarga = daftarKeluarga;
    }

    public String getNomerCustomer() {
        return nomerCustomer;
    }

    public void setNomerCustomer(String nomerCustomer) {
        this.nomerCustomer = nomerCustomer;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKotaLahir() {
        return kotaLahir;
    }

    public void setKotaLahir(String kotaLahir) {
        this.kotaLahir = kotaLahir;
    }


    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public LocalDate getCekIn() {
        return cekIn;
    }

    public void setCekIn(LocalDate cekIn) {
        this.cekIn = cekIn;
    }

    public LocalDate getCekOut() {
        return cekOut;
    }

    public void setCekOut(LocalDate cekOut) {
        this.cekOut = cekOut;
    }

    public List<Customer> getDaftarKeluarga() {
        return daftarKeluarga;
    }

    public void setDaftarKeluarga(List<Customer> daftarKeluarga) {
        this.daftarKeluarga = daftarKeluarga;
    }

}

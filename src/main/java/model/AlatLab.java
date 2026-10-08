package model;

public class AlatLab extends KeperluanLab implements InformasiLab {
    private String kondisi; 

    public AlatLab(int idAlat, String namaAlat, int jumlahAlat) {
        super(idAlat, namaAlat, jumlahAlat);
        this.kondisi = "Baik";
    }

    public AlatLab(int idAlat, String namaAlat, int jumlahAlat, String kondisi) {
        super(idAlat, namaAlat, jumlahAlat);
        setKondisi(kondisi);
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        if (kondisi == null || kondisi.trim().isEmpty()) {
            this.kondisi = "Baik"; 
        } else {
            this.kondisi = kondisi;
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Alat: " + id + " || Nama Alat: " + nama + " || Stok: " + jumlah + " || Kondisi: " + kondisi);
    }

    @Override
    public void cetakLabelKategori() {
        System.out.println(" Kategori: Peralatan Praktikum ");
    }
}
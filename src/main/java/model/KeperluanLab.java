/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class KeperluanLab {
    protected int id;
    protected String nama;
    protected int jumlah;

    public KeperluanLab(int id, String nama, int jumlah) {
        setId(id);
        setNama(nama);
        setJumlah(jumlah);
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Gagal: ID tidak boleh 0 atau minus!");
        } else {
            this.id = id;
        }
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Gagal: Nama tidak boleh kosong!");
        } else if (!nama.matches(".*[a-zA-Z0-9].*")) {
            System.out.println("Gagal: Nama tidak boleh hanya berisi simbol atau spasi!");
        } else {
            this.nama = nama;
        }
    }

    public void setJumlah(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Gagal: Jumlah tidak boleh 0 atau minus!");
        } else {
            this.jumlah = jumlah;
        }
    }

    public abstract void tampilkanInfo();
    
}
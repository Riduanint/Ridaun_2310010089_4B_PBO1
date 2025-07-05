
package pbo;

// ===== MATERI 1: CLASS =====
// Class utama untuk produk
public class Produk {
    // ===== MATERI 3: ATRIBUT =====
    protected String nama;      // Materi 7 Encapsulation - protected access
    protected double harga;
    
    // ===== MATERI 4: CONSTRUCTOR =====
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    // ===== MATERI 6: ACCESSOR (Getter) =====
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    // ===== MATERI 5: MUTATOR (Setter) =====
    public void setHarga(double harga) {
        if (harga > 0) {  // ===== MATERI 14: ERROR HANDLING =====
            this.harga = harga;
        } else {
            throw new IllegalArgumentException("Harga harus lebih dari 0");
        }
    }
    
    // ===== MATERI 9: POLYMORPHISM (Method Overriding) =====
    public void tampilkanInfo() {
        System.out.println("Produk: " + nama + " | Harga: Rp" + harga);
    }
}
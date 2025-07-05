
package pbo;

// ===== MATERI 8: INHERITANCE =====
// Class turunan dari Produk
public class ProdukElektronik extends Produk {
    private String garansi;  // ===== MATERI 7: ENCAPSULATION =====
    
    // ===== MATERI 4: CONSTRUCTOR =====
    public ProdukElektronik(String nama, double harga, String garansi) {
        super(nama, harga);  // Memanggil constructor parent class
        this.garansi = garansi;
    }
    
    // ===== MATERI 9: POLYMORPHISM (Method Overriding) =====
    @Override
    public void tampilkanInfo() {
        System.out.println("Produk Elektronik: " + nama + " | Harga: Rp" + harga + 
                          " | Garansi: " + garansi);
    }
    
    // ===== MATERI 6: ACCESSOR =====
    public String getGaransi() {
        return garansi;
    }
}
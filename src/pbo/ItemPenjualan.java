
package pbo;

// ===== MATERI 1: CLASS =====
public class ItemPenjualan {
    // ===== MATERI 3: ATRIBUT =====
    private Produk produk;
    private int jumlah;
    
    // ===== MATERI 4: CONSTRUCTOR =====
    public ItemPenjualan(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }
    
    // ===== MATERI 6: ACCESSOR =====
    public double getSubtotal() {
        return produk.getHarga() * jumlah;
    }
    
    public Produk getProduk() {
        return produk;
    }
    
    public int getJumlah() {
        return jumlah;
    }
}
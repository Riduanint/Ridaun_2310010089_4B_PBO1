
package pbo;

import java.util.ArrayList;

// ===== MATERI 1: CLASS =====
public class SistemPenjualan {
    // ===== MATERI 13: ARRAY (menggunakan ArrayList) =====
    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    private ArrayList<ItemPenjualan> keranjang = new ArrayList<>();
    
    // ===== MATERI 4: CONSTRUCTOR =====
    public SistemPenjualan() {
        // Inisialisasi produk default
        daftarProduk.add(new Produk("Buku Tulis", 500));
        daftarProduk.add(new Produk("Pulpen", 3000));
        daftarProduk.add(new ProdukElektronik("Smartphone", 100000, "1 Tahun"));
        daftarProduk.add(new ProdukElektronik("Laptop", 800000, "2 Tahun"));
    }
    
    // Method untuk menampilkan daftar produk
    public void tampilkanDaftarProduk() {
        System.out.println("\n=== DAFTAR PRODUK ===");
        // ===== MATERI 11: PERULANGAN =====
        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarProduk.get(i).tampilkanInfo();  // ===== MATERI 9: POLYMORPHISM =====
        }
    }
    
    // Method untuk menambah produk ke keranjang
    public void tambahKeKeranjang(int indexProduk, int jumlah) {
        try {  // ===== MATERI 14: ERROR HANDLING =====
            if (indexProduk < 0 || indexProduk >= daftarProduk.size()) {
                throw new IndexOutOfBoundsException("Produk tidak ditemukan!");
            }
            
            Produk produk = daftarProduk.get(indexProduk);
            
            // ===== MATERI 10: SELEKSI =====
            if (jumlah > 0) {
                keranjang.add(new ItemPenjualan(produk, jumlah));
                System.out.println("Berhasil menambahkan " + jumlah + " " + produk.getNama() + " ke keranjang!");
            } else {
                System.out.println("Jumlah harus lebih dari 0!");
            }
        } catch (Exception e) {  // ===== MATERI 14: ERROR HANDLING =====
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method untuk menampilkan keranjang
    public void tampilkanKeranjang() {
        // ===== MATERI 10: SELEKSI =====
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang kosong!");
            return;
        }
        
        System.out.println("\n=== KERANJANG BELANJA ===");
        double total = 0;
        
        // ===== MATERI 11: PERULANGAN (Enhanced for loop) =====
        for (ItemPenjualan item : keranjang) {
            System.out.println(item.getProduk().getNama() + " x" + item.getJumlah() + 
                             " = Rp" + item.getSubtotal());
            total += item.getSubtotal();
        }
        System.out.println("Total: Rp" + total);
    }
    
    // Method untuk checkout
    public void checkout() {
        // ===== MATERI 10: SELEKSI =====
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang kosong! Tidak ada yang bisa di-checkout.");
            return;
        }
        
        System.out.println("\n=== CHECKOUT ===");
        tampilkanKeranjang();
        keranjang.clear();  // Kosongkan keranjang setelah checkout
        System.out.println("Terima kasih atas pembelian Anda!");
    }
}
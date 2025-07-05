
package pbo;

import java.util.Scanner;

// ===== MATERI 1: CLASS =====
// ===== MATERI 2: OBJECT (Main class) =====
public class PenjualanBeraksi {
    
    // ===== MATERI 12: IO SEDERHANA =====
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // ===== MATERI 2: OBJECT (Membuat instance) =====
        SistemPenjualan toko = new SistemPenjualan();
        
        System.out.println("=== SELAMAT DATANG DI TOKO SEDERHANA ===");
        
        // ===== MATERI 11: PERULANGAN =====
        while (true) {
            try {  // ===== MATERI 14: ERROR HANDLING =====
                tampilkanMenu();
                System.out.print("Pilih menu (1-5): ");
                
                // ===== MATERI 12: IO SEDERHANA =====
                int pilihan = scanner.nextInt();
                
                // ===== MATERI 10: SELEKSI =====
                switch (pilihan) {
                    case 1:
                        toko.tampilkanDaftarProduk();
                        break;
                    case 2:
                        beliProduk(toko);
                        break;
                    case 3:
                        toko.tampilkanKeranjang();
                        break;
                    case 4:
                        toko.checkout();
                        break;
                    case 5:
                        System.out.println("Terima kasih! Sampai jumpa!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
                }
            } catch (Exception e) {  // ===== MATERI 14: ERROR HANDLING =====
                System.out.println("Input tidak valid! Silakan masukkan angka.");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Lihat Daftar Produk");
        System.out.println("2. Beli Produk");
        System.out.println("3. Lihat Keranjang");
        System.out.println("4. Checkout");
        System.out.println("5. Keluar");
    }
    
    private static void beliProduk(SistemPenjualan toko) {
        try {  // ===== MATERI 14: ERROR HANDLING =====
            toko.tampilkanDaftarProduk();
            System.out.print("Pilih nomor produk: ");
            int nomorProduk = scanner.nextInt() - 1;  // Convert to index
            
            System.out.print("Masukkan jumlah: ");
            int jumlah = scanner.nextInt();
            
            toko.tambahKeKeranjang(nomorProduk, jumlah);
        } catch (Exception e) {  // ===== MATERI 14: ERROR HANDLING =====
            System.out.println("Input tidak valid!");
            scanner.nextLine(); // Clear buffer
        }
    }
}
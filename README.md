# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini , `Produk`, `ProdukElektronik` , `ItemPenjualan`, `SistemPenjualan`, dan `PenjualanBeraksi` adalah contoh dari class.

```bash
public class Produk {
    ...
}

public class ProdukElektronik extends Produk {
    ...
}

public class ItemPenjualan {
    ...
}

public class SistemPenjualan {
    ...
}

public class PenjualanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `SistemPenjualan toko = new SistemPenjualan();` adalah contoh pembuatan object.

```bash
daftarProduk.add(new Produk("Buku Tulis", 500));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
String nama;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Produk`, `ProdukElektronik` dan `ItemPenjualan`.

```bash
public Produk(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public ItemPenjualan(Produk produk, int jumlah) {
    this.produk = produk;
    this.jumlah = jumlah;
}

public ProdukElektronik(String nama, double harga, String garansi) {
    super(nama, harga); 
    this.garansi = garansi;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setHarga(double harga) {
    this.harga = harga;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getHarga` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}
    
public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String nama;
protected double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ProdukElektronik` mewarisi `Produk` dengan sintaks `extends`.

```bash
public class ProdukElektronik extends Produk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Produk` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `ProdukElektronik` merupakan override dari method `displayInfo` di `Produk`.

```bash
public void tampilkanInfo() {
    System.out.println("Produk: " + nama + " | Harga: Rp" + harga);
}

@Override
public void tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `get` dan seleksi `switch` dalam method `get`.

```bash
    if (jumlah > 0) {
        keranjang.add(new ItemPenjualan(produk, jumlah));
        System.out.println("Berhasil menambahkan " + jumlah + " " + produk.getNama() + " ke keranjang!");
    }
    else {
        System.out.println("Jumlah harus lebih dari 0!");
    }

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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarProduk.size(); i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
toko.tampilkanDaftarProduk();
System.out.print("Pilih nomor produk: ");

System.out.print("Masukkan jumlah: ");
scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Produk[] dafratProduk = new Produk[2];` adalah contoh penggunaan array.

```bash
ArrayList<Produk> daftarProduk = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try { 
    toko.tampilkanDaftarProduk();
    System.out.print("Pilih nomor produk: ");
    int nomorProduk = scanner.nextInt() - 1;  // Convert to index
            
    System.out.print("Masukkan jumlah: ");
    int jumlah = scanner.nextInt();
            
    toko.tambahKeKeranjang(nomorProduk, jumlah);
}
catch (Exception e) {  // ===== MATERI 14: ERROR HANDLING =====
    System.out.println("Input tidak valid!");
     scanner.nextLine(); // Clear buffer
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Riduan
NPM: 2310010089

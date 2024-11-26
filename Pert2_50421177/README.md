# RPL2_50421177
# RPL2_50421177
Repositori ini berisikan projek dari praktikum gunadarma mata kuliah RPL2 yg menggunakan aplikasi pemrograman java dengan beberapa tema praktikum yaitu :
# IMPLEMENTASI AOP DAN DEPEDENCY INJECTION PADA PROJECT SPRING DAN HIBERNATE :  

1. AOP (Aspect-Oriented Programming): Memisahkan fungsi transversal (seperti logging dan transaksi) dari logika utama untuk meningkatkan modularitas, menggunakan anotasi seperti `@Aspect`.  
2. Dependency Injection (DI): Mengelola ketergantungan objek secara otomatis dengan Spring, menggunakan anotasi seperti `@Autowired`, untuk membuat kode lebih fleksibel dan mudah diuji.  
3. Integrasi dengan Hibernate: Menggunakan DI untuk mengatur ORM Hibernate, transaksi, dan repositori data secara efisien.  

Tujuannya adalah menciptakan kode yang lebih terstruktur, modular, dan mudah dikelola.

# KONSEP FRAMEWOK SPRING, PEMBUATAN PROJECT SPRING DAN HIBERNATE :
  Konsep Framework Spring:  
- Spring Core: Mengelola *bean* dan Dependency Injection.  
- Spring AOP: Mengatasi *cross-cutting concerns.  
- Spring Data JPA: Integrasi ORM dengan Hibernate.  
- Spring Boot: Mempermudah konfigurasi dan pengembangan.  

Pembuatan Project Spring dan Hibernate:  
1. Buat proyek dengan Spring Initializr dan tambahkan dependensi (*Spring Web*, *JPA*, *Hibernate*).  
2. Konfigurasi koneksi database di `application.properties`.  
3. Buat entitas (`@Entity`) dan repositori (`JpaRepository`).  
4. Tambahkan logika bisnis di `@Service` dan kontrol di `@RestController`.  
5. Gunakan `@Transactional` untuk mengelola transaksi.  

Hasil: Proyek modular dengan integrasi Spring dan Hibernate untuk pengelolaan database.

# KONSEP DASAR ORM DAN  FRAMEWORK HIBERNATE
  Konsep Dasar ORM:  
- ORM (Object-Relational Mapping): Teknik untuk memetakan objek dalam kode dengan tabel database secara otomatis, mengurangi kebutuhan SQL manual.  
- Tujuan: Mempermudah pengelolaan data dan meningkatkan produktivitas pengembang.  

Framework Hibernate:  
- Hibernate: Framework ORM Java yang memetakan objek Java ke tabel database menggunakan anotasi seperti `@Entity` dan `@Table`.  
- Fitur Utama:  
  1. Hibernate Query Language (HQL) untuk manipulasi data.  
  2. Pengelolaan otomatis untuk hubungan entitas (One-to-Many, Many-to-Many).  
  3. Mendukung *lazy loading* dan caching untuk optimasi performa.  

Hasil: Kode lebih bersih, manajemen data lebih efisien, dan kompatibilitas dengan Spring.

# Model-View-Controller(MVC)
Konsep Model-View-Controller (MVC):  
MVC adalah pola arsitektur yang memisahkan aplikasi menjadi tiga komponen utama:  

1. Model:  
   - Merepresentasikan data dan logika bisnis aplikasi.  
   - Berinteraksi langsung dengan database atau API.  
   - Contoh: Kelas entitas dan layanan pengelolaan data.  

2. View:  
   - Menyajikan data ke pengguna dalam bentuk antarmuka.  
   - Hanya bertanggung jawab untuk tampilan, tanpa logika bisnis.  
   - Contoh: Halaman HTML, JSP, atau template UI lainnya.  

3. Controller:  
   - Menangani permintaan pengguna, memproses data melalui model, dan mengembalikan respons ke *view*.  
   - Bertindak sebagai penghubung antara model dan view.  
   - Contoh: Kelas Spring dengan anotasi `@Controller` atau `@RestController`.  

Keuntungan MVC:  
- Pemisahan tugas yang jelas (modularitas).  
- Memudahkan pengembangan dan pemeliharaan kode.  
- Mendukung pengujian dan penggantian komponen secara independen.
- Anatomi Class, Struktur Aplikasi Java, Object Oriented
  
# Programming (OOP) dengan Java 
Konsep OOP dengan Java:  
1. Encapsulation: Mengamankan data dengan membungkusnya dalam kelas menggunakan modifier akses.  
2. Inheritance: Pewarisan sifat dari kelas induk ke kelas turunan dengan `extends`.  
3. Polymorphism: Objek memiliki banyak bentuk (metode overloading/overriding).  
4. Abstraction: Menyembunyikan detail implementasi dengan *abstract class* atau *interface*.  

Keuntungan:  
- Kode lebih terorganisir, dapat digunakan kembali, skalabel, dan aman.

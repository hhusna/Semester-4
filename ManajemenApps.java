/*Nama  : Miftahul Husna
 *NIM   : 222313208
 *Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 4
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product<T, U> {
    private T name;
    private U category;

    //Constructor untuk mengatur nama dan kategori
    public Product(T name, U category) {
        this.name = name;
        this.category = category;
    }

    //Getter T getName() untuk mengembalikan nama produk
    public T getName() {
        return name;
    }

    //Getter U getCategory() untuk mengembalikan kategori produk
    public U getCategory() {
        return category;
    }

    //void displayInfo() untuk menampilkan informasi produk
    public void displayInfo(T name, U category) {
        System.out.println("Name: " + name + ", Category : " + category);
    }
}

class ProductManager {
    //Atribut untuk menyimpan daftar produk
    List<Product<?, ?>> productList;

    //Constructor untuk menginisialisasi daftar produk
    public ProductManager() {
        productList = new ArrayList<>();
    }

    //untuk menambahkan produk ke daftar
    public void addProduct(Product<?, ?> product) {
        productList.add(product);
    }

    //untuk menampilkan semua produk
    public void displayAllProducts() {
        System.out.println("[DAFTAR PRODUK]");
        for (Product<?, ?> product : productList) {
            System.out.println("Nama: " + product.getName() + ", Kategori: " + product.getCategory());
        }
    }

    //untuk mengurutkan produk berdasarkan nama
    public void sortByName () {
        Collections.sort(productList, new Comparator<Product<?, ?>>() {
            @Override
            public int compare(Product<?, ?> p1, Product<?, ?> p2) {
                return p1.getName().toString().compareTo(p2.getName().toString());
            }
        });
        System.out.println("[Daftar produk berdasarkan nama produk]");
        for (Product<?, ?> product : productList) {
            System.out.println("Nama: " + product.getName() + ", Kategori: " + product.getCategory());
        }
    }

    //untuk mengurutkan produk berdasarkan category
    public void sortByCategory () {
        Collections.sort(productList, new Comparator<Product<?, ?>>() {
            @Override
            public int compare(Product<?, ?> c1, Product<?, ?> c2) {
                return c1.getCategory().toString().compareTo(c2.getCategory().toString());
            }
        });
        System.out.println("[Daftar produk berdasarkan kategori]");
        for (Product<?, ?> product : productList) {
            System.out.println("Nama: " + product.getName() + ", Kategori: " + product.getCategory());
        }
    }

    //untuk mengurutkan produk berdasarkan kategori
    public void sortByCategoryByName () {
        Collections.sort(productList, new Comparator<Product<?, ?>>() {
            @Override
            public int compare(Product<?, ?> p1, Product<?, ?> p2) {
                int comparing = p1.getCategory().toString().compareTo(p2.getCategory().toString());
                if (comparing != 0) {
                    return comparing;
                } else {
                    return p1.getName().toString().compareTo(p2.getName().toString());
                }
            }
        });
        System.out.println("[Daftar produk berdasarkan kategori dan nama]");
        for (Product<?, ?> product : productList) {
            System.out.println("Nama: " + product.getName() + ", Kategori: " + product.getCategory());
        }
    }
}

public class ManajemenApps extends ArrayList<Product<?, ?>>  {
    public static void main(String[] args) {
        //membuat objek Product
        ProductManager pm = new ProductManager();
        Product<String, String> p1 = new Product<>("Pisang", "Buah Segar");
        Product<String, String> p2 = new Product("Wortel", "Sayur Segar");
        Product<String, String> p3 = new Product("Dada Fillet", "Ayam & Unggas");
        Product<String, String> p4 = new Product("Udang", "Seafood");
        Product<String, String> p5 = new Product("Beras", "Kebutuhan Pokok");
        Product<String, String> p6 = new Product("Alpukat", "Buah Segar");

        //menambahkan produk ke ProductManager
        pm.addProduct(p1);
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.addProduct(p4);
        pm.addProduct(p5);
        pm.addProduct(p6);
        System.out.println("Produk telah berhasil dibuat dan ditambahkan.");
        System.out.println();

        //menampilkan semua produk
        pm.displayAllProducts();
        System.out.println();

        //urutan produk berdasarkan nama dan tampilan hasilnya
        pm.sortByName();
        System.out.println();

        //urutan produk berdasarkan kategori dan tampilan hasilnya
        pm.sortByCategory();
        System.out.println();

        //urutan produk berdasarkan kategori kemudian nama dan tampilan hasilnya
        pm.sortByCategoryByName();
    }
}

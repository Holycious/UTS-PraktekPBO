public class Main {
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("=== UTS PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK TI - 2E ===");
        System.out.println("========================================================");
        System.out.println("Dibuat oleh: Leon Shan Yoedha Adjie");
        System.out.println("NIM        : 2341720136");
        System.out.println("========================================================");
        // Instansiasi objek untuk menampilkan data pada class Mac
        mac mac = new mac("Apple", 3, 16, "M1", "Lithium", "FaceID");
        System.out.println("== Data Mac ==============================");
        mac.tampilMac();

        System.out.println();

        // Instansiasi objek untuk menampilkan data pada class Windows
        windows windows = new windows("Asus", 6, 16, "Intel Core i7", "Lithium-Ion", "Cortana");
        System.out.println("== Data Windows =========================");
        windows.tampilWindows();

        System.out.println();

        // Instansiasi objek untuk menampilkan data pada class Pc
        pc pc = new pc("Lenovo", 8, 64, "Prosesor Intel Core i9-12900K", 32);
        System.out.println("== Data PC ==============================");
        pc.tampilPc();
    }
}

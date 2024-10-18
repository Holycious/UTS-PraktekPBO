public class Main {
    public static void main(String[] args) {
        // Instansiasi objek untuk menampilkan data pada class Mac
        mac mac = new mac("Apple", 3, 16, "M1", "Lithium", "FaceID");
        System.out.println("== Data Mac ==============================");
        mac.tampilMac();

        System.out.println();

        // Instansiasi objek untuk menampilkan data pada class Windows
        windows windows = new windows("Dell", 4, 8, "Intel Core i7", "Lithium-Ion", "Cortana");
        System.out.println("== Data Windows =========================");
        windows.tampilWindows();

        System.out.println();

        // Instansiasi objek untuk menampilkan data pada class Pc
        pc pc = new pc("Lenovo", 5, 32, "AMD Ryzen", 27);
        System.out.println("== Data PC ==============================");
        pc.tampilPc();
    }
}

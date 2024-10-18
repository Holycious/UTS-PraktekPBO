public class laptop extends komputer {
    String jenisBaterai;

    public laptop() {

    }

    public laptop(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.jenisBaterai = jenisBaterai;
    }

    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai       : " + jenisBaterai);
    }
}

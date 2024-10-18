public class windows extends laptop{
    String fitur;

    public windows(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai, String fitur) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, jenisBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        tampilLaptop();
        System.out.println("Fitur               : " + fitur);
    }
}

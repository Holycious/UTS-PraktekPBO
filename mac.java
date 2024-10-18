public class mac  extends laptop{
    String security;

    public mac(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai, String security) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, jenisBaterai);
        this.security = security;
    }

    public void tampilMac() {
        tampilLaptop();
        System.out.println("Security            : " + security);
    }
}

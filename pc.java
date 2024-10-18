public class pc extends komputer {
    int ukuranMonitor;

    public pc(){

    }
    public pc(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, int ukuranMonitor) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor + " inci");
    }
}

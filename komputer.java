/**
 * komputer
 */
public class komputer {
    String merk;
    int kecepatanProsesor;
    int sizeMemory;
    String jenisProsesor;

    public komputer(){

    }

    public komputer(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor){
        this.merk = merk;
        this.kecepatanProsesor = kecepatanProsesor;
        this.sizeMemory = sizeMemory;
        this.jenisProsesor = jenisProsesor;
    }

    public void tampilData(){
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Processor : " + kecepatanProsesor + " GHz");
        System.out.println("Ukuran Memory       : " + sizeMemory + " GB");
        System.out.println("Jenis Processor     : " + jenisProsesor);
    }
    
}
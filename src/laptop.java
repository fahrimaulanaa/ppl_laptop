public class laptop{
    String kode, merek, processor, thn_keluar, harga;
    static String welcome = "Terima Kasih Telah Menggunakan Program Kami";
    public laptop(String kode, String merek, String processor, String thn_keluar, String harga){
        this.kode = kode;
        this.merek = merek;
        this.processor = processor;
        this.thn_keluar = thn_keluar;
        this.harga = harga;
    }
    public String getKode(){
        return kode;
    }
    public String getMerek(){
        return merek;
    }
    public String getProcessor(){
        return processor;
    }
    public String getThn_keluar(){
        return thn_keluar;
    }
    public String getHarga(){
        return harga;
    }

    protected static void welcome() {
        System.out.println(welcome);
    }

    public String setKode(String kode){
        return this.kode = kode;
    }

    public String setMerek(String merek){
        return this.merek = merek;
    }

    public String setProcessor(String processor){
        return this.processor = processor;
    }

    public String setThn_keluar(String thn_keluar){
        return this.thn_keluar = thn_keluar;
    }

    public String setHarga(String harga){
        return this.harga = harga;
    }
}
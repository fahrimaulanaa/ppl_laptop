public class Main extends laptop{

    public Main(String kode, String merek, String processor, String thn_keluar, String harga) {
        super(kode, merek, processor, thn_keluar, harga);
    }

    public static void main(String[] args) {
        laptop[] data = new laptop[5];
        data[0] = new laptop("1", "Asus", "Intel Core i7", "2018", "Rp. 10.000.000");
        data[1] = new laptop("2", "Acer", "Intel Core i5", "2017", "Rp. 8.000.000");
        data[2] = new laptop("3", "Lenovo", "Intel Core i3", "2016", "Rp. 6.000.000");
        data[3] = new laptop("4", "HP", "Intel Core i7", "2018", "Rp. 10.000.000");
        data[4] = new laptop("5", "Dell", "Intel Core i5", "2017", "Rp. 8.000.000");
        System.out.println("Kode\tMerek\tProcessor\tTahun Keluar\tHarga");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getKode()+"\t"+data[i].getMerek()+"\t"+data[i].getProcessor()+"\t"+data[i].getThn_keluar()+"\t"+data[i].getHarga());
        }
    }
}
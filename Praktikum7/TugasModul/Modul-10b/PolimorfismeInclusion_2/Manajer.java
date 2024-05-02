public class Manajer extends Pegawai{
    private final int tunjangan = 700000;

    public Manajer(String nama){
        super();
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
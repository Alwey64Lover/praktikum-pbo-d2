public class Programmer extends Pegawai{
    private final int bonus = 450000;

    public Programmer(String nama){
        super();
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
/**
 *
 * @author Alwey Hakim
 */
public class KontrolSenjata {
    
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru())
            System.out.println("Peluru habis");
        else{
            for (int i = 0; i < jumlah; i++){
                if (!isAdaPeluru())
                    System.out.println("Gagal tembak, peluru habis");
                else{
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }

    public String menusuk(){
        if (senjata.isMenusuk())
            return "Jleb!";
        else
            return "Gagal, belum pasang bayonet";
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang.");
    }
}

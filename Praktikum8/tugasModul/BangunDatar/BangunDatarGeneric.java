public class BangunDatarGeneric<Test extends BangunDatar>{
    private Test bangunDatar;

    public void set(Test tipeBangunDatar){
        bangunDatar = tipeBangunDatar;  
    }
    
    public Test get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
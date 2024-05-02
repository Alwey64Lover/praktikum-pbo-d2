public class PolimorfismeCoercion{
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args){
        Integer bilangan = 10;
        int hasilkuadrat = kuadrat(bilangan);

        System.out.printf("hasil kuadrat %d adalah %d.", bilangan, hasilkuadrat);
    }
}
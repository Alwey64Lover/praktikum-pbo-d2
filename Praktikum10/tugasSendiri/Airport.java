public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        return flyer + " diizinkan untuk mendarat.";
    }
}
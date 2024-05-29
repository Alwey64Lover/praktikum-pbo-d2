import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("10001", "Adi");
        mahasiswaMap.put("10002", "Bambang");
        mahasiswaMap.put("10003", "Cici");
        mahasiswaMap.put("10004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " - " + nama));
    }
}

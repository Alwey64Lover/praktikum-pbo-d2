class Coercion{
    public static void main(String[] args){
        int output_1 = 'a';
        System.out.println(output_1);
        // Output:      97
        // Penjelasan:  Character 'a' yang di-assign ke variable integer ouput_1 berubah menjadi nilai ASCII-nya, 97.

        double x = 15.5;
        int output_2 = x;
        System.out.println(output_2);
        // Output:      error
        // Penjelasan:  variable yang bertipe integer tidak dapat di-assign nilai bertipe real.

        int y = 25;
        double output_3 = y;
        System.out.println(output_3);
        // Output:      25.0
        // Penjelasan:  Variable bertipe real dapat di-assign nilai bertipe integer.

        int z = 78;
        char output_4 = (char) z;
        System.out.println(output_4);
        // Output:      N
        // Penjelasan:  Variable z yang mengandung integer bernilai 78 di-cast menjadi character yang memiliki nilai ASCII 78.

        char a = 'a';
        double output_5 = a;
        System.out.println(output_5);
        // Output:      97.0
        // Penjelasan:  Variable output_5 bertipe real dapat di-assign nilai variable bertipe character, menghasilkan angka real dari kode ASCII karakter 'a'.
    }
}
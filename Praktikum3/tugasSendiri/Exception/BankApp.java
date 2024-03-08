/*
  File : BankApp.java   08/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas BankApp yang merupakan program main untuk mengimplementasikan kelas BankAccount dan InsufficientFundsException.
 */

public class BankApp {
  public static void main(String[] args) {
    /* TODO: buatlah main yang akan melakukan operasi transaksi
       dan akan menampilkan pesan bila terjadi kesalahan

       skenario bebas berkreasi, tidak harus sama seperti contoh dibawah
    */
       BankAccount account = new BankAccount(500.0);

       try{// skenario saldo mencukupi
       account.withdraw(200.0);
       System.out.println("Saldo saat ini: $" + account.getBalance());

       // skenario saldo tidak mencukupi
       account.withdraw(400.0);
       }
       catch(InsufficientFundsException ex){
            System.out.println(ex.getMessage());
       }
  }
}

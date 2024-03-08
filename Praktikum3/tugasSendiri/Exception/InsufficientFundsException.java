/*
  File : InsufficientFundsException.java   08/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas InsufficientFundsException sebagai kelas exception untuk dana yang tidak cukup dalam kelas BankAccount.
 */

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
}
/*
  File : UserInputValidator.java   08/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas UserInputValidator yang melakukan asersi terhadap syarat registrasi masing-masing username, email, dan age.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {
  public static void validateUsername(String username) {
    // TODO: buat assertion yang memenuhi persyaratan username
    Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    Matcher matcher = pattern.matcher(username);
    assert(username.length() >= 5):"Username must be at least 5 characters long";
    assert(username.length() <= 20):"Username must be at most 20 characters long";
    assert(matcher.find()):"Invalid username";
  }

  public static void validateEmail(String email) {
    // TODO: buat assertion yang memenuhi persyaratan email
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    Matcher matcher = pattern.matcher(email);
    assert(matcher.find()): "Invalid email address";
  }

  public static void validateAge(int age) {
    // TODO: buat assertion yang memenuhi persyaratan usia
    assert(age >= 17 && age <= 99): "Age must be between 17 and 99";
  }
}

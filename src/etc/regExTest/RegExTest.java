package etc.regExTest;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

  public static void main(String[] args) {
    RegExUtils regExUtils = new RegExUtils();

    String value = "SUCCESS10";
    boolean validate = regExUtils.validate(value);

    System.out.println(validate);
  }


}



class RegExUtils{
  public boolean validate(String value){
    Pattern pattern = Pattern.compile("([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}");
    Matcher matcher = pattern.matcher(value);
    return matcher.matches();
  }
}

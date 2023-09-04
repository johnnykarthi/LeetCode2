package Arrays;

public class CountCharacters {

    public static void main(String[] args) {
          String input = "jlsaf#%AF13f23";
          int countUpperCase = 0;
          int countLowerCase = 0;
          int countNumbers = 0;
          int countSpecialChar = 0;

          for(int i =0;i<input.length();i++)
          {
              char temp = input.charAt(i);
              if(temp >= 'A' && temp <= 'Z') {
                  countUpperCase++;
              } else if (temp >= '0' && temp <= '9') {
                  countNumbers++;
              } else if (temp >= 'a' && temp <= 'z') {
                  countLowerCase++;
              } else {
                  countSpecialChar++;
              }
          }
        System.out.println("UpperCase: "+countUpperCase);
        System.out.println("LowerCase:"+countLowerCase);
        System.out.println("Numbers:"+countNumbers);
        System.out.println("Special:"+ countSpecialChar);
    }
}

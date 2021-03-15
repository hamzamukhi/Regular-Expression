import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regx {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(new FileInputStream(new File("src/TextFile.txt")));
            while(scanner.hasNext()){

                String data = scanner.next();

                Pattern p = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");  //Search for Pattern     //Email   //\w+@\w+.\w+\S+
                Matcher m = p.matcher(data); // get matcher data
                while(m.find()) {
                    System.out.println(data.substring(m.start(), m.end()));
                }

                Pattern p2=Pattern.compile("\\d\\d.\\d.\\d\\d");    //Digits
                Matcher m2=p2.matcher(data);

                while(m2.find()) {
                    System.out.println(data.substring(m2.start(), m2.end()));
                }

                Pattern p3 = Pattern.compile("\\d{1,}-\\d{1,2}-\\d{1,4}");  // date
                Matcher m3 = p3.matcher(data);

                while(m3.find()) {
                    System.out.println(data.substring(m3.start(), m3.end()));
                }

                Pattern p6 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");  // date
                Matcher m6 = p6.matcher(data);

                while(m6.find()) {
                    System.out.println(data.substring(m6.start(), m6.end()));
               }

                Pattern p4 = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");    // time 24hr
                Matcher m4= p4.matcher(data);

                while(m4.find()) {
                    System.out.println(data.substring(m4.start(), m4.end()));
                }

                Pattern p5 = Pattern.compile("https?://(www\\.)?(\\w+)(\\.\\w+)");      //url
                Matcher m5 = p5.matcher(data);

                while(m5.find()) {
                    System.out.println(data.substring(m5.start(), m5.end()));
                }

                Pattern p7 = Pattern.compile("\\d{1,2}:\\d{1,2}");
                Matcher m7 = p7.matcher(data);

                while(m7.find()) {
                    System.out.println(data.substring(m7.start(), m7.end()));
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



}

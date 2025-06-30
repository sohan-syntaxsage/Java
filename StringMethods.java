import java.util.Arrays;

public class Methos {
    public static void main(String[] args) {

        String str = "ICE";
        String str1 = "ICE is an Engineering University";
        String str2 = "It is in khulna";
        String str3 = "It is the best in khulna";
        String str4 = "ICE";
        String str5 = "BSc";
        String repAll = "Md256Sohan. BSc356in225CSE";
        int result;

        System.out.println("Print Contains Methods");
        System.out.println(str1.contains("ICE") + "\n");
        String substr = str1.substring(0, 15);

        System.out.println("print Substring Methods");
        System.out.println(substr + "\n");

        String joineStr = String.join(" ", str1, str2, str3);

        System.out.println("Print Join Methods");
        System.out.println(joineStr + "\n");

        System.out.println("Print replace Methods");
        System.out.println(str2.replace('I', 'E') + "\n");

        System.out.println("Print replaceAll Methods");
        System.out.println(repAll.replaceAll("\\d+", " "));
        System.out.println(repAll.replaceAll("[a-z]", "") + "\n");

        System.out.println("Print replaceFirst Methods");
        System.out.println(repAll.replaceFirst("\\d+", " ") + "\n");

        System.out.println("Print charAt Methods");
        System.out.println(repAll.charAt(9) + "\n");

        System.out.println("Print getBytes Methods");
        byte[] byteArry;
        byteArry = str4.getBytes();
        System.out.println(Arrays.toString(byteArry) + "\n");

        // 09.indexOff()
        System.out.println("Print indexOf Method");
        result = str1.indexOf("is");
        System.out.println((result) + "\n");

        // 10. compareTo()
        // Compare to str with str4
        System.out.println("Print compareTo Method");
        result = str.compareTo(str1);
        System.out.println(result);
        result = str.compareTo(str4);
        System.out.println((result) + "\n");

        // 11.compareToIgnoreCase()
        System.out.println("Print CompareToIgnoreCase");
        result = str.compareToIgnoreCase(str1);
        System.out.println(result);
        result = str.compareToIgnoreCase(str5);
        System.out.println((result) + "\n");

        // 12.

    }
}

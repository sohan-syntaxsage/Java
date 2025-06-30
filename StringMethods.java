import java.util.Arrays;

public class Methos {
    public static void main(String[] args) {

        String Name = "    Sohan   ";
        int Roll = 119;
        float CGPA = 3.80f;
        String str = "ICE";
        String str1 = "ICE is an Engineering University";
        String str2 = "It is in khulna";
        String str3 = "It is the best in khulna";
        String str4 = "ICE";
        String str5 = "BSc";
        String Empty = "";
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

        // 12. trim()
        System.out.println("Print Trim Method");
        System.out.println(Name.trim() + "\n");

        // 13. format()
        System.out.println("Print format Method");
        String result1 = String.format("Name:%s,\n Roll: %d,\n CGPA: %.2f", Name, Roll, CGPA);
        System.out.println((result1) + "\n");

        // 14. spilt()
        System.out.println("Print spilt Method");
        String[] spl = str1.split(" ");
        System.out.println("result= ");
        for (String word : spl) {
            System.out.println(word + ", ");
        }
        System.out.println("\n");

        // 15. toLowercase()
        System.out.println("Print toLowerCase Method");
        System.out.println(str.toLowerCase() + "\n");

        // 16. toUpperCase()
        System.out.println("Print toUpperCase Method");
        System.out.println(str3.toUpperCase() + "\n");

        // 17. valuOf()
        System.out.println("Print valuOf Method");
        System.out.println(String.valueOf(str3) + "\n");

        // 18. toCharArray()
        System.out.println("Print tocharArry");
        char[] letter = str.toCharArray();
        for (char ch : letter) {
            System.out.println(ch);
        }
        System.out.println("\n");

        // 19. matches()
        System.out.println("Print matches Mathode");
        System.out.println(str.matches("[a-z]") + "\n");

        // 20. startsWith()
        System.out.println("Pritn startsWith Method");
        System.out.println(str1.startsWith("ICE"));
        System.out.println(str1.startsWith("ice") + "\n");

        // 21. endsWith()
        System.out.println("Print endsWith Method");
        System.out.println(str1.endsWith("University"));
        System.out.println(str1.endsWith("university") + "\n");

        // 22. isEmpty()
        System.out.println("Print isEmpty Method");
        System.out.println(Empty.isEmpty());
        System.out.println(str1.isEmpty() + "\n");

        // 23. intern()
        System.out.println("Print intern Method");
        String s1 = new String("Sohan");
        String s2 = "Sohan";
        System.out.println(s1 == s2);
        System.out.println((s1.intern() == s2) + "\n");

        // 24. contentEquals()
        System.out.println("24. Print contentEquals()");
        System.out.println(str.contentEquals(str4));
        System.out.println(str1.contentEquals(str2) + "\n");

        // 25. hashCode()
        System.out.println("25. Print hashCode");
        System.out.println(str1.hashCode());
        System.out.println(Empty.hashCode() + "\n");

        // 26. subSequence()
        System.out.println("26. Print suSequence");
        System.out.println(str1.subSequence(8, 15));
    }
}

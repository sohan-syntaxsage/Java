import java.util.Arrays;

public class Methos {
    public static void main(String[] args) {

        String name = "    Sohan   ";
        int roll = 119;
        float cgpa = 3.80f;
        String str = "ICE";
        String str1 = "ICE is an Engineering University";
        String str2 = "It is in khulna";
        String str3 = "It is the best in khulna";
        String str4 = "ICE";
        String str5 = "BSc";
        String empty = "";
        String repAll = "Md256Sohan. BSc356in225CSE";

        System.out.println("01. Contains Method");
        System.out.println(str1.contains("ICE") + "\n");

        System.out.println("02. Substring Method");
        System.out.println(str1.substring(0, 15) + "\n");

        System.out.println("03. Join Method");
        String joinedStr = String.join(" ", str1, str2, str3);
        System.out.println(joinedStr + "\n");

        System.out.println("04. Replace Method");
        System.out.println(str2.replace('I', 'E') + "\n");

        System.out.println("05. replaceAll Method");
        System.out.println(repAll.replaceAll("\\d+", " "));
        System.out.println(repAll.replaceAll("[a-z]", "") + "\n");

        System.out.println("06. replaceFirst Method");
        System.out.println(repAll.replaceFirst("\\d+", " ") + "\n");

        System.out.println("07. charAt Method");
        System.out.println(repAll.charAt(9) + "\n");

        System.out.println("08. getBytes Method");
        byte[] byteArray = str4.getBytes();
        System.out.println(Arrays.toString(byteArray) + "\n");

        System.out.println("09. indexOf Method");
        System.out.println(str1.indexOf("is") + "\n");

        System.out.println("10. compareTo Method");
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str4) + "\n");

        System.out.println("11. compareToIgnoreCase Method");
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.compareToIgnoreCase(str5) + "\n");

        System.out.println("12. trim Method");
        System.out.println(name.trim() + "\n");

        System.out.println("13. format Method");
        String formatted = String.format("Name: %s,\nRoll: %d,\nCGPA: %.2f", name.trim(), roll, cgpa);
        System.out.println(formatted + "\n");

        System.out.println("14. split Method");
        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();

        System.out.println("15. toLowerCase Method");
        System.out.println(str.toLowerCase() + "\n");

        System.out.println("16. toUpperCase Method");
        System.out.println(str3.toUpperCase() + "\n");

        System.out.println("17. valueOf Method");
        System.out.println(String.valueOf(str3) + "\n");

        System.out.println("18. toCharArray Method");
        char[] letters = str.toCharArray();
        for (char ch : letters) {
            System.out.println(ch);
        }
        System.out.println();

        System.out.println("19. matches Method");
        System.out.println(str.matches("[a-z]") + "\n");

        System.out.println("20. startsWith Method");
        System.out.println(str1.startsWith("ICE"));
        System.out.println(str1.startsWith("ice") + "\n");

        System.out.println("21. endsWith Method");
        System.out.println(str1.endsWith("University"));
        System.out.println(str1.endsWith("university") + "\n");

        System.out.println("22. isEmpty Method");
        System.out.println(empty.isEmpty());
        System.out.println(str1.isEmpty() + "\n");

        System.out.println("23. intern Method");
        String s1 = new String("Sohan");
        String s2 = "Sohan";
        System.out.println(s1 == s2);
        System.out.println(s1.intern() == s2 + "\n");

        System.out.println("24. contentEquals Method");
        System.out.println(str.contentEquals(str4));
        System.out.println(str1.contentEquals(str2) + "\n");

        System.out.println("25. hashCode Method");
        System.out.println(str1.hashCode());
        System.out.println(empty.hashCode() + "\n");

        System.out.println("26. subSequence Method");
        System.out.println(str1.subSequence(8, 15));
    }
}

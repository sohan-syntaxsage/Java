public class Methos {
    public static void main(String[]args){
        System.out.println("Print Contains Methods");
        String str1 = "ICE is an Engineering University";
        System.out.println(str1.contains("ICE") +"\n");
        String substr= str1.substring(0,15);

        System.out.println("print Substring Methods");
        Syst   em.out.println(substr +"\n");
        String str2 = "It is in khulna";
        String str3 = "It is the best in khulna";
        String joineStr = String.join(" ", str1, str2, str3);

        System.out.println("Print Join Methods");
        System.out.println(joineStr +"\n");

        System.out.println("Print replace Methods");
        System.out.println(str2.replace('I', 'E') +"\n");

        System.out.println("Print replaceAll Methods");
        String repA= "Md256Sohan. BSc356in225CSE";
        System.out.println(repA.replaceAll("\\d+", " "));
        System.out.println(repA.replaceAll("[a-z]", "") +"\n");

        System.out.println("Print replaceFirst Methods");
        System.out.println(repA.replaceFirst("\\d+", " ") +"\n");

        System.out.println("Print charAt Methods");
        System.out.println(repA.charAt(9) +"\n");

        System.out.println("Print getBytes Methods");
        String gb = "Imperial";
    }
}

package ex_14_Strings;

public class Lab143_StringFunctions {
    public static void main(String[] args) {
        String name="Sonal";//0,1,2,3,4
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));
        System.out.println(name.concat("patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf('o'));
        String s1= "madam";
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.lastIndexOf('m'));
        System.out.println(name.replace('n','N'));
        String name4="Pramod@live.com@123";
        String[] split_name4 =name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        System.out.println(name.substring(1,3));

        String anotherPalindrome= "Niagara. o roar again!";
        System.out.println(anotherPalindrome.length());
       // System.out.println();
        String extrac=anotherPalindrome.substring(11,15);// last index will be not calculated. it will show 11-14

        System.out.println(extrac);











    }
}

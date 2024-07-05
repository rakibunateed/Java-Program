public class harry {

    public static void main(String[] args) {
        String name = new String("Rakibun Atied");
        System.out.println(name);
        int value = name.length();
        System.out.println(value);


        String lString =name.toLowerCase();
        System.out.println(lString);

        String lfString =name.toUpperCase();
        System.out.println(lfString);



        String trimString = "                      rakibun atied           ";
        System.out.println(trimString.trim());

        System.out.println(name.substring(5));
        System.out.println(name.substring(2,10));
        System.out.println(name.replace("Rakibun", "ramim"));
        System.out.println(name.startsWith("Rakibun"));
        System.out.println(name.endsWith("isha"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("k"));
        System.out.println(name.equalsIgnoreCase("RaKIbUn ATIED"));
        
    }
}
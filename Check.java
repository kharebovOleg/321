public class Check {
    public static void checkUserName(String first, String second) {
        boolean check = first.equalsIgnoreCase(second);
        if (check) {
            System.out.println("Выберите другое имя пользователя");
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + first.length() + " символов");
            System.out.println("А без пробелов ваше имя занимает " + first.replace(" ", "").length() + " символов");
            System.out.println("2");
        }
    }
}

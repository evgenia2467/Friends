import static java.lang.String.format;

public class SayHello {
    private static boolean format;

    public static void main(String[] args) {
        var helloFriends = new Friends();
        helloFriends.addNewFriends("Nastya");
        helloFriends.addNewFriends("Masha");
        for (int i = 0; i < helloFriends.myfriendsVar.size(); i++) {
            System.out.println(format("Hello %s",
                    helloFriends.myfriendsVar.get(i)));
        }
    }
}

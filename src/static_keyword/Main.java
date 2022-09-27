package static_keyword;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Marko");
        Friend friend2 = new Friend("Shodji");

//        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}

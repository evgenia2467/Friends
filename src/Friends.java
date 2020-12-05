import java.util.ArrayList;

public class Friends {
   String[] myfriends = {"Vasya", "Sasha", "Mery", "Ann"};
   ArrayList myfriendsVar = new ArrayList();

   Friends() {
      for (var friends : myfriends)  {
         myfriendsVar.add(friends);
      }
   }
   void addNewFriends(String friends) {
      myfriendsVar.add(friends);
   }

}


package extoets3_friendship_OBF;

//you may assume:
// * the friend class is not modified in any other place then in FriendshipUpdater
// * the set of tests is complete

//this is an obfuscated example
public class FriendshipUpdater {

    final Friend[] friends;

    public FriendshipUpdater(Friend[] friends) {
        this.friends = friends;
    }

    public void update() {
        for (Friend friend : friends) {
            doIt(friend);
        }
    }


    private void doIt(Friend friend) {
        int friendshipLevel = friend.friendshipLevel+1;
        int nrOfStars = friend.nrOfStars;

        if (nrOfStars == 0 || (nrOfStars == 1 && friendshipLevel == 10) || nrOfStars == 2 && friendshipLevel == 30) {
            friendshipLevel = 0;
            nrOfStars++;
        }
        if (friend.didSomeInteractionToday) {
            if (friend.isLucky) friendshipLevel += 4;
            friend.isLucky = false;
            friend.nrOfStars = nrOfStars;
            friend.friendshipLevel = friendshipLevel;
        }
    }

}

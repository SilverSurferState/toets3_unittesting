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
        int friendshipLevel = friend.friendshipLevel;
        int nrOfStars = friend.nrOfStars;

        if (friend.didSomeInteractionToday) {
            if (friend.isLucky) {
                friendshipLevel += 4;
            }
            friend.isLucky = false;
        }
        friendshipLevel++;
        if (nrOfStars != 0) {
            if (friend.nrOfStars == 1) {
                if (friendshipLevel == 10) {
                    nrOfStars++;
                    friendshipLevel = 0;
                }
            } else {
                if (friend.didSomeInteractionToday) {
                    friend.friendshipLevel = friendshipLevel * 2;
                }
                if (friend.nrOfStars == 2)
                    if (friendshipLevel == 30) {
                        nrOfStars = nrOfStars +1;
                        friendshipLevel = 0;
                    }
            }
        } else {
            friendshipLevel = 0;
            nrOfStars++;
        }
        if (friend.didSomeInteractionToday) {
            friend.nrOfStars = nrOfStars;
            friend.friendshipLevel = friendshipLevel;
        }
    }

}

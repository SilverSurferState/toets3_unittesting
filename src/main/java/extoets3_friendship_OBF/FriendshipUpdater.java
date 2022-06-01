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
        int counters = friend.friendshipLevel;
        boolean ok = friend.isLucky;
        int i = friend.nrOfStars;

        if (friend.didSomeInteractionToday) {
            if (ok) {
                counters += 4;
            }
            friend.isLucky = false;
        }
        counters++;
        if (i != 0) {
            if (friend.nrOfStars == 1) {
                if (counters == 10) {
                    i++;
                    counters = 0;
                }
            } else {
                if (friend.didSomeInteractionToday) {
                    friend.friendshipLevel = counters * 2;
                }
                if (friend.nrOfStars == 2)
                    if (counters == 30) {
                        i = i +1;
                        counters = 0;
                    }
            }
        } else {
            counters = 0;
            i++;
        }
        if (friend.didSomeInteractionToday) {
            friend.nrOfStars = i;
            friend.friendshipLevel = counters;
        }
    }

}

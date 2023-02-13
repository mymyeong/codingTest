package com.mymyeong.codingtest.peoplefund;

public class Friendship {

    class Acquaintance {
        private String name = null;

        public Acquaintance(String name) {
            this.name = name;
        }

        public String getStatus() {
            return name + " is just an acquaintance\n";
        }
    }

    class Friend {
        private String name = null;
        private String homeTown = null;

        public Friend(String name, String homeTown) {
            this.name = name;
            this.homeTown = homeTown;
        }

        public String getStatus() {
            return name + " is a friend and he is from" + homeTown + "\n";
        }
    }

    class BestFriend {
        private String name = null;
        private String homeTown = null;
        private String favoriteSong = null;

        public BestFriend(String name, String homeTown, String favoriteSong) {
            this.name = name;
            this.homeTown = homeTown;
            this.favoriteSong = favoriteSong;
        }

        public String getStatus() {
            return name + " is my best friend. He is from " + homeTown + "and his favorite song is " + favoriteSong + "\n";
        }
    }


}

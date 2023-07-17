package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        String track = "cecelia";
        if (startIndex >= 2 && startIndex < playList.length) {
            return startIndex;
        } else {
            return +1;
        }
    }
}





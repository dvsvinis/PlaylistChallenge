package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int fwdCount = 0;
        int bckCount = 0;
        int index = 0;
        Integer result = 0;

        //find the index of the selection
        System.out.println("Looking for " + selection);
        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                index = i;
                System.out.println("Index of selection is " + index);
                System.out.println("Length is " + playList.length);
            }
        }
        //calculate forward
        fwdCount = Math.abs(startIndex - index);
        bckCount = Math.abs(playList.length - fwdCount);
        System.out.println("fwdCount is " + fwdCount);
        System.out.println("bckCount is " + bckCount);

//        //is forward or backward less?
        if (fwdCount <= bckCount) {
            result = fwdCount;
        }
        else if (fwdCount > bckCount){
            result = bckCount;
        }
        System.out.println("Result is " + result);
        return result;

    }
}

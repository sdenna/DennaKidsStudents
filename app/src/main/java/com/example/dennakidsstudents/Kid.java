package com.example.dennakidsstudents;

/** This class contains the necessary details for each of Mrs. Denna's kids
 * It will have their name, Birthday, Favorite activity, and a photo
 *
 */

public class Kid {
    private String name;
    private String dob;     // Ex: "Dec 24, 2007"
    private String favActivity;
    private int imageResourceID;

    // kids is an array of Kid objects
    public static final Kid[] dennasKids = {
            new Kid("Aubrey", "Dec 24, 2007", "Anything with Harry Potter", R.drawable.aubrey),
            new Kid("Riley", "Jan 8, 2010", "Singing and Dancing", R.drawable.riley),
            new Kid("Brayden", "Apr 7, 2012", "Trading Pokemon cards", R.drawable.brayden)
    };


    // constructor for each new Kid object
    public Kid(String name, String dob, String favActivity, int imageResourceID) {
        this.name = name;
        this.dob = dob;
        this.favActivity = favActivity;
        this.imageResourceID = imageResourceID;
    }

    public String toString() {
        return this.name;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getFavActivity() {
        return favActivity;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}

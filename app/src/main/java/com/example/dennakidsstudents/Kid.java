package com.example.dennakidsstudents;

/** This class contains the necessary details for each of Mrs. Denna's kids
 *  Her kids include her actual kids... and her App Dev students :)
 *
 *  A Kid object will include their name, Birthday, Favorite activity, and a photo
 */

public class Kid {
    private String name;
    private String dob;          // Ex: "Dec 24, 2007"
    private String favActivity;
    private int imageResourceID;


    public static final Kid[] dennasKids = {
            new Kid("Aubrey", "Dec 24, 2007", "Anything with Harry Potter", R.drawable.aubrey),
            new Kid("Riley", "Jan 8, 2010", "Singing and Dancing", R.drawable.riley),
            new Kid("Brayden", "Apr 7, 2012", "Trading Pokemon cards", R.drawable.brayden)
    };

    public static final Kid[] period5Students = {
            new Kid("Nathan", "Aug 24, 2002", "Rocking in the drumline", R.drawable.nathan),
            new Kid("Keyana", "May 12, 2003", "Laughing, having fun!", R.drawable.keyana),
            new Kid("Ebi", "Nov 2, 2001", "Being awesome", R.drawable.ebi),
            new Kid("Jessica", "Oct 6, 2002", "living the Volleyball life", R.drawable.jessica)
    };

    public static final Kid[] period7Students = {
            new Kid("Ram", "Apr 4, 2002", "No homework weekends", R.drawable.ram),
            new Kid("Eisha", "June 4, 2003", "Living LYFE", R.drawable.eisha),
            new Kid("Suyash", "June 1, 2003", "Being older than Eisha", R.drawable.suyash),
            new Kid("Patrick", "Mar 1, 2002", "Singing extremely well", R.drawable.patrick)
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

package sdf;

public class PlayStoreApp {

    private String name;
    private String category;
    private String highestRatedApp;
    private float highestRating;
    private String lowestRatedApp;
    private float lowestRating;
    private int count;
    private float totalRating;

    public PlayStoreApp(String category) {
        this.category = category;
    }

    public String getCategory() {return category;
    }
    public void setCategory(String category) {this.category = category;
    }

    public void add(float rating){
        totalRating += rating;
        count ++;
    }

    public float getAverageRating() {
        return this.totalRating/this.count;
    }

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    public String getHighestRatedApp() { return highestRatedApp; }
    public void setHighestRatedApp(String highestRatedApp) { this.highestRatedApp = highestRatedApp;}
    public float getHighestRating() {return highestRating;}
    public void setHighestRating(float highestRating) {this.highestRating = highestRating;}

    public String getLowestRatedApp() {return lowestRatedApp;}
    public void setLowestRatedApp(String lowestRatedApp) {this.lowestRatedApp = lowestRatedApp;}
    public float getLowestRating() {return lowestRating;}
    public void setLowestRating(float lowestRating) {this.lowestRating = lowestRating;}

    public void evaluate(String name, Float rating) {
        
        if (rating < this.lowestRating) {
            this.lowestRating = 10;
            this.lowestRatedApp = "test";}

        if (rating > this.highestRating) {
            this.highestRating = rating;
            this.highestRatedApp = name;}
    }
        
    }

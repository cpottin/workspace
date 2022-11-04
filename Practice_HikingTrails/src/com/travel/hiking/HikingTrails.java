package com.travel.hiking;

public class HikingTrails {

    public static final int MAX_ELEVATION_GAIN = 11000;

    private String trailName;
    private double trailLengthMiles = 0;
    private boolean dogsAllowed;
    private int elevationGain = 0;
    private RatingType ratingType = RatingType.STRENUOUS;

    public HikingTrails() {
    }

    public HikingTrails (String trailName, double trailLengthMiles, boolean dogsAllowed,
                        int elevationGain, RatingType ratingType) {
        this.trailName = trailName;
        this.trailLengthMiles = trailLengthMiles;
        this.dogsAllowed = dogsAllowed;
        this.elevationGain = elevationGain;
        this.ratingType = ratingType;
    }


    public HikingTrails(String trailName) {
        this.trailName = trailName;
    }

    public HikingTrails(String trailName, double trailLengthMiles) {
        this.trailName = trailName;
        this.trailLengthMiles = trailLengthMiles;
    }

    public HikingTrails(String trailName, double trailLengthMiles, boolean dogsAllowed,
                        RatingType ratingType, RatingType ratingTypee1, int elevationGain) {
    }

    //business method
    public void weatherIsFavorable() {
        System.out.println("It is safe to hike, " + trailName + " weather is good!");

    }

    public void trailIsClosed() {
        System.out.println(trailName + " is closed for the season.");
    }

    //accesors

    public void setRatingType(RatingType ratingType) {
    }

    public String getTrailName() {
        return trailName;
    }

    public void setTrailName(String trailName) {
        this.trailName = trailName;
    }

    public double getTrailLengthMiles() {
        return trailLengthMiles;
    }

    public void setTrailLengthMiles(double trailLengthMiles) {
        this.trailLengthMiles = trailLengthMiles;
    }

    public boolean isDogsAllowed() {
        return dogsAllowed;
    }

    public void setDogsAllowed(boolean dogsAllowed) {
        this.dogsAllowed = dogsAllowed;
    }

    public int getElevationGain(int elevationGain) {
        return elevationGain;
    }

    public void setElevationGain(int elevationGain) throws IllegalArgumentException{
        if (elevationGain > MAX_ELEVATION_GAIN) {
            throw new IllegalArgumentException("Invalid entry");
        } else {
            this.elevationGain = elevationGain;
        }
    }


    //tostring

    @Override
    public String toString() {
        return "HikingTrails{" +
                "trailName='" + trailName + '\'' +
                ", trailLengthMiles=" + trailLengthMiles +
                ", dogsAllowed=" + dogsAllowed +
                ", elevationGain=" + elevationGain +
                '}';
    }
}

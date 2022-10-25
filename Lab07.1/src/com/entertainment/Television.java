package com.entertainment;

import com.entertainment.client.DisplayType;

public class Television {
    //static variables - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    private int oldVolume;
    private boolean muted = false;
    DisplayType display = DisplayType.LED;

    //FIELDS or INSTANCE VARIABLES
    private String brand = "Toshiba";
    private int volume = 1;

    //Constructor


    public Television(DisplayType display, String brand, int volume) {
        this.display = display;
        this.brand = brand;
        this.volume = volume;
    }

    //instance count = instanceCount +1
    public Television() {
        instanceCount++;
    }



    public Television(String brand, int volume) {
        this();
        this.brand = brand;
        this.volume = volume;
    }

    //BUSINESS METHODS

    public void toggleMute() {
        if (!this.isMuted()) {
            this.setOldVolume(this.getVolume());
            this.setVolume(0);
            this.setMuted(true);
            System.out.println("TV on mute");
        }
            else {
            this.setVolume(oldVolume);
            this.setMuted(false);
            System.out.println("TV is no longer on mute");
        }



    }

    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + brand + " TV to volume " + volume + " and the TV is connected "
                + isConnected);
    }


    public void turnOff() {


        System.out.println("Shutting down ...goodbye");
    }

    //ACCESSOR METHODS

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
                this.brand = brand;
                System.out.println("TV is Samsung");
                break;
            case "LG":
                this.brand =brand;
                System.out.println("TV is LG");
                break;

            case "Sony":
                this.brand = brand;
                System.out.println("TV is Sony");
                break;

            case "Toshiba":
                this.brand =brand;
                System.out.println("TV is Toshiba");
                break;

            default:
                System.out.println("Not valid brand");

        }
    }

    public int getVolume() {
            return volume;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public void setOldVolume(int oldVolume) {
        this.oldVolume = oldVolume;
    }
//    public void setVolume(int volume) {
//
//        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
//
//            System.out.println("Can not set volume");
//        }
//        else{
//            this.volume = volume;
//        }
//
//    }

    public void setVolume(int volume) {

        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {

            this.volume = volume;
        }
        else{
            System.out.println("Can't set volume...outside range");;
        }

    }

    public boolean isMuted(){
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public static int getInstanceCount () {
            return instanceCount;
        }

        private boolean verifyInternetConnection () {
            return true;
        }
//toString
        @Override
        public String toString () {
            return "Television{" +
                    "brand='" + brand + '\'' +
                    ", volume= " + volume +
                    ", instance count = " + instanceCount +
                    ", muted = " + muted +
                    ", display = " + display +
                    '}';
        }
    }


package com.travel.hiking.client;

import com.travel.hiking.HikingTrails;
import com.travel.hiking.RatingType;

public class HikingTrailsValidation {
    public static void main(String[] args) {

        HikingTrails test = new HikingTrails();
        test.setElevationGain(120000);
        System.out.println(test);
    }
}

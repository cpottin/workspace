package com.travel.hiking.client;

import com.travel.hiking.HikingTrails;
import com.travel.hiking.RatingType;

public class HikingTrailsClient {


    public HikingTrailsClient() {
    }

    public static void main(String[] args) {
        HikingTrails trail1 = new HikingTrails();
        trail1.setTrailName("Mt. Mitchell");
        trail1.setTrailLengthMiles(5.5);
        trail1.setDogsAllowed(true);
        trail1.setRatingType(RatingType.STRENUOUS);
        trail1.setElevationGain(3600);
        System.out.println(trail1);
        trail1.weatherIsFavorable();

        HikingTrails trail2 = new HikingTrails("Clingman's Dome", 1.3);
        System.out.println(trail2);
        trail2.trailIsClosed();

        HikingTrails trail3 = new HikingTrails("Cliff", 2.0,
                true, 3000, RatingType.MODERATE );

    }
}

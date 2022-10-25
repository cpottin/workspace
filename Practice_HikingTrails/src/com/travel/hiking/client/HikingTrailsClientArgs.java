package com.travel.hiking.client;

import com.travel.hiking.HikingTrails;
import static java.lang.Integer.parseInt;

public class HikingTrailsClientArgs {
    public static void main(String... args) {
        HikingTrails argTrail = new HikingTrails();

        if(args.length < 2){
            System.out.println("Needs more args");
            return;
        }
        else{
            argTrail.setTrailName(args[0]);
            argTrail.setElevationGain(parseInt(args[1]));
        }
    }
}

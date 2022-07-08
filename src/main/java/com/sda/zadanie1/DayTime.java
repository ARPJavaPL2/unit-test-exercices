package com.sda.zadanie1;

import java.time.LocalTime;

public class DayTime {


    public TimeOfDay getTimeOfDay(LocalTime time) {

        LocalTime midnightTime = LocalTime.of(0, 0);
        LocalTime morningTime = LocalTime.of(6, 0);
        LocalTime middayTime = LocalTime.of(12, 0);
        LocalTime eveningTime = LocalTime.of(18, 0);

        if (time.isAfter(midnightTime) && time.isBefore(morningTime)) {
            return TimeOfDay.NIGHT;
        }
        if (time.isAfter(morningTime) && time.isBefore(middayTime)) {
            return TimeOfDay.MORNING;
        }
        if (time.isAfter(middayTime) && time.isBefore(eveningTime)) {
            return TimeOfDay.AFTERNOON;
        }
        return TimeOfDay.EVENING;
    }

}

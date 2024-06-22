package com.ourairlines.airlines.nonBusinessMethods;

import ch.qos.logback.core.util.CachingDateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utility {


    public Utility() {
    }


    public static String DateFormatter(LocalDate date) {

        String formattedDate = date.format(DateTimeFormatter.ofPattern("MMMM d yyyy"));

        if (formattedDate != null) {
        }

        return String.valueOf(formattedDate);
    }
    }


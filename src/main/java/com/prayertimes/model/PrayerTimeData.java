package com.prayertimes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PrayerTimeData {

    private PrayerTimeResponse timings;
    private PrayerTimeDate date;
    private PrayerTimeMeta meta;

    @Data
    public static class PrayerTimeTimings {

        @JsonProperty("Fajr")
        private String fajr;

        @JsonProperty("Sunrise")
        private String sunrise;

        @JsonProperty("Dhuhr")
        private String dhuhr;

        @JsonProperty("Asr")
        private String asr;

        @JsonProperty("Sunset")
        private String sunset;

        @JsonProperty("Maghrib")
        private String maghrib;

        @JsonProperty("Isha")
        private String isha;

        @JsonProperty("Imsak")
        private String imsak;

        @JsonProperty("Midnight")
        private String midnight;
    }

    @Data
    public static class PrayerTimeDate {
        private String readable;
        private String timestamp;
        private Hijri hijri;
        private Gregorian gregorian;

        @Data
        public static class Hijri {
            private String date;
            private String format;
            private String day;
            private Weekday weekday;
            private Month month;
            private String year;
            private Designation designation;
        }

        @Data
        public static class Gregorian {
            private String date;
            private String format;
            private String day;
            private Weekday weekday;
            private Month month;
            private String year;
            private Designation designation;
        }

        @Data
        public static class Weekday {
            private String en;
            private String ar;
        }

        @Data
        public static class Month {
            private Integer number;
            private String en;
            private String ar;
        }

        @Data
        public static class Designation {
            private String abbreviated;
            private String expanded;
        }

    }

    @Data
    public static class PrayerTimeMeta {
        private String latitude;
        private String longitude;
        private String timezone;
        private Method method;
        private String latitudeAdjustmentMethod;
        private String midnightMode;
        private String school;
        private Offset offset;

        @Data
        public static class Method {
            private Integer id;
            private String name;
            private Params params;
            private Location location;

            @Data
            public static class Params {

                @JsonProperty("Fajr")
                private String fajr;

                @JsonProperty("Isha")
                private String isha;
            }

            @Data
            public static class Location {
                private String latitude;
                private String longitude;
            }
        }

        @Data
        public static class Offset {

            @JsonProperty("Imsak")
            private Integer imsak;

            @JsonProperty("Fajr")
            private Integer fajr;

            @JsonProperty("Sunrise")
            private Integer sunrise;

            @JsonProperty("Dhuhr")
            private Integer dhuhr;

            @JsonProperty("Asr")
            private Integer asr;

            @JsonProperty("Maghrib")
            private Integer maghrib;

            @JsonProperty("Sunset")
            private Integer sunset;

            @JsonProperty("Isha")
            private Integer isha;

            @JsonProperty("Midnight")
            private Integer midnight;
        }
    }
}

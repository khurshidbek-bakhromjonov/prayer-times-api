package com.prayertimes.model;

import lombok.Data;

@Data
public class PrayerTimeResponse {

    private Integer code;
    private String status;
    private PrayerTimeData data;
}

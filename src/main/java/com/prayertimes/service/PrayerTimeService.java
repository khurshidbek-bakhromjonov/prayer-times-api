package com.prayertimes.service;

import com.prayertimes.model.PrayerTimeResponse;

public interface PrayerTimeService {

    PrayerTimeResponse getPrayerTimes(String latitude, String longitude, Integer method);
}

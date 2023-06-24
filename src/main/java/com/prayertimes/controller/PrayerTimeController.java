package com.prayertimes.controller;

import com.prayertimes.model.PrayerTimeResponse;
import com.prayertimes.service.PrayerTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/timings/17-07-2007")
public class PrayerTimeController {

    private final PrayerTimeService prayerTimeServiceImpl;

    @GetMapping(consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public PrayerTimeResponse getPrayerTimes(
            @RequestParam("latitude") String latitude,
            @RequestParam("longitude") String longitude,
            @RequestParam(value = "method") Integer method) {

        PrayerTimeResponse prayerTimeResponse;
        prayerTimeResponse = prayerTimeServiceImpl.getPrayerTimes(latitude, longitude, method);
        return prayerTimeResponse;
    }
}

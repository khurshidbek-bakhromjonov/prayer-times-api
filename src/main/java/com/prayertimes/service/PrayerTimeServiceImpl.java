package com.prayertimes.service;

import com.prayertimes.model.PrayerTimeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("prayerTimeServiceImpl")
@RequiredArgsConstructor
public class PrayerTimeServiceImpl implements PrayerTimeService {

    private final RestTemplate restTemplate;

    @Override
    public PrayerTimeResponse getPrayerTimes(String latitude, String longitude, Integer method) {

        String formattedUrl = String.format("http://api.aladhan.com/v1/timings/17-07-2007?latitude=%s&longitude=%s&method=2", latitude, longitude);

        ResponseEntity<PrayerTimeResponse> response = restTemplate.getForEntity(formattedUrl, PrayerTimeResponse.class);

        return response.getBody();
    }
}

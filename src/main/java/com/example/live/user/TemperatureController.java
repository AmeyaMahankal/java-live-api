package com.example.live.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temps")
public class TemperatureController {

    @Autowired
    private TemperatureRepository temperatureRepository;

    @GetMapping
    public List<Temperature> getAllTemps()
    {
        return temperatureRepository.findAll();
    }

    @PostMapping
    public Temperature createTemp(@RequestBody Temperature temperature)
    {
        return temperatureRepository.save(temperature);
    }
}

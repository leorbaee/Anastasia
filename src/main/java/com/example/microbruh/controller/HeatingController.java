package com.example.microwave.controller;

import com.example.microbruh.entity.HeatingMode;
import com.example.microbruh.service.HeatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class HeatingController {

    @Autowired
    private HeatingService heatingService;

    @PostMapping("/start")
    public ResponseEntity<HeatingMode> startHeating(@RequestParam Long modeId) {
        HeatingMode mode = heatingService.startHeating(modeId);
        return ResponseEntity.ok(mode);
    }

    @GetMapping("/all")
    public ResponseEntity<List<HeatingMode>> getAllHeatingModes() {
        List<HeatingMode> modes = heatingService.getAllHeatingModes();
        return ResponseEntity.ok(modes);
    }
}


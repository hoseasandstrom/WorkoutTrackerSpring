package com.theironyard.controllers;

import com.theironyard.services.UserRepository;
import com.theironyard.services.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by hoseasandstrom on 7/1/16.
 */
@Controller
public class WorkoutTrackerController {
    @Autowired
    WorkoutRepository workouts;
    @Autowired
    UserRepository users;
}

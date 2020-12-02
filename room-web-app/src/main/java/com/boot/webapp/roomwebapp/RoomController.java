package com.boot.webapp.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private RoomServices roomServices;

    @Autowired
    public RoomController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping
    public  String getAllRooms(Model model) {
        model.addAttribute("rooms", this.roomServices.getAllRooms());
        return "rooms";
    }
}

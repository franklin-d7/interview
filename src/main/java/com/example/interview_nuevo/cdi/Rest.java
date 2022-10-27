package com.example.interview_nuevo.cdi;


import com.example.interview_nuevo.cdi.domain.Album;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Rest {
    @GetMapping("/singers")
    Object getSingers(){
        Singer response = new Singer(1,"Camilo", "X", new Date(10-2-2022));
        return response;
    }

    @GetMapping("/album")
    Object getAlbum(){
        Album response = new Album(1,"1", "Verano", new Date(10-2-2022));
        return response;
    }

    @PostMapping("/singers")
    Object postSingers(@RequestBody Singer body){
        return body;
    }


}

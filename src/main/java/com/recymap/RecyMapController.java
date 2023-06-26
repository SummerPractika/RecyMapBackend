package com.recymap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping("/points")
public class RecyMapController {
    @GetMapping("/all")
    public String points() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("points.json"));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
// delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        return stringBuilder.toString();
    }

    @PostMapping("/create")
    public ResponseEntity<RecyclePointDto> createPoint(@RequestBody RecyclePointDto recyclePoint) {
        return null;
    }
}

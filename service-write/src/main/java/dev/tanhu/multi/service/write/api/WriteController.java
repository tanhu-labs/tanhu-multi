package dev.tanhu.multi.service.write.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/writers")
public class WriteController {

    @GetMapping
    public ResponseEntity<String> writers() {
        return ResponseEntity.ok("Hello writers!");
    }
}

package dev.tanhu.multi.service.read.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/readers")
public class ReadController {
    @GetMapping
    public ResponseEntity<String> readers() {
        return ResponseEntity.ok("Hello readers!");
    }
}

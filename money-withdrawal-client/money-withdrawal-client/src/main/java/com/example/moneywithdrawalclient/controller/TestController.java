package com.example.moneywithdrawalclient.controller;

import az.etibarli.models.PersonResponse;
import com.example.moneywithdrawalclient.dto.PersonDto;
import com.example.moneywithdrawalclient.grpc.PersonClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class TestController {

    private final PersonClientService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        List<PersonDto> list = service.method(id);
        return ResponseEntity.ok(list);
    }
}

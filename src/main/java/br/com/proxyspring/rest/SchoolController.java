package br.com.proxyspring.rest;

import br.com.proxyspring.service.StudentServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @Autowired
    private StudentServiceProxy service;

    @GetMapping("/profile/{document}")
    public String getStudentProfile(@PathVariable("document") String rg) {
        return service.getStudentProfile(rg);
    }
    @GetMapping("/health")
    public String getStudentProfile() {
        return "I am ok!!";
    }
}


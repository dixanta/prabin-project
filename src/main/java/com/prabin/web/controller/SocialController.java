/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prabin.web.controller;

import com.prabin.web.entity.Social;
import com.prabin.web.repository.SocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apple
 */
@Controller
@RequestMapping(value = "/socials")
public class SocialController {
    @Autowired
    private SocialRepository repository;
    
    @GetMapping
    @ResponseBody
    public String index(){
        repository.save(new Social(0, "Facebook", "FB", true));
        repository.save(new Social(0, "Twitter", "TW", true));
        repository.save(new Social(0, "LinkedIn", "Ln", true));
        repository.save(new Social(0, "Pinterest", "Pn", true));
        repository.save(new Social(0, "Wordpress", "WP", true));
        
        return "<h1>Created</h1>";
    }
    
    @GetMapping(value = "/json")
    @ResponseBody
    public List<Social> json(){
        return repository.findAll();
    }
}

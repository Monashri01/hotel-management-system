package com.receptionist.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.receptionist.model.AuthenticationResponse;

@FeignClient (name="Authentication", url= "http://localhost:9999/auth")
public interface RoomAuthClient {
	 @GetMapping("/validate")
	    public AuthenticationResponse getValidity(@RequestHeader("Authorization") String token) ;
	    
	    }


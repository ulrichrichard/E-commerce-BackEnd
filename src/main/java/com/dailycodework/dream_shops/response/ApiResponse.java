package com.dailycodework.dream_shops.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
//This is the class to return data for our Front End
public class ApiResponse {
    private String message;
    private Object data;
}

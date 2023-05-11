package com.upwork.kafka.UserInfoExample.dto;

import lombok.Data;

import java.util.List;

@Data
public class DestinationResorts {

    private String name;

    private List<String> resorts;
}

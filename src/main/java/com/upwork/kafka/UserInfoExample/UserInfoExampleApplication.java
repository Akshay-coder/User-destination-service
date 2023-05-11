package com.upwork.kafka.UserInfoExample;

import com.upwork.kafka.UserInfoExample.dto.DestinationResorts;
import com.upwork.kafka.UserInfoExample.service.DestinationService;
import com.upwork.kafka.UserInfoExample.utils.ObjectMapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class UserInfoExampleApplication{

	public static void main(String[] args) {
		SpringApplication.run(UserInfoExampleApplication.class, args);
	}

}

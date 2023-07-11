package com.drill.dto;

import com.drill.domain.User;

import	lombok.AllArgsConstructor;
import	lombok.Data;
import	lombok.NoArgsConstructor;

@SuppressWarnings("hiding")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResUserDto<User> {

	private int status; // HTTP 응답 상태 코드
	
	private User data; // 응답 데이터

}

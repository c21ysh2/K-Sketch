package com.trip.app.service;

import com.trip.app.model.MemberDTO;

public interface MemberService {
    // 회원가입
    int regist(MemberDTO memberDTO);
}

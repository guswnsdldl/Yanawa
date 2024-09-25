package com.app.yanawa.repository.member;

import com.app.yanawa.domain.member.MemberVO;
import com.app.yanawa.mapper.member.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    public void save(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }

    //    이메일 중복
    public boolean existsByEmail(String email) {
        return memberMapper.countByEmail(email) > 0; // 0보다 크면 중복
    }

    //    닉네임 중복
    public boolean existsByNickName(String nickname) {
        return memberMapper.countByNickname(nickname) > 0; // 0보다 크면 중복
    }
}

package jpabook.jpashop;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

//스프링과 관련된 테스트를 한다고 명시
//@RunWith(SpringRunner.class)
//@SpringBootTest//@Transactional로 인한 Rollback 을 실행하지 않게끔 함
//@Rollback(value = false)
//class MemberRepositoryTest {
//
//    @Autowired MemberRepository memberRepository;
//    @Autowired EntityManager em;
//
//    @Test
//    @Transactional
//    public void testMember() throws Exception {
//        //given
//        Member member = new Member();
//        member.setUsername("memberA");
//        //when
//        Long savedId = memberRepository.save(member);
//        Member result = memberRepository.find(savedId);
//        //then
//        assertThat(member.getId()).isEqualTo(result.getId());
//        assertThat(member.getUsername()).isEqualTo(result.getUsername());
//
//        //true, 트랜잭션 안에서 영속성 컨텍스트에서 식별자가 같은 엔티티를 동일한 엔티티로 인식함
//        assertThat(result).isEqualTo(member);
//        em.flush();
//    }
//}
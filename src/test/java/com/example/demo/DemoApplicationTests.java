package com.example.demo;

import com.example.demo.chapter6.Member;
import com.example.demo.chapter6.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@DataJpaTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {
    @Test
    public void test(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager =  emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Member member1 = new Member("member1");

        Team team1 = new Team("team1");

        member1.setTeam(team1);
        team1.setMember(member1);

        entityManager.persist(team1);
        entityManager.persist(member1);

        tx.commit();
        entityManager.close();
        emf.close();
    }

}

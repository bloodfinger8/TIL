package hellojpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hellojpa.entity.Member;
import hellojpa.entity.MemberType;
import hellojpa.entity.Team;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Team team = new Team();
			team.setName("따까리");
			em.persist(team);
			
			Member member = new Member();
			member.setName("양재우");
			member.setAge(27);
			member.setMemberType(MemberType.ADMIN);
			member.setTeamId(team.getId());
			em.persist(member);
			
			//조회
			Member findMember = em.find(Member.class, member.getId());
			Long teamId = findMember.getTeamId();
			
			//연관관계가 없음.
			Team findTeam = em.find(Team.class , teamId);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		

	}

}

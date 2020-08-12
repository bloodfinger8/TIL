package hellojpa;

import java.util.List;

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
			member.setTeam(team);
			em.persist(member);
			
			em.flush(); //db에 컬럼을 다 보낸다
			em.clear(); //캐시를 비운다
			
			//조회
			Member findMember = em.find(Member.class, member.getId());
			Team findTeam = findMember.getTeam();
			
			
			List<Member> members = findTeam.getMembers();
			
			for (Member member1 : members) {
				System.out.println("member1 = " + member1 + " / " );
			}
			
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close(); 
		}
		

	}

}

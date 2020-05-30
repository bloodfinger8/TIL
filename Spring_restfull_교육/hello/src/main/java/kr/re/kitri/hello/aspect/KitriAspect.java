package kr.re.kitri.hello.aspect;

import com.sun.el.parser.Token;
import kr.re.kitri.hello.annotation.TokenRequired;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class KitriAspect {

    private static Logger log = LoggerFactory.getLogger(KitriAspect.class);

    @Before("execution(* kr.re.kitri.hello.service.*Service.*(..))") //서비스패키지 안에있는 Service로 끝나는 클래스의 모든 메소드
    public void logging(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "에서 로그를 남깁니다.");
    }

    @Around("execution(* kr.re.kitri.hello.dao.*DAO.*(..))")
    public Object measureAdvice(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed(); //해당 함수를 실행시킨다.
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime;
        log.debug(startTime + " / " + endTime);
        log.debug(pjp.getSignature().getDeclaringTypeName() + " 클래스의 " + pjp.getSignature().getName() + " 메소드의 수행 시간은 " +
                estimatedTime + "밀리초 입니다. ");

        return obj;
    }

    //내가 만든 어노테이션 적용
    @Before("@annotation(tokenRequired)")
    public void test(TokenRequired tokenRequired){
        log.debug("토큰이 적용되어야 합니다.");
    }





}

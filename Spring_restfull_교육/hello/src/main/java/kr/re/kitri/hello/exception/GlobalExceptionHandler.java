package kr.re.kitri.hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.SQLInvalidAuthorizationSpecException;

//@ControllerAdvice
//@RestController
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = SQLInvalidAuthorizationSpecException.class)
    public String handleSQLInvalidException(SQLInvalidAuthorizationSpecException se){
        return "데이터베이스 문제 발생.";
    }

    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler(value = ArithmeticException.class)
    public String handlerArithException(ArithmeticException ae) {
        return "계산 에러" + ae.getMessage() ;
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public String hadlersyntax(){
        return "SQL문 작성 에러";
    }

    @ExceptionHandler(value = SQLException.class)
    public String hadlerSQLException(){
        return "SQL 예외처리"  ;

    }

    @ExceptionHandler(value = Exception.class)
    public String handlerAll(Exception e){
        return "모든 에외를 여기에서 잡는다. " + e;
    }

}

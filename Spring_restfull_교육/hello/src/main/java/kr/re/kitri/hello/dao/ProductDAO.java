package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

    public String selectProducts(){
        //DB접속 쿼리 날리고 , myBatis ..
        return "상품목록";
    }


    public Product selectProductsById(int i) {
        Product p = new Product(i+"" , "아이폰11" , 5000000L, "iphone11");
        //객체를 json으로 변경을 도우는 jackson은 부트에 내장되어있다.
        return p;
    }
}

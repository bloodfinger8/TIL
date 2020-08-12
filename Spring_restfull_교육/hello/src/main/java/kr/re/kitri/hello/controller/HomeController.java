package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //시작시 컴포넌트를 메모리에 올려둔다, 라이프사이클을 관리해준다.
public class HomeController {
    @Autowired
    private ProductService ps;

    @GetMapping("/products/{playerId}")
    public Map<String, Object> getProductDetailByProductId(@PathVariable int productId  ){
        Product p = ps.viewProductDetail(productId);
        Map<String , Object> result = new HashMap<>();
        result.put("status" , "OK");
        result.put("data" , p);
        return result;
    }

    @GetMapping("/products")
    public String getProducts(){
        // 1.요청해석 .. 요청 파라미터 확보, 헤더값을 확보(인증)
        // 5.결과값을 받아 JSON 포맷으로 만들어서 전송(응답)
        // 해당되는 기능을 가진 서비스 함수를 호출하는것
        return ps.retrieveProducts();
    }

    @GetMapping("/products/hello")
    public String hello(){
        return "hello spring boot";
    }




}

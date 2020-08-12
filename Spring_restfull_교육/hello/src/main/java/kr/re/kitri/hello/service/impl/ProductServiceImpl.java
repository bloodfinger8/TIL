package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDAO;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO dao;

    @Override
    public String retrieveProducts() {
        // 2.전체상품을 조회하는 작업 수행..
        // 3.데이터베이스(오라클)에 접속
        // 4.쿼리에 날린다.
        // 쿼리 결과물을 던진다.
        String selectProducts =  dao.selectProducts();

        return selectProducts;
    }

    @Override
    public Product viewProductDetail(int i) {
        Product selectProductDetail = dao.selectProductsById(i);

        return selectProductDetail;
    }


}

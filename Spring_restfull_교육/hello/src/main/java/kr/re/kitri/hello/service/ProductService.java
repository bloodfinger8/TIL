package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ProductDAO;
import kr.re.kitri.hello.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProductService {
    public String retrieveProducts();
    public Product viewProductDetail(int i);
}

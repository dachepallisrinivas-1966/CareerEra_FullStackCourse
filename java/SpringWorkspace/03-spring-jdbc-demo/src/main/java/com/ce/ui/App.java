package com.ce.ui;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ce.config.AppConfig;
import com.ce.dao.ProductDAO;
import com.ce.model.Product;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDAO productDAO = context.getBean(ProductDAO.class);
//		Product product = new Product();
//		product.setId(102);
//		product.setName("printer");
//		product.setPrice(12000);
//		int rowsInserted = productDAO.insertProduct(product);
//		if (rowsInserted == 1)
//			System.out.println("product inserted");
//		else
//			System.out.println("could not insert");
		
		List<Product> products = productDAO.getAllProducts();
		products.stream().forEach(System.out::println);
		
		context.close();
	}

}

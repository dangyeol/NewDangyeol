package com.test.tl.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.tl.dto.ProductVO;
import com.test.tl.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/insert")
	public String InsertForm() {

		String str = "product/insertForm";

		return str;

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String ProductInsert(ProductVO productVO) {

		String str = "product/listForm";

		productService.ProductRegist(productVO);

		return str;

	}

	@RequestMapping("/list")
	public String ProductList(HttpSession session) {

		String str = "product/listForm";

		Query query = new Query();

		List<ProductVO> list = productService.ProductList(query);

		session.setAttribute("productList", list);

		return str;

	}

	@RequestMapping("/detail")
	public String DetailForm(@RequestParam(value = "pro_Name") String pro_Name, Model model) {

		String str = "product/detailForm";

		Criteria criteria = new Criteria("pro_Name");
		criteria.is(pro_Name);
		Query query = new Query(criteria);

		ProductVO productVO = productService.ProductDetail(query);

		model.addAttribute("product", productVO);

		return str;
	}

}

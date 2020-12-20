package com.lec.java.dao;

import java.util.ArrayList;
import java.util.Set;

import com.lec.java.dto.ProductDTO;
import com.lec.java.dto.UserDTO;

// DAO(Data Access Object) - dao
// 데이터에 접근하기 위한 객체
// 데이터를 관리하는 여러 메소드들이 정의되어 있다.

// Product에 관련한 메소드만 모아놓은 곳
public class ProductDAO {
	Connection conn = null;
	UserDTO session =null;
	
	// 넘겨준 세션아이디를 받아서 pdao의 세션에도 설정해준다.
	public ProductDAO(UserDTO user) {
		conn = new Connection();
		session = user;
	}
	
	// 상품추가
	boolean add(String name, int count, String userid, int price) {
		ProductDTO product = new ProductDTO(name, count, userid, price);
		conn.insert(session, product);
		return true;
	}
	
	// 상품삭제
	boolean remove(int pNum) {
		boolean flag = false;
		ArrayList<ProductDTO> myProduct = conn.selectAll(session);
		for(ProductDTO product : myProduct) {
			if(product.getNum() == pNum) {
				flag=true;
				conn.delete(session, product);
				break;
			}
		}
		return flag;
	}
	
	// 상품수정
	boolean modify(int pNum,int price) {
		boolean flag = false;
		ArrayList<ProductDTO> myProduct = conn.selectAll(session);
		for(ProductDTO product : myProduct) {
			if(product.getNum() == pNum) {
				flag = true;
				conn.update(product, price);
				break;
			}
		}
		return flag;
	}
	
	// 상품검색
	Set<ProductDTO> search(String keyword){
		return conn.select(keyword);
	}
	
	// 내 목록 가져오기
	ArrayList<ProductDTO> getList() {
		ArrayList<ProductDTO> myProduct = conn.selectAll(session);
		return myProduct;
	}
}
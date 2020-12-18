package com.lec.java.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import com.lec.java.dto.ProductDTO;
import com.lec.java.dto.UserDTO;

// 원래는 DB를 사용해야하는데 이 수업에서는 배우기 전이기 때문에 
// HashMap을 이용하여 데이터 베이스처럼 사용했다.
public class Connection {
	// UserDAO, ProductDAO에서 new를 통해 conn 객체를 만들기 때문에
	// static으로 선언하지 않으면 두 객체가 서로 다른 DB를 사용하게 된다.
	static HashMap<UserDTO, ArrayList<ProductDTO>> DB = new HashMap<>();
	
	// 상품추가
	void insert(UserDTO user,ProductDTO product) {
		ArrayList<ProductDTO> arProduct = DB.get(user);
		arProduct.add(product);
	}
	
	// 회원추가
	boolean insert(UserDTO user) {
		ArrayList<ProductDTO> arProduct = new ArrayList<>();
		DB.put(user, arProduct);
		return true;
	}
	
	// 상품삭제
	void delete(UserDTO user,ProductDTO product) {
		ArrayList<ProductDTO> arProduct = DB.get(user);
		arProduct.remove(product);
	}
	
	// 상품수정
	void update(ProductDTO product,int price) {
		product.setPrice(price);
	}
	
	// 선택한 회원의 모든 상품 불러오기
	ArrayList<ProductDTO> selectAll(UserDTO user) {
		ArrayList<ProductDTO> arProduct = DB.get(user);
		return arProduct;
	}
	
	// 로그인을 위한 회원 검색
	UserDTO select(String userid, String userpw) {
		// DB에 있는 key(User)들을 iterator 타입으로 불러오고
		Iterator<UserDTO> iter = DB.keySet().iterator();
		// iter 다음 것이 있으면
		while(iter.hasNext()) {
			// 그때의 user 임시저장
			UserDTO user = iter.next();
			// 그 user의 아이디가 넘겨준 아이디와 같다면
			if(user.getUserid().equals(userid)) {
				// 비밀번호 비교
				if(user.getUserpw().equals(userpw)) {
					// 로그인 성공시 오는 곳
					return user;
				}
			}
		}
		// 그 외에는 null 리턴
		return null;
	}
	
	// 검색할 키워드에 관한 상품들 불러오기
	HashSet<ProductDTO> select(String keyword) {
		// 중복을 제거하기 위해 HashSet을 사용
		HashSet<ProductDTO> resultSet = new HashSet<>();
		Iterator<Entry<UserDTO, ArrayList<ProductDTO>>> iter = DB.entrySet().iterator();
		
		while(iter.hasNext()) {
			// entry에는 유저와 그 유저의 상품 목록이 담겨 있다(key : 유저, value : 상품 목록)
			Entry<UserDTO, ArrayList<ProductDTO>> entry = iter.next();
			
			if(entry.getKey().getUserid().equals(keyword)) {
				for(ProductDTO product : entry.getValue()) {
					resultSet.add(product);
				}
			} else {
				for(ProductDTO product : entry.getValue()) {
					if(product.getName().contains(keyword)) {
						resultSet.add(product);
					}
				}
			}
		}
		return resultSet;
	}
}
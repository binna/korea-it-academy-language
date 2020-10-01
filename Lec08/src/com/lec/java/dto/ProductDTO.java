package com.lec.java.dto;

public class ProductDTO {
	private static int seq;
	
	private int num;
	private String name;
	private int count;
	private String userid;
	private int price;
	
	public ProductDTO() {;}
	
	public ProductDTO(String name, int count, String userid, int price) {
		this.num = ++seq;
		this.name = name;
		this.count = count;
		this.userid = userid;
		this.price = price;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// hashCode(), equals()를 재정의해줘야
	// 주소 비교가 아니라 num(상품번호)으로 비교를 한다.
	@Override
	public int hashCode() {
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		ProductDTO prd = null;
		if(obj instanceof ProductDTO) {
			prd = (ProductDTO)obj;
			if(this.num == prd.num) {
				return true;
			}
		}
		return false;
	}
	
	// toString()을 재정의해줘야
	// 주소가 아니라 상품 정보가 출력이 된다.
	@Override
	public String toString() {
		return "올린사람 : " + userid + "\n상품번호 : " + num + "\t상품 이름 : "
				+ name + "\n상품 가격 : " + price + "\t상품 개수 : " + count + "\n=============";
	}
}
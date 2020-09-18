package com.lec.java.generic;

// 3. Generic Interface
public interface GerInter<N1, N2> {
	N1 add(N1 data1, N1 data2);
	N1 sub(N1 data1, N2 data2);
	N1 mul(N2 data1, N2 data2);
}
package com.jetbrains.springdatajpa.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jetbrains.springdatajpa.entity.ChuyenBay;

public interface ChuyenBayServiceImpl {
	void addChuyenBay (ChuyenBay chuyenBay);
	List<ChuyenBay> listChuyenBayDAD();
	List<ChuyenBay> lisChyenBaysnhohon1000();
//	5.  Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	List<ChuyenBay>  listChuyenBayDenVaDi();
//	6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	int sumChuyenBaySGN();
	// 14


	List<String> listGroupGaDi();
	List<String> listfindSumChiPhi();
	//20
	List<ChuyenBay> list1200();
	//21

	List<String> findMaxTamBayOfBoeing();
	List<String> list1200byGroupGaDi();
	
	

}

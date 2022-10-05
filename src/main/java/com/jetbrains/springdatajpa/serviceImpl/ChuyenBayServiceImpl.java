package com.jetbrains.springdatajpa.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jetbrains.springdatajpa.entity.ChuyenBay;

public interface ChuyenBayServiceImpl {
	void addChuyenBay (ChuyenBay chuyenBay);
	List<ChuyenBay> listChuyenBayDAD();
	List<ChuyenBay> lisChyenBaysnhohon1000();
	List<ChuyenBay>  listChuyenBayDenVaDi();
	int numChuyenBaySGN();@Query(value = "select GaDi,count(GaDi )from chuyenbay group by GaDi",nativeQuery = true)
	List<String> listGroupGaDi();
	List<String> listfindSumChiPhi();
	List<ChuyenBay> list1200();
	List<String> list1200byGroupGaDi();
	List<String> findMaxTamBayOfBoeing();
	
	

}

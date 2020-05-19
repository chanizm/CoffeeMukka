package com.yi.persistence;

import java.util.List;

import com.yi.domain.CafeVO;
import com.yi.domain.ImageVO;
import com.yi.domain.MenuVO;
import com.yi.domain.SearchCriteria;

public interface CafeDAO {
	/* 카페 추가, 검색, 삭제, 수정 */
	public void createCafe(CafeVO vo) throws Exception;
	public CafeVO readCafe(int cafeNo) throws Exception;
	public List<CafeVO> list() throws Exception;
	public void updateCafe(CafeVO vo) throws Exception;
	public void deleteCafe(int cafeNo) throws Exception;
	
	/* 카페 이미지 검색 */
	public ImageVO imgSelect(int cafeNo) throws Exception;
	public List<ImageVO> imgList(int cafeNo) throws Exception;
	
	/* 카페 별점 검색 */
	public int starpointSelect(int cafeNo) throws Exception;
	public Double starpoint(int cafeNo) throws Exception;
	public int starpointByMonth(int cafeNo, int month) throws Exception;
	
	/* 카페 테마 순위 검색 */
	public int rankTheme(int cafeNo, int themeNo) throws Exception;
	
	/* 카페 메뉴 검색 */
	public List<MenuVO> menuList(int cafeNo) throws Exception;
	
// 검색시 페이징 처리 dao
	public List<CafeVO> listPage(int page) throws Exception;	
	public List<CafeVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int totalSearchCount(SearchCriteria cri) throws Exception;
	
	// 카페 이름 검색
	public List<CafeVO> searchCafeByName(String cafeName) throws Exception;
	
	
	//아름추가
	public List<CafeVO> rcSearchCafeByName(String cafeName) throws Exception;
}

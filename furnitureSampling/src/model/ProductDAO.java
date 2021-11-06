package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import crawling.common.JDBC;




public class ProductDAO {

	/*
	 * proCode number(20) primary key, -- 상품번호 proCate varchar2(30) not null, -- 상품
	 * 카테고리 proName varchar2(100) not null, -- 상품명 proPrice number(10) not null, --
	 * 상품가격 proStock number(5) not null, -- 상품재고 proDate date default sysdate, --
	 * 상품등록일 proRating number(2,1) default 0.0, -- 평점 proKC varchar2(30) not null,
	 * -- KC인증 proColor varchar2(200) not null, -- 색상 proCmpt varchar2(200) not
	 * null, -- 구성품 proMtrl varchar2(200) not null, -- 주요소재 proMnfct varchar2(200)
	 * not null, -- 제조자(수입자) proNation varchar2(100) not null, -- 제조국 proSize
	 * varchar2(200) not null, -- 크기 proFee number(5) not null, -- 배송,설치비용 proCerti
	 * varchar2(100) not null, -- 품질보증기준 proAS varchar2(100) not null, -- A/S 책임자와
	 * 전화번호 proImg1 varchar2(200) default 'nonImg.png', -- 상품 이미지1 proImg2
	 * varchar2(200)default 'nonImg.png', -- 상품 이미지2 proImg3 varchar2(200) default
	 * 'nonImg.png', -- 상품 이미지3 proSelling number(20) default 0
	 */
	private final String insertSQL = "insert into product (proCode, proCate,proSubCate, proName, proPrice, proStock, proKC, "
			+ "proColor, proCmpt, proMtrl, proMnfct, proNation, proSize, proFee, proCerti, proAS, proImg) "
			+ "values((select nvl(max(proCode),0)+1 from product),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";



	private final String getProductSQL = "select * from product where proCode=?";
	// 최신순
	// private final String getProductListSQL_PRODATE = "select * from product order
	// by proDate desc";
	// 상품명순
	// private final String getProductListSQL_PRONAME = "select * from product order
	// by proName desc";

	/*
	 * "SELECT * FROM (" + "SELECT ROWNUM AS RNUM, board.* FROM (" +
	 * "SELECT * FROM board WHERE bctgr = ? AND btitle LIKE '%'||?||'%' ORDER BY recnt DESC, bdate DESC"
	 * + ") board WHERE ROWNUM <= ?" //끝점 + ") WHERE RNUM > ? ORDER BY recnt DESC";
	 */


	// 상품 추가(관리자영역)
	public void insertProduct(ProductVO vo) {
		
		Connection conn = JDBC.getConnection();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(insertSQL);

			pstmt.setString(1, vo.getProCate());
			pstmt.setString(2, vo.getProSubCate());
			pstmt.setString(3, vo.getProName());
			pstmt.setInt(4, vo.getProPrice());
			pstmt.setInt(5, vo.getProStock());
			pstmt.setString(6, vo.getProKC());
			pstmt.setString(7, vo.getProColor());
			pstmt.setString(8, vo.getProCmpt());
			pstmt.setString(9, vo.getProMtrl());
			pstmt.setString(10, vo.getProMnfct());
			pstmt.setString(11, vo.getProNation());
			pstmt.setString(12, vo.getProSize());
			pstmt.setInt(13, vo.getProFee());
			pstmt.setString(14, vo.getProCerti());
			pstmt.setString(15, vo.getProAS());
			pstmt.setString(16, vo.getProImg());

			
			pstmt.executeUpdate();
			System.out.println("크롤링 insert 성공");

		} catch (SQLException e) {
			System.out.println("insertProduct - insert 오류 로깅");
			e.printStackTrace();
		} finally {
			JDBC.disconnect(pstmt, conn);
		}
	}

	/////////////////////////////////////////////////////////////////////


}

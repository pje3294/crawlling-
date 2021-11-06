package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import crawling.common.JDBC;




public class ProductDAO {

	/*
	 * proCode number(20) primary key, -- ��ǰ��ȣ proCate varchar2(30) not null, -- ��ǰ
	 * ī�װ� proName varchar2(100) not null, -- ��ǰ�� proPrice number(10) not null, --
	 * ��ǰ���� proStock number(5) not null, -- ��ǰ��� proDate date default sysdate, --
	 * ��ǰ����� proRating number(2,1) default 0.0, -- ���� proKC varchar2(30) not null,
	 * -- KC���� proColor varchar2(200) not null, -- ���� proCmpt varchar2(200) not
	 * null, -- ����ǰ proMtrl varchar2(200) not null, -- �ֿ���� proMnfct varchar2(200)
	 * not null, -- ������(������) proNation varchar2(100) not null, -- ������ proSize
	 * varchar2(200) not null, -- ũ�� proFee number(5) not null, -- ���,��ġ��� proCerti
	 * varchar2(100) not null, -- ǰ���������� proAS varchar2(100) not null, -- A/S å���ڿ�
	 * ��ȭ��ȣ proImg1 varchar2(200) default 'nonImg.png', -- ��ǰ �̹���1 proImg2
	 * varchar2(200)default 'nonImg.png', -- ��ǰ �̹���2 proImg3 varchar2(200) default
	 * 'nonImg.png', -- ��ǰ �̹���3 proSelling number(20) default 0
	 */
	private final String insertSQL = "insert into product (proCode, proCate,proSubCate, proName, proPrice, proStock, proKC, "
			+ "proColor, proCmpt, proMtrl, proMnfct, proNation, proSize, proFee, proCerti, proAS, proImg) "
			+ "values((select nvl(max(proCode),0)+1 from product),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";



	private final String getProductSQL = "select * from product where proCode=?";
	// �ֽż�
	// private final String getProductListSQL_PRODATE = "select * from product order
	// by proDate desc";
	// ��ǰ���
	// private final String getProductListSQL_PRONAME = "select * from product order
	// by proName desc";

	/*
	 * "SELECT * FROM (" + "SELECT ROWNUM AS RNUM, board.* FROM (" +
	 * "SELECT * FROM board WHERE bctgr = ? AND btitle LIKE '%'||?||'%' ORDER BY recnt DESC, bdate DESC"
	 * + ") board WHERE ROWNUM <= ?" //���� + ") WHERE RNUM > ? ORDER BY recnt DESC";
	 */


	// ��ǰ �߰�(�����ڿ���)
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
			System.out.println("ũ�Ѹ� insert ����");

		} catch (SQLException e) {
			System.out.println("insertProduct - insert ���� �α�");
			e.printStackTrace();
		} finally {
			JDBC.disconnect(pstmt, conn);
		}
	}

	/////////////////////////////////////////////////////////////////////


}

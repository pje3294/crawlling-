package model;

import java.util.Date;

public class ProductVO {
	/*
	 * create table product( proCode number(20) primary key, -- ��ǰ��ȣ proCate
	 * varchar2(30) not null, -- ��ǰ ī�װ� proName varchar2(100) not null, -- ��ǰ��
	 * proPrice number(10) not null, -- ��ǰ���� proStock number(5) not null, -- ��ǰ���
	 * proDate date default sysdate, -- ��ǰ����� proRating number(2,1) default 0.0, --
	 * ���� proKC varchar2(30) not null, -- KC���� proColor varchar2(200) not null, --
	 * ���� proCmpt varchar2(200) not null, -- ����ǰ proMtrl varchar2(200) not null, --
	 * �ֿ���� proMnfct varchar2(200) not null, -- ������(������) proNation varchar2(100) not
	 * null, -- ������ proSize varchar2(200) not null, -- ũ�� proFee number(5) not null,
	 * -- ���,��ġ��� proCerti varchar2(100) not null, -- ǰ���������� proAS varchar2(100) not
	 * null, -- A/S å���ڿ� ��ȭ��ȣ proImg1 varchar2(200) default 'nonImg.png', -- ��ǰ �̹���1
	 * proImg2 varchar2(200)default 'nonImg.png', -- ��ǰ �̹���2 proImg3 varchar2(200)
	 * default 'nonImg.png', -- ��ǰ �̹���3 proSelling number(20) default 0
	 */

	private int proCode;
	private String proCate;
	private String proSubCate;
	private String proName;
	private int proPrice;
	private int proStock;
	private Date proDate;
	private double proRating;
	private String proKC;
	private String proColor;
	private String proCmpt;
	private String proMtrl;
	private String proMnfct;
	private String proNation;
	private String proSize;
	private int proFee;
	private String proCerti;
	private String proAS;
	private String proImg;
	private int proSelling;

	private String condition; // �˻� ��� ����
	private String keyword; // �˻� ��� ����

	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public String getProCate() {
		return proCate;
	}

	public void setProCate(String proCate) {
		this.proCate = proCate;
	}

	public String getProSubCate() {
		return proSubCate;
	}

	public void setProSubCate(String proSubCate) {
		this.proSubCate = proSubCate;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getProStock() {
		return proStock;
	}

	public void setProStock(int proStock) {
		this.proStock = proStock;
	}

	public Date getProDate() {
		return proDate;
	}

	public void setProDate(Date proDate) {
		this.proDate = proDate;
	}

	public double getProRating() {
		return proRating;
	}

	public void setProRating(double proRating) {
		this.proRating = proRating;
	}

	public String getProKC() {
		return proKC;
	}

	public void setProKC(String proKC) {
		this.proKC = proKC;
	}

	public String getProColor() {
		return proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	public String getProCmpt() {
		return proCmpt;
	}

	public void setProCmpt(String proCmpt) {
		this.proCmpt = proCmpt;
	}

	public String getProMtrl() {
		return proMtrl;
	}

	public void setProMtrl(String proMtrl) {
		this.proMtrl = proMtrl;
	}

	public String getProMnfct() {
		return proMnfct;
	}

	public void setProMnfct(String proMnfct) {
		this.proMnfct = proMnfct;
	}

	public String getProNation() {
		return proNation;
	}

	public void setProNation(String proNation) {
		this.proNation = proNation;
	}

	public String getProSize() {
		return proSize;
	}

	public void setProSize(String proSize) {
		this.proSize = proSize;
	}

	public int getProFee() {
		return proFee;
	}

	public void setProFee(int proFee) {
		this.proFee = proFee;
	}

	public String getProCerti() {
		return proCerti;
	}

	public void setProCerti(String proCerti) {
		this.proCerti = proCerti;
	}

	public String getProAS() {
		return proAS;
	}

	public void setProAS(String proAS) {
		this.proAS = proAS;
	}

	public String getProImg() {
		return proImg;
	}

	public void setProImg(String proImg) {
		this.proImg = proImg;
	}

	public int getProSelling() {
		return proSelling;
	}

	public void setProSelling(int proSelling) {
		this.proSelling = proSelling;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "ProductVO [proCode=" + proCode + ", proCate=" + proCate + ", proSubCate=" + proSubCate + ", proName="
				+ proName + ", proPrice=" + proPrice + ", proStock=" + proStock + ", proDate=" + proDate
				+ ", proRating=" + proRating + ", proKC=" + proKC + ", proColor=" + proColor + ", proCmpt=" + proCmpt
				+ ", proMtrl=" + proMtrl + ", proMnfct=" + proMnfct + ", proNation=" + proNation + ", proSize="
				+ proSize + ", proFee=" + proFee + ", proCerti=" + proCerti + ", proAS=" + proAS + ", proImg=" + proImg
				+ ", proSelling=" + proSelling + ", condition=" + condition + ", keyword=" + keyword + "]";
	}

}

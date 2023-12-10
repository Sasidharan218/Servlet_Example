package com.kgisl.excel;

public class Employee {

	private String UccCode;
	private String TradeDate;
	private String Scrip;
	private String TradeType;
	private String Quantity;
	private String TradePrice;

	@Override
	public String toString() {
		return UccCode + "::" + TradeDate + "::" + Scrip + "::" + TradeType + "::"+Quantity+"::"+TradePrice;
	}

	/**
	 * @return the tradePrice
	 */
	public String getTradePrice() {
		return TradePrice;
	}

	/**
	 * @param tradePrice the tradePrice to set
	 */
	public void setTradePrice(String tradePrice) {
		this.TradePrice = tradePrice;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return Quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.Quantity = quantity;
	}

	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return TradeType;
	}

	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.TradeType = tradeType;
	}

	/**
	 * @return the scrip
	 */
	public String getScrip() {
		return Scrip;
	}

	/**
	 * @param scrip the scrip to set
	 */
	public void setScrip(String scrip) {
		this.Scrip = scrip;
	}

	/**
	 * @return the tradeDate
	 */
	public String getTradeDate() {
		return TradeDate;
	}

	/**
	 * @param tradeDate the tradeDate to set
	 */
	public void setTradeDate(String tradeDate) {
		this.TradeDate = tradeDate;
	}

	/**
	 * @return the tradeUccCode
	 */
	public String getUccCode() {
		return UccCode;
	}

	/**
	 * @param tradeUccCode the tradeUccCode to set
	 */
	public void setTradeUccCode(String UccCode) {
		this.UccCode = UccCode;
	}



}

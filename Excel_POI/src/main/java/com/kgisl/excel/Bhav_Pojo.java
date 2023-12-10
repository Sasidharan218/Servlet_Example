package com.kgisl.excel;

/**
 * Bhav_Pojo
 */
public class Bhav_Pojo {
    private String TradeDate;
    private String Scrip;
    private String ClosingPrice;

    /**
     * @return the tradeDate
     */
    public String getTradeDate() {
        return TradeDate;
    }

    /**
     * @return the closingPrice
     */
    public String getClosingPrice() {
        return ClosingPrice;
    }

    /**
     * @param closingPrice the closingPrice to set
     */
    public void setClosingPrice(String closingPrice) {
        this.ClosingPrice = closingPrice;
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
     * @param tradeDate the tradeDate to set
     */
    public void setTradeDate(String tradeDate) {
        this.TradeDate = tradeDate;
    }

    @Override
    public String toString() {
        return "{ " + TradeDate + "," + Scrip + "," + ClosingPrice + " }";
    }

}
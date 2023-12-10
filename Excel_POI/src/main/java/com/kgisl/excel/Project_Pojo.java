package com.kgisl.excel;

public class Project_Pojo {
    private String id;
    private String UccCode;
    private String TradeDate;
    private String Scrip;
    private String TradeType;
    private String Quantity;
    private String TradePrice;

    /**
     * @return the uccCode
     */
    public String getUccCode() {
        return UccCode;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param uccCode the uccCode to set
     */
   public void setUccCode(String uccCode) {
       this.UccCode = uccCode;
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

   @Override
    public String toString() {
        return "{ " +id+","+ UccCode + "," + TradeDate + "," + Scrip + "," + TradeType + "," + Quantity + "," + TradePrice + " }";
    }
}
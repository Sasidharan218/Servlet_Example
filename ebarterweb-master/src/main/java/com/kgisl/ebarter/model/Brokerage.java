package com.kgisl.ebarter.model;


/**
 * Brokerage
 */
public class Brokerage {
    private int id;
    private String ucccode;
    private String tradedate;
    private String scrip;
    private String tradetype;
    private long quantity;
    private double price;
    private double amount;
    private double brokerage;
    private double gst;
    private double st;
    private double netamount;

    // public Brokerage(){
        
    // }

    // public Brokerage(int id, String ucccode, String tradedate, String scrip, String tradetype, long quantity, double price) {
    //     this.id = id;
    //     this.ucccode = ucccode;
    //     this.tradedate = tradedate;
    //     this.scrip = scrip;
    //     this.tradetype = tradetype;
    //     this.quantity = quantity;
    //     this.price = price;
    // }

    // public Brokerage(int id, String ucccode, String tradedate, String scrip, String tradetype, long quantity, double price,
    //         double amount, double brokerage, double gst, double st, double netamount) {
    //     this.id = id;
    //     this.ucccode = ucccode;
    //     this.tradedate = tradedate;
    //     this.scrip = scrip;
    //     this.tradetype = tradetype;
    //     this.quantity = quantity;
    //     this.price = price;
    //     this.amount = amount;
    //     this.brokerage = brokerage;
    //     this.gst = gst;
    //     this.st = st;
    //     this.netamount = netamount;
    // }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ucccode
     */
    public String getUcccode() {
        return ucccode;
    }

    /**
     * @param ucccode the ucccode to set
     */
    public void setUcccode(String ucccode) {
        this.ucccode = ucccode;
    }

    /**
     * @return the tradedate
     */
    public String getTradedate() {
        return tradedate;
    }

    /**
     * @param tradedate the tradedate to set
     */
    public void setTradedate(String tradedate) {
        this.tradedate = tradedate;
    }

    /**
     * @return the tradetype
     */
    public String getTradetype() {
        return tradetype;
    }

    /**
     * @param tradetype the tradetype to set
     */
    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    /**
     * @return the scrip
     */
    public String getScrip() {
        return scrip;
    }

    /**
     * @param scrip the scrip to set
     */
    public void setScrip(String scrip) {
        this.scrip = scrip;
    }

    /**
     * @return the quantity
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the brokerage
     */
    public double getBrokerage() {
        return brokerage;
    }

    /**
     * @param brokerage the brokerage to set
     */
    public void setBrokerage(double brokerage) {
        this.brokerage = brokerage;
    }

    /**
     * @return the gst
     */
    public double getGst() {
        return gst;
    }

    /**
     * @param gst the gst to set
     */
    public void setGst(double gst) {
        this.gst = gst;
    }

    /**
     * @return the st
     */
    public double getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(double st) {
        this.st = st;
    }

    /**
     * @return the netamount
     */
    public double getNetamount() {
        return netamount;
    }

    /**
     * @param netamount the netamount to set
     */
    public void setNetamount(double netamount) {
        this.netamount = netamount;
    }

    @Override
    public String toString() {
        return "id:"+id + " ucccode:" + ucccode + " scrip:" + scrip + " tradedate:" + tradedate + " tradetype:" + tradetype + " quantity:" + quantity + " price:" + price+ " amount:" + amount + " brokerage:" + brokerage + " gst:" + gst + " st:" + st + " netamount:" + netamount;
    }
}
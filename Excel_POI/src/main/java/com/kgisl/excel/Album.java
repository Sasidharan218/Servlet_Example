package com.kgisl.excel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Album
 */
public class Album {
    private int id;
    private String title;
    private String Author;
    private float price;
    private int qty;
    private LocalDateTime releasedate;
    Date firstDate1 = new Date(2019, 6, 26);    

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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        Author = author;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the releasedate
     */
    public LocalDateTime getReleasedate() {
        return releasedate;
    }
    /**
     * @param releasedate the releasedate to set
     */
    public void setReleasedate(LocalDateTime releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public String toString() {
        return id + " " + title;
    }

}
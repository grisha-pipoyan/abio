package com.brutus.abio.data.entity;

import jakarta.persistence.Entity;

@Entity
public class ProductAdminDTO extends AbstractEntity {

    private String productCode;
    private String name;
    private Integer quantity;
    private Integer price;
    private Integer discount;
    private Integer discountPrice;
    private String name_en;
    private String name_ru;
    private String name_am;
    private String title_en;
    private String title_ru;
    private String title_am;
    private String description_en;
    private String description_am;
    private String description_ru;
    private String colorCode;
    private String catalogs;
    private String dimensions_en;
    private String dimensions_ru;
    private String dimensions_am;
    private Integer bulky;
    private boolean enabled;
    private boolean hasPictures;
    private boolean newArrival;
    private boolean todayOffer;
    private boolean recommended;
    private boolean service;
    private boolean giftCard;
    private String picturePaths;

    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public Integer getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }
    public String getName_en() {
        return name_en;
    }
    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
    public String getName_ru() {
        return name_ru;
    }
    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }
    public String getName_am() {
        return name_am;
    }
    public void setName_am(String name_am) {
        this.name_am = name_am;
    }
    public String getTitle_en() {
        return title_en;
    }
    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }
    public String getTitle_ru() {
        return title_ru;
    }
    public void setTitle_ru(String title_ru) {
        this.title_ru = title_ru;
    }
    public String getTitle_am() {
        return title_am;
    }
    public void setTitle_am(String title_am) {
        this.title_am = title_am;
    }
    public String getDescription_en() {
        return description_en;
    }
    public void setDescription_en(String description_en) {
        this.description_en = description_en;
    }
    public String getDescription_am() {
        return description_am;
    }
    public void setDescription_am(String description_am) {
        this.description_am = description_am;
    }
    public String getDescription_ru() {
        return description_ru;
    }
    public void setDescription_ru(String description_ru) {
        this.description_ru = description_ru;
    }
    public String getColorCode() {
        return colorCode;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    public String getCatalogs() {
        return catalogs;
    }
    public void setCatalogs(String catalogs) {
        this.catalogs = catalogs;
    }
    public String getDimensions_en() {
        return dimensions_en;
    }
    public void setDimensions_en(String dimensions_en) {
        this.dimensions_en = dimensions_en;
    }
    public String getDimensions_ru() {
        return dimensions_ru;
    }
    public void setDimensions_ru(String dimensions_ru) {
        this.dimensions_ru = dimensions_ru;
    }
    public String getDimensions_am() {
        return dimensions_am;
    }
    public void setDimensions_am(String dimensions_am) {
        this.dimensions_am = dimensions_am;
    }
    public Integer getBulky() {
        return bulky;
    }
    public void setBulky(Integer bulky) {
        this.bulky = bulky;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public boolean isHasPictures() {
        return hasPictures;
    }
    public void setHasPictures(boolean hasPictures) {
        this.hasPictures = hasPictures;
    }
    public boolean isNewArrival() {
        return newArrival;
    }
    public void setNewArrival(boolean newArrival) {
        this.newArrival = newArrival;
    }
    public boolean isTodayOffer() {
        return todayOffer;
    }
    public void setTodayOffer(boolean todayOffer) {
        this.todayOffer = todayOffer;
    }
    public boolean isRecommended() {
        return recommended;
    }
    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }
    public boolean isService() {
        return service;
    }
    public void setService(boolean service) {
        this.service = service;
    }
    public boolean isGiftCard() {
        return giftCard;
    }
    public void setGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
    }
    public String getPicturePaths() {
        return picturePaths;
    }
    public void setPicturePaths(String picturePaths) {
        this.picturePaths = picturePaths;
    }

}

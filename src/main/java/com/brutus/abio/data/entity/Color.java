package com.brutus.abio.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Color extends AbstractEntity {

    private String colorCode;
    private String name_en;
    private String name_ru;
    private String name_am;

    public String getColorCode() {
        return colorCode;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
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

}

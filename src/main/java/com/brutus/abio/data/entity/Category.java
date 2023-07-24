package com.brutus.abio.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Category extends AbstractEntity {

    private Integer code;
    private String english;
    private String russian;
    private String armenian;
    private boolean enabled;
    private Integer parentCode;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getEnglish() {
        return english;
    }
    public void setEnglish(String english) {
        this.english = english;
    }
    public String getRussian() {
        return russian;
    }
    public void setRussian(String russian) {
        this.russian = russian;
    }
    public String getArmenian() {
        return armenian;
    }
    public void setArmenian(String armenian) {
        this.armenian = armenian;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public Integer getParentCode() {
        return parentCode;
    }
    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

}

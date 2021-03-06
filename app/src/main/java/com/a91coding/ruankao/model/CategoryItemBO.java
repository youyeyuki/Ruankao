package com.a91coding.ruankao.model;

import java.io.Serializable;

/**
 * 题库分类
 * Created by Administrator on 2017/01/04.
 */
public class CategoryItemBO implements Serializable {

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getPeriodToShow() {
        return periodToShow;
    }

    public void setPeriodToShow(String periodToShow) {
        this.periodToShow = periodToShow;
    }

    private int id;//当前分类id
    private int no;//序号
    private int categoryId;//大分类ID
    private String categoryName;//分类名称
    private String period;//期数
    private String periodToShow;//期数（用于展示）
    private String extInfo;//扩展信息 -- 上午、下午
}

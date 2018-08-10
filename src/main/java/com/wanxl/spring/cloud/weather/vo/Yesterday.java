package com.wanxl.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 昨日天气
 * @author Lucifer
 * @date 2018／02／05 00:09
 */
@Data
public class Yesterday implements Serializable{

    private static final long serialVersionUID = -4963615817109980523L;

    /** 日期. */
    private String date;

    /** 最高气温. */
    private String high;

    /** 风向. */
    private String fx;

    /** 最低气温. */
    private String low;

    /** 风力. */
    private String fl;

    /** 天气类型. */
    private String type;

}

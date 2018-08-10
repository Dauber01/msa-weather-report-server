package com.wanxl.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 未来天气
 * @author Lucifer
 * @date 2018／02／05 00:10
 */
@Data
public class Forecast implements Serializable{

    private static final long serialVersionUID = -199688443471218472L;

    /** 日期. */
    private String date;

    /** 最高气温. */
    private String high;

    /** 风力. */
    private String fengli;

    /** 最低气温. */
    private String low;

    /** 风向. */
    private String fengxiang;

    /** 天气类型. */
    private String type;

}

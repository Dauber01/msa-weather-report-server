package com.wanxl.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 天气响应数据
 * @author Lucifer
 * @date 2018／02／05 00:25
 */
@Data
public class WeatherResponse implements Serializable{

    private static final long serialVersionUID = 9220481996305462649L;

    private Weather data;

    private Integer status;

    private String desc;

}

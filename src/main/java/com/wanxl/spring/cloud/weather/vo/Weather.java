package com.wanxl.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息
 * @author Lucifer
 * @date 2018／02／04 23:53
 */
@Data
public class Weather implements Serializable{

    private static final long serialVersionUID = 5745123618322140849L;

    /** 昨天. */
    private Yesterday yesterday;

    /** 城市名字 .*/
    private String city;

    /** 空气指数. */
    private String aqi;

    /** 天气预报. */
    private List<Forecast> forecast;

    /** 感冒提示. */
    private String ganmao;

    /** 温度. */
    private String wendu;

}

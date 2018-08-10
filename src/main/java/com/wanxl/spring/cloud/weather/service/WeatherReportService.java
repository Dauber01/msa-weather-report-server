package com.wanxl.spring.cloud.weather.service;

import com.wanxl.spring.cloud.weather.vo.Weather;

/**
 * 天气预报接口
 * @author Lucifer
 * @date 2018／02／07 22:09
 */
public interface WeatherReportService {

    Weather getDataByCityId(String cityId);

}

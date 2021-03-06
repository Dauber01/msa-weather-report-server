package com.wanxl.spring.cloud.weather.service.impl;

import com.wanxl.spring.cloud.weather.service.WeatherReportService;
import com.wanxl.spring.cloud.weather.vo.Forecast;
import com.wanxl.spring.cloud.weather.vo.Weather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气预报接口
 * @author Lucifer
 * @date 2018／02／07 22:10
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService{

    @Override
    public Weather getDataByCityId(String cityId) {
        //TODO 改为有天气服务API为服务来提供数据
        Weather data = new Weather();
        data.setAqi("81");
        data.setCity("深圳");
        data.setGanmao("容易感冒，多加衣服哦，亲～");
        data.setWendu("22");

        List<Forecast> forecastList = new ArrayList<Forecast>();

        Forecast forecast = new Forecast();
        forecast.setDate("25日星期天");
        forecast.setType("晴");
        forecast.setFengli("无风");
        forecast.setHigh("高温11度");
        forecast.setLow("低温1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("26日星期天");
        forecast.setType("晴");
        forecast.setFengli("无风");
        forecast.setHigh("高温11度");
        forecast.setLow("低温1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("27日星期天");
        forecast.setType("晴");
        forecast.setFengli("无风");
        forecast.setHigh("高温11度");
        forecast.setLow("低温1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("28日星期天");
        forecast.setType("晴");
        forecast.setFengli("无风");
        forecast.setHigh("高温11度");
        forecast.setLow("低温1度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("29日星期天");
        forecast.setType("晴");
        forecast.setFengli("无风");
        forecast.setHigh("高温11度");
        forecast.setLow("低温1度");
        forecastList.add(forecast);

        data.setForecast(forecastList);

        return data;
    }
}

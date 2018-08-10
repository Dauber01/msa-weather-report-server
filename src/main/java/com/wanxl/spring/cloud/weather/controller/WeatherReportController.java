package com.wanxl.spring.cloud.weather.controller;

import com.wanxl.spring.cloud.weather.service.WeatherReportService;
import com.wanxl.spring.cloud.weather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气预报接口
 * @author Lucifer
 * @date 2018／02／07 22:19
 */
@Slf4j
@RestController
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId")String cityId, Model model) throws Exception{
        //TODO改为由城市服务API来提供数据
        List<City> cityList = null;
        try{
            cityList = new ArrayList<City>();
            City city = new City();
            city.setCityId("101280601");
            city.setCityName("深圳");
            cityList.add(city);
        }catch(Exception e){
            log.error("exception",e);
        }
        model.addAttribute("title","老卫的天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList",cityList);
        model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report","reportModel",model);
    }

}

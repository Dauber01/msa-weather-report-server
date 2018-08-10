package com.wanxl.spring.cloud.weather.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据权重平均分配的算法
 *
 * @author Lucifer
 * @date 2018／08／10 23:11
 */
public class Test {

    public static void main(String[] args){
        int num = 5;
        int power = 6;
        int totle = 24;
        int now = 0;
        List<Integer> list = new ArrayList<Integer>();
        int totlePower = 8 + 8*power + 8;
        int everyPower = totlePower % num == 0 ? totlePower / num : totlePower /num +1;
        for (int i = 0; i < num; i++){
            int nowHour = 0;
            int nowPower = 0;
            if (now < 8){
                if (everyPower > (8 - now)){
                    now = 8;
                    nowPower = 8;
                    nowHour = 8;
                }else{
                    list.add(8 - now);
                    now = everyPower;
                    continue;
                }
            }
            if (now >= 8 && now < 16){
                int pnu = (everyPower - nowPower)%6==0?(everyPower - nowPower)/6:(everyPower - nowPower)/6+1;
                if (16 - now - pnu < 0){
                    nowPower = nowPower + (16 - now) * power;
                    nowHour = nowHour + (16 - now);
                    now = 16;
                }else {
                    now = now + pnu;
                    list.add(nowHour + pnu);
                    continue;
                }
            }
            if (now >= 16 && now < 24){
                if (everyPower - nowPower < 24 - now){
                    now = now + (everyPower - nowPower);
                    nowHour = everyPower - nowPower;
                    list.add(nowHour);
                }else{
                    nowHour = nowHour + (24 - now);
                    now = 24;
                    list.add(nowHour);
                    continue;
                }
            }
        }
        System.out.println(list);
    }

}

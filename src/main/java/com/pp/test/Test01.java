package com.pp.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    //返回的是字符串型的时间，输入的
    //是String day, int x
    public static String addDateMinut(String day, int x){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 24小时制
        //引号里面个格式也可以是 HH:mm:ss或者HH:mm等等，很随意的，不过在主函数调用时，要和输入的变
        //量day格式一致
        Date date = null;
        try {
            date = format.parse(day);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (date == null)
            return "";
        System.out.println("front:" + format.format(date)); //显示输入的日期
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, x);// 24小时制
        date = cal.getTime();
        System.out.println("after:" + format.format(date));  //显示更新后的日期
        cal = null;
        return format.format(date);

    }

    //在输入的时间加上一定的小时数，得到新的日期
    public static Date addDateHour(Date date,int hour){
        Calendar cal = Calendar.getInstance();
        if(date!=null){
            cal.setTime(date);
            cal.add(Calendar.HOUR, hour);
        }
        date = cal.getTime();
        cal = null;
        return date;
    }

    //在输入的时间加上一定的天数，得到新的日期
    public static Date addDateDay(Date date,int day){
        Calendar cal = Calendar.getInstance();
        if(date!=null){
            cal.setTime(date);
            cal.add(Calendar.DATE, day);
        }
        date = cal.getTime();
        cal = null;
        return date;
    }

    public static void main(String[] args) {
//        System.out.println(addDateMinut("2021-02-28 23:24:21",50));
        System.out.println(addDateHour(new Date(),12));
        System.out.println(addDateDay(new Date(),10));
    }
}

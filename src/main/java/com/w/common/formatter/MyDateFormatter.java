package com.w.common.formatter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassNameMyDateFormatter
 * @Description
 * @Author ANGLE0
 * @Date2019/10/28 17:06
 * @Version V1.0
 **/
    public class MyDateFormatter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

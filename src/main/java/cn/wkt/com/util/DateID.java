package cn.wkt.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述:
 *
 * @Author: Kt.w
 * @Date: 2018/12/20
 * @Version 1.0
 * @since 1.0
 */
public class DateID {
    /**
     * 静态常亮，用来区别一天中的数据，调用一次增长1；以后这个值可以在数据库中获取,
     * 这个数字可以用多种方案解决，第一种是使用时间定时器，24小时一过，重新设置为10000
     * 另一种从数据库中实现自增，基本上要满足一天的用量
     */
    public static int dataIns =10000;

    /**
     * 获取yymmdd后六位的id
     * @return
     */
    public static String getDateID(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateId = simpleDateFormat.format(date);
        String id = dateId.replace("-","")+dataIns;
        dataIns+=1;
        return id;
    }
    /**
     * 纯时间id，并不安全，会出现重复
     *
     */
    public static  String  getTotalId(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
        String dateId = simpleDateFormat.format(date);
        String id = dateId.replace("-","");
        return id;
    }
}

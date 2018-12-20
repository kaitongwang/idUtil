package cn.wkt.com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 描述: 获取UUID 工具类
 *
 * @Author: Kt.w
 * @Date: 2018/12/20
 * @Version 1.0
 * @since 1.0
 */
public class UUidUtils {

    /**
     * 生成一个uuid
     * @return
     */
    public static String getUUid(){
      String UUid = UUID.randomUUID().toString();
      return UUid;
    };

    /**
     * 生成指定数量的UUid
     * @param size
     * @return
     */
   public static List<String>  getUUids(int  size){
       List<String> id=new ArrayList<String>();
       for (int i = 0; i < size; i++) {
           //截取最后一部分
           id.add(UUID.randomUUID().toString());
       }
     return id;

   }
}

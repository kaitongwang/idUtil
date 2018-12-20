package cn.wkt.com.test;

import cn.wkt.com.util.UUidUtils;

import java.util.List;

/**
 * 描述: 测试生成UUID
 *
 * @Author: Kt.w
 * @Date: 2018/12/20
 * @Version 1.0
 * @since 1.0
 */
public class TextUUID {
    public static void main(String[] args) {

        //测试获取一个原生态UUid
        String id = UUidUtils.getUUid();
        System.out.println(id);

        // 获取没有-的UUID
        String StringId = UUidUtils.getStringUUid();
        System.out.println(StringId);
        //获取指定数量的原生态UUid；
        int size = 20;
        List<String>  ids = UUidUtils.getUUids(size);

        for(String  uuid:ids){
            System.out.println(uuid);
        }

        //获取指定数量的没有"-"UUid；
        List<String>  stringIds = UUidUtils.getStringUUids(size);

        for(String  uuid:stringIds){
            System.out.println(uuid);
        }
    }

}

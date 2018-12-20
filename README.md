# idUtil
 #原生态UUID
   # 单条记录
        /**
         * 生成一个原生态uuid
         * @return
         */
        public static String getUUid(){}
        
   # 多条记录  
               /**
                * 生成指定数量的原生态UUid
                * @param size
                * @return
                */
              public static List<String>  getUUids(int  size){}
 #没有"-"的UUID
   # 单条记录
             /**
              * 生成一个没有"-"uuid
              * @return
              */
             public static String getStringUUid(){}
         
   # 多条记录  
          /**
            * 生成指定数量的没有"-"UUid
            * @param size
            * @return
            */
           public static List<String>  getStringUUids(int  size){}
 #注意
   #不建议由于UUID过长而截取部分id，这样会导致重复，虽然是小概率事件，但还是会发生

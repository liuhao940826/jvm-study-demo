package self.alan.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname StrOOM
 * @Description TODO
 * @Date 2021/7/15 下午1:32
 * @Created by liuhao
 */
public class StrOOM {

    public  static String baseStr ="alan";


    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
           String str = baseStr+baseStr;
           baseStr =str;
           //注意下这个intern 方法
           strList.add(str.intern());
        }
        

    }

}

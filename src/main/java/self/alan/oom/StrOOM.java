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
            baseStr+=baseStr;
            strList.add(baseStr);
        }
        

    }

}

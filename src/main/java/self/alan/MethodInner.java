package self.alan;

/**
 * @Classname MethodInner
 * @Description 方法内联的解释
 * @Date 2021/7/13 上午1:08
 * @Created by liuhao
 */
public class MethodInner {


    public static void main(String[] args) {

        int a = 0,b = 0,c = 0,d =1;

        add4(a,b,c,d);
        //这个会被优化成
        add4Back(a,b,c,d);

    }

    private static int add4(int x1, int x2, int x3, int x4){

        return add2(x1,x3) +add2(x2,x4);
    }

    private static int add2(int y1, int y2){
        return y1+y2;
    }

    //这个会被优化成
    private static int add4Back(int x1, int x2, int x3, int x4){

        return x1+x3+x2+x4;
    }

}

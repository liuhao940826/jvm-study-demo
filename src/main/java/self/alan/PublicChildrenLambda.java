package self.alan;

/**
 * @Classname PublicChildrenLambda
 * @Description 公共子表达式优化解释
 * @Date 2021/7/13 上午12:50
 * @Created by liuhao
 */
public class PublicChildrenLambda {




    //公共子表达式优化
    public static void main(String[] args) {

        int a= 1; int b =2; int c = 3 ;

        int d = (c*b) * 12+a+(a+b*c);

        //把B*c 看成一个整体 JIT 会把
        int e = b *c;
        //式子就变成了
        d = e*12 +a+ (a  + e);
        //然后优化
        d = e * 13 +2*a;

    }


}

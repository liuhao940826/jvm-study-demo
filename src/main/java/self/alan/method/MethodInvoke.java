package self.alan.method;

import java.util.Random;

/**
 * @Classname MethodInvoke
 * @Description TODO
 * @Date 2021/7/19 上午11:50
 * @Created by liuhao
 */

class Edu{

    public double edu(double price,Student student){
        return price;
    }

}


interface  Student{
    boolean isRecomand();
}

public class MethodInvoke extends Edu {

    public double edu(double price,Student student){

        if(student.isRecomand()){     //invokeinterface
            return price * randomPrice(); //invokestatic
        }else {
            return super.edu(price,student);  //invokespecial
        }
    }

    private static double randomPrice(){
            return new Random()    //invokespecial
                    .nextDouble(); //invokevirtual
    }

}

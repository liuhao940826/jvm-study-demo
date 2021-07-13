package self.alan;

/**
 * @Classname EscapeAnalysis
 * @Description TODO
 * @Date 2021/7/13 下午3:05
 * @Created by liuhao
 */
public class EscapeAnalysis {
    //全局成员变量逃逸
    public static Object object;

    //全局成员变量赋值逃逸
    public  void globalVariableEscape(){
        object = new Object();
    }

    //方法返回值逃逸
    public Object methodEscape(){
        return new Object();
    }

    //实例引用发生逃逸
    public  void instancePassEscape(){
        this.speak(this);
    }


    public void  speak(EscapeAnalysis escapeAnalysis){
        System.out.println("输出.............");
    }


}

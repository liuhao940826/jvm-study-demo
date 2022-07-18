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
  public void globalVariableEscape() {
      //返回的对象逃出了这个方法
    object = new Object();
  }

  //方法返回值逃逸
  public Object methodEscape() {
      //方法的返回值 被返回出去可以在外部使用存在逃逸
    return new Object();
  }

  //实例引用发生逃逸
  public void instancePassEscape() {
      //this对象可以在另一个方法中使用存在逃逸
    this.speak(this);
  }


  public void speak(EscapeAnalysis escapeAnalysis) {
    System.out.println("输出.............");
  }


}

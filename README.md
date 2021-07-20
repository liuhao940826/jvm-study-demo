# jvm-study-demo

PublicChildrenLambda 讲述了公共子表达式优化的过程

MethodInner 讲述了方法内联

EscapeAnalysis 描述了几种逃逸情况

# MethodAreaOOM 添加了 元空间 异常的案例 谨慎使用 

StrOOM 添加了字符串 方法区溢出  
注意下使用的jdk 版本 
1.6 PernGen space (永久代空间)
1.7 Java heap space (堆空间)
1.8 Java heap space (堆空间) + 告诉你两个失效


#StackDymic 查看栈的调用 先javac StackDymic 
                        javap -StackDymic.class
                        
结果: public class self.alan.stack.StackDymic
      minor version: 0
      major version: 52
      flags: ACC_PUBLIC, ACC_SUPER
    Constant pool:
       #1 = Methodref          #3.#12         // java/lang/Object."<init>":()V
       #2 = Class              #13            // self/alan/stack/StackDymic
       #3 = Class              #14            // java/lang/Object
       #4 = Utf8               <init>
       #5 = Utf8               ()V
       #6 = Utf8               Code
       #7 = Utf8               LineNumberTable
       #8 = Utf8               main
       #9 = Utf8               ([Ljava/lang/String;)V
      #10 = Utf8               SourceFile
      #11 = Utf8               StackDymic.java
      #12 = NameAndType        #4:#5          // "<init>":()V
      #13 = Utf8               self/alan/stack/StackDymic
      #14 = Utf8               java/lang/Object
    {
      public self.alan.stack.StackDymic();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
          stack=1, locals=1, args_size=1
             0: aload_0
             1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             4: return
          LineNumberTable:
            line 9: 0
    
      public static void main(java.lang.String[]);
        descriptor: ([Ljava/lang/String;)V
        flags: ACC_PUBLIC, ACC_STATIC
        Code:
          stack=2, locals=4, args_size=1
             0: iconst_1     #常数1入栈  
             1: istore_1     #栈顶元素移入本地变量表下标1存储
             2: iconst_2     #常数2入栈 
             3: istore_2     #栈顶元素移入本地变量表下标2存储
             4: iload_1      #从本地表加载1入栈 (操作栈)   
             5: iload_2     #从本地表加载2入栈 (操作栈)   
             6: iadd        #相加
             7: bipush        10  10入栈
             9: imul        相乘
            10: istore_3
            11: return
          LineNumberTable:
            line 12: 0
            line 13: 2
            line 14: 4
            line 15: 11
    }


0 ,1,2 ,3 ... 是PC计数器记住的值


#EdenCollection 添加了查看堆内存的GC方式 
                      

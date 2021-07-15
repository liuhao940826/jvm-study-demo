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
package self.alan.rubbish;

/**
 * @Classname EdenCollectionClient client
 * @Description TODO
 * @Date 2021/7/20 上午11:44
 * @Created by liuhao
 */
public class EdenCollectionClient {

    //int 1024Byte =1KB
    private static final int _1MB =1024*1024;

    /**
     * 指定内存空间 -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC 这个是client模式
     *  制定了老年代初始大小20M 最大大小20M 新生代 10M  默认 8 1 1 配置 打印详情 开启GC日志
     */
    private static  void memeoryAllocation(){
        byte [] allocation1 ,allocation2,allocation3,allocation4;
        allocation1 = new  byte[2*_1MB];
        allocation2 = new  byte[2*_1MB];
        allocation3 = new  byte[2*_1MB];
        allocation4 = new  byte[4*_1MB];

    }

    public static void main(String[] args) {

        memeoryAllocation();

    }

}

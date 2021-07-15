package self.alan.oom;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MethodAreaOOM
 * @Description TODO
 * @Date 2021/7/15 下午1:23
 * @Created by liuhao
 */
public class MethodAreaOOM {

    //这个方法会导致 方法区移除 classLoad 一直加载 慎run
    public static void main(String[] args) {

        URL url = null;

       List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();

        try {
            url = new File("../tmp").toURI().toURL();
            URL[] urls ={url};

            while(true){
                URLClassLoader urlClassLoader = new URLClassLoader(urls);

                classLoaders.add(urlClassLoader);
                urlClassLoader.loadClass("self.alan.tmp.TestOOM");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}

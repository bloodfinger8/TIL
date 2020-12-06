package JavaDesignPattern.abstractFactoryPattern.concrete;

import JavaDesignPattern.abstractFactoryPattern.abst.GuiFac;
import JavaDesignPattern.abstractFactoryPattern.linux.LinuxGuiFac;
import JavaDesignPattern.abstractFactoryPattern.window.WindowGuiFac;

public class FactoryInstance {

    public static GuiFac getGuiFac() {
        String osType = System.getProperty("os.name");
        switch(osType) {
            case "Mac OS X":
                return new LinuxGuiFac();
            case "window":
                return new WindowGuiFac();
        }
        return null;
    }
}
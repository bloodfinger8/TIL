package JavaDesignPattern.abstractFactoryPattern.main;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;
import JavaDesignPattern.abstractFactoryPattern.abst.GuiFac;
import JavaDesignPattern.abstractFactoryPattern.linux.LinuxGuiFac;

public class Main {
    public static void main(String[] args) {

        GuiFac fac = new LinuxGuiFac();
        Button button = fac.createButton();
        button.buttonClick();
    }
}

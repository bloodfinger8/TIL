package JavaDesignPattern.abstractFactoryPattern.main;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;
import JavaDesignPattern.abstractFactoryPattern.abst.GuiFac;
import JavaDesignPattern.abstractFactoryPattern.abst.TextArea;
import JavaDesignPattern.abstractFactoryPattern.concrete.FactoryInstance;
import JavaDesignPattern.abstractFactoryPattern.linux.LinuxGuiFac;
import JavaDesignPattern.abstractFactoryPattern.window.WindowGuiFac;

public class Main {
    public static void main(String[] args) {

        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();
        button.buttonClick();
        System.out.println( textArea.getValue() );

//        GuiFac windowFac = new WindowGuiFac();
//        Button windowButton = windowFac.createButton();
//        TextArea windowTextArea = windowFac.createTextArea();
//        windowButton.buttonClick();
//        System.out.println(windowTextArea.getValue());


    }
}

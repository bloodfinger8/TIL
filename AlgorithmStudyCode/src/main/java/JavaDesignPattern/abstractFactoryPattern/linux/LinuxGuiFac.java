package JavaDesignPattern.abstractFactoryPattern.linux;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;
import JavaDesignPattern.abstractFactoryPattern.abst.GuiFac;
import JavaDesignPattern.abstractFactoryPattern.abst.TextArea;

public class LinuxGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

package JavaDesignPattern.abstractFactoryPattern.window;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;
import JavaDesignPattern.abstractFactoryPattern.abst.GuiFac;
import JavaDesignPattern.abstractFactoryPattern.abst.TextArea;

public class WindowGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowTextArea();
    }
}

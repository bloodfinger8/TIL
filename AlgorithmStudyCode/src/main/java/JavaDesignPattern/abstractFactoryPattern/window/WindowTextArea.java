package JavaDesignPattern.abstractFactoryPattern.window;

import JavaDesignPattern.abstractFactoryPattern.abst.TextArea;

public class WindowTextArea implements TextArea {

    @Override
    public String getValue() {
        return "window textArea 의 값";
    }
}

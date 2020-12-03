package JavaDesignPattern.abstractFactoryPattern.linux;

import JavaDesignPattern.abstractFactoryPattern.abst.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getValue() {
        return "리눅스 textArea 값";
    }
}

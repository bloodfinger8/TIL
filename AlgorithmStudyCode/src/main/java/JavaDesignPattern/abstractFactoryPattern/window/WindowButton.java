package JavaDesignPattern.abstractFactoryPattern.window;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;

public class WindowButton implements Button {

    @Override
    public void buttonClick() {
        System.out.println("window 버튼 클릭");
    }
}

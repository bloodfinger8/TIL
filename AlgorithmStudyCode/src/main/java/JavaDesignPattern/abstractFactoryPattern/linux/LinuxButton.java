package JavaDesignPattern.abstractFactoryPattern.linux;

import JavaDesignPattern.abstractFactoryPattern.abst.Button;

public class LinuxButton implements Button {
    @Override
    public void buttonClick() {
        System.out.println("리눅스 버튼 클릭");
    }
}

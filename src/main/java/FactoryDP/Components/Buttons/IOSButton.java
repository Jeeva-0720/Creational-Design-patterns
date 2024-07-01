package FactoryDP.Components.Buttons;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS button clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("IOS button change size");
    }
}

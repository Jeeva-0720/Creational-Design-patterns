package FactoryDP.Components.Buttons;

public class WindowsButton implements Button{

    @Override
    public void click() {
        System.out.println("Clicked WindowsButton");
    }

    @Override
    public void changeSize() {
        System.out.println("Changed WindowsButton size");
    }
}

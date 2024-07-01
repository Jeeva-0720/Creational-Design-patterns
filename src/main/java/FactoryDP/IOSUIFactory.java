package FactoryDP;

import FactoryDP.Components.Buttons.Button;
import FactoryDP.Components.Buttons.IOSButton;
import FactoryDP.Components.menu.IOSMenu;
import FactoryDP.Components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}

package FactoryDP;

import FactoryDP.Components.Buttons.Button;
import FactoryDP.Components.Buttons.WindowsButton;
import FactoryDP.Components.menu.Menu;
import FactoryDP.Components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

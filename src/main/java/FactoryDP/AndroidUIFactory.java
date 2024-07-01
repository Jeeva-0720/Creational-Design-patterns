package FactoryDP;

import FactoryDP.Components.Buttons.AndroidButton;
import FactoryDP.Components.Buttons.Button;
import FactoryDP.Components.menu.AndroidMenu;
import FactoryDP.Components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}

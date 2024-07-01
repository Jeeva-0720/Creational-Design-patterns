package FactoryDP;

import FactoryDP.Components.Buttons.Button;
import FactoryDP.Components.menu.Menu;

public class client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(PlatformType.Windows);
        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}

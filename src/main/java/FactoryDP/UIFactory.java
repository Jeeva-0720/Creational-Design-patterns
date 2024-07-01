package FactoryDP;

import FactoryDP.Components.Buttons.Button;
import FactoryDP.Components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}

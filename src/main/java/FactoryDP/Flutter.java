package FactoryDP;

public class Flutter {
    public void refreshUI(){
        System.out.println("Refreshing UI");
    }
    public void setTheme(){
        System.out.println("setting up theme");
    }
    public UIFactory createUIFactory(PlatformType platformType){
        return UIFactoryFactory.getUIFactory(platformType);
    }
}

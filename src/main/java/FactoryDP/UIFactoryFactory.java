package FactoryDP;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(PlatformType platformType) {
        if(platformType.equals(PlatformType.Android)){
            return new AndroidUIFactory();
        }
        else if(platformType.equals(PlatformType.IOS)){
            return new IOSUIFactory();
        }
        else if(platformType.equals(PlatformType.Windows)){
            return new WindowsUIFactory();
        }
        return null;
    }
}

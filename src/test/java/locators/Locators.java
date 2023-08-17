package locators;

import org.openqa.selenium.By;

public class Locators {
    public static By nodeQuerying = By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]");
    public static By doTaxesButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.CheckBox");
    public static By views = By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    public static By expandableList = By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
    public  static By autoComplete = By.xpath("//android.widget.TextView[@content-desc=\"Auto Complete\"]");
    public static By customAdaptor = By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
    public static By screenTop = By.xpath("//android.widget.TextView[@content-desc=\"1. Screen Top\"]");
    public static By addText = By.id("io.appium.android.apis:id/edit");
    public static By MultipleItems = By.xpath("//android.widget.TextView[@content-desc=\"6. Multiple items\"]");
    public static By toastMessage = By.xpath("//android.widget.Toast[1]");
    public static By dateWidgets = By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]");
    public static By clickInline = By.xpath("//android.widget.TextView[@content-desc=\"2. Inline\"]");
    public static By firstMin = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]");
    public static By secondMin = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]");
    public static By hours = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]");
    public static By dragAndDropOption = By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
    public static By firstCircle = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[1]");
    public static By secondCircle = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[3]");


}

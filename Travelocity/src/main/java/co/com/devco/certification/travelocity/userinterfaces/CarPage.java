package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarPage {

    public static final Target CHECK_FILTER = Target.the("Check filter")
            .locatedBy("//fieldset//div[@class='uitk-flex-item uitk-flex-grow-1 uitk-switch-content']//label/span[contains(text(), '{0}')]//ancestor::div[@class='uitk-flex uitk-flex-nowrap uitk-switch uitk-checkbox']//input");

    public static final Target SORT_CAR_SELECT = Target.the("Sort car select")
            .locatedBy("//select[@id='cars-sort-dropdown']");

    public static final Target SORT_CAR_OPTION = Target.the("Sort car option {0}")
            .locatedBy("//select[@id='cars-sort-dropdown']//option[(text()= '{0}')]");

    public static final Target VIEW_FILTER = Target.the("View filter {0}")
            .locatedBy("//button[@class='uitk-pill removable uitk-pill-content uitk-flex-item']//*[contains(text(), '{0}')]");

    public static final Target LIST_PRICE_CAR = Target.the("List of Prices car").locatedBy(
            "//div[@class='per-day-price'][contains(text(), '$')]");

    public static final Target BUTTON_CAR_RESERVE = Target.the("Button car reserve").locatedBy(
            "(//div[@class='per-day-price']//self::*[text()='${0}']//following::button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary'])[1]");

    public static final Target LIST_PRICE_CAR_PACKAGE = Target.the("List of Prices car package ").locatedBy(
            "//div[@class='uitk-price-lockup right-align']//span[@class='uitk-lockup-price'][contains(text(), '$')]");

    public static final Target BUTTON_CAR_RESERVE_PACKAGE = Target.the("Button car reserve package").locatedBy(
            "(//div[@class='uitk-price-lockup right-align']//span[@class='uitk-lockup-price'][contains(text(), '${0}')]//following::button)[1]");

    public static final Target TAG_AARP_EXCLUSIVE = Target.the("Tag AARP exclusive").locatedBy(
            "//span[@class='uitk-badge-text']");

    private CarPage() {
    }
}

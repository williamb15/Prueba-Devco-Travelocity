package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationPage {

    public static final Target SELECT_ZONE = Target.the("Select the zone")
            .locatedBy("//span[contains(text(),'{0}')]//ancestor::div[@class='uitk-flex uitk-flex-nowrap uitk-switch uitk-radio']//input");

    public static final Target VIEW_FILTER = Target.the("View filter {0}")
            .locatedBy("//section[@class='uitk-flex-wrap uitk-flex playback-pill-grid']//*[text() = '{0}']");

    public static final Target SORT_BY = Target.the("Sort by ")
            .locatedBy("//select[@id='sort']");

    public static final Target SORT_OPTION = Target.the("Sort option {0}")
            .locatedBy("//select[@id='sort']//option[(text()= '{0}')]");

    public static final Target LABEL_PRICE_DETAILS = Target.the("Label price details")
            .locatedBy("//article[@id='price-summary-title']/div");

    public static final Target LIST_PRICE_HOTELS = Target.the("List of prices hotels").locatedBy(
            "//span[@class='uitk-cell loyalty-display-price all-cell-shrink'][contains(text(), '$')]");

    public static final Target RESULT_HOTEL_RESERVE = Target.the("Hotel for reserve").locatedBy(
            "(//span[@class='uitk-cell loyalty-display-price all-cell-shrink'][contains(text(), '${0}')]//following::a)[1]");

    public static final Target LIST_PRICE_ROOMS = Target.the("List of prices rooms").locatedBy(
            "//span[@data-stid='price-lockup-text'][contains(text(), '$')]");

    public static final Target BUTTON_ROOM_RESERVE = Target.the("Button room reserve")
            .locatedBy(" (//span[@data-stid='price-lockup-text'][contains(text(), '${0}')]//following::div[@class='uitk-flex uitk-flex-align-items-flex-end uitk-flex-column uitk-flex-item']//button[@data-stid='submit-hotel-reserve'])[1]");

    private AccommodationPage() {
    }
}

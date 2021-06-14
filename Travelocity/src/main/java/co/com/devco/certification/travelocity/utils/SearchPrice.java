package co.com.devco.certification.travelocity.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static co.com.devco.certification.travelocity.utils.constants.ErrorsConstants.*;

public class SearchPrice {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchPrice.class);

    private SearchPrice() {
    }

    public static WebElementFacade inTheList(List<WebElementFacade> listPrices) {

        int lowerPrice = 999999;
        int index = 0;

        if(listPrices.isEmpty()){
            LOGGER.info(LIST_PRICE_ERROR);
        }

        for (int i = 0; i < listPrices.size(); i++) {
            int price = Integer.parseInt(
                    listPrices.get(i).getText().replace(" ", "").replace("+", "").
                            replace("$", "").replace(".", "").trim());
            if (lowerPrice > price) {
                lowerPrice = price;
                index = i;
            }
        }
        return listPrices.get(index);
    }
}


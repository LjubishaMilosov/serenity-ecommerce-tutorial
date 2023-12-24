package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class HomePageActions extends UIInteractions {

    @Step("Get home page title")
    public String getTheHomePageTitle(){
        return getTitle();
    }
}

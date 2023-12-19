package com.serenitydojo.ecommerce.acceptancetests.navigtion;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)

public class MenuBarTest extends UIInteractions {

    @Test
    void shouldDisplayTheCorrectTitle(){
        openUrl("https://magento.softwaretestingboard.com/");

        String pageTitle = getTitle();
        Assertions.assertThat(pageTitle).isEqualTo("Home Page");
    }
    @Test
    void shouldShowTheTopLevelMenuItemsOnTheHomePage(){
        openUrl("https://magento.softwaretestingboard.com/");
        List<String> menuItems = findAll(".navigation a.level-top").texts();
        Assertions.assertThat(menuItems).contains("What's New", "Women", "Men", "Gear", "Training", "Sale");
    }
}

package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.drivers.EmergyaWebDriver;

public class EventsPage extends BasePageObject {

    /**
     * Logger class initialization.
     */
    Logger log = Logger.getLogger(NewsPage.class);

    /**
     * Constructor method
     * @param driver selenium webdriver
     */
    public EventsPage(EmergyaWebDriver driver) {
        super(driver);
        isReady();
    }

    /**
     * Checks that the PO is ready
     * @param pageObject page object to be used
     */
    @Override
    public boolean isReady() {
        log.info("[log-PageObjects] " + this.getClass().getSimpleName()
                + " - Start isReady method");

        boolean status = this.isElementVisibleByXPath("logo");

        log.info("[log-PageObjects] " + this.getClass().getSimpleName()
                + " - End isReady method");

        return status;
    }

    // Page object methods
    /**
     * This method click on Emergya page
     * @return
     */

    public void doClickEvents() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickEvents -[" + this.getClass().getSimpleName()
                + "- method]");

        this.getElementByXPath("eventsClases").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickEvents method");
    }

    public void introducirCampoTitle(String title) {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start introducirCampoTitle -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementById("title").clear();

        this.getElementById("title").sendKeys(title);

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End introducirCampoTitle method");
    }

    public void introducirCampoDescription(String description) {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start introducirCampoDescription -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementById("description").clear();

        this.getElementById("description").sendKeys(description);

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End introducirCampoDescription method");
    }

    public void clickStartDateMonth() {
        driver.clickOutWithMouse(By.id("startDateMonth"));
    }

    public void clickStartDateDay() {
        driver.clickOutWithMouse(By.id("startDateDay"));
    }

    public void clickStartDateYear() {
        driver.clickOutWithMouse(By.id("startDateYear"));
    }

    public void clickFinishDateMonth() {
        driver.clickOutWithMouse(By.id("finishDateMonth"));
    }

    public void clickFinishDateDay() {
        driver.clickOutWithMouse(By.id("finishDateDay"));
    }

    public void clickFinishDateYear() {
        driver.clickOutWithMouse(By.id("finishDateYear"));
    }

    public void doClickOnCreate() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickOnCreate -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementByXPath("create").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickOnCreate method");
    }

    public void doClickOnGuardar() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickOnGuardar -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementByXPath("guardar").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickOnGuardar method");
    }

    public void doClickOnBorrar() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickOnBorrar -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementByXPath("borrar").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickOnBorrar method");
    }

    public void doClickOnConfirmar() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickOnBorrar -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementByXPath("confirmar").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickOnBorrar method");
    }

    public void doClickOnEditar() {
        log.info("[log-" + this.getClass().getSimpleName()
                + "]- Start doClickOnEditar -["
                + this.getClass().getSimpleName() + "- method]");

        this.getElementByXPath("editar").click();

        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End doClickOnEditar method");
    }

    public WebElement search(String titulo1, String titulo2) {
        WebElement result = null;
        try {
            for (WebElement x : driver.findElements(By.className("events"))) {
                if (x.getText().equals(titulo1)
                        || x.getText().equals(titulo2)) {
                    result = x;
                    break;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }

}
package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableRates extends PageObject {

    @FindBy(linkText = "EUR")
    public WebElementFacade rateOfEuro;

    private List<Double> valuesForBuying;
    private List<Double> valuesForSelling;
    private List<Double> resultForBuying;
    private List<Double> resultForSelling;

    public void openPage() {
        getDriver().get("http://finance.i.ua/");
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void goToLinkEur() {
        waitFor(ExpectedConditions.visibilityOf(rateOfEuro));
        rateOfEuro.click();
    }

    public List<Double> getResultForBuying(){
        List<Double> resultForBuying = new ArrayList<>();
        for (int i = 38; i <= 41; i++) {
            WebElement rowValue = getDriver().findElement(By.xpath(".//*[@id='feMain2']//tr[" + i + "]/td[2]"));
            if (rowValue.isDisplayed()) {
                resultForBuying.add(Double.parseDouble(rowValue.getText()));
            }
        }
            setResultForBuying(resultForBuying);
            return resultForBuying;
    }

    public List<Double> getResultForSelling(){
        List<Double> resultForSelling = new ArrayList<>();
        for (int i =38; i<=41; i++){
            WebElement rowValue = getDriver().findElement(By.xpath(".//*[@id='feMain2']//tr[" + i + "]/td[3]"));
            if (rowValue.isDisplayed()){
                resultForSelling.add(Double.parseDouble(rowValue.getText()));
            }
        }
        setResultForSelling(resultForSelling);
        return resultForSelling;
    }

    public List<Double> getRatesForBuying(){
        List<Double> valuesForBuying = new ArrayList<>();
        for (int i = 2; i <= 36; i++) {
            WebElement rowValue = getDriver().findElement(By.xpath(".//*[@id='feMain2']//tr[" + i + "]/td[2]"));
            if (rowValue.isDisplayed()) {
                valuesForBuying.add(Double.parseDouble(rowValue.getText()));
            }
        }
        setValuesForBuying(valuesForBuying);
        return valuesForBuying;
    }

    public List<Double> getRatesForSelling(){
        List<Double> valuesForSelling = new ArrayList<>();
        for (int i = 2; i <= 36; i++) {
            WebElement rowValue = getDriver().findElement(By.xpath(".//*[@id='feMain2']//tr[" + i + "]/td[3]"));
            if (rowValue.isDisplayed()) {
                valuesForSelling.add(Double.parseDouble(rowValue.getText()));
            }
        }
        setValuesForSelling(valuesForSelling);
        return valuesForSelling;
    }

    public double findMinRateForBuyingActual() {
        double minRateForBuyingActual = Collections.min(valuesForBuying);
        return minRateForBuyingActual;
    }

    public double findMinRateForSellingActual() {
        double minRateForSellingActual = Collections.min(valuesForSelling);
        return minRateForSellingActual;
    }

    public double findMinResultForBuying(){
        double minResultForBuying = Collections.min(resultForBuying);
        return minResultForBuying;
    }

    public double findMinResultForSelling(){
        double minResultForSelling = Collections.min(resultForSelling);
        return minResultForSelling;
    }

    public double findMaxRateForBuyingActual(){
        double maxRateForBuyingActual = Collections.max(valuesForBuying);
        return maxRateForBuyingActual;
    }

    public double findMaxRateForSellingActual(){
        double maxRateForSellingActual = Collections.max(valuesForSelling);
        return maxRateForSellingActual;
    }

    public double findMaxResultForBuying(){
        double maxResultForBuying = Collections.max(resultForBuying);
        return maxResultForBuying;
    }

    public double findMaxResultForSelling(){
        double maxResultForSelling = Collections.max(resultForSelling);
        return maxResultForSelling;
    }

    public double findAverageRateForBuyingActual() {
        double averageRateForBuyingActual;
        double sum = 0;
        for (double elem : valuesForBuying) {
            sum = sum + elem;
        }
        averageRateForBuyingActual = sum / valuesForBuying.size();
        return averageRateForBuyingActual;
    }

    public double findAverageRateForSellingActual() {
        double averageRateForSellingActual;
        double sum = 0;
        for (double elem : valuesForSelling) {
            sum = sum + elem;
        }
        averageRateForSellingActual = sum / valuesForSelling.size();
        return averageRateForSellingActual;
    }

    public double findAverageResultForBuying(){
        double averageResultForBuying=0;
        for(double elem : resultForBuying){
            if(elem>Collections.min(resultForBuying)&&elem<Collections.max(resultForBuying)) {
                averageResultForBuying=elem;
            }
        }
        return averageResultForBuying;
    }

    public double findAverageResultForSelling(){
        double averageResultForSelling=0;
        for(double elem:resultForSelling){
            if(elem>Collections.min(resultForSelling)&&elem<Collections.max(resultForSelling)){
               averageResultForSelling=elem;
            }
        }
        return averageResultForSelling;
    }

    public double findOptimalForBuying(){
        double optimalForBuying=0;
        for(double elem:resultForBuying){
            if(elem==Collections.max(resultForBuying)){
                optimalForBuying=elem;
            }
        }
        return optimalForBuying;
    }

    public double findOptimalForSelling(){
        double optimalForSelling=0;
        for(double elem:resultForSelling){
            if(elem==Collections.min(resultForSelling)){
                optimalForSelling=elem;
            }
        }
        return optimalForSelling;
    }

    public void setValuesForBuying(List<Double> valuesForBuying) {
        this.valuesForBuying = valuesForBuying;
    }

    public void setValuesForSelling(List<Double> valuesForSelling) {
        this.valuesForSelling = valuesForSelling;
    }

    public void setResultForBuying(List<Double> resultForBuying) {
        this.resultForBuying = resultForBuying;
    }

    public void setResultForSelling(List<Double> resultForSelling) {
        this.resultForSelling = resultForSelling;
    }
}


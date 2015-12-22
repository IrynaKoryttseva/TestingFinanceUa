package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.TableRates;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class StepsLogic extends ScenarioSteps{
    TableRates tableRates;


    @Step
    public void goesOnStartPage(){
        tableRates.openPage();
        tableRates.goToLinkEur();
    }

    @Step
    public void checkMinRateForBuying(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForBuying();
        tableRates.getResultForBuying();
        double actual = tableRates.findMinRateForBuyingActual();
        double expected = tableRates.findMinResultForBuying();
        assertEquals(actual, expected);
    }

    @Step
    public void checkMinRayeForSelling(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForSelling();
        tableRates.getResultForSelling();
        double actual = tableRates.findMinRateForSellingActual();
        double expected = tableRates.findMinResultForSelling();
        assertEquals(actual, expected);
    }

    @Step
    public void checkMaxRateForBuying(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForBuying();
        tableRates.getResultForBuying();
        double actual = tableRates.findMaxRateForBuyingActual();
        double expected = tableRates.findMaxResultForBuying();
        assertEquals(actual, expected);
    }

    @Step
    public void checkMaxRateForSelling(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForSelling();
        tableRates.getResultForSelling();
        double actual = tableRates.findMaxRateForSellingActual();
        double expected = tableRates.findMaxResultForSelling();
        assertEquals(actual, expected);
    }

    @Step
    public void checkAverageForBuying(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForBuying();
        tableRates.getResultForBuying();
        double actual = tableRates.findAverageRateForBuyingActual();
        double expected = tableRates.findAverageResultForBuying();
        assertEquals(actual, expected);
    }

    @Step
    public void checkAverageForSelling(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForSelling();
        tableRates.getResultForSelling();
        double actual = tableRates.findAverageRateForSellingActual();
        double expected = tableRates.findAverageResultForSelling();
        assertEquals(actual, expected);
    }

    @Step
    public void checkOptimalForBuying(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForBuying();
        tableRates.getResultForBuying();
        double actual =tableRates.findMaxRateForBuyingActual();
        double expected = tableRates.findOptimalForBuying();
        assertEquals(actual, expected);
    }

    @Step
    public void checkOptimalForSelling(){
        tableRates.getMaxIndexResult();
        tableRates.getRatesForSelling();
        tableRates.getResultForSelling();
        double actual = tableRates.findMinRateForSellingActual();
        double expected = tableRates.findOptimalForSelling();
        assertEquals(actual, expected);
    }
}

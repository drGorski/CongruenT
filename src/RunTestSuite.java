import sContracts.ExchangeEnergyContract;
import testSC.TestExchangeEnergySC;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public class RunTestSuite {
    public static void main(String[] args){
        // smart contract and test classes
        TestExchangeEnergySC testEnergy = new TestExchangeEnergySC();
        ExchangeEnergyContract energySC = new ExchangeEnergyContract();
        // tests for energy exchange smart contract (with configurations)
        testEnergy.runTestSuite(energySC);
    }
}

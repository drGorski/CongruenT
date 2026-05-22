package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
import sContracts.TransactionGrid;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class TargetEqualsGrid implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((TransactionGrid) t).getTargetID() == ((TransactionGrid) t).getEnergySubnetID();
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}

package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class QuantityGreaterThanZero implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((Transaction) t).getQuantity() > 0;
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}

package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class SourceSurplusGreaterEqualQuantity implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((Transaction) t).getSourceSurplus() >= ((Transaction) t).getQuantity();
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}

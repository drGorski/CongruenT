package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
import sContracts.TransactionGrid;

/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class TargetNeedGreaterEqualQuantity implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((Transaction) t).getTargetNeed() >= ((Transaction) t).getQuantity();
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}

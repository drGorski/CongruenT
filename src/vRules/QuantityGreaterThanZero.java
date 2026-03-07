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
        if (((Transaction) t).getQuantity() > 0) {
            System.out.println("TRUE - QuantityGreaterThanZero");
            return true;
        } else {
            System.out.println("FALSE - QuantityGreaterThanZero");
            return false;
        }
    }
}

package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class TargetNeedGreaterEqualQuantity implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        if (((Transaction) t).getTargetNeed() >= ((Transaction) t).getQuantity()) {
            System.out.println("TRUE - TargetNeedGreaterEqualQuantity");
            return true;
        } else {
            System.out.println("FALSE - TargetNeedGreaterEqualQuantity");
            return false;
        }
    }
}

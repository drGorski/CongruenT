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
        if (((Transaction) t).getSourceSurplus() >= ((Transaction) t).getQuantity()) {
            System.out.println("TRUE - SourceSurplusGreaterEqualQuantity");
            return true;
        } else {
            System.out.println("FALSE - SourceSurplusGreaterEqualQuantity");
            return false;
        }
    }
}

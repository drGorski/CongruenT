package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
import sContracts.TransactionCross;

/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class SourceDiffersFromTarget implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((Transaction) t).getSourceID() != ((Transaction) t).getTargetID();
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}
package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class SourceDiffersFromTarget implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        if (((Transaction) t).getSourceID() != ((Transaction) t).getTargetID()) {
            System.out.println("TRUE - SourceDiffersFromTarget");
            return true;
        } else {
            System.out.println("FALSE - SourceDiffersFromTarget");
            return false;
        }
    }
}
package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.Transaction;
import sContracts.TransactionCross;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class SourceAndTargetCommunitiesDiffer implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        boolean result = ((TransactionCross) t).getSourceCommunityID() != ((TransactionCross) t).getTargetCommunityID();
        System.out.println(result + " - " + this.getClass().getTypeName());
        return result;
    }
}

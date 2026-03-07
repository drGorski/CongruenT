package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.TransactionCross;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class SourceAndTargetCommunitiesDiffer implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        if (((TransactionCross) t).getSourceCommunityID() != ((TransactionCross) t).getTargetCommunityID()) {
            System.out.println("TRUE - SourceAndTargetCommunitiesDiffer");
            return true;
        } else {
            System.out.println("FALSE - SourceAndTargetCommunitiesDiffer");
            return false;
        }
    }
}

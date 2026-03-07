package vRules;

import congruenT.AbstractTransaction;
import congruenT.VerificationRule;
import sContracts.TransactionGrid;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class TargetEqualsGrid implements VerificationRule {
    public boolean runRule(AbstractTransaction t){
        if (((TransactionGrid) t).getTargetID() == ((TransactionGrid) t).getEnergySubnetID()) {
            System.out.println("TRUE - TargetEqualsGrid");
            return true;
        } else {
            System.out.println("FALSE - TargetEqualsGrid");
            return false;
        }
    }
}

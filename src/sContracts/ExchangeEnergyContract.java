package sContracts;

import congruenT.AbstractConfigSC;
import congruenT.VerificationRule;
import vRules.*;
import java.util.ArrayList;

/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public final class ExchangeEnergyContract extends AbstractConfigSC {
    public ExchangeEnergyContract(){
        // verification rules
        rulesList.add(new SourceDiffersFromTarget());
        rulesList.add(new QuantityGreaterThanZero());
        rulesList.add(new SourceSurplusGreaterEqualQuantity());
        rulesList.add(new SourceAndTargetCommunitiesDiffer());
        rulesList.add(new TargetNeedGreaterEqualQuantity());
        rulesList.add(new TargetEqualsGrid());
        // configurations
        for (int i = 1; i <= 2 ; i++) configurations.add(new ArrayList<>());
        // configure rules for TransactionIn
        configurations.get(0).add(rulesList.get(0));
        configurations.get(0).add(rulesList.get(1));
        configurations.get(0).add(rulesList.get(2));
        // configure rules for TransactionGrid
        configurations.get(1).add(rulesList.get(0));
        configurations.get(1).add(rulesList.get(1));
        configurations.get(1).add(rulesList.get(2));
        configurations.get(1).add(rulesList.get(5));
        // configure rules for TransactionCross
        configurations.get(2).add(rulesList.get(3));
        configurations.get(2).add(rulesList.get(0));
        configurations.get(2).add(rulesList.get(1));
        configurations.get(2).add(rulesList.get(2));
        configurations.get(2).add(rulesList.get(4));
    }
    public boolean checkSC(TransactionGrid tr){
        boolean correct = false;
        for (VerificationRule vR : configurations.get(1)) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
    public boolean checkSC(TransactionCross tr){
        boolean correct = false;
        for (VerificationRule vR : configurations.get(2)) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}
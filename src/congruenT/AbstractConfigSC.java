package congruenT;

import java.util.List;
import java.util.ArrayList;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public abstract class AbstractConfigSC {
    protected List<VerificationRule> rulesList = new ArrayList<>();
    protected List<List<VerificationRule>> configurations = new ArrayList<>();
    public AbstractConfigSC(){
        configurations.add(new ArrayList<>());
    }
    public boolean checkSC(AbstractTransaction tr){
        boolean correct = false;
        for (VerificationRule vR : configurations.get(0)) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}

package congruenT;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public interface VerificationRule {
    public abstract boolean runRule(AbstractTransaction tr);
}


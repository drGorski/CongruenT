package congruenT;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public interface VerificationRule {
    boolean runRule(AbstractTransaction tr);
}


import static org.junit.Assert.*;


 public class FighterTest {

        @org.junit.Test
        void typeFighterPass()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("Sword_1");
            assertTrue(tester1.getfighterWeapon().matches("Joe_1"));
        }

        @org.junit.Test
        void typeFighterFailNoFirstCap()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("sword_1");
            assertTrue(tester1.getfighterWeapon().matches("Please follow instructions"));
        }

        @org.junit.Test
        void typeFighterRegexFailNoUnderScore()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("Sword1");
            assertTrue(tester1.getfighterWeapon().matches("Please follow instructions"));
        }

        @org.junit.Test
        void typeFighterRegexFailLetterAtEnd()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("Sword_Z");
            assertTrue(tester1.getfighterWeapon().matches("Please follow instructions"));
        }

        @org.junit.Test
        void typeFighterRegexFailSpecialLetterAtEnd()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("Sword_&");
            assertTrue(tester1.getfighterWeapon().matches("Please follow instructions"));
        }
 

        @org.junit.Test
        void typeFighterRegexFailSpaceInName()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterWeapon("Fire Sword_1");
            assertTrue(tester1.getfighterWeapon().matches("Please follow instructions"));
        }

        @org.junit.Test
        void fighterPowerPass()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterPower(8);
            assertTrue(tester1.getfighterPower()==8);
        }

        @org.junit.Test
        void fighterPowerFailMoreThan10()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterPower(11);
            assertTrue(tester1.getfighterPower()==-10);
        }
        @org.junit.Test
        void fighterPowernegative()
        {
            Fighter tester1 = new Fighter();
            tester1.setfighterPower(-1);
            assertTrue(tester1.getfighterPower()==-10);
        }
        @org.junit.Test
        void nameFighterNamePass()
        {
            Fighter tester1 = new Fighter();
            tester1.setName("Joe");
            assertTrue(tester1.getName().matches("Joe"));
        }

       @org.junit.Test
        void nameRightFighterName()
        {
            Fighter tester1 = new Fighter();
            tester1.setName("Joe");
            assertTrue(tester1.getName().matches("Joe"));
        }

        @org.junit.Test
        void nameFighterFailNoCaps()
        {
            Fighter tester1 = new Fighter();
            tester1.setName("joe");
            assertTrue(tester1.getName().matches("Please capitalize the first letter captial of your fighter"));
        }
        @org.junit.Test
        void nameFighterFailAllCaps()
        {
            Fighter tester1 = new Fighter();
            tester1.setName("JOE");
            assertTrue(tester1.getName().matches("Please only make the first letter captial of your fighter"));
        }

        @org.junit.Test
        void nameFighterWithNum()
        {
            Fighter tester1 = new Fighter();
            tester1.setName("J3n");
            assertTrue(tester1.getName().matches("Please follow instructions"));
        }
    }

public class Fighter
{
    public String fighterWeapon;
    public int fighterPower;
    public String name;

    public Fighter(String name, int fighterPower, String fighterWeapon)
    {
        setfighterWeapon(fighterWeapon);
        setfighterPower(fighterPower);
        setName(name);
    }

    public Fighter()
    {
        fighterWeapon =" ";
        fighterPower = 0;
        name = " ";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[A-Z][a-z]*"))
        {
            this.name = name;
        }
        else
            this.name = "Please follow instructions";
    }

    public int getfighterPower()
    {
        return fighterPower;
    }

    public void setfighterPower(int fighterPower) {
        if(fighterPower <= 10 && fighterPower >= 0)
        {
            this.fighterPower = fighterPower;
        }
        else
            this.fighterPower= -10;
    }

    public String getfighterWeapon() {
        return fighterWeapon;
    }

    public void setfighterWeapon(String fighterWeapon)
    {
        if(fighterWeapon.matches("[A-Z][a-z]*_[0-9]"))
        {
            this.fighterWeapon = fighterWeapon;
        }
        else
            this.fighterWeapon = "Please follow instructions";
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", Power=" + fighterPower +
                ", Weapon='" + fighterWeapon + '\'' +
                '}';
    }
}
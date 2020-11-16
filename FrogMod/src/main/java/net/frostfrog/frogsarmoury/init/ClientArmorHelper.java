package net.frostfrog.frogsarmoury.init;

import net.frostfrog.frogsarmoury.client.model.ArmorBaseModel;
import net.frostfrog.frogsarmoury.client.model.Barbaric;
import net.frostfrog.frogsarmoury.client.model.Crown;
import net.frostfrog.frogsarmoury.client.model.Royal;

class ClientArmorHelper
{
    static ArmorBaseModel Crown = new Crown();
    static ArmorBaseModel Barbaric = new Barbaric();
    static ArmorBaseModel Royal = new Royal();

    public static ArmorBaseModel Crown()
    {
        return Crown;
    }

    public static ArmorBaseModel Barbaric()
    {
        return Barbaric;
    }

    public static ArmorBaseModel Royal()
    {
        return Royal;
    }
}
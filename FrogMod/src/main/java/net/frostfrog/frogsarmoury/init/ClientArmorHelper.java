package net.frostfrog.frogsarmoury.init;

import net.frostfrog.frogsarmoury.client.model.ArmorBaseModel;
import net.frostfrog.frogsarmoury.client.model.Crown;

class ClientArmorHelper
{
    static ArmorBaseModel Crown = new Crown();

    public static ArmorBaseModel Crown()
    {
        return Crown;
    }
}
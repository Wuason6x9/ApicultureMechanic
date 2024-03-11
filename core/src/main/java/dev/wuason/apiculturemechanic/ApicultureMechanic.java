package dev.wuason.apiculturemechanic;

import dev.wuason.mechanics.mechanics.MechanicAddon;
import org.bukkit.plugin.java.JavaPlugin;

public final class ApicultureMechanic extends JavaPlugin implements MechanicAddon {

    private static ApicultureMechanic instance;




    public ApicultureMechanic(){
        instance = this;
    }

    @Override
    public void onEnable() {



    }

    @Override
    public void onDisable() {



    }

    @Override
    public String getIdentifier() {
        return "apiculturemechanic";
    }

    public static ApicultureMechanic getInstance() {
        return instance;
    }

}

package net.milkbowl.vault.permission;

import org.bukkit.entity.Player;
import org.bukkit.OfflinePlayer;

public class Permission {
    public boolean playerHas(String world, OfflinePlayer player, String permission) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean playerInGroup(Player player, String group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean playerInGroup(String world, OfflinePlayer player, String group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getPlayerGroups(Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getPlayerGroups(String world, OfflinePlayer player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

package ru.tehkode.permissions;

import org.bukkit.entity.Player;

public class PermissionManager {
    
    
    public boolean has(Player player, String permission) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public boolean has(Player player, String permission, String world) {
        throw new UnsupportedOperationException("Not implemented.");
    }


    public boolean has(String playerName, String permission, String world) {
        throw new UnsupportedOperationException("Not implemented.");
    }


    public PermissionUser getUser(String username) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}

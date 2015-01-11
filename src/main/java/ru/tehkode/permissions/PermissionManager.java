package ru.tehkode.permissions;

import org.bukkit.entity.Player;

import java.util.UUID;

public class PermissionManager {


    public boolean has(Player player, String permission) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public boolean has(Player player, String permission, String world) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public boolean has(UUID player, String permission, String world) {
        throw new UnsupportedOperationException("Not implemented.");
    }


    public PermissionUser getUser(UUID uid) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    // Legacy player name methods
    public boolean has(String playerName, String permission, String world) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public PermissionUser getUser(String username) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}

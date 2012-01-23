/*
 * dummypermscompat
 * Copyright (C) 2012 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.bananaco.bpermissions.api;

import de.bananaco.bpermissions.api.util.CalculableType;

/**
 * @author zml2008
 */
public class ApiLayer {

    public static String[] getGroups(String world, CalculableType type, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static boolean hasGroup(String world, CalculableType type, String name, String group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static boolean hasGroupRecursive(String world, CalculableType type, String name, String group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static boolean hasPermission(String world, CalculableType type, String name, String node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

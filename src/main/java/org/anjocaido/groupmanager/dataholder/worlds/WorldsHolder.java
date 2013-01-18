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

package org.anjocaido.groupmanager.dataholder.worlds;

import org.anjocaido.groupmanager.dataholder.OverloadedWorldHolder;
import org.anjocaido.groupmanager.permissions.AnjoPermissionsHandler;

public class WorldsHolder {

    public OverloadedWorldHolder getDefaultWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AnjoPermissionsHandler getWorldPermissions(String worldName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

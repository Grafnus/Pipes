package io.github.apfelcreme.Pipes.Pipe;

import org.bukkit.block.BlockFace;

/**
 * Copyright (C) 2016 Lord36 aka Apfelcreme
 * <p>
 * This program is free software;
 * you can redistribute it and/or modify it under the terms of the GNU General
 * Public License as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses/>.
 *
 * @author Lord36 aka Apfelcreme
 */
public class SimpleLocation {

    private final int x;
    private final int y;
    private final int z;

    public SimpleLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * returns the x coordinate
     *
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }


    /**
     * returns the y coordinate
     *
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }


    /**
     * returns the z coordinate
     *
     * @return the z coordinate
     */
    public int getZ() {
        return z;
    }

    /**
     * returns the location that faces the block location to the given side
     *
     * @param face a direction
     * @return the location that faces the block location to the given side
     */
    public SimpleLocation getRelative(BlockFace face) {
        switch (face) {
            case NORTH:
                return new SimpleLocation(x, y, z - 1);
            case EAST:
                return new SimpleLocation(x + 1, y, z);
            case SOUTH:
                return new SimpleLocation(x, y, z + 1);
            case WEST:
                return new SimpleLocation(x - 1, y, z);
            case UP:
                return new SimpleLocation(x, y + 1, z);
            case DOWN:
                return new SimpleLocation(x, y - 1, z);
        }
        return new SimpleLocation(x, y, z);
    }
}

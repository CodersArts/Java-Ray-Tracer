package edu.brandeis.cs.cosi155b.graphics;

import edu.brandeis.cs.cosi155b.scene.Vector;

/**
 * Represents the frame that the 3d scene is projected onto. This
 * frame implementation is simply parallel to the XY plane.
 *
 * Created by kahliloppenheimer on 9/2/15.
 */
public class SimpleFrame3D {
    private final Vector bottomLeftCorner;
    // Width and height in terms of coordinates in grid
    private final double width;
    private final double height;
    // Width in height in terms of how many pixels the previous width
    // and height are broken into
    private final int widthPx;
    private final int heightPx;
    private Color[][] pixels;

    public SimpleFrame3D(Vector bottomLeftCorner, double width, double height, int widthPx, int heightPx) {
        this.bottomLeftCorner = bottomLeftCorner;
        this.width = width;
        this.height = height;
        this.widthPx = widthPx;
        this.heightPx = heightPx;
        this.pixels = new Color[widthPx][heightPx];
    }

    public Vector getBottomLeftCorner() {
        return bottomLeftCorner;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    /**
     * Returns the pixel at the specified coordinate
     *
     * @param x
     * @param y
     * @return
     */
    public Color getPixel(int x, int y) {
        return pixels[x][y];
    }

    /**
     * Sets the pixel at the specified coorindate
     *
     * @param x
     * @param y
     * @param p
     */
    public void setPixel(int x, int y, Color c) {
        pixels[x][y] = c;
    }

    public int getWidthPx() {
        return widthPx;
    }

    public int getHeightPx() {
        return heightPx;
    }
}

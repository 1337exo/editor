package org.ulco;

abstract public class GraphicsObject {
    public GraphicsObject() {
        m_ID = ID.getID().nextID();
    }

    abstract public GraphicsObject copy();

    public int getID() {
        return m_ID;
    }

    abstract boolean isClosed(Point pt, double distance);

    public int size(){return 1;}

    public boolean isGroup(){return false;}

    abstract void move(Point delta);

    abstract public String toJson();

    abstract public String toString();

    protected int m_ID;
}

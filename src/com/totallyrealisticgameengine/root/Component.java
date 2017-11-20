package com.computerframe.root;
/*
 * A component is a visible piece of this project that is interacted with
 */
public class Component extends Object implements interactive {
	// Variables
	public int width;
	public int height;
	// Constructor
	public Component(String _name, int _width, int _height) {
		super(_name);
		this.width = _width;
		this.height = _height;
	}
	@Override
	public boolean touched() {
		return true;
	}

}

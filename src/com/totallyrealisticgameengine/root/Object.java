package com.computerframe.root;
/*
 * Root Class For This Project
 * ===========================
 * Every class will be an extension of this one!
 * It defines the basic properties of the project
 * 
 *
 */
public class Object {
	// Variables
	private String name;
	private boolean isVisible;
	private boolean isAlive = true;
	// Constructor
	public Object(String _name) {
		this.name = _name;
		this.isVisible = false;
	}
	// Set this object to a state
	public void setState(int state) {
		switch(state) {
		case STATE_VISIBLE:
			this.isVisible = true;
			break;
		case STATE_INVISIBLE:
			if(this.isVisible) {
				this.isVisible = false;
			}
		case STATE_DEAD:
			if(this.isAlive) {
				this.isAlive = false;
			}
		}
	}
	// List of existing states for this object
	public static final int STATE_VISIBLE = 0;
	public static final int STATE_INVISIBLE = 1;
	public static final int STATE_DEAD = 2;
	// Getters
	public boolean getAlive() {
		return this.isAlive;
	}
	public boolean getVisible() {
		return this.isVisible;
	}
	public String getName() {
		return this.name;
	}
}

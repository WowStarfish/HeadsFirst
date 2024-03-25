package com.company;

public abstract class Character {
    WeaponBehaviour weapon;

    public Character(){ }
    public abstract void display();

    public void fight() {
        weapon.weapon();
    }

}


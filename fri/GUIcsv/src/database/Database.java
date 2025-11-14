/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.HashMap;

import models.Gal;

/**
 *
 * @author mspriggs
 */
public class Database {

    /**
     * A HashMap to store Gal objects with gal ID as keys.
     */
    private static HashMap<String, Gal> gals;

    public static void addGal(String id, Gal gal) {
        gals.putIfAbsent(id, gal);
    }

    public static Gal getGal(String id) {
        return gals.get(id);
    }

}

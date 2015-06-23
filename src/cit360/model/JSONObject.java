/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

/**
 *
 * @author SexyMama
 */
class JSONObject {

    public JSONObject() {
        JSONObject myObj = new JSONObject();

        myObj.put(
                "firstname", "Kayla");
        myObj.put(
                "lastname", "Lindstrom");
        myObj.put(
                "role", "lister");

        System.out.print(myObj);
    }

    private void put(String lastname, String lindstrom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

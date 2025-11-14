/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mspriggs
 */
public class Gal {

    private final String id;
    private final String alias;
    private final String annotationDBObjectName;
    private final String annotationGoBiologicalProcess;
    private final String annotationGoCellularComponent;
    private final String annotationGoMolecularFunction;
    private final String annotationTaxon;

    /**
     *
     * Class to represent a GAL entry from a GAF file.
     * 
     * @param id
     * @param alias
     * @param annotationDBObjectName
     * @param annotationGoBiologicalProcess
     * @param annotationGoCellularComponent
     * @param annotationGoMolecularFunction
     * @param annotationTaxon
     */

    public Gal(String id, String alias, String annotationDBObjectName, String annotationGoBiologicalProcess,
            String annotationGoCellularComponent, String annotationGoMolecularFunction, String annotationTaxon) {
        this.id = id;
        this.alias = alias;
        this.annotationDBObjectName = annotationDBObjectName;
        this.annotationGoBiologicalProcess = annotationGoBiologicalProcess;
        this.annotationGoCellularComponent = annotationGoCellularComponent;
        this.annotationGoMolecularFunction = annotationGoMolecularFunction;
        this.annotationTaxon = annotationTaxon;
    }

}

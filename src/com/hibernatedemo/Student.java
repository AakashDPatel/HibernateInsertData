
package com.hibernatedemo;


/**
 *
 * @author Aakash
 */

public class Student {
    
 
    private int id;
    private String name;
    private String subject;
    private double fees;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the fees
     */
    public double getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(double fees) {
        this.fees = fees;
    }
    
}

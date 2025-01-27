/********************************************************************************
 * Name: Leonel Nguimatsia Tsobguim
 * E-Mail: leonelnguimatsia1997@gmail.com
 * Intellij: Version 03.06.2023
 * OpenJDK: Version 22
 * Beschreibung: NussKopf
 *
 ********************************************************************************/

package de.galileocomputing.schroedinger.java.kapitel11.objekt.speichern.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class NussKopf implements Externalizable {

    private String kopf;
    private  boolean nuss;

    public NussKopf() {

    }

    public NussKopf(String kopf, boolean nuss) {
        super();
        this.kopf = kopf;
        this.nuss = nuss;
    }

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings,
     * and arrays.
     *
     * @param out the stream to write the object to
     * @throws IOException Includes any I/O exceptions that may occur
     * @serialData Overriding methods should use this tag to describe
     * the data layout of this Externalizable object.
     * List the sequence of element types and, if possible,
     * relate the element to a public/protected field and/or
     * method of this Externalizable class.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(this.getKopf());
        out.writeBoolean(this.isNuss());
    }

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     *
     * @param in the stream to read data from in order to restore the object
     * @throws IOException            if I/O errors occur
     * @throws ClassNotFoundException If the class for an object being
     *                                restored cannot be found.
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        this.setKopf((String) in.readObject());
        this.setNuss(in.readBoolean());
    }

    public String getKopf() {
        return kopf;
    }

    public void setKopf(String kopf) {
        this.kopf = kopf;
    }

    public boolean isNuss() {
        return nuss;
    }

    public void setNuss(boolean nuss) {
        this.nuss = nuss;
    }
}

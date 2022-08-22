package org.academiadecodigo.hackathon.exceptions;

import org.academiadecodigo.hackathon.errors.ErrorMessage;

/**
 * Thrown to indicate that an association still exists
 */
public class AssociationExistsException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public AssociationExistsException() {
        super(ErrorMessage.ASSOCIATION_EXISTS);
    }
}
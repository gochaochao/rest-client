package org.wiztools.restclient;

/**
 *
 * @author schandran
 */
public class XMLException extends RuntimeException{
    public XMLException(String msg){
        super(msg);
    }
    
    public XMLException(String msg, Throwable t){
        super(msg, t);
    }
}
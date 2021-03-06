package in.co.rays.project4.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 *
 * @author Laxman singh
 
 *
 */

public class ApplicationException extends Exception {

    /**
     
     *            : Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }

}

//@version 1.0
/** 
 * PROJECT  : ?���? ?���? ?��로젝?��
 * NAME  :  NotExistException.java
 * DESC  :  �??�� ?��?��?���? ?��?�� 경우 발생?��?��?�� ?��?��?�� ?��?�� ?��?�� ?��?��?��
 * 
 * @author  
*/
package exception;

public class NotExistException extends Exception{
	public NotExistException(){}
	public NotExistException(String message){
		super(message);
	}
}

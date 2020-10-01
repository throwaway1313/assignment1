package cse360assignment02;

/**
* A program implementing a machine that allows you to add, 
* subtract, and get the current value
*
* @author  Mikey Richards
* @version 1.0
* @since   1.0
*/
public class AddingMachine {
  private int total;
  
  /**
  * The constructor for an AddingMachine. total is set to zero for clarity,
  * but java performs this operation automatically
  *
  * @since  1.0
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Unimplemented function to return the current value of total. Always returns 0.
   *
   * @return 0
   * @since  1.0
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * Unimplemented function to add a value to total. 
   *
   * @param value	Value to add to total. Unused.
   * @since  1.0
   */
  public void add (int value) {
  }

  /**
   * Unimplemented function to subtract a value from total. 
   *
   * @param value	Value to subtract from total. Unused.
   * @since  1.0
   */
  public void subtract (int value) {
  }

  /**
   * Unimplemented function to print all transactions performed. Always returns "".
   *
   * @return ""
   * @since  1.0
   */
  public String toString () {
    return "";
  }

  /**
   * Unimplemented function. No behavior specified.
   *
   * @since  1.0
   */
  public void clear() {
  }
}
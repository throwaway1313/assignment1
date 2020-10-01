package cse360assignment02;

/**
* A program implementing a machine that allows you to add, 
* subtract, and get the current value. It also allows you to
* see a log of all transactions that have occurred.
*
* @author  Mikey Richards
* @version 1.1
* @since   1.0
*/
public class AddingMachine {
  private int total;
  private String transactions = "0";
  
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
   * Returns the current value of total.
   *
   * @return The current value of total
   * @since  1.0
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds a value to total and logs the transaction.
   *
   * @param value	Value to add to total.
   * @since  1.0
   */
  public void add (int value) {
	  total += value;
	  transactions += " + " + value;
  }

  /**
   * Subtracts a value from total and logs the transaction.
   *
   * @param value	Value to subtract from total.
   * @since  1.0
   */
  public void subtract (int value) {
	  total -= value;
	  transactions += " - " + value;
  }

  /**
   * Prints all transactions performed.
   *
   * @return The list of transactions so far, with all operators and values spaced.
   * @since  1.0
   */
  public String toString () {
    return transactions;
  }

  /**
   * Unimplemented function. No behavior specified.
   *
   * @since  1.0
   */
  public void clear() {
  }
}
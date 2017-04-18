package com.ygz.learn.app.integration.batch;

/**
 * Unit test for simple App.
 */
public class SpringQtzJobWriteMeathod {
	private static int counter = 0;  
    /** Message */
    private String message;

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    public void execute()
            throws Exception {
    	 counter++;  
         System.out.println("第 " + counter +" 次，hello"+message); 
    }

}

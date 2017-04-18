package com.ygz.learn.app.integration.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Unit test for simple App.
 */
public class WriteTasklet implements Tasklet {

    /** Message */
    private String message;

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
            throws Exception {
        System.out.println(message);
        return RepeatStatus.FINISHED;
    }

}

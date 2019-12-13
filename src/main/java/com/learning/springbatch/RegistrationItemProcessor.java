package com.learning.springbatch;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;

import com.learning.springbatch.model.Registration;

public class RegistrationItemProcessor implements ItemProcessor<Registration, Registration> {

	private ExecutionContext executionContext;

	@Override
	public Registration process(Registration result) throws Exception {
		System.out.println("Processing result :" + result);
		this.executionContext.putInt( "i_ThoseRows", this.executionContext.getInt( "i_ThoseRows", 0 ) + 1 );
		return result;
	}

	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		this.executionContext = stepExecution.getExecutionContext();
	}

	@AfterStep
	public void afterStep(StepExecution stepExecution) {
		System.out.println("Number of 'Those rows': " + this.executionContext.getInt("i_ThoseRows", 0));
	}
}

package com.learning.springbatch;

import java.util.regex.Pattern;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.learning.springbatch.model.Registration;

public class RegistrationFieldSetMapper implements FieldSetMapper<Registration>{

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
	
	public Registration mapFieldSet(FieldSet fieldSet) throws BindException {
		Registration result = new Registration();

		result.setId(Long.parseLong(fieldSet.readString(0)));
		result.setName(fieldSet.readString(1));
		result.setAge(Long.parseLong(fieldSet.readString(2)));
		if(isValid(fieldSet.readString(3))){
		result.setEmail(fieldSet.readString(3));
		}else{
			return null;
		}
		
		
		return result;
	}

}

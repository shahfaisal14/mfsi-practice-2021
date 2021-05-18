package mfsi.learnmvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employe")
public class EmployeeController {

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<?> GetAll() {
		ResponseEntity<?> response = new ResponseEntity<Object>(null, HttpStatus.OK);
		return response;
	}

}

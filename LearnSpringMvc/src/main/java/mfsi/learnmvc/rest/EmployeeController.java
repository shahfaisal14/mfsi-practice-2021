package mfsi.learnmvc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mfsi.learnmvc.dto.EmployeeDto;
import mfsi.learnmvc.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	  private Logger log = LoggerFactory.getLogger(FileController.class);

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		ResponseEntity<?> response = new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		log.debug("Response {}", response);
		log.info("getAll called with no args");
		return response;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody EmployeeDto dto) {
		ResponseEntity<?> response = new ResponseEntity<>(service.save(dto), HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<?> search(@RequestParam(value = "id") Integer id) {
		ResponseEntity<?> response = new ResponseEntity<>(service.search(id), HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@RequestBody EmployeeDto dto) {
		ResponseEntity<?> response = new ResponseEntity<>(service.update(dto), HttpStatus.OK);
		return response;
	}

}

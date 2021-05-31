package mfsi.learnmvc.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {
	
	@Value("${app.file.location}")
	private String fileLocation;
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws IOException{
		File myFile = new File(fileLocation + file.getOriginalFilename());
		myFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(myFile);
		fos.write(file.getBytes());
		fos.close();
		return new ResponseEntity<>("file uploaded successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam("file") MultipartFile file) throws IOException{
		Path myPath = Paths.get(fileLocation + file.getOriginalFilename());
		boolean fileDeleted = Files.deleteIfExists(myPath);
		  if (fileDeleted) {
	            System.out.println("File deleted");
	        } else {
	            System.out.println("File does not exist");
	        }
		return null;
	}

}

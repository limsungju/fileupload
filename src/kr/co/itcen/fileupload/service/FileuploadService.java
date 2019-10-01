package kr.co.itcen.fileupload.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileuploadService {

	public String restore(MultipartFile multipartFile) {
		String url = "";
		
		if(multipartFile == null) {
			return url;
		}
		
		String originalFilename = multipartFile.getOriginalFilename();
		
		String saveFileName = generateSaveFilename(originalFilename.substring(originalFilename.lastIndexOf(".")+1));
				
		long fileSize = multipartFile.getSize(); // bite단위
		
		System.out.println("########################" + originalFilename);
		System.out.println("########################" + saveFileName);
		System.out.println("########################" + fileSize);
		
		return url;
	}

	private String generateSaveFilename(String extName) {
		String filename = "";
		
		Calendar calendar = Calendar.getInstance();
		filename += calendar.get(Calendar.YEAR);
		filename += calendar.get(Calendar.MONTH);
		filename += calendar.get(Calendar.DATE);
		filename += calendar.get(Calendar.HOUR);
		filename += calendar.get(Calendar.MINUTE);
		filename += calendar.get(Calendar.SECOND);
		filename += calendar.get(Calendar.MILLISECOND);
		filename += ("." + extName);
		
		return filename;
	}
	
}

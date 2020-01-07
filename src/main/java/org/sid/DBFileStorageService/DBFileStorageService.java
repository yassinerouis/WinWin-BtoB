/*package org.sid.DBFileStorageService;
import org.sid.entities.Services;
import org.sid.dao.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DBFileStorageService {
    @Autowired
    private ServiceRepository service;
    public Services storeFile(MultipartFile file) {
        // Normalize file name
       // String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters


            //Services dbFile = new Services(fileName, file.getContentType(), file.getBytes());

          //  return ServiceRepository.save(dbFile);
        } catch (IOException ex) {

        }
    }

    public Services getFile(String fileId) {

    }

}*/

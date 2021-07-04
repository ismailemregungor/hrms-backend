package ieg.hrms.core.utilities.images.cloudinary;

import ieg.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;
import java.util.Map;

public interface ImageUploadService {

    DataResult<Map> uploadImageFile(MultipartFile imageFile);

}

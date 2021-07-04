package ieg.hrms.core.utilities.images.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.ErrorDataResult;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploadManager implements ImageUploadService {

    private Cloudinary cloudinary;

    @Autowired
    public ImageUploadManager() {
        super();
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "cloudinary-ieg",
                "api_key", "672381531289531",
                "api_secret", "rVlTzdNgyWq2ou-7jhIdbNAbwQI"));
    }

    @Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> resultMap = (Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(resultMap);
        } catch (IOException ioException) {

            ioException.printStackTrace();

        }
        return new ErrorDataResult<Map>();
    }
}

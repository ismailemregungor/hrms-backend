package ieg.hrms.business.concretes;

import ieg.hrms.business.abstracts.ImageCVService;
import ieg.hrms.core.utilities.images.cloudinary.ImageUploadService;
import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.core.utilities.results.SuccessDataResult;
import ieg.hrms.core.utilities.results.SuccessResult;
import ieg.hrms.dataAccess.abstracts.ImageCVDao;
import ieg.hrms.entities.concretes.ImageCV;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;

@Service
public class ImageCVManager implements ImageCVService {

    private ImageCVDao imageCVDao;
    private ImageUploadService imageUploadService;

    public ImageCVManager(ImageCVDao imageCVDao, ImageUploadService imageUploadService) {
        super();
        this.imageCVDao = imageCVDao;
        this.imageUploadService = imageUploadService;
    }

    @Override
    public Result add(ImageCV imageCV, MultipartFile multipartFile) {
        Map<String, String> uploadImage = this.imageUploadService.uploadImageFile(multipartFile).getData();
        imageCV.setImageUrl(uploadImage.get("url"));
        this.imageCVDao.save(imageCV);
        return new SuccessResult("Image has been added.");
    }

    @Override
    public Result update(ImageCV imageCV) {
        this.imageCVDao.save(imageCV);
        return new SuccessResult("Image has been updated.");
    }

    @Override
    public Result delete(int id) {
        this.imageCVDao.deleteById(id);
        return new SuccessResult("Image has been deleted.");
    }

    @Override
    public DataResult<List<ImageCV>> getAll() {
        return new SuccessDataResult<List<ImageCV>>(this.imageCVDao.findAll());
    }

    @Override
    public DataResult<ImageCV> getById(int id) {
        return new SuccessDataResult<ImageCV>(this.imageCVDao.getById(id));
    }

    @Override
    public DataResult<ImageCV> getByJobSeekerId(int id) {
        return new SuccessDataResult<ImageCV>(this.imageCVDao.getByJobSeekerId(id));
    }
}

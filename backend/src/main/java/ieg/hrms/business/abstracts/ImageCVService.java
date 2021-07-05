package ieg.hrms.business.abstracts;

import ieg.hrms.core.utilities.results.DataResult;
import ieg.hrms.core.utilities.results.Result;
import ieg.hrms.entities.concretes.ImageCV;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface ImageCVService {

    Result add(ImageCV imageCV, MultipartFile multipartFile);

    Result update(ImageCV imageCV);

    Result delete(int id);

    DataResult<List<ImageCV>> getAll();

    DataResult<ImageCV> getById(int id);

    DataResult<ImageCV> getByJobSeekerId(int id);

}

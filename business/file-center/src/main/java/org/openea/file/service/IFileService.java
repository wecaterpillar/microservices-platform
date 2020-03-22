package org.openea.file.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import org.openea.common.model.PageResult;
import org.openea.file.model.FileInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件service
 *
 * @author 作者 owen E-mail: 624191343@qq.com
*/
public interface IFileService extends IService<FileInfo> {
	FileInfo upload(MultipartFile file ) throws Exception;

	PageResult<FileInfo> findList(Map<String, Object> params);

	void delete(String id);
}

package org.openea.generator.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import org.openea.common.model.PageResult;
import org.springframework.stereotype.Service;


@Service
public interface SysGeneratorService extends IService {
     PageResult queryList(Map<String, Object> map);

     Map<String, String> queryTable(String tableName);

     List<Map<String, String>> queryColumns(String tableName);

     byte[] generatorCode(String[] tableNames);
}

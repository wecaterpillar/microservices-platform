package org.openea.search.service;

import com.alibaba.fastjson.JSONObject;
import org.openea.common.model.PageResult;
import org.openea.search.model.SearchDto;

/**
 * @author zlt
 * @date 2019/4/24
 */
public interface ISearchService {
    /**
     * StringQuery通用搜索
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @return
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto);
}

package org.openea.search.service;

import org.openea.common.model.PageResult;
import org.openea.search.model.SearchDto;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;


public interface ISearchService {
    /**
     * StringQuery通用搜索
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @return
     */
    PageResult<JsonNode> strQuery(String indexName, SearchDto searchDto) throws IOException;
}

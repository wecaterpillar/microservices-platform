package org.openea.search.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.openea.common.model.PageResult;
import org.openea.es.utils.SearchBuilder;
import org.openea.search.model.SearchDto;
import org.openea.search.service.ISearchService;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 通用搜索
 *
 * @author zlt
 * @date 2019/4/24
 */
@Service
public class SearchServiceImpl implements ISearchService {
    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    public SearchServiceImpl(ElasticsearchRestTemplate elasticsearchRestTemplate) {
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
    }

    /**
     * StringQuery通用搜索
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @return
     */
    @Override
    public PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto) throws IOException {
        return SearchBuilder.builder(elasticsearchRestTemplate, indexName)
                .setStringQuery(searchDto.getQueryStr())
                .addSort(searchDto.getSortCol(), SortOrder.DESC)
                .setIsHighlight(searchDto.getIsHighlighter())
                .getPage(searchDto.getPage(), searchDto.getLimit());
    }
}

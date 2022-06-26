package org.openea.search.client.feign.fallback;

import org.openea.common.model.PageResult;
import org.openea.search.client.feign.SearchService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * searchService降级工场
 *
 */
@Slf4j
public class SearchServiceFallbackFactory implements FallbackFactory<SearchService> {
    @Override
    public SearchService create(Throwable throwable) {
        return (indexName, searchDto) -> {
            log.error("通过索引{}搜索异常:{}", indexName, throwable);
            return PageResult.<JsonNode>builder().build();
        };
    }
}

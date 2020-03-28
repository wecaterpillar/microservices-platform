package org.openea.search.client.feign.fallback;

import com.alibaba.fastjson.JSONObject;
import org.openea.common.model.PageResult;
import org.openea.search.client.feign.SearchService;
import feign.hystrix.FallbackFactory;
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
            return PageResult.<JSONObject>builder().build();
        };
    }
}

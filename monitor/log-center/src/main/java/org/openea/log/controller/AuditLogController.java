package org.openea.log.controller;

import org.openea.common.model.PageResult;
import org.openea.search.client.service.IQueryService;
import org.openea.search.model.SearchDto;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 审计日志
 *
 */
@RestController
public class AuditLogController {
    private final IQueryService queryService;

    public AuditLogController(IQueryService queryService) {
        this.queryService = queryService;
    }

    @ApiOperation(value = "审计日志全文搜索列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页起始位置", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "分页结束位置", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "queryStr", value = "搜索关键字", dataType = "String")
    })
    @GetMapping(value = "/auditLog")
    public PageResult<JsonNode> getPage(SearchDto searchDto) {
        searchDto.setIsHighlighter(true);
        searchDto.setSortCol("timestamp");
        return queryService.strQuery("audit-log-*", searchDto);
    }
}

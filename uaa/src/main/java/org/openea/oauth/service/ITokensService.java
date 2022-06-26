package org.openea.oauth.service;

import org.openea.common.model.PageResult;
import org.openea.oauth.model.TokenVo;

import java.util.Map;


public interface ITokensService {
    /**
     * 查询token列表
     * @param params 请求参数
     * @param clientId 应用id
     */
    PageResult<TokenVo> listTokens(Map<String, Object> params, String clientId);
}

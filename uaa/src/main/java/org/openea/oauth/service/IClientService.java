package org.openea.oauth.service;

import org.openea.common.model.PageResult;
import org.openea.common.model.Result;
import org.openea.common.service.ISuperService;
import org.openea.oauth.model.Client;

import java.util.Map;

/**
 * @author zlt
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}

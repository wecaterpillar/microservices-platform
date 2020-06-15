package org.openea.log.service;

import org.openea.log.model.Audit;

/**
 * 审计日志接口
 *
 * @author zlt
 * @date 2020/2/3
 */
public interface IAuditService {
    void save(Audit audit);
}

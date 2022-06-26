package org.openea.log.service;

import org.openea.log.model.Audit;

/**
 * 审计日志接口
 *
 */
public interface IAuditService {
    void save(Audit audit);
}

package com.whaler.oasys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whaler.oasys.model.entity.PermissionEntity;
import com.whaler.oasys.model.param.PermissionParam;

public interface PermissionService
extends IService<PermissionEntity> {
    void insertPermissionEntity(PermissionParam permissionParam);
}

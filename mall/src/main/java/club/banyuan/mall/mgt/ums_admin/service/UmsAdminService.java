package club.banyuan.mall.mgt.ums_admin.service;

import club.banyuan.mall.mgt.ums_admin.entity.UmsAdmin;

import java.util.List;

public interface UmsAdminService {

    void saveAdmin(UmsAdmin umsAdmin);

    int deleteAdmin(Long id);

    int updateAdmin(Long id);

    List<UmsAdmin> getUmsAdminList();

    List<UmsAdmin> getUmsAdminListByPage(String keyword, Integer pageNum, Integer pageSize);




}

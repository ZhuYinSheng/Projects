package club.banyuan.mall.mgt.ums_admin.service.impl;

import club.banyuan.mall.mgt.ums_admin.dao.UmsAdminDao;
import club.banyuan.mall.mgt.ums_admin.entity.UmsAdmin;
import club.banyuan.mall.mgt.ums_admin.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminDao umsAdminDao;

    @Override
    public void saveAdmin(UmsAdmin umsAdmin) {
        if (umsAdmin.getId() == 0) {
            umsAdminDao.insert(umsAdmin);
        } else {
            umsAdminDao.updateByPrimaryKey(umsAdmin);
        }
    }

    @Override
    public int deleteAdmin(Long id) {
        return umsAdminDao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateAdmin(UmsAdmin umsAdmin) {
        return umsAdminDao.updateByPrimaryKey(umsAdmin);
    }

    @Override
    public List<UmsAdmin> getUmsAdminList() {
        return umsAdminDao.getUmsAdminList();
    }

    @Override
    public List<UmsAdmin> getUmsAdminListByPage(String keyword, Integer pageNum, Integer pageSize) {
        return umsAdminDao.getUmsAdminListByPage(keyword, (pageNum-1) * 10, pageSize);
    }
}

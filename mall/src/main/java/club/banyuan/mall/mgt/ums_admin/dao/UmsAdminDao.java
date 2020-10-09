package club.banyuan.mall.mgt.ums_admin.dao;

import club.banyuan.mall.mgt.ums_admin.entity.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    List<UmsAdmin> getUmsAdminList();

    List<UmsAdmin> getUmsAdminListByPage(@Param("keyword") String keyword, @Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

}
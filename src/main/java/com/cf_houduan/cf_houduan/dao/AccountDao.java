package com.cf_houduan.cf_houduan.dao;
        import com.cf_houduan.cf_houduan.entity.AccountEntity;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    AccountEntity getById(Integer id);
}

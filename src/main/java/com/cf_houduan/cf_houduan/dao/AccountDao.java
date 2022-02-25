package com.cjcwecha.cjcwecha.dao;
        import com.cjcwecha.cjcwecha.entity.AccountEntity;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    AccountEntity getById(Integer id);
}

package io.github.touchsun.tdispatch.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.touchsun.tdispatch.core.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据访问层
 *
 * @author lee
 * @since 2023/6/2 8:51
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    
}

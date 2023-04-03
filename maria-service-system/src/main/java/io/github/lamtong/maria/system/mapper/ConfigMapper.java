/*
Copyright 2023 the original author, Lam Tong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package io.github.lamtong.maria.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.lamtong.maria.domain.entity.Config;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统配置服务实体映射器.
 *
 * @author Lam Tong
 * @version 0.0.1
 * @since 0.0.1
 */
@Mapper
public interface ConfigMapper extends BaseMapper<Config> {

}

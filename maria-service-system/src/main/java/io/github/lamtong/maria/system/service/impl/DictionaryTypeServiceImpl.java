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

package io.github.lamtong.maria.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.lamtong.maria.domain.entity.DictionaryType;
import io.github.lamtong.maria.system.mapper.DictionaryTypeMapper;
import io.github.lamtong.maria.system.service.DictionaryTypeService;
import org.springframework.stereotype.Service;

/**
 * 数据字典类型服务接口实现类.
 *
 * @author Lam Tong
 * @version 0.0.1
 * @since 0.0.1
 */
@Service
public class DictionaryTypeServiceImpl extends ServiceImpl<DictionaryTypeMapper, DictionaryType>
        implements DictionaryTypeService {

}

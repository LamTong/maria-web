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

package io.github.lamtong.maria.constant;

/**
 * 响应返回类型相关常量定义.
 *
 * @author Lam Tong
 * @version 0.0.1
 * @since 0.0.1
 */
public final class ContentTypeConstant {

    /**
     * 响应类型为 {@code JPEG} 图片
     */
    public static final String IMAGE_JPEG_VALUE = "image/jpeg";

    /**
     * 响应类型为 {@code JSON}
     */
    public static final String JSON_VALUE = "application/json";

    /**
     * 响应类型为 {@code JSON} 且字符集为 {@code UTF-8}
     */
    public static final String JSON_VALUE_UTF_8 = "application/json;charset=UTF-8";

    private ContentTypeConstant() {
    }

}

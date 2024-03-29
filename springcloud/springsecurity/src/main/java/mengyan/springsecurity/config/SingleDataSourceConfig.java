/**
 * Copyright 2018-2020 huatech
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mengyan.springsecurity.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 多数据源配置，多数据源配置因为和单数据源冲突，所以现在默认版本删除了多数据源配置
 * <p>
 *
 * @author guoxb
 * @Date 2022/11/20 21:58
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"mengyan.springsecurity.modular.*.mapper"})
public class SingleDataSourceConfig {

}


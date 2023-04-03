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

package io.github.lamtong.maria.socket.listener;

import io.github.lamtong.maria.constant.ServiceRocket;
import io.github.lamtong.maria.domain.message.MariaMessage;
import io.github.lamtong.maria.socket.handler.WebSocketHandler;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 监听 {@link ServiceRocket#TOPIC_ELASTIC_JOB_DEMO} 主题消息并广播推送消息.
 *
 * @author Lam Tong
 * @version 0.0.1
 * @since 0.0.1
 */
@SuppressWarnings(value = {"AlibabaClassNamingShouldBeCamel"})
@Service
@RocketMQMessageListener(consumerGroup = ServiceRocket.GROUP_ELASTIC_JOB_DEMO,
        topic = ServiceRocket.TOPIC_ELASTIC_JOB_DEMO,
        consumeMode = ConsumeMode.CONCURRENTLY,
        messageModel = MessageModel.CLUSTERING)
public class RocketMQListenerImpl4Job implements RocketMQListener<MariaMessage> {

    private static final Logger logger = LoggerFactory.getLogger(RocketMQListenerImpl4Job.class);

    @Override
    public void onMessage(MariaMessage message) {
        if (logger.isInfoEnabled()) {
            logger.info("Received message: [{}].", message);
        }
        WebSocketHandler.broadcast(message.getMessage());
    }

}

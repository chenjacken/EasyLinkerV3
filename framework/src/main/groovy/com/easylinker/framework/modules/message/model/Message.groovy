package com.easylinker.framework.modules.message.model

import com.easylinker.framework.common.model.AbstractModel

import javax.persistence.Entity

/**
 * Created by admin on 2019/6/11 10:20
 *
 * 系统内部提示消息
 */

@Entity
class Message extends AbstractModel {

    /**
     * 消息类型
     */
    private String msgType

    /**
     * 消息触发者
     */
    private String producer

    /**
     * 消息内容
     */
    private String msgContent
    /**
     * 状态
     */
    private Integer state
}

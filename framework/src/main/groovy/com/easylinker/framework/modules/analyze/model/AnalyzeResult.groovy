package com.easylinker.framework.modules.analyze.model

import com.easylinker.framework.common.model.AbstractModel

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author wwhai* @date 2019/6/12 22:34
 * @email:751957846 @qq.com
 * 瞅啥瞅？代码拿过来我看看有没有BUG。
 *
 */
@Entity
class AnalyzeResult extends AbstractModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id
}
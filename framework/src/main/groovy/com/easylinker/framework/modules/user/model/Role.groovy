package com.easylinker.framework.modules.user.model

import com.easylinker.framework.common.model.AbstractModel

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToOne

@Entity
class Role extends AbstractModel {
    private String name
    private String info
    @ManyToOne(fetch = FetchType.LAZY)
    private AppUser appUser


    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getInfo() {
        return info
    }

    void setInfo(String info) {
        this.info = info
    }

    AppUser getAppUser() {
        return appUser
    }

    void setAppUser(AppUser appUser) {
        this.appUser = appUser
    }
}

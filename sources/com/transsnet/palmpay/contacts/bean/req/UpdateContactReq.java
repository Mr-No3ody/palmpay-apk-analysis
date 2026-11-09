package com.transsnet.palmpay.contacts.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class UpdateContactReq {
    private String alias;
    private String contactsMemberId;
    private String isFavourite;

    public String getAlias() {
        return this.alias;
    }

    public String getContactsMemberId() {
        return this.contactsMemberId;
    }

    public String getIsFavourite() {
        return this.isFavourite;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setContactsMemberId(String contactsMemberId) {
        this.contactsMemberId = contactsMemberId;
    }

    public void setIsFavourite(String isFavourite) {
        this.isFavourite = isFavourite;
    }
}

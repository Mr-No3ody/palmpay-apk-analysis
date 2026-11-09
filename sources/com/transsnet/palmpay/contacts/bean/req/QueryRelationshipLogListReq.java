package com.transsnet.palmpay.contacts.bean.req;

import com.transsnet.palmpay.core.bean.req.CommonPageListReq;

/* JADX INFO: loaded from: classes3.dex */
public class QueryRelationshipLogListReq extends CommonPageListReq {
    public String bindingMemberId;

    public QueryRelationshipLogListReq() {
        super(1, 100);
    }
}

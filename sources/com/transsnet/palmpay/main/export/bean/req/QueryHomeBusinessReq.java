package com.transsnet.palmpay.main.export.bean.req;

import com.transsnet.palmpay.core.bean.req.GetMsgByTypeReq;
import com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryHomeBusinessReq {
    public GetMsgByTypeReq msgByRuleReq;
    public QueryUnReadMsgCntReq msgUnReadReq;
    public List<String> queryTypeList;

    public QueryHomeBusinessReq() {
        ArrayList arrayList = new ArrayList();
        this.queryTypeList = arrayList;
        arrayList.add("1");
        this.queryTypeList.add("2");
        this.queryTypeList.add("3");
        this.queryTypeList.add("4");
    }

    public QueryHomeBusinessReq(String... strArr) {
        ArrayList arrayList = new ArrayList();
        this.queryTypeList = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
    }
}

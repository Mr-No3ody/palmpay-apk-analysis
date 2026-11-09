package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryFamilyAccountRspV2 extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public List<CloseContactBeanV2> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }
}

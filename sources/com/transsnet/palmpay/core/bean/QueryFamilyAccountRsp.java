package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryFamilyAccountRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public List<CloseContactBean> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }
}

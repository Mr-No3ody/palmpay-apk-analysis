package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PalmZoneRewardsList {
    public int curPage;
    public List<ListBean> list;
    public int pageSize;
    public int total;
    public int totalPage;

    public static class ListBean {
        public Integer payStatus;
        public String productName;
        public String remark;
        public String taskName;
        public String type;
        public long winningTime;
    }
}

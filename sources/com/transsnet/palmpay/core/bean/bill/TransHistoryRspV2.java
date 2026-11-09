package com.transsnet.palmpay.core.bean.bill;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TransHistoryRspV2 extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public ExtraData extData;
        public List<TransHistoryItemBean> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }

    public static class ExtraData {
        public long beginTime;
        public long endTime;
        public long firstBillTime;
    }
}

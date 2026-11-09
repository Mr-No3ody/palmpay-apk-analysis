package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GetRecentMerchantsResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public List<ListDataBean> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }

    public static class ListDataBean {
        public String memberId;
        public String merchantName;
        public String merchantNo;
        public String phone;
        public String snNo;
    }
}

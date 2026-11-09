package com.transsnet.mtn.sdk.http.resp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TransactionResp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String amount;
        public String category;
        public String date;
        public String narration;
        public String type;
    }
}

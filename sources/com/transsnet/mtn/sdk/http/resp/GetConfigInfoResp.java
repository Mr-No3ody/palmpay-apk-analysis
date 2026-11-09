package com.transsnet.mtn.sdk.http.resp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GetConfigInfoResp extends CommonResult {
    public DataBean data;

    public static class BankBean {
        public static String bankCode;
        public static String bankName;
        public static String bgColor;
        public static String logo;
    }

    public static class DataBean {
        public String agreeUrl;
        public String agreeUrlOperator;
        public List<BankBean> bankList;
        public String countryCode;
        public String merchantName;
    }
}

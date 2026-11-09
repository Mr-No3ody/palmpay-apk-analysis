package com.transsnet.palmpay.main.export.bean.rsp;

import com.google.gson.annotations.SerializedName;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GetPointFlowRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public ExtDataBean extData;
        public List<ListBean> list;
        public int pageSize;
        public int total;
        public int totalPage;

        public static class ExtDataBean {

            @SerializedName("C")
            public int pointIn;

            @SerializedName("D")
            public int pointOut;
        }

        public static class ListBean {
            public int accountAmount;
            public String businessChannel;
            public String businessType;
            public long claimTime;
            public long createTime;
            public String dcType;
            public int drCrAmount;
            public long expireTime;
            public String loyaltyOrderId;
            public long obtainTime;
            public String outOrderNo;
            public String outOrderType;
            public String payId;
            public String remark;
            public String transOrderType;
        }
    }
}

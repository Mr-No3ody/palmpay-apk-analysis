package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BuyEarlyRefundOrderDetailRsp extends CommonResult implements Serializable {
    public DataBean data;

    public static class DataBean implements Serializable {
        public long amount;
        public String bankName;
        public String bankUrl;
        public long beginTime;
        public String cardNo;
        public long createTime;
        public long endTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public int f27369id;
        public String memberId;
        public String memberName;
        public String orderNo;
        public String payId;
        public String payRouteId;
        public String payTypeName;
        public int payerAccountType;
        public String payerCardNo;
        public String remark;
        public int status;
        public String statusDesc;
        public String subPayId;
        public String transactionId;
        public long updateTime;
    }
}

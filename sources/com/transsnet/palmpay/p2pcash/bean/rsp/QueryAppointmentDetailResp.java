package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class QueryAppointmentDetailResp extends CommonResult {
    public static final int REFUNDING = 20;
    public static final int REFUND_FAILED = 22;
    public static final int REFUND_SUCCESSFUL = 21;
    public DataBean data;

    public static class DataBean {
        public String balanceOrderNo;
        public String bookingCode;
        public long bookingEndTime;
        public long bookingMoney;
        public long bookingStartTime;
        public boolean changeAmountType;
        public long chronologyBeginTime;
        public long chronologyEndTime;
        public long completionTime;
        public long createTime;
        public long depositMoney;
        public long finishTime;
        public double latitude;
        public double longitude;
        public String merchantAccount;
        public String merchantId;
        public String merchantName;
        public String merchantPhone;
        public boolean missType;
        public String networkAddress;
        public String orderNo;
        public int orderStatus;
        public int payStatus;
        public long systemTime;
        public String type;
    }
}

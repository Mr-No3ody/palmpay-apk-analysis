package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryAppointmentHistoryResp extends CommonResult {
    public static final int AFTER_BOOKING_TIME = 7;
    public static final int AT_BOOKING_TIME = 6;
    public static final int A_ACCEPT_BEFORE_CLOSE_ORDER = 15;
    public static final int A_CLOSE_ORDER = 14;
    public static final int BALANCE_TO_BE_PAID = 9;
    public static final int BEFORE_BOOKING_TIME = 5;
    public static final int BOOKING_PROCESSING = 0;
    public static final int C_CLOSE_ORDER = 2;
    public static final int ORDER_PENDING = 1;
    public static final int ORDER_RECEIVED = 4;
    public static final int ORDER_SUCCESS = 13;
    public static final int OVERTIME_CLOSE_ORDER = 3;
    public static final int SYSTEM_CLOSE_ORDER_10 = 10;
    public static final int SYSYTEM_CLOSE_ORDER_4 = 8;
    public DataBean data;

    public static class DataBean {
        public List<ListBean> list;
    }

    public static class ListBean {
        public String bookingCode;
        public long bookingEndTime;
        public long bookingMoney;
        public long bookingStartTime;
        public boolean changeAmountType;
        public long depositMoney;
        public double latitude;
        public double longitude;
        public String merchantId;
        public String merchantName;
        public String merchantPhone;
        public boolean missType;
        public String networkAddress;
        public String orderNo;
        public int orderStatus;
        public int payStatus;
        public long systemTime;
    }
}

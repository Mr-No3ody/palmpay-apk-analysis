package com.transsnet.palmpay.credit.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class InstallmentsPayOrderData implements Serializable {
    public DataBean data;
    public String respCode;
    public String respMsg;

    public static class DataBean implements Serializable {
        public long createTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f28624id;
        public String memberAvatar;
        public String memberId;
        public String memberPhone;
        public String merchantMemberId;
        public String merchantName;
        public String merchantNo;
        public int orderAmount;
        public String orderNo;
        public int payStatus;
        public long updateTime;
    }
}

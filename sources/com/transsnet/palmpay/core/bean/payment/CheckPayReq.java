package com.transsnet.palmpay.core.bean.payment;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CheckPayReq implements Serializable {
    public String bankCardNo;
    public String bankName;
    public String channelTransactionId;
    public boolean endFlag;

    @Expose(deserialize = false, serialize = false)
    public long feeAmount;

    @Expose(deserialize = false, serialize = false)
    public long orderAmount;
    public String orderNo;
    public String orderType;
    public String otpReference;

    @Expose(deserialize = false, serialize = false)
    public long payAmount;
    public String payId;
    public String payRouteId;
    public int queryMaxSec;

    @Expose(deserialize = false, serialize = false)
    public boolean showPayAmount;
    public String subPayId;
    public String subTransTypeCode;
    public String token;

    @Expose(deserialize = false)
    public String transType;
    public String url;
    public String verifyCode;
    public int verifyMethod;
}

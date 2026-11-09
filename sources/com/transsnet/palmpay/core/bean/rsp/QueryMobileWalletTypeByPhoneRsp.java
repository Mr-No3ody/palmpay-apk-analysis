package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QueryMobileWalletTypeByPhoneRsp extends CommonResult {

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    public String operatorName;
}

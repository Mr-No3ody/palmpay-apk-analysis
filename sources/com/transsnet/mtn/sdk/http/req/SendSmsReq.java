package com.transsnet.mtn.sdk.http.req;

import com.google.gson.Gson;
import p373z.a;

/* JADX INFO: loaded from: classes3.dex */
public class SendSmsReq implements a<SendSmsReq> {
    public String accountNo;
    public String bankCode;
    public String loginId;
    public String pin;
    public String token;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p373z.a
    public SendSmsReq encrypt() {
        Gson gson = new Gson();
        SendSmsReq sendSmsReq = (SendSmsReq) gson.fromJson(gson.toJson(this), SendSmsReq.class);
        sendSmsReq.accountNo = p264r5.a.b(sendSmsReq.accountNo);
        sendSmsReq.loginId = p264r5.a.b(sendSmsReq.loginId);
        sendSmsReq.pin = p264r5.a.b(sendSmsReq.pin);
        return sendSmsReq;
    }
}

package com.transsnet.mtn.sdk.http.req;

import com.google.gson.Gson;
import p373z.a;

/* JADX INFO: loaded from: classes3.dex */
public class LoginReq implements a<LoginReq> {
    public String agreeUrl;
    public String bankCode;
    public String cardPin;
    public String loginId;
    public String password;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p373z.a
    public LoginReq encrypt() {
        Gson gson = new Gson();
        LoginReq loginReq = (LoginReq) gson.fromJson(gson.toJson(this), LoginReq.class);
        loginReq.cardPin = p264r5.a.b(loginReq.cardPin);
        loginReq.loginId = p264r5.a.b(loginReq.loginId);
        loginReq.password = p264r5.a.b(loginReq.password);
        return loginReq;
    }
}

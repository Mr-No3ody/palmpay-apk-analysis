package com.transsnet.palmpay.account.bean;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.MemberInfo;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpRsp {
    private String authCode;
    public int couponAreaType;
    public String fullName;
    public String jumpParams;
    public String jumpPath;
    public String jumpType;
    private String memberId;
    public MemberInfo memberInfo;
    public int okcWhileListUser;
    public boolean reportSignupSuccess;
    public Integer rewardAbLinkTo;
    public int securityDevice;
    public String securityDeviceTitle;
    public String teenagerContent;
    public int teenagerNeedAuth;
    public String teenagerTitle;
    public String teenagerToken;
    private String token;
    public String urlStep2;

    public String getAuthCode() {
        return this.authCode;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isNeedAddGuardian() {
        int i7 = this.teenagerNeedAuth;
        return (i7 == 1 || i7 == 2 || i7 == 3 || TextUtils.isEmpty(this.teenagerToken)) ? false : true;
    }

    public void setAuthCode(String str) {
        this.authCode = str;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}

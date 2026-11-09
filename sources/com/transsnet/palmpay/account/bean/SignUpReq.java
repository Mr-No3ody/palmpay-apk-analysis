package com.transsnet.palmpay.account.bean;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.AppUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpReq extends SignUpInReq {
    public String currency;
    public String invitQrCode;
    public String nickName;
    public String registerChannel;
    public String registerCode;
    public String registerPort;
    public String registerSoftware;

    public SignUpReq() {
        this.supplement = true;
        this.nickName = "";
        this.registerSoftware = AppUtils.getAppName() + "_Android";
        this.registerPort = "App";
        this.registerChannel = BaseApplication.getChannel();
    }
}

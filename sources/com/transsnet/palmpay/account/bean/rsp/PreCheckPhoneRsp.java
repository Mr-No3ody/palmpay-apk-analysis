package com.transsnet.palmpay.account.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PreCheckPhoneRsp {
    public String birthday;
    public boolean blacklist;
    public boolean canSkipAddress;
    public boolean canSkipFace;
    public boolean canSkipIndustry;
    public String detainmentPhoto;
    public String email;
    public Integer faceScene;
    public String firstName;
    public String gender;
    public boolean hasBvn;
    private boolean hasLoginPassword;
    public boolean hasNin;
    public boolean hasPin;
    public String headPortrait;
    public String idBonusTitle;
    public String lastName;
    public String memberStatus;
    public boolean memberUser;
    public String middleName;
    public String mobileMoneyAccountTier;
    public String mtnToken;
    public List<IdentityVerificationItem> nameVerifyMethods;
    public boolean needAddress;
    public boolean needFace;
    public boolean needFaceAfterVerifyNumber;
    public boolean needFaceAuthen;
    public boolean needIndustry;
    public boolean needNameVerify;
    public boolean needOtp;
    public String phone;
    public String phoneVerifyTip;
    public String selfUnfreezeMsg;
    public boolean sendOtpResult;
    public boolean supplement;
    private boolean useLoginPassword;
    public List<SecurityVerifyMethod> verifyMethodList;

    public boolean checkVerifyWithPsw() {
        return this.useLoginPassword;
    }

    public boolean isMtnNoVerifyValid() {
        return false;
    }

    public boolean isNeedExtraInfo() {
        return this.needIndustry || this.needAddress || this.needFace;
    }

    public boolean isNeedNameVerify() {
        return this.needNameVerify;
    }

    public boolean isSupportMultiVerifyMethods() {
        List<SecurityVerifyMethod> list = this.verifyMethodList;
        return list != null && list.size() > 1;
    }
}

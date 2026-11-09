package com.transsnet.palmpay.core.bean.req;

import Pa.i0;
import android.text.TextUtils;
import com.transsnet.palmpay.util.RegexUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SmsActionReq {
    public static final int SEND_HISTORY_DEL = 24;
    public static final int SEND_TYPE_EMAIL = 3;
    public static final int SEND_TYPE_SMS = 0;
    public static final int SEND_TYPE_USSD = 4;
    public static final int SEND_TYPE_VOICE = 1;
    public static final int SEND_TYPE_WHATSAPP = 2;
    public static final int SMS_TYPE_CHANGE_MOBILE = 3;
    public static final int SMS_TYPE_LOGIN = 2;
    public static final int SMS_TYPE_LOGIN_VERIFY_RISK_CONTROL_SMS = 13;
    public static final int SMS_TYPE_OK_CARD_VERIFY = 15;
    public static final int SMS_TYPE_RESET_PIN = 1;
    public static final int SMS_TYPE_SIGN_UP = 4;
    public int businessType;
    public int codeCount = 6;
    public String email;
    public String phoneNo;
    public String smsCode;
    public int voiceSms;

    public String getSecurityEmail() {
        if (TextUtils.isEmpty(this.email)) {
            return this.email;
        }
        return RegexUtils.isEmailMasked(this.email) ? this.email : i0.R(this.email);
    }
}

package com.transsnet.palmpay.core.bean;

import O6.c;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public class CommonResult {
    public static final String CODE_ACCOUNT_STATE_ERROR = "CFRONT_700013";
    public static final String CODE_ACCOUNT_SUSPENDED = "CFRONT_800008";
    public static final String CODE_APP_VERSION_LOW = "CFRONT_300058";
    public static final String CODE_APP_VERSION_LOW_2 = "CFRONT_300063";
    public static final String CODE_BALANCE_ACCOUNT_LOCK = "CFRONT_300061";
    public static final String CODE_BANK_ACCOUNT_NAME_NOT_MATCH_AUTHEN_NAME = "MEMBER_100004";
    public static final String CODE_BANK_CARD_NAME_NOT_MATCH_AUTHEN_NAME = "MEMBER_100009";
    public static final String CODE_FAIL = "FFFFFFFF";
    public static final String CODE_LOGIN_RISK_ERROR = "CFRONT_700000";
    public static final String CODE_LOGIN_WITH_TEMP_PIN = "CFRONT_300032";
    public static final String CODE_LOGIN_WITH_TEMP_PSW = "CFRONT_310032";
    public static final String CODE_OTHER_DEVICE_ONLINE = "CFRONT_000009";
    public static final String CODE_OUT_OF_TRANSACTION_LIMIT_ERROR = "CFRONT_700012";
    public static final String CODE_PHONE_REGISTERED = "CFRONT_300013";
    public static final String CODE_PIN_ERROR = "CFRONT_300001";
    public static final String CODE_PIN_LOCKED = "CFRONT_300024";
    public static final String CODE_POST_PAY_ERROR_ONE = "CFRONT_800045";
    public static final String CODE_POST_PAY_ERROR_THREE = "CFRONT_800047";
    public static final String CODE_POST_PAY_ERROR_TWO = "CFRONT_800046";
    public static final String CODE_PRE_SIGNUP_OUT_OF_DATE = "CFRONT_000011";
    public static final String CODE_REQUIRE_VERIFY_BVN = "CFRONT_800107";
    public static final String CODE_SHOW_COMMON_ERROR_DIALOG = "CFRONT_000019";
    public static final String CODE_SHOW_INVEST_ERROR_DIALOG = "CFRONT_000020";
    public static final String CODE_SMS_CODE_ERROR = "CFRONT_500000";
    public static final String CODE_SMS_CODE_OVER_ACQUIRED = "CFRONT_500001";
    public static final String CODE_SMS_TOKEN_EXPIRED = "CFRONT_500002";
    public static final String CODE_STATUS_DEVICE_ERROR = "CFRONT_200003";
    public static final String CODE_SUCCESS = "00000000";
    public static final String CODE_TOKEN_EXPIRED = "CFRONT_000002";
    public static final String CODE_USER_STATUS_ERROR = "CFRONT_300016";
    public static final String ERROR_MSG_CONNECT_TIMEOUT = "The request is being processed. Please wait for a while and try it again.";
    private boolean _fromCache;
    private String addition;
    private String respCode;
    private String respMsg;

    public CommonResult() {
        this(CODE_FAIL, "");
    }

    public String getRespCode() {
        return this.respCode;
    }

    public String getRespMsg() {
        return TextUtils.isEmpty(this.respMsg) ? this.respCode : this.respMsg;
    }

    public Dialog getRichTextErrorDialog(Context context) {
        if (TextUtils.isEmpty(this.addition) || context == null) {
            return null;
        }
        return h.u(context, this.addition, null, null, true);
    }

    public c getRichTextErrorDialogBuilder(Context context) {
        if (TextUtils.isEmpty(this.addition) || context == null) {
            return null;
        }
        return h.b(context, this.addition, null, null);
    }

    public boolean isParseFromCache() {
        return this._fromCache;
    }

    public boolean isPreSignUpOutOfDate() {
        return CODE_PRE_SIGNUP_OUT_OF_DATE.equals(getRespCode());
    }

    public boolean isSuccess() {
        return "00000000".equals(getRespCode());
    }

    public boolean isTokenExpired() {
        return CODE_TOKEN_EXPIRED.equals(getRespCode());
    }

    public void markParseFromCache(boolean fromCache) {
        this._fromCache = fromCache;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String toString() {
        return "respCode: " + this.respCode + " respMsg " + this.respMsg;
    }

    public CommonResult(String respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public Dialog getRichTextErrorDialog(Context context, @Nullable Function1<? super String, Unit> mainAction, @Nullable Function1<? super String, Unit> secondaryAction) {
        if (TextUtils.isEmpty(this.addition) || context == null) {
            return null;
        }
        return h.u(context, this.addition, mainAction, secondaryAction, true);
    }
}

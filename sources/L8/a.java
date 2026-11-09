package L8;

import C0.AbstractC0130w;
import C0.G;
import C0.U;
import F8.h;
import Pa.i0;
import V8.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(LogInActivity context, AbstractC0130w abstractC0130w, U u6, String str, Bundle bundle) {
        String str2;
        if (abstractC0130w == null || context == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        p131id.a aVar = new p131id.a(context);
        boolean z3 = false;
        boolean zC = androidx.core.content.d.a(context, "android.permission.USE_FINGERPRINT") != 0 ? false : aVar.f37572e.c();
        boolean zW = aVar.W();
        if (!TextUtils.isEmpty(str) && n.w(str)) {
            z3 = true;
        }
        String str3 = (zC && zW && z3) ? "supported" : "unsupported";
        if (!zC) {
            str2 = "no_hardware";
        } else if (!zC || zW) {
            str2 = (!zW || z3) ? null : "app_not_enabled";
        } else {
            str2 = "not_enrolled";
        }
        D3.a.J("login", "fingerprint", str3, str2, "login_page");
        if (!TextUtils.isEmpty(str) && n.w(str) && new p131id.a(context).W()) {
            if (u6 == null) {
                abstractC0130w.h(F8.d.fragment_login_verify_touch_id, bundle, null);
                return;
            } else {
                abstractC0130w.h(F8.d.fragment_login_verify_touch_id, bundle, u6);
                return;
            }
        }
        int i7 = F8.d.fragment_login_verify_pin;
        PreCheckPhoneRsp preCheckPhoneRsp = context.t;
        if (preCheckPhoneRsp != null && preCheckPhoneRsp.checkVerifyWithPsw()) {
            i7 = F8.d.fragment_login_verify_psw;
        }
        if (u6 == null) {
            abstractC0130w.h(i7, bundle, null);
        } else {
            abstractC0130w.h(i7, bundle, u6);
        }
    }

    public static Integer b(LogInActivity logInActivity, AbstractC0130w abstractC0130w, Bundle bundle) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        LogInReq logInReq;
        if (abstractC0130w != null && logInActivity != null && (preCheckPhoneRsp = logInActivity.t) != null) {
            boolean z3 = preCheckPhoneRsp.isNeedNameVerify() ? false : preCheckPhoneRsp.supplement;
            boolean z8 = preCheckPhoneRsp.needOtp && !logInActivity.u();
            boolean z10 = (!preCheckPhoneRsp.isNeedNameVerify() || (logInReq = logInActivity.f25888b) == null || logInReq.isVerifyTokenValid(false)) ? false : true;
            if (!z3) {
                LogInReq logInReq2 = logInActivity.f25888b;
                String str = logInReq2 != null ? logInReq2.faceToken : null;
                if (preCheckPhoneRsp.isSupportMultiVerifyMethods() && z8 && TextUtils.isEmpty(str)) {
                    return Integer.valueOf(F8.d.fragment_login_select_verify_method);
                }
                if (preCheckPhoneRsp.needFaceAuthen && TextUtils.isEmpty(str)) {
                    Integer faceScene = preCheckPhoneRsp.faceScene;
                    if (faceScene != null && bundle != null) {
                        Intrinsics.checkNotNullExpressionValue(faceScene, "faceScene");
                        bundle.putInt("extra_type", faceScene.intValue());
                    }
                    return Integer.valueOf(F8.d.fragment_login_with_face);
                }
                if (z8) {
                    return Integer.valueOf(F8.d.fragment_login_input_sms);
                }
                if (z10 || preCheckPhoneRsp.isNeedExtraInfo()) {
                    LogInReq logInReq3 = logInActivity.f25888b;
                    return (logInReq3 == null || !logInReq3.isVerifyTokenValid(false)) ? Integer.MAX_VALUE : null;
                }
            } else {
                if (z8) {
                    return Integer.valueOf(F8.d.fragment_login_input_sms);
                }
                if (z10 || preCheckPhoneRsp.isNeedExtraInfo()) {
                    LogInReq logInReq4 = logInActivity.f25888b;
                    return (logInReq4 == null || !logInReq4.isVerifyTokenValid(false)) ? Integer.MAX_VALUE : null;
                }
            }
        }
        return null;
    }

    public static final void c(View view) {
        if (view == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(-20.0f, 20.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setRepeatCount(4);
        translateAnimation.setRepeatMode(2);
        view.startAnimation(translateAnimation);
    }

    public static O6.d d(Context context, String str, Integer num, Drawable drawable, CharSequence charSequence, Integer num2, String str2, View.OnClickListener onClickListener, Integer num3, View.OnClickListener onClickListener2, l lVar, int i7) {
        Integer num4 = (i7 & 4) != 0 ? null : num;
        Drawable drawable2 = (i7 & 8) != 0 ? null : drawable;
        Integer num5 = (i7 & 32) != 0 ? null : num2;
        String str3 = (i7 & 64) != 0 ? null : str2;
        View.OnClickListener onClickListener3 = (i7 & 128) != 0 ? null : onClickListener;
        Integer num6 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num3;
        View.OnClickListener onClickListener4 = (i7 & 1024) != 0 ? null : onClickListener2;
        l lVar2 = (i7 & 2048) != 0 ? null : lVar;
        int i10 = (i7 & 4096) != 0 ? 1 : 2;
        if (context != null) {
            return n.O(context, i10, null, drawable2 == null ? str : null, drawable2 == null ? num4 : null, null, drawable2, drawable2 == null ? charSequence : null, num5, str3, onClickListener3, num6, null, onClickListener4, lVar2, false, 0, 8273970);
        }
        return null;
    }

    public static void e(TextView textView, String str) {
        Context context = BaseApplication.getContext();
        if (textView != null) {
            G.w(context, L6.b.ppColorPrimary, new SpanUtils().append(context.getString(h.ac_msg_sms_sent_to)).setForegroundColor(context.getColor(L6.b.ppColorTextNormal)).append(" " + i0.n(str, false) + Consts.DOT).setBold().setForegroundColor(context.getColor(L6.b.ppColorTextNormal)).append(context.getString(h.ac_wrong_number)), textView);
        }
    }

    public static void f(ViewEvent viewEvent) {
        String eventName;
        Map<String, Object> eventMap;
        if (viewEvent != null) {
            try {
                eventName = viewEvent.getEventName();
            } catch (Exception e10) {
                Log.e(Constants.LOGTAG, "trackAdjustEvent: ", e10);
                return;
            }
        } else {
            eventName = null;
        }
        if (eventName != null && eventName.length() != 0) {
            AdjustEvent adjustEvent = new AdjustEvent(eventName);
            if (viewEvent != null && (eventMap = viewEvent.getEventMap()) != null) {
                for (Map.Entry<String, Object> entry : eventMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && key.length() != 0 && value != null) {
                        adjustEvent.addCallbackParameter(key, value.toString());
                    }
                }
            }
            Adjust.trackEvent(adjustEvent);
        }
    }
}

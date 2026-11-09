package p297te;

import F6.d;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.emoji2.text.j;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.g;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCheckSignReq;
import com.transsnet.palmpay.main.export.bean.req.ThirdAuthorizationCodeReq;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import org.json.JSONObject;
import p294tb.RunnableC2060w;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThirdPartyMerchantActivity f42614a;

    public h(ThirdPartyMerchantActivity thirdPartyMerchantActivity) {
        this.f42614a = thirdPartyMerchantActivity;
    }

    @JavascriptInterface
    public void getBrandPalmPayRequest(String str, String str2) {
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42614a;
        thirdPartyMerchantActivity.f34995d.put("ID_1", str2);
        C0525w.f().getClass();
        thirdPartyMerchantActivity.runOnUiThread(new g(0, this, (MerchantOrderCheckSignReq) C0525w.d(str, MerchantOrderCheckSignReq.class)));
    }

    @JavascriptInterface
    public void goToHomePage() {
        i0.H(null);
    }

    @JavascriptInterface
    public void jumpToPage(String str) {
        Intent intentA = F.a(this.f42614a, str);
        if (intentA != null) {
            ActivityUtils.startActivity(intentA);
        }
    }

    @JavascriptInterface
    public void onBack() {
        this.f42614a.runOnUiThread(new RunnableC2060w(this, 2));
    }

    @JavascriptInterface
    public void pickContact(String str) {
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42614a;
        thirdPartyMerchantActivity.f34995d.put("ID_3", str);
        ARouter.getInstance().build("/contact/local").navigation(thirdPartyMerchantActivity, MessageEvent.EVENT_COIN_RAIN_FINISH);
    }

    @JavascriptInterface
    public void requestAuthorization(String str) {
        this.f42614a.runOnUiThread(new p7.h(9, this, (ThirdAuthorizationCodeReq) d0.l(ThirdAuthorizationCodeReq.class, str)));
    }

    @JavascriptInterface
    public void requestUploadUserInfo(String str, String str2) {
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42614a;
        boolean z3 = System.currentTimeMillis() > SPUtils.getInstance().getLong("last_upload_user_info", 0L) + 3600000;
        String string = SPUtils.getInstance().getString("last_upload_user_info_batch_no");
        boolean z8 = TextUtils.isEmpty(string) || z3;
        JSONObject jSONObject = new JSONObject();
        if (z8) {
            string = str;
        }
        try {
            jSONObject.put("batchNo", string);
            jSONObject.put("advertising_id", a.d().c());
            LocationRecord locationRecordF = a.d().f();
            if (locationRecordF != null) {
                jSONObject.put("latitude", locationRecordF.getLatitude());
                jSONObject.put("longitude", locationRecordF.getLongitude());
            } else {
                jSONObject.put("latitude", 9999.0d);
                jSONObject.put("longitude", 9999.0d);
            }
        } catch (Exception e10) {
            d.c(thirdPartyMerchantActivity.TAG, "onActivityResult1: ", e10);
        }
        thirdPartyMerchantActivity.f34992a.post(new j(this, 29, jSONObject, str2));
        if (z8) {
            SPUtils.getInstance().put("last_upload_user_info", System.currentTimeMillis());
            SPUtils.getInstance().put("last_upload_user_info_batch_no", str);
        }
    }

    @JavascriptInterface
    public void shareLink(String str) {
        this.f42614a.runOnUiThread(new g(29, this, str));
    }

    @JavascriptInterface
    public void showErrorInfo(String str) {
        this.f42614a.runOnUiThread(new p7.h(10, this, str));
    }

    @JavascriptInterface
    public void verifyPalmPayPin(String str) {
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42614a;
        thirdPartyMerchantActivity.f34995d.put("ID_2", str);
        ARouter.getInstance().build("/account/authentication").withInt("extra_mode", 3).navigation(thirdPartyMerchantActivity, MessageEvent.EVENT_CREATE_SAVINGS_PLAN);
    }
}

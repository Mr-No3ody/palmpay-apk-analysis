package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends DefaultReactActivityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPRNActivity f27742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(PPRNActivity pPRNActivity, PPRNActivity pPRNActivity2) {
        super(pPRNActivity2, "PalmPayGHApp", true);
        this.f27742a = pPRNActivity;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public final Bundle getLaunchOptions() {
        int i7 = PPRNActivity.f27676v;
        PPRNActivity pPRNActivity = this.f27742a;
        Bundle bundle = (Bundle) pPRNActivity.getIntent().getParcelableExtra("rn_key_params");
        if (bundle == null) {
            bundle = pPRNActivity.getIntent().getExtras();
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (TextUtils.isEmpty(pPRNActivity.f27677a)) {
            pPRNActivity.f27677a = pPRNActivity.getIntent().getStringExtra("rn_module_name");
        }
        Eb.a.a(pPRNActivity.getIntent(), null);
        p377z5.l.h(bundle, pPRNActivity.f27677a);
        bundle.putString(LogConstants.Autotrack.PAGE_NAME, !TextUtils.isEmpty(pPRNActivity.f27677a) ? pPRNActivity.f27677a : "home");
        if ("PalmPayPremium".equalsIgnoreCase(pPRNActivity.f27677a)) {
            p367ya.a aVarD = p367ya.a.d();
            String key = "palmPayPremiumHomeInfoData_" + BaseApplication.getInstance().getUser().getMemberId();
            MMKV mmkv = aVarD.f44149a;
            Intrinsics.checkNotNullParameter(mmkv, "mmkv");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean("emptyPremiumData", com.palmpay.lib.apm.launchcounter.util.d.m(mmkv, key) == null);
        }
        try {
            Object obj = bundle.get("useLoading");
            if (obj == null) {
                boolean zIsInWhiteList = Pa.W.f7052a.isInWhiteList(pPRNActivity.f27677a);
                pPRNActivity.f27678b = Boolean.valueOf(zIsInWhiteList);
                if (zIsInWhiteList) {
                    bundle.putBoolean("useLoading", true);
                }
            } else {
                pPRNActivity.f27678b = Pa.W.f7052a.convertToBoolean(obj);
            }
        } catch (Exception unused) {
        }
        bundle.putBoolean("isDarkMode", i0.T());
        F6.d.h("ReactNative", 3, "onCreate: page1:" + pPRNActivity.f27677a + " appName: " + bundle.getString("appName") + " useNativeLoading:" + bundle.get("useLoading"));
        return bundle;
    }
}

package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Pa.i0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;
import p297te.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "商户支付, sdk拉起支付页面", path = "/main/merchant_payment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/thirdpartymerchant/MerchantPaymentActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/SafeLockCheck;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMerchantPaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantPaymentActivity.kt\ncom/transsnet/palmpay/ui/activity/thirdpartymerchant/MerchantPaymentActivity\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,149:1\n116#2:150\n*S KotlinDebug\n*F\n+ 1 MerchantPaymentActivity.kt\ncom/transsnet/palmpay/ui/activity/thirdpartymerchant/MerchantPaymentActivity\n*L\n129#1:150\n*E\n"})
public final class MerchantPaymentActivity extends BaseActivity implements SafeLockCheck {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34976c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f34977d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34979b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getLauncher() {
            return MerchantPaymentActivity.f34977d;
        }

        public final void setLauncher(@Nullable String str) {
            MerchantPaymentActivity.f34977d = str;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public final boolean ignoreLock() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        f34977d = null;
        Uri referrer = getReferrer();
        f34977d = referrer != null ? referrer.getHost() : null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.f34979b || !BaseApplication.hasLogin()) {
            ActivityUtils.finishAllActivities();
            return;
        }
        showLoadingDialog(true);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new c(null, this), 2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (!BaseApplication.hasLogin()) {
            this.f34979b = false;
            i0.K(null, null);
            return;
        }
        this.f34979b = true;
        showLoadingDialog(true);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new c(null, this), 2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Uri data;
        String stringExtra;
        requestLayoutFullScreen();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("token")) != null) {
            this.f34978a = stringExtra;
        }
        if (TextUtils.isEmpty(this.f34978a)) {
            this.f34978a = getQueryParameter("token");
        }
        if (TextUtils.isEmpty(this.f34978a) && (data = getIntent().getData()) != null) {
            this.f34978a = data.getQueryParameter("token");
        }
        String str = this.f34978a;
        if (str != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, str);
            AutoTrackUtil.trackActivityProperties(this, map);
        }
    }
}

package com.transsnet.palmpay.credit.ui.activity;

import Ya.f;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mono.connect.kit.ConnectKitActivity;
import p068ec.d;
import p173ld.o;
import p184m8.b;
import p273rg.c;
import p284sb.C2016n;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/mono_connect_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/MonoConnectActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonoConnectActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f28694q0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28695Y = C2131j.b(new d(this, 15));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f28696Z = true;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f28697k0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f28698p0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_mono_connect;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(-1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        F6.d.c("MONOSDK", "onResume: ");
        boolean z3 = this.f28696Z;
        if (z3) {
            this.f28696Z = false;
        } else {
            if (z3 || !TextUtils.isEmpty(this.f28697k0)) {
                return;
            }
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        C2016n c2016n = new C2016n(this);
        b bVar = new b(11);
        C2016n c2016n2 = new C2016n(this);
        c.a().getClass();
        c.f41984f = new c();
        HashMap map = new HashMap();
        map.put("reference", "f8k1jg4a82ndb");
        c.a().f41989d = "f8k1jg4a82ndb";
        c.a().f41986a = c2016n;
        c.a().f41987b = c2016n2;
        c.a().f41988c = bVar;
        if (c.a().f41986a == null) {
            Log.e("mono.connect.widget", "onSuccess can't be null");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) ConnectKitActivity.class);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.SCHEME).authority("connect.mono.co").appendQueryParameter("version", "2023-12-14").appendQueryParameter("key", "live_pk_FN1t0fM8NI1s8l5gHiBq").appendQueryParameter("scope", "auth").appendQueryParameter(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new Gson().toJson((Object) null));
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtra("mono.connect.widget.url", builder.build().toString());
        startActivity(intent);
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Object value = this.f28695Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setBackButtonClickListener(new o(this, 26));
        this.f28698p0 = getIntent().getStringExtra("scene");
    }
}

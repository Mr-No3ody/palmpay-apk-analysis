package com.transsnet.palmpay.ui.activity;

import Ac.f;
import C0.G;
import N8.r;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.bean.CoinRainConfig;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068ec.d;
import p071ef.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/GetCoinRewardsActivity;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetCoinRewardsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCoinRewardsActivity.kt\ncom/transsnet/palmpay/ui/activity/GetCoinRewardsActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,194:1\n29#2:195\n*S KotlinDebug\n*F\n+ 1 GetCoinRewardsActivity.kt\ncom/transsnet/palmpay/ui/activity/GetCoinRewardsActivity\n*L\n63#1:195\n*E\n"})
public final class GetCoinRewardsActivity extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34458e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f34460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34462d = C2131j.b(new d(this, 1));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startAct(@NotNull Activity context, int i7, @Nullable CoinRainConfig coinRainConfig, @Nullable Uri uri) {
            String string;
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) GetCoinRewardsActivity.class).putExtra("coin_number", i7).putExtra("activity_code", coinRainConfig != null ? coinRainConfig.multiActivityCode : null);
            if (uri == null || (string = uri.toString()) == null) {
                string = "";
            }
            context.startActivity(intentPutExtra.putExtra("top_bg_url", string).putExtra("button_color", coinRainConfig != null ? coinRainConfig.buttonColor : null).putExtra("fail_url", coinRainConfig != null ? coinRainConfig.androidFailedLink : null));
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_get_coin;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        G.u(MessageEvent.EVENT_COIN_RAIN_FINISH, c.b());
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Uri uri;
        int intExtra = getIntent().getIntExtra("coin_number", 0);
        String stringExtra = getIntent().getStringExtra("activity_code");
        String stringExtra2 = getIntent().getStringExtra("top_bg_url");
        if (stringExtra2 != null) {
            try {
                uri = Uri.parse(stringExtra2);
            } catch (Exception unused) {
            }
        } else {
            uri = null;
        }
        this.f34460b = uri;
        this.f34459a = getIntent().getStringExtra("button_color");
        this.f34461c = getIntent().getStringExtra("fail_url");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "GIVEWAY2310-share1-ACTIVITY";
        }
        Intrinsics.e(stringExtra);
        ((P6.a) this.f34462d.getValue()).show();
        ((IApiMainService) Cc.a.f1353a.f39520b).getCoin(stringExtra, intExtra).k(p298tf.f.f42629b).i(b.a()).subscribe(new r(7, this, stringExtra));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}

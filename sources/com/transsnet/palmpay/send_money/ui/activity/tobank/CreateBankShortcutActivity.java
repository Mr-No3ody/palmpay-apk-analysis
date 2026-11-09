package com.transsnet.palmpay.send_money.ui.activity.tobank;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.camera.camera2.internal.P0;
import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.tobank.CreateBankShortcutActivity;
import com.transsnet.palmpay.util.ToastUtils;
import df.b;
import df.i;
import io.reactivex.internal.operators.flowable.m;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1798f;
import p147jf.a;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p208nf.d;
import p262r2.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/send/shortcut")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/tobank/CreateBankShortcutActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateBankShortcutActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33501e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f33504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33505d;

    public CreateBankShortcutActivity() {
        final int i7 = 0;
        this.f33502a = C2131j.b(new Function0(this) { // from class: xd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateBankShortcutActivity f43858b;

            {
                this.f43858b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CreateBankShortcutActivity createBankShortcutActivity = this.f43858b;
                switch (i7) {
                    case 0:
                        int i10 = CreateBankShortcutActivity.f33501e;
                        return (Button) createBankShortcutActivity.findViewById(e.result_left_btn);
                    default:
                        int i11 = CreateBankShortcutActivity.f33501e;
                        return (Button) createBankShortcutActivity.findViewById(e.result_right_btn);
                }
            }
        });
        final int i10 = 1;
        this.f33503b = C2131j.b(new Function0(this) { // from class: xd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateBankShortcutActivity f43858b;

            {
                this.f43858b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CreateBankShortcutActivity createBankShortcutActivity = this.f43858b;
                switch (i10) {
                    case 0:
                        int i11 = CreateBankShortcutActivity.f33501e;
                        return (Button) createBankShortcutActivity.findViewById(e.result_left_btn);
                    default:
                        int i12 = CreateBankShortcutActivity.f33501e;
                        return (Button) createBankShortcutActivity.findViewById(e.result_right_btn);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_create_shortcut;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i7 = b.f35920a;
        i iVar = p298tf.f.f42628a;
        a.a(timeUnit, "unit is null");
        a.a(iVar, "scheduler is null");
        io.reactivex.internal.operators.flowable.t tVarB = new m(3L, Math.max(0L, 0L), Math.max(0L, 1L), iVar).b(p071ef.b.a());
        p287se.d dVar = new p287se.d(new C1798f(this, 25), 21);
        retrofit2.adapter.rxjava2.d dVar2 = a.f38600d;
        c cVar = a.f38599c;
        io.reactivex.internal.operators.flowable.d dVar3 = new io.reactivex.internal.operators.flowable.d(tVarB, dVar);
        d dVar4 = new d(dVar2, a.f38601e, cVar);
        dVar3.c(dVar4);
        this.f33504c = dVar4;
    }

    public final boolean m() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Object systemService = getSystemService("shortcut");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
        ShortcutManager shortcutManagerF = X.b.f(systemService);
        shortcutManagerF.isRequestPinShortcutSupported();
        for (Object obj : shortcutManagerF.getPinnedShortcuts()) {
            Intrinsics.f(obj, "null cannot be cast to non-null type android.content.pm.ShortcutInfo");
            if ("Bank Transfer".equals(X.b.e(obj).getId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        d dVar = this.f33504c;
        if (dVar != null) {
            p225of.b.a(dVar);
        }
        this.f33504c = null;
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f33505d = true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f33505d) {
            this.f33505d = false;
            if (m()) {
                ToastUtils.showShort(getResources().getString(h.sm_successfully_add), new Object[0]);
            }
            l();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        Object value = this.f33503b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Button button = (Button) value;
        if (button != null) {
            final int i7 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: xd.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CreateBankShortcutActivity f43860b;

                {
                    this.f43860b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateBankShortcutActivity createBankShortcutActivity = this.f43860b;
                    switch (i7) {
                        case 0:
                            int i10 = CreateBankShortcutActivity.f33501e;
                            int i11 = p159kd.d.sm_widget_send_money;
                            try {
                                if (org.chromium.support_lib_boundary.util.b.O(createBankShortcutActivity)) {
                                    int i12 = Build.VERSION.SDK_INT;
                                    if (i12 >= 26 && createBankShortcutActivity.m()) {
                                        createBankShortcutActivity.l();
                                        ToastUtils.showShort(createBankShortcutActivity.getResources().getString(h.sm_shortcut_already_exists), new Object[0]);
                                        return;
                                    }
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setComponent(new ComponentName(createBankShortcutActivity.getPackageName(), "com.transsnet.palmpay.ui.activity.SplashActivity"));
                                    intent.setAction("com.transsnet.palmpay.intent.action.TRANS_TO_BANK_ACOUNT");
                                    P0 p3 = new P0();
                                    p3.f13246a = createBankShortcutActivity;
                                    p3.f13247b = "Bank Transfer";
                                    p3.f13249d = "Bank Transfer";
                                    PorterDuff.Mode mode = IconCompat.f16046k;
                                    p3.f13250e = IconCompat.b(createBankShortcutActivity.getResources(), createBankShortcutActivity.getPackageName(), i11);
                                    p3.f13248c = new Intent[]{intent};
                                    if (TextUtils.isEmpty((String) p3.f13249d)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr = (Intent[]) p3.f13248c;
                                    if (intentArr == null || intentArr.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    Intrinsics.checkNotNullExpressionValue(p3, "build(...)");
                                    Intent intentS = org.chromium.support_lib_boundary.util.b.s(createBankShortcutActivity, p3);
                                    Intrinsics.checkNotNullExpressionValue(intentS, "createShortcutResultIntent(...)");
                                    org.chromium.support_lib_boundary.util.b.a0(createBankShortcutActivity, p3, PendingIntent.getBroadcast(createBankShortcutActivity, 0, intentS, i12 >= 31 ? 33554432 : 0).getIntentSender());
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            int i13 = CreateBankShortcutActivity.f33501e;
                            createBankShortcutActivity.finish();
                            return;
                    }
                }
            });
        }
        Object value2 = this.f33502a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Button button2 = (Button) value2;
        if (button2 != null) {
            final int i10 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: xd.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CreateBankShortcutActivity f43860b;

                {
                    this.f43860b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateBankShortcutActivity createBankShortcutActivity = this.f43860b;
                    switch (i10) {
                        case 0:
                            int i11 = CreateBankShortcutActivity.f33501e;
                            int i12 = p159kd.d.sm_widget_send_money;
                            try {
                                if (org.chromium.support_lib_boundary.util.b.O(createBankShortcutActivity)) {
                                    int i13 = Build.VERSION.SDK_INT;
                                    if (i13 >= 26 && createBankShortcutActivity.m()) {
                                        createBankShortcutActivity.l();
                                        ToastUtils.showShort(createBankShortcutActivity.getResources().getString(h.sm_shortcut_already_exists), new Object[0]);
                                        return;
                                    }
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setComponent(new ComponentName(createBankShortcutActivity.getPackageName(), "com.transsnet.palmpay.ui.activity.SplashActivity"));
                                    intent.setAction("com.transsnet.palmpay.intent.action.TRANS_TO_BANK_ACOUNT");
                                    P0 p3 = new P0();
                                    p3.f13246a = createBankShortcutActivity;
                                    p3.f13247b = "Bank Transfer";
                                    p3.f13249d = "Bank Transfer";
                                    PorterDuff.Mode mode = IconCompat.f16046k;
                                    p3.f13250e = IconCompat.b(createBankShortcutActivity.getResources(), createBankShortcutActivity.getPackageName(), i12);
                                    p3.f13248c = new Intent[]{intent};
                                    if (TextUtils.isEmpty((String) p3.f13249d)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr = (Intent[]) p3.f13248c;
                                    if (intentArr == null || intentArr.length == 0) {
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    Intrinsics.checkNotNullExpressionValue(p3, "build(...)");
                                    Intent intentS = org.chromium.support_lib_boundary.util.b.s(createBankShortcutActivity, p3);
                                    Intrinsics.checkNotNullExpressionValue(intentS, "createShortcutResultIntent(...)");
                                    org.chromium.support_lib_boundary.util.b.a0(createBankShortcutActivity, p3, PendingIntent.getBroadcast(createBankShortcutActivity, 0, intentS, i13 >= 31 ? 33554432 : 0).getIntentSender());
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            int i14 = CreateBankShortcutActivity.f33501e;
                            createBankShortcutActivity.finish();
                            return;
                    }
                }
            });
        }
    }
}

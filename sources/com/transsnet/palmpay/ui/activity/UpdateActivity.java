package com.transsnet.palmpay.ui.activity;

import Ac.d;
import Ac.e;
import Ac.f;
import Ac.h;
import L6.b;
import Pa.i0;
import Pa.n0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.ui.activity.UpdateActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.GooglePlayInnerAppHelper;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import p054dd.n;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p367ya.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/update")
public class UpdateActivity extends BaseActivity implements CancelAdapt {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34600j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f34601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f34603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f34605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f34606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f34607g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34608i;

    public static boolean l(Context context) {
        if (c.c() && context != null) {
            MMKV mmkvB = c.b();
            int i7 = mmkvB.getInt("show_count", 0);
            long j6 = mmkvB.getLong("next_show_time", 0L);
            if (i7 < 3 && j6 < System.currentTimeMillis()) {
                try {
                    if ((context instanceof Activity) && !i0.W((Activity) context)) {
                        context = BaseApplication.getContext();
                    }
                    Intent intent = new Intent(context, (Class<?>) UpdateActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return true;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_update;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        this.f34608i = (TextView) findViewById(e.tvDownload);
        this.f34601a = (TextView) findViewById(e.textViewMessage);
        this.f34602b = (TextView) findViewById(e.textViewNote);
        this.f34603c = findViewById(e.textViewCancel);
        this.f34605e = findViewById(e.viewGap);
        this.f34606f = findViewById(e.textViewOk);
        this.f34607g = (ImageView) findViewById(e.imageViewHeader);
        this.f34604d = (TextView) findViewById(e.textViewTitle);
        final int i7 = 0;
        this.f34606f.setOnClickListener(new View.OnClickListener(this) { // from class: ge.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateActivity f37203b;

            {
                this.f37203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateActivity updateActivity = this.f37203b;
                switch (i7) {
                    case 0:
                        int i10 = UpdateActivity.f34600j;
                        updateActivity.getClass();
                        n0.g().s("FB_CLICK_UPDATE_APP");
                        i0.O(updateActivity);
                        if (!c.a()) {
                            updateActivity.finish();
                        } else {
                            ActivityUtils.finishAllActivities();
                        }
                        break;
                    default:
                        int i11 = UpdateActivity.f34600j;
                        updateActivity.getClass();
                        c.e(false);
                        updateActivity.finish();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f34603c.setOnClickListener(new View.OnClickListener(this) { // from class: ge.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateActivity f37203b;

            {
                this.f37203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateActivity updateActivity = this.f37203b;
                switch (i10) {
                    case 0:
                        int i11 = UpdateActivity.f34600j;
                        updateActivity.getClass();
                        n0.g().s("FB_CLICK_UPDATE_APP");
                        i0.O(updateActivity);
                        if (!c.a()) {
                            updateActivity.finish();
                        } else {
                            ActivityUtils.finishAllActivities();
                        }
                        break;
                    default:
                        int i12 = UpdateActivity.f34600j;
                        updateActivity.getClass();
                        c.e(false);
                        updateActivity.finish();
                        break;
                }
            }
        });
        this.f34607g.setImageResource(d.main_update_dialog_header);
        AppUpdate.VersionBean versionBeanD = c.d();
        this.f34602b.setText(versionBeanD.releaseNote);
        this.f34602b.setMovementMethod(new ScrollingMovementMethod());
        if (!TextUtils.isEmpty(versionBeanD.version)) {
            this.f34601a.setText(new SpanUtils().append(AppUtils.getAppName()).append(" ").append(versionBeanD.version).setForegroundColor(getColor(b.ppColorPrimary)).create());
        }
        if (!TextUtils.isEmpty(versionBeanD.apkLink)) {
            this.f34608i.setText(Html.fromHtml(getString(h.main_msg_download_apk), 0));
            this.f34608i.setVisibility(0);
            this.f34608i.setOnClickListener(new n(7, this, versionBeanD));
        }
        findViewById(e.viewContainer).setVisibility(0);
        if (!versionBeanD.isForce) {
            this.f34604d.setText(h.main_discover_new_version);
        } else {
            this.f34603c.setVisibility(8);
            this.f34605e.setVisibility(8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (c.a()) {
            ActivityUtils.finishAllActivities();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(p.transparent_60)));
        if (!c.b().getBoolean("isSilent", false) || GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext()) != 0) {
            m();
            return;
        }
        int i7 = SPUtils.getInstance().getInt("GP_OPERATE_VERSION", 0);
        int versionCode = BaseApplication.get().getVersionCode();
        if (i7 == versionCode) {
            m();
            return;
        }
        GooglePlayInnerAppHelper.INSTANCE.innerAppSmartUpdate(this);
        SPUtils.getInstance().put("GP_OPERATE_VERSION", versionCode);
        if (c.a()) {
            ActivityUtils.finishAllActivities();
        } else {
            finish();
        }
    }
}

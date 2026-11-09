package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.didiglobal.booster.instrument.ShadowTimer;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.util.ScreenUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IconicsDrawable f31308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31309h = 101;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f31310i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DialogInterface.OnDismissListener f31311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnClickListener f31312k;

    public t(Context context) {
        this.f31302a = context;
    }

    public final void a() {
        if (this.f31309h == 102) {
            this.f31306e = com.transsnet.palmpay.custom_view.r.cv_result_fail;
        }
        this.f31307f = com.transsnet.palmpay.custom_view.u.cv_animation_fail;
        this.f31303b = this.f31302a.getString(com.transsnet.palmpay.custom_view.v.cv_operation_fail);
    }

    public final void b() {
        if (this.f31309h == 102) {
            this.f31306e = com.transsnet.palmpay.custom_view.r.cv_result_success;
        }
        this.f31307f = com.transsnet.palmpay.custom_view.u.cv_result_success;
        this.f31303b = this.f31302a.getString(com.transsnet.palmpay.custom_view.v.cv_operation_success_all_caps);
    }

    public final void c(int i7) {
        this.f31304c = this.f31302a.getString(i7);
    }

    public final SuccessFailDialog d(int i7) {
        int i10 = this.f31309h;
        Context context = this.f31302a;
        SuccessFailDialog successFailDialog = i10 == 102 ? new SuccessFailDialog(context, com.transsnet.palmpay.custom_view.t.cv_layout_success_fail_v2_dialog) : new SuccessFailDialog(context, com.transsnet.palmpay.custom_view.t.cv_layout_success_fail_dialog);
        successFailDialog.setMessage(this.f31304c);
        successFailDialog.setIconId(this.f31306e);
        successFailDialog.setTitle(this.f31303b);
        successFailDialog.setIcon(this.f31308g);
        successFailDialog.setAnimationId(this.f31307f);
        successFailDialog.setButtonText(this.f31305d);
        successFailDialog.setNextListener(this.f31312k);
        successFailDialog.setOnCancelListener(null);
        successFailDialog.setOnDismissListener(this.f31311j);
        successFailDialog.setCountdownTimeMillis(this.f31310i);
        successFailDialog.show();
        long j6 = this.f31310i;
        if (j6 <= 0) {
            j6 = i7;
        }
        if (j6 > 0) {
            ShadowTimer shadowTimer = new ShadowTimer("\u200bcom.transsnet.palmpay.custom_view.dialog.SuccessFailDialog$Builder");
            shadowTimer.schedule(new s(this, shadowTimer, successFailDialog), j6);
        }
        Window window = successFailDialog.getWindow();
        if (this.f31309h == 102) {
            window.setDimAmount(0.0f);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (ScreenUtils.getScreenWidth() * 0.916f);
        window.setAttributes(attributes);
        return successFailDialog;
    }

    public final SuccessFailDialog e(boolean z3) {
        int i7 = 6000;
        if (!TextUtils.isEmpty(this.f31304c) && this.f31304c.length() < 20) {
            i7 = 3000;
        }
        if (!z3) {
            i7 = 0;
        }
        return d(i7);
    }
}

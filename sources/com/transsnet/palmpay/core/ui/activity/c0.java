package com.transsnet.palmpay.core.ui.activity;

import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayVerificationActivity f27744b;

    public /* synthetic */ c0(PayVerificationActivity payVerificationActivity, int i7) {
        this.f27743a = i7;
        this.f27744b = payVerificationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PayVerificationActivity payVerificationActivity = this.f27744b;
        switch (this.f27743a) {
            case 0:
                int i7 = PayVerificationActivity.f27688C;
                payVerificationActivity.finish();
                break;
            case 1:
                int i10 = PayVerificationActivity.f27688C;
                payVerificationActivity.r();
                payVerificationActivity.finish();
                break;
            case 2:
                int i11 = PayVerificationActivity.f27688C;
                payVerificationActivity.getClass();
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_PAY_ERROR_CFRONT_TCE));
                payVerificationActivity.finish();
                break;
            case 3:
                int i12 = PayVerificationActivity.f27688C;
                payVerificationActivity.finish();
                break;
            default:
                int i13 = PayVerificationActivity.f27688C;
                payVerificationActivity.getClass();
                if (BaseApplication.isNG()) {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                }
                payVerificationActivity.finish();
                break;
        }
    }
}

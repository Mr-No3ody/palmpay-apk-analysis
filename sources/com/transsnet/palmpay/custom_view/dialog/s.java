package com.transsnet.palmpay.custom_view.dialog;

import android.app.Activity;
import android.content.Context;
import com.didiglobal.booster.instrument.ShadowTimer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShadowTimer f31299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuccessFailDialog f31300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f31301c;

    public s(t tVar, ShadowTimer shadowTimer, SuccessFailDialog successFailDialog) {
        this.f31301c = tVar;
        this.f31299a = shadowTimer;
        this.f31300b = successFailDialog;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f31299a.cancel();
        Context context = this.f31301c.f31302a;
        if (!(context instanceof Activity) || ((Activity) context).isDestroyed()) {
            return;
        }
        SuccessFailDialog successFailDialog = this.f31300b;
        if (successFailDialog.isShowing()) {
            successFailDialog.dismiss();
        }
    }
}

package com.transsnet.adsdk.widgets.snackbar;

import android.content.Context;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25677a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnackBarRecycle f25678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Snackbar f25680d;

    public /* synthetic */ i(SnackBarRecycle snackBarRecycle, Context context, Snackbar snackbar) {
        this.f25678b = snackBarRecycle;
        this.f25679c = context;
        this.f25680d = snackbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25677a) {
            case 0:
                this.f25678b.lambda$createSnackBar$1(this.f25680d, this.f25679c, view);
                break;
            default:
                this.f25678b.lambda$createSnackBar$3(this.f25679c, this.f25680d, view);
                break;
        }
    }

    public /* synthetic */ i(SnackBarRecycle snackBarRecycle, Snackbar snackbar, Context context) {
        this.f25678b = snackBarRecycle;
        this.f25680d = snackbar;
        this.f25679c = context;
    }
}

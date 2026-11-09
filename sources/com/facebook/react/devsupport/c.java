package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21718b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f21717a = i7;
        this.f21718b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21717a) {
            case 0:
                ((AlertDialog) this.f21718b).dismiss();
                break;
            default:
                ((DevSupportManager.PausedInDebuggerOverlayCommandListener) this.f21718b).onResume();
                break;
        }
    }
}

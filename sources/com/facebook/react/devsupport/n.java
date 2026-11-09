package com.facebook.react.devsupport;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedBoxContentView f21739b;

    public /* synthetic */ n(RedBoxContentView redBoxContentView, int i7) {
        this.f21738a = i7;
        this.f21739b = redBoxContentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21738a) {
            case 0:
                RedBoxContentView.reportButtonOnClickListener$lambda$0(this.f21739b, view);
                break;
            case 1:
                RedBoxContentView.init$lambda$2(this.f21739b, view);
                break;
            default:
                RedBoxContentView.init$lambda$3(this.f21739b, view);
                break;
        }
    }
}

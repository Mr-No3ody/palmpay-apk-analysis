package W9;

import android.view.View;

/* JADX INFO: renamed from: W9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0722c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0723d f10625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0724e f10626c;

    public ViewOnClickListenerC0722c(C0724e c0724e, int i7, C0723d c0723d) {
        this.f10626c = c0724e;
        this.f10624a = i7;
        this.f10625b = c0723d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0724e c0724e = this.f10626c;
        int i7 = c0724e.f10628e;
        int i10 = this.f10624a;
        if (i7 == i10) {
            return;
        }
        this.f10625b.f4981a.onClick(view);
        c0724e.f10628e = i10;
        c0724e.notifyDataSetChanged();
    }
}

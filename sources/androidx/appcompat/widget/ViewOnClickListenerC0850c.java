package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0850c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12873b;

    public /* synthetic */ ViewOnClickListenerC0850c(Object obj, int i7) {
        this.f12872a = i7;
        this.f12873b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12872a) {
            case 0:
                ((p343x.a) this.f12873b).a();
                break;
            default:
                ((Toolbar) this.f12873b).collapseActionView();
                break;
        }
    }
}

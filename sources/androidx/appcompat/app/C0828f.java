package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0828f implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832j f12220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0830h f12221b;

    public C0828f(C0830h c0830h, C0832j c0832j) {
        this.f12221b = c0830h;
        this.f12220a = c0832j;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        C0830h c0830h = this.f12221b;
        DialogInterface.OnClickListener onClickListener = c0830h.f12259w;
        C0832j c0832j = this.f12220a;
        onClickListener.onClick(c0832j.f12281b, i7);
        if (c0830h.f12231G) {
            return;
        }
        c0832j.f12281b.dismiss();
    }
}

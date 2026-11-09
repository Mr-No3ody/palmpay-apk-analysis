package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829g implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f12222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0832j f12223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0830h f12224c;

    public C0829g(C0830h c0830h, AlertController$RecycleListView alertController$RecycleListView, C0832j c0832j) {
        this.f12224c = c0830h;
        this.f12222a = alertController$RecycleListView;
        this.f12223b = c0832j;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        C0830h c0830h = this.f12224c;
        boolean[] zArr = c0830h.f12229E;
        AlertController$RecycleListView alertController$RecycleListView = this.f12222a;
        if (zArr != null) {
            zArr[i7] = alertController$RecycleListView.isItemChecked(i7);
        }
        c0830h.f12233I.onClick(this.f12223b.f12281b, i7, alertController$RecycleListView.isItemChecked(i7));
    }
}

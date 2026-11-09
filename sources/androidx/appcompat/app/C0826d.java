package androidx.appcompat.app;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: androidx.appcompat.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0826d extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f12213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0830h f12214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826d(C0830h c0830h, ContextThemeWrapper contextThemeWrapper, int i7, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i7, R.id.text1, charSequenceArr);
        this.f12214b = c0830h;
        this.f12213a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i7, view, viewGroup);
        boolean[] zArr = this.f12214b.f12229E;
        if (zArr != null && zArr[i7]) {
            this.f12213a.setItemChecked(i7, true);
        }
        return view2;
    }
}

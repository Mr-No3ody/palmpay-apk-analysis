package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class K implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12695b;

    public /* synthetic */ K(Object obj, int i7) {
        this.f12694a = i7;
        this.f12695b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        switch (this.f12694a) {
            case 0:
                M m7 = (M) this.f12695b;
                m7.f12731w0.setSelection(i7);
                if (m7.f12731w0.getOnItemClickListener() != null) {
                    m7.f12731w0.performItemClick(view, i7, m7.f12728t0.getItemId(i7));
                }
                m7.dismiss();
                break;
            default:
                ((SearchView) this.f12695b).e(i7);
                break;
        }
    }
}

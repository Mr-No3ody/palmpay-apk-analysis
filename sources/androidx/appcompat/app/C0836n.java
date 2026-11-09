package androidx.appcompat.app;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: renamed from: androidx.appcompat.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836n implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0837o f12308a;

    public C0836n(AbstractActivityC0837o abstractActivityC0837o) {
        this.f12308a = abstractActivityC0837o;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        AbstractActivityC0837o abstractActivityC0837o = this.f12308a;
        AbstractC0841t delegate = abstractActivityC0837o.getDelegate();
        I i7 = (I) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(i7.f12144p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(i7);
        } else {
            boolean z3 = layoutInflaterFrom.getFactory2() instanceof I;
        }
        abstractActivityC0837o.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}

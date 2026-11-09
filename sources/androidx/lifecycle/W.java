package androidx.lifecycle;

import C0.C0127t;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public final class W implements SavedStateRegistry$SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0.d f17417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f17419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f17420d;

    public W(L0.d savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f17417a = savedStateRegistry;
        this.f17420d = C2131j.b(new C0127t(viewModelStoreOwner, 11));
    }

    public final void a() {
        if (this.f17418b) {
            return;
        }
        Bundle bundleA = this.f17417a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17419c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f17419c = bundle;
        this.f17418b = true;
    }

    @Override // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17419c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((X) this.f17420d.getValue()).f17421d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleSaveState = ((T) entry.getValue()).f17411e.saveState();
            if (!Intrinsics.c(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleSaveState);
            }
        }
        this.f17418b = false;
        return bundle;
    }
}

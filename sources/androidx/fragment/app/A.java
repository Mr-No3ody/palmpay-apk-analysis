package androidx.fragment.app;

import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.lifecycle.EnumC1203m;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements SavedStateRegistry$SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16946b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f16945a = i7;
        this.f16946b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        switch (this.f16945a) {
            case 0:
                AbstractActivityC0837o abstractActivityC0837o = (AbstractActivityC0837o) this.f16946b;
                abstractActivityC0837o.markFragmentsCreated();
                abstractActivityC0837o.mFragmentLifecycleRegistry.e(EnumC1203m.ON_STOP);
                return new Bundle();
            default:
                return ((Z) this.f16946b).c0();
        }
    }
}

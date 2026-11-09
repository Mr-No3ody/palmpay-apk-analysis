package androidx.appcompat.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;

/* JADX INFO: renamed from: androidx.appcompat.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0835m implements SavedStateRegistry$SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0837o f12307a;

    public C0835m(AbstractActivityC0837o abstractActivityC0837o) {
        this.f12307a = abstractActivityC0837o;
    }

    @Override // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        this.f12307a.getDelegate().getClass();
        return bundle;
    }
}

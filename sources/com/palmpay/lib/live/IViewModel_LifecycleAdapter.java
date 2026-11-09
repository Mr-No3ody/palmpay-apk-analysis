package com.palmpay.lib.live;

import androidx.lifecycle.E;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public class IViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IViewModel f23814a;

    public IViewModel_LifecycleAdapter(IViewModel iViewModel) {
        this.f23814a = iViewModel;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public final void callMethods(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m, boolean z3, E e10) {
        boolean z8 = e10 != null;
        IViewModel iViewModel = this.f23814a;
        if (z3) {
            if (!z8 || e10.a(4, "onAny")) {
                iViewModel.onAny(lifecycleOwner, enumC1203m);
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_CREATE) {
            if (!z8 || e10.a(2, "onCreate")) {
                iViewModel.onCreate(lifecycleOwner);
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_DESTROY) {
            if (!z8 || e10.a(1, "onDestroy")) {
                iViewModel.onDestroy();
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_START) {
            if (!z8 || e10.a(1, "onStart")) {
                iViewModel.onStart();
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_STOP) {
            if (!z8 || e10.a(1, "onStop")) {
                iViewModel.onStop();
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_RESUME) {
            if (!z8 || e10.a(1, "onResume")) {
                iViewModel.onResume();
                return;
            }
            return;
        }
        if (enumC1203m == EnumC1203m.ON_PAUSE) {
            if (!z8 || e10.a(1, "onPause")) {
                iViewModel.onPause();
            }
        }
    }
}

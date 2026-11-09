package com.gyf.immersionbar;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportRequestBarManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.customview.widget.e f23208a;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.customview.widget.e eVar = this.f23208a;
        if (eVar != null) {
            getResources().getConfiguration();
            eVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.customview.widget.e eVar = this.f23208a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        androidx.customview.widget.e eVar = this.f23208a;
        if (eVar != null) {
            eVar.d();
            this.f23208a = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.customview.widget.e eVar = this.f23208a;
        if (eVar != null) {
            eVar.e();
        }
    }
}

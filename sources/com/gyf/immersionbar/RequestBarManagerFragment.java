package com.gyf.immersionbar;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestBarManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.customview.widget.e f23207a;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.customview.widget.e eVar = this.f23207a;
        if (eVar != null) {
            getResources().getConfiguration();
            eVar.a();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.customview.widget.e eVar = this.f23207a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        androidx.customview.widget.e eVar = this.f23207a;
        if (eVar != null) {
            eVar.d();
            this.f23207a = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.customview.widget.e eVar = this.f23207a;
        if (eVar != null) {
            eVar.e();
        }
    }
}

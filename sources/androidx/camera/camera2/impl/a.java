package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.W;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ExtendableBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f13105a = C0992m0.b();

    public final void a(CaptureRequest.Key key, Object obj) {
        W w3 = W.f13996c;
        this.f13105a.insertOption(b.k(key), w3, obj);
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final Object build() {
        return new b(C1000q0.a(this.f13105a), 2);
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableConfig getMutableConfig() {
        return this.f13105a;
    }
}

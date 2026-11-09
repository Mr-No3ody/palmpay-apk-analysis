package androidx.camera.view;

import androidx.arch.core.util.Function;

/* JADX INFO: renamed from: androidx.camera.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1020a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14918b;

    public /* synthetic */ C1020a(Object obj, int i7) {
        this.f14917a = i7;
        this.f14918b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f14917a) {
            case 0:
                C1027h c1027h = (C1027h) this.f14918b;
                c1027h.f14937n = (ProcessCameraProviderWrapper) obj;
                c1027h.o();
                c1027h.n(null);
                break;
            default:
                ((i) this.f14918b).a(q.f15003b);
                break;
        }
        return null;
    }
}

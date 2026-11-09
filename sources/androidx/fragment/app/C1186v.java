package androidx.fragment.app;

import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1186v implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17218b;

    public /* synthetic */ C1186v(Object obj, int i7) {
        this.f17217a = i7;
        this.f17218b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f17217a) {
            case 0:
                Fragment fragment = (Fragment) this.f17218b;
                Object obj2 = fragment.mHost;
                return obj2 instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
            default:
                return (androidx.activity.result.h) this.f17218b;
        }
    }
}

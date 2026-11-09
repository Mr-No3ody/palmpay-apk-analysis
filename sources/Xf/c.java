package Xf;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import p135j0.l0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements DisposableHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11221c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f11219a = i7;
        this.f11220b = obj;
        this.f11221c = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.f11219a) {
            case 0:
                ((d) this.f11220b).f11222c.removeCallbacks((Runnable) this.f11221c);
                break;
            default:
                l0.observe$lambda$4((String) this.f11220b, (Function1) this.f11221c);
                break;
        }
    }
}

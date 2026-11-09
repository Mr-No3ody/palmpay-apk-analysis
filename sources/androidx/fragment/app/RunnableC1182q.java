package androidx.fragment.app;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1182q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17198b;

    public /* synthetic */ RunnableC1182q(Object obj, int i7) {
        this.f17197a = i7;
        this.f17198b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17197a) {
            case 0:
                Fragment fragment = (Fragment) this.f17198b;
                t0 t0Var = fragment.mViewLifecycleOwner;
                t0Var.f17213f.b(fragment.mSavedViewRegistryState);
                fragment.mSavedViewRegistryState = null;
                break;
            default:
                ArrayList transitioningViews = (ArrayList) this.f17198b;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                l0.a(4, transitioningViews);
                break;
        }
    }
}

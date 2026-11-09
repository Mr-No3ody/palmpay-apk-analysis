package androidx.activity;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11987b;

    public /* synthetic */ C(Object obj, int i7) {
        this.f11986a = i7;
        this.f11987b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f11986a) {
            case 0:
                Function0 onBackInvoked = (Function0) this.f11987b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((androidx.appcompat.app.I) this.f11987b).F();
                break;
            case 2:
                ((Runnable) this.f11987b).run();
                break;
            default:
                ((MaterialBackHandler) this.f11987b).handleBackInvoked();
                break;
        }
    }
}

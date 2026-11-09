package p038ca;

import V3.a;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import com.transsnet.palmpay.core.callback.Argument0Callback;
import com.transsnet.palmpay.core.callback.Argument1Callback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends V3.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActivityResultCaller f18887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f18888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ActivityResultCaller caller) {
        super(caller, new a(4), 1);
        Intrinsics.checkNotNullParameter(caller, "caller");
        this.f18887f = caller;
        Intrinsics.checkNotNullParameter(caller, "caller");
        this.f18888g = new a(caller, new a(2), 1);
    }

    public final void f(final String permission, final Argument0Callback onGranted, final Argument1Callback onDenied, final Argument1Callback argument1Callback) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(onGranted, "onGranted");
        Intrinsics.checkNotNullParameter(onDenied, "onDenied");
        d(permission, new ActivityResultCallback() { // from class: ca.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    onGranted.invoke();
                    return;
                }
                d dVar = this;
                boolean zG = D3.a.G(dVar.f18887f, permission);
                Argument1Callback argument1Callback2 = onDenied;
                a aVar = dVar.f18888g;
                if (zG) {
                    argument1Callback.invoke(aVar);
                } else {
                    argument1Callback2.invoke(aVar);
                }
            }
        });
    }
}

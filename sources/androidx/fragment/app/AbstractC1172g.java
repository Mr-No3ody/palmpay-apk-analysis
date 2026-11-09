package androidx.fragment.app;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1172g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f17128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.os.d f17129b;

    public AbstractC1172g(x0 operation, androidx.core.os.d signal) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f17128a = operation;
        this.f17129b = signal;
    }

    public final void a() {
        x0 x0Var = this.f17128a;
        androidx.core.os.d signal = this.f17129b;
        Intrinsics.checkNotNullParameter(signal, "signal");
        LinkedHashSet linkedHashSet = x0Var.f17250e;
        if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
            x0Var.b();
        }
    }

    public final boolean b() {
        A0 a3 = B0.f16949a;
        x0 x0Var = this.f17128a;
        View view = x0Var.f17248c.mView;
        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
        B0 b0AsOperationState = a3.asOperationState(view);
        B0 b0 = x0Var.f17246a;
        if (b0AsOperationState == b0) {
            return true;
        }
        B0 b7 = B0.f16951c;
        return (b0AsOperationState == b7 || b0 == b7) ? false : true;
    }
}

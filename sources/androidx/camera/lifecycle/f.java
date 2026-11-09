package androidx.camera.lifecycle;

import E.AbstractC0198c;
import E.C0214t;
import android.content.Context;
import android.os.Trace;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.futures.j;
import androidx.concurrent.futures.m;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h getInstance$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (h) tmp0.invoke(obj);
    }

    @ExperimentalCameraProviderConfiguration
    @JvmStatic
    public final void configureInstance(@NotNull C0214t cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "cameraXConfig");
        Trace.beginSection(AbstractC0198c.m0("CX:configureInstance"));
        try {
            h.a(h.f14528j, cameraXConfig);
            Unit unit = Unit.f38893a;
        } finally {
            Trace.endSection();
        }
    }

    @JvmStatic
    @NotNull
    public final ListenableFuture<h> getInstance(@NotNull Context context) {
        m mVarY;
        Intrinsics.checkNotNullParameter(context, "context");
        context.getClass();
        h hVar = h.f14528j;
        synchronized (hVar.f14529a) {
            mVarY = hVar.f14531c;
            if (mVarY == null) {
                mVarY = AbstractC0198c.y(new U8.a(12, hVar, new androidx.camera.core.c(context, hVar.f14530b)));
                hVar.f14531c = mVarY;
            }
        }
        final G0.b bVar = new G0.b(context, 1);
        Function function = new Function() { // from class: androidx.camera.lifecycle.e
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return f.getInstance$lambda$0(bVar, obj);
            }
        };
        androidx.camera.core.impl.utils.futures.a aVarI = j.i(mVarY, new C2085k0(function, 13), org.chromium.support_lib_boundary.util.b.u());
        Intrinsics.checkNotNullExpressionValue(aVarI, "context: Context): Liste…tExecutor()\n            )");
        return aVarI;
    }

    private f() {
    }
}

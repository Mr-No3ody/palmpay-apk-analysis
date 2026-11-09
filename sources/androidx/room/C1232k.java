package androidx.room;

import C0.C0126s;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.C0765i;
import Wf.V;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.room.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1232k {
    public /* synthetic */ C1232k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final <R> Flow<R> createFlow(@NotNull G g7, boolean z3, @NotNull String[] strArr, @NotNull Callable<R> callable) {
        return new T(new C1229h(z3, g7, strArr, callable, null));
    }

    @JvmStatic
    @Nullable
    public final <R> Object execute(@NotNull G g7, boolean z3, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
        if (g7.isOpenInternal() && g7.inTransaction()) {
            return callable.call();
        }
        if (continuation.getContext().get(S.f17742a) == null) {
            return AbstractC0780y.s(z3 ? com.facebook.imagepipeline.nativecode.b.x(g7) : com.facebook.imagepipeline.nativecode.b.u(g7), new C1230i(callable, null), continuation);
        }
        throw new ClassCastException();
    }

    private C1232k() {
    }

    @JvmStatic
    @Nullable
    public final <R> Object execute(@NotNull G g7, boolean z3, @Nullable CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull Continuation<? super R> frame) {
        if (g7.isOpenInternal() && g7.inTransaction()) {
            return callable.call();
        }
        if (frame.getContext().get(S.f17742a) == null) {
            AbstractC0774s abstractC0774sX = z3 ? com.facebook.imagepipeline.nativecode.b.x(g7) : com.facebook.imagepipeline.nativecode.b.u(g7);
            C0765i c0765i = new C0765i(1, Ef.f.b(frame));
            c0765i.initCancellability();
            c0765i.invokeOnCancellation(new C0126s(4, cancellationSignal, AbstractC0780y.m(V.f10828a, abstractC0774sX, null, new C1231j(callable, c0765i, null), 2)));
            Object objM = c0765i.m();
            if (objM == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM;
        }
        throw new ClassCastException();
    }
}

package androidx.work.impl.constraints;

import V0.C;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Function0<Unit> addCallback(@NotNull ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull Function1<? super c, Unit> onConstraintState) {
        int i7 = 1;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        e eVar = new e(onConstraintState);
        B b7 = new B();
        try {
            C c6 = C.c();
            int i10 = m.f18506a;
            c6.getClass();
            connManager.registerNetworkCallback(networkRequest, eVar);
            b7.f38947a = true;
        } catch (RuntimeException e10) {
            String name = e10.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "ex.javaClass.name");
            if (!y.g(name, "TooManyRequestsException", false)) {
                throw e10;
            }
            C c10 = C.c();
            int i11 = m.f18506a;
            c10.getClass();
            onConstraintState.invoke(new b(7));
        }
        return new Gg.l(b7, i7, connManager, eVar);
    }

    private d() {
    }
}

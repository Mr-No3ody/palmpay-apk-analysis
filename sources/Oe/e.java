package Oe;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final f get() {
        if (f.f6843b == null) {
            synchronized (f.class) {
                try {
                    if (f.f6843b == null) {
                        f.f6843b = new f();
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f fVar = f.f6843b;
        Intrinsics.e(fVar);
        return fVar;
    }

    private e() {
    }
}

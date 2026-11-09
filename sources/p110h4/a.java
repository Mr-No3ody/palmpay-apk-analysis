package p110h4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final synchronized b getInstance() {
        b bVar;
        try {
            if (b.f37295c == null) {
                b.f37295c = new b();
            }
            bVar = b.f37295c;
            Intrinsics.e(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return bVar;
    }

    private a() {
    }
}

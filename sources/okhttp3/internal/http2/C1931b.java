package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okhttp3.internal.http2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931b {
    public /* synthetic */ C1931b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final EnumC1932c fromHttp2(int i7) {
        for (EnumC1932c enumC1932c : EnumC1932c.values()) {
            if (enumC1932c.f40811a == i7) {
                return enumC1932c;
            }
        }
        return null;
    }

    private C1931b() {
    }
}

package p135j0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1767a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767a(String message, int i7) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

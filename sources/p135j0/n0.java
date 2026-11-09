package p135j0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f38107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i7, Throwable readException) {
        super(i7);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f38107b = readException;
    }
}

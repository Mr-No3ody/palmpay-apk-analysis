package Gg;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f3484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f3483a = firstConnectException;
        this.f3484b = firstConnectException;
    }
}

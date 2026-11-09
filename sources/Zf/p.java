package Zf;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

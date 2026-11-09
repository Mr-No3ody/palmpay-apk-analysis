package Zf;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Zf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0805a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient FlowCollector f11731a;

    public C0805a(FlowCollector flowCollector) {
        super("Flow was aborted, no more elements needed");
        this.f11731a = flowCollector;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

package Wf;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends CancellationException implements CopyableThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient z0 f10919a;

    public y0(String str, z0 z0Var) {
        super(str);
        this.f10919a = z0Var;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public final Throwable createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        y0 y0Var = new y0(message, this.f10919a);
        y0Var.initCause(this);
        return y0Var;
    }
}

package Wf;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T extends AbstractC0774s implements Closeable, AutoCloseable {
    static {
        Wd.G safeCast = new Wd.G(10);
        r baseKey = AbstractC0774s.f10896b;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            CoroutineContext.Key key = baseKey.f38939b;
        }
    }
}

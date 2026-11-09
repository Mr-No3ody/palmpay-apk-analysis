package Dg;

import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1878b;

    public /* synthetic */ b(String str, boolean z3) {
        this.f1877a = str;
        this.f1878b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f1877a;
        Intrinsics.checkNotNullParameter(name, "$name");
        ShadowThread shadowThread = new ShadowThread(runnable, name, "\u200bokhttp3.internal.Util");
        shadowThread.setDaemon(this.f1878b);
        return shadowThread;
    }
}

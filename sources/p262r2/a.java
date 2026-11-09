package p262r2;

import Hg.c;
import androidx.core.util.Pools$Pool;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Pools$Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41548a = new c(10);

    @Override // androidx.core.util.Pools$Pool
    public final Object acquire() {
        return (ByteBuffer) f41548a.get();
    }

    @Override // androidx.core.util.Pools$Pool
    public final /* bridge */ /* synthetic */ boolean release(Object obj) {
        return true;
    }
}

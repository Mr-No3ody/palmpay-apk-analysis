package p045d3;

import com.facebook.common.internal.Supplier;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f35509a = TimeUnit.MINUTES.toMillis(5);

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        int i7;
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            i7 = 1048576;
        } else {
            i7 = iMin < 33554432 ? 2097152 : 4194304;
        }
        int i10 = i7;
        return new i(i10, Integer.MAX_VALUE, i10, i10 / 8, f35509a);
    }
}

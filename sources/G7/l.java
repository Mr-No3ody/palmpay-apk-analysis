package G7;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3123a = new l(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}

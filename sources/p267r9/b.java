package p267r9;

import Lb.c;
import android.app.Application;
import android.content.SharedPreferences;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThread;
import io.fastkv.n;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread install$lambda$1(Runnable runnable) {
        ShadowThread shadowThread = new ShadowThread(runnable, "fastkv", "\u200bcom.transsnet.palmpay.base.FastKvSharedPreferences$Companion");
        shadowThread.setDaemon(true);
        return shadowThread;
    }

    @NotNull
    public final c install(@NotNull Application app, @NotNull Function2<? super String, ? super Integer, ? extends SharedPreferences> systemSp) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(systemSp, "systemSp");
        ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor(new c(1), "\u200bcom.transsnet.palmpay.base.FastKvSharedPreferences$Companion");
        if (executorServiceNewOptimizedSingleThreadExecutor != null) {
            n.f37671a = executorServiceNewOptimizedSingleThreadExecutor;
        }
        return new c(app, systemSp);
    }

    private b() {
    }
}

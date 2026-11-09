package androidx.work;

import E.AbstractC0198c;
import U8.a;
import V0.A;
import V0.B;
import V0.Y;
import android.content.Context;
import androidx.concurrent.futures.m;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "LV0/B;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Worker extends B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // V0.B
    public final m a() {
        Executor backgroundExecutor = this.f9857b.f18347c;
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        m mVarY = AbstractC0198c.y(new a(backgroundExecutor, new Y(this, 0)));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture {\n        val …        }\n        }\n    }");
        return mVarY;
    }

    @Override // V0.B
    public final m b() {
        Executor backgroundExecutor = this.f9857b.f18347c;
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        m mVarY = AbstractC0198c.y(new a(backgroundExecutor, new Y(this, 1)));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture {\n        val …        }\n        }\n    }");
        return mVarY;
    }

    public abstract A c();
}

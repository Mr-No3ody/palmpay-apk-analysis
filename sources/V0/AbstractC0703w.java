package V0;

import E.AbstractC0198c;
import Wf.EnumC0778w;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0703w {
    public static final androidx.concurrent.futures.m a(SerialExecutor serialExecutor, String debugTag, Function0 block) {
        Intrinsics.checkNotNullParameter(serialExecutor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new defpackage.a(serialExecutor, 6, debugTag, block));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture { completer ->… }\n        debugTag\n    }");
        return mVarY;
    }

    public static androidx.concurrent.futures.m b(CoroutineContext context, Function2 block) {
        EnumC0778w start = EnumC0778w.f10900a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new U8.a(context, block));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return mVarY;
    }
}

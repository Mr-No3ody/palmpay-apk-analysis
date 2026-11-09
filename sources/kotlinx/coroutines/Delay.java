package kotlinx.coroutines;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
@InternalCoroutinesApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J)\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "delay", "", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "context", "Lkotlin/coroutines/CoroutineContext;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Delay {
    @Deprecated(level = EnumC2125d.f43963b, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object delay(long j6, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    DisposableHandle invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context);

    void scheduleResumeAfterDelay(long timeMillis, @NotNull CancellableContinuation<? super Unit> continuation);
}

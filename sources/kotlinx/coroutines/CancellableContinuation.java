package kotlinx.coroutines;

import Wf.AbstractC0774s;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J|\u0010\u0006\u001a\u0004\u0018\u00010\u0004\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042M\u0010\u0011\u001aI\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tH'¢\u0006\u0004\b\u0006\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\nH'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010!\u001a\u00020\u00102'\u0010 \u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u001ej\u0002`\u001fH&¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u0010*\u00020#2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u0010*\u00020#2\u0006\u0010\u0013\u001a\u00020\nH'¢\u0006\u0004\b&\u0010'J<\u0010(\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001eH'¢\u0006\u0004\b(\u0010)Jp\u0010(\u001a\u00020\u0010\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012M\u0010\u0011\u001aI\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tH&¢\u0006\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "value", "", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "(Ljava/lang/Object;)V", "initCancellability", "()V", "", PPRNBridge.DIALOG_ACTION_CANCEL, "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "LWf/s;", "resumeUndispatched", "(LWf/s;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(LWf/s;Ljava/lang/Throwable;)V", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "isActive", "()Z", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired(markerClass = {InternalForInheritanceCoroutinesApi.class})
public interface CancellableContinuation<T> extends Continuation<T> {
    boolean cancel(@Nullable Throwable cause);

    @InternalCoroutinesApi
    void completeResume(@NotNull Object token);

    @InternalCoroutinesApi
    void initCancellability();

    void invokeOnCancellation(@NotNull Function1<? super Throwable, Unit> handler);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @Deprecated(level = EnumC2125d.f43962a, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @ReplaceWith(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void resume(T value, @Nullable Function1<? super Throwable, Unit> onCancellation);

    <R extends T> void resume(R value, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    @ExperimentalCoroutinesApi
    void resumeUndispatched(@NotNull AbstractC0774s abstractC0774s, T t);

    @ExperimentalCoroutinesApi
    void resumeUndispatchedWithException(@NotNull AbstractC0774s abstractC0774s, @NotNull Throwable th);

    @InternalCoroutinesApi
    @Nullable
    Object tryResume(T value, @Nullable Object idempotent);

    @InternalCoroutinesApi
    @Nullable
    <R extends T> Object tryResume(R value, @Nullable Object idempotent, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    @InternalCoroutinesApi
    @Nullable
    Object tryResumeWithException(@NotNull Throwable exception);
}

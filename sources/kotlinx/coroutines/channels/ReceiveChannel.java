package kotlinx.coroutines.channels;

import Yf.v;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u001b\u0010\u0012\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0012\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\tJ\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097@¢\u0006\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00168&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LYf/v;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", PPRNBridge.DIALOG_ACTION_CANCEL, "(Ljava/util/concurrent/CancellationException;)V", "()V", "", "", "(Ljava/lang/Throwable;)Z", "poll", "receiveOrNull", "isClosedForReceive", "()Z", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReceiveChannel<E> {
    @Deprecated(level = EnumC2125d.f43964c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@Nullable CancellationException cause);

    @Deprecated(level = EnumC2125d.f43964c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(Throwable cause);

    @NotNull
    SelectClause1<E> getOnReceive();

    @NotNull
    SelectClause1<v> getOnReceiveCatching();

    @NotNull
    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    @NotNull
    ChannelIterator<E> iterator();

    @Deprecated(level = EnumC2125d.f43963b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    @Nullable
    Object receive(@NotNull Continuation<? super E> continuation);

    @Nullable
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo65receiveCatchingJP2dKIU(@NotNull Continuation<? super v> continuation);

    @Deprecated(level = EnumC2125d.f43963b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    Object receiveOrNull(@NotNull Continuation<? super E> continuation);

    @NotNull
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo66tryReceivePtdJZtk();
}

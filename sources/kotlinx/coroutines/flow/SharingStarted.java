package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "Lkotlinx/coroutines/flow/StateFlow;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Z;", "command", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SharingStarted {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final a f39103n0 = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        @NotNull
        private static final SharingStarted Eagerly = new p045d3.j(10);

        @NotNull
        private static final SharingStarted Lazily = new p121i2.d(0, 10);

        private a() {
        }

        public static /* synthetic */ SharingStarted WhileSubscribed$default(a aVar, long j6, long j10, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j6 = 0;
            }
            if ((i7 & 2) != 0) {
                j10 = Long.MAX_VALUE;
            }
            return aVar.WhileSubscribed(j6, j10);
        }

        @NotNull
        public final SharingStarted WhileSubscribed(long j6, long j10) {
            return new e0(j6, j10);
        }

        @NotNull
        public final SharingStarted getEagerly() {
            return Eagerly;
        }

        @NotNull
        public final SharingStarted getLazily() {
            return Lazily;
        }
    }

    @NotNull
    Flow<Z> command(@NotNull StateFlow<Integer> subscriptionCount);
}

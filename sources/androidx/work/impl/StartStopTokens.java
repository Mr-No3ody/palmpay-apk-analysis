package androidx.work.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0007\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "Landroidx/work/impl/model/e;", "id", "Landroidx/work/impl/h;", "tokenFor", "(Landroidx/work/impl/model/e;)Landroidx/work/impl/h;", "remove", "", "workSpecId", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/e;)Z", "Landroidx/work/impl/model/k;", "spec", "(Landroidx/work/impl/model/k;)Landroidx/work/impl/h;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StartStopTokens {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18386a = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }

        public static /* synthetic */ StartStopTokens create$default(a aVar, boolean z3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = true;
            }
            return aVar.create(z3);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final StartStopTokens create(boolean z3) {
            C1276i c1276i = new C1276i();
            return z3 ? new C1277j(c1276i) : c1276i;
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static StartStopTokens create() {
        return f18386a.create();
    }

    boolean contains(@NotNull androidx.work.impl.model.e id2);

    @Nullable
    C1275h remove(@NotNull androidx.work.impl.model.e id2);

    @Nullable
    default C1275h remove(@NotNull androidx.work.impl.model.k spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(p140j8.f.j(spec));
    }

    @NotNull
    List<C1275h> remove(@NotNull String workSpecId);

    @NotNull
    C1275h tokenFor(@NotNull androidx.work.impl.model.e id2);

    @NotNull
    default C1275h tokenFor(@NotNull androidx.work.impl.model.k spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(p140j8.f.j(spec));
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static StartStopTokens create(boolean z3) {
        return f18386a.create(z3);
    }
}

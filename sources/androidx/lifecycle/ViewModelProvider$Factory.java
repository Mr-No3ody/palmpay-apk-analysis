package androidx.lifecycle;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"androidx/lifecycle/ViewModelProvider$Factory", "", "Landroidx/lifecycle/a0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/a0;", "Lz0/b;", "extras", "(Ljava/lang/Class;Lz0/b;)Landroidx/lifecycle/a0;", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17416a = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        private a() {
        }

        @JvmStatic
        @NotNull
        public final ViewModelProvider$Factory from(@NotNull z0.f... initializers) {
            Intrinsics.checkNotNullParameter(initializers, "initializers");
            return new z0.c((z0.f[]) Arrays.copyOf(initializers, initializers.length));
        }
    }

    @JvmStatic
    @NotNull
    static ViewModelProvider$Factory from(@NotNull z0.f... fVarArr) {
        return f17416a.from(fVarArr);
    }

    @NotNull
    default <T extends a0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @NotNull
    default <T extends a0> T create(@NotNull Class<T> modelClass, @NotNull z0.b extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) create(modelClass);
    }
}

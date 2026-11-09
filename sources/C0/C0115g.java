package C0;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.EnumC1204n;
import androidx.navigation.NavViewModelStoreProvider;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: C0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115g {
    public /* synthetic */ C0115g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ C0119k create$default(C0115g c0115g, Context context, K k2, Bundle bundle, EnumC1204n enumC1204n, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            bundle = null;
        }
        if ((i7 & 8) != 0) {
            enumC1204n = EnumC1204n.f17462c;
        }
        if ((i7 & 16) != 0) {
            navViewModelStoreProvider = null;
        }
        if ((i7 & 32) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        if ((i7 & 64) != 0) {
            bundle2 = null;
        }
        return c0115g.create(context, k2, bundle, enumC1204n, navViewModelStoreProvider, str, bundle2);
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final C0119k create(@Nullable Context context, @NotNull K destination, @Nullable Bundle bundle, @NotNull EnumC1204n hostLifecycleState, @Nullable NavViewModelStoreProvider navViewModelStoreProvider, @NotNull String id2, @Nullable Bundle bundle2) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new C0119k(context, destination, bundle, hostLifecycleState, navViewModelStoreProvider, id2, bundle2);
    }

    private C0115g() {
    }
}

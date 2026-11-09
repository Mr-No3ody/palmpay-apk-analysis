package androidx.activity;

import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "androidx/activity/w", "a", "androidx/activity/y", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p355xf.t f12005a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final w getCleaner() {
            return (w) ImmLeaksCleaner.f12005a.getValue();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f12005a = C2131j.b(x.f12073a);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC1203m.ON_DESTROY) {
            throw null;
        }
    }
}

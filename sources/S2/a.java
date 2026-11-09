package S2;

import com.facebook.fresco.ui.common.ControllerListener2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final <I> ControllerListener2<I> getNoOpListener() {
        b bVar = b.f8650a;
        Intrinsics.f(bVar, "null cannot be cast to non-null type com.facebook.fresco.ui.common.ControllerListener2<I of com.facebook.fresco.ui.common.BaseControllerListener2.Companion.getNoOpListener>");
        return bVar;
    }

    private a() {
    }
}

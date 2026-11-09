package Z6;

import android.content.Context;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final i xMultiDatePicker(@NotNull AbstractActivityC0837o abstractActivityC0837o, @NotNull Function1<? super g, Unit> block) {
        Intrinsics.checkNotNullParameter(abstractActivityC0837o, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        g gVar = new g(abstractActivityC0837o, abstractActivityC0837o);
        block.invoke(gVar);
        return gVar.a();
    }

    private f() {
    }

    @Nullable
    public final i xMultiDatePicker(@NotNull Fragment fragment, @NotNull Function1<? super g, Unit> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        E activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        g gVar = new g(contextRequireContext, activity);
        block.invoke(gVar);
        return gVar.a();
    }
}

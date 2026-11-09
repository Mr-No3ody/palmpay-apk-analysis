package X6;

import android.content.Context;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final k xCascadePicker(@NotNull AbstractActivityC0837o abstractActivityC0837o, @NotNull Function1<? super j, Unit> block) {
        Intrinsics.checkNotNullParameter(abstractActivityC0837o, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        j jVar = new j(abstractActivityC0837o);
        block.invoke(jVar);
        return jVar.a();
    }

    private i() {
    }

    @NotNull
    public final k xCascadePicker(@NotNull Fragment fragment, @NotNull Function1<? super j, Unit> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        j jVar = new j(contextRequireContext);
        block.invoke(jVar);
        return jVar.a();
    }
}

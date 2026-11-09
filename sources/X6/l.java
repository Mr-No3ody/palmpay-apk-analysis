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
public final class l {
    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final o xDatePicker(@NotNull AbstractActivityC0837o abstractActivityC0837o, @NotNull Function1<? super m, Unit> block) {
        Intrinsics.checkNotNullParameter(abstractActivityC0837o, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        m mVar = new m(abstractActivityC0837o);
        block.invoke(mVar);
        return mVar.a();
    }

    private l() {
    }

    @NotNull
    public final o xDatePicker(@NotNull Fragment fragment, @NotNull Function1<? super m, Unit> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        m mVar = new m(contextRequireContext);
        block.invoke(mVar);
        return mVar.a();
    }
}

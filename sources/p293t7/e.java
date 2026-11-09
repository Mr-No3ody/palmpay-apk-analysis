package p293t7;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final f create(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    private e() {
    }
}

package V7;

import android.util.TypedValue;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f10102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f10103b;

    public i(ContextThemeWrapper context, BottomNavigationView bottomNavigationView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.f10102a = context;
        this.f10103b = bottomNavigationView;
    }

    public final int a(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f10102a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.data;
    }
}

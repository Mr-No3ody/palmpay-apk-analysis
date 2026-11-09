package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    private WindowInsetsApplier() {
    }

    private q0 consumeAllInsets(@NonNull q0 q0Var) {
        q0 q0Var2 = q0.f16276b;
        return q0Var2.g() != null ? q0Var2 : q0Var.f16277a.c().f16277a.b();
    }

    public static boolean install(@NonNull ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        WindowInsetsApplier windowInsetsApplier = new WindowInsetsApplier();
        WeakHashMap weakHashMap = N.f16168a;
        E.n(viewPager2, windowInsetsApplier);
        return true;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NonNull
    public q0 onApplyWindowInsets(@NonNull View view, @NonNull q0 q0Var) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        q0 q0VarL = N.l(viewPager2, q0Var);
        if (q0VarL.f16277a.n()) {
            return q0VarL;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            N.b(recyclerView.getChildAt(i7), new q0(q0VarL));
        }
        return consumeAllInsets(q0VarL);
    }
}

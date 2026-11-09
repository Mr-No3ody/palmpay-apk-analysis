package Mb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightPager;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends androidx.viewpager.widget.a implements AutoHeightPager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5928c = new ArrayList();

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager container, int i7, Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f5928c.size();
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager container, int i7) {
        Intrinsics.checkNotNullParameter(container, "container");
        View view = (View) this.f5928c.get(i7);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        container.addView(view);
        return view;
    }

    @Override // com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightPager
    public final View getView(int i7) {
        return (View) CollectionsKt.G(i7, this.f5928c);
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.c(view, object);
    }
}

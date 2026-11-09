package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: Rd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0591g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabLayout f8305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2 f8306c;

    public C0591g(LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f8304a = linearLayout;
        this.f8305b = tabLayout;
        this.f8306c = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8304a;
    }
}

package N6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TabLayout f6080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f6082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f6083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewPager2 f6084g;

    public a(ConstraintLayout constraintLayout, e eVar, TabLayout tabLayout, TextView textView, View view, View view2, ViewPager2 viewPager2) {
        this.f6078a = constraintLayout;
        this.f6079b = eVar;
        this.f6080c = tabLayout;
        this.f6081d = textView;
        this.f6082e = view;
        this.f6083f = view2;
        this.f6084g = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6078a;
    }
}

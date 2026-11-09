package Z6;

import V9.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends V6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f11553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f11555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function3 f11556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f11558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f11559j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11561p;
    public Boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.palmpay.lib.ui.picker.picker.date.a f11562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f11563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, E fragmentActivity, int i7, Function2 function2, Function3 function3, ArrayList data) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f11553c = fragmentActivity;
        this.f11554d = i7;
        this.f11555e = function2;
        this.f11556f = function3;
        this.f11560o = Integer.MAX_VALUE;
        this.t = Boolean.FALSE;
        this.f11563w = new String[]{"Month", "Customize"};
    }

    @Override // V6.a
    public final void c(ViewBinding viewBinding) {
        N6.a binding = (N6.a) viewBinding;
        Intrinsics.checkNotNullParameter(binding, "binding");
        setContentView(binding.f6078a);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(L6.i.pp_dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = l.k(window.getContext());
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        Ba.a aVar = new Ba.a(this, 22);
        X6.c cVar = new X6.c(this, 4);
        int i7 = this.f11554d;
        int i10 = i7 == 4 ? 0 : 8;
        TabLayout tabLayout = binding.f6080c;
        tabLayout.setVisibility(i10);
        N6.e eVar = binding.f6079b;
        eVar.f6097b.setVisibility(i7 != 4 ? 0 : 8);
        String str = this.f11557g;
        TextView textView = eVar.f6098c;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText(getContext().getString(L6.h.lib_ui_picker_range_dialog_title));
        }
        com.palmpay.lib.ui.picker.picker.date.a aVar2 = new com.palmpay.lib.ui.picker.picker.date.a(this.f11553c, this.f11563w, this.f11554d, this.f11558i, this.f11559j, this.f11560o, this.f11561p, aVar, cVar, this.f11556f, this.t);
        this.f11562v = aVar2;
        ViewPager2 viewPager2 = binding.f6084g;
        viewPager2.setAdapter(aVar2);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setCurrentItem(0, false);
        new TabLayoutMediator(tabLayout, viewPager2, new q(this, 26)).attach();
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new h(binding, this));
    }

    @Override // V6.a
    public final ViewBinding d() {
        View viewM;
        View viewM2;
        View viewInflate = getLayoutInflater().inflate(L6.g.lib_ui_dialog_date_picker, (ViewGroup) null, false);
        int i7 = L6.f.ly_title;
        View viewM3 = p059e1.a.m(i7, viewInflate);
        if (viewM3 != null) {
            N6.e eVarA = N6.e.a(viewM3);
            i7 = L6.f.tl_date_picker;
            TabLayout tabLayout = (TabLayout) p059e1.a.m(i7, viewInflate);
            if (tabLayout != null) {
                i7 = L6.f.tv_title;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null && (viewM = p059e1.a.m((i7 = L6.f.v_divider), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = L6.f.v_title), viewInflate)) != null) {
                    i7 = L6.f.vp_date_picker;
                    ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i7, viewInflate);
                    if (viewPager2 != null) {
                        return new N6.a((ConstraintLayout) viewInflate, eVarA, tabLayout, textView, viewM, viewM2, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}

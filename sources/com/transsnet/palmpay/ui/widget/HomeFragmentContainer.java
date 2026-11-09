package com.transsnet.palmpay.ui.widget;

import Ac.e;
import F6.d;
import Pa.C0504a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.EnumC1204n;
import com.transsnet.palmpay.bean.HomeFragmentCache;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeInvestFragment;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class HomeFragmentContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f35349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f35350b;

    public HomeFragmentContainer(@NonNull Context context) {
        super(context);
        this.f35350b = new int[]{e.main_home_tab_1, e.main_home_tab_2, e.main_home_tab_3, e.main_home_tab_4, e.main_home_tab_5};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Fragment a(int i7, boolean z3) {
        byte b7;
        try {
            HomeFragmentCache homeFragmentCache = (HomeFragmentCache) this.f35349a.get(i7);
            if (homeFragmentCache == null) {
                return null;
            }
            if (homeFragmentCache.fragment == null && z3) {
                String str = homeFragmentCache.name;
                switch (str.hashCode()) {
                    case -1183703051:
                        if (!str.equals("invest")) {
                            b7 = -1;
                        } else {
                            b7 = 4;
                        }
                        break;
                    case -853258278:
                        if (!str.equals("finance")) {
                            b7 = -1;
                        } else {
                            b7 = 3;
                        }
                        break;
                    case 3480:
                        if (!str.equals("me")) {
                            b7 = -1;
                        } else {
                            b7 = 2;
                        }
                        break;
                    case 3208415:
                        if (!str.equals("home")) {
                            b7 = -1;
                        } else {
                            b7 = 0;
                        }
                        break;
                    case 1011129822:
                        if (!str.equals("palmzone")) {
                            b7 = -1;
                        } else {
                            b7 = 1;
                        }
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                if (b7 == 0) {
                    homeFragmentCache.fragment = new HomeFragmentHomeTab();
                } else if (b7 == 1) {
                    homeFragmentCache.fragment = new HomePalmZoneTabV2();
                } else if (b7 == 2) {
                    homeFragmentCache.fragment = new HomeMeFragment();
                } else if (b7 == 3) {
                    homeFragmentCache.fragment = new HomeFinanceFragment();
                } else if (b7 == 4) {
                    homeFragmentCache.fragment = new HomeInvestFragment();
                }
            }
            return homeFragmentCache.fragment;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Fragment b(String str) {
        int iC = c(str);
        if (iC < 0) {
            return null;
        }
        try {
            return ((HomeFragmentCache) this.f35349a.get(iC)).fragment;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int c(String str) {
        if (TextUtils.isEmpty(str) || this.f35349a == null) {
            return -1;
        }
        for (int i7 = 0; i7 < this.f35349a.size(); i7++) {
            if (str.equals(((HomeFragmentCache) this.f35349a.get(i7)).name)) {
                return i7;
            }
        }
        return -1;
    }

    public final void d(C1161a c1161a, int i7) {
        Fragment fragmentA = a(i7, true);
        d.h("debug_tag", 3, "addFragment()");
        if (fragmentA != null && getChildAt(i7).getTag(e.main_tab_bind_fragment) == null) {
            StringBuilder sbE = F.e(i7, "addFragment, index: ", ", fragment: ");
            sbE.append(fragmentA.getClass().toString());
            d.h("debug_tag", 3, sbE.toString());
            c1161a.d(this.f35350b[i7], fragmentA, null, 1);
            getChildAt(i7).setTag(e.main_tab_bind_fragment, Boolean.TRUE);
        }
        int i10 = 0;
        while (i10 < getChildCount()) {
            Fragment fragmentA2 = a(i10, false);
            boolean z3 = i10 == i7;
            getChildAt(i10).setVisibility(z3 ? 0 : 8);
            boolean z8 = getChildAt(i10).getTag(e.main_tab_bind_fragment) != null;
            if (fragmentA2 != null && z8) {
                c1161a.n(fragmentA2, z3 ? EnumC1204n.f17464e : EnumC1204n.f17463d);
            }
            i10++;
        }
        c1161a.h(true);
        if (fragmentA != null) {
            C0504a.a().c(fragmentA.getActivity(), fragmentA);
        }
    }

    public int getCurrentItem() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
        }
        return -1;
    }

    public HomeFragmentContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35350b = new int[]{e.main_home_tab_1, e.main_home_tab_2, e.main_home_tab_3, e.main_home_tab_4, e.main_home_tab_5};
    }

    public HomeFragmentContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f35350b = new int[]{e.main_home_tab_1, e.main_home_tab_2, e.main_home_tab_3, e.main_home_tab_4, e.main_home_tab_5};
    }
}

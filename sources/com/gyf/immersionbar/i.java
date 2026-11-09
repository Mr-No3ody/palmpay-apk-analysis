package com.gyf.immersionbar;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.camera.video.u;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ImmersionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Window f23239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f23240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f23241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f23242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23244g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f23245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f23246j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23248p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23249v;

    public i(Activity activity) {
        this.f23243f = false;
        this.f23244g = false;
        this.f23247o = 0;
        this.f23248p = 0;
        new HashMap();
        this.t = 0;
        this.f23249v = false;
        this.f23238a = activity;
        e(activity.getWindow());
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (((childAt instanceof DrawerLayout) && a(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static i i(Activity activity) {
        o oVar = n.f23255a;
        if (activity == null) {
            oVar.getClass();
            throw new NullPointerException("activity is null");
        }
        StringBuilder sbS = u.s(oVar.f23256a + activity.getClass().getName());
        sbS.append(System.identityHashCode(activity));
        sbS.append(".tag.notOnly.");
        String string = sbS.toString();
        boolean z3 = activity instanceof E;
        Handler handler = oVar.f23257b;
        if (!z3) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            RequestBarManagerFragment requestBarManagerFragment = (RequestBarManagerFragment) fragmentManager.findFragmentByTag(string);
            if (requestBarManagerFragment == null) {
                HashMap map = oVar.f23258c;
                requestBarManagerFragment = (RequestBarManagerFragment) map.get(fragmentManager);
                if (requestBarManagerFragment == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        for (Fragment fragment : fragmentManager.getFragments()) {
                            if (fragment instanceof RequestBarManagerFragment) {
                                String tag = fragment.getTag();
                                if (tag == null) {
                                    fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                                } else if (tag.contains(".tag.notOnly.")) {
                                    fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                                }
                            }
                        }
                    }
                    requestBarManagerFragment = new RequestBarManagerFragment();
                    map.put(fragmentManager, requestBarManagerFragment);
                    fragmentManager.beginTransaction().add(requestBarManagerFragment, string).commitAllowingStateLoss();
                    handler.obtainMessage(1, fragmentManager).sendToTarget();
                }
            }
            if (requestBarManagerFragment.f23207a == null) {
                requestBarManagerFragment.f23207a = new androidx.customview.widget.e(activity);
            }
            return (i) requestBarManagerFragment.f23207a.f16389b;
        }
        Z supportFragmentManager = ((E) activity).getSupportFragmentManager();
        SupportRequestBarManagerFragment supportRequestBarManagerFragment = (SupportRequestBarManagerFragment) supportFragmentManager.E(string);
        if (supportRequestBarManagerFragment == null) {
            HashMap map2 = oVar.f23259d;
            supportRequestBarManagerFragment = (SupportRequestBarManagerFragment) map2.get(supportFragmentManager);
            if (supportRequestBarManagerFragment == null) {
                for (androidx.fragment.app.Fragment fragment2 : supportFragmentManager.f17069c.f()) {
                    if (fragment2 instanceof SupportRequestBarManagerFragment) {
                        String tag2 = fragment2.getTag();
                        if (tag2 == null) {
                            C1161a c1161a = new C1161a(supportFragmentManager);
                            c1161a.m(fragment2);
                            c1161a.h(true);
                        } else if (tag2.contains(".tag.notOnly.")) {
                            C1161a c1161a2 = new C1161a(supportFragmentManager);
                            c1161a2.m(fragment2);
                            c1161a2.h(true);
                        }
                    }
                }
                supportRequestBarManagerFragment = new SupportRequestBarManagerFragment();
                map2.put(supportFragmentManager, supportRequestBarManagerFragment);
                C1161a c1161a3 = new C1161a(supportFragmentManager);
                c1161a3.d(0, supportRequestBarManagerFragment, string, 1);
                c1161a3.h(true);
                handler.obtainMessage(2, supportFragmentManager).sendToTarget();
            }
        }
        if (supportRequestBarManagerFragment.f23208a == null) {
            supportRequestBarManagerFragment.f23208a = new androidx.customview.widget.e(activity);
        }
        return (i) supportRequestBarManagerFragment.f23208a.f16389b;
    }

    public final void b() {
        if (this.f23242e == null) {
            this.f23242e = i(this.f23238a);
        }
        i iVar = this.f23242e;
        if (iVar == null || iVar.f23249v) {
            return;
        }
        iVar.d();
    }

    public final void c() {
        Integer num;
        if (OSUtils.isEMUI3_x()) {
            this.f23245i.getClass();
            f();
        } else if (a(this.f23240c.findViewById(R.id.content))) {
            g(0, 0, 0);
        } else {
            this.f23245i.getClass();
            this.f23245i.getClass();
            g(0, 0, 0);
        }
        b bVar = this.f23245i;
        int i7 = bVar.f23220f ? this.f23246j.f23209a : 0;
        int i10 = this.t;
        Activity activity = this.f23238a;
        if (i10 == 1) {
            View[] viewArr = {null};
            if (activity == null) {
                return;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            View view = viewArr[0];
            if (view == null) {
                return;
            }
            Integer num2 = (Integer) view.getTag(m.immersion_fits_layout_overlap);
            num = num2 != null ? num2 : 0;
            if (num.intValue() != i7) {
                view.setTag(m.immersion_fits_layout_overlap, Integer.valueOf(i7));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                int i11 = layoutParams.height;
                if (i11 == -2 || i11 == -1) {
                    view.post(new h(layoutParams, view, i7, num));
                    return;
                }
                layoutParams.height = (i7 - num.intValue()) + i11;
                view.setPadding(view.getPaddingLeft(), (view.getPaddingTop() + i7) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            View[] viewArr2 = {bVar.f23219e};
            if (activity == null) {
                return;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            View view2 = viewArr2[0];
            if (view2 == null) {
                return;
            }
            Integer num3 = (Integer) view2.getTag(m.immersion_fits_layout_overlap);
            if ((num3 != null ? num3 : 0).intValue() != i7) {
                view2.setTag(m.immersion_fits_layout_overlap, Integer.valueOf(i7));
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-1, 0);
                }
                layoutParams2.height = i7;
                view2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        View[] viewArr3 = {null};
        if (activity == null) {
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        View view3 = viewArr3[0];
        if (view3 == null) {
            return;
        }
        Integer num4 = (Integer) view3.getTag(m.immersion_fits_layout_overlap);
        num = num4 != null ? num4 : 0;
        if (num.intValue() != i7) {
            view3.setTag(m.immersion_fits_layout_overlap, Integer.valueOf(i7));
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (marginLayoutParams.topMargin + i7) - num.intValue(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view3.setLayoutParams(marginLayoutParams);
        }
    }

    public final void d() {
        FrameLayout.LayoutParams layoutParams;
        int i7;
        WindowInsetsController windowInsetsController;
        if (this.f23245i.f23224o) {
            this.f23245i.getClass();
            androidx.core.graphics.d.b(0, -16777216, 0.0f);
            this.f23245i.getClass();
            androidx.core.graphics.d.b(this.f23245i.f23215a, -16777216, 0.0f);
            this.f23245i.getClass();
            boolean z3 = this.f23249v;
            boolean z8 = this.f23243f;
            if (!z3 || z8) {
                h();
            }
            i iVar = this.f23242e;
            if (iVar != null) {
                if (z8) {
                    iVar.f23245i = this.f23245i;
                }
                boolean z10 = this.f23244g;
            }
            int i10 = Build.VERSION.SDK_INT;
            boolean zIsEMUI3_x = OSUtils.isEMUI3_x();
            Activity activity = this.f23238a;
            if (zIsEMUI3_x) {
                this.f23239b.addFlags(67108864);
                ViewGroup viewGroup = this.f23240c;
                int i11 = d.f23225a;
                View viewFindViewById = viewGroup.findViewById(i11);
                if (viewFindViewById == null) {
                    viewFindViewById = new View(activity);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.f23246j.f23209a);
                    layoutParams2.gravity = 48;
                    viewFindViewById.setLayoutParams(layoutParams2);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setId(i11);
                    this.f23240c.addView(viewFindViewById);
                }
                this.f23245i.getClass();
                this.f23245i.getClass();
                this.f23245i.getClass();
                this.f23245i.getClass();
                viewFindViewById.setBackgroundColor(androidx.core.graphics.d.b(0, -16777216, 0.0f));
                if (this.f23246j.f23210b || OSUtils.isEMUI3_x()) {
                    b bVar = this.f23245i;
                    if (bVar.f23221g && bVar.f23222i) {
                        this.f23239b.addFlags(134217728);
                    } else {
                        this.f23239b.clearFlags(134217728);
                    }
                    if (this.f23247o == 0) {
                        this.f23247o = this.f23246j.f23211c;
                    }
                    if (this.f23248p == 0) {
                        this.f23248p = this.f23246j.f23212d;
                    }
                    ViewGroup viewGroup2 = this.f23240c;
                    int i12 = d.f23226b;
                    View viewFindViewById2 = viewGroup2.findViewById(i12);
                    if (viewFindViewById2 == null) {
                        viewFindViewById2 = new View(activity);
                        viewFindViewById2.setId(i12);
                        this.f23240c.addView(viewFindViewById2);
                    }
                    if (this.f23246j.c()) {
                        layoutParams = new FrameLayout.LayoutParams(-1, this.f23246j.f23211c);
                        layoutParams.gravity = 80;
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(this.f23246j.f23212d, -1);
                        layoutParams.gravity = 8388613;
                    }
                    viewFindViewById2.setLayoutParams(layoutParams);
                    viewFindViewById2.setBackgroundColor(androidx.core.graphics.d.b(this.f23245i.f23215a, -16777216, 0.0f));
                    b bVar2 = this.f23245i;
                    if (bVar2.f23221g && bVar2.f23222i) {
                        viewFindViewById2.setVisibility(0);
                    } else {
                        viewFindViewById2.setVisibility(8);
                    }
                }
                i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            } else {
                if (i10 >= 28 && !this.f23249v) {
                    try {
                        WindowManager.LayoutParams attributes = this.f23239b.getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        this.f23239b.setAttributes(attributes);
                    } catch (Exception unused) {
                    }
                }
                if (!this.f23249v) {
                    this.f23245i.f23216b = this.f23239b.getNavigationBarColor();
                }
                b bVar3 = this.f23245i;
                i7 = (bVar3.f23217c && bVar3.f23221g) ? 1792 : 1280;
                this.f23239b.clearFlags(67108864);
                if (this.f23246j.f23210b) {
                    this.f23239b.clearFlags(134217728);
                }
                this.f23239b.addFlags(Integer.MIN_VALUE);
                this.f23245i.getClass();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 29) {
                    this.f23239b.setStatusBarContrastEnforced(false);
                }
                Window window = this.f23239b;
                this.f23245i.getClass();
                this.f23245i.getClass();
                this.f23245i.getClass();
                window.setStatusBarColor(androidx.core.graphics.d.b(0, -16777216, 0.0f));
                b bVar4 = this.f23245i;
                if (bVar4.f23221g) {
                    if (i13 >= 29) {
                        this.f23239b.setNavigationBarContrastEnforced(false);
                    }
                    this.f23239b.setNavigationBarColor(androidx.core.graphics.d.b(this.f23245i.f23215a, -16777216, 0.0f));
                } else {
                    this.f23239b.setNavigationBarColor(bVar4.f23216b);
                }
                this.f23245i.getClass();
                if (i13 >= 30) {
                    WindowInsetsController windowInsetsController2 = this.f23241d.getWindowInsetsController();
                    this.f23245i.getClass();
                    windowInsetsController2.setSystemBarsAppearance(0, 8);
                    WindowInsetsController windowInsetsController3 = this.f23241d.getWindowInsetsController();
                    this.f23245i.getClass();
                    windowInsetsController3.setSystemBarsAppearance(0, 16);
                }
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 30) {
                this.f23245i.getClass();
                i7 |= 4096;
            }
            this.f23240c.setSystemUiVisibility(i7);
            if (OSUtils.isMIUI6Later()) {
                Window window2 = this.f23239b;
                this.f23245i.getClass();
                SpecialBarFontUtils.setMIUIBarDark(window2, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", false);
                if (this.f23245i.f23221g) {
                    SpecialBarFontUtils.setMIUIBarDark(this.f23239b, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", false);
                }
            }
            if (OSUtils.isFlymeOS4Later()) {
                this.f23245i.getClass();
                this.f23245i.getClass();
                SpecialBarFontUtils.setStatusBarDarkIcon(activity, false);
            }
            if (i14 >= 30 && (windowInsetsController = this.f23241d.getWindowInsetsController()) != null) {
                this.f23245i.getClass();
                windowInsetsController.show(WindowInsets.Type.statusBars());
                windowInsetsController.show(WindowInsets.Type.navigationBars());
                windowInsetsController.setSystemBarsBehavior(2);
            }
            this.f23245i.getClass();
            c();
            if (z8) {
                i iVar2 = this.f23242e;
                if (iVar2 != null) {
                    iVar2.f23245i.getClass();
                }
            } else {
                this.f23245i.getClass();
            }
            if (this.f23245i.f23218d.size() != 0) {
                for (Map.Entry entry : this.f23245i.f23218d.entrySet()) {
                    View view = (View) entry.getKey();
                    Map map = (Map) entry.getValue();
                    this.f23245i.getClass();
                    Integer num = 0;
                    this.f23245i.getClass();
                    Integer num2 = -16777216;
                    for (Map.Entry entry2 : map.entrySet()) {
                        Integer num3 = (Integer) entry2.getKey();
                        num2 = (Integer) entry2.getValue();
                        num = num3;
                    }
                    if (view != null) {
                        this.f23245i.getClass();
                        if (Math.abs(0.0f) == 0.0f) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            this.f23245i.getClass();
                            view.setBackgroundColor(androidx.core.graphics.d.b(iIntValue, iIntValue2, 0.0f));
                        } else {
                            int iIntValue3 = num.intValue();
                            int iIntValue4 = num2.intValue();
                            this.f23245i.getClass();
                            view.setBackgroundColor(androidx.core.graphics.d.b(iIntValue3, iIntValue4, 0.0f));
                        }
                    }
                }
            }
            this.f23249v = true;
        }
    }

    public final void e(Window window) {
        this.f23239b = window;
        b bVar = new b();
        bVar.f23215a = -16777216;
        bVar.f23216b = -16777216;
        bVar.f23217c = false;
        bVar.f23218d = new HashMap();
        bVar.f23220f = true;
        bVar.f23221g = true;
        bVar.f23222i = true;
        bVar.f23223j = true;
        bVar.f23224o = true;
        this.f23245i = bVar;
        ViewGroup viewGroup = (ViewGroup) this.f23239b.getDecorView();
        this.f23240c = viewGroup;
        this.f23241d = (ViewGroup) viewGroup.findViewById(R.id.content);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    public final void f() {
        int i7;
        int i10;
        Uri uriFor;
        if (a(this.f23240c.findViewById(R.id.content))) {
            g(0, 0, 0);
        } else {
            this.f23245i.getClass();
            this.f23245i.getClass();
            a aVar = this.f23246j;
            if (aVar.f23210b) {
                b bVar = this.f23245i;
                if (bVar.f23221g && bVar.f23222i) {
                    if (bVar.f23217c) {
                        i7 = 0;
                        i10 = 0;
                    } else if (aVar.c()) {
                        i10 = this.f23246j.f23211c;
                        i7 = 0;
                    } else {
                        i7 = this.f23246j.f23212d;
                        i10 = 0;
                    }
                    this.f23245i.getClass();
                    if (!this.f23246j.c()) {
                        i7 = this.f23246j.f23212d;
                    }
                } else {
                    i7 = 0;
                    i10 = 0;
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            g(0, i7, i10);
        }
        if (this.f23243f || !OSUtils.isEMUI3_x()) {
            return;
        }
        View viewFindViewById = this.f23240c.findViewById(d.f23226b);
        b bVar2 = this.f23245i;
        if (!bVar2.f23221g || !bVar2.f23222i) {
            int i11 = f.f23228d;
            ArrayList arrayList = e.f23227a.f23229a;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            viewFindViewById.setVisibility(8);
            return;
        }
        if (viewFindViewById != null) {
            int i12 = f.f23228d;
            f fVar = e.f23227a;
            if (fVar.f23229a == null) {
                fVar.f23229a = new ArrayList();
            }
            if (!fVar.f23229a.contains(this)) {
                fVar.f23229a.add(this);
            }
            Application application = this.f23238a.getApplication();
            fVar.f23230b = application;
            if (application == null || application.getContentResolver() == null || fVar.f23231c.booleanValue() || (uriFor = Settings.System.getUriFor("navigationbar_is_min")) == null) {
                return;
            }
            fVar.f23230b.getContentResolver().registerContentObserver(uriFor, true, fVar);
            fVar.f23231c = Boolean.TRUE;
        }
    }

    public final void g(int i7, int i10, int i11) {
        ViewGroup viewGroup = this.f23241d;
        if (viewGroup != null) {
            viewGroup.setPadding(0, i7, i10, i11);
        }
    }

    public final void h() {
        this.f23246j = new a(this.f23238a);
    }

    @Override // com.gyf.immersionbar.OnNavigationBarListener
    public final void onNavigationBarChange(boolean z3, l lVar) {
        int i7;
        int i10;
        View viewFindViewById = this.f23240c.findViewById(d.f23226b);
        if (viewFindViewById != null) {
            this.f23246j = new a(this.f23238a);
            this.f23241d.getPaddingBottom();
            this.f23241d.getPaddingRight();
            int i11 = 0;
            if (z3) {
                viewFindViewById.setVisibility(0);
                if (!a(this.f23240c.findViewById(R.id.content))) {
                    if (this.f23247o == 0) {
                        this.f23247o = this.f23246j.f23211c;
                    }
                    if (this.f23248p == 0) {
                        this.f23248p = this.f23246j.f23212d;
                    }
                    this.f23245i.getClass();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
                    if (this.f23246j.c()) {
                        layoutParams.gravity = 80;
                        int i12 = this.f23247o;
                        layoutParams.height = i12;
                        if (this.f23245i.f23217c) {
                            i12 = 0;
                        }
                        int i13 = i12;
                        i7 = 0;
                        i11 = i13;
                    } else {
                        layoutParams.gravity = 8388613;
                        i7 = this.f23248p;
                        layoutParams.width = i7;
                        if (this.f23245i.f23217c) {
                            i7 = 0;
                        }
                    }
                    viewFindViewById.setLayoutParams(layoutParams);
                    i10 = i11;
                    i11 = i7;
                }
                g(this.f23241d.getPaddingTop(), i11, i10);
            }
            viewFindViewById.setVisibility(8);
            i10 = 0;
            g(this.f23241d.getPaddingTop(), i11, i10);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        f();
    }

    public i(androidx.fragment.app.Fragment fragment) {
        this.f23243f = false;
        this.f23244g = false;
        this.f23247o = 0;
        this.f23248p = 0;
        new HashMap();
        this.t = 0;
        this.f23249v = false;
        this.f23243f = true;
        E activity = fragment.getActivity();
        this.f23238a = activity;
        b();
        e(activity.getWindow());
    }

    public i(Fragment fragment) {
        this.f23243f = false;
        this.f23244g = false;
        this.f23247o = 0;
        this.f23248p = 0;
        new HashMap();
        this.t = 0;
        this.f23249v = false;
        this.f23243f = true;
        Activity activity = fragment.getActivity();
        this.f23238a = activity;
        b();
        e(activity.getWindow());
    }

    public i(DialogFragment dialogFragment) {
        this.f23243f = false;
        this.f23244g = false;
        this.f23247o = 0;
        this.f23248p = 0;
        new HashMap();
        this.t = 0;
        this.f23249v = false;
        this.f23244g = true;
        this.f23238a = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        b();
        e(dialog.getWindow());
    }

    public i(android.app.DialogFragment dialogFragment) {
        this.f23243f = false;
        this.f23244g = false;
        this.f23247o = 0;
        this.f23248p = 0;
        new HashMap();
        this.t = 0;
        this.f23249v = false;
        this.f23244g = true;
        this.f23238a = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        b();
        e(dialog.getWindow());
    }
}

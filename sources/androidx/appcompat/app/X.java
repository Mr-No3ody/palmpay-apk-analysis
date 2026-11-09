package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC0824b implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AccelerateInterpolator f12185A = new AccelerateInterpolator();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final DecelerateInterpolator f12186B = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f12190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DecorToolbar f12191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f12192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f12193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W f12195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public W f12196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p279s5.d f12197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f12199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12205s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p343x.g f12206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V f12209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final V f12210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y f12211z;

    public X(Activity activity, boolean z3) {
        new ArrayList();
        this.f12199m = new ArrayList();
        this.f12201o = 0;
        this.f12202p = true;
        this.t = true;
        this.f12209x = new V(this, 0);
        this.f12210y = new V(this, 1);
        this.f12211z = new y(this);
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z3) {
            return;
        }
        this.f12193g = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z3) {
        boolean z8 = this.f12205s || !(this.f12203q || this.f12204r);
        View view = this.f12193g;
        y yVar = this.f12211z;
        if (!z8) {
            if (this.t) {
                this.t = false;
                p343x.g gVar = this.f12206u;
                if (gVar != null) {
                    gVar.a();
                }
                int i7 = this.f12201o;
                V v3 = this.f12209x;
                if (i7 != 0 || (!this.f12207v && !z3)) {
                    v3.onAnimationEnd(null);
                    return;
                }
                this.f12190d.setAlpha(1.0f);
                this.f12190d.setTransitioning(true);
                p343x.g gVar2 = new p343x.g();
                float f10 = -this.f12190d.getHeight();
                if (z3) {
                    int[] iArr = {0, 0};
                    this.f12190d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                androidx.core.view.U uA = androidx.core.view.N.a(this.f12190d);
                uA.e(f10);
                View view2 = (View) uA.f16184a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(yVar != null ? new androidx.core.view.T(0, yVar, view2) : null);
                }
                boolean z10 = gVar2.f43551e;
                ArrayList arrayList = gVar2.f43547a;
                if (!z10) {
                    arrayList.add(uA);
                }
                if (this.f12202p && view != null) {
                    androidx.core.view.U uA2 = androidx.core.view.N.a(view);
                    uA2.e(f10);
                    if (!gVar2.f43551e) {
                        arrayList.add(uA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f12185A;
                boolean z11 = gVar2.f43551e;
                if (!z11) {
                    gVar2.f43549c = accelerateInterpolator;
                }
                if (!z11) {
                    gVar2.f43548b = 250L;
                }
                if (!z11) {
                    gVar2.f43550d = v3;
                }
                this.f12206u = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.t) {
            return;
        }
        this.t = true;
        p343x.g gVar3 = this.f12206u;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f12190d.setVisibility(0);
        int i10 = this.f12201o;
        V v4 = this.f12210y;
        if (i10 == 0 && (this.f12207v || z3)) {
            this.f12190d.setTranslationY(0.0f);
            float f11 = -this.f12190d.getHeight();
            if (z3) {
                int[] iArr2 = {0, 0};
                this.f12190d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f12190d.setTranslationY(f11);
            p343x.g gVar4 = new p343x.g();
            androidx.core.view.U uA3 = androidx.core.view.N.a(this.f12190d);
            uA3.e(0.0f);
            View view3 = (View) uA3.f16184a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(yVar != null ? new androidx.core.view.T(0, yVar, view3) : null);
            }
            boolean z12 = gVar4.f43551e;
            ArrayList arrayList2 = gVar4.f43547a;
            if (!z12) {
                arrayList2.add(uA3);
            }
            if (this.f12202p && view != null) {
                view.setTranslationY(f11);
                androidx.core.view.U uA4 = androidx.core.view.N.a(view);
                uA4.e(0.0f);
                if (!gVar4.f43551e) {
                    arrayList2.add(uA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f12186B;
            boolean z13 = gVar4.f43551e;
            if (!z13) {
                gVar4.f43549c = decelerateInterpolator;
            }
            if (!z13) {
                gVar4.f43548b = 250L;
            }
            if (!z13) {
                gVar4.f43550d = v4;
            }
            this.f12206u = gVar4;
            gVar4.b();
        } else {
            this.f12190d.setAlpha(1.0f);
            this.f12190d.setTranslationY(0.0f);
            if (this.f12202p && view != null) {
                view.setTranslationY(0.0f);
            }
            v4.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12189c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            androidx.core.view.C.c(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean b() {
        DecorToolbar decorToolbar = this.f12191e;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f12191e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void c(boolean z3) {
        if (z3 == this.f12198l) {
            return;
        }
        this.f12198l = z3;
        ArrayList arrayList = this.f12199m;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((ActionBar$OnMenuVisibilityListener) arrayList.get(i7)).onMenuVisibilityChanged(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final View d() {
        return this.f12191e.getCustomView();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final int e() {
        return this.f12191e.getDisplayOptions();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void enableContentAnimations(boolean z3) {
        this.f12202p = z3;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final Context f() {
        if (this.f12188b == null) {
            TypedValue typedValue = new TypedValue();
            this.f12187a.getTheme().resolveAttribute(p241q.a.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f12188b = new ContextThemeWrapper(this.f12187a, i7);
            } else {
                this.f12188b = this.f12187a;
            }
        }
        return this.f12188b;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final CharSequence g() {
        return this.f12191e.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void h() {
        if (this.f12203q) {
            return;
        }
        this.f12203q = true;
        A(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void hideForSystem() {
        if (this.f12204r) {
            return;
        }
        this.f12204r = true;
        A(true);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void j() {
        z(((Context) p382zb.H.a(this.f12187a).f44527a).getResources().getBoolean(p241q.b.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean l(int i7, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.k kVar;
        W w3 = this.f12195i;
        if (w3 == null || (kVar = w3.f12181d) == null) {
            return false;
        }
        kVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return kVar.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void o(boolean z3) {
        if (this.f12194h) {
            return;
        }
        p(z3);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onContentScrollStarted() {
        p343x.g gVar = this.f12206u;
        if (gVar != null) {
            gVar.a();
            this.f12206u = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onWindowVisibilityChanged(int i7) {
        this.f12201o = i7;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void p(boolean z3) {
        int i7 = z3 ? 4 : 0;
        int displayOptions = this.f12191e.getDisplayOptions();
        this.f12194h = true;
        this.f12191e.setDisplayOptions((i7 & 4) | (displayOptions & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void q() {
        this.f12191e.setDisplayOptions(this.f12191e.getDisplayOptions() & (-9));
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void r(int i7) {
        this.f12191e.setNavigationContentDescription(i7);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void s(Drawable drawable) {
        this.f12191e.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void showForSystem() {
        if (this.f12204r) {
            this.f12204r = false;
            A(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void t(boolean z3) {
        p343x.g gVar;
        this.f12207v = z3;
        if (z3 || (gVar = this.f12206u) == null) {
            return;
        }
        gVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void u(CharSequence charSequence) {
        this.f12191e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void v(CharSequence charSequence) {
        this.f12191e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final p343x.a w(p279s5.d dVar) {
        W w3 = this.f12195i;
        if (w3 != null) {
            w3.a();
        }
        this.f12189c.setHideOnContentScrollEnabled(false);
        this.f12192f.g();
        W w6 = new W(this, this.f12192f.getContext(), dVar);
        androidx.appcompat.view.menu.k kVar = w6.f12181d;
        kVar.stopDispatchingItemsChanged();
        try {
            boolean zOnCreateActionMode = ((ActionMode$Callback) w6.f12182e.f42025b).onCreateActionMode(w6, kVar);
            kVar.startDispatchingItemsChanged();
            if (!zOnCreateActionMode) {
                return null;
            }
            this.f12195i = w6;
            w6.g();
            this.f12192f.e(w6);
            x(true);
            return w6;
        } catch (Throwable th) {
            kVar.startDispatchingItemsChanged();
            throw th;
        }
    }

    public final void x(boolean z3) {
        androidx.core.view.U uH;
        androidx.core.view.U uH2;
        if (z3) {
            if (!this.f12205s) {
                this.f12205s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12189c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                A(false);
            }
        } else if (this.f12205s) {
            this.f12205s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12189c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            A(false);
        }
        if (!this.f12190d.isLaidOut()) {
            if (z3) {
                this.f12191e.setVisibility(4);
                this.f12192f.setVisibility(0);
                return;
            } else {
                this.f12191e.setVisibility(0);
                this.f12192f.setVisibility(8);
                return;
            }
        }
        if (z3) {
            uH2 = this.f12191e.setupAnimatorToVisibility(4, 100L);
            uH = this.f12192f.h(0, 200L);
        } else {
            uH = this.f12191e.setupAnimatorToVisibility(0, 200L);
            uH2 = this.f12192f.h(8, 100L);
        }
        p343x.g gVar = new p343x.g();
        ArrayList arrayList = gVar.f43547a;
        arrayList.add(uH2);
        View view = (View) uH2.f16184a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) uH.f16184a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(uH);
        gVar.b();
    }

    public final void y(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(p241q.f.decor_content_parent);
        this.f12189c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(p241q.f.action_bar);
        if (callbackFindViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : BuildConfig.TRAVIS));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f12191e = wrapper;
        this.f12192f = (ActionBarContextView) view.findViewById(p241q.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(p241q.f.action_bar_container);
        this.f12190d = actionBarContainer;
        DecorToolbar decorToolbar = this.f12191e;
        if (decorToolbar == null || this.f12192f == null || actionBarContainer == null) {
            throw new IllegalStateException(X.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f12187a = decorToolbar.getContext();
        boolean z3 = (this.f12191e.getDisplayOptions() & 4) != 0;
        if (z3) {
            this.f12194h = true;
        }
        p382zb.H hA = p382zb.H.a(this.f12187a);
        this.f12191e.setHomeButtonEnabled(((Context) hA.f44527a).getApplicationInfo().targetSdkVersion < 14 || z3);
        z(((Context) hA.f44527a).getResources().getBoolean(p241q.b.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f12187a.obtainStyledAttributes(null, p241q.j.ActionBar, p241q.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12189c;
            if (!actionBarOverlayLayout2.f12557g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f12208w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f12190d;
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            androidx.core.view.E.l(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void z(boolean z3) {
        this.f12200n = z3;
        if (z3) {
            this.f12190d.setTabContainer(null);
            this.f12191e.setEmbeddedTabView(null);
        } else {
            this.f12191e.setEmbeddedTabView(null);
            this.f12190d.setTabContainer(null);
        }
        boolean z8 = false;
        boolean z10 = this.f12191e.getNavigationMode() == 2;
        this.f12191e.setCollapsible(!this.f12200n && z10);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12189c;
        if (!this.f12200n && z10) {
            z8 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z8);
    }

    public X(Dialog dialog) {
        new ArrayList();
        this.f12199m = new ArrayList();
        this.f12201o = 0;
        this.f12202p = true;
        this.t = true;
        this.f12209x = new V(this, 0);
        this.f12210y = new V(this, 1);
        this.f12211z = new y(this);
        y(dialog.getWindow().getDecorView());
    }
}

package com.swmansion.rnscreens.bottomsheet;

import G7.j;
import M7.C0443c;
import M7.C0444d;
import M7.C0445e;
import M7.C0446f;
import N7.f;
import N7.h;
import N7.i;
import N7.k;
import O7.C0494l;
import O7.EnumC0491i;
import O7.s;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.core.impl.utils.n;
import androidx.core.graphics.e;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.o0;
import androidx.core.view.q0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.microsoft.codepush.react.CodePushConstants;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.ScreenStackFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "N7/f", "N7/h", "N7/g", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSheetDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDelegate.kt\ncom/swmansion/rnscreens/bottomsheet/SheetDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
public final class SheetDelegate implements LifecycleEventObserver, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f25393p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f25394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J3.a f25396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25400g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f25401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f25402j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f25403o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public SheetDelegate(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f25394a = screen;
        this.f25396c = C0445e.f5815e;
        this.f25400g = screen.getSheetInitialDetentIndex();
        screen.getSheetDetents().e(screen.getSheetInitialDetentIndex());
        h hVar = new h(this);
        this.f25401i = hVar;
        this.f25402j = new f(this);
        boolean z3 = screen.getFragment() instanceof ScreenStackFragment;
        Fragment fragment = screen.getFragment();
        Intrinsics.e(fragment);
        fragment.getLifecycle().a(this);
        BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        sheetBehavior.addBottomSheetCallback(hVar);
    }

    public static void b(SheetDelegate sheetDelegate, BottomSheetBehavior behavior, J3.a keyboardState, int i7) {
        int iC;
        int iC2;
        if ((i7 & 2) != 0) {
            keyboardState = C0445e.f5815e;
        }
        int i10 = sheetDelegate.f25400g;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer numE = sheetDelegate.e();
        if (numE == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.setHideable(true);
        behavior.setDraggable(true);
        behavior.addBottomSheetCallback(sheetDelegate.f25401i);
        Screen screen = sheetDelegate.f25394a;
        ScreenFooter footer = screen.getFooter();
        if (footer != null) {
            footer.f(behavior);
        }
        if (keyboardState instanceof C0445e) {
            int size = screen.getSheetDetents().f6120a.size();
            if (size == 1) {
                if (g.z(screen)) {
                    screen.getSheetDetents().getClass();
                    iC2 = k.d(screen);
                } else {
                    iC2 = screen.getSheetDetents().c(numE.intValue());
                }
                Intrinsics.checkNotNullParameter(behavior, "<this>");
                behavior.setSkipCollapsed(true);
                behavior.setFitToContents(true);
                behavior.setState(3);
                behavior.setMaxHeight(iC2);
                return;
            }
            if (size == 2) {
                n.C(behavior, Integer.valueOf(screen.getSheetDetents().e(i10)), Integer.valueOf(screen.getSheetDetents().b(0, numE.intValue())), Integer.valueOf(screen.getSheetDetents().c(numE.intValue())));
                return;
            }
            if (size != 3) {
                throw new IllegalStateException(F.c(screen.getSheetDetents().f6120a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
            }
            int iE = screen.getSheetDetents().e(i10);
            int iB = screen.getSheetDetents().b(0, numE.intValue());
            List list = screen.getSheetDetents().f6120a;
            if (list.size() < 3) {
                throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
            }
            n.A(behavior, Integer.valueOf(iE), Integer.valueOf(iB), Integer.valueOf(screen.getSheetDetents().c(numE.intValue())), Float.valueOf((float) (((Number) list.get(1)).doubleValue() / ((Number) list.get(2)).doubleValue())), Integer.valueOf(screen.getSheetDetents().a(numE.intValue(), sheetDelegate.f25398e)));
            return;
        }
        boolean z3 = keyboardState instanceof C0446f;
        f fVar = sheetDelegate.f25402j;
        if (z3) {
            boolean z8 = ((C0446f) keyboardState).f5816e != 0;
            int size2 = screen.getSheetDetents().f6120a.size();
            if (size2 == 1) {
                behavior.addBottomSheetCallback(fVar);
                return;
            }
            if (size2 == 2) {
                if (z8) {
                    n.D(behavior, null, null, 6);
                } else {
                    n.D(behavior, null, null, 7);
                }
                behavior.addBottomSheetCallback(fVar);
                return;
            }
            if (size2 != 3) {
                throw new IllegalStateException(F.c(screen.getSheetDetents().f6120a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
            }
            if (z8) {
                n.B(behavior, null, null, null, null, 30);
            } else {
                n.B(behavior, null, null, null, null, 31);
            }
            behavior.addBottomSheetCallback(fVar);
            return;
        }
        if (!(keyboardState instanceof C0444d)) {
            throw new l();
        }
        behavior.removeBottomSheetCallback(fVar);
        int size3 = screen.getSheetDetents().f6120a.size();
        if (size3 == 1) {
            if (g.z(screen)) {
                screen.getSheetDetents().getClass();
                iC = k.d(screen);
            } else {
                iC = screen.getSheetDetents().c(numE.intValue());
            }
            Intrinsics.checkNotNullParameter(behavior, "<this>");
            behavior.setSkipCollapsed(true);
            behavior.setFitToContents(true);
            behavior.setMaxHeight(iC);
            return;
        }
        if (size3 == 2) {
            n.D(behavior, Integer.valueOf(screen.getSheetDetents().b(0, numE.intValue())), Integer.valueOf(screen.getSheetDetents().c(numE.intValue())), 1);
            return;
        }
        if (size3 != 3) {
            throw new IllegalStateException(F.c(screen.getSheetDetents().f6120a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
        }
        int iB2 = screen.getSheetDetents().b(0, numE.intValue());
        List list2 = screen.getSheetDetents().f6120a;
        if (list2.size() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
        }
        n.B(behavior, Integer.valueOf(iB2), Integer.valueOf(screen.getSheetDetents().c(numE.intValue())), Float.valueOf((float) (((Number) list2.get(1)).doubleValue() / ((Number) list2.get(2)).doubleValue())), Integer.valueOf(screen.getSheetDetents().a(numE.intValue(), sheetDelegate.f25398e)), 1);
    }

    public final void a(AnimatorSet animatorSet, boolean z3, ScreenStackFragment screenStackFragment) {
        animatorSet.addListener(new C0494l(screenStackFragment, new s(this.f25394a), z3 ? EnumC0491i.f6662a : EnumC0491i.f6663b));
        animatorSet.addListener(new j(this, 2));
    }

    public final InputMethodManager c() {
        Object systemService = this.f25394a.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public final Integer d() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        Screen screen = this.f25394a;
        ScreenContainer container = screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    public final Integer e() {
        if (this.f25394a.getSheetShouldOverflowTopInset()) {
            return d();
        }
        Integer numD = d();
        if (numD != null) {
            return Integer.valueOf(numD.intValue() - this.f25398e);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041 A[PHI: r5
      0x0041: PHI (r5v4 double) = (r5v0 double), (r5v1 double) binds: [B:12:0x003f, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    public final void f(float f10) {
        int iMin;
        int i7 = this.f25399f;
        Integer numE = e();
        if (numE == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        Screen screen = this.f25394a;
        if (g.z(screen)) {
            ScreenContentWrapper contentWrapper = screen.getContentWrapper();
            iMin = Math.min(Math.max(numE.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), i7);
        } else {
            double dDoubleValue = ((Number) CollectionsKt.K(screen.getSheetDetents().f6120a)).doubleValue();
            double d2 = 0.0d;
            if (dDoubleValue < 0.0d) {
                dDoubleValue = d2;
            } else {
                d2 = 1.0d;
                if (dDoubleValue > 1.0d) {
                    dDoubleValue = d2;
                }
            }
            iMin = Math.min(numE.intValue() - ((int) (dDoubleValue * ((double) numE.intValue()))), i7);
        }
        screen.setTranslationY(f10 - iMin);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View v3, q0 insets) {
        i0 g0Var;
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean zP = insets.f16277a.p(8);
        o0 o0Var = insets.f16277a;
        e eVarG = o0Var.g(8);
        Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
        e eVarG2 = o0Var.g(7);
        Intrinsics.checkNotNullExpressionValue(eVarG2, "getInsets(...)");
        e eVarG3 = o0Var.g(128);
        Intrinsics.checkNotNullExpressionValue(eVarG3, "getInsets(...)");
        this.f25398e = Math.max(eVarG2.f16059b, eVarG3.f16059b);
        Screen screen = this.f25394a;
        if (zP) {
            this.f25395b = true;
            this.f25396c = new C0446f(eVarG.f16061d);
            BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
            if (sheetBehavior != null) {
                b(this, sheetBehavior, this.f25396c, 4);
            }
        } else {
            BottomSheetBehavior<Screen> sheetBehavior2 = screen.getSheetBehavior();
            C0445e c0445e = C0445e.f5815e;
            if (sheetBehavior2 != null) {
                if (this.f25395b) {
                    b(this, sheetBehavior2, C0444d.f5814e, 4);
                } else if (!this.f25396c.equals(c0445e)) {
                    b(this, sheetBehavior2, c0445e, 4);
                }
            }
            this.f25396c = c0445e;
            this.f25395b = false;
        }
        int i7 = zP ? 0 : eVarG2.f16061d;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            g0Var = new h0(insets);
        } else {
            g0Var = i10 >= 29 ? new g0(insets) : new f0(insets);
        }
        g0Var.c(7, e.b(eVarG2.f16058a, eVarG2.f16059b, eVarG2.f16060c, i7));
        q0 q0VarB = g0Var.b();
        Intrinsics.checkNotNullExpressionValue(q0VarB, "build(...)");
        return q0VarB;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        View currentFocus;
        View decorView;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i7 = i.f6119a[event.ordinal()];
        Screen screen = this.f25394a;
        if (i7 == 1) {
            Activity currentActivity = screen.getReactContext().getCurrentActivity();
            if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
                return;
            }
            Window window = currentActivity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                Intrinsics.checkNotNullParameter(decorView, "decorView");
                WeakHashMap weakHashMap = N.f16168a;
                q0 q0VarA = androidx.core.view.F.a(decorView);
                if (Intrinsics.c(q0VarA != null ? Boolean.valueOf(q0VarA.f16277a.p(8)) : null, Boolean.TRUE)) {
                    this.f25403o = currentFocus;
                }
            }
            screen.setDescendantFocusability(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
            screen.requestFocus();
            InputMethodManager inputMethodManagerC = c();
            if (inputMethodManagerC != null) {
                inputMethodManagerC.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            }
            return;
        }
        if (i7 == 2) {
            C0443c c0443c = C0443c.f5809a;
            Activity currentActivity2 = screen.getReactContext().getCurrentActivity();
            if (currentActivity2 == null) {
                throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
            }
            View view = currentActivity2.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "getDecorView(...)");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!C0443c.f5812d || C0443c.f5811c.get() == null) {
                WeakHashMap weakHashMap2 = N.f16168a;
                E.n(view, c0443c);
                C0443c.f5811c = new WeakReference(view);
                C0443c.f5812d = true;
                return;
            }
            return;
        }
        if (i7 == 3) {
            C0443c c0443c2 = C0443c.f5809a;
            Intrinsics.checkNotNullParameter(this, "listener");
            C0443c.f5810b.add(this);
        } else if (i7 == 4) {
            C0443c c0443c3 = C0443c.f5809a;
            Intrinsics.checkNotNullParameter(this, "listener");
            C0443c.f5810b.remove(this);
        } else {
            if (i7 != 5) {
                return;
            }
            View view2 = this.f25403o;
            if (view2 != null) {
                view2.requestFocus();
                InputMethodManager inputMethodManagerC2 = c();
                if (inputMethodManagerC2 != null) {
                    inputMethodManagerC2.showSoftInput(view2, 0);
                }
            }
            this.f25403o = null;
        }
    }
}

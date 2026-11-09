package com.swmansion.rnscreens;

import Ab.C;
import Fe.h0;
import Gb.z;
import M7.A;
import M7.D;
import M7.G;
import N7.a;
import N7.b;
import N7.c;
import N7.d;
import O7.r;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.utils.executor.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.q0;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.bottomsheet.DimmingView;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragment;", "Lcom/swmansion/rnscreens/ScreenFragment;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "<init>", "()V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackFragment.kt\ncom/swmansion/rnscreens/ScreenStackFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,564:1\n1#2:565\n*E\n"})
public final class ScreenStackFragment extends ScreenFragment implements ScreenStackFragmentWrapper {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f25339X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CustomSearchView f25340A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C f25341B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ScreensCoordinatorLayout f25342C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public d f25343H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SheetDelegate f25344L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public b f25345M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public q0 f25346Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CustomAppBarLayout f25347j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Toolbar f25348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25349p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f25350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f25351w;

    public ScreenStackFragment() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final boolean canNavigateBack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.c(((ScreenStack) container).getRootScreen(), getScreen())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ScreenStackFragment) {
            return ((ScreenStackFragment) parentFragment).canNavigateBack();
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final void dismissFromContainer() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        ScreenStack screenStack = (ScreenStack) container;
        screenStack.getClass();
        Intrinsics.checkNotNullParameter(this, "screenFragment");
        screenStack.f25335o.add(this);
        screenStack.f25308d = true;
        screenStack.g();
    }

    public final void g() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = getScreen().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new r(surfaceId, getScreen().getId()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public final void h(q0 q0Var) {
        Integer numValueOf;
        if (Intrinsics.c(this.f25346Q, q0Var)) {
            return;
        }
        this.f25346Q = q0Var;
        SheetDelegate sheetDelegateJ = j();
        BottomSheetBehavior<Screen> behavior = getScreen().getSheetBehavior();
        Intrinsics.e(behavior);
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Integer numE = sheetDelegateJ.e();
        if (numE == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        Screen screen = sheetDelegateJ.f25394a;
        boolean z3 = g.z(screen);
        if (z3) {
            ScreenContentWrapper contentWrapper = screen.getContentWrapper();
            if (contentWrapper != null) {
                numValueOf = Integer.valueOf(contentWrapper.getHeight());
                Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
                if (!contentWrapper.isLaidOut() && contentWrapper.getHeight() <= 0 && contentWrapper.getWidth() <= 0) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
        } else {
            if (z3) {
                throw new l();
            }
            numValueOf = Integer.valueOf((int) (((Number) CollectionsKt.K(screen.getSheetDetents().f6120a)).doubleValue() * ((double) numE.intValue())));
        }
        Integer numValueOf2 = screen.getSheetDetents().f6120a.size() == 3 ? Integer.valueOf(screen.getSheetDetents().a(numE.intValue(), sheetDelegateJ.f25398e)) : null;
        Intrinsics.checkNotNullParameter(behavior, "<this>");
        if (numValueOf != null) {
            behavior.setMaxHeight(numValueOf.intValue());
        }
        if (numValueOf2 != null) {
            behavior.setExpandedOffset(numValueOf2.intValue());
        }
        ScreenContainer container = getScreen().getContainer();
        if (container != null) {
            ScreensCoordinatorLayout screensCoordinatorLayout = this.f25342C;
            if (screensCoordinatorLayout == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout.forceLayout();
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.f25342C;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.f25342C;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        getScreen().d(true);
        a aVar = this.f25350v;
        if (aVar == null) {
            Intrinsics.n("sheetTransitionCoordinator");
            throw null;
        }
        Screen screen2 = getScreen();
        Intrinsics.checkNotNullParameter(screen2, "screen");
        aVar.f6100b = true;
        aVar.a(screen2);
    }

    public final d i(boolean z3) {
        d dVar = this.f25343H;
        if (dVar == null || z3) {
            if (dVar != null) {
                BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
                c cVar = dVar.f6110c;
                if (cVar != null && sheetBehavior != null) {
                    sheetBehavior.removeBottomSheetCallback(cVar);
                }
            }
            this.f25343H = new d(getScreen().getReactContext(), getScreen());
        }
        d dVar2 = this.f25343H;
        Intrinsics.e(dVar2);
        return dVar2;
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public final boolean isTranslucent() {
        int iOrdinal = getScreen().stackPresentation.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public final SheetDelegate j() {
        if (this.f25344L == null) {
            this.f25344L = new SheetDelegate(getScreen());
        }
        SheetDelegate sheetDelegate = this.f25344L;
        Intrinsics.e(sheetDelegate);
        return sheetDelegate;
    }

    public final void k(Menu menu) {
        menu.clear();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig == null || configSubviewsCount <= 0) {
            return;
        }
        for (int i7 = 0; i7 < configSubviewsCount; i7++) {
            Object obj = headerConfig.f25361g.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((ScreenStackHeaderSubview) obj).getType() == G.f5789e) {
                Context context = getContext();
                if (this.f25340A == null && context != null) {
                    CustomSearchView customSearchView = new CustomSearchView(context, this);
                    this.f25340A = customSearchView;
                    C c6 = this.f25341B;
                    if (c6 != null) {
                        c6.invoke(customSearchView);
                    }
                }
                MenuItem menuItemAdd = menu.add("");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(this.f25340A);
                return;
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void onContainerUpdate() {
        super.onContainerUpdate();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i7, boolean z3, int i10) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i7, boolean z3, int i10) {
        int i11 = 3;
        final int i12 = 1;
        final int i13 = 0;
        if (!g.N(getScreen())) {
            return null;
        }
        if (!z3) {
            final SheetDelegate sheetDelegateJ = j();
            d dVarI = i(false);
            Screen screen = getScreen();
            ScreensCoordinatorLayout screensCoordinatorLayout = this.f25342C;
            if (screensCoordinatorLayout == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            N7.g sheetAnimationContext = new N7.g(this, screen, screensCoordinatorLayout, dVarI);
            Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
            AnimatorSet animatorSet = new AnimatorSet();
            float alpha = dVarI.f6108a.getAlpha();
            int i14 = SheetDelegate.f25393p;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new z(dVarI, i11));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
            int bottom = screensCoordinatorLayout.getBottom();
            Screen screen2 = sheetDelegateJ.f25394a;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, (bottom - screen2.getTop()) - screen2.getTranslationY());
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: N7.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator it) {
                    SheetDelegate sheetDelegate = sheetDelegateJ;
                    switch (i12) {
                        case 0:
                            int i15 = SheetDelegate.f25393p;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object animatedValue = it.getAnimatedValue();
                            Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            sheetDelegate.f(((Float) animatedValue).floatValue());
                            break;
                        default:
                            int i16 = SheetDelegate.f25393p;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object animatedValue2 = it.getAnimatedValue();
                            Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            sheetDelegate.f(((Float) animatedValue2).floatValue());
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
            animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
            sheetDelegateJ.a(animatorSet, false, this);
            return animatorSet;
        }
        final SheetDelegate sheetDelegateJ2 = j();
        d dVarI2 = i(false);
        Screen screen3 = getScreen();
        ScreensCoordinatorLayout screensCoordinatorLayout2 = this.f25342C;
        if (screensCoordinatorLayout2 == null) {
            Intrinsics.n("coordinatorLayout");
            throw null;
        }
        N7.g sheetAnimationContext2 = new N7.g(this, screen3, screensCoordinatorLayout2, dVarI2);
        Intrinsics.checkNotNullParameter(sheetAnimationContext2, "sheetAnimationContext");
        AnimatorSet animatorSet2 = new AnimatorSet();
        int i15 = SheetDelegate.f25393p;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, dVarI2.f6109b);
        valueAnimatorOfFloat3.addUpdateListener(new z(dVarI2, i11));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat3, "apply(...)");
        p036c8.a aVar = new p036c8.a(new C(sheetDelegateJ2, 26), new h0(13));
        Screen screen4 = sheetDelegateJ2.f25394a;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(aVar, Float.valueOf(screen4.getHeight()), Float.valueOf(0.0f));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: N7.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                SheetDelegate sheetDelegate = sheetDelegateJ2;
                switch (i13) {
                    case 0:
                        int i16 = SheetDelegate.f25393p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        sheetDelegate.f(((Float) animatedValue).floatValue());
                        break;
                    default:
                        int i17 = SheetDelegate.f25393p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        sheetDelegate.f(((Float) animatedValue2).floatValue());
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfObject, "apply(...)");
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorOfObject);
        int sheetInitialDetentIndex = screen4.getSheetInitialDetentIndex();
        Intrinsics.checkNotNullParameter(screen4, "screen");
        AnimatorSet.Builder builder = sheetInitialDetentIndex > screen4.getSheetLargestUndimmedDetentIndex() ? builderPlay : null;
        if (builder != null) {
            builder.with(valueAnimatorOfFloat3);
        }
        sheetDelegateJ2.a(animatorSet2, true, this);
        return animatorSet2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        k(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout.Behavior scrollingViewBehavior;
        Integer numValueOf;
        ColorStateList tintList;
        CustomAppBarLayout customAppBarLayout;
        CustomAppBarLayout customAppBarLayout2;
        CustomAppBarLayout customAppBarLayout3;
        int i7 = 1;
        int i10 = 0;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.f25342C = new ScreensCoordinatorLayout(contextRequireContext, this);
        Screen screen = getScreen();
        androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, -1);
        if (g.N(getScreen())) {
            scrollingViewBehavior = new BottomSheetBehavior();
        } else {
            scrollingViewBehavior = this.t ? null : new AppBarLayout.ScrollingViewBehavior();
        }
        cVar.b(scrollingViewBehavior);
        screen.setLayoutParams(cVar);
        ScreensCoordinatorLayout screensCoordinatorLayout = this.f25342C;
        if (screensCoordinatorLayout == null) {
            Intrinsics.n("coordinatorLayout");
            throw null;
        }
        Screen screen2 = getScreen();
        p118hf.a.H(screen2);
        screensCoordinatorLayout.addView(screen2);
        if (g.N(getScreen())) {
            getScreen().setClipToOutline(true);
            Screen screen3 = getScreen();
            float fMax = Math.max(PixelUtil.toPixelFromDIP(screen3.getSheetCornerRadius()), 0.0f);
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.setTopLeftCorner(0, fMax);
            builder.setTopRightCorner(0, fMax);
            ShapeAppearanceModel shapeAppearanceModelBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
            Drawable background = screen3.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            } else {
                Drawable background2 = screen3.getBackground();
                MaterialShapeDrawable materialShapeDrawable2 = background2 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background2 : null;
                numValueOf = (materialShapeDrawable2 == null || (tintList = materialShapeDrawable2.getTintList()) == null) ? null : Integer.valueOf(tintList.getDefaultColor());
            }
            if (numValueOf == null) {
                ScreenContentWrapper contentWrapper = screen3.getContentWrapper();
                if (contentWrapper == null) {
                    numValueOf = null;
                } else {
                    Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
                    numValueOf = BackgroundStyleApplicator.getBackgroundColor(contentWrapper);
                }
            }
            materialShapeDrawable.setTint(numValueOf != null ? numValueOf.intValue() : 0);
            screen3.setBackground(materialShapeDrawable);
            getScreen().setElevation(getScreen().getSheetElevation());
            SheetDelegate sheetDelegateJ = j();
            BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
            Intrinsics.e(sheetBehavior);
            SheetDelegate.b(sheetDelegateJ, sheetBehavior, null, 6);
            d dVarI = i(true);
            Screen screen4 = getScreen();
            ScreensCoordinatorLayout root = this.f25342C;
            if (root == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            Intrinsics.checkNotNullParameter(screen4, "screen");
            Intrinsics.checkNotNullParameter(root, "root");
            DimmingView dimmingView = dVarI.f6108a;
            root.addView(dimmingView, 0);
            int sheetInitialDetentIndex = screen4.getSheetInitialDetentIndex();
            Intrinsics.checkNotNullParameter(screen4, "screen");
            boolean z3 = sheetInitialDetentIndex > screen4.getSheetLargestUndimmedDetentIndex();
            float f10 = dVarI.f6109b;
            if (z3) {
                dimmingView.setAlpha(f10);
            } else {
                dimmingView.setAlpha(0.0f);
            }
            Screen screen5 = getScreen();
            BottomSheetBehavior<Screen> behavior = getScreen().getSheetBehavior();
            Intrinsics.e(behavior);
            Intrinsics.checkNotNullParameter(screen5, "screen");
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            c cVar2 = new c(screen5, dimmingView, f10);
            dVarI.f6110c = cVar2;
            behavior.addBottomSheetCallback(cVar2);
            if (!getScreen().getSheetShouldOverflowTopInset()) {
                final a aVar = new a();
                this.f25350v = aVar;
                final ScreenContainer container = getScreen().getContainer();
                if (container != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: M7.B
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                                int i11 = ScreenStackFragment.f25339X;
                                Intrinsics.checkNotNullParameter(view, "<unused var>");
                                Intrinsics.checkNotNullParameter(insets, "insets");
                                q0 q0VarH = q0.h(container, insets);
                                Intrinsics.checkNotNullExpressionValue(q0VarH, "toWindowInsetsCompat(...)");
                                this.h(q0VarH);
                                return insets;
                            }
                        });
                    } else {
                        if (this.f25345M == null) {
                            this.f25345M = new b();
                        }
                        b bVar = this.f25345M;
                        Intrinsics.e(bVar);
                        A listener = new A(this, i7);
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        bVar.f6101a.add(listener);
                    }
                }
                ScreenContainer container2 = getScreen().getContainer();
                if (container2 != null) {
                    container2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: M7.C
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                            int i19 = ScreenStackFragment.f25339X;
                            Screen screen6 = this.getScreen();
                            N7.a aVar2 = aVar;
                            aVar2.getClass();
                            Intrinsics.checkNotNullParameter(screen6, "screen");
                            aVar2.f6099a = true;
                            aVar2.a(screen6);
                        }
                    });
                }
            }
            ScreenContainer container3 = getScreen().getContainer();
            Intrinsics.e(container3);
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.f25342C;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout2.measure(View.MeasureSpec.makeMeasureSpec(container3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container3.getHeight(), 1073741824));
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.f25342C;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout3.layout(0, 0, container3.getWidth(), container3.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                if (this.f25345M == null) {
                    this.f25345M = new b();
                }
                b bVar2 = this.f25345M;
                Intrinsics.e(bVar2);
                A listener2 = new A(sheetDelegateJ, i10);
                Intrinsics.checkNotNullParameter(listener2, "listener");
                bVar2.f6101a.add(listener2);
                Screen screen6 = getScreen();
                WeakHashMap weakHashMap = N.f16168a;
                E.n(screen6, bVar2);
            }
            N.t(getScreen(), new D(sheetDelegateJ, this));
        } else {
            Context context = getContext();
            if (context != null) {
                customAppBarLayout = new CustomAppBarLayout(context);
                customAppBarLayout.setBackgroundColor(0);
                customAppBarLayout.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
            } else {
                customAppBarLayout = null;
            }
            this.f25347j = customAppBarLayout;
            ScreensCoordinatorLayout screensCoordinatorLayout4 = this.f25342C;
            if (screensCoordinatorLayout4 == null) {
                Intrinsics.n("coordinatorLayout");
                throw null;
            }
            screensCoordinatorLayout4.addView(customAppBarLayout);
            if (this.f25349p && (customAppBarLayout3 = this.f25347j) != null) {
                customAppBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.f25348o;
            if (toolbar != null && (customAppBarLayout2 = this.f25347j) != null) {
                p118hf.a.H(toolbar);
                customAppBarLayout2.addView(toolbar);
            }
            setHasOptionsMenu(true);
        }
        ScreensCoordinatorLayout screensCoordinatorLayout5 = this.f25342C;
        if (screensCoordinatorLayout5 != null) {
            return screensCoordinatorLayout5;
        }
        Intrinsics.n("coordinatorLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        int iOrdinal = getScreen().stackPresentation.ordinal();
        if ((iOrdinal != 2 && iOrdinal != 3) || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.isHeaderHidden)) {
            k(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view = this.f25351w;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        PackageManager packageManager;
        Context context = getContext();
        if (context != null && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
            View screen = getScreen();
            while (true) {
                if (screen == null) {
                    screen = null;
                    break;
                } else if (screen.isFocused()) {
                    break;
                } else {
                    screen = screen instanceof ViewGroup ? ((ViewGroup) screen).getFocusedChild() : null;
                }
            }
            this.f25351w = screen;
        }
        super.onStop();
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void onViewAnimationEnd() {
        f(true);
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ScreenStack) {
            ScreenStack screenStack = (ScreenStack) parent;
            if (!screenStack.f25330A) {
                screenStack.j();
            }
        }
        Screen screen = getScreen();
        if (screen.isBeingRemoved) {
            screen.isBeingRemoved = false;
            Screen.b(screen);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final void removeToolbar() {
        Toolbar toolbar;
        CustomAppBarLayout customAppBarLayout = this.f25347j;
        if (customAppBarLayout != null && (toolbar = this.f25348o) != null && toolbar.getParent() == customAppBarLayout) {
            customAppBarLayout.removeView(toolbar);
        }
        this.f25348o = null;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final void setToolbar(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        CustomAppBarLayout customAppBarLayout = this.f25347j;
        if (customAppBarLayout != null) {
            customAppBarLayout.addView(toolbar);
        }
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.f25348o = toolbar;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final void setToolbarShadowHidden(boolean z3) {
        if (this.f25349p != z3) {
            CustomAppBarLayout customAppBarLayout = this.f25347j;
            if (customAppBarLayout != null) {
                customAppBarLayout.setElevation(z3 ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            CustomAppBarLayout customAppBarLayout2 = this.f25347j;
            if (customAppBarLayout2 != null) {
                customAppBarLayout2.setStateListAnimator(null);
            }
            this.f25349p = z3;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public final void setToolbarTranslucent(boolean z3) {
        if (this.t != z3) {
            ViewGroup.LayoutParams layoutParams = getScreen().getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((androidx.coordinatorlayout.widget.c) layoutParams).b(z3 ? null : new AppBarLayout.ScrollingViewBehavior());
            this.t = z3;
        }
    }
}

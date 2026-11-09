package com.swmansion.rnscreens.stack.views;

import M7.C0448h;
import Ub.b;
import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.camera.core.impl.utils.executor.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.ScreenStackFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p009a8.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/ScreensCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "a", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getFragment$react_native_screens_release", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "fragment", "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", ViewProps.POINTER_EVENTS, "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreensCoordinatorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreensCoordinatorLayout.kt\ncom/swmansion/rnscreens/stack/views/ScreensCoordinatorLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class ScreensCoordinatorLayout extends CoordinatorLayout implements ReactPointerEventsView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ScreenStackFragment fragment;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0448h f25477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f25478c;

    public ScreensCoordinatorLayout(Context context, ScreenStackFragment fragment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C0448h pointerEventsImpl = new C0448h(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        super(context);
        this.fragment = fragment;
        this.f25477b = pointerEventsImpl;
        this.f25478c = new b(this, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getFragment$react_native_screens_release, reason: from getter */
    public final ScreenStackFragment getFragment() {
        return this.fragment;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return (PointerEvents) this.f25477b.f5820b;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        ScreenStackFragment screenStackFragment = this.fragment;
        if (g.N(screenStackFragment.getScreen())) {
            screenStackFragment.getScreen().d(z3);
        }
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ScreenStackFragment screenStackFragment = this.fragment;
        a aVar = new a(screenStackFragment);
        aVar.setDuration(animation.getDuration());
        boolean z3 = animation instanceof AnimationSet;
        b bVar = this.f25478c;
        if (z3 && !screenStackFragment.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(aVar);
            animationSet.setAnimationListener(bVar);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(aVar);
        animationSet2.setAnimationListener(bVar);
        super.startAnimation(animationSet2);
    }
}

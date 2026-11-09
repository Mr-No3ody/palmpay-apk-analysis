package com.swmansion.rnscreens;

import D.b;
import M7.v;
import O7.C0486d;
import O7.C0496n;
import O7.p;
import O7.r;
import O7.u;
import O7.w;
import O7.y;
import Z4.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "<init>", "()V", "M7/v", "ScreensFrameLayout", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n1#2:354\n774#3:355\n865#3,2:356\n1869#3,2:358\n*S KotlinDebug\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n*L\n233#1:355\n233#1:356,2\n233#1:358,2\n*E\n"})
public class ScreenFragment extends Fragment implements ScreenFragmentWrapper {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25321i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Screen f25322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25328g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment$ScreensFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreensFrameLayout extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreensFrameLayout(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short getCoalescingKey(float f10) {
            int i7;
            if (f10 == 0.0f) {
                i7 = 1;
            } else {
                i7 = f10 == 1.0f ? 2 : 3;
            }
            return (short) i7;
        }

        private a() {
        }
    }

    public ScreenFragment() {
        this.f25323b = new ArrayList();
        this.f25325d = -1.0f;
        this.f25326e = true;
        this.f25327f = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void addChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f25323b.add(container);
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final boolean canDispatchLifecycleEvent(v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            return this.f25327f;
        }
        if (iOrdinal == 1) {
            return this.f25326e;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new l();
            }
            if (this.f25326e) {
                return false;
            }
        } else if (this.f25327f) {
            return false;
        }
        return true;
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final void dispatchHeaderBackButtonClickedEvent() {
        Context context = getScreen().getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C0486d(surfaceId, getScreen().getId()));
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final void dispatchLifecycleEvent(v event, ScreenFragmentWrapper fragmentWrapper) {
        Event<?> c0496n;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        Fragment fragment = fragmentWrapper.getFragment();
        if (fragment instanceof ScreenStackFragment) {
            ScreenStackFragment screenStackFragment = (ScreenStackFragment) fragment;
            if (screenStackFragment.canDispatchLifecycleEvent(event)) {
                Screen screen = screenStackFragment.getScreen();
                fragmentWrapper.updateLastEventDispatched(event);
                int surfaceId = UIManagerHelper.getSurfaceId(screen);
                int iOrdinal = event.ordinal();
                if (iOrdinal == 0) {
                    c0496n = new C0496n(surfaceId, screen.getId());
                } else if (iOrdinal == 1) {
                    c0496n = new w(surfaceId, screen.getId());
                } else if (iOrdinal == 2) {
                    c0496n = new p(surfaceId, screen.getId());
                } else {
                    if (iOrdinal != 3) {
                        throw new l();
                    }
                    c0496n = new y(surfaceId, screen.getId());
                }
                Context context = getScreen().getContext();
                Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(c0496n);
                }
                fragmentWrapper.dispatchLifecycleEventInChildContainers(event);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final void dispatchLifecycleEventInChildContainers(v event) {
        ScreenFragmentWrapper fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        ArrayList arrayList = this.f25323b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ScreenContainer) obj).getScreenCount() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Screen topScreen = ((ScreenContainer) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                dispatchLifecycleEvent(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final void dispatchTransitionProgressEvent(float f10, boolean z3) {
        if (!(this instanceof ScreenStackFragment) || this.f25325d == f10) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f10));
        this.f25325d = fMax;
        short coalescingKey = f25321i.getCoalescingKey(fMax);
        ScreenStackFragment screenStackFragment = (ScreenStackFragment) this;
        ScreenContainer container = screenStackFragment.getScreen().getContainer();
        boolean goingForward = container instanceof ScreenStack ? ((ScreenStack) container).getGoingForward() : false;
        Context context = screenStackFragment.getScreen().getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, screenStackFragment.getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new u(UIManagerHelper.getSurfaceId(reactContext), screenStackFragment.getScreen().getId(), this.f25325d, z3, goingForward, coalescingKey));
        }
    }

    public final void f(boolean z3) {
        this.f25328g = !z3;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof ScreenFragment) && !((ScreenFragment) parentFragment).f25328g)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new b(z3, this, 1));
            } else if (z3) {
                dispatchLifecycleEvent(v.f5858c, this);
                dispatchTransitionProgressEvent(1.0f, true);
            } else {
                dispatchLifecycleEvent(v.f5859d, this);
                dispatchTransitionProgressEvent(0.0f, true);
            }
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final List getChildScreenContainers() {
        return this.f25323b;
    }

    @Override // com.swmansion.rnscreens.FragmentHolder
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final Screen getScreen() {
        Screen screen = this.f25322a;
        if (screen != null) {
            return screen;
        }
        Intrinsics.n("screen");
        throw null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public boolean isTranslucent() {
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        E activity = getActivity();
        if (activity == null) {
            this.f25324c = true;
        } else {
            e.P(getScreen(), activity, tryGetContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getScreen().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        ScreensFrameLayout screensFrameLayout = new ScreensFrameLayout(context);
        Screen screen = getScreen();
        p118hf.a.H(screen);
        screensFrameLayout.addView(screen);
        return screensFrameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ScreenContainer container = getScreen().getContainer();
        if (container == null || !container.c(getScreen().getFragmentWrapper())) {
            Context context = getScreen().getContext();
            if (context instanceof ReactContext) {
                int surfaceId = UIManagerHelper.getSurfaceId(context);
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new r(surfaceId, getScreen().getId()));
                }
            }
        }
        this.f25323b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f25324c) {
            this.f25324c = false;
            e.P(getScreen(), tryGetActivity(), tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
        f(true);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void onViewAnimationStart() {
        f(false);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void removeChildScreenContainer(ScreenContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f25323b.remove(container);
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void setScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        this.f25322a = screen;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final Activity tryGetActivity() {
        Fragment fragment;
        E activity;
        E activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = getScreen().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof Screen) && (fragment = ((Screen) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenFragmentWrapper
    public final ReactContext tryGetContext() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (getScreen().getContext() instanceof ReactContext) {
            Context context2 = getScreen().getContext();
            Intrinsics.f(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen = (Screen) container;
                if (screen.getContext() instanceof ReactContext) {
                    Context context3 = screen.getContext();
                    Intrinsics.f(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenEventDispatcher
    public final void updateLastEventDispatched(v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            this.f25327f = false;
            return;
        }
        if (iOrdinal == 1) {
            this.f25326e = false;
        } else if (iOrdinal == 2) {
            this.f25327f = true;
        } else {
            if (iOrdinal != 3) {
                throw new l();
            }
            this.f25326e = true;
        }
    }

    public ScreenFragment(Screen screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.f25323b = new ArrayList();
        this.f25325d = -1.0f;
        this.f25326e = true;
        this.f25327f = true;
        setScreen(screenView);
    }
}

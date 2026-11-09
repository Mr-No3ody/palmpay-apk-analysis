package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.F;
import androidx.core.view.N;
import androidx.core.view.q0;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p050d8.b;
import p050d8.c;
import p050d8.d;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", ViewProps.FONT_SIZE, "", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenDummyLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenDummyLayoutHelper.kt\ncom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f25479o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static WeakReference f25480p = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoordinatorLayout f25481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppBarLayout f25482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Toolbar f25483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f25486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f25487g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f25488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f25489j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @DoNotStrip
        @Nullable
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f25480p.get();
        }

        private a() {
        }
    }

    @DoNotStrip
    private final synchronized float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.f25489j) {
            Object obj = this.f25487g.get();
            if (obj == null) {
                throw new IllegalArgumentException("[RNScreens] Context was null-ed before dummy layout was initialized");
            }
            if (!b((ReactApplicationContext) obj)) {
                Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
                return 0.0f;
            }
        }
        b bVar = this.f25486f;
        c key = new c(fontSize, isTitleEmpty);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = bVar.f35544a;
        if (cVar.f35546a != Integer.MIN_VALUE && cVar.equals(key)) {
            return this.f25486f.f35545b;
        }
        CoordinatorLayout coordinatorLayout = this.f25481a;
        AppBarLayout appBarLayout = this.f25482b;
        Toolbar toolbar = this.f25483c;
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f25487g.get();
        Activity currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        if (coordinatorLayout != null && appBarLayout != null && toolbar != null && currentActivity != null) {
            View decorView = currentActivity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            Intrinsics.checkNotNullParameter(decorView, "decorView");
            WeakHashMap weakHashMap = N.f16168a;
            q0 q0VarA = F.a(decorView);
            int i7 = q0VarA == null ? 0 : q0VarA.f16277a.g(135).f16059b;
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            if (isTitleEmpty) {
                toolbar.setTitle("");
                toolbar.setContentInsetStartWithNavigation(0);
            } else {
                toolbar.setTitle("FontSize123!#$");
                toolbar.setContentInsetStartWithNavigation(this.f25485e);
            }
            TextView textViewFindTitleTextViewInToolbar = ScreenStackHeaderConfig.f25352v0.findTitleTextViewInToolbar(toolbar);
            if (textViewFindTitleTextViewInToolbar != null) {
                textViewFindTitleTextViewInToolbar.setTextSize(fontSize != -1 ? fontSize : this.f25484d);
            }
            coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            coordinatorLayout.layout(0, 0, width, height);
            float dIPFromPixel = PixelUtil.toDIPFromPixel(appBarLayout.getHeight() + i7);
            this.f25486f = new b(new c(fontSize, isTitleEmpty), dIPFromPixel);
            return dIPFromPixel;
        }
        return 0.0f;
    }

    @JvmStatic
    @DoNotStrip
    @Nullable
    public static final ScreenDummyLayoutHelper getInstance() {
        return f25479o.getInstance();
    }

    public final void a(Activity activity) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(activity);
        AppBarLayout appBarLayout = new AppBarLayout(activity);
        appBarLayout.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -2));
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        TextView textViewFindTitleTextViewInToolbar = ScreenStackHeaderConfig.f25352v0.findTitleTextViewInToolbar(toolbar);
        if (textViewFindTitleTextViewInToolbar == null) {
            throw new IllegalStateException("[RNScreens] Failed to find TextView in children of Toolbar");
        }
        this.f25484d = textViewFindTitleTextViewInToolbar.getTextSize();
        this.f25485e = toolbar.getContentInsetStartWithNavigation();
        appBarLayout.addView(toolbar);
        View view = new View(activity);
        view.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
        coordinatorLayout.addView(appBarLayout);
        coordinatorLayout.addView(view);
        this.f25481a = coordinatorLayout;
        this.f25482b = appBarLayout;
        this.f25483c = toolbar;
        this.f25489j = true;
    }

    public final boolean b(ReactApplicationContext reactApplicationContext) {
        if (this.f25489j) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.f25489j) {
                return true;
            }
            a(currentActivity);
            if (this.f25488i == null) {
                this.f25488i = new d(currentActivity, this);
                currentActivity.getApplication().registerActivityLifecycleCallbacks(this.f25488i);
            }
            Unit unit = Unit.f38893a;
            return true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f25487g.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        com.transsnet.palmpay.managemoney.ui.view.c cVar = new com.transsnet.palmpay.managemoney.ui.view.c(1);
        Object obj = this.f25487g.get();
        if (obj == null) {
            throw new IllegalArgumentException(cVar.invoke().toString());
        }
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
        if (b(reactApplicationContext)) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }
}

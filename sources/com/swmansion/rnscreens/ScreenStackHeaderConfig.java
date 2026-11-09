package com.swmansion.rnscreens;

import Je.l;
import M7.C0448h;
import M7.F;
import M7.G;
import O7.C0484b;
import O7.C0488f;
import Z4.e;
import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0824b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001YB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b(\u0010\u000bR\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00101\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u001eR\"\u00105\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u0010\u001eR\"\u00108\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00100\u001a\u0004\b8\u00102\"\u0004\b9\u0010\u001eR\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0011\u0010B\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0011\u0010F\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bK\u0010AR\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010X\u001a\u0004\u0018\u00010U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/swmansion/rnscreens/FabricEnabledHeaderConfigViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "fontWeightString", "setTitleFontWeight", "", "titleFontSize", "setTitleFontSize", "(F)V", "", ViewProps.COLOR, "setTitleColor", "(I)V", "setTintColor", "setBackgroundColor", "(Ljava/lang/Integer;)V", "", "hideShadow", "setHideShadow", "(Z)V", "hideBackButton", "setHideBackButton", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "Lcom/swmansion/rnscreens/CustomToolbar;", "i", "Lcom/swmansion/rnscreens/CustomToolbar;", "getToolbar", "()Lcom/swmansion/rnscreens/CustomToolbar;", "toolbar", "j", "Z", "isHeaderHidden", "()Z", "setHeaderHidden", "o", "isHeaderTranslucent", "setHeaderTranslucent", "t0", "isTitleEmpty", "setTitleEmpty", "LM7/F;", "u0", "LM7/F;", "getHeaderHeightUpdateProxy", "()LM7/F;", "headerHeightUpdateProxy", "getPreferredContentInsetStart", "()I", "preferredContentInsetStart", "getPreferredContentInsetEnd", "preferredContentInsetEnd", "getPreferredContentInsetStartWithNavigation", "preferredContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getScreenFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "screenFragment", "getConfigSubviewsCount", "configSubviewsCount", "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", ViewProps.POINTER_EVENTS, "Lcom/swmansion/rnscreens/Screen;", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "screen", "Lcom/swmansion/rnscreens/ScreenStack;", "getScreenStack", "()Lcom/swmansion/rnscreens/ScreenStack;", "screenStack", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackHeaderConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackHeaderConfig.kt\ncom/swmansion/rnscreens/ScreenStackHeaderConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n295#2,2:479\n1#3:481\n*S KotlinDebug\n*F\n+ 1 ScreenStackHeaderConfig.kt\ncom/swmansion/rnscreens/ScreenStackHeaderConfig\n*L\n126#1:479,2\n*E\n"})
public final class ScreenStackHeaderConfig extends FabricEnabledHeaderConfigViewGroup implements ReactPointerEventsView {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final a f25352v0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f25353A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f25354B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Integer f25355C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f25356H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f25357L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f25358M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f25359Q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0448h f25360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25361g;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final CustomToolbar toolbar;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isHeaderHidden;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f25364k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isHeaderTranslucent;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f25366p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f25367p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f25368q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f25369r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final l f25370s0;
    public int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public boolean isTitleEmpty;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final F headerHeightUpdateProxy;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f25373v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f25374w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TextView findTitleTextViewInToolbar(@NotNull Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = toolbar.getChildAt(i7);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    public ScreenStackHeaderConfig(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0448h pointerEventsImpl = new C0448h(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        super(context);
        this.f25360f = pointerEventsImpl;
        this.f25361g = new ArrayList(3);
        this.f25370s0 = new l(this, 12);
        this.headerHeightUpdateProxy = new F();
        setVisibility(8);
        CustomToolbar customToolbar = new CustomToolbar(context, this);
        this.toolbar = customToolbar;
        this.f25368q0 = customToolbar.getContentInsetStart();
        this.f25369r0 = customToolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            customToolbar.setBackgroundColor(typedValue.data);
        }
        customToolbar.setClipChildren(false);
    }

    public static void a(ScreenStackHeaderConfig screenStackHeaderConfig) {
        ScreenStackFragment screenFragment = screenStackHeaderConfig.getScreenFragment();
        if (screenFragment != null) {
            ScreenStack screenStack = screenStackHeaderConfig.getScreenStack();
            if (screenStack == null || !Intrinsics.c(screenStack.getRootScreen(), screenFragment.getScreen())) {
                if (screenFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.dismissFromContainer();
                    return;
                } else {
                    screenFragment.dispatchHeaderBackButtonClickedEvent();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof ScreenStackFragment) {
                ScreenStackFragment screenStackFragment = (ScreenStackFragment) parentFragment;
                if (screenStackFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                    screenStackFragment.dismissFromContainer();
                } else {
                    screenStackFragment.dispatchHeaderBackButtonClickedEvent();
                }
            }
        }
    }

    private final Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        Screen screen = getScreen();
        ScreenContainer container = screen != null ? screen.getContainer() : null;
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    public final void b() {
        Screen screen;
        if (getParent() == null || this.f25358M || (screen = getScreen()) == null || screen.isBeingRemoved) {
            return;
        }
        d();
    }

    public final void c(CustomToolbar toolbar, boolean z3) {
        int iMax;
        Object next;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (z3) {
            if (toolbar.getNavigationIcon() != null) {
                iMax = toolbar.getPaddingStart() + toolbar.getCurrentContentInsetStart();
            } else {
                iMax = Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            }
            Iterator it = this.f25361g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ScreenStackHeaderSubview) next).getType() != G.f5785a);
            ScreenStackHeaderSubview screenStackHeaderSubview = (ScreenStackHeaderSubview) next;
            if (screenStackHeaderSubview != null) {
                iMax = screenStackHeaderSubview.getLeft();
            }
            int paddingEnd = toolbar.getPaddingEnd() + toolbar.getCurrentContentInsetEnd();
            this.headerHeightUpdateProxy.a(this, getScreen());
            int width = toolbar.getWidth();
            int height = toolbar.getHeight();
            float dIPFromPixel = PixelUtil.toDIPFromPixel(width);
            float dIPFromPixel2 = PixelUtil.toDIPFromPixel(height);
            float dIPFromPixel3 = PixelUtil.toDIPFromPixel(iMax);
            float dIPFromPixel4 = PixelUtil.toDIPFromPixel(paddingEnd);
            if (Math.abs(this.f25260b - dIPFromPixel) >= 0.9f || Math.abs(this.f25261c - dIPFromPixel2) >= 0.9f || Math.abs(this.f25262d - dIPFromPixel3) >= 0.9f || Math.abs(this.f25263e - dIPFromPixel4) >= 0.9f) {
                this.f25260b = dIPFromPixel;
                this.f25261c = dIPFromPixel2;
                this.f25262d = dIPFromPixel3;
                this.f25263e = dIPFromPixel4;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("frameWidth", dIPFromPixel);
                writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
                writableNativeMap.putDouble(ViewProps.PADDING_START, dIPFromPixel3);
                writableNativeMap.putDouble(ViewProps.PADDING_END, dIPFromPixel4);
                StateWrapper stateWrapper = this.f25259a;
                if (stateWrapper != null) {
                    stateWrapper.updateState(writableNativeMap);
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        Drawable navigationIcon;
        ScreenStackFragment screenFragment;
        ScreenStackFragment screenFragment2;
        ReactContext reactContextTryGetContext;
        ScreenStack screenStack = getScreenStack();
        boolean z3 = screenStack == null || Intrinsics.c(screenStack.getTopScreen(), getParent());
        if (this.f25367p0 && z3 && !this.f25358M) {
            ScreenStackFragment screenFragment3 = getScreenFragment();
            AbstractActivityC0837o abstractActivityC0837o = (AbstractActivityC0837o) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (abstractActivityC0837o == null) {
                return;
            }
            String str = this.f25374w;
            CustomToolbar customToolbar = this.toolbar;
            if (str != null) {
                if (str.equals("rtl")) {
                    customToolbar.setLayoutDirection(1);
                } else if (Intrinsics.c(this.f25374w, "ltr")) {
                    customToolbar.setLayoutDirection(0);
                }
            }
            Screen screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextTryGetContext = (ReactContext) context;
                } else {
                    ScreenFragmentWrapper fragmentWrapper = screen.getFragmentWrapper();
                    reactContextTryGetContext = fragmentWrapper != null ? fragmentWrapper.tryGetContext() : null;
                }
                e.P(screen, abstractActivityC0837o, reactContextTryGetContext);
            }
            boolean z8 = this.isHeaderHidden;
            F f10 = this.headerHeightUpdateProxy;
            if (z8) {
                if (customToolbar.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.removeToolbar();
                }
                f10.a(this, getScreen());
                return;
            }
            if (customToolbar.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.setToolbar(customToolbar);
            }
            abstractActivityC0837o.setSupportActionBar(customToolbar);
            AbstractC0824b supportActionBar = abstractActivityC0837o.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ScreenStackFragment screenFragment4 = getScreenFragment();
            supportActionBar.p((screenFragment4 == null || !screenFragment4.canNavigateBack() || this.f25356H) ? false : true);
            supportActionBar.u(this.f25366p);
            if (TextUtils.isEmpty(this.f25366p)) {
                this.isTitleEmpty = true;
            }
            ScreenStackHeaderConfig screenStackHeaderConfig = customToolbar.config;
            customToolbar.setContentInsetStartWithNavigation(screenStackHeaderConfig.getPreferredContentInsetStartWithNavigation());
            customToolbar.setContentInsetsRelative(screenStackHeaderConfig.getPreferredContentInsetStart(), screenStackHeaderConfig.getF25368q0());
            customToolbar.setNavigationOnClickListener(this.f25370s0);
            ScreenStackFragment screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.setToolbarShadowHidden(this.f25357L);
            }
            ScreenStackFragment screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.setToolbarTranslucent(this.isHeaderTranslucent);
            }
            TextView textViewFindTitleTextViewInToolbar = f25352v0.findTitleTextViewInToolbar(customToolbar);
            int i7 = this.t;
            if (i7 != 0) {
                customToolbar.setTitleTextColor(i7);
            }
            if (textViewFindTitleTextViewInToolbar != null) {
                String str2 = this.f25373v;
                if (str2 != null || this.f25354B > 0) {
                    int i10 = this.f25354B;
                    AssetManager assets = getContext().getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    textViewFindTitleTextViewInToolbar.setTypeface(ReactTypefaceUtils.applyStyles(null, 0, i10, str2, assets));
                }
                float f11 = this.f25353A;
                if (f11 > 0.0f) {
                    textViewFindTitleTextViewInToolbar.setTextSize(f11);
                }
            }
            Integer num = this.f25355C;
            if (num != null) {
                customToolbar.setBackgroundColor(num.intValue());
            }
            if (this.f25364k0 != 0 && (navigationIcon = customToolbar.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f25364k0, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = customToolbar.getChildCount() - 1; -1 < childCount; childCount--) {
                if (customToolbar.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                    customToolbar.removeViewAt(childCount);
                }
            }
            ArrayList arrayList = this.f25361g;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ScreenStackHeaderSubview screenStackHeaderSubview = (ScreenStackHeaderSubview) obj;
                G type = screenStackHeaderSubview.getType();
                if (type == G.f5788d) {
                    View childAt = screenStackHeaderSubview.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.s(imageView.getDrawable());
                } else {
                    Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-1);
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        if (!this.f25359Q) {
                            customToolbar.setNavigationIcon((Drawable) null);
                        }
                        customToolbar.setTitle((CharSequence) null);
                        layoutParams.f12075a = 8388611;
                    } else if (iOrdinal == 1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                        layoutParams.f12075a = 1;
                        customToolbar.setTitle((CharSequence) null);
                    } else if (iOrdinal == 2) {
                        layoutParams.f12075a = 8388613;
                    }
                    screenStackHeaderSubview.setLayoutParams(layoutParams);
                    customToolbar.addView(screenStackHeaderSubview);
                }
            }
            f10.a(this, getScreen());
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f25361g.size();
    }

    @NotNull
    public final F getHeaderHeightUpdateProxy() {
        return this.headerHeightUpdateProxy;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return (PointerEvents) this.f25360f.f5820b;
    }

    /* JADX INFO: renamed from: getPreferredContentInsetEnd, reason: from getter */
    public final int getF25368q0() {
        return this.f25368q0;
    }

    public final int getPreferredContentInsetStart() {
        return this.f25368q0;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.isTitleEmpty) {
            return 0;
        }
        return this.f25369r0;
    }

    @Nullable
    public final ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        Fragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    @NotNull
    public final CustomToolbar getToolbar() {
        return this.toolbar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25367p0 = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C0484b(surfaceId, getId()));
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25367p0 = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C0488f(surfaceId, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    public final void setBackButtonInCustomView(boolean backButtonInCustomView) {
        this.f25359Q = backButtonInCustomView;
    }

    public final void setBackgroundColor(@Nullable Integer color) {
        this.f25355C = color;
    }

    public final void setDirection(@Nullable String direction) {
        this.f25374w = direction;
    }

    public final void setHeaderHidden(boolean z3) {
        this.isHeaderHidden = z3;
    }

    public final void setHeaderTranslucent(boolean z3) {
        this.isHeaderTranslucent = z3;
    }

    public final void setHidden(boolean hidden) {
        this.isHeaderHidden = hidden;
    }

    public final void setHideBackButton(boolean hideBackButton) {
        this.f25356H = hideBackButton;
    }

    public final void setHideShadow(boolean hideShadow) {
        this.f25357L = hideShadow;
    }

    public final void setTintColor(int color) {
        this.f25364k0 = color;
    }

    public final void setTitle(@Nullable String title) {
        this.f25366p = title;
    }

    public final void setTitleColor(int color) {
        this.t = color;
    }

    public final void setTitleEmpty(boolean z3) {
        this.isTitleEmpty = z3;
    }

    public final void setTitleFontFamily(@Nullable String titleFontFamily) {
        this.f25373v = titleFontFamily;
    }

    public final void setTitleFontSize(float titleFontSize) {
        this.f25353A = titleFontSize;
    }

    public final void setTitleFontWeight(@Nullable String fontWeightString) {
        this.f25354B = ReactTypefaceUtils.parseFontWeight(fontWeightString);
    }

    public final void setTranslucent(boolean translucent) {
        this.isHeaderTranslucent = translucent;
    }
}

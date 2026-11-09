package com.swmansion.rnscreens.gamma.tabs;

import V7.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rJ\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010(\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R/\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R/\u00103\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u00107\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010%\u001a\u0004\b5\u00100\"\u0004\b6\u00102R/\u0010;\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R/\u0010?\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010%\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R/\u0010C\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010%\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R/\u0010J\u001a\u0004\u0018\u00010D2\b\u0010#\u001a\u0004\u0018\u00010D8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010%\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR*\u0010X\u001a\u00020K2\u0006\u0010\u001b\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010M\u001a\u0004\bX\u0010O\"\u0004\bY\u0010Q¨\u0006Z"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;", "Landroid/view/ViewGroup;", "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;", "delegate", "", "setTabScreenDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V", "setTabScreenDelegate", "Landroidx/fragment/app/Fragment;", "getAssociatedFragment", "()Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "a", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "LV7/c;", "c", "LV7/c;", "getEventEmitter$react_native_screens_release", "()LV7/c;", "setEventEmitter$react_native_screens_release", "(LV7/c;)V", "eventEmitter", "", "value", "d", "Ljava/lang/String;", "getTabKey", "()Ljava/lang/String;", "setTabKey", "(Ljava/lang/String;)V", "tabKey", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "getTabTitle", "setTabTitle", "tabTitle", "f", "getBadgeValue", "setBadgeValue", "badgeValue", "", "g", "getTabBarItemBadgeTextColor", "()Ljava/lang/Integer;", "setTabBarItemBadgeTextColor", "(Ljava/lang/Integer;)V", "tabBarItemBadgeTextColor", "i", "getTabBarItemBadgeBackgroundColor", "setTabBarItemBadgeBackgroundColor", "tabBarItemBadgeBackgroundColor", "j", "getTabBarItemTestID", "setTabBarItemTestID", "tabBarItemTestID", "o", "getTabBarItemAccessibilityLabel", "setTabBarItemAccessibilityLabel", "tabBarItemAccessibilityLabel", "p", "getDrawableIconResourceName", "setDrawableIconResourceName", "drawableIconResourceName", "Landroid/graphics/drawable/Drawable;", "t", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "", "v", "Z", "getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect", "()Z", "setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect", "(Z)V", "shouldUseRepeatedTabSelectionScrollToTopSpecialEffect", "w", "getShouldUseRepeatedTabSelectionPopToRootSpecialEffect", "setShouldUseRepeatedTabSelectionPopToRootSpecialEffect", "shouldUseRepeatedTabSelectionPopToRootSpecialEffect", "A", "isFocusedTab", "setFocusedTab", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabScreen.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreen\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n33#2,3:143\n33#2,3:146\n33#2,3:149\n33#2,3:152\n33#2,3:155\n33#2,3:158\n33#2,3:161\n33#2,3:164\n1#3:167\n*S KotlinDebug\n*F\n+ 1 TabScreen.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreen\n*L\n43#1:143,3\n48#1:146,3\n52#1:149,3\n56#1:152,3\n61#1:155,3\n65#1:158,3\n70#1:161,3\n76#1:164,3\n*E\n"})
public final class TabScreen extends ViewGroup implements FragmentProviding {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25422B;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public boolean isFocusedTab;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ThemedReactContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c eventEmitter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String tabKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.a f25428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.a f25429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V7.a f25430g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.a f25431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final V7.a f25432j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.a f25433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.a f25434p;
    public final V7.a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean shouldUseRepeatedTabSelectionScrollToTopSpecialEffect;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean shouldUseRepeatedTabSelectionPopToRootSpecialEffect;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("tabTitle", "getTabTitle()Ljava/lang/String;", TabScreen.class);
        G.f38952a.getClass();
        f25422B = new KProperty[]{rVar, new r("badgeValue", "getBadgeValue()Ljava/lang/String;", TabScreen.class), new r("tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", TabScreen.class), new r("tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", TabScreen.class), new r("tabBarItemTestID", "getTabBarItemTestID()Ljava/lang/String;", TabScreen.class), new r("tabBarItemAccessibilityLabel", "getTabBarItemAccessibilityLabel()Ljava/lang/String;", TabScreen.class), new r("drawableIconResourceName", "getDrawableIconResourceName()Ljava/lang/String;", TabScreen.class), new r("icon", "getIcon()Landroid/graphics/drawable/Drawable;", TabScreen.class)};
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabScreen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.f25425b = new WeakReference(null);
        this.f25428e = new V7.a(this, 0);
        this.f25429f = new V7.a(this, 1);
        this.f25430g = new V7.a(this, 2);
        this.f25431i = new V7.a(this, 3);
        this.f25432j = new V7.a(this, 4);
        this.f25433o = new V7.a(this, 5);
        this.f25434p = new V7.a(this, 6);
        this.t = new V7.a(this, 7);
        this.shouldUseRepeatedTabSelectionScrollToTopSpecialEffect = true;
        this.shouldUseRepeatedTabSelectionPopToRootSpecialEffect = true;
    }

    public static final void a(TabScreen tabScreen, Object obj, Object obj2) {
        TabScreenDelegate tabScreenDelegate;
        tabScreen.getClass();
        if (Intrinsics.c(obj2, obj) || (tabScreenDelegate = (TabScreenDelegate) tabScreen.f25425b.get()) == null) {
            return;
        }
        tabScreenDelegate.onMenuItemAttributesChange(tabScreen);
    }

    @Override // com.swmansion.rnscreens.gamma.common.FragmentProviding
    @Nullable
    public Fragment getAssociatedFragment() {
        TabScreenDelegate tabScreenDelegate = (TabScreenDelegate) this.f25425b.get();
        if (tabScreenDelegate != null) {
            return tabScreenDelegate.getFragmentForTabScreen(this);
        }
        return null;
    }

    @Nullable
    public final String getBadgeValue() {
        return (String) this.f25429f.getValue(this, f25422B[1]);
    }

    @Nullable
    public final String getDrawableIconResourceName() {
        return (String) this.f25434p.getValue(this, f25422B[6]);
    }

    @NotNull
    public final c getEventEmitter$react_native_screens_release() {
        c cVar = this.eventEmitter;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("eventEmitter");
        throw null;
    }

    @Nullable
    public final Drawable getIcon() {
        return (Drawable) this.t.getValue(this, f25422B[7]);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final boolean getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() {
        return this.shouldUseRepeatedTabSelectionPopToRootSpecialEffect;
    }

    public final boolean getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() {
        return this.shouldUseRepeatedTabSelectionScrollToTopSpecialEffect;
    }

    @Nullable
    public final String getTabBarItemAccessibilityLabel() {
        return (String) this.f25433o.getValue(this, f25422B[5]);
    }

    @Nullable
    public final Integer getTabBarItemBadgeBackgroundColor() {
        return (Integer) this.f25431i.getValue(this, f25422B[3]);
    }

    @Nullable
    public final Integer getTabBarItemBadgeTextColor() {
        return (Integer) this.f25430g.getValue(this, f25422B[2]);
    }

    @Nullable
    public final String getTabBarItemTestID() {
        return (String) this.f25432j.getValue(this, f25422B[4]);
    }

    @Nullable
    public final String getTabKey() {
        return this.tabKey;
    }

    @Nullable
    public final String getTabTitle() {
        return (String) this.f25428e.getValue(this, f25422B[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "TabScreen [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("TabScreen", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    public final void setBadgeValue(@Nullable String str) {
        this.f25429f.setValue(this, f25422B[1], str);
    }

    public final void setDrawableIconResourceName(@Nullable String str) {
        this.f25434p.setValue(this, f25422B[6], str);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.eventEmitter = cVar;
    }

    public final void setFocusedTab(boolean z3) {
        if (this.isFocusedTab != z3) {
            this.isFocusedTab = z3;
            TabScreenDelegate tabScreenDelegate = (TabScreenDelegate) this.f25425b.get();
            if (tabScreenDelegate != null) {
                tabScreenDelegate.onTabFocusChangedFromJS(this, this.isFocusedTab);
            }
        }
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.t.setValue(this, f25422B[7], drawable);
    }

    public final void setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(boolean z3) {
        this.shouldUseRepeatedTabSelectionPopToRootSpecialEffect = z3;
    }

    public final void setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(boolean z3) {
        this.shouldUseRepeatedTabSelectionScrollToTopSpecialEffect = z3;
    }

    public final void setTabBarItemAccessibilityLabel(@Nullable String str) {
        this.f25433o.setValue(this, f25422B[5], str);
    }

    public final void setTabBarItemBadgeBackgroundColor(@Nullable Integer num) {
        this.f25431i.setValue(this, f25422B[3], num);
    }

    public final void setTabBarItemBadgeTextColor(@Nullable Integer num) {
        this.f25430g.setValue(this, f25422B[2], num);
    }

    public final void setTabBarItemTestID(@Nullable String str) {
        this.f25432j.setValue(this, f25422B[4], str);
    }

    public final void setTabKey(@Nullable String str) {
        if (str != null && StringsKt.F(str)) {
            str = null;
        }
        this.tabKey = str;
    }

    public final void setTabScreenDelegate$react_native_screens_release(@Nullable TabScreenDelegate delegate) {
        this.f25425b = new WeakReference(delegate);
    }

    public final void setTabTitle(@Nullable String str) {
        this.f25428e.setValue(this, f25422B[0], str);
    }
}

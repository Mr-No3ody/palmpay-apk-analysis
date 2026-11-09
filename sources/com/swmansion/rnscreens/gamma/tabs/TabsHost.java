package com.swmansion.rnscreens.gamma.tabs;

import H0.f;
import M7.EnumC0454n;
import M7.s;
import N2.b;
import N8.C0457a;
import N8.q0;
import Pa.C0525w;
import V7.g;
import V7.h;
import V7.j;
import Y7.c;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.camera.core.impl.utils.n;
import androidx.core.view.P;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.safearea.SafeAreaProvider;
import com.swmansion.rnscreens.safearea.SafeAreaView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003qr\u0011J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010$\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R/\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010#R+\u0010+\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00102\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010#R/\u00109\u001a\u0004\u0018\u0001032\b\u0010\u001e\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u00106\"\u0004\b7\u00108R/\u0010=\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010#R/\u0010A\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010 \u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010#R/\u0010E\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010 \u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010#R/\u0010L\u001a\u0004\u0018\u00010F2\b\u0010\u001e\u001a\u0004\u0018\u00010F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010 \u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR/\u0010P\u001a\u0004\u0018\u00010F2\b\u0010\u001e\u001a\u0004\u0018\u00010F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010 \u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR/\u0010T\u001a\u0004\u0018\u0001032\b\u0010\u001e\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010 \u001a\u0004\bR\u00106\"\u0004\bS\u00108R/\u0010X\u001a\u0004\u0018\u0001032\b\u0010\u001e\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010 \u001a\u0004\bV\u00106\"\u0004\bW\u00108R/\u0010\\\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010 \u001a\u0004\bZ\u0010\u000f\"\u0004\b[\u0010#R/\u0010`\u001a\u0004\u0018\u0001032\b\u0010\u001e\u001a\u0004\u0018\u0001038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010 \u001a\u0004\b^\u00106\"\u0004\b_\u00108R+\u0010d\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010 \u001a\u0004\bb\u0010,\"\u0004\bc\u0010.R/\u0010h\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010 \u001a\u0004\bf\u0010\u000f\"\u0004\bg\u0010#R\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;", "Landroid/widget/FrameLayout;", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;", "Lcom/swmansion/rnscreens/safearea/SafeAreaProvider;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/swmansion/rnscreens/safearea/SafeAreaView;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnInterfaceInsetsChangeListener", "(Lcom/swmansion/rnscreens/safearea/SafeAreaView;)V", "LY7/b;", "getInterfaceInsets", "()LY7/b;", "", "getSelectedTabScreenFragmentId", "()Ljava/lang/Integer;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "a", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "LV7/j;", "g", "LV7/j;", "getEventEmitter$react_native_screens_release", "()LV7/j;", "setEventEmitter$react_native_screens_release", "(LV7/j;)V", "eventEmitter", "<set-?>", "A", "Lkotlin/properties/ReadWriteProperty;", "getTabBarBackgroundColor", "setTabBarBackgroundColor", "(Ljava/lang/Integer;)V", "tabBarBackgroundColor", "B", "getTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorColor", "tabBarItemActiveIndicatorColor", "", "C", "isTabBarItemActiveIndicatorEnabled", "()Z", "setTabBarItemActiveIndicatorEnabled", "(Z)V", "H", "getTabBarItemIconColor", "setTabBarItemIconColor", "tabBarItemIconColor", "", "L", "getTabBarItemTitleFontFamily", "()Ljava/lang/String;", "setTabBarItemTitleFontFamily", "(Ljava/lang/String;)V", "tabBarItemTitleFontFamily", "M", "getTabBarItemIconColorActive", "setTabBarItemIconColorActive", "tabBarItemIconColorActive", "Q", "getTabBarItemTitleFontColor", "setTabBarItemTitleFontColor", "tabBarItemTitleFontColor", "k0", "getTabBarItemTitleFontColorActive", "setTabBarItemTitleFontColorActive", "tabBarItemTitleFontColorActive", "", "p0", "getTabBarItemTitleFontSize", "()Ljava/lang/Float;", "setTabBarItemTitleFontSize", "(Ljava/lang/Float;)V", "tabBarItemTitleFontSize", TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, "getTabBarItemTitleFontSizeActive", "setTabBarItemTitleFontSizeActive", "tabBarItemTitleFontSizeActive", "r0", "getTabBarItemTitleFontWeight", "setTabBarItemTitleFontWeight", "tabBarItemTitleFontWeight", "s0", "getTabBarItemTitleFontStyle", "setTabBarItemTitleFontStyle", "tabBarItemTitleFontStyle", "t0", "getTabBarItemRippleColor", "setTabBarItemRippleColor", "tabBarItemRippleColor", "u0", "getTabBarItemLabelVisibilityMode", "setTabBarItemLabelVisibilityMode", "tabBarItemLabelVisibilityMode", "v0", "getTabBarHidden", "setTabBarHidden", "tabBarHidden", TransType.TRANS_TYPE_W0, "getNativeContainerBackgroundColor", "setNativeContainerBackgroundColor", "nativeContainerBackgroundColor", "Landroidx/fragment/app/Z;", "getRequireFragmentManager", "()Landroidx/fragment/app/Z;", "requireFragmentManager", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;", "getCurrentFocusedTab", "()Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;", "currentFocusedTab", "V7/g", "Pa/w", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabsHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsHost.kt\ncom/swmansion/rnscreens/gamma/tabs/TabsHost\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,563:1\n33#2,3:564\n33#2,3:567\n33#2,3:570\n33#2,3:573\n33#2,3:576\n33#2,3:579\n33#2,3:582\n33#2,3:585\n33#2,3:588\n33#2,3:591\n33#2,3:594\n33#2,3:597\n33#2,3:600\n33#2,3:603\n33#2,3:606\n33#2,3:609\n1#3:612\n1869#4,2:613\n808#4,11:615\n360#4,7:626\n360#4,7:633\n*S KotlinDebug\n*F\n+ 1 TabsHost.kt\ncom/swmansion/rnscreens/gamma/tabs/TabsHost\n*L\n170#1:564,3\n174#1:567,3\n178#1:570,3\n182#1:573,3\n186#1:576,3\n190#1:579,3\n194#1:582,3\n198#1:585,3\n202#1:588,3\n206#1:591,3\n210#1:594,3\n214#1:597,3\n218#1:600,3\n222#1:603,3\n226#1:606,3\n233#1:609,3\n331#1:613,2\n385#1:615,11\n475#1:626,7\n480#1:633,7\n*E\n"})
public final class TabsHost extends FrameLayout implements TabScreenDelegate, SafeAreaProvider, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25438y0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final h f25439A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final h f25440B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final h f25441C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final h f25442H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final h f25443L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final h f25444M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final h f25445Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ThemedReactContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f25447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0525w f25448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContextThemeWrapper f25449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BottomNavigationView f25450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f25451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public j eventEmitter;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z f25453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f25454j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final h f25455k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f25456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25457p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final h f25458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final h f25459q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h f25460r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final h f25461s0;
    public SafeAreaView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final h f25462t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final h f25463u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final top.zibin.luban.io.a f25464v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final h f25465v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f25466w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final h f25467w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final f f25468x0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", TabsHost.class);
        G.f38952a.getClass();
        f25438y0 = new KProperty[]{rVar, new r("tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", TabsHost.class), new r("isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", TabsHost.class), new r("tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", TabsHost.class), new r("tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", TabsHost.class), new r("tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", TabsHost.class), new r("tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", TabsHost.class), new r("tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", TabsHost.class), new r("tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", TabsHost.class), new r("tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", TabsHost.class), new r("tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", TabsHost.class), new r("tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", TabsHost.class), new r("tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", TabsHost.class), new r("tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", TabsHost.class), new r("tabBarHidden", "getTabBarHidden()Z", TabsHost.class), new r("nativeContainerBackgroundColor", "getNativeContainerBackgroundColor()Ljava/lang/Integer;", TabsHost.class)};
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabsHost(ThemedReactContext reactContext) {
        super(reactContext);
        int i7 = 10;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        g gVar = new g();
        gVar.f10099d = this;
        this.f25447b = gVar;
        this.f25448c = new C0525w(this, i7);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(reactContext, R.style.Theme_Material3_DayNight_NoActionBar);
        this.f25449d = contextThemeWrapper;
        BottomNavigationView bottomNavigationView = new BottomNavigationView(contextThemeWrapper);
        bottomNavigationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f25450e = bottomNavigationView;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b bVar = R7.a.f7933a;
        frameLayout.setId(R7.a.f7933a.generateViewId());
        this.f25451f = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.f25454j = arrayList;
        this.f25464v = new top.zibin.luban.io.a(contextThemeWrapper, bottomNavigationView, arrayList);
        this.f25466w = new d(bottomNavigationView, arrayList);
        this.f25439A = new h(this, 7, false);
        this.f25440B = new h(this, 8, 0 == true ? 1 : 0);
        this.f25441C = new h(this, 9);
        this.f25442H = new h(this, i7, 0 == true ? 1 : 0);
        this.f25443L = new h(this, 11, 0 == true ? 1 : 0);
        this.f25444M = new h(this, 12, 0 == true ? 1 : 0);
        this.f25445Q = new h(this, 13, 0 == true ? 1 : 0);
        this.f25455k0 = new h(this, 14, 0 == true ? 1 : 0);
        this.f25458p0 = new h(this, 15, 0 == true ? 1 : 0);
        this.f25459q0 = new h(this, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        this.f25460r0 = new h(this, 1, 0 == true ? 1 : 0);
        this.f25461s0 = new h(this, 2, 0 == true ? 1 : 0);
        this.f25462t0 = new h(this, 3, 0 == true ? 1 : 0);
        this.f25463u0 = new h(this, 4, 0 == true ? 1 : 0);
        this.f25465v0 = new h(this, 5);
        this.f25467w0 = new h(this, 6, 0 == true ? 1 : 0);
        addView(frameLayout);
        addView(bottomNavigationView);
        bottomNavigationView.addOnLayoutChangeListener(new V7.d());
        bottomNavigationView.setOnItemSelectedListener(new C0457a(this, 28));
        this.f25468x0 = new f(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127 A[LOOP:4: B:47:0x0111->B:55:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x012c A[EDGE_INSN: B:82:0x012c->B:56:0x012c BREAK  A[LOOP:4: B:47:0x0111->B:55:0x0127], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x012c A[EDGE_INSN: B:83:0x012c->B:56:0x012c BREAK  A[LOOP:4: B:47:0x0111->B:55:0x0127], SYNTHETIC] */
    public static void a(TabsHost tabsHost, MenuItem item) {
        String tabKey;
        TabScreen tabScreen;
        ViewGroup viewGroup;
        ScreenStack screenStack;
        int iNextIndex;
        Intrinsics.checkNotNullParameter(item, "item");
        String message = "Item selected " + item;
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        TabScreenFragment tabScreenFragment = (TabScreenFragment) CollectionsKt.G(item.getItemId(), tabsHost.f25454j);
        boolean z3 = false;
        if (Intrinsics.c(tabScreenFragment, tabsHost.getCurrentFocusedTab())) {
            TabsHost tabsHost2 = (TabsHost) tabsHost.f25448c.f7166b;
            View view = tabsHost2.f25451f;
            TabScreenFragment currentFocusedTab = tabsHost2.getCurrentFocusedTab();
            ScrollView scrollView = null;
            if (currentFocusedTab.f25437a.getShouldUseRepeatedTabSelectionPopToRootSpecialEffect()) {
                Intrinsics.checkNotNullParameter(view, "view");
                View childAt = view;
                while (true) {
                    if (childAt != null) {
                        if (childAt instanceof ScreenStack) {
                            screenStack = (ScreenStack) childAt;
                            break;
                        } else if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                            if (viewGroup2.getChildCount() != 0) {
                                childAt = viewGroup2.getChildAt(0);
                            }
                        }
                    }
                    screenStack = null;
                    break;
                }
                if (screenStack != null) {
                    ArrayList arrayList = screenStack.f25305a;
                    Iterator it = arrayList.iterator();
                    int i7 = 0;
                    while (true) {
                        iNextIndex = -1;
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        } else if (((ScreenFragmentWrapper) it.next()).getScreen().getActivityState() != EnumC0454n.f5825a) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        if (((ScreenFragmentWrapper) listIterator.previous()).getScreen().getActivityState() != EnumC0454n.f5825a) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i7 >= 0 && iNextIndex > i7) {
                        int i10 = i7 + 1;
                        if (i10 <= iNextIndex) {
                            while (true) {
                                Screen screen = ((ScreenFragmentWrapper) arrayList.get(i10)).getScreen();
                                Intrinsics.checkNotNullParameter(screen, "screen");
                                if (screenStack.getContext() instanceof ReactContext) {
                                    int surfaceId = UIManagerHelper.getSurfaceId(screenStack.getContext());
                                    Context context = screenStack.getContext();
                                    Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                                    EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, screen.getId());
                                    if (eventDispatcherForReactTag != null) {
                                        eventDispatcherForReactTag.dispatchEvent(new O7.r(surfaceId, screen.getId()));
                                    }
                                }
                                if (i10 == iNextIndex) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else if (currentFocusedTab.f25437a.getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        while (view != null) {
                            if (!(view instanceof ScrollView)) {
                                if (!(view instanceof ViewGroup)) {
                                    break;
                                }
                                viewGroup = (ViewGroup) view;
                                if (viewGroup.getChildCount() == 0) {
                                    break;
                                } else {
                                    view = viewGroup.getChildAt(0);
                                }
                            } else {
                                scrollView = (ScrollView) view;
                                break;
                            }
                        }
                        if (scrollView != null && scrollView.getScrollY() > 0) {
                            scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
                        }
                    }
                    z3 = true;
                } else if (currentFocusedTab.f25437a.getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    while (view != null) {
                        if (!(view instanceof ScrollView)) {
                            if (!(view instanceof ViewGroup)) {
                                break;
                                break;
                            }
                            viewGroup = (ViewGroup) view;
                            if (viewGroup.getChildCount() == 0) {
                                break;
                                break;
                            }
                            view = viewGroup.getChildAt(0);
                        } else {
                            scrollView = (ScrollView) view;
                            break;
                        }
                    }
                    if (scrollView != null) {
                        scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
                        z3 = true;
                    }
                }
            } else if (currentFocusedTab.f25437a.getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()) {
                Intrinsics.checkNotNullParameter(view, "view");
                while (view != null) {
                    if (!(view instanceof ScrollView)) {
                        if (!(view instanceof ViewGroup)) {
                            break;
                            break;
                        }
                        viewGroup = (ViewGroup) view;
                        if (viewGroup.getChildCount() == 0) {
                            break;
                            break;
                        }
                        view = viewGroup.getChildAt(0);
                    } else {
                        scrollView = (ScrollView) view;
                        break;
                    }
                }
                if (scrollView != null) {
                    scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
                    z3 = true;
                }
            }
        }
        boolean z8 = z3;
        if (tabScreenFragment == null || (tabScreen = tabScreenFragment.f25437a) == null || (tabKey = tabScreen.getTabKey()) == null) {
            tabKey = "undefined";
        }
        String tabKey2 = tabKey;
        j eventEmitter$react_native_screens_release = tabsHost.getEventEmitter$react_native_screens_release();
        int itemId = item.getItemId();
        eventEmitter$react_native_screens_release.getClass();
        Intrinsics.checkNotNullParameter(tabKey2, "tabKey");
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new W7.j(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), eventEmitter$react_native_screens_release.f7630b, tabKey2, itemId, z8));
    }

    public static final void b(TabsHost tabsHost) {
        tabsHost.getClass();
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter("updateBottomNavigationViewAppearance", "message");
        tabsHost.f25464v.v(tabsHost);
        Integer selectedTabScreenFragmentId = tabsHost.getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        int iIntValue = selectedTabScreenFragmentId.intValue();
        BottomNavigationView bottomNavigationView = tabsHost.f25450e;
        if (bottomNavigationView.getSelectedItemId() != iIntValue) {
            bottomNavigationView.setSelectedItemId(iIntValue);
        }
        tabsHost.post(new s(tabsHost, 23));
    }

    public static final void c(TabsHost tabsHost, Object obj, Object obj2) {
        tabsHost.getClass();
        if (Intrinsics.c(obj2, obj)) {
            return;
        }
        g gVar = tabsHost.f25447b;
        gVar.f10098c = true;
        gVar.d();
    }

    public static final void d(TabsHost tabsHost) {
        TabScreenFragment currentFocusedTab = tabsHost.getCurrentFocusedTab();
        List listF = tabsHost.getRequireFragmentManager().f17069c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof TabScreenFragment) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        TabScreenFragment tabScreenFragment = (TabScreenFragment) CollectionsKt.firstOrNull(arrayList);
        if (currentFocusedTab == tabScreenFragment) {
            return;
        }
        Z requireFragmentManager = tabsHost.getRequireFragmentManager();
        C1161a c1161aE = q0.e(requireFragmentManager, requireFragmentManager);
        c1161aE.f17176p = true;
        if (tabScreenFragment != null) {
            c1161aE.m(tabScreenFragment);
        }
        c1161aE.a(currentFocusedTab, tabsHost.f25451f.getId());
        c1161aE.j();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private final TabScreenFragment getCurrentFocusedTab() {
        for (Object obj : this.f25454j) {
            if (((TabScreenFragment) obj).f25437a.isFocusedTab) {
                if (obj != null) {
                    return (TabScreenFragment) obj;
                }
                throw new IllegalStateException("[RNScreens] No focused tab present");
            }
        }
        obj = null;
        if (obj != null) {
            return (TabScreenFragment) obj;
        }
        throw new IllegalStateException("[RNScreens] No focused tab present");
    }

    private final Z getRequireFragmentManager() {
        Z z3 = this.f25453i;
        if (z3 != null) {
            return z3;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabScreenFragmentId() {
        ArrayList arrayList = this.f25454j;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((TabScreenFragment) it.next()).f25437a.isFocusedTab) {
                return Integer.valueOf(i7);
            }
            i7++;
        }
        i7 = -1;
        return Integer.valueOf(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        if (!(windowInsets != null ? windowInsets.isConsumed() : true)) {
            Iterator it = new P(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void e(Integer num) {
        int iIntValue;
        if (getTabBarHidden()) {
            iIntValue = 0;
        } else {
            iIntValue = num != null ? num.intValue() : this.f25450e.getHeight();
        }
        SafeAreaView safeAreaView = this.t;
        if (safeAreaView != null) {
            Y7.b newInterfaceInsets = new Y7.b(0.0f, 0.0f, 0.0f, iIntValue);
            Intrinsics.checkNotNullParameter(newInterfaceInsets, "newInterfaceInsets");
            if (newInterfaceInsets.equals(safeAreaView.f25470b)) {
                return;
            }
            safeAreaView.f25470b = newInterfaceInsets;
            c cVar = safeAreaView.f25475g;
            cVar.getClass();
            if (cVar == c.f11311a || cVar == c.f11313c) {
                safeAreaView.f25472d = true;
            }
        }
    }

    @NotNull
    public final j getEventEmitter$react_native_screens_release() {
        j jVar = this.eventEmitter;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.n("eventEmitter");
        throw null;
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.TabScreenDelegate
    public final Fragment getFragmentForTabScreen(TabScreen tabScreen) {
        Object next;
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Iterator it = this.f25454j.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((TabScreenFragment) next).f25437a == tabScreen) {
                return (TabScreenFragment) next;
            }
        }
        next = null;
        return (TabScreenFragment) next;
    }

    @Override // com.swmansion.rnscreens.safearea.SafeAreaProvider
    @NotNull
    public Y7.b getInterfaceInsets() {
        return new Y7.b(0.0f, 0.0f, 0.0f, this.f25450e.getHeight());
    }

    @Nullable
    public final Integer getNativeContainerBackgroundColor() {
        return (Integer) this.f25467w0.getValue(this, f25438y0[15]);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    @Nullable
    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.f25439A.getValue(this, f25438y0[0]);
    }

    public final boolean getTabBarHidden() {
        return ((Boolean) this.f25465v0.getValue(this, f25438y0[14])).booleanValue();
    }

    @Nullable
    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.f25440B.getValue(this, f25438y0[1]);
    }

    @Nullable
    public final Integer getTabBarItemIconColor() {
        return (Integer) this.f25442H.getValue(this, f25438y0[3]);
    }

    @Nullable
    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.f25444M.getValue(this, f25438y0[5]);
    }

    @Nullable
    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.f25463u0.getValue(this, f25438y0[13]);
    }

    @Nullable
    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.f25462t0.getValue(this, f25438y0[12]);
    }

    @Nullable
    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.f25445Q.getValue(this, f25438y0[6]);
    }

    @Nullable
    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.f25455k0.getValue(this, f25438y0[7]);
    }

    @Nullable
    public final String getTabBarItemTitleFontFamily() {
        return (String) this.f25443L.getValue(this, f25438y0[4]);
    }

    @Nullable
    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.f25458p0.getValue(this, f25438y0[8]);
    }

    @Nullable
    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.f25459q0.getValue(this, f25438y0[9]);
    }

    @Nullable
    public final String getTabBarItemTitleFontStyle() {
        return (String) this.f25461s0.getValue(this, f25438y0[11]);
    }

    @Nullable
    public final String getTabBarItemTitleFontWeight() {
        return (String) this.f25460r0.getValue(this, f25438y0[10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "TabsHost [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
        Z zI = n.i(this);
        if (zI == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.f25453i = zI;
        g gVar = this.f25447b;
        gVar.c();
        gVar.e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            int i7 = configuration.uiMode & 48;
            Integer num = this.f25456o;
            if (num != null && i7 == num.intValue()) {
                return;
            }
            ContextThemeWrapper contextThemeWrapper = this.f25449d;
            if (i7 == 16) {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_Light_NoActionBar);
            } else if (i7 != 32) {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_DayNight_NoActionBar);
            } else {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_Dark_NoActionBar);
            }
            this.f25464v.v(this);
            this.f25456o = Integer.valueOf(i7);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.TabScreenDelegate
    public final void onFragmentConfigurationChange(TabScreen tabScreen, Configuration config) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Intrinsics.checkNotNullParameter(config, "config");
        onConfigurationChanged(config);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (!(view instanceof BottomNavigationView)) {
            throw new IllegalArgumentException(("[RNScreens] TabsHost's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
        }
        int i17 = i12 - i10;
        if (i17 != i16 - i14) {
            e(Integer.valueOf(i17));
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.TabScreenDelegate
    public final void onMenuItemAttributesChange(TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Iterator it = this.f25454j.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (((TabScreenFragment) it.next()).f25437a == tabScreen) {
                break;
            } else {
                i7++;
            }
        }
        Integer numValueOf = Integer.valueOf(i7);
        MenuItem menuItemFindItem = null;
        if (i7 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            menuItemFindItem = this.f25450e.getMenu().findItem(numValueOf.intValue());
        }
        if (menuItemFindItem != null) {
            this.f25464v.u(menuItemFindItem, tabScreen);
            this.f25466w.j(menuItemFindItem, tabScreen);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.TabScreenDelegate
    public final void onTabFocusChangedFromJS(TabScreen tabScreen, boolean z3) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        g gVar = this.f25447b;
        gVar.c();
        gVar.d();
    }

    @Override // com.swmansion.rnscreens.safearea.SafeAreaProvider
    public final void removeOnInterfaceInsetsChangeListener(SafeAreaView listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Intrinsics.c(this.t, listener)) {
            this.t = null;
            this.f25450e.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f fVar;
        super.requestLayout();
        if (this.f25457p || (fVar = this.f25468x0) == null) {
            return;
        }
        this.f25457p = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, fVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.eventEmitter = jVar;
    }

    public final void setNativeContainerBackgroundColor(@Nullable Integer num) {
        this.f25467w0.setValue(this, f25438y0[15], num);
    }

    @Override // com.swmansion.rnscreens.safearea.SafeAreaProvider
    public void setOnInterfaceInsetsChangeListener(@NotNull SafeAreaView listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.t == null) {
            this.f25450e.addOnLayoutChangeListener(this);
        }
        this.t = listener;
    }

    public final void setTabBarBackgroundColor(@Nullable Integer num) {
        this.f25439A.setValue(this, f25438y0[0], num);
    }

    public final void setTabBarHidden(boolean z3) {
        this.f25465v0.setValue(this, f25438y0[14], Boolean.valueOf(z3));
    }

    public final void setTabBarItemActiveIndicatorColor(@Nullable Integer num) {
        this.f25440B.setValue(this, f25438y0[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z3) {
        this.f25441C.setValue(this, f25438y0[2], Boolean.valueOf(z3));
    }

    public final void setTabBarItemIconColor(@Nullable Integer num) {
        this.f25442H.setValue(this, f25438y0[3], num);
    }

    public final void setTabBarItemIconColorActive(@Nullable Integer num) {
        this.f25444M.setValue(this, f25438y0[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(@Nullable String str) {
        this.f25463u0.setValue(this, f25438y0[13], str);
    }

    public final void setTabBarItemRippleColor(@Nullable Integer num) {
        this.f25462t0.setValue(this, f25438y0[12], num);
    }

    public final void setTabBarItemTitleFontColor(@Nullable Integer num) {
        this.f25445Q.setValue(this, f25438y0[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(@Nullable Integer num) {
        this.f25455k0.setValue(this, f25438y0[7], num);
    }

    public final void setTabBarItemTitleFontFamily(@Nullable String str) {
        this.f25443L.setValue(this, f25438y0[4], str);
    }

    public final void setTabBarItemTitleFontSize(@Nullable Float f10) {
        this.f25458p0.setValue(this, f25438y0[8], f10);
    }

    public final void setTabBarItemTitleFontSizeActive(@Nullable Float f10) {
        this.f25459q0.setValue(this, f25438y0[9], f10);
    }

    public final void setTabBarItemTitleFontStyle(@Nullable String str) {
        this.f25461s0.setValue(this, f25438y0[11], str);
    }

    public final void setTabBarItemTitleFontWeight(@Nullable String str) {
        this.f25460r0.setValue(this, f25438y0[10], str);
    }
}

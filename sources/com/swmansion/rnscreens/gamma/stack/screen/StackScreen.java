package com.swmansion.rnscreens.gamma.stack.screen;

import S3.c;
import T7.a;
import T7.d;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import com.swmansion.rnscreens.gamma.stack.host.StackHost;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010(\u001a\u0004\u0018\u00010!2\b\u0010\u0007\u001a\u0004\u0018\u00010!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;", "Landroid/view/ViewGroup;", "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;", "Landroidx/fragment/app/Fragment;", "getAssociatedFragment", "()Landroidx/fragment/app/Fragment;", "", "value", "b", "Z", "isNativelyDismissed$react_native_screens_release", "()Z", "setNativelyDismissed$react_native_screens_release", "(Z)V", "isNativelyDismissed", "Ljava/lang/ref/WeakReference;", "Lcom/swmansion/rnscreens/gamma/stack/host/StackHost;", "c", "Ljava/lang/ref/WeakReference;", "getStackHost$react_native_screens_release", "()Ljava/lang/ref/WeakReference;", "setStackHost$react_native_screens_release", "(Ljava/lang/ref/WeakReference;)V", "stackHost", "LT7/a;", "<set-?>", "d", "Lkotlin/properties/ReadWriteProperty;", "getActivityMode", "()LT7/a;", "setActivityMode", "(LT7/a;)V", "activityMode", "", "e", "Ljava/lang/String;", "getScreenKey", "()Ljava/lang/String;", "setScreenKey", "(Ljava/lang/String;)V", "screenKey", "LT7/d;", "f", "LT7/d;", "getEventEmitter$react_native_screens_release", "()LT7/d;", "setEventEmitter$react_native_screens_release", "(LT7/d;)V", "eventEmitter", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nStackScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackScreen.kt\ncom/swmansion/rnscreens/gamma/stack/screen/StackScreen\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n33#2,3:79\n1#3:82\n*S KotlinDebug\n*F\n+ 1 StackScreen.kt\ncom/swmansion/rnscreens/gamma/stack/screen/StackScreen\n*L\n33#1:79,3\n*E\n"})
public final class StackScreen extends ViewGroup implements FragmentProviding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25413g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f25414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isNativelyDismissed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public WeakReference stackHost;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f25417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String screenKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public d eventEmitter;

    static {
        r rVar = new r("activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", StackScreen.class);
        G.f38952a.getClass();
        f25413g = new KProperty[]{rVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackScreen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f25414a = reactContext;
        this.stackHost = new WeakReference(null);
        a aVar = a.f9033a;
        this.f25417d = new c(this);
    }

    @NotNull
    public final a getActivityMode() {
        return (a) this.f25417d.getValue(this, f25413g[0]);
    }

    @Override // com.swmansion.rnscreens.gamma.common.FragmentProviding
    @Nullable
    public Fragment getAssociatedFragment() {
        Fragment fragmentC;
        Intrinsics.checkNotNullParameter(this, "<this>");
        try {
            Intrinsics.checkNotNullParameter(this, "<this>");
            fragmentC = Z.C(this);
            Intrinsics.checkNotNullExpressionValue(fragmentC, "findFragment(this)");
        } catch (IllegalStateException unused) {
            fragmentC = null;
        }
        if (fragmentC == null) {
            return null;
        }
        if (fragmentC instanceof StackScreenFragment) {
            return fragmentC;
        }
        throw new IllegalStateException("[RNScreens] Unexpected fragment type: ".concat(fragmentC.getClass().getSimpleName()).toString());
    }

    @NotNull
    public final d getEventEmitter$react_native_screens_release() {
        d dVar = this.eventEmitter;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.n("eventEmitter");
        throw null;
    }

    @Nullable
    public final String getScreenKey() {
        return this.screenKey;
    }

    @NotNull
    public final WeakReference<StackHost> getStackHost$react_native_screens_release() {
        return this.stackHost;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    public final void setActivityMode(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f25417d.setValue(this, f25413g[0], aVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.eventEmitter = dVar;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
        this.isNativelyDismissed = true;
    }

    public final void setScreenKey(@Nullable String str) {
        if (this.screenKey != null) {
            throw new IllegalArgumentException("[RNScreens] StackScreen can't change its screenKey.");
        }
        this.screenKey = str;
    }

    public final void setStackHost$react_native_screens_release(@NotNull WeakReference<StackHost> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.stackHost = weakReference;
    }
}

package com.swmansion.rnscreens.gamma.stack.host;

import Gb.Q;
import S7.e;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.J;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p279s5.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/host/StackHost;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/swmansion/rnscreens/gamma/stack/host/StackContainerDelegate;", "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getRenderedScreens$react_native_screens_release", "()Ljava/util/ArrayList;", "renderedScreens", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nStackHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackHost.kt\ncom/swmansion/rnscreens/gamma/stack/host/StackHost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1869#2,2:132\n*S KotlinDebug\n*F\n+ 1 StackHost.kt\ncom/swmansion/rnscreens/gamma/stack/host/StackHost\n*L\n63#1:132,2\n*E\n"})
public final class StackHost extends ViewGroup implements UIManagerListener, StackContainerDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ArrayList renderedScreens;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StackContainer f25411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f25412c;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackHost(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.renderedScreens = new ArrayList();
        StackContainer stackContainer = new StackContainer(reactContext, new WeakReference(this));
        this.f25411b = stackContainer;
        this.f25412c = new d(9);
        addView(stackContainer);
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        if (uIManager == null) {
            throw new IllegalStateException("[RNScreens] UIManager must not be null.");
        }
        uIManager.addUIManagerEventListener(this);
    }

    public final void a(StackScreen stackScreen) {
        if (stackScreen.getActivityMode() != T7.a.f9034b || stackScreen.isNativelyDismissed) {
            stackScreen.getScreenKey();
            return;
        }
        d dVar = this.f25412c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        ((ArrayList) dVar.f42026c).add(new S7.d(stackScreen));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        ArrayList renderedScreens = this.renderedScreens;
        d dVar = this.f25412c;
        dVar.getClass();
        StackContainer container = this.f25411b;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(renderedScreens, "renderedScreens");
        ArrayList<e> arrayList = (ArrayList) dVar.f42025b;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<S7.d> arrayList2 = (ArrayList) dVar.f42026c;
        if (zIsEmpty && arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(r.l(arrayList2, 10));
        for (S7.d dVar2 : arrayList2) {
            arrayList3.add(new Pair(Integer.valueOf(renderedScreens.indexOf(dVar2.f8821f)), dVar2));
        }
        Iterator it = w.v(CollectionsKt.T(arrayList3, new Q(2))).iterator();
        while (true) {
            ListIterator listIterator = ((J) it).f38901a;
            if (!listIterator.hasPrevious()) {
                break;
            }
            StackScreen stackScreen = ((S7.d) ((Pair) listIterator.previous()).f38892b).f8821f;
            container.getClass();
            Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
            container.f25407d.add(new S7.d(stackScreen));
        }
        ArrayList arrayList4 = new ArrayList(r.l(arrayList, 10));
        for (e eVar : arrayList) {
            arrayList4.add(new Pair(Integer.valueOf(renderedScreens.indexOf(eVar.f8822f)), eVar));
        }
        Iterator it2 = CollectionsKt.T(arrayList4, new Q(3)).iterator();
        while (it2.hasNext()) {
            StackScreen stackScreen2 = ((e) ((Pair) it2.next()).f38892b).f8822f;
            container.getClass();
            Intrinsics.checkNotNullParameter(stackScreen2, "stackScreen");
            container.f25408e.add(new e(stackScreen2));
        }
        container.l();
        arrayList2.clear();
        arrayList.clear();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @NotNull
    public final ArrayList<StackScreen> getRenderedScreens$react_native_screens_release() {
        return this.renderedScreens;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "StackHost [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("StackHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        this.f25411b.layout(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f25411b.measure(i7, i10);
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.StackContainerDelegate
    public final void onScreenDismiss(StackScreen stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        if (stackScreen.getActivityMode() == T7.a.f9034b) {
            stackScreen.setNativelyDismissed$react_native_screens_release(true);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}

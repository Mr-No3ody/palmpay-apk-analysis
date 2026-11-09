package com.reactnativepagerview;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.emoji2.text.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.chuanyi.ad.AdBannerManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.RNCViewPagerManagerDelegate;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p293t7.a;
import p293t7.c;
import p293t7.d;
import p306u7.f;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNCViewPager")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b2\u0010)J#\u00103\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b3\u00101J!\u00104\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b4\u0010)J!\u00105\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b5\u0010)J#\u00106\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b6\u00101J!\u00107\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b7\u0010/J#\u00108\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b8\u00101J'\u0010;\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020*¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010)J!\u0010>\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010)J!\u0010@\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020*H\u0016¢\u0006\u0004\b@\u0010/J'\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0B0AH\u0016¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/NestedScrollableHost;", "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "", "receiveCommand", "(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/NestedScrollableHost;", "host", "Landroid/view/View;", "child", "", FirebaseAnalytics.Param.INDEX, "addView", "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/NestedScrollableHost;)I", "getChildAt", "(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/NestedScrollableHost;)V", "removeViewAt", "(Lcom/reactnativepagerview/NestedScrollableHost;I)V", "", "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/NestedScrollableHost;Z)V", "setLayoutDirection", "(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V", "setInitialPage", "setOrientation", "setOffscreenPageLimit", "setPageMargin", "setOverScrollMode", "setOverdrag", "setKeyboardDismissMode", "selectedPage", "scrollWithAnimation", "goTo", "(Lcom/reactnativepagerview/NestedScrollableHost;IZ)V", "setPage", "setPageWithoutAnimation", "scrollEnabled", "setScrollEnabledImperatively", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-pager-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PagerViewViewManager extends ViewGroupManager<NestedScrollableHost> implements RNCViewPagerManagerInterface<NestedScrollableHost> {

    @NotNull
    private final ViewManagerDelegate<NestedScrollableHost> mDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerViewViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.mDelegate = new RNCViewPagerManagerDelegate(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(ViewPager2 viewPager2, ThemedReactContext themedReactContext, NestedScrollableHost nestedScrollableHost) {
        viewPager2.registerOnPageChangeCallback(new a(themedReactContext, nestedScrollableHost));
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, nestedScrollableHost.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new f(nestedScrollableHost.getId(), viewPager2.getCurrentItem()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull NestedScrollableHost host, @NotNull View child, int index) throws ClassNotFoundException {
        Integer initialIndex;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(host, "host");
        if (child == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(host, "view");
        if (!(host.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = host.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 view = (ViewPager2) childAt;
        d dVar = (d) view.getAdapter();
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(child, "child");
            dVar.f42351a.add(index, child);
            dVar.notifyItemInserted(index);
        }
        if (view.getCurrentItem() == index) {
            view.post(new b(view, 26));
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != index) {
            return;
        }
        host.setDidSetInitialIndex(true);
        Intrinsics.checkNotNullParameter(view, "view");
        view.post(new b(view, 26));
        view.setCurrentItem(index, false);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull NestedScrollableHost parent, int index) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "view");
        if (!(parent.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        d dVar = (d) ((ViewPager2) childAt).getAdapter();
        Intrinsics.e(dVar);
        Object obj = dVar.f42351a.get(index);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (View) obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull NestedScrollableHost parent) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "view");
        if (!(parent.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        RecyclerView.Adapter adapter = ((ViewPager2) childAt).getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<NestedScrollableHost> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topPageScroll", MapBuilder.of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.of("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNCViewPager";
    }

    public final void goTo(@Nullable NestedScrollableHost root, int selectedPage, boolean scrollWithAnimation) throws ClassNotFoundException {
        if (root == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(root, "view");
        if (!(root.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = root.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 view = (ViewPager2) childAt;
        RecyclerView.Adapter adapter = view.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0 || selectedPage < 0 || selectedPage >= numValueOf.intValue()) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        view.post(new b(view, 26));
        view.setCurrentItem(selectedPage, scrollWithAnimation);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull NestedScrollableHost parent) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "view");
        if (!(parent.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 viewPager2 = (ViewPager2) childAt;
        viewPager2.setUserInputEnabled(false);
        d dVar = (d) viewPager2.getAdapter();
        if (dVar != null) {
            ArrayList arrayList = dVar.f42351a;
            int size = arrayList.size();
            int i7 = 1;
            if (1 <= size) {
                while (true) {
                    Object obj = arrayList.get(i7 - 1);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    View view = (View) obj;
                    ViewParent parent2 = view.getParent();
                    if ((parent2 != null ? parent2.getParent() : null) != null) {
                        ViewParent parent3 = view.getParent().getParent();
                        Intrinsics.f(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                        Object parent4 = view.getParent();
                        Intrinsics.f(parent4, "null cannot be cast to non-null type android.view.View");
                        ((ViewGroup) parent3).removeView((View) parent4);
                    }
                    if (i7 == size) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int size2 = arrayList.size();
            arrayList.clear();
            dVar.notifyItemRangeRemoved(0, size2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull NestedScrollableHost parent, @NotNull View view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "view");
        if (!(parent.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 viewPager2 = (ViewPager2) childAt;
        d dVar = (d) viewPager2.getAdapter();
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(view, "child");
            ArrayList arrayList = dVar.f42351a;
            int iIndexOf = arrayList.indexOf(view);
            if (iIndexOf > -1 && iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                arrayList.remove(iIndexOf);
                dVar.notifyItemRemoved(iIndexOf);
            }
        }
        viewPager2.post(new b(viewPager2, 26));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull NestedScrollableHost parent, int index) throws ClassNotFoundException {
        View view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "view");
        if (!(parent.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = parent.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 viewPager2 = (ViewPager2) childAt;
        d dVar = (d) viewPager2.getAdapter();
        if (dVar != null) {
            Object obj = dVar.f42351a.get(index);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null && view.getParent() != null) {
            ViewParent parent2 = view.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (dVar != null && index >= 0) {
            ArrayList arrayList = dVar.f42351a;
            if (index < arrayList.size()) {
                arrayList.remove(index);
                dVar.notifyItemRemoved(index);
            }
        }
        H0.f fVar = c.f42350a;
        if (fVar != null) {
            Choreographer.getInstance().removeFrameCallback(fVar);
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        d dVar2 = adapter instanceof d ? (d) adapter : null;
        if (dVar2 == null || dVar2.f42351a.size() == 0) {
            return;
        }
        c.f42350a = new H0.f(viewPager2, 3);
        Choreographer.getInstance().postFrameCallback(c.f42350a);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = "initialPage")
    public void setInitialPage(@Nullable NestedScrollableHost view, int value) throws ClassNotFoundException {
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "host");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getChildAt(0) instanceof ViewPager2)) {
                throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
            }
            View childAt = view.getChildAt(0);
            Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            ViewPager2 viewPager2 = (ViewPager2) childAt;
            if (view.getInitialIndex() == null) {
                view.setInitialIndex(Integer.valueOf(value));
                viewPager2.post(new b(view, 27));
            }
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(@Nullable NestedScrollableHost view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = ViewProps.LAYOUT_DIRECTION)
    public void setLayoutDirection(@Nullable NestedScrollableHost view, @Nullable String value) throws ClassNotFoundException {
        if (view == null || value == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ViewPager2 viewPager2 = (ViewPager2) childAt;
        if (Intrinsics.c(value, "rtl")) {
            viewPager2.setLayoutDirection(1);
        } else {
            viewPager2.setLayoutDirection(0);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = -1, name = "offscreenPageLimit")
    public void setOffscreenPageLimit(@Nullable NestedScrollableHost view, int value) throws ClassNotFoundException {
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "host");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getChildAt(0) instanceof ViewPager2)) {
                throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
            }
            View childAt = view.getChildAt(0);
            Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            ((ViewPager2) childAt).setOffscreenPageLimit(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "orientation")
    public void setOrientation(@Nullable NestedScrollableHost view, @Nullable String value) throws ClassNotFoundException {
        if (view == null || value == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        ((ViewPager2) childAt).setOrientation(Intrinsics.c(value, "vertical") ? 1 : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(@Nullable NestedScrollableHost view, @Nullable String value) throws ClassNotFoundException {
        if (view == null || value == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        View childAt2 = ((ViewPager2) childAt).getChildAt(0);
        if (Intrinsics.c(value, ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
            childAt2.setOverScrollMode(2);
        } else if (Intrinsics.c(value, ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
            childAt2.setOverScrollMode(0);
        } else {
            childAt2.setOverScrollMode(1);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overdrag")
    public void setOverdrag(@Nullable NestedScrollableHost view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = AdBannerManager.PROP_PAGE_MARGIN)
    public void setPageMargin(@Nullable NestedScrollableHost view, int value) throws ClassNotFoundException {
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "host");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getChildAt(0) instanceof ViewPager2)) {
                throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
            }
            View childAt = view.getChildAt(0);
            Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            final ViewPager2 viewPager2 = (ViewPager2) childAt;
            final int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(value);
            viewPager2.setPageTransformer(new ViewPager2.PageTransformer() { // from class: t7.b
                @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
                public final void transformPage(View page, float f10) {
                    Intrinsics.checkNotNullParameter(page, "page");
                    float f11 = pixelFromDIP * f10;
                    ViewPager2 viewPager3 = viewPager2;
                    if (viewPager3.getOrientation() != 0) {
                        page.setTranslationY(f11);
                        return;
                    }
                    if (viewPager3.getLayoutDirection() == 1) {
                        f11 = -f11;
                    }
                    page.setTranslationX(f11);
                }
            });
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(@Nullable NestedScrollableHost view, boolean value) throws ClassNotFoundException {
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "host");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getChildAt(0) instanceof ViewPager2)) {
                throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
            }
            View childAt = view.getChildAt(0);
            Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            ((ViewPager2) childAt).setUserInputEnabled(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setScrollEnabledImperatively(@Nullable NestedScrollableHost view, boolean scrollEnabled) throws ClassNotFoundException {
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "host");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!(view.getChildAt(0) instanceof ViewPager2)) {
                throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
            }
            View childAt = view.getChildAt(0);
            Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            ((ViewPager2) childAt).setUserInputEnabled(scrollEnabled);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public NestedScrollableHost createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(reactContext);
        nestedScrollableHost.setId(View.generateViewId());
        nestedScrollableHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollableHost.setSaveEnabled(false);
        ViewPager2 viewPager2 = new ViewPager2(reactContext);
        viewPager2.setAdapter(new d());
        viewPager2.setSaveEnabled(false);
        viewPager2.post(new j(viewPager2, 28, reactContext, nestedScrollableHost));
        nestedScrollableHost.addView(viewPager2);
        return nestedScrollableHost;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull NestedScrollableHost root, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.mDelegate.kotlinCompat$receiveCommandNullableArgs(root, commandId, args);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPage(@Nullable NestedScrollableHost view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, true);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPageWithoutAnimation(@Nullable NestedScrollableHost view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, false);
    }
}

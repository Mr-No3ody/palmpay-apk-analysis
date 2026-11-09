package p293t7;

import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.reactnativepagerview.NestedScrollableHost;
import p306u7.b;
import p306u7.d;
import p306u7.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThemedReactContext f42346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NestedScrollableHost f42347b;

    public a(ThemedReactContext themedReactContext, NestedScrollableHost nestedScrollableHost) {
        this.f42346a = themedReactContext;
        this.f42347b = nestedScrollableHost;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        String str;
        super.onPageScrollStateChanged(i7);
        if (i7 == 0) {
            str = "idle";
        } else if (i7 == 1) {
            str = "dragging";
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            str = "settling";
        }
        NestedScrollableHost nestedScrollableHost = this.f42347b;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f42346a, nestedScrollableHost.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new d(nestedScrollableHost.getId(), str));
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i7, float f10, int i10) {
        super.onPageScrolled(i7, f10, i10);
        NestedScrollableHost nestedScrollableHost = this.f42347b;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f42346a, nestedScrollableHost.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new b(nestedScrollableHost.getId(), i7, f10));
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        NestedScrollableHost nestedScrollableHost = this.f42347b;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f42346a, nestedScrollableHost.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new f(nestedScrollableHost.getId(), i7));
        }
    }
}

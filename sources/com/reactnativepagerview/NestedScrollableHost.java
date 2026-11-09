package com.reactnativepagerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/reactnativepagerview/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "Ljava/lang/Integer;", "getInitialIndex", "()Ljava/lang/Integer;", "setInitialIndex", "(Ljava/lang/Integer;)V", "initialIndex", "", "b", "Z", "getDidSetInitialIndex", "()Z", "setDidSetInitialIndex", "(Z)V", "didSetInitialIndex", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "react-native-pager-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Integer initialIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean didSetInitialIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24687c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L25
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            return r0
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    public final boolean getDidSetInitialIndex() {
        return this.didSetInitialIndex;
    }

    @Nullable
    public final Integer getInitialIndex() {
        return this.initialIndex;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e10) {
        boolean zCanScrollHorizontally;
        Intrinsics.checkNotNullParameter(e10, "e");
        ViewPager2 parentViewPager = getParentViewPager();
        Integer numValueOf = parentViewPager != null ? Integer.valueOf(parentViewPager.getOrientation()) : null;
        if (e10.getAction() == 0) {
            this.f24688d = e10.getX();
            this.f24689e = e10.getY();
            if (numValueOf != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (e10.getAction() == 2) {
            float x3 = e10.getX() - this.f24688d;
            float y8 = e10.getY() - this.f24689e;
            boolean z3 = numValueOf != null && numValueOf.intValue() == 0;
            float fAbs = Math.abs(x3) * (z3 ? 0.5f : 1.0f);
            float fAbs2 = Math.abs(y8) * (z3 ? 1.0f : 0.5f);
            float f10 = this.f24687c;
            if (fAbs > f10 || fAbs2 > f10) {
                NativeGestureUtil.notifyNativeGestureStarted(this, e10);
                this.f24690f = true;
                if (numValueOf != null) {
                    if (z3 == (fAbs2 > fAbs)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else {
                        int iIntValue = numValueOf.intValue();
                        if (!z3) {
                            x3 = y8;
                        }
                        int i7 = -((int) Math.signum(x3));
                        if (iIntValue == 0) {
                            View child = getChild();
                            if (child != null) {
                                zCanScrollHorizontally = child.canScrollHorizontally(i7);
                            } else {
                                zCanScrollHorizontally = false;
                            }
                        } else {
                            if (iIntValue != 1) {
                                throw new IllegalArgumentException();
                            }
                            View child2 = getChild();
                            if (child2 != null) {
                                zCanScrollHorizontally = child2.canScrollVertically(i7);
                            } else {
                                zCanScrollHorizontally = false;
                            }
                        }
                        if (zCanScrollHorizontally) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(e10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10.getActionMasked() == 1 && this.f24690f) {
            NativeGestureUtil.notifyNativeGestureEnded(this, e10);
            this.f24690f = false;
        }
        return super.onTouchEvent(e10);
    }

    public final void setDidSetInitialIndex(boolean z3) {
        this.didSetInitialIndex = z3;
    }

    public final void setInitialIndex(@Nullable Integer num) {
        this.initialIndex = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24687c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}

package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.C1066s;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({p192n.c.f39802c})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int[] f12541v0 = {p241q.a.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final androidx.core.view.q0 f12542w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Rect f12543x0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f12544A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f12545B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.core.view.q0 f12546C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public androidx.core.view.q0 f12547H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public androidx.core.view.q0 f12548L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public androidx.core.view.q0 f12549M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ActionBarVisibilityCallback f12550Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f12553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f12554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DecorToolbar f12555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f12556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12557g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12559j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OverScroller f12560k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12562p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewPropertyAnimator f12563p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final G7.j f12564q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RunnableC0852d f12565r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RunnableC0852d f12566s0;
    public int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final C1066s f12567t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final NoSystemUiLayoutFlagView f12568u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f12569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f12570w;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z3);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i7);

        void showForSystem();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        androidx.core.view.i0 g0Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g0Var = new androidx.core.view.h0();
        } else {
            g0Var = i7 >= 29 ? new androidx.core.view.g0() : new androidx.core.view.f0();
        }
        g0Var.g(androidx.core.graphics.e.b(0, 1, 0, 1));
        f12542w0 = g0Var.b();
        f12543x0 = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z3) {
        boolean z8;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i10 = rect.left;
        if (i7 != i10) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
            z8 = true;
        } else {
            z8 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i12;
            z8 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i14;
            z8 = true;
        }
        if (z3) {
            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i16;
                return true;
            }
        }
        return z8;
    }

    public final void b() {
        removeCallbacks(this.f12565r0);
        removeCallbacks(this.f12566s0);
        ViewPropertyAnimator viewPropertyAnimator = this.f12563p0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f12541v0);
        this.f12551a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f12556f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f12560k0 = new OverScroller(context);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean canShowOverflowMenu() {
        d();
        return this.f12555e.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        DecorToolbar wrapper;
        if (this.f12553c == null) {
            this.f12553c = (ContentFrameLayout) findViewById(p241q.f.action_bar_activity_content);
            this.f12554d = (ActionBarContainer) findViewById(p241q.f.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(p241q.f.action_bar);
            if (callbackFindViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f12555e = wrapper;
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void dismissPopups() {
        d();
        this.f12555e.dismissPopupMenus();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f12556f != null) {
            if (this.f12554d.getVisibility() == 0) {
                translationY = (int) (this.f12554d.getTranslationY() + this.f12554d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f12556f.setBounds(0, translationY, getWidth(), this.f12556f.getIntrinsicHeight() + translationY);
            this.f12556f.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f12554d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f12567t0.a();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        d();
        return this.f12555e.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean hasIcon() {
        d();
        return this.f12555e.hasIcon();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean hasLogo() {
        d();
        return this.f12555e.hasLogo();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean hideOverflowMenu() {
        d();
        return this.f12555e.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void initFeature(int i7) {
        d();
        if (i7 == 2) {
            this.f12555e.initProgress();
        } else if (i7 == 5) {
            this.f12555e.initIndeterminateProgress();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean isOverflowMenuShowPending() {
        d();
        return this.f12555e.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean isOverflowMenuShowing() {
        d();
        return this.f12555e.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d();
        androidx.core.view.q0 q0VarH = androidx.core.view.q0.h(this, windowInsets);
        boolean zA = a(this.f12554d, new Rect(q0VarH.b(), q0VarH.d(), q0VarH.c(), q0VarH.a()), false);
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        Rect rect = this.f12569v;
        androidx.core.view.E.b(this, q0VarH, rect);
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        androidx.core.view.o0 o0Var = q0VarH.f16277a;
        androidx.core.view.q0 q0VarM = o0Var.m(i7, i10, i11, i12);
        this.f12546C = q0VarM;
        boolean z3 = true;
        if (!this.f12547H.equals(q0VarM)) {
            this.f12547H = this.f12546C;
            zA = true;
        }
        Rect rect2 = this.f12570w;
        if (rect2.equals(rect)) {
            z3 = zA;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return o0Var.a().f16277a.c().f16277a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.C.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        androidx.core.view.q0 q0Var;
        int i11;
        androidx.core.view.i0 f0Var;
        d();
        measureChildWithMargins(this.f12554d, i7, 0, i10, 0);
        LayoutParams layoutParams = (LayoutParams) this.f12554d.getLayoutParams();
        int iMax = Math.max(0, this.f12554d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f12554d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f12554d.getMeasuredState());
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        boolean z3 = (getWindowSystemUiVisibility() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        if (z3) {
            measuredHeight = this.f12551a;
            if (this.f12558i && this.f12554d.getTabContainer() != null) {
                measuredHeight += this.f12551a;
            }
        } else {
            measuredHeight = this.f12554d.getVisibility() != 8 ? this.f12554d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f12569v;
        Rect rect2 = this.f12544A;
        rect2.set(rect);
        this.f12548L = this.f12546C;
        if (this.f12557g || z3) {
            androidx.core.graphics.e eVarB = androidx.core.graphics.e.b(this.f12548L.b(), this.f12548L.d() + measuredHeight, this.f12548L.c(), this.f12548L.a());
            q0Var = this.f12548L;
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                f0Var = new androidx.core.view.h0(q0Var);
            } else if (i11 >= 29) {
                f0Var = new androidx.core.view.g0(q0Var);
            } else {
                f0Var = new androidx.core.view.f0(q0Var);
            }
            f0Var.g(eVarB);
            this.f12548L = f0Var.b();
        } else {
            NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = this.f12568u0;
            androidx.core.view.q0 q0Var2 = f12542w0;
            Rect rect3 = this.f12545B;
            androidx.core.view.E.b(noSystemUiLayoutFlagView, q0Var2, rect3);
            if (rect3.equals(f12543x0)) {
                androidx.core.graphics.e eVarB2 = androidx.core.graphics.e.b(this.f12548L.b(), this.f12548L.d() + measuredHeight, this.f12548L.c(), this.f12548L.a());
                q0Var = this.f12548L;
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    f0Var = new androidx.core.view.h0(q0Var);
                } else if (i11 >= 29) {
                    f0Var = new androidx.core.view.g0(q0Var);
                } else {
                    f0Var = new androidx.core.view.f0(q0Var);
                }
                f0Var.g(eVarB2);
                this.f12548L = f0Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f12548L = this.f12548L.f16277a.m(0, measuredHeight, 0, 0);
            }
        }
        a(this.f12553c, rect2, true);
        if (!this.f12549M.equals(this.f12548L)) {
            androidx.core.view.q0 q0Var3 = this.f12548L;
            this.f12549M = q0Var3;
            androidx.core.view.N.b(this.f12553c, q0Var3);
        }
        measureChildWithMargins(this.f12553c, i7, 0, i10, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f12553c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f12553c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f12553c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f12553c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        if (!this.f12559j || !z3) {
            return false;
        }
        this.f12560k0.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f12560k0.getFinalY() > this.f12554d.getHeight()) {
            b();
            this.f12566s0.run();
        } else {
            b();
            this.f12565r0.run();
        }
        this.f12561o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        onNestedScroll(view, i7, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f12567t0.f16285a = i7;
        this.f12562p = getActionBarHideOffset();
        b();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f12550Q;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        d();
        int i10 = this.t ^ i7;
        this.t = i7;
        boolean z3 = (i7 & 4) == 0;
        boolean z8 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f12550Q;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations(true ^ z8);
            if (z3 || !z8) {
                this.f12550Q.showForSystem();
            } else {
                this.f12550Q.hideForSystem();
            }
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 || this.f12550Q == null) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.C.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f12552b = i7;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f12550Q;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i7);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void restoreToolbarHierarchyState(SparseArray sparseArray) {
        d();
        this.f12555e.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void saveToolbarHierarchyState(SparseArray sparseArray) {
        d();
        this.f12555e.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i7) {
        b();
        this.f12554d.setTranslationY(-Math.max(0, Math.min(i7, this.f12554d.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f12550Q = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f12550Q.onWindowVisibilityChanged(this.f12552b);
            int i7 = this.t;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                androidx.core.view.C.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f12558i = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f12559j) {
            this.f12559j = z3;
            if (z3) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int i7) {
        d();
        this.f12555e.setIcon(i7);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int i7) {
        d();
        this.f12555e.setLogo(i7);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void setMenu(Menu menu, MenuPresenter.Callback callback) {
        d();
        this.f12555e.setMenu(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void setMenuPrepared() {
        d();
        this.f12555e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z3) {
        this.f12557g = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        d();
        this.f12555e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        d();
        this.f12555e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean showOverflowMenu() {
        d();
        return this.f12555e.showOverflowMenu();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12552b = 0;
        this.f12569v = new Rect();
        this.f12570w = new Rect();
        this.f12544A = new Rect();
        this.f12545B = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        androidx.core.view.q0 q0Var = androidx.core.view.q0.f16276b;
        this.f12546C = q0Var;
        this.f12547H = q0Var;
        this.f12548L = q0Var;
        this.f12549M = q0Var;
        this.f12564q0 = new G7.j(this, 4);
        this.f12565r0 = new RunnableC0852d(this, 0);
        this.f12566s0 = new RunnableC0852d(this, 1);
        c(context);
        this.f12567t0 = new C1066s();
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        noSystemUiLayoutFlagView.setWillNotDraw(true);
        this.f12568u0 = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i7, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f12554d.getVisibility() != 0) {
            return false;
        }
        return this.f12559j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        if (this.f12559j && !this.f12561o) {
            if (this.f12562p <= this.f12554d.getHeight()) {
                b();
                postDelayed(this.f12565r0, 600L);
            } else {
                b();
                postDelayed(this.f12566s0, 600L);
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f12550Q;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        int i13 = this.f12562p + i10;
        this.f12562p = i13;
        setActionBarHideOffset(i13);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable) {
        d();
        this.f12555e.setIcon(drawable);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }
}

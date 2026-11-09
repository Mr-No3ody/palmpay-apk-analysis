package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import com.microsoft.codepush.react.CodePushConstants;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScrollingTabContainerView f12521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f12522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f12523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f12524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f12525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f12526g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12528j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12529o;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12524e;
        if (drawable != null && drawable.isStateful()) {
            this.f12524e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f12525f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f12525f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f12526g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f12526g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f12521b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12524e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f12525f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f12526g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12522c = findViewById(p241q.f.action_bar);
        this.f12523d = findViewById(p241q.f.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f12520a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        Drawable drawable;
        super.onLayout(z3, i7, i10, i11, i12);
        ScrollingTabContainerView scrollingTabContainerView = this.f12521b;
        boolean z8 = true;
        boolean z10 = false;
        boolean z11 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i13 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i7, measuredHeight2 - i13, i11, measuredHeight - i13);
        }
        if (this.f12527i) {
            Drawable drawable2 = this.f12526g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = z10;
            }
        } else {
            if (this.f12524e != null) {
                if (this.f12522c.getVisibility() == 0) {
                    this.f12524e.setBounds(this.f12522c.getLeft(), this.f12522c.getTop(), this.f12522c.getRight(), this.f12522c.getBottom());
                } else {
                    View view = this.f12523d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f12524e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f12524e.setBounds(this.f12523d.getLeft(), this.f12523d.getTop(), this.f12523d.getRight(), this.f12523d.getBottom());
                    }
                }
                z10 = true;
            }
            this.f12528j = z11;
            if (!z11 || (drawable = this.f12525f) == null) {
                z8 = z10;
            } else {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iA;
        int i11;
        if (this.f12522c == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f12529o) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.f12522c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        ScrollingTabContainerView scrollingTabContainerView = this.f12521b;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f12522c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f12523d;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f12523d);
        } else {
            iA = a(this.f12522c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f12521b) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i10) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f12524e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f12524e);
        }
        this.f12524e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f12522c;
            if (view != null) {
                this.f12524e.setBounds(view.getLeft(), this.f12522c.getTop(), this.f12522c.getRight(), this.f12522c.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f12527i ? !(this.f12524e != null || this.f12525f != null) : this.f12526g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f12526g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f12526g);
        }
        this.f12526g = drawable;
        boolean z3 = this.f12527i;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f12526g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f12524e != null || this.f12525f != null) : this.f12526g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f12525f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f12525f);
        }
        this.f12525f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f12528j && (drawable2 = this.f12525f) != null) {
                drawable2.setBounds(this.f12521b.getLeft(), this.f12521b.getTop(), this.f12521b.getRight(), this.f12521b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f12527i ? !(this.f12524e != null || this.f12525f != null) : this.f12526g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f12521b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f12521b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z3) {
        this.f12520a = z3;
        setDescendantFocusability(z3 ? 393216 : CodePushConstants.DOWNLOAD_BUFFER_SIZE);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z3 = i7 == 0;
        Drawable drawable = this.f12524e;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f12525f;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f12526g;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f12524e;
        boolean z3 = this.f12527i;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f12525f && this.f12528j) {
            return true;
        }
        return (drawable == this.f12526g && z3) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0848b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ActionBar);
        this.f12524e = typedArrayObtainStyledAttributes.getDrawable(p241q.j.ActionBar_background);
        this.f12525f = typedArrayObtainStyledAttributes.getDrawable(p241q.j.ActionBar_backgroundStacked);
        this.f12529o = typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.ActionBar_height, -1);
        boolean z3 = true;
        if (getId() == p241q.f.split_action_bar) {
            this.f12527i = true;
            this.f12526g = typedArrayObtainStyledAttributes.getDrawable(p241q.j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f12527i ? this.f12524e != null || this.f12525f != null : this.f12526g != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}

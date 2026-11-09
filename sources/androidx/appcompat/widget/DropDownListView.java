package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f12658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0867k0 f12664g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12666j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.core.widget.e f12668p;
    public RunnableC0871m0 t;

    public DropDownListView(Context context, boolean z3) {
        super(context, null, p241q.a.dropDownListViewStyle);
        this.f12658a = new Rect();
        this.f12659b = 0;
        this.f12660c = 0;
        this.f12661d = 0;
        this.f12662e = 0;
        this.f12666j = z3;
        setCacheColorHint(0);
    }

    public int a(int i7, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i7, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public boolean b(MotionEvent motionEvent, int i7) {
        boolean z3;
        boolean zA;
        View childAt;
        View childAt2;
        androidx.core.widget.e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z3 = true;
            } else if (actionMasked != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || z8) {
                this.f12667o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f12663f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z3) {
                if (this.f12668p == null) {
                    this.f12668p = new androidx.core.widget.e(this);
                }
                androidx.core.widget.e eVar2 = this.f12668p;
                boolean z10 = eVar2.f16352B;
                eVar2.f16352B = true;
                eVar2.onTouch(this, motionEvent);
            } else {
                eVar = this.f12668p;
                if (eVar != null) {
                    if (eVar.f16352B) {
                        eVar.d();
                    }
                    eVar.f16352B = false;
                }
            }
            return z3;
        }
        z3 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex < 0) {
            z3 = false;
        } else {
            int x3 = (int) motionEvent.getX(iFindPointerIndex);
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x3, y8);
            if (iPointToPosition == -1) {
                z8 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x3;
                float f11 = y8;
                this.f12667o = true;
                int i10 = Build.VERSION.SDK_INT;
                AbstractC0861h0.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f12663f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f12663f = iPointToPosition;
                AbstractC0861h0.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z11 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top2 = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f12658a;
                rect.set(left, top2, right, bottom);
                rect.left -= this.f12659b;
                rect.top -= this.f12660c;
                rect.right += this.f12661d;
                rect.bottom += this.f12662e;
                if (i10 >= 33) {
                    zA = AbstractC0865j0.a(this);
                } else {
                    Field field = AbstractC0869l0.f12957a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z12 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0865j0.b(this, z12);
                    } else {
                        Field field2 = AbstractC0869l0.f12957a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z12));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                C0867k0 c0867k0 = this.f12664g;
                if (c0867k0 != null) {
                    c0867k0.f12939a = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z3 = true;
                z8 = false;
            }
        }
        if (z3) {
            this.f12667o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f12663f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f12667o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f12663f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z3) {
            if (this.f12668p == null) {
                this.f12668p = new androidx.core.widget.e(this);
            }
            androidx.core.widget.e eVar3 = this.f12668p;
            boolean z13 = eVar3.f16352B;
            eVar3.f16352B = true;
            eVar3.onTouch(this, motionEvent);
        } else {
            eVar = this.f12668p;
            if (eVar != null) {
                if (eVar.f16352B) {
                    eVar.d();
                }
                eVar.f16352B = false;
            }
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f12658a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.t != null) {
            return;
        }
        super.drawableStateChanged();
        C0867k0 c0867k0 = this.f12664g;
        if (c0867k0 != null) {
            c0867k0.f12939a = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f12667o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f12666j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f12666j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f12666j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f12666j && this.f12665i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.t == null) {
            RunnableC0871m0 runnableC0871m0 = new RunnableC0871m0(this, 0);
            this.t = runnableC0871m0;
            post(runnableC0871m0);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i7 < 30 || !AbstractC0863i0.f12919d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0863i0.f12916a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0863i0.f12917b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0863i0.f12918c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f12667o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12663f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0871m0 runnableC0871m0 = this.t;
        if (runnableC0871m0 != null) {
            DropDownListView dropDownListView = (DropDownListView) runnableC0871m0.f12970b;
            dropDownListView.t = null;
            dropDownListView.removeCallbacks(runnableC0871m0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f12665i = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0867k0 c0867k0;
        if (drawable != null) {
            c0867k0 = new C0867k0(drawable);
            c0867k0.f12939a = true;
        } else {
            c0867k0 = null;
        }
        this.f12664g = c0867k0;
        super.setSelector(c0867k0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f12659b = rect.left;
        this.f12660c = rect.top;
        this.f12661d = rect.right;
        this.f12662e = rect.bottom;
    }
}

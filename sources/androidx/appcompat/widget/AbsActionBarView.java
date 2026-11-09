package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0846a f12512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f12514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0868l f12515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.core.view.U f12517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12518g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12519i;

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f12512a = new C0846a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p241q.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f12513b = context;
        } else {
            this.f12513b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i10);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int d(View view, boolean z3, int i7, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z3) {
            view.layout(i7 - measuredWidth, i12, i7, measuredHeight + i12);
        } else {
            view.layout(i7, i12, i7 + measuredWidth, measuredHeight + i12);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p241q.j.ActionBar, p241q.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p241q.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0868l c0868l = this.f12515d;
        if (c0868l != null) {
            c0868l.f12944C = p382zb.H.a(c0868l.f12379b).b();
            androidx.appcompat.view.menu.k kVar = c0868l.f12380c;
            if (kVar != null) {
                kVar.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f12519i = false;
        }
        if (!this.f12519i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f12519i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f12519i = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12518g = false;
        }
        if (!this.f12518g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f12518g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f12518g = false;
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            androidx.core.view.U u6 = this.f12517f;
            if (u6 != null) {
                u6.b();
            }
            super.setVisibility(i7);
        }
    }
}

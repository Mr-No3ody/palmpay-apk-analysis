package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes4.dex */
public class CompatStateEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f30973i = {o.state_error};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f30977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View.OnClickListener f30978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R3.e f30980g;

    public CompatStateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.editTextStyle);
    }

    public final void a() {
        if (TextUtils.isEmpty(getText().toString()) || !this.f30974a || !isEnabled()) {
            Drawable drawable = this.f30977d;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
            } else {
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
            }
            this.f30976c = false;
            return;
        }
        if (!this.f30975b || this.f30976c) {
            return;
        }
        this.f30976c = true;
        Drawable drawable2 = getContext().getDrawable(r.cv_circle_gray_cross);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable2, getCompoundDrawables()[3]);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f30980g);
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        if (!this.f30979f) {
            return super.onCreateDrawableState(i7);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        View.mergeDrawableStates(iArrOnCreateDrawableState, f30973i);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f30980g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i7, Rect rect) {
        super.onFocusChanged(z3, i7, rect);
        this.f30974a = z3;
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 1) {
            if (getCompoundDrawables()[2] != null) {
                boolean z3 = motionEvent.getX() > ((float) ((getWidth() - getTotalPaddingRight()) - getCompoundDrawablePadding())) && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() > 0.0f && motionEvent.getY() < ((float) getHeight());
                Drawable drawable2 = getCompoundDrawables()[2];
                if (drawable2 != null) {
                    drawable2.setAlpha(255);
                }
                if (z3) {
                    if (this.f30976c) {
                        getText().clear();
                        return true;
                    }
                    View.OnClickListener onClickListener = this.f30978e;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 0) {
            if (getCompoundDrawables()[2] != null) {
                if (motionEvent.getX() <= (getWidth() - getTotalPaddingRight()) - getCompoundDrawablePadding() || motionEvent.getX() >= getWidth() || motionEvent.getY() <= 0.0f || motionEvent.getY() >= getHeight()) {
                    Drawable drawable3 = getCompoundDrawables()[2];
                    if (drawable3 != null) {
                        drawable3.setAlpha(255);
                    }
                } else {
                    Drawable drawable4 = getCompoundDrawables()[2];
                    if (drawable4 != null) {
                        drawable4.setAlpha(128);
                    }
                }
            }
        } else if (motionEvent.getAction() == 3 && getCompoundDrawables()[2] != null && (drawable = getCompoundDrawables()[2]) != null) {
            drawable.setAlpha(255);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRightButtonClickListener(View.OnClickListener onClickListener) {
        this.f30978e = onClickListener;
    }

    public void setStateError(boolean z3) {
        if (this.f30979f != z3) {
            this.f30979f = z3;
            refreshDrawableState();
        }
    }

    public CompatStateEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f30975b = true;
        this.f30980g = new R3.e(this, 13);
        this.f30977d = getCompoundDrawables()[2];
    }
}

package com.transsnet.palmpay.sidebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.custom_view.n;
import com.transsnet.palmpay.custom_view.x;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SideBarView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f34117A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f34124g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextPaint f34125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnLetterChangeListener f34126j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f34128p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f34129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34130w;

    public interface OnLetterChangeListener {
        void onLetterChanged(String str);

        void onLetterGone();
    }

    public SideBarView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int y8;
        int i7;
        OnLetterChangeListener onLetterChangeListener;
        OnLetterChangeListener onLetterChangeListener2;
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(this.f34122e);
            y8 = (int) ((motionEvent.getY() - this.t) / this.f34128p);
            this.f34117A = y8;
            if (y8 >= 0 && y8 < this.f34124g.size() && (i7 = this.f34117A) != this.f34130w && (onLetterChangeListener = this.f34126j) != null) {
                onLetterChangeListener.onLetterChanged((String) this.f34124g.get(i7));
                this.f34130w = this.f34117A;
            }
        } else if (action == 1) {
            setBackgroundColor(this.f34123f);
            this.f34117A = -1;
            this.f34130w = -1;
            onLetterChangeListener2 = this.f34126j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        } else if (action == 2) {
            setBackgroundColor(this.f34122e);
            y8 = (int) ((motionEvent.getY() - this.t) / this.f34128p);
            this.f34117A = y8;
            if (y8 >= 0) {
                onLetterChangeListener.onLetterChanged((String) this.f34124g.get(i7));
                this.f34130w = this.f34117A;
            }
        } else if (action == 3) {
            setBackgroundColor(this.f34123f);
            this.f34117A = -1;
            this.f34130w = -1;
            onLetterChangeListener2 = this.f34126j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i7 = 0; i7 < this.f34124g.size(); i7++) {
            String str = (String) this.f34124g.get(i7);
            Rect rect = new Rect();
            this.f34125i.getTextBounds(str, 0, str.length(), rect);
            int iWidth = (int) ((this.f34127o / 2.0f) - (rect.width() / 2.0f));
            int iHeight = (int) ((i7 * this.f34128p) + (rect.height() / 2.0f) + (this.f34128p / 2.0f) + this.t);
            if (i7 == this.f34117A) {
                this.f34125i.setColor(this.f34120c);
                this.f34125i.setTextSize(this.f34121d);
            } else {
                this.f34125i.setColor(this.f34118a);
                this.f34125i.setTextSize(this.f34119b);
            }
            canvas.drawText(str, iWidth, iHeight, this.f34125i);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f34127o = getMeasuredWidth();
        this.f34128p = (((getMeasuredHeight() - this.t) - this.f34129v) * 1.0f) / this.f34124g.size();
    }

    public void setLetters(String[] strArr) {
        this.f34124g = Arrays.asList(strArr);
    }

    public void setOnLetterChangeListener(OnLetterChangeListener onLetterChangeListener) {
        this.f34126j = onLetterChangeListener;
    }

    public SideBarView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideBarView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.t = 0;
        this.f34129v = 0;
        this.f34130w = -1;
        this.f34117A = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CV_SideBarView, i7, 0);
        this.f34123f = typedArrayObtainStyledAttributes.getColor(x.CV_SideBarView_cv_normal_bg_color, Color.parseColor("#00000000"));
        this.f34122e = typedArrayObtainStyledAttributes.getColor(x.CV_SideBarView_cv_press_bg_color, Color.parseColor("#000000"));
        this.f34118a = typedArrayObtainStyledAttributes.getColor(x.CV_SideBarView_cv_textColor, Color.parseColor("#969696"));
        this.f34119b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CV_SideBarView_cv_textSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        this.f34120c = typedArrayObtainStyledAttributes.getColor(x.CV_SideBarView_cv_selectTextColor, Color.parseColor("#FF0000"));
        this.f34121d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CV_SideBarView_cv_selectTextSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CV_SideBarView_cv_padding, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
        this.f34129v = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CV_SideBarView_cv_with_favourite, false);
        if (this.f34124g == null) {
            this.f34124g = Arrays.asList(getContext().getResources().getStringArray(z3 ? n.cv_slide_bar_value_with_favourite_list : n.cv_slide_bar_value_no_favourite_list));
        }
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f34125i = textPaint;
        textPaint.setAntiAlias(true);
        this.f34125i.setTextSize(this.f34119b);
    }
}

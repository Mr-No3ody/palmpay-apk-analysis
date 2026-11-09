package com.transsnet.palmpay.contacts.ui.view;

import R9.a;
import R9.g;
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
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SideBarView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f27285A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f27292g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextPaint f27293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnLetterChangeListener f27294j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27296p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f27297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27298w;

    public interface OnLetterChangeListener {
        void onLetterChanged(String letter);

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
            setBackgroundColor(this.f27290e);
            y8 = (int) ((motionEvent.getY() - this.t) / this.f27296p);
            this.f27285A = y8;
            if (y8 >= 0 && y8 < this.f27292g.size() && (i7 = this.f27285A) != this.f27298w && (onLetterChangeListener = this.f27294j) != null) {
                onLetterChangeListener.onLetterChanged((String) this.f27292g.get(i7));
                this.f27298w = this.f27285A;
            }
        } else if (action == 1) {
            setBackgroundColor(this.f27291f);
            this.f27285A = -1;
            this.f27298w = -1;
            onLetterChangeListener2 = this.f27294j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        } else if (action == 2) {
            setBackgroundColor(this.f27290e);
            y8 = (int) ((motionEvent.getY() - this.t) / this.f27296p);
            this.f27285A = y8;
            if (y8 >= 0) {
                onLetterChangeListener.onLetterChanged((String) this.f27292g.get(i7));
                this.f27298w = this.f27285A;
            }
        } else if (action == 3) {
            setBackgroundColor(this.f27291f);
            this.f27285A = -1;
            this.f27298w = -1;
            onLetterChangeListener2 = this.f27294j;
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
        for (int i7 = 0; i7 < this.f27292g.size(); i7++) {
            String str = (String) this.f27292g.get(i7);
            Rect rect = new Rect();
            this.f27293i.getTextBounds(str, 0, str.length(), rect);
            int iWidth = (int) ((this.f27295o / 2.0f) - (rect.width() / 2.0f));
            int iHeight = (int) ((i7 * this.f27296p) + (rect.height() / 2.0f) + (this.f27296p / 2.0f) + this.t);
            if (i7 == this.f27285A) {
                this.f27293i.setColor(this.f27288c);
                this.f27293i.setTextSize(this.f27289d);
            } else {
                this.f27293i.setColor(this.f27286a);
                this.f27293i.setTextSize(this.f27287b);
            }
            canvas.drawText(str, iWidth, iHeight, this.f27293i);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f27295o = getMeasuredWidth();
        this.f27296p = (((getMeasuredHeight() - this.t) - this.f27297v) * 1.0f) / this.f27292g.size();
    }

    public void setLetters(String[] letters) {
        this.f27292g = Arrays.asList(letters);
    }

    public void setOnLetterChangeListener(OnLetterChangeListener listener) {
        this.f27294j = listener;
    }

    public SideBarView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SideBarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.t = 0;
        this.f27297v = 0;
        this.f27298w = -1;
        this.f27285A = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.CT_SideBarView, defStyleAttr, 0);
        this.f27291f = typedArrayObtainStyledAttributes.getColor(g.CT_SideBarView_ct_normal_bg_color, Color.parseColor("#00000000"));
        this.f27290e = typedArrayObtainStyledAttributes.getColor(g.CT_SideBarView_ct_press_bg_color, Color.parseColor("#000000"));
        this.f27286a = typedArrayObtainStyledAttributes.getColor(g.CT_SideBarView_ct_textColor, Color.parseColor("#969696"));
        this.f27287b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.CT_SideBarView_ct_textSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        this.f27288c = typedArrayObtainStyledAttributes.getColor(g.CT_SideBarView_ct_selectTextColor, Color.parseColor("#FF0000"));
        this.f27289d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.CT_SideBarView_ct_selectTextSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g.CT_SideBarView_ct_padding, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
        this.f27297v = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(g.CT_SideBarView_ct_with_favourite, false);
        if (this.f27292g == null) {
            this.f27292g = Arrays.asList(getContext().getResources().getStringArray(z3 ? a.ct_slide_bar_value_with_favourite_list : a.ct_slide_bar_value_no_favourite_list));
        }
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f27293i = textPaint;
        textPaint.setAntiAlias(true);
        this.f27293i.setTextSize(this.f27287b);
    }
}

package com.transsnet.palmpay.send_money.ui.view;

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
import p159kd.i;

/* JADX INFO: loaded from: classes4.dex */
public class SideBarView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f33840A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f33847g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextPaint f33848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnLetterChangeListener f33849j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f33851p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f33852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f33853w;

    public interface OnLetterChangeListener {
        void onLetterChanged(String str, int i7);

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
        List list;
        int i7;
        int i10;
        OnLetterChangeListener onLetterChangeListener;
        OnLetterChangeListener onLetterChangeListener2;
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(this.f33845e);
            this.f33840A = (int) ((motionEvent.getY() - this.t) / this.f33851p);
            list = this.f33847g;
            if (list != null && !list.isEmpty() && (i7 = this.f33840A) >= 0 && i7 < this.f33847g.size() && (i10 = this.f33840A) != this.f33853w && (onLetterChangeListener = this.f33849j) != null) {
                onLetterChangeListener.onLetterChanged((String) this.f33847g.get(i10), this.f33840A);
                this.f33853w = this.f33840A;
            }
        } else if (action == 1) {
            setBackgroundColor(this.f33846f);
            this.f33840A = -1;
            this.f33853w = -1;
            onLetterChangeListener2 = this.f33849j;
            if (onLetterChangeListener2 != null) {
                onLetterChangeListener2.onLetterGone();
            }
        } else if (action == 2) {
            setBackgroundColor(this.f33845e);
            this.f33840A = (int) ((motionEvent.getY() - this.t) / this.f33851p);
            list = this.f33847g;
            if (list != null) {
                onLetterChangeListener.onLetterChanged((String) this.f33847g.get(i10), this.f33840A);
                this.f33853w = this.f33840A;
            }
        } else if (action == 3) {
            setBackgroundColor(this.f33846f);
            this.f33840A = -1;
            this.f33853w = -1;
            onLetterChangeListener2 = this.f33849j;
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
        List list = this.f33847g;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < this.f33847g.size(); i7++) {
            String str = (String) this.f33847g.get(i7);
            Rect rect = new Rect();
            this.f33848i.getTextBounds(str, 0, str.length(), rect);
            int iWidth = (int) ((this.f33850o / 2.0f) - (rect.width() / 2.0f));
            int iHeight = (int) ((i7 * this.f33851p) + (rect.height() / 2.0f) + (this.f33851p / 2.0f) + this.t);
            if (i7 == this.f33840A) {
                this.f33848i.setColor(this.f33843c);
                this.f33848i.setTextSize(this.f33844d);
            } else {
                this.f33848i.setColor(this.f33841a);
                this.f33848i.setTextSize(this.f33842b);
            }
            canvas.drawText(str, iWidth, iHeight, this.f33848i);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f33850o = getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - this.t) - this.f33852v;
        List list = this.f33847g;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f33851p = (measuredHeight * 1.0f) / this.f33847g.size();
    }

    public void setLetters(String[] strArr) {
        this.f33847g = Arrays.asList(strArr);
        postInvalidate();
    }

    public void setOnLetterChangeListener(OnLetterChangeListener onLetterChangeListener) {
        this.f33849j = onLetterChangeListener;
    }

    public SideBarView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideBarView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.t = 0;
        this.f33852v = 0;
        this.f33853w = -1;
        this.f33840A = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.SMSideBarView, i7, 0);
        this.f33846f = typedArrayObtainStyledAttributes.getColor(i.SMSideBarView_sm_normal_bg_color, Color.parseColor("#00000000"));
        this.f33845e = typedArrayObtainStyledAttributes.getColor(i.SMSideBarView_sm_press_bg_color, Color.parseColor("#000000"));
        this.f33841a = typedArrayObtainStyledAttributes.getColor(i.SMSideBarView_sm_textColor, Color.parseColor("#969696"));
        this.f33842b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.SMSideBarView_sm_textSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        this.f33843c = typedArrayObtainStyledAttributes.getColor(i.SMSideBarView_sm_selectTextColor, Color.parseColor("#FF0000"));
        this.f33844d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.SMSideBarView_sm_selectTextSize, (int) TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics()));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.SMSideBarView_sm_padding, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
        this.f33852v = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f33848i = textPaint;
        textPaint.setAntiAlias(true);
        this.f33848i.setTextSize(this.f33842b);
    }
}

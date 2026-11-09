package com.transsnet.palmpay.custom_view.countdown;

import Ob.a;
import Ob.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.didiglobal.booster.instrument.ShadowTimer;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.x;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class CountdownView extends TextView implements CountdownTime$OnCountdownTimeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextPaint f31210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public top.zibin.luban.io.a f31211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnCountdownFinishListener f31213f;

    public interface OnCountdownFinishListener {
        void onCountdownFinish();
    }

    public CountdownView(Context context) {
        super(context);
        this.f31212e = 1;
        a(context, null);
    }

    private String getDefaultText() {
        return this.f31212e == 2 ? "00:00:00" : "00h 00m 00s";
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CountDownView);
            this.f31212e = typedArrayObtainStyledAttributes.getInt(x.CountDownView_cd_mode, this.f31212e);
            typedArrayObtainStyledAttributes.recycle();
        }
        TextPaint paint = getPaint();
        this.f31210c = paint;
        paint.setTextSize(getTextSize());
        this.f31210c.setColor(getCurrentTextColor());
        this.f31210c.setStrokeWidth(1.0f);
    }

    @Override // com.transsnet.palmpay.custom_view.countdown.CountdownTime$OnCountdownTimeListener
    public final void onCountdownFinish() {
        OnCountdownFinishListener onCountdownFinishListener = this.f31213f;
        if (onCountdownFinishListener != null) {
            onCountdownFinishListener.onCountdownFinish();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.countdown.CountdownTime$OnCountdownTimeListener
    public final void onCountdownTimeDraw(a aVar) {
        String str = this.f31208a;
        aVar.getClass();
        if (TextUtils.equals(str, "")) {
            if (this.f31209b == null) {
                int i7 = this.f31212e;
                if (i7 == 1) {
                    aVar.f6713d = "h";
                    aVar.f6714e = "m";
                    aVar.f6715f = "s";
                    aVar.f6716g = " ";
                } else if (i7 == 2) {
                    aVar.f6713d = "";
                    aVar.f6714e = "";
                    aVar.f6715f = "";
                    aVar.f6716g = ":";
                }
            }
            this.f31209b = aVar;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        top.zibin.luban.io.a aVar = this.f31211d;
        if (aVar != null) {
            b bVar = (b) aVar.f42646c;
            if (bVar != null) {
                bVar.cancel();
            }
            ShadowTimer shadowTimer = (ShadowTimer) aVar.f42645b;
            if (shadowTimer != null) {
                shadowTimer.cancel();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        String string2;
        if (this.f31209b == null) {
            string2 = getDefaultText();
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(null)) {
                sb2.append("null ");
            }
            a aVar = this.f31209b;
            StringBuilder sb3 = new StringBuilder();
            int i7 = aVar.f6717h;
            if (i7 >= 0) {
                if (i7 > 3600) {
                    int i10 = i7 / 3600;
                    aVar.f6710a = i10;
                    if (i10 > 0) {
                        int i11 = i7 % 3600;
                        aVar.f6711b = i11 / 60;
                        aVar.f6712c = i11 % 60;
                    } else {
                        aVar.f6711b = 0;
                        aVar.f6717h = i7 % 3600;
                    }
                } else {
                    aVar.f6710a = 0;
                    aVar.f6711b = i7 / 60;
                    aVar.f6712c = i7 % 60;
                }
                int i12 = aVar.f6710a;
                if (i12 < 10) {
                    sb3.append(0);
                    sb3.append(aVar.f6710a);
                    sb3.append(aVar.f6713d);
                } else {
                    sb3.append(i12);
                    sb3.append(aVar.f6713d);
                }
                if (aVar.f6711b < 10) {
                    sb3.append(aVar.f6716g);
                    sb3.append(0);
                    sb3.append(aVar.f6711b);
                    sb3.append(aVar.f6714e);
                } else {
                    sb3.append(aVar.f6716g);
                    sb3.append(aVar.f6711b);
                    sb3.append(aVar.f6714e);
                }
                if (aVar.f6712c < 10) {
                    sb3.append(aVar.f6716g);
                    sb3.append(0);
                    sb3.append(aVar.f6712c);
                    sb3.append(aVar.f6715f);
                } else {
                    sb3.append(aVar.f6716g);
                    sb3.append(aVar.f6712c);
                    sb3.append(aVar.f6715f);
                }
                string = sb3.toString();
            } else {
                string = TransType.TRANS_SCENE_REFUND + aVar.f6713d + aVar.f6716g + TransType.TRANS_SCENE_REFUND + aVar.f6714e + aVar.f6716g + TransType.TRANS_SCENE_REFUND + aVar.f6715f;
            }
            sb2.append(string);
            if (!TextUtils.isEmpty(null)) {
                sb2.append(" null");
            }
            string2 = sb2.toString();
        }
        Rect rect = new Rect();
        this.f31210c.getTextBounds(string2, 0, string2.length(), rect);
        Paint.FontMetricsInt fontMetricsInt = this.f31210c.getFontMetricsInt();
        int measuredHeight = getMeasuredHeight() - fontMetricsInt.bottom;
        int i13 = fontMetricsInt.top;
        int i14 = ((measuredHeight + i13) / 2) - i13;
        if ((getGravity() & 3) == 3) {
            canvas.drawText(string2, 0.0f, i14, this.f31210c);
        } else {
            canvas.drawText(string2, (getMeasuredWidth() / 2) - (rect.width() / 2), i14, this.f31210c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMeasureText = (int) this.f31210c.measureText(getDefaultText());
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == 1073741824) {
            iMeasureText = size;
        } else if (mode == Integer.MIN_VALUE) {
            iMeasureText = Math.min(iMeasureText, size);
        }
        int iMeasureText2 = (int) this.f31210c.measureText(TransType.TRANS_SCENE_REFUND);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            iMeasureText2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMeasureText2 = Math.min(iMeasureText2, size2);
        }
        setMeasuredDimension(iMeasureText, iMeasureText2);
    }

    public void setCountdownTime(int i7) {
        if (this.f31211d == null) {
            top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(16, false);
            aVar.f42645b = new ShadowTimer(true, "\u200bcom.transsnet.palmpay.custom_view.countdown.CountdownTimeManager");
            aVar.f42646c = new b(aVar);
            this.f31211d = aVar;
        }
        this.f31208a = "";
        if (i7 <= 0) {
            a aVar2 = this.f31209b;
            if (aVar2 != null) {
                aVar2.f6717h = 0;
            }
        } else {
            WeakReference weakReference = new WeakReference(this);
            top.zibin.luban.io.a aVar3 = this.f31211d;
            CountdownTime$OnCountdownTimeListener countdownTime$OnCountdownTimeListener = (CountdownTime$OnCountdownTimeListener) weakReference.get();
            if (((a) aVar3.f42647d) == null) {
                a aVar4 = new a();
                aVar4.f6713d = "h";
                aVar4.f6714e = "m";
                aVar4.f6715f = "s";
                aVar4.f6716g = " ";
                aVar4.f6717h = i7;
                aVar4.f6718i = countdownTime$OnCountdownTimeListener;
                aVar3.f42647d = aVar4;
                ((ShadowTimer) aVar3.f42645b).schedule((b) aVar3.f42646c, 1000L, 1000L);
            }
            this.f31209b = (a) aVar3.f42647d;
        }
        postInvalidate();
    }

    public void setFinishListener(OnCountdownFinishListener onCountdownFinishListener) {
        this.f31213f = onCountdownFinishListener;
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31212e = 1;
        a(context, attributeSet);
    }

    public CountdownView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31212e = 1;
        a(context, attributeSet);
    }
}

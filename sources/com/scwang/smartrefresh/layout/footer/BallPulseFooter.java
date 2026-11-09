package com.scwang.smartrefresh.layout.footer;

import C0.G;
import C7.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import androidx.core.graphics.d;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BallPulseFooter extends InternalAbstract implements RefreshFooter {
    public static final int DEFAULT_SIZE = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f25110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25112g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f25113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f25114j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f25116p;
    public final HashMap t;

    public BallPulseFooter(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        super(context, attributeSet, i7);
        this.f25111f = -1118482;
        this.f25112g = -1615546;
        this.f25114j = new float[]{1.0f, 1.0f, 1.0f};
        this.f25115o = false;
        this.t = new HashMap();
        setMinimumHeight(DensityUtil.dp2px(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BallPulseFooter);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BallPulseFooter_srlNormalColor)) {
            setNormalColor(typedArrayObtainStyledAttributes.getColor(R.styleable.BallPulseFooter_srlNormalColor, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BallPulseFooter_srlAnimatingColor)) {
            setAnimatingColor(typedArrayObtainStyledAttributes.getColor(R.styleable.BallPulseFooter_srlAnimatingColor, 0));
        }
        this.f25172b = SpinnerStyle.Translate;
        this.f25172b = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.BallPulseFooter_srlClassicsSpinnerStyle, this.f25172b.ordinal())];
        typedArrayObtainStyledAttributes.recycle();
        this.f25113i = DensityUtil.dp2px(4.0f);
        Paint paint = new Paint();
        this.f25110e = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f25116p = new ArrayList();
        int[] iArr = {KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 240, MessageEvent.EVENT_CL_REPAYMENT_FAILED};
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimatorD = G.d(750L, new float[]{1.0f, 0.3f, 1.0f}, -1);
            valueAnimatorD.setTarget(Integer.valueOf(i10));
            valueAnimatorD.setStartDelay(iArr[i10]);
            this.t.put(valueAnimatorD, new a(this, i10, this));
            this.f25116p.add(valueAnimatorD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f10 = this.f25113i;
        float fA = u.a(f10, 2.0f, fMin, 6.0f);
        float f11 = 2.0f * fA;
        float f12 = (width / 2) - (f11 + f10);
        float f13 = height / 2;
        for (int i7 = 0; i7 < 3; i7++) {
            canvas.save();
            float f14 = i7;
            canvas.translate((f14 * f10) + (f11 * f14) + f12, f13);
            float f15 = this.f25114j[i7];
            canvas.scale(f15, f15);
            canvas.drawCircle(0.0f, 0.0f, fA, this.f25110e);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f25116p;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((ValueAnimator) arrayList.get(i7)).cancel();
                ((ValueAnimator) arrayList.get(i7)).removeAllListeners();
                ((ValueAnimator) arrayList.get(i7)).removeAllUpdateListeners();
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        ArrayList<ValueAnimator> arrayList = this.f25116p;
        if (arrayList != null && this.f25115o) {
            this.f25115o = false;
            this.f25114j = new float[]{1.0f, 1.0f, 1.0f};
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
        this.f25110e.setColor(this.f25111f);
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        if (this.f25115o) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25116p;
            if (i11 >= arrayList.size()) {
                this.f25115o = true;
                this.f25110e.setColor(this.f25112g);
                return;
            }
            ValueAnimator valueAnimator = (ValueAnimator) arrayList.get(i11);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.t.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
            i11++;
        }
    }

    public BallPulseFooter setAnimatingColor(@ColorInt int i7) {
        this.f25112g = i7;
        this.f25109d = true;
        if (this.f25115o) {
            this.f25110e.setColor(i7);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean z3) {
        return false;
    }

    public BallPulseFooter setNormalColor(@ColorInt int i7) {
        this.f25111f = i7;
        this.f25108c = true;
        if (!this.f25115o) {
            this.f25110e.setColor(i7);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (!this.f25109d && iArr.length > 1) {
            setAnimatingColor(iArr[0]);
            this.f25109d = false;
        }
        if (this.f25108c) {
            return;
        }
        if (iArr.length > 1) {
            setNormalColor(iArr[1]);
        } else if (iArr.length > 0) {
            setNormalColor(d.c(-1711276033, iArr[0]));
        }
        this.f25108c = false;
    }

    public BallPulseFooter setSpinnerStyle(SpinnerStyle spinnerStyle) {
        this.f25172b = spinnerStyle;
        return this;
    }

    public BallPulseFooter(@NonNull Context context) {
        this(context, null);
    }

    public BallPulseFooter(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

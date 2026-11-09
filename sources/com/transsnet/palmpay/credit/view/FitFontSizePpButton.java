package com.transsnet.palmpay.credit.view;

import Ab.i;
import F6.d;
import L6.f;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/view/FitFontSizePpButton;", "Lcom/palmpay/lib/ui/button/PpButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FitFontSizePpButton extends PpButton {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f30750v = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f30751j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f30752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f30753p;
    public float t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitFontSizePpButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        try {
            o oVar = q.f43977a;
            g();
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
    }

    public final void e() {
        try {
            o oVar = q.f43977a;
            f();
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
    }

    public final void f() {
        TextView textView = this.f30752o;
        if (textView == null || this.f30751j == null) {
            return;
        }
        String strValueOf = String.valueOf(textView != null ? textView.getText() : null);
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView2 = this.f30752o;
        int paddingLeft = measuredWidth - (textView2 != null ? textView2.getPaddingLeft() : 0);
        TextView textView3 = this.f30752o;
        int paddingRight = paddingLeft - (textView3 != null ? textView3.getPaddingRight() : 0);
        if (paddingRight <= 0) {
            return;
        }
        d.h("FitFontSizePpButton", 3, "adjustTextSize, text=" + strValueOf + ", availableWidth=" + paddingRight);
        float f10 = this.t;
        float f11 = this.f30753p;
        float f12 = f10;
        for (int i7 = 0; i7 < 10; i7++) {
            float f13 = (f12 + f11) / 2;
            Paint paint = this.f30751j;
            Intrinsics.e(paint);
            paint.setTextSize(f13);
            Paint paint2 = this.f30751j;
            Intrinsics.e(paint2);
            if (paint2.measureText(strValueOf) <= paddingRight) {
                f10 = f13;
                f12 = f10;
            } else {
                f11 = f13;
            }
        }
        float f14 = f10 / getResources().getDisplayMetrics().scaledDensity;
        d.h("FitFontSizePpButton", 3, "adjustTextSize, bestSizeSp=" + f14);
        TextView textView4 = this.f30752o;
        if (textView4 != null) {
            textView4.setTextSize(2, f14);
        }
    }

    public final void g() {
        d.h("FitFontSizePpButton", 3, "initExtra >>>");
        this.f30753p = TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics());
        float fApplyDimension = TypedValue.applyDimension(2, 8.0f, getResources().getDisplayMetrics());
        this.t = fApplyDimension;
        d.h("FitFontSizePpButton", 3, "initExtra >>> mMaxTextSize=" + this.f30753p + ", mMinTextSize=" + fApplyDimension);
        this.f30752o = (TextView) findViewById(f.tv_text);
        Paint paint = new Paint();
        TextView textView = this.f30752o;
        paint.set(textView != null ? textView.getPaint() : null);
        this.f30751j = paint;
        TextView textView2 = this.f30752o;
        if (textView2 != null) {
            textView2.addTextChangedListener(new i(this, 13));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        e();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            e();
        }
    }
}

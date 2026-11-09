package com.transsnet.palmpay.credit.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p116hb.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/AutoFitTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoFitTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.AutoFitTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30619a = typedArrayObtainStyledAttributes.getDimension(g.AutoFitTextView_maxTextWidth, Float.MAX_VALUE);
        this.f30620b = typedArrayObtainStyledAttributes.getDimension(g.AutoFitTextView_minTextSize, getTextSize());
        this.f30621c = typedArrayObtainStyledAttributes.getDimension(g.AutoFitTextView_maxTextSize, getTextSize());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float fMeasureText = getPaint().measureText(getText().toString());
        float textSize = getTextSize();
        float f10 = this.f30619a;
        if (fMeasureText > f10) {
            textSize = this.f30621c;
        } else if (fMeasureText < f10 / 2) {
            textSize = this.f30620b;
        }
        getPaint().setTextSize(textSize);
        super.onMeasure(i7, i10);
    }
}

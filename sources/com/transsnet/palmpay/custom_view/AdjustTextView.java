package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/custom_view/AdjustTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdjustTextView extends TextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdjustTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Layout layout = getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        int lineCount = layout.getLineCount();
        float f10 = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            float lineWidth = layout.getLineWidth(i11);
            if (lineWidth >= f10) {
                f10 = lineWidth;
            }
        }
        setMeasuredDimension((int) Math.ceil(f10), getMeasuredHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdjustTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

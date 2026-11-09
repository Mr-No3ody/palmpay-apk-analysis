package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/PreviewPageItemContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/viewmodel/ModelItemFee;", "a", "Lcom/transsnet/palmpay/core/viewmodel/ModelItemFee;", "getEarlyRefundInEffectItem", "()Lcom/transsnet/palmpay/core/viewmodel/ModelItemFee;", "setEarlyRefundInEffectItem", "(Lcom/transsnet/palmpay/core/viewmodel/ModelItemFee;)V", "earlyRefundInEffectItem", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewPageItemContainer extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ModelItemFee earlyRefundInEffectItem;

    public PreviewPageItemContainer(@Nullable Context context) {
        super(context);
    }

    public final void a(boolean z3) {
        if (!z3) {
            ModelItemFee modelItemFee = this.earlyRefundInEffectItem;
            if (modelItemFee != null) {
                modelItemFee.setVisibility(8);
                return;
            }
            return;
        }
        if (this.earlyRefundInEffectItem == null) {
            this.earlyRefundInEffectItem = new ModelItemFee(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(q.cv_preview_item_height));
            layoutParams.setMarginStart(getResources().getDimensionPixelSize(q.cv_preview_item_margin));
            layoutParams.setMarginEnd(layoutParams.getMarginStart());
            ModelItemFee modelItemFee2 = this.earlyRefundInEffectItem;
            Intrinsics.e(modelItemFee2);
            modelItemFee2.f28364e.setVisibility(0);
            ModelItemFee modelItemFee3 = this.earlyRefundInEffectItem;
            Intrinsics.e(modelItemFee3);
            String string = getResources().getString(k.core_early_refund);
            String string2 = getResources().getString(k.core_eligible);
            modelItemFee3.f28361b.setText(string);
            modelItemFee3.setContent(string2);
            if (getChildCount() > 1) {
                addView(this.earlyRefundInEffectItem, getChildCount() - 2, layoutParams);
            } else {
                addView(this.earlyRefundInEffectItem, layoutParams);
            }
        }
        ModelItemFee modelItemFee4 = this.earlyRefundInEffectItem;
        Intrinsics.e(modelItemFee4);
        modelItemFee4.setVisibility(0);
    }

    @Nullable
    public final ModelItemFee getEarlyRefundInEffectItem() {
        return this.earlyRefundInEffectItem;
    }

    public final void setEarlyRefundInEffectItem(@Nullable ModelItemFee modelItemFee) {
        this.earlyRefundInEffectItem = modelItemFee;
    }

    public PreviewPageItemContainer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewPageItemContainer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}

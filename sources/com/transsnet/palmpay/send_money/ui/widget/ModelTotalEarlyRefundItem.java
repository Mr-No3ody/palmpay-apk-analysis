package com.transsnet.palmpay.send_money.ui.widget;

import Pa.r0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.cashier.FastTransSaveGuardDto;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.ui.widget.ModelTotalEarlyRefundItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p237pd.b;
import p237pd.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/widget/ModelTotalEarlyRefundItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setData", "(Lcom/transsnet/palmpay/core/bean/cashier/FastTransSaveGuardDto;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTvTips", "()Landroid/widget/TextView;", "tvTips", "Landroid/widget/ImageView;", "b", "getIvTop", "()Landroid/widget/ImageView;", "ivTop", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelTotalEarlyRefundItem extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33958c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33960b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelTotalEarlyRefundItem(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIvTop() {
        return (ImageView) this.f33960b.getValue();
    }

    private final TextView getTvTips() {
        return (TextView) this.f33959a.getValue();
    }

    public final void setData(@Nullable FastTransSaveGuardDto data) {
        if (data != null) {
            r0.k1(getIvTop(), data.getTitle(), data.getDarkTitle());
            TextView tvTips = getTvTips();
            if (tvTips != null) {
                tvTips.setText(data.getDescription());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelTotalEarlyRefundItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelTotalEarlyRefundItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f33959a = C2131j.b(new Function0(this) { // from class: Id.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelTotalEarlyRefundItem f4307b;

            {
                this.f4307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelTotalEarlyRefundItem modelTotalEarlyRefundItem = this.f4307b;
                switch (i10) {
                    case 0:
                        int i11 = ModelTotalEarlyRefundItem.f33958c;
                        return (TextView) modelTotalEarlyRefundItem.findViewById(b.tvTips);
                    default:
                        int i12 = ModelTotalEarlyRefundItem.f33958c;
                        return (ImageView) modelTotalEarlyRefundItem.findViewById(b.ivTop);
                }
            }
        });
        final int i11 = 1;
        this.f33960b = C2131j.b(new Function0(this) { // from class: Id.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelTotalEarlyRefundItem f4307b;

            {
                this.f4307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelTotalEarlyRefundItem modelTotalEarlyRefundItem = this.f4307b;
                switch (i11) {
                    case 0:
                        int i12 = ModelTotalEarlyRefundItem.f33958c;
                        return (TextView) modelTotalEarlyRefundItem.findViewById(b.tvTips);
                    default:
                        int i13 = ModelTotalEarlyRefundItem.f33958c;
                        return (ImageView) modelTotalEarlyRefundItem.findViewById(b.ivTop);
                }
            }
        });
        View.inflate(context, c.sm_model_total_early_refund_item, this);
        setBackgroundResource(r.cv_rect_corner_12_bg_white);
    }
}

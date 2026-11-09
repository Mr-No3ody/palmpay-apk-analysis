package com.transsnet.palmpay.core.viewmodel;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.EarlyRefundBean;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.core.viewmodel.ModelNewEarlyRefundItem;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p025ba.e;
import p025ba.g;
import p185ma.i;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001b\u0010+\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010!R\u001b\u0010.\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelNewEarlyRefundItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setData", "(Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;)V", "Lcom/transsnet/palmpay/core/viewmodel/ModelNewEarlyRefundItem$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Lcom/transsnet/palmpay/core/viewmodel/ModelNewEarlyRefundItem$OnCheckedChangeListener;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_early_refund_amount", "()Landroid/widget/TextView;", "tv_early_refund_amount", "b", "getTv_early_refund_discount", "tv_early_refund_discount", "Landroid/widget/ImageView;", "c", "getSc_buy", "()Landroid/widget/ImageView;", "sc_buy", "d", "getIv_tag", "iv_tag", "e", "getTv_early_refund_tip", "tv_early_refund_tip", "f", "getIv_rule", "iv_rule", "g", "getTv_early_refund_title", "tv_early_refund_title", "OnCheckedChangeListener", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelNewEarlyRefundItem extends ConstraintLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f28382p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28389g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f28390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28391j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnCheckedChangeListener f28392o;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelNewEarlyRefundItem$OnCheckedChangeListener;", "", "onCheckedChanged", "", "isChecked", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChanged(boolean isChecked);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelNewEarlyRefundItem(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_rule() {
        Object value = this.f28388f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIv_tag() {
        Object value = this.f28386d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getSc_buy() {
        Object value = this.f28385c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTv_early_refund_amount() {
        Object value = this.f28383a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_early_refund_discount() {
        Object value = this.f28384b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_early_refund_tip() {
        Object value = this.f28387e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_early_refund_title() {
        Object value = this.f28389g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void setData(@Nullable EarlyRefundBean data) {
        if (data != null) {
            getTv_early_refund_title().setText(data.title);
            getTv_early_refund_tip().setText(data.tips);
            if (!TextUtils.isEmpty(data.imageUrl)) {
                r0.l1(data.imageUrl, getIv_tag());
            }
            boolean z3 = data.selected == 1;
            this.f28391j = z3;
            getSc_buy().setImageResource(z3 ? d.core_bg_cb_checked : d.core_bg_cb_uncheck);
            if (data.payerAmount <= 0) {
                h.c(getTv_early_refund_discount());
                getTv_early_refund_amount().setText("Free");
                getTv_early_refund_amount().setTextColor(getContext().getColor(L6.b.ppColorPrimary));
            } else if (data.platformAmount <= 0) {
                h.c(getTv_early_refund_discount());
                getTv_early_refund_amount().setTextColor(getContext().getColor(L6.b.ppColorTextPrimary));
                getTv_early_refund_amount().setText(r0.B(data.payerAmount, false));
            } else {
                h.C(getTv_early_refund_discount());
                getTv_early_refund_discount().setText(r0.B(data.payerAmount + data.platformAmount, false));
                getTv_early_refund_amount().setTextColor(getContext().getColor(L6.b.ppColorPrimary));
                getTv_early_refund_amount().setText(r0.B(data.payerAmount, false));
            }
        }
    }

    public final void setOnCheckedChangeListener(@NotNull OnCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28392o = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelNewEarlyRefundItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelNewEarlyRefundItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28383a = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i10) {
                    case 0:
                        int i11 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i12 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i13 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i14 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i15 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i11 = 1;
        this.f28384b = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i11) {
                    case 0:
                        int i12 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i13 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i14 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i15 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i12 = 2;
        this.f28385c = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i12) {
                    case 0:
                        int i13 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i14 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i15 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i19 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i13 = 3;
        this.f28386d = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i13) {
                    case 0:
                        int i14 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i15 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i19 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i110 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i14 = 4;
        this.f28387e = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i14) {
                    case 0:
                        int i15 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i19 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i110 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i111 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i15 = 5;
        this.f28388f = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i15) {
                    case 0:
                        int i16 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i19 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i110 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i111 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i112 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        final int i16 = 6;
        this.f28389g = C2131j.b(new Function0(this) { // from class: Ua.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9389b;

            {
                this.f9389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9389b;
                switch (i16) {
                    case 0:
                        int i17 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_amount);
                    case 1:
                        int i18 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_discount);
                    case 2:
                        int i19 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.sc_buy);
                    case 3:
                        int i110 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_tag);
                    case 4:
                        int i111 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_tip);
                    case 5:
                        int i112 = ModelNewEarlyRefundItem.f28382p;
                        return (ImageView) modelNewEarlyRefundItem.findViewById(p025ba.e.iv_rule);
                    default:
                        int i113 = ModelNewEarlyRefundItem.f28382p;
                        return (TextView) modelNewEarlyRefundItem.findViewById(p025ba.e.tv_early_refund_title);
                }
            }
        });
        View.inflate(context, g.core_model_new_early_refund_item, this);
        setBackgroundResource(r.cv_rect_corner_12_bg_white);
        getTv_early_refund_discount().getPaint().setFlags(16);
        final int i17 = 0;
        getIv_rule().setOnClickListener(new View.OnClickListener(this) { // from class: Ua.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9393b;

            {
                this.f9393b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p185ma.i iVar;
                switch (i17) {
                    case 0:
                        ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9393b;
                        if (modelNewEarlyRefundItem.f28390i == null) {
                            Context context2 = modelNewEarlyRefundItem.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            final p185ma.i iVar2 = new p185ma.i(context2);
                            final int i18 = 0;
                            p355xf.t tVarB = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            final int i19 = 1;
                            p355xf.t tVarB2 = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            final int i20 = 2;
                            p355xf.t tVarB3 = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            iVar2.setContentView(p025ba.g.core_dialog_new_early_refund_protocol);
                            iVar2.setCancelable(false);
                            iVar2.setCanceledOnTouchOutside(false);
                            ImageView imageView = (ImageView) tVarB3.getValue();
                            if (imageView != null) {
                                final int i21 = 0;
                                imageView.setOnClickListener(new View.OnClickListener() { // from class: ma.h
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i21) {
                                            case 0:
                                                iVar2.dismiss();
                                                break;
                                            default:
                                                iVar2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView = (TextView) tVarB.getValue();
                            if (textView != null) {
                                final int i22 = 1;
                                textView.setOnClickListener(new View.OnClickListener() { // from class: ma.h
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i22) {
                                            case 0:
                                                iVar2.dismiss();
                                                break;
                                            default:
                                                iVar2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                            AndroidXWebView androidXWebView = (AndroidXWebView) tVarB2.getValue();
                            if (androidXWebView != null) {
                                androidXWebView.loadUrl(com.transsnet.palmpay.core.config.d.g("/h5/assurance-agreement"));
                            }
                            iVar2.f31260a = ScreenUtils.dip2px(548.0f);
                            modelNewEarlyRefundItem.f28390i = iVar2;
                        }
                        p185ma.i iVar3 = modelNewEarlyRefundItem.f28390i;
                        if (iVar3 != null && !iVar3.isShowing() && (iVar = modelNewEarlyRefundItem.f28390i) != null) {
                            iVar.show();
                            break;
                        }
                        break;
                    default:
                        ModelNewEarlyRefundItem modelNewEarlyRefundItem2 = this.f9393b;
                        ModelNewEarlyRefundItem.OnCheckedChangeListener onCheckedChangeListener = modelNewEarlyRefundItem2.f28392o;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(!modelNewEarlyRefundItem2.f28391j);
                        }
                        break;
                }
            }
        });
        final int i18 = 1;
        getSc_buy().setOnClickListener(new View.OnClickListener(this) { // from class: Ua.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNewEarlyRefundItem f9393b;

            {
                this.f9393b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p185ma.i iVar;
                switch (i18) {
                    case 0:
                        ModelNewEarlyRefundItem modelNewEarlyRefundItem = this.f9393b;
                        if (modelNewEarlyRefundItem.f28390i == null) {
                            Context context2 = modelNewEarlyRefundItem.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            final p185ma.i iVar2 = new p185ma.i(context2);
                            final int i19 = 0;
                            p355xf.t tVarB = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            final int i110 = 1;
                            p355xf.t tVarB2 = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            final int i20 = 2;
                            p355xf.t tVarB3 = C2131j.b(new Function0() { // from class: ma.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            return (TextView) iVar2.findViewById(e.tv_confirm);
                                        case 1:
                                            return (AndroidXWebView) iVar2.findViewById(e.wv_protocol);
                                        default:
                                            return (ImageView) iVar2.findViewById(e.iv_close);
                                    }
                                }
                            });
                            iVar2.setContentView(p025ba.g.core_dialog_new_early_refund_protocol);
                            iVar2.setCancelable(false);
                            iVar2.setCanceledOnTouchOutside(false);
                            ImageView imageView = (ImageView) tVarB3.getValue();
                            if (imageView != null) {
                                final int i21 = 0;
                                imageView.setOnClickListener(new View.OnClickListener() { // from class: ma.h
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i21) {
                                            case 0:
                                                iVar2.dismiss();
                                                break;
                                            default:
                                                iVar2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                            TextView textView = (TextView) tVarB.getValue();
                            if (textView != null) {
                                final int i22 = 1;
                                textView.setOnClickListener(new View.OnClickListener() { // from class: ma.h
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i22) {
                                            case 0:
                                                iVar2.dismiss();
                                                break;
                                            default:
                                                iVar2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                            AndroidXWebView androidXWebView = (AndroidXWebView) tVarB2.getValue();
                            if (androidXWebView != null) {
                                androidXWebView.loadUrl(com.transsnet.palmpay.core.config.d.g("/h5/assurance-agreement"));
                            }
                            iVar2.f31260a = ScreenUtils.dip2px(548.0f);
                            modelNewEarlyRefundItem.f28390i = iVar2;
                        }
                        p185ma.i iVar3 = modelNewEarlyRefundItem.f28390i;
                        if (iVar3 != null && !iVar3.isShowing() && (iVar = modelNewEarlyRefundItem.f28390i) != null) {
                            iVar.show();
                            break;
                        }
                        break;
                    default:
                        ModelNewEarlyRefundItem modelNewEarlyRefundItem2 = this.f9393b;
                        ModelNewEarlyRefundItem.OnCheckedChangeListener onCheckedChangeListener = modelNewEarlyRefundItem2.f28392o;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(!modelNewEarlyRefundItem2.f28391j);
                        }
                        break;
                }
            }
        });
    }
}

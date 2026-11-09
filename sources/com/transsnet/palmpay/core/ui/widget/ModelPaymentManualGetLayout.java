package com.transsnet.palmpay.core.ui.widget;

import Gb.T;
import La.i;
import Oa.k;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.payment.CashierManualGet;
import com.transsnet.palmpay.core.bean.payment.CashierManualGetRewardItem;
import com.transsnet.palmpay.core.ui.widget.ModelPaymentManualGetLayout;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/ModelPaymentManualGetLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "earnInfoTips", "", "setManualGetInfoTips", "(Ljava/lang/String;)V", "title", "setManualGetInfoTitle", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTipsClickListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setManualGetInfoData", "(Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;)V", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Lkotlin/Lazy;", "getPromotionInfoLayout", "()Landroidx/recyclerview/widget/RecyclerView;", "promotionInfoLayout", "Landroid/view/View;", "d", "getIcon", "()Landroid/view/View;", "icon", "Landroid/widget/TextView;", "e", "getTitleTv", "()Landroid/widget/TextView;", "titleTv", "LOa/k;", "f", "getPaymentEarnAdapter", "()LOa/k;", "paymentEarnAdapter", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPaymentManualGetLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28139g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f28140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28145f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentManualGetLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final View getIcon() {
        Object value = this.f28143d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @NotNull
    public final k getPaymentEarnAdapter() {
        return (k) this.f28145f.getValue();
    }

    @NotNull
    public final RecyclerView getPromotionInfoLayout() {
        Object value = this.f28142c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @NotNull
    public final TextView getTitleTv() {
        Object value = this.f28144e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void setManualGetInfoData(@Nullable CashierManualGet data) {
        List<CashierManualGetRewardItem> list;
        if (data == null || (list = data.getList()) == null || list.isEmpty()) {
            setVisibility(8);
        } else {
            setVisibility(0);
            getPaymentEarnAdapter().setList(list);
        }
        setManualGetInfoTips(data != null ? data.getTips() : null);
        setManualGetInfoTitle(data != null ? data.getTitle() : null);
    }

    public final void setManualGetInfoTips(@Nullable String earnInfoTips) {
        this.f28141b = earnInfoTips;
        View icon = getIcon();
        if (icon != null) {
            icon.setVisibility(TextUtils.isEmpty(earnInfoTips) ? 8 : 0);
        }
    }

    public final void setManualGetInfoTitle(@Nullable String title) {
        TextView titleTv = getTitleTv();
        if (titleTv != null) {
            titleTv.setVisibility(TextUtils.isEmpty(title) ? 8 : 0);
        }
        TextView titleTv2 = getTitleTv();
        if (titleTv2 != null) {
            if (title == null) {
                title = "";
            }
            titleTv2.setText(title);
        }
    }

    public final void setTipsClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28140a = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentManualGetLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPaymentManualGetLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentManualGetLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28140a = new i(18);
        final int i10 = 0;
        this.f28142c = C2131j.b(new Function0(this) { // from class: Oa.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentManualGetLayout f6705b;

            {
                this.f6705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentManualGetLayout modelPaymentManualGetLayout = this.f6705b;
                switch (i10) {
                    case 0:
                        int i11 = ModelPaymentManualGetLayout.f28139g;
                        return (RecyclerView) modelPaymentManualGetLayout.findViewById(p025ba.e.ry_payment_manual_list);
                    case 1:
                        int i12 = ModelPaymentManualGetLayout.f28139g;
                        return modelPaymentManualGetLayout.findViewById(p025ba.e.iv_tips_icon);
                    default:
                        int i13 = ModelPaymentManualGetLayout.f28139g;
                        return (TextView) modelPaymentManualGetLayout.findViewById(p025ba.e.tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f28143d = C2131j.b(new Function0(this) { // from class: Oa.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentManualGetLayout f6705b;

            {
                this.f6705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentManualGetLayout modelPaymentManualGetLayout = this.f6705b;
                switch (i11) {
                    case 0:
                        int i12 = ModelPaymentManualGetLayout.f28139g;
                        return (RecyclerView) modelPaymentManualGetLayout.findViewById(p025ba.e.ry_payment_manual_list);
                    case 1:
                        int i13 = ModelPaymentManualGetLayout.f28139g;
                        return modelPaymentManualGetLayout.findViewById(p025ba.e.iv_tips_icon);
                    default:
                        int i14 = ModelPaymentManualGetLayout.f28139g;
                        return (TextView) modelPaymentManualGetLayout.findViewById(p025ba.e.tv_item_key);
                }
            }
        });
        final int i12 = 2;
        this.f28144e = C2131j.b(new Function0(this) { // from class: Oa.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentManualGetLayout f6705b;

            {
                this.f6705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentManualGetLayout modelPaymentManualGetLayout = this.f6705b;
                switch (i12) {
                    case 0:
                        int i13 = ModelPaymentManualGetLayout.f28139g;
                        return (RecyclerView) modelPaymentManualGetLayout.findViewById(p025ba.e.ry_payment_manual_list);
                    case 1:
                        int i14 = ModelPaymentManualGetLayout.f28139g;
                        return modelPaymentManualGetLayout.findViewById(p025ba.e.iv_tips_icon);
                    default:
                        int i15 = ModelPaymentManualGetLayout.f28139g;
                        return (TextView) modelPaymentManualGetLayout.findViewById(p025ba.e.tv_item_key);
                }
            }
        });
        this.f28145f = C2131j.b(new i(19));
        View.inflate(context, p025ba.g.core_layout_payment_manual_get_layout, this);
        setPadding(ScreenUtils.dip2px(16.0f), 0, ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(16.0f));
        getPromotionInfoLayout().setLayoutManager(new LinearLayoutManager(context, 1, false));
        getPromotionInfoLayout().setAdapter(getPaymentEarnAdapter());
        View icon = getIcon();
        if (icon != null) {
            icon.setOnClickListener(new T(26, this, context));
        }
    }
}

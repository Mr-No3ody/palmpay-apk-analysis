package com.transsnet.palmpay.credit.ui.viewmodel;

import Ab.B;
import Db.ViewOnClickListenerC0188e;
import G7.b;
import G7.c;
import G7.q;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.FlexiCashBalance;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.FlexiCashUnfreezeItem;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0019R\u001b\u0010+\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010$¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/viewmodel/FlexiCashUnfreezeItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyUnfreezingBtnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "c", "Lkotlin/Lazy;", "getRtvApplyForUnfree", "()Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "rtvApplyForUnfree", "Landroid/widget/TextView;", "d", "getTvPaymentDate", "()Landroid/widget/TextView;", "tvPaymentDate", "e", "getTvFrozenReason", "tvFrozenReason", "f", "getTvFlexiBalanceAmount", "tvFlexiBalanceAmount", "Landroid/widget/ImageView;", "g", "getIvHelp", "()Landroid/widget/ImageView;", "ivHelp", "i", "getTvCreditLimit", "tvCreditLimit", "j", "getIvFlexiLogo", "ivFlexiLogo", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiCashUnfreezeItem extends BaseModel {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f30673v = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f30678g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30680j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30682p;
    public Function1 t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiCashUnfreezeItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void d(FlexiCashUnfreezeItem flexiCashUnfreezeItem) {
        View layout = LayoutInflater.from(flexiCashUnfreezeItem.getContext()).inflate(f.cs_layout_frozen_impact, (ViewGroup) null);
        ((TextView) layout.findViewById(e.tvContent)).setText(TextUtils.equals(flexiCashUnfreezeItem.f30681o, TransType.TRANS_TYPE_OK_CARD) ? layout.getContext().getString(g.cs_flexi_frozen_impact) : layout.getContext().getString(g.cs_cash_frozen_impact));
        Context context = flexiCashUnfreezeItem.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        G7.g gVar = new G7.g(context);
        Intrinsics.checkNotNullParameter(layout, "layout");
        gVar.f3068G = layout;
        gVar.d(8);
        gVar.b(b.f3050c);
        gVar.c(c.f3055b);
        gVar.e(4);
        gVar.g(8.0f);
        gVar.f(q.f3135a);
        gVar.t = flexiCashUnfreezeItem.getContext().getColor(p.cv_color_b2202046);
        Context context2 = flexiCashUnfreezeItem.getContext();
        Intrinsics.f(context2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity");
        gVar.f3076O = (HowToUnfreezeActivity) context2;
        Balloon balloonA = gVar.a();
        p002a.a.C(flexiCashUnfreezeItem.getIvHelp(), balloonA);
        h.l(new ViewOnClickListenerC0188e(balloonA, 0), layout);
    }

    private final ImageView getIvFlexiLogo() {
        Object value = this.f30680j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final ImageView getIvHelp() {
        Object value = this.f30678g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final RoundedTextView getRtvApplyForUnfree() {
        Object value = this.f30674c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RoundedTextView) value;
    }

    private final TextView getTvCreditLimit() {
        Object value = this.f30679i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvFlexiBalanceAmount() {
        Object value = this.f30677f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvFrozenReason() {
        Object value = this.f30676e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvPaymentDate() {
        Object value = this.f30675d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Ya.h.FlexiCashUnfreezeView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30681o = typedArrayObtainStyledAttributes.getString(Ya.h.FlexiCashUnfreezeView_trans_type);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(f.cs_layout_flexi_cash_unfreeze, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void e(FlexiCashBalance flexiCashBalance) {
        if (flexiCashBalance != null) {
            this.f30682p = flexiCashBalance.cardNo;
            TextView tvFlexiBalanceAmount = getTvFlexiBalanceAmount();
            Long l5 = flexiCashBalance.availableBalance;
            tvFlexiBalanceAmount.setText(r0.B(l5 != null ? l5.longValue() : 0L, true));
            if (!TextUtils.isEmpty(flexiCashBalance.frozenPrompt)) {
                getTvFrozenReason().setText(flexiCashBalance.frozenPrompt);
            }
            if (flexiCashBalance.frozenType == 2 && TextUtils.equals(this.f30681o, TransType.TRANS_TYPE_OK_CARD)) {
                h.s(getTvPaymentDate(), false);
            }
        }
    }

    public final void setOnApplyUnfreezingBtnClickListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.t = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiCashUnfreezeItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiCashUnfreezeItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiCashUnfreezeItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f30674c = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i10) {
                    case 0:
                        int i11 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i12 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i13 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i14 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i15 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i11 = 1;
        this.f30675d = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i11) {
                    case 0:
                        int i12 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i13 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i14 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i15 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i12 = 2;
        this.f30676e = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i12) {
                    case 0:
                        int i13 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i14 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i15 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i19 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i13 = 3;
        this.f30677f = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i13) {
                    case 0:
                        int i14 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i15 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i19 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i110 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i14 = 4;
        this.f30678g = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i14) {
                    case 0:
                        int i15 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i19 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i110 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i111 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i15 = 5;
        this.f30679i = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i15) {
                    case 0:
                        int i16 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i19 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i110 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i111 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i112 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        final int i16 = 6;
        this.f30680j = C2131j.b(new Function0(this) { // from class: Db.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1802b;

            {
                this.f1802b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1802b;
                switch (i16) {
                    case 0:
                        int i17 = FlexiCashUnfreezeItem.f30673v;
                        return (RoundedTextView) flexiCashUnfreezeItem.findViewById(Ya.e.rtvApplyForUnfree);
                    case 1:
                        int i18 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvPaymentDate);
                    case 2:
                        int i19 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFrozenReason);
                    case 3:
                        int i110 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvFlexiBalanceAmount);
                    case 4:
                        int i111 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivHelp);
                    case 5:
                        int i112 = FlexiCashUnfreezeItem.f30673v;
                        return (TextView) flexiCashUnfreezeItem.findViewById(Ya.e.tvCreditLimit);
                    default:
                        int i113 = FlexiCashUnfreezeItem.f30673v;
                        return (ImageView) flexiCashUnfreezeItem.findViewById(Ya.e.ivFlexiLogo);
                }
            }
        });
        this.t = new B(8);
        if (TextUtils.equals(this.f30681o, TransType.TRANS_TYPE_OK_CARD)) {
            getIvFlexiLogo().setImageResource(d.cs_oc_flexi_logo_with_text);
            getTvCreditLimit().setText(getContext().getString(g.cs_oc_str_credit_limit));
            getTvPaymentDate().setText("(1st/16th each month)");
        } else {
            getIvFlexiLogo().setImageResource(d.cs_cl_cash_logo_txt_img);
            getTvCreditLimit().setText(getContext().getString(g.cs_cl_loan_amount));
            getTvPaymentDate().setText("(Based on personal loan period)");
        }
        final int i17 = 0;
        h.l(new View.OnClickListener(this) { // from class: Db.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1806b;

            {
                this.f1806b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        FlexiCashUnfreezeItem.d(this.f1806b);
                        break;
                    default:
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1806b;
                        flexiCashUnfreezeItem.t.invoke(flexiCashUnfreezeItem.f30682p);
                        break;
                }
            }
        }, getIvHelp());
        final int i18 = 1;
        h.l(new View.OnClickListener(this) { // from class: Db.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiCashUnfreezeItem f1806b;

            {
                this.f1806b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        FlexiCashUnfreezeItem.d(this.f1806b);
                        break;
                    default:
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem = this.f1806b;
                        flexiCashUnfreezeItem.t.invoke(flexiCashUnfreezeItem.f30682p);
                        break;
                }
            }
        }, getRtvApplyForUnfree());
    }
}

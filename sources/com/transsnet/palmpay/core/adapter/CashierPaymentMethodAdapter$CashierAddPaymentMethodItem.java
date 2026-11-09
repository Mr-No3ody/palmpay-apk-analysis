package com.transsnet.palmpay.core.adapter;

import G8.a;
import L6.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.transsnet.palmpay.core.bean.cashier.CashierAddablePaymentMethodsBean;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p052da.C1644p;
import p052da.C1646s;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u000bR\u001b\u0010\u0015\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0016"}, d2 = {"com/transsnet/palmpay/core/adapter/CashierPaymentMethodAdapter$CashierAddPaymentMethodItem", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "a", "Lkotlin/Lazy;", "getMClicklistener", "()Landroid/view/View$OnClickListener;", "mClicklistener", "Lcom/transsnet/palmpay/core/viewmodel/CashierPayMethodItem;", "b", "getAddNewBankCard", "()Lcom/transsnet/palmpay/core/viewmodel/CashierPayMethodItem;", "addNewBankCard", "c", "getAddBankAccount", "addBankAccount", "d", "getAddBankCardAndAccount", "addBankCardAndAccount", "e", "getAddUSSD", "addUSSD", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashierPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashierPaymentMethodAdapter.kt\ncom/transsnet/palmpay/core/adapter/CashierPaymentMethodAdapter$CashierAddPaymentMethodItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1869#2,2:381\n*S KotlinDebug\n*F\n+ 1 CashierPaymentMethodAdapter.kt\ncom/transsnet/palmpay/core/adapter/CashierPaymentMethodAdapter$CashierAddPaymentMethodItem\n*L\n334#1:381,2\n*E\n"})
public final class CashierPaymentMethodAdapter$CashierAddPaymentMethodItem extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27310g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f27312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f27313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f27314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f27315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1646s f27316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashierPaymentMethodAdapter$CashierAddPaymentMethodItem(C1646s c1646s, final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27316f = c1646s;
        this.f27311a = C2131j.b(new C1644p(c1646s, 24));
        final int i7 = 0;
        this.f27312b = C2131j.b(new Function0(this) { // from class: da.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPaymentMethodAdapter$CashierAddPaymentMethodItem f35804b;

            {
                this.f35804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f35804b, context);
                    case 1:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.d(this.f35804b, context);
                    case 2:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f35804b, context);
                    default:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f35804b, context);
                }
            }
        });
        final int i10 = 1;
        this.f27313c = C2131j.b(new Function0(this) { // from class: da.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPaymentMethodAdapter$CashierAddPaymentMethodItem f35804b;

            {
                this.f35804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f35804b, context);
                    case 1:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.d(this.f35804b, context);
                    case 2:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f35804b, context);
                    default:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f35804b, context);
                }
            }
        });
        final int i11 = 2;
        this.f27314d = C2131j.b(new Function0(this) { // from class: da.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPaymentMethodAdapter$CashierAddPaymentMethodItem f35804b;

            {
                this.f35804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f35804b, context);
                    case 1:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.d(this.f35804b, context);
                    case 2:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f35804b, context);
                    default:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f35804b, context);
                }
            }
        });
        final int i12 = 3;
        this.f27315e = C2131j.b(new Function0(this) { // from class: da.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashierPaymentMethodAdapter$CashierAddPaymentMethodItem f35804b;

            {
                this.f35804b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f35804b, context);
                    case 1:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.d(this.f35804b, context);
                    case 2:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f35804b, context);
                    default:
                        return CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f35804b, context);
                }
            }
        });
        LayoutInflater.from(context).inflate(g.core_layout_cashier_payment_method_add_item, (ViewGroup) this, true);
    }

    public static CashierPayMethodItem a(CashierPaymentMethodAdapter$CashierAddPaymentMethodItem cashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        CashierPayMethodItem cashierPayMethodItem = (CashierPayMethodItem) cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(e.model_payment_add_bank_card_and_bank_account);
        cashierPayMethodItem.f();
        ImageView mPayMethodImg = cashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageDrawable(a.s(context));
        }
        TextView mPayMethodNameTv = cashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(k.core_add_bank_card_or_bank_account));
        }
        ImageView mRightIv = cashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            h.s(mRightIv, true);
        }
        ImageView mRightIv2 = cashierPayMethodItem.getMRightIv();
        if (mRightIv2 != null) {
            mRightIv2.setImageDrawable(context != null ? a.x(context, S6.a.pay_ArrowRight, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextAssist, context)), null, 20.0f, 116) : null);
        }
        TextView mHintText = cashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            h.s(mHintText, false);
        }
        TextView mPayMethodNumTv = cashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        cashierPayMethodItem.setOnClickListener(cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return cashierPayMethodItem;
    }

    public static CashierPayMethodItem b(CashierPaymentMethodAdapter$CashierAddPaymentMethodItem cashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        CashierPayMethodItem cashierPayMethodItem = (CashierPayMethodItem) cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(e.model_payment_add_bank_card);
        cashierPayMethodItem.f();
        ImageView mPayMethodImg = cashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageDrawable(a.s(context));
        }
        TextView mPayMethodNameTv = cashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(k.core_use_new_bank_card_title));
        }
        ImageView mRightIv = cashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            h.s(mRightIv, true);
        }
        ImageView mRightIv2 = cashierPayMethodItem.getMRightIv();
        if (mRightIv2 != null) {
            mRightIv2.setImageDrawable(context != null ? a.x(context, S6.a.pay_ArrowRight, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextAssist, context)), null, 20.0f, 116) : null);
        }
        TextView mHintText = cashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            h.s(mHintText, false);
        }
        TextView mPayMethodNumTv = cashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        cashierPayMethodItem.setOnClickListener(cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return cashierPayMethodItem;
    }

    public static CashierPayMethodItem c(CashierPaymentMethodAdapter$CashierAddPaymentMethodItem cashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        CashierPayMethodItem cashierPayMethodItem = (CashierPayMethodItem) cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(e.model_payment_add_ussd);
        cashierPayMethodItem.f();
        ImageView mPayMethodImg = cashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageDrawable(a.s(context));
        }
        TextView mPayMethodNameTv = cashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(k.core_use_ussd));
        }
        ImageView mRightIv = cashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            h.s(mRightIv, true);
        }
        ImageView mRightIv2 = cashierPayMethodItem.getMRightIv();
        if (mRightIv2 != null) {
            mRightIv2.setImageDrawable(context != null ? a.x(context, S6.a.pay_ArrowRight, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextAssist, context)), null, 20.0f, 116) : null);
        }
        TextView mHintText = cashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            h.s(mHintText, false);
        }
        TextView mPayMethodNumTv = cashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        cashierPayMethodItem.setOnClickListener(cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return cashierPayMethodItem;
    }

    public static CashierPayMethodItem d(CashierPaymentMethodAdapter$CashierAddPaymentMethodItem cashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        CashierPayMethodItem cashierPayMethodItem = (CashierPayMethodItem) cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(e.model_payment_add_bank_account);
        cashierPayMethodItem.f();
        ImageView mPayMethodImg = cashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageDrawable(a.s(context));
        }
        TextView mPayMethodNameTv = cashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(k.core_use_new_bank_account));
        }
        ImageView mRightIv = cashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            h.s(mRightIv, true);
        }
        ImageView mRightIv2 = cashierPayMethodItem.getMRightIv();
        if (mRightIv2 != null) {
            mRightIv2.setImageDrawable(context != null ? a.x(context, S6.a.pay_ArrowRight, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorTextAssist, context)), null, 20.0f, 116) : null);
        }
        TextView mHintText = cashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            h.s(mHintText, false);
        }
        TextView mPayMethodNumTv = cashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        cashierPayMethodItem.setOnClickListener(cashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return cashierPayMethodItem;
    }

    private final View.OnClickListener getMClicklistener() {
        return (View.OnClickListener) this.f27311a.getValue();
    }

    public final void e() {
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        ArrayList arrayList = this.f27316f.f35809e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            z3 = false;
            z8 = false;
            z10 = false;
            z11 = false;
            while (it.hasNext()) {
                Integer num = ((CashierAddablePaymentMethodsBean) it.next()).senderAccountType;
                if (num != null && num.intValue() == 23) {
                    z11 = true;
                } else if (num != null && num.intValue() == 5) {
                    z3 = true;
                    if (z8) {
                        z10 = true;
                    }
                } else if (num != null && num.intValue() == 6) {
                    z8 = true;
                    if (z3) {
                        z10 = true;
                    }
                }
            }
        } else {
            z3 = false;
            z8 = false;
            z10 = false;
            z11 = false;
        }
        if (z10) {
            h.s(getAddBankCardAndAccount(), true);
            h.s(getAddNewBankCard(), false);
            h.s(getAddBankAccount(), false);
        } else {
            h.s(getAddBankCardAndAccount(), false);
            h.s(getAddNewBankCard(), z3);
            h.s(getAddBankAccount(), z8);
        }
        h.s(getAddUSSD(), z11);
    }

    @NotNull
    public final CashierPayMethodItem getAddBankAccount() {
        Object value = this.f27313c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashierPayMethodItem) value;
    }

    @NotNull
    public final CashierPayMethodItem getAddBankCardAndAccount() {
        Object value = this.f27314d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashierPayMethodItem) value;
    }

    @NotNull
    public final CashierPayMethodItem getAddNewBankCard() {
        Object value = this.f27312b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashierPayMethodItem) value;
    }

    @NotNull
    public final CashierPayMethodItem getAddUSSD() {
        Object value = this.f27315e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashierPayMethodItem) value;
    }
}

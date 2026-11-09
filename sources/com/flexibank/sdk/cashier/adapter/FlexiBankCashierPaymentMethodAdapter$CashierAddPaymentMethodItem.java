package com.flexibank.sdk.cashier.adapter;

import M3.b;
import M3.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodItem;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p062e4.a;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"com/flexibank/sdk/cashier/adapter/FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "b", "Lkotlin/Lazy;", "getMClicklistener", "()Landroid/view/View$OnClickListener;", "mClicklistener", "Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCashierPayMethodItem;", "c", "getAddNewBankCard", "()Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCashierPayMethodItem;", "addNewBankCard", "d", "getAddBankAccount", "addBankAccount", "e", "getAddBankCardAndAccount", "addBankCardAndAccount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankCashierPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankCashierPaymentMethodAdapter.kt\ncom/flexibank/sdk/cashier/adapter/FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1863#2,2:309\n*S KotlinDebug\n*F\n+ 1 FlexiBankCashierPaymentMethodAdapter.kt\ncom/flexibank/sdk/cashier/adapter/FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem\n*L\n263#1:309,2\n*E\n"})
public final class FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21961g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f21963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f21964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f21965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f21966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f21967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem(e eVar, final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21967f = eVar;
        this.f21962a = context.getColor(m.fb_text_color_purple);
        this.f21963b = C2131j.b(new b(eVar, 17));
        final int i7 = 0;
        this.f21964c = C2131j.b(new Function0(this) { // from class: M3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem f5752b;

            {
                this.f5752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f5752b, context);
                    case 1:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f5752b, context);
                    default:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f5752b, context);
                }
            }
        });
        final int i10 = 1;
        this.f21965d = C2131j.b(new Function0(this) { // from class: M3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem f5752b;

            {
                this.f5752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f5752b, context);
                    case 1:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f5752b, context);
                    default:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f5752b, context);
                }
            }
        });
        final int i11 = 2;
        this.f21966e = C2131j.b(new Function0(this) { // from class: M3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem f5752b;

            {
                this.f5752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.a(this.f5752b, context);
                    case 1:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.c(this.f5752b, context);
                    default:
                        return FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.b(this.f5752b, context);
                }
            }
        });
        LayoutInflater.from(context).inflate(q.fb_layout_cashier_payment_method_add_item, (ViewGroup) this, true);
    }

    public static FlexiBankCashierPayMethodItem a(FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = (FlexiBankCashierPayMethodItem) flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(p.fb_model_payment_add_bank_card);
        ImageView mPayMethodImg = flexiBankCashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageResource(o.fb_add_circle_purple2);
        }
        TextView mPayMethodNameTv = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(r.fb_use_new_bank_card_title_lowercase));
        }
        TextView mPayMethodNameTv2 = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv2 != null) {
            mPayMethodNameTv2.setTextColor(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f21962a);
        }
        ImageView mRightIv = flexiBankCashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            a.d(mRightIv, false);
        }
        TextView mHintText = flexiBankCashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            a.d(mHintText, false);
        }
        TextView mPayMethodNumTv = flexiBankCashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        flexiBankCashierPayMethodItem.setOnClickListener(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return flexiBankCashierPayMethodItem;
    }

    public static FlexiBankCashierPayMethodItem b(FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = (FlexiBankCashierPayMethodItem) flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(p.fb_model_payment_add_bank_card_and_bank_account);
        ImageView mPayMethodImg = flexiBankCashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageResource(o.fb_add_circle_purple2);
        }
        TextView mPayMethodNameTv = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(r.fb_add_bank_card_or_bank_account));
        }
        TextView mPayMethodNameTv2 = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv2 != null) {
            mPayMethodNameTv2.setTextColor(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f21962a);
        }
        ImageView mRightIv = flexiBankCashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            a.d(mRightIv, false);
        }
        TextView mHintText = flexiBankCashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            a.d(mHintText, false);
        }
        TextView mPayMethodNumTv = flexiBankCashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        flexiBankCashierPayMethodItem.setOnClickListener(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return flexiBankCashierPayMethodItem;
    }

    public static FlexiBankCashierPayMethodItem c(FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem, Context context) {
        FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = (FlexiBankCashierPayMethodItem) flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.findViewById(p.fb_model_payment_add_bank_account);
        ImageView mPayMethodImg = flexiBankCashierPayMethodItem.getMPayMethodImg();
        if (mPayMethodImg != null) {
            mPayMethodImg.setImageResource(o.fb_add_circle_purple2);
        }
        TextView mPayMethodNameTv = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv != null) {
            mPayMethodNameTv.setText(context.getString(r.fb_use_new_bank_account));
        }
        TextView mPayMethodNameTv2 = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
        if (mPayMethodNameTv2 != null) {
            mPayMethodNameTv2.setTextColor(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f21962a);
        }
        ImageView mRightIv = flexiBankCashierPayMethodItem.getMRightIv();
        if (mRightIv != null) {
            a.d(mRightIv, false);
        }
        TextView mHintText = flexiBankCashierPayMethodItem.getMHintText();
        if (mHintText != null) {
            a.d(mHintText, false);
        }
        TextView mPayMethodNumTv = flexiBankCashierPayMethodItem.getMPayMethodNumTv();
        if (mPayMethodNumTv != null) {
            mPayMethodNumTv.setText("");
        }
        flexiBankCashierPayMethodItem.setOnClickListener(flexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.getMClicklistener());
        return flexiBankCashierPayMethodItem;
    }

    private final View.OnClickListener getMClicklistener() {
        return (View.OnClickListener) this.f21963b.getValue();
    }

    public final void d() {
        boolean z3;
        boolean z8;
        boolean z10;
        ArrayList arrayList = this.f21967f.f5756d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            z3 = false;
            z8 = false;
            loop0: while (true) {
                z10 = z8;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Integer senderAccountType = ((O3.a) it.next()).getSenderAccountType();
                    if (senderAccountType != null && senderAccountType.intValue() == 5) {
                        z3 = true;
                        if (z8) {
                            z10 = true;
                        }
                    } else if (senderAccountType != null && senderAccountType.intValue() == 6) {
                        z8 = true;
                        if (z3) {
                            break;
                        }
                    }
                }
            }
        } else {
            z3 = false;
            z8 = false;
            z10 = false;
        }
        if (z10) {
            a.d(getAddBankCardAndAccount(), true);
            a.d(getAddNewBankCard(), false);
            a.d(getAddBankAccount(), false);
        } else {
            a.d(getAddBankCardAndAccount(), false);
            a.d(getAddNewBankCard(), z3);
            a.d(getAddBankAccount(), z8);
        }
    }

    @NotNull
    public final FlexiBankCashierPayMethodItem getAddBankAccount() {
        Object value = this.f21965d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FlexiBankCashierPayMethodItem) value;
    }

    @NotNull
    public final FlexiBankCashierPayMethodItem getAddBankCardAndAccount() {
        Object value = this.f21966e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FlexiBankCashierPayMethodItem) value;
    }

    @NotNull
    public final FlexiBankCashierPayMethodItem getAddNewBankCard() {
        Object value = this.f21964c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FlexiBankCashierPayMethodItem) value;
    }
}

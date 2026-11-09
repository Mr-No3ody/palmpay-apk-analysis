package p270rd;

import L6.b;
import M1.j;
import Pa.n0;
import Pa.r0;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1798f;
import p220oa.h;
import p223od.a;

/* JADX INFO: renamed from: rd.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1966i implements PpAmountEditText.OnErrorVisibilityChangeListener, ResultCallback, PpAmountEditText.OnTextInputListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayShopInputAmountActivity f41751a;

    public /* synthetic */ C1966i(PayShopInputAmountActivity payShopInputAmountActivity) {
        this.f41751a = payShopInputAmountActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        boolean z3;
        a aVar;
        a aVar2;
        a aVar3;
        int i7 = PayShopInputAmountActivity.f33176p;
        PayShopInputAmountActivity payShopInputAmountActivity = this.f41751a;
        a aVar4 = (a) payShopInputAmountActivity.f27334c;
        long longAmount = aVar4 != null ? aVar4.f40287c.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = payShopInputAmountActivity.f33183o;
        boolean z8 = true;
        boolean z10 = false;
        if (balanceAndLimitData == null || !balanceAndLimitData.stampDutySwitch) {
            z3 = false;
        } else {
            Long l5 = balanceAndLimitData.stampDutyMinAmount;
            if (longAmount >= (l5 != null ? l5.longValue() : 0L)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = payShopInputAmountActivity.f33183o;
        if (balanceAndLimitData2 != null) {
            if (longAmount < balanceAndLimitData2.minAmount) {
                a aVar5 = (a) payShopInputAmountActivity.f27334c;
                if (aVar5 != null) {
                    aVar5.f40287c.setError(balanceAndLimitData2.amountLimitContentPrefix);
                }
            } else if (longAmount <= balanceAndLimitData2.maxAmount) {
                a aVar6 = (a) payShopInputAmountActivity.f27334c;
                if (aVar6 != null) {
                    aVar6.f40287c.setError(null);
                }
            } else if (balanceAndLimitData2 != null) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(balanceAndLimitData2.amountLimitContentPrefix);
                spanUtilsAppend.append(balanceAndLimitData2.amountLimitContentSuffix).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, payShopInputAmountActivity)).setClickSpan(new C1972o(payShopInputAmountActivity, balanceAndLimitData2));
                String str2 = balanceAndLimitData2.amountLimitContentJumpUrl;
                if (str2 != null && str2.length() > 0) {
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(payShopInputAmountActivity, S6.a.pay_ArrowCenterRight);
                    iconicsDrawable.a(new C1798f(payShopInputAmountActivity, 10));
                    spanUtilsAppend.appendImage(iconicsDrawable, 2);
                }
                SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.create();
                a aVar7 = (a) payShopInputAmountActivity.f27334c;
                if (aVar7 != null) {
                    aVar7.f40287c.setError(spannableStringBuilderCreate);
                }
            }
            z8 = false;
            aVar = (a) payShopInputAmountActivity.f27334c;
            if (aVar != null) {
                aVar.f40295p.setActionButtonEnable(z8);
            }
            aVar2 = (a) payShopInputAmountActivity.f27334c;
            if (aVar2 != null) {
                aVar2.f40278A.setEnabled(z8);
            }
            aVar3 = (a) payShopInputAmountActivity.f27334c;
            if (aVar3 != null) {
                h.s(aVar3.f40283M, z10);
            }
        }
        a aVar8 = (a) payShopInputAmountActivity.f27334c;
        if (aVar8 != null) {
            aVar8.f40287c.setError(null);
        }
        z8 = false;
        z10 = z3;
        aVar = (a) payShopInputAmountActivity.f27334c;
        if (aVar != null) {
            aVar.f40295p.setActionButtonEnable(z8);
        }
        aVar2 = (a) payShopInputAmountActivity.f27334c;
        if (aVar2 != null) {
            aVar2.f40278A.setEnabled(z8);
        }
        aVar3 = (a) payShopInputAmountActivity.f27334c;
        if (aVar3 != null) {
            h.s(aVar3.f40283M, z10);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        int i7 = PayShopInputAmountActivity.f33176p;
        if (((Boolean) obj).booleanValue()) {
            this.f41751a.q();
        }
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnErrorVisibilityChangeListener
    public void onErrorVisibilityChanged(boolean z3) {
        View view;
        int i7 = PayShopInputAmountActivity.f33176p;
        a aVar = (a) this.f41751a.f27334c;
        if (aVar == null || (view = aVar.f40288d) == null) {
            return;
        }
        h.s(view, z3);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j adapter, View view, int i7) {
        PpAmountEditText ppAmountEditText;
        int i10 = PayShopInputAmountActivity.f33176p;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Object item = adapter.getItem(i7);
        Long l5 = item instanceof Long ? (Long) item : null;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            a aVar = (a) this.f41751a.f27334c;
            if (aVar != null && (ppAmountEditText = aVar.f40287c) != null) {
                ppAmountEditText.setAmount(r0.A(jLongValue));
            }
            n0.g().k(new ClickEvent("Transfer_ToPalmPay_QuickSelect_Click_U4").add("element_name", String.valueOf(jLongValue)));
        }
    }
}

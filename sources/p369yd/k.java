package p369yd;

import L6.b;
import Pa.n0;
import Pa.r0;
import S6.a;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p141j9.C1798f;
import p220oa.h;
import p223od.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements OnItemClickListener, ResultCallback, PpAmountEditText.OnErrorVisibilityChangeListener, PpAmountEditText.OnTextInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayInputAmountActivity f44299a;

    public /* synthetic */ k(TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity) {
        this.f44299a = transferToPalmPayInputAmountActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        boolean z3;
        j jVar;
        j jVar2;
        TextView textView;
        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = this.f44299a;
        PpAmountEditText ppAmountEditText = transferToPalmPayInputAmountActivity.f33620w;
        if (ppAmountEditText == null) {
            return;
        }
        long longAmount = ppAmountEditText.getLongAmount();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = transferToPalmPayInputAmountActivity.f33619v;
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
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = transferToPalmPayInputAmountActivity.f33619v;
        if (balanceAndLimitData2 != null) {
            if (longAmount < balanceAndLimitData2.minAmount) {
                PpAmountEditText ppAmountEditText2 = transferToPalmPayInputAmountActivity.f33620w;
                if (ppAmountEditText2 != null) {
                    ppAmountEditText2.setError(balanceAndLimitData2.amountLimitContentPrefix);
                }
            } else if (longAmount <= balanceAndLimitData2.maxAmount) {
                PpAmountEditText ppAmountEditText3 = transferToPalmPayInputAmountActivity.f33620w;
                if (ppAmountEditText3 != null) {
                    ppAmountEditText3.setError(null);
                }
            } else if (balanceAndLimitData2 != null) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(balanceAndLimitData2.amountLimitContentPrefix);
                spanUtilsAppend.append(balanceAndLimitData2.amountLimitContentSuffix).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, transferToPalmPayInputAmountActivity)).setClickSpan(new n(transferToPalmPayInputAmountActivity, balanceAndLimitData2));
                String str2 = balanceAndLimitData2.amountLimitContentJumpUrl;
                if (str2 != null && str2.length() > 0) {
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(transferToPalmPayInputAmountActivity, a.pay_ArrowCenterRight);
                    iconicsDrawable.a(new C1798f(transferToPalmPayInputAmountActivity, 26));
                    spanUtilsAppend.appendImage(iconicsDrawable, 2);
                }
                SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.create();
                PpAmountEditText ppAmountEditText4 = transferToPalmPayInputAmountActivity.f33620w;
                if (ppAmountEditText4 != null) {
                    ppAmountEditText4.setError(spannableStringBuilderCreate);
                }
            }
            z8 = false;
            jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar != null) {
                jVar.f40403p.setActionButtonEnable(z8);
            }
            jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar2 != null) {
                jVar2.f40388H.setEnabled(z8);
            }
            textView = transferToPalmPayInputAmountActivity.f33605C;
            if (textView != null) {
                h.s(textView, z10);
            }
        }
        PpAmountEditText ppAmountEditText5 = transferToPalmPayInputAmountActivity.f33620w;
        if (ppAmountEditText5 != null) {
            ppAmountEditText5.setError(null);
        }
        z8 = false;
        z10 = z3;
        jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar != null) {
            jVar.f40403p.setActionButtonEnable(z8);
        }
        jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar2 != null) {
            jVar2.f40388H.setEnabled(z8);
        }
        textView = transferToPalmPayInputAmountActivity.f33605C;
        if (textView != null) {
            h.s(textView, z10);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
        if (zBooleanValue) {
            this.f44299a.p();
        }
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnErrorVisibilityChangeListener
    public void onErrorVisibilityChanged(boolean z3) {
        View view;
        int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
        j jVar = (j) this.f44299a.f27334c;
        if (jVar == null || (view = jVar.f40398f) == null) {
            return;
        }
        h.s(view, z3);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        int i10 = TransferToPalmPayInputAmountActivity.f33602Y;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        Long l5 = item instanceof Long ? (Long) item : null;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            PpAmountEditText ppAmountEditText = this.f44299a.f33620w;
            if (ppAmountEditText != null) {
                ppAmountEditText.setAmount(r0.A(jLongValue));
            }
            n0.g().k(new ClickEvent("Transfer_ToPalmPay_QuickSelect_Click_03").add("element_name", String.valueOf(jLongValue)));
        }
    }
}

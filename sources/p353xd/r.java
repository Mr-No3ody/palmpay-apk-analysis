package p353xd;

import L6.b;
import M1.j;
import Pa.n0;
import Pa.r0;
import S6.a;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p223od.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements PpAmountEditText.OnErrorVisibilityChangeListener, OnItemClickListener, PpAmountEditText.OnTextInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43896a;

    public /* synthetic */ r(TransferToBankInputAmountActivity transferToBankInputAmountActivity) {
        this.f43896a = transferToBankInputAmountActivity;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        boolean z3;
        boolean z8 = false;
        z8 = false;
        z8 = false;
        TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43896a;
        i iVar = (i) transferToBankInputAmountActivity.f27334c;
        if ((iVar != null ? iVar.f40374c : null) == null) {
            return;
        }
        long longAmount = iVar != null ? iVar.f40374c.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = transferToBankInputAmountActivity.f33532p;
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
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = transferToBankInputAmountActivity.f33532p;
        if (balanceAndLimitData2 == null) {
            i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
            if (iVar2 != null) {
                iVar2.f40374c.setError(null);
            }
        } else {
            if (longAmount < balanceAndLimitData2.minAmount) {
                i iVar3 = (i) transferToBankInputAmountActivity.f27334c;
                if (iVar3 != null) {
                    iVar3.f40374c.setError(balanceAndLimitData2.amountLimitContentPrefix);
                }
            } else if (longAmount <= balanceAndLimitData2.maxAmount) {
                i iVar4 = (i) transferToBankInputAmountActivity.f27334c;
                if (iVar4 != null) {
                    iVar4.f40374c.setError(null);
                }
                z8 = true;
            } else if (balanceAndLimitData2 != null) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(balanceAndLimitData2.amountLimitContentPrefix);
                spanUtilsAppend.append(balanceAndLimitData2.amountLimitContentSuffix).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, transferToBankInputAmountActivity)).setClickSpan(new w(transferToBankInputAmountActivity, balanceAndLimitData2));
                String str2 = balanceAndLimitData2.amountLimitContentJumpUrl;
                if (str2 != null && str2.length() > 0) {
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(transferToBankInputAmountActivity, a.pay_ArrowCenterRight);
                    iconicsDrawable.a(new s(transferToBankInputAmountActivity, z8 ? 1 : 0));
                    spanUtilsAppend.appendImage(iconicsDrawable, 2);
                }
                SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.create();
                i iVar5 = (i) transferToBankInputAmountActivity.f27334c;
                if (iVar5 != null) {
                    iVar5.f40374c.setError(spannableStringBuilderCreate);
                }
            }
            z3 = false;
        }
        i iVar6 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar6 != null) {
            iVar6.f40380j.setActionButtonEnable(z8);
        }
        i iVar7 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar7 != null) {
            iVar7.f40368L.setEnabled(z8);
        }
        i iVar8 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar8 != null) {
            h.s(iVar8.f40370Q, z3);
        }
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnErrorVisibilityChangeListener
    public void onErrorVisibilityChanged(boolean z3) {
        View view;
        TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
        i iVar = (i) this.f43896a.f27334c;
        if (iVar == null || (view = iVar.f40375d) == null) {
            return;
        }
        h.s(view, z3);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j adapter, View view, int i7) {
        PpAmountEditText ppAmountEditText;
        TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        Long l5 = item instanceof Long ? (Long) item : null;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            i iVar = (i) this.f43896a.f27334c;
            if (iVar != null && (ppAmountEditText = iVar.f40374c) != null) {
                ppAmountEditText.setAmount(r0.A(jLongValue));
            }
            n0.g().k(new ClickEvent("Transfer_ToBank_QuickSelect_Click").add("element_name", String.valueOf(jLongValue)));
        }
    }
}

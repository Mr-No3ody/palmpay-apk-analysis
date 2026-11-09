package com.transsnet.palmpay.core.bean.cashier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcOfCombinationInfoBean;", "", "<init>", "()V", "defaultMethodFlag", "", "combinationPaymentMethodList", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "getMainPaymentMethod", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalcOfCombinationInfoBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalcOfCombinationInfoBean.kt\ncom/transsnet/palmpay/core/bean/cashier/CalcOfCombinationInfoBean\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class CalcOfCombinationInfoBean {

    @JvmField
    @NotNull
    public List<CashierCombinationPaymentMethodBean> combinationPaymentMethodList = new ArrayList();

    @JvmField
    public boolean defaultMethodFlag;

    @Nullable
    public final CashierCombinationPaymentMethodBean getMainPaymentMethod() {
        Object obj;
        Object next;
        Iterator<T> it = this.combinationPaymentMethodList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((CashierCombinationPaymentMethodBean) next).getMainMethodFlag(), Boolean.TRUE));
        CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean = (CashierCombinationPaymentMethodBean) next;
        if (cashierCombinationPaymentMethodBean != null) {
            cashierCombinationPaymentMethodBean.defaultMethodFlag = this.defaultMethodFlag;
        }
        if (cashierCombinationPaymentMethodBean != null) {
            for (Object obj2 : this.combinationPaymentMethodList) {
                if (Intrinsics.c(((CashierCombinationPaymentMethodBean) obj2).getMainMethodFlag(), Boolean.FALSE)) {
                    obj = obj2;
                    break;
                }
            }
            cashierCombinationPaymentMethodBean.setSubPaymentMethodBean((CashierCombinationPaymentMethodBean) obj);
        }
        return cashierCombinationPaymentMethodBean;
    }
}

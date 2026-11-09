package P3;

import android.util.Log;
import android.view.View;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcOfPaymentMethodResultBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankCashierCommonPreviewActivity;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionLayout;
import com.flexibank.sdk.p;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.util.ToastUtils;
import j4.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6901c;

    public /* synthetic */ l(com.flexibank.sdk.cashier.ui.activity.a aVar, com.flexibank.sdk.cashier.ui.activity.a aVar2, int i7) {
        this.f6899a = i7;
        this.f6900b = aVar;
        this.f6901c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01dd  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean;
        View viewFindViewById;
        String strB;
        String string;
        List list;
        String str = "";
        Object obj2 = null;
        com.flexibank.sdk.cashier.ui.activity.a context = this.f6901c;
        com.flexibank.sdk.cashier.ui.activity.a aVar = this.f6900b;
        int i7 = 0;
        boolean z3 = true;
        switch (this.f6899a) {
            case 0:
                K3.n it = (K3.n) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof K3.l) {
                    aVar.showLoadingDialog(true, true);
                } else if (it instanceof K3.m) {
                    aVar.showLoadingDialog(false, true);
                    O3.g gVar = (O3.g) ((K3.m) it).f4935a;
                    if (gVar.c()) {
                        O3.g.b data = gVar.getData();
                        if (data != null) {
                            FlexiBankCashierCommonPreviewActivity flexiBankCashierCommonPreviewActivity = (FlexiBankCashierCommonPreviewActivity) context;
                            if (((Boolean) flexiBankCashierCommonPreviewActivity.f21970E0.getValue()).booleanValue() && (viewFindViewById = flexiBankCashierCommonPreviewActivity.findViewById(p.fb_cl_cashier_preview)) != null) {
                                p062e4.a.d(viewFindViewById, true);
                            }
                            context.getClass();
                            Intrinsics.checkNotNullParameter(data, "data");
                            if (data.getCalculationDto() == null) {
                                context.o();
                            } else {
                                context.p();
                                FlexiBankCalcOfPaymentMethodResultBean data2 = data.getCalculationDto();
                                if (data2 != null) {
                                    Intrinsics.checkNotNullParameter(data2, "data");
                                    context.f21989s0 = data2;
                                    context.f6883Q = data2.getCacheKey();
                                    Long payAmount = data2.getPayAmount();
                                    context.f6882M = payAmount != null ? payAmount.longValue() : 0L;
                                }
                                List payUnable = data.getPayUnable();
                                ArrayList addablePaymentMethods = context.f21985k0;
                                addablePaymentMethods.clear();
                                if (payUnable != null) {
                                    addablePaymentMethods.addAll(payUnable);
                                }
                                List paymentMethodList = data.getPaymentMethodList();
                                ArrayList arrayList = context.f21986p0;
                                arrayList.clear();
                                ArrayList arrayList2 = context.f21988r0;
                                arrayList2.clear();
                                if (paymentMethodList != null) {
                                    if (paymentMethodList.isEmpty()) {
                                        paymentMethodList = null;
                                    }
                                    if (paymentMethodList != null) {
                                        for (Object obj3 : paymentMethodList) {
                                            if (((FlexiBankCashierPaymentMethodBean) obj3).getDefaultMethodFlag()) {
                                                obj2 = obj3;
                                                flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) obj2;
                                                if (flexiBankCashierPaymentMethodBean != null) {
                                                    context.f21991u0 = flexiBankCashierPaymentMethodBean;
                                                }
                                                arrayList2.addAll(paymentMethodList);
                                            }
                                        }
                                        flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) obj2;
                                        if (flexiBankCashierPaymentMethodBean != null) {
                                            context.f21991u0 = flexiBankCashierPaymentMethodBean;
                                        }
                                        arrayList2.addAll(paymentMethodList);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = (FlexiBankCashierPaymentMethodBean) obj4;
                                    if (flexiBankCashierPaymentMethodBean2.getDefaultMethodFlag() || flexiBankCashierPaymentMethodBean2.getShowInPreview()) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                List listU = CollectionsKt.U(arrayList3, 2);
                                if (!listU.isEmpty()) {
                                    arrayList.addAll(listU);
                                }
                                M3.g gVarK = context.k();
                                f payAmount2 = new f(context, 0);
                                gVarK.getClass();
                                Intrinsics.checkNotNullParameter(payAmount2, "payAmount");
                                gVarK.f5766e = payAmount2;
                                context.k().f5765d = context.f21991u0;
                                M3.g gVarK2 = context.k();
                                gVarK2.getClass();
                                Intrinsics.checkNotNullParameter(addablePaymentMethods, "addablePaymentMethods");
                                ArrayList arrayList4 = gVarK2.f5762a;
                                arrayList4.clear();
                                arrayList4.addAll(addablePaymentMethods);
                                context.k().b(arrayList);
                                FlexiBankCalcOfPaymentMethodResultBean calculationDto = data.getCalculationDto();
                                if (calculationDto != null) {
                                    FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean3 = context.f21991u0;
                                    Long paymentMethodsDiscount = calculationDto.getPaymentMethodsDiscount();
                                    if (flexiBankCashierPaymentMethodBean3 != null) {
                                        flexiBankCashierPaymentMethodBean3.A(paymentMethodsDiscount != null ? paymentMethodsDiscount.longValue() : 0L);
                                    }
                                    context.v(calculationDto, true);
                                }
                            }
                        }
                    } else {
                        String respCode = gVar.getRespCode();
                        String strB2 = gVar.b();
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (respCode != null) {
                            if (!respCode.equals("33000039") && !respCode.equals("33000040") && !respCode.equals("33000041")) {
                                z3 = false;
                            }
                            if (z3) {
                                u.c(context, respCode, strB2 != null ? strB2 : "");
                            } else if (FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE.equals(respCode)) {
                                Log.e("CashierErrorInfo", strB2 != null ? strB2 : "");
                                context.finish();
                                Unit unit = Unit.f38893a;
                            } else {
                                ToastUtils.showLong(strB2 != null ? strB2 : "", new Object[0]);
                                context.finish();
                                Unit unit2 = Unit.f38893a;
                            }
                        }
                    }
                } else {
                    if (!(it instanceof K3.k)) {
                        throw new p355xf.l();
                    }
                    aVar.showLoadingDialog(false, true);
                    ToastUtils.showLong(((K3.k) it).f4933a, new Object[0]);
                    context.finish();
                }
                return Unit.f38893a;
            default:
                K3.n it2 = (K3.n) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof K3.l) {
                    aVar.showLoadingDialog(true, true);
                } else if (it2 instanceof K3.m) {
                    aVar.showLoadingDialog(false, true);
                    O3.d dVar = (O3.d) ((K3.m) it2).f4935a;
                    if (dVar == null || !dVar.c()) {
                        if (dVar != null && (strB = dVar.b()) != null) {
                            str = strB;
                        }
                        ToastUtils.showLong(str, new Object[0]);
                    } else {
                        O3.d.a data3 = dVar.getData();
                        if (data3 != null) {
                            context.q();
                            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = context.f21980A0;
                            if (flexiBankModelPaymentPromotionLayout != null) {
                                O3.d.a data4 = dVar.getData();
                                if (data4 != null && (list = data4.getList()) != null) {
                                    List list2 = list;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.c(((FlexiBankCashierCouponItem) it3.next()).getAvailable(), Boolean.TRUE) && (i7 = i7 + 1) < 0) {
                                                C1850q.j();
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                flexiBankModelPaymentPromotionLayout.setMAvailableCouponCount(i7);
                            }
                            t tVar = context.f21982C0;
                            Q3.c cVar = (Q3.c) tVar.getValue();
                            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean4 = context.f21991u0;
                            if (flexiBankCashierPaymentMethodBean4 == null || (string = Integer.valueOf(flexiBankCashierPaymentMethodBean4.getSenderAccountType()).toString()) == null) {
                                string = "1";
                            }
                            O3.k kVarI = context.i(string);
                            Boolean bool = Boolean.FALSE;
                            kVarI.n(bool);
                            kVarI.l();
                            kVarI.i(bool);
                            kVarI.m(Boolean.TRUE);
                            cVar.f7591B = kVarI;
                            FlexiBankCashierCouponItem flexiBankCashierCouponItem = context.f21990t0;
                            if (flexiBankCashierCouponItem != null) {
                                Q3.c cVar2 = (Q3.c) tVar.getValue();
                                Long couponId = flexiBankCashierCouponItem.getCouponId();
                                cVar2.f7598v = couponId != null ? couponId.longValue() : 0L;
                            } else {
                                ((Q3.c) tVar.getValue()).f7598v = -1L;
                            }
                            List list3 = data3.getList();
                            if (list3 != null) {
                                ((Q3.c) tVar.getValue()).t = list3;
                            }
                            ((Q3.c) tVar.getValue()).show();
                        }
                    }
                } else {
                    if (!(it2 instanceof K3.k)) {
                        throw new p355xf.l();
                    }
                    aVar.showLoadingDialog(false, true);
                    ToastUtils.showLong(((K3.k) it2).f4933a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

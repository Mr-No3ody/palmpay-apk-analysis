package com.transsnet.palmpay.viewmodule;

import Bc.x;
import F6.d;
import N8.q0;
import Pa.r0;
import Pe.u0;
import android.app.Application;
import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountReq;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountResp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p051d9.C1624v;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryViewModel.kt\ncom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n85#2,13:379\n1#3:392\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryViewModel.kt\ncom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel\n*L\n66#1:379,13\n*E\n"})
public final class TransactionHistoryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f35404A = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f35407g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f35408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f35409j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TransHistoryReqV2 f35410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f35411p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f35412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransactionHistoryFragment f35413w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35405e = new l();
        this.f35406f = new l();
        this.f35407g = new l();
        this.f35408i = new l();
        this.f35409j = new l();
        this.f35411p = new ArrayList();
        this.t = new ArrayList();
        this.f35412v = new HashMap();
    }

    public static long g(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.add(2, -3);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        return q0.c(calendar, 13, 0, 14, 0);
    }

    public static int i(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(2) + 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseViewModel, androidx.lifecycle.a0
    public final void b() {
        this.f35413w = null;
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2, List list) {
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            TransHistoryItemBean transHistoryItemBean = (TransHistoryItemBean) arrayList2.get(i7);
            if (i7 == 0) {
                e(arrayList, transHistoryItemBean, list);
            }
            if (i7 > 0) {
                TransHistoryItemBean transHistoryItemBean2 = (TransHistoryItemBean) arrayList2.get(i7 - 1);
                Long l5 = transHistoryItemBean.updateTime;
                int i10 = i(l5 != null ? l5.longValue() : 0L);
                Long l6 = transHistoryItemBean2.updateTime;
                if (i10 != i(l6 != null ? l6.longValue() : 0L)) {
                    e(arrayList, transHistoryItemBean, list);
                }
            }
            arrayList.add(transHistoryItemBean);
        }
    }

    public final void e(ArrayList arrayList, TransHistoryItemBean transHistoryItemBean, List list) {
        TransHistoryItemBean transHistoryItemBean2 = new TransHistoryItemBean();
        transHistoryItemBean2.setItemType(1);
        transHistoryItemBean2.updateTime = transHistoryItemBean.updateTime;
        Long l5 = transHistoryItemBean.updateTime;
        int iN0 = r0.N0(l5 != null ? l5.longValue() : 0L);
        Long l6 = transHistoryItemBean.updateTime;
        BillTotalCountResp billTotalCountResp = (BillTotalCountResp) this.f35412v.get(iN0 + "/" + r0.h0(l6 != null ? l6.longValue() : 0L) + "/" + list);
        if (billTotalCountResp != null) {
            transHistoryItemBean2.inComeAmount = Long.valueOf(billTotalCountResp.inComeAmount);
            transHistoryItemBean2.payOutAmount = Long.valueOf(billTotalCountResp.payOutAmount);
        }
        arrayList.add(transHistoryItemBean2);
        Long l8 = transHistoryItemBean.updateTime;
        long jLongValue = l8 != null ? l8.longValue() : 0L;
        TransactionHistoryFragment transactionHistoryFragment = this.f35413w;
        f(jLongValue, transactionHistoryFragment != null ? transactionHistoryFragment.f35251C : null, false);
    }

    public final void f(long j6, ArrayList arrayList, final boolean z3) {
        TransactionHistoryFragment transactionHistoryFragment;
        final int iN0 = r0.N0(j6);
        final int iH0 = r0.h0(j6);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.set(5, 1);
        calendar.set(11, 0);
        long jC = q0.c(calendar, 12, 0, 13, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j6);
        calendar2.add(2, 1);
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        long jC2 = q0.c(calendar2, 12, 0, 13, 0);
        final String str = iN0 + "/" + iH0 + "/" + arrayList;
        String strT = r0.T(jC);
        String strT2 = r0.T(jC2);
        StringBuilder sbF = F.f("getAmountSummary: ", str, " ", strT, " - ");
        sbF.append(strT2);
        d.h("TransHistoryViewModel", 3, sbF.toString());
        BillTotalCountResp billTotalCountResp = (BillTotalCountResp) this.f35412v.get(str);
        if (billTotalCountResp != null) {
            if (z3 && (transactionHistoryFragment = this.f35413w) != null) {
                transactionHistoryFragment.updateTotalAmount(iN0, iH0, billTotalCountResp.inComeAmount, billTotalCountResp.payOutAmount, str);
            }
            TransactionHistoryFragment transactionHistoryFragment2 = this.f35413w;
            if (transactionHistoryFragment2 != null) {
                transactionHistoryFragment2.y(iN0, iH0, billTotalCountResp);
                return;
            }
            return;
        }
        BillTotalCountReq billTotalCountReq = new BillTotalCountReq();
        billTotalCountReq.beginTime = jC;
        billTotalCountReq.endTime = jC2;
        billTotalCountReq.conditionCode = arrayList;
        TransactionHistoryFragment transactionHistoryFragment3 = this.f35413w;
        billTotalCountReq.wardMemberId = transactionHistoryFragment3 != null ? (String) transactionHistoryFragment3.f35261v.getValue() : null;
        f.t(this, new u0(billTotalCountReq, null), new Function1() { // from class: Pe.q0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TransactionHistoryFragment transactionHistoryFragment4;
                TransactionHistoryViewModel transactionHistoryViewModel = this.f7287a;
                String str2 = str;
                CommonBeanResult billRsp = (CommonBeanResult) obj;
                int i7 = TransactionHistoryViewModel.f35404A;
                Intrinsics.checkNotNullParameter(billRsp, "billRsp");
                if (billRsp.isSuccess()) {
                    try {
                        BillTotalCountResp billTotalCountResp2 = (BillTotalCountResp) billRsp.data;
                        if (billTotalCountResp2 != null) {
                            transactionHistoryViewModel.f35412v.put(str2, billTotalCountResp2);
                            TransactionHistoryFragment transactionHistoryFragment5 = transactionHistoryViewModel.f35413w;
                            int i10 = iN0;
                            int i11 = iH0;
                            if (transactionHistoryFragment5 != null) {
                                transactionHistoryFragment5.y(i10, i11, billTotalCountResp2);
                            }
                            if (z3 && (transactionHistoryFragment4 = transactionHistoryViewModel.f35413w) != null) {
                                transactionHistoryFragment4.updateTotalAmount(i10, i11, billTotalCountResp2.inComeAmount, billTotalCountResp2.payOutAmount, str2);
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                return Unit.f38893a;
            }
        }, new C1624v(20));
    }

    public final void h(TransHistoryReqV2 transHistoryReqV2, boolean z3, boolean z8) {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35411p;
        if (size > 0) {
            List list = transHistoryReqV2.conditionCode;
            if (list == null) {
                list = z.f38935a;
            }
            ArrayList arrayList3 = new ArrayList();
            if (arrayList2 == null || arrayList2.isEmpty()) {
                d(arrayList3, arrayList, list);
            } else {
                Long l5 = ((TransHistoryItemBean) q0.i(1, arrayList2)).updateTime;
                int i7 = i(l5 != null ? l5.longValue() : 0L);
                Long l6 = ((TransHistoryItemBean) arrayList.get(0)).updateTime;
                if (i7 != i(l6 != null ? l6.longValue() : 0L)) {
                    d(arrayList3, arrayList, list);
                } else {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TransHistoryItemBean transHistoryItemBean = (TransHistoryItemBean) arrayList.get(i10);
                        if (i10 > 0) {
                            TransHistoryItemBean transHistoryItemBean2 = (TransHistoryItemBean) arrayList.get(i10 - 1);
                            Long l8 = transHistoryItemBean.updateTime;
                            int i11 = i(l8 != null ? l8.longValue() : 0L);
                            Long l10 = transHistoryItemBean2.updateTime;
                            if (i11 != i(l10 != null ? l10.longValue() : 0L)) {
                                e(arrayList3, transHistoryItemBean, list);
                            }
                        }
                        arrayList3.add(transHistoryItemBean);
                    }
                }
            }
            arrayList2.addAll(arrayList3);
            arrayList.clear();
        }
        TransactionHistoryFragment transactionHistoryFragment = this.f35413w;
        if (transactionHistoryFragment != null) {
            if (arrayList2 != null && !arrayList2.isEmpty() && !z8) {
                transactionHistoryFragment.B((TransHistoryItemBean) arrayList2.get(0));
            }
            transactionHistoryFragment.v().setList(arrayList2);
        }
        TransactionHistoryFragment transactionHistoryFragment2 = this.f35413w;
        if (transactionHistoryFragment2 != null) {
            x xVar = (x) transactionHistoryFragment2.f27335j;
            if (xVar != null) {
                xVar.f874f.setRefreshing(false);
            }
            transactionHistoryFragment2.f35259o = Boolean.valueOf(z3);
            if (z3) {
                transactionHistoryFragment2.v().getLoadMoreModule().g();
            } else {
                transactionHistoryFragment2.v().getLoadMoreModule().f();
            }
        }
    }
}

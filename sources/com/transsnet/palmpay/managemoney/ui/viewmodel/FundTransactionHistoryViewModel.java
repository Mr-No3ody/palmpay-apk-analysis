package com.transsnet.palmpay.managemoney.ui.viewmodel;

import N8.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/viewmodel/FundTransactionHistoryViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFundTransactionHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundTransactionHistoryViewModel.kt\ncom/transsnet/palmpay/managemoney/ui/viewmodel/FundTransactionHistoryViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1878#2,3:230\n*S KotlinDebug\n*F\n+ 1 FundTransactionHistoryViewModel.kt\ncom/transsnet/palmpay/managemoney/ui/viewmodel/FundTransactionHistoryViewModel\n*L\n161#1:230,3\n*E\n"})
public final class FundTransactionHistoryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final QueryFundStatReq f32767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final QueryFundStatReq f32768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f32769g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f32770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f32771j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f32772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f32773p;
    public QueryCashBoxStatResp t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundTransactionHistoryViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f32767e = new QueryFundStatReq(0, 0, null, null, null, null, 0L, 0L, 255, null);
        this.f32768f = new QueryFundStatReq(0, 0, null, null, null, null, 0L, 0L, 255, null);
        this.f32769g = new l();
        this.f32770i = new l();
        this.f32771j = new ArrayList();
        this.f32772o = new l();
        this.f32773p = new l();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    public final ArrayList d(ArrayList arrayList, boolean z3) {
        QueryFundStatReq queryFundStatReq;
        long jLongValue;
        long jLongValue2;
        QueryCashBoxStatResp queryCashBoxStatResp;
        QueryCashBoxStatResp.CashBoxStat data;
        Long totalMoneyOut;
        QueryCashBoxStatResp queryCashBoxStatResp2;
        QueryCashBoxStatResp.CashBoxStat data2;
        Long totalMoneyIn;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            int i7 = 0;
            for (Object obj : arrayList) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj;
                long jF = f(g(cashBoxTransaction.getGmtCreated()), e(cashBoxTransaction.getGmtCreated()));
                long jF2 = f(g(cashBoxTransaction.getGmtCreated()), e(cashBoxTransaction.getGmtCreated()) + 1);
                if (cashBoxTransaction.getItemType() == 0) {
                    if (i7 != 0) {
                        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) q0.i(1, arrayList2);
                        Intrinsics.checkNotNullParameter(cashBoxTransaction2, "cashBoxTransaction");
                        if (f(g(cashBoxTransaction2.getGmtCreated()), e(cashBoxTransaction2.getGmtCreated())) != jF) {
                            queryFundStatReq = this.f32767e;
                            jLongValue = 0;
                            if (queryFundStatReq.getStartTime() == jF || (queryCashBoxStatResp2 = this.t) == null || (data2 = queryCashBoxStatResp2.getData()) == null || (totalMoneyIn = data2.getTotalMoneyIn()) == null) {
                                jLongValue2 = 0;
                            } else {
                                jLongValue2 = totalMoneyIn.longValue();
                            }
                            if (queryFundStatReq.getStartTime() == jF && (queryCashBoxStatResp = this.t) != null && (data = queryCashBoxStatResp.getData()) != null && (totalMoneyOut = data.getTotalMoneyOut()) != null) {
                                jLongValue = totalMoneyOut.longValue();
                            }
                            arrayList2.add(new QueryCashBoxTransactionListResp.CashBoxTransaction(null, 0, 0L, cashBoxTransaction.getGmtCreated(), null, null, null, 0, null, 0, 1, jLongValue2, jLongValue, jF, jF2, null, null, null, null, null, null, false, 0.0d, null, null, null, 67077111, null));
                            h(jF, jF2);
                        }
                    } else {
                        queryFundStatReq = this.f32767e;
                        jLongValue = 0;
                        if (queryFundStatReq.getStartTime() == jF) {
                            jLongValue2 = 0;
                        } else {
                            jLongValue2 = 0;
                        }
                        if (queryFundStatReq.getStartTime() == jF) {
                            jLongValue = totalMoneyOut.longValue();
                        }
                        arrayList2.add(new QueryCashBoxTransactionListResp.CashBoxTransaction(null, 0, 0L, cashBoxTransaction.getGmtCreated(), null, null, null, 0, null, 0, 1, jLongValue2, jLongValue, jF, jF2, null, null, null, null, null, null, false, 0.0d, null, null, null, 67077111, null));
                        h(jF, jF2);
                    }
                }
                arrayList2.add(cashBoxTransaction);
                i7 = i10;
            }
        } else if (z3) {
            QueryFundStatReq queryFundStatReq2 = this.f32768f;
            long jF3 = f(g(queryFundStatReq2.getEndTime()), e(queryFundStatReq2.getEndTime()) - 1);
            long jF4 = f(g(queryFundStatReq2.getEndTime()), e(queryFundStatReq2.getEndTime()));
            arrayList2.add(new QueryCashBoxTransactionListResp.CashBoxTransaction(null, 0, 0L, jF3, null, null, null, 0, null, 0, 1, 0L, 0L, jF3, jF4, null, null, null, null, null, null, false, 0.0d, null, null, null, 67077111, null));
            h(jF3, jF4);
        }
        return arrayList2;
    }

    public final int e(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(2);
    }

    public final long f(int i7, int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10, 1);
        return calendar.getTimeInMillis();
    }

    public final int g(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(1);
    }

    public final void h(long j6, long j10) {
        QueryFundStatReq queryFundStatReq = this.f32767e;
        queryFundStatReq.setStartTime(j6);
        queryFundStatReq.setEndTime(j10);
        AbstractC0780y.m(V.h(this), null, null, new Qc.V(this, null), 3);
    }
}

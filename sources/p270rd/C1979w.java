package p270rd;

import Jd.c;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.send_money.bean.AllBankListResp;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;
import p355xf.t;

/* JADX INFO: renamed from: rd.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1979w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41777c;

    public /* synthetic */ C1979w(SelectBankActivity selectBankActivity, SelectBankActivity selectBankActivity2, int i7) {
        this.f41775a = i7;
        this.f41776b = selectBankActivity;
        this.f41777c = selectBankActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41775a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                SelectBankActivity selectBankActivity = this.f41776b;
                if (z3) {
                    selectBankActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    selectBankActivity.showLoadingDialog(false, true);
                    AllBankListResp allBankListResp = (AllBankListResp) ((p) it).f27360a;
                    if (allBankListResp.isSuccess()) {
                        SelectBankActivity selectBankActivity2 = this.f41777c;
                        t tVar = selectBankActivity2.t;
                        ((CopyOnWriteArrayList) tVar.getValue()).clear();
                        AllBankListResp.DataBean data = allBankListResp.getData();
                        if (data != null) {
                            ((CopyOnWriteArrayList) tVar.getValue()).clear();
                            if (data.getAllBankList() != null) {
                                ((CopyOnWriteArrayList) tVar.getValue()).addAll(data.getAllBankList());
                            }
                            selectBankActivity2.o().setList(c.g((CopyOnWriteArrayList) tVar.getValue()));
                            t tVar2 = selectBankActivity2.f33196p;
                            ((CopyOnWriteArrayList) tVar2.getValue()).clear();
                            if (data.getCommonBankList() != null) {
                                ((CopyOnWriteArrayList) tVar2.getValue()).addAll(data.getCommonBankList());
                            }
                            selectBankActivity2.p().f4985b = (CopyOnWriteArrayList) tVar2.getValue();
                            selectBankActivity2.p().notifyDataSetChanged();
                        }
                    } else {
                        ToastUtils.showLong(allBankListResp.getRespMsg(), new Object[0]);
                    }
                } else if (it instanceof m) {
                    selectBankActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    selectBankActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof o;
                SelectBankActivity selectBankActivity3 = this.f41776b;
                if (z8) {
                    selectBankActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    selectBankActivity3.showLoadingDialog(false, true);
                    QueryBankListRsp queryBankListRsp = (QueryBankListRsp) ((p) it2).f27360a;
                    if (!queryBankListRsp.isSuccess()) {
                        ToastUtils.showLong(queryBankListRsp.getRespMsg(), new Object[0]);
                    } else if (queryBankListRsp.data != null) {
                        SelectBankActivity selectBankActivity4 = this.f41777c;
                        t tVar3 = selectBankActivity4.f33196p;
                        ((CopyOnWriteArrayList) tVar3.getValue()).clear();
                        t tVar4 = selectBankActivity4.t;
                        ((CopyOnWriteArrayList) tVar4.getValue()).clear();
                        for (BankInfo bankInfo : queryBankListRsp.data) {
                            if ("★".equals(bankInfo.indexType)) {
                                ((CopyOnWriteArrayList) tVar3.getValue()).add(bankInfo);
                            } else {
                                ((CopyOnWriteArrayList) tVar4.getValue()).add(bankInfo);
                            }
                        }
                        selectBankActivity4.p().f4985b = (CopyOnWriteArrayList) tVar3.getValue();
                        selectBankActivity4.p().notifyDataSetChanged();
                        selectBankActivity4.o().setList(c.g((CopyOnWriteArrayList) tVar4.getValue()));
                    }
                } else if (it2 instanceof m) {
                    selectBankActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    selectBankActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

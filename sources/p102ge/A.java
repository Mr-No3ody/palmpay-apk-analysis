package p102ge;

import Bc.h;
import android.text.TextUtils;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.rsp.BillSavingBannerRsp;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentGroup;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryServiceStateByCategoryIdRsp;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifeBillsHomeActivity f37180b;

    public /* synthetic */ A(LifeBillsHomeActivity lifeBillsHomeActivity, int i7) {
        this.f37179a = i7;
        this.f37180b = lifeBillsHomeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h hVar;
        ArrayList<GetMenuBillPaymentGroup> arrayList;
        h hVar2;
        h hVar3;
        LifeBillsHomeActivity lifeBillsHomeActivity = this.f37180b;
        switch (this.f37179a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        BillSavingBannerRsp billSavingBannerRsp = (BillSavingBannerRsp) ((p) it).f27360a;
                        if (billSavingBannerRsp.data != null) {
                            int i7 = LifeBillsHomeActivity.f34485A;
                            h hVar4 = (h) lifeBillsHomeActivity.f27334c;
                            if (hVar4 != null) {
                                hVar4.f722o.setVisibility(0);
                            }
                            h hVar5 = (h) lifeBillsHomeActivity.f27334c;
                            if (TextUtils.isEmpty(hVar5 != null ? hVar5.f722o.getText() : null) && (hVar = (h) lifeBillsHomeActivity.f27334c) != null) {
                                hVar.f722o.setText(billSavingBannerRsp.data.text);
                            }
                            h hVar6 = (h) lifeBillsHomeActivity.f27334c;
                            if (hVar6 != null) {
                                hVar6.f722o.requestFocus();
                            }
                            h hVar7 = (h) lifeBillsHomeActivity.f27334c;
                            if (hVar7 != null) {
                                hVar7.f722o.setSelected(true);
                            }
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        GetMenuBillPaymentRsp getMenuBillPaymentRsp = (GetMenuBillPaymentRsp) ((p) it2).f27360a;
                        ArrayList<GetMenuBillPaymentGroup> arrayList2 = getMenuBillPaymentRsp.data;
                        if (arrayList2 != null && !arrayList2.isEmpty() && (arrayList = getMenuBillPaymentRsp.data) != null) {
                            int i10 = LifeBillsHomeActivity.f34485A;
                            lifeBillsHomeActivity.o(arrayList);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        n nVar = (n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        QueryServiceStateByCategoryIdRsp response = (QueryServiceStateByCategoryIdRsp) ((p) it3).f27360a;
                        Intrinsics.checkNotNullParameter(response, "response");
                        List<String> data = response.data;
                        if (data != null) {
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            if (data.isEmpty()) {
                                hVar2 = (h) lifeBillsHomeActivity.f27334c;
                                if (hVar2 != null) {
                                    hVar2.f722o.setText("");
                                }
                                hVar3 = (h) lifeBillsHomeActivity.f27334c;
                                if (hVar3 != null) {
                                    hVar3.f722o.setVisibility(8);
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                Iterator<String> it4 = response.data.iterator();
                                while (it4.hasNext()) {
                                    sb2.append(it4.next());
                                    sb2.append("   ");
                                }
                                h hVar8 = (h) lifeBillsHomeActivity.f27334c;
                                if (hVar8 != null) {
                                    hVar8.f722o.setVisibility(0);
                                }
                                h hVar9 = (h) lifeBillsHomeActivity.f27334c;
                                if (hVar9 != null) {
                                    hVar9.f722o.setText(sb2.toString());
                                }
                                h hVar10 = (h) lifeBillsHomeActivity.f27334c;
                                if (hVar10 != null) {
                                    hVar10.f722o.postDelayed(new b(lifeBillsHomeActivity, 12), 1000L);
                                }
                            }
                        } else {
                            hVar2 = (h) lifeBillsHomeActivity.f27334c;
                            if (hVar2 != null) {
                                hVar2.f722o.setText("");
                            }
                            hVar3 = (h) lifeBillsHomeActivity.f27334c;
                            if (hVar3 != null) {
                                hVar3.f722o.setVisibility(8);
                            }
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                        ((n) it3).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}

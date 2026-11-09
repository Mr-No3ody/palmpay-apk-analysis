package p155k9;

import M1.d;
import Pa.n0;
import Xd.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.airtime.bean.AirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import com.transsnet.palmpay.airtime.bean.BaseAirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeCashbackInfoDataBean;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p1.c;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38709b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f38712e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AirtimeSpecialRechargeItem f38714g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f38715i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f38710c = Boolean.FALSE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38711d = -99;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f38713f = new ArrayList();

    static {
        new c(null);
    }

    public f(boolean z3) {
        this.f38709b = z3;
        a(new d(this, new b(this, 0)));
        a(new i(new b(this, 1)));
        a(new i(new b(this, 2), (byte) 0));
        a(new d(this, new b(this, 3), (byte) 0));
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        String spotType;
        Intrinsics.checkNotNullParameter(data, "data");
        BaseAirtimeItemsBean baseAirtimeItemsBean = (BaseAirtimeItemsBean) data.get(i7);
        if ((baseAirtimeItemsBean instanceof AirtimeSpecialRechargeItem) && (spotType = ((AirtimeSpecialRechargeItem) baseAirtimeItemsBean).getSpotType()) != null) {
            int iHashCode = spotType.hashCode();
            if (iHashCode != 404694076) {
                if (iHashCode != 716170584) {
                    if (iHashCode == 1359875037 && spotType.equals("AUTO_RENEW")) {
                        return 3;
                    }
                } else if (spotType.equals("CUSTOM_PACKAGE")) {
                    return 4;
                }
            } else if (spotType.equals("CUSTOM_JUMP")) {
                return 5;
            }
        }
        return 1;
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : getData()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            if (((BaseAirtimeItemsBean) obj) instanceof AirtimeItemsBean) {
                arrayList.add(Integer.valueOf(i7));
            }
            i7 = i10;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int iIntValue = ((Number) CollectionsKt.F(arrayList)).intValue();
        int size = arrayList.size();
        int i11 = iIntValue;
        int i12 = 1;
        while (i12 < size) {
            int iIntValue2 = ((Number) arrayList.get(i12)).intValue();
            if (iIntValue2 != i11 + 1) {
                notifyItemRangeChanged(iIntValue, (i11 - iIntValue) + 1);
                iIntValue = iIntValue2;
            }
            i12++;
            i11 = iIntValue2;
        }
        notifyItemRangeChanged(iIntValue, (i11 - iIntValue) + 1);
    }

    public final void e() {
        Long price;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f38713f);
        if (this.f38714g != null) {
            if (!Intrinsics.c(this.f38710c, Boolean.TRUE) || arrayList.isEmpty()) {
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = this.f38714g;
                Intrinsics.e(airtimeSpecialRechargeItem);
                arrayList.add(airtimeSpecialRechargeItem);
            } else {
                int size = arrayList.size() - 1;
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem2 = this.f38714g;
                Intrinsics.e(airtimeSpecialRechargeItem2);
                arrayList.set(size, airtimeSpecialRechargeItem2);
            }
            n0 n0VarG = n0.g();
            ViewEvent viewEvent = new ViewEvent("AirtimeRecommended_Show");
            AirtimeSpecialRechargeItem airtimeSpecialRechargeItem3 = this.f38714g;
            ViewEvent viewEventAdd = viewEvent.add("type", airtimeSpecialRechargeItem3 != null ? airtimeSpecialRechargeItem3.getSpotType() : null);
            AirtimeSpecialRechargeItem airtimeSpecialRechargeItem4 = this.f38714g;
            ViewEvent viewEventAdd2 = viewEventAdd.add(FirebaseAnalytics.Param.PRICE, String.valueOf((airtimeSpecialRechargeItem4 == null || (price = airtimeSpecialRechargeItem4.getPrice()) == null) ? 0L : price.longValue()));
            AirtimeSpecialRechargeItem airtimeSpecialRechargeItem5 = this.f38714g;
            ViewEvent viewEventAdd3 = viewEventAdd2.add("itemId", airtimeSpecialRechargeItem5 != null ? airtimeSpecialRechargeItem5.getItemId() : null);
            AirtimeSpecialRechargeItem airtimeSpecialRechargeItem6 = this.f38714g;
            n0VarG.u(viewEventAdd3.add("jumpUrl", airtimeSpecialRechargeItem6 != null ? airtimeSpecialRechargeItem6.getJumpUrl() : null));
        }
        setList(arrayList);
    }

    public final void f() {
        List list = this.f38715i;
        ArrayList<AirtimeItemsBean> arrayList = this.f38713f;
        if (list == null || list.isEmpty()) {
            for (AirtimeItemsBean airtimeItemsBean : arrayList) {
                airtimeItemsBean.setRewardsRateText("");
                airtimeItemsBean.setRewardsText("");
            }
            return;
        }
        for (AirtimeItemsBean airtimeItemsBean2 : arrayList) {
            List list2 = this.f38715i;
            AirtimeCashbackInfoDataBean airtimeCashbackInfoDataBean = null;
            Object obj = null;
            if (list2 != null) {
                for (Object obj2 : list2) {
                    if (y.h(airtimeItemsBean2.getItemId(), ((AirtimeCashbackInfoDataBean) obj2).getItemId(), true)) {
                        obj = obj2;
                        break;
                    }
                }
                airtimeCashbackInfoDataBean = (AirtimeCashbackInfoDataBean) obj;
            }
            if (airtimeCashbackInfoDataBean == null) {
                airtimeItemsBean2.setRewardsRateText("");
                airtimeItemsBean2.setRewardsText("");
            } else {
                airtimeItemsBean2.setRewardsRateText(airtimeCashbackInfoDataBean.getDiscountAmountText());
                airtimeItemsBean2.setRewardsText(airtimeCashbackInfoDataBean.getRewardsText());
            }
        }
    }

    public final void g(AirtimeSpecialRechargeItem airtimeSpecialRechargeItem, List list) {
        boolean z3;
        boolean z8 = true;
        if (Intrinsics.c(this.f38714g, airtimeSpecialRechargeItem)) {
            z3 = false;
        } else {
            this.f38714g = airtimeSpecialRechargeItem;
            z3 = true;
        }
        if (Intrinsics.c(this.f38715i, list)) {
            z8 = false;
        } else {
            this.f38715i = list;
            f();
        }
        if (z3) {
            e();
        } else if (z8) {
            d();
        }
    }
}

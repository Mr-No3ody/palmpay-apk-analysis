package p141j9;

import Ed.ViewOnFocusChangeListenerC0235o;
import Hb.L;
import Pd.c;
import android.view.View;
import androidx.activity.H;
import androidx.activity.z;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.dialog.AirtimeCouponRetentionDialog;
import com.transsnet.palmpay.airtime.ui.dialog.DataPlanQuickBuyDialog;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p068ec.f;
import p155k9.i;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38436b;

    public /* synthetic */ w(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        this.f38435a = i7;
        this.f38436b = topupAirtimeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BillerCouponRetentionBean billerCouponRetentionBean;
        String memberId;
        long j6;
        ConstraintLayout constraintLayout;
        Barrier barrier;
        int i7 = 1;
        TopupAirtimeActivity topupAirtimeActivity = this.f38436b;
        switch (this.f38435a) {
            case 0:
                z addCallback = (z) obj;
                int i10 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                TopupAirtimeActivity topupAirtimeActivity2 = this.f38436b;
                if (!BaseApplication.hasLogin() || topupAirtimeActivity2.f26515t0 || (billerCouponRetentionBean = topupAirtimeActivity2.f26514s0) == null) {
                    topupAirtimeActivity2.goBackToHome();
                    topupAirtimeActivity2.finish();
                } else {
                    List<String> institutionIdList = billerCouponRetentionBean.getInstitutionIdList();
                    List<String> list = institutionIdList;
                    if (list == null || list.isEmpty()) {
                        SPUtils sPUtils = SPUtils.get();
                        memberId = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                        if (memberId == null) {
                            memberId = "";
                        }
                        j6 = sPUtils.getLong("qt_airtime_exit_coupon_retention_last_show_time_".concat(memberId), 0L);
                        if (j6 > 0 || System.currentTimeMillis() - j6 >= 604800000) {
                            AirtimeCouponRetentionDialog airtimeCouponRetentionDialog = new AirtimeCouponRetentionDialog(topupAirtimeActivity2, billerCouponRetentionBean, new H(0, topupAirtimeActivity2, TopupAirtimeActivity.class, "finishAirtimePage", "finishAirtimePage()V", 0, 3), new L(18, topupAirtimeActivity2, billerCouponRetentionBean));
                            airtimeCouponRetentionDialog.setOnShowListener(new f(topupAirtimeActivity2, i7));
                            airtimeCouponRetentionDialog.show();
                        } else {
                            topupAirtimeActivity2.goBackToHome();
                            topupAirtimeActivity2.finish();
                        }
                    } else {
                        QueryAirtimeV2Rsp.DataBean dataBean = topupAirtimeActivity2.f26505Z;
                        if (dataBean != null) {
                            List<String> list2 = institutionIdList;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (TopupAirtimeActivity.x((String) it.next(), dataBean)) {
                                            SPUtils sPUtils2 = SPUtils.get();
                                            memberId = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                                            if (memberId == null) {
                                                memberId = "";
                                            }
                                            j6 = sPUtils2.getLong("qt_airtime_exit_coupon_retention_last_show_time_".concat(memberId), 0L);
                                            if (j6 > 0) {
                                            }
                                            AirtimeCouponRetentionDialog airtimeCouponRetentionDialog2 = new AirtimeCouponRetentionDialog(topupAirtimeActivity2, billerCouponRetentionBean, new H(0, topupAirtimeActivity2, TopupAirtimeActivity.class, "finishAirtimePage", "finishAirtimePage()V", 0, 3), new L(18, topupAirtimeActivity2, billerCouponRetentionBean));
                                            airtimeCouponRetentionDialog2.setOnShowListener(new f(topupAirtimeActivity2, i7));
                                            airtimeCouponRetentionDialog2.show();
                                        }
                                    }
                                }
                            }
                        }
                        topupAirtimeActivity2.goBackToHome();
                        topupAirtimeActivity2.finish();
                    }
                }
                break;
            case 1:
                String errorMsg = (String) obj;
                int i11 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                h.x(topupAirtimeActivity, errorMsg);
                break;
            case 2:
                View view = (View) obj;
                int i12 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(view, "view");
                if (topupAirtimeActivity.w()) {
                    topupAirtimeActivity.f26506i = view;
                    PpAmountEditText ppAmountEditText = (PpAmountEditText) view.findViewById(c.inputAmount);
                    topupAirtimeActivity.f26507j = ppAmountEditText;
                    if (ppAmountEditText != null) {
                        ppAmountEditText.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                    }
                    PpAmountEditText ppAmountEditText2 = topupAirtimeActivity.f26507j;
                    if (ppAmountEditText2 != null) {
                        ppAmountEditText2.setActionButtonListener(new y(topupAirtimeActivity, 4));
                    }
                    PpAmountEditText ppAmountEditText3 = topupAirtimeActivity.f26507j;
                    if (ppAmountEditText3 != null) {
                        ppAmountEditText3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(topupAirtimeActivity, 17));
                    }
                    PpAmountEditText ppAmountEditText4 = topupAirtimeActivity.f26507j;
                    if (ppAmountEditText4 != null) {
                        ppAmountEditText4.setTextInputListener(new C1794b(topupAirtimeActivity, 2));
                    }
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(c.atuaPickAmountRcv);
                    topupAirtimeActivity.f26509o = recyclerView;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new GridLayoutManager(topupAirtimeActivity, 3));
                    }
                    RecyclerView recyclerView2 = topupAirtimeActivity.f26509o;
                    if (recyclerView2 != null) {
                        recyclerView2.addItemDecoration(new i());
                    }
                    RecyclerView recyclerView3 = topupAirtimeActivity.f26509o;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(topupAirtimeActivity.f26500L);
                    }
                    p155k9.f fVar = topupAirtimeActivity.f26500L;
                    if (fVar != null) {
                        fVar.f38712e = new p1.c(topupAirtimeActivity, 23);
                    }
                }
                break;
            case 3:
                View view2 = (View) obj;
                int i13 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (topupAirtimeActivity.w()) {
                    Rd.H h7 = (Rd.H) topupAirtimeActivity.f27334c;
                    if (h7 != null && (constraintLayout = h7.f8060a) != null && (barrier = (Barrier) constraintLayout.findViewById(c.barrier_top)) != null) {
                        int[] referencedIds = barrier.getReferencedIds();
                        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
                        Intrinsics.checkNotNullParameter(referencedIds, "<this>");
                        ArrayList arrayList = new ArrayList(referencedIds.length);
                        for (int i14 : referencedIds) {
                            arrayList.add(Integer.valueOf(i14));
                        }
                        arrayList.add(Integer.valueOf(view2.getId()));
                        barrier.setReferencedIds(CollectionsKt.X(arrayList));
                    }
                }
                break;
            case 4:
                HighlyRecommendDataBundleItemBean item = (HighlyRecommendDataBundleItemBean) obj;
                int i15 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(item, "item");
                if (!topupAirtimeActivity.v()) {
                    topupAirtimeActivity.B(item);
                }
                break;
            default:
                HighlyRecommendDataBundleItemBean item2 = (HighlyRecommendDataBundleItemBean) obj;
                int i16 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(item2, "item");
                new DataPlanQuickBuyDialog(topupAirtimeActivity, item2, new L(19, topupAirtimeActivity, item2)).show();
                break;
        }
        return Unit.f38893a;
    }
}

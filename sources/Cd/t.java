package Cd;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleBeforeResp;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToBankFragment f1389b;

    public /* synthetic */ t(ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment, int i7) {
        this.f1388a = i7;
        this.f1389b = scheduleTransferPaymentToBankFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<RecipientListResp.RecipientBean> data;
        List<RecipientListResp.RecipientBean> data2;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView;
        List<BankInfo> list;
        p223od.o oVar;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView2;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView3;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1389b;
        switch (this.f1388a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            ScheduleBeforeResp scheduleBeforeResp = (ScheduleBeforeResp) commonBeanResult.data;
                            List<String> notes = scheduleBeforeResp != null ? scheduleBeforeResp.getNotes() : null;
                            ScheduleTransferPaymentToBankFragment.a aVar = ScheduleTransferPaymentToBankFragment.f33711H;
                            if (notes != null) {
                                for (String str : notes) {
                                    p223od.o oVar2 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                                    if (oVar2 != null) {
                                        FlexboxLayout flexboxLayout = oVar2.f40441e;
                                        TextView textView = new TextView(scheduleTransferPaymentToBankFragment.requireContext());
                                        textView.setLayoutParams(new FlexboxLayout.LayoutParams(-2, CommonViewExtKt.getDp(24)));
                                        textView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_secondary);
                                        textView.setTextColor(scheduleTransferPaymentToBankFragment.getResources().getColorStateList(L6.b.ppColorPrimary));
                                        textView.setGravity(17);
                                        textView.setText(str);
                                        textView.setPadding(CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(6), CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(6));
                                        textView.setTextSize(1, 10.0f);
                                        textView.setOnClickListener(new A8.c(8, scheduleTransferPaymentToBankFragment, str));
                                        flexboxLayout.addView(textView);
                                    }
                                }
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (recipientListResp.isSuccess() && (data = recipientListResp.getData()) != null) {
                            for (RecipientListResp.RecipientBean recipientBean : data) {
                                ArrayList arrayList = (ArrayList) scheduleTransferPaymentToBankFragment.f33717v.getValue();
                                AddFromContactListResp addFromContactListResp = new AddFromContactListResp();
                                addFromContactListResp.setRecipientHeadImage(recipientBean.getRecipientHeadImage());
                                addFromContactListResp.setRecipientName(recipientBean.getRecipientNickname());
                                addFromContactListResp.setRecipientAccountNumber(recipientBean.getRecipientAccountNumber());
                                addFromContactListResp.setRecipientBankName(recipientBean.getRecipientBankName());
                                addFromContactListResp.setRecipientBankCode(recipientBean.getRecipientBankCode());
                                addFromContactListResp.setRecipientMemberId(recipientBean.payeeMemberId);
                                addFromContactListResp.setRecipientPalmPayTag(recipientBean.getPalmPayTag());
                                addFromContactListResp.setRecipientPhone(recipientBean.ppAccountNo);
                                addFromContactListResp.setAccountType(recipientBean.tagType == 2 ? 1 : 2);
                                arrayList.add(addFromContactListResp);
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp2 = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (recipientListResp2.isSuccess() && (data2 = recipientListResp2.getData()) != null) {
                            for (RecipientListResp.RecipientBean recipientBean2 : data2) {
                                ArrayList arrayList2 = (ArrayList) scheduleTransferPaymentToBankFragment.f33718w.getValue();
                                AddFromContactListResp addFromContactListResp2 = new AddFromContactListResp();
                                addFromContactListResp2.setRecipientHeadImage(recipientBean2.getRecipientHeadImage());
                                addFromContactListResp2.setRecipientName(recipientBean2.getRecipientNickname());
                                addFromContactListResp2.setRecipientAccountNumber(recipientBean2.getRecipientAccountNumber());
                                addFromContactListResp2.setRecipientBankName(recipientBean2.getRecipientBankName());
                                addFromContactListResp2.setRecipientBankCode(recipientBean2.getRecipientBankCode());
                                addFromContactListResp2.setRecipientMemberId(recipientBean2.payeeMemberId);
                                addFromContactListResp2.setRecipientPalmPayTag(recipientBean2.getPalmPayTag());
                                addFromContactListResp2.setRecipientPhone(recipientBean2.ppAccountNo);
                                addFromContactListResp2.setAccountType(recipientBean2.tagType == 1 ? 2 : 1);
                                arrayList2.add(addFromContactListResp2);
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryBankListRsp queryBankListRsp = (QueryBankListRsp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        ScheduleTransferPaymentToBankFragment.a aVar2 = ScheduleTransferPaymentToBankFragment.f33711H;
                        p223od.o oVar3 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                        if (oVar3 != null && (searchRecipientAccountToBankView3 = oVar3.f40442f) != null) {
                            searchRecipientAccountToBankView3.b();
                        }
                        if (queryBankListRsp.isSuccess() && (list = queryBankListRsp.data) != null && !list.isEmpty() && (oVar = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j) != null && (searchRecipientAccountToBankView2 = oVar.f40442f) != null) {
                            searchRecipientAccountToBankView2.setMatchBankList(list);
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                        ScheduleTransferPaymentToBankFragment.a aVar3 = ScheduleTransferPaymentToBankFragment.f33711H;
                        p223od.o oVar4 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                        if (oVar4 != null && (searchRecipientAccountToBankView = oVar4.f40442f) != null) {
                            searchRecipientAccountToBankView.b();
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        ScheduleTransferPaymentToBankFragment.a aVar4 = ScheduleTransferPaymentToBankFragment.f33711H;
                        scheduleTransferPaymentToBankFragment.y(verifyPaymentInfoRsp, false);
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String errorMsg = ((com.transsnet.palmpay.core.base.n) it5).f27358a;
                        ScheduleTransferPaymentToBankFragment.a aVar5 = ScheduleTransferPaymentToBankFragment.f33711H;
                        scheduleTransferPaymentToBankFragment.v();
                        p223od.o oVar5 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                        if (oVar5 != null) {
                            SearchRecipientAccountToBankView searchRecipientAccountToBankView4 = oVar5.f40442f;
                            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                            searchRecipientAccountToBankView4.b();
                            Bc.j jVar = searchRecipientAccountToBankView4.f33835c;
                            if (jVar != null) {
                                p220oa.h.C((LinearLayout) jVar.f741i);
                            }
                            searchRecipientAccountToBankView4.e(errorMsg, true);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp2 = (VerifyPaymentInfoRsp) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        ScheduleTransferPaymentToBankFragment.a aVar6 = ScheduleTransferPaymentToBankFragment.f33711H;
                        scheduleTransferPaymentToBankFragment.y(verifyPaymentInfoRsp2, true);
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String errorMsg2 = ((com.transsnet.palmpay.core.base.n) it6).f27358a;
                        ScheduleTransferPaymentToBankFragment.a aVar7 = ScheduleTransferPaymentToBankFragment.f33711H;
                        scheduleTransferPaymentToBankFragment.v();
                        p223od.o oVar6 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                        if (oVar6 != null) {
                            SearchRecipientAccountToBankView searchRecipientAccountToBankView5 = oVar6.f40442f;
                            Intrinsics.checkNotNullParameter(errorMsg2, "errorMsg");
                            searchRecipientAccountToBankView5.b();
                            Bc.j jVar2 = searchRecipientAccountToBankView5.f33835c;
                            if (jVar2 != null) {
                                p220oa.h.C((LinearLayout) jVar2.f741i);
                            }
                            searchRecipientAccountToBankView5.e(errorMsg2, true);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}

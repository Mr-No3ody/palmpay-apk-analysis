package Cd;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleBeforeResp;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToPalmPayFragment f1396b;

    public /* synthetic */ x(ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment, int i7) {
        this.f1395a = i7;
        this.f1396b = scheduleTransferPaymentToPalmPayFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CommonListResult.CommonList<T> commonList;
        Iterable iterable;
        CommonListResult.CommonList<T> commonList2;
        Iterable<RecipientBeanV2> iterable2;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView2;
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment = this.f1396b;
        switch (this.f1395a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            ScheduleBeforeResp scheduleBeforeResp = (ScheduleBeforeResp) commonBeanResult.data;
                            List<String> notes = scheduleBeforeResp != null ? scheduleBeforeResp.getNotes() : null;
                            ScheduleTransferPaymentToPalmPayFragment.a aVar = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                            if (notes != null) {
                                for (String str : notes) {
                                    p223od.p pVar = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                                    if (pVar != null) {
                                        FlexboxLayout flexboxLayout = pVar.f40447e;
                                        TextView textView = new TextView(scheduleTransferPaymentToPalmPayFragment.requireContext());
                                        textView.setLayoutParams(new FlexboxLayout.LayoutParams(-2, CommonViewExtKt.getDp(24)));
                                        textView.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_secondary);
                                        textView.setTextColor(scheduleTransferPaymentToPalmPayFragment.getResources().getColorStateList(L6.b.ppColorPrimary));
                                        textView.setGravity(17);
                                        textView.setText(str);
                                        textView.setPadding(CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(6), CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(6));
                                        textView.setTextSize(1, 10.0f);
                                        textView.setOnClickListener(new A8.c(9, scheduleTransferPaymentToPalmPayFragment, str));
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
                        CommonListResult commonListResult = (CommonListResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonListResult.isSuccess() && (commonList = commonListResult.data) != 0 && (iterable = commonList.list) != null) {
                            ArrayList<RecipientBeanV2> arrayList = new ArrayList();
                            for (Object obj2 : iterable) {
                                if (!TextUtils.isEmpty(((RecipientBeanV2) obj2).getMemberId())) {
                                    arrayList.add(obj2);
                                }
                            }
                            for (RecipientBeanV2 recipientBeanV2 : arrayList) {
                                ArrayList arrayList2 = (ArrayList) scheduleTransferPaymentToPalmPayFragment.f33725v.getValue();
                                AddFromContactListResp addFromContactListResp = new AddFromContactListResp();
                                addFromContactListResp.setRecipientHeadImage(recipientBeanV2.getHeadPortrait());
                                addFromContactListResp.setRecipientName(recipientBeanV2.getFullName());
                                addFromContactListResp.setRecipientMemberId(recipientBeanV2.getMemberId());
                                addFromContactListResp.setRecipientPhone(TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? recipientBeanV2.getPhone() : recipientBeanV2.getPpAccountNo());
                                addFromContactListResp.setRecipientPalmPayTag(recipientBeanV2.getPalmPayTag());
                                arrayList2.add(addFromContactListResp);
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
                        CommonListResult commonListResult2 = (CommonListResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonListResult2.isSuccess() && (commonList2 = commonListResult2.data) != 0 && (iterable2 = commonList2.list) != null) {
                            for (RecipientBeanV2 recipientBeanV3 : iterable2) {
                                ArrayList arrayList3 = (ArrayList) scheduleTransferPaymentToPalmPayFragment.f33726w.getValue();
                                AddFromContactListResp addFromContactListResp2 = new AddFromContactListResp();
                                addFromContactListResp2.setRecipientHeadImage(recipientBeanV3.getHeadPortrait());
                                addFromContactListResp2.setRecipientName(recipientBeanV3.getFullName());
                                addFromContactListResp2.setRecipientMemberId(recipientBeanV3.getMemberId());
                                addFromContactListResp2.setRecipientPhone(recipientBeanV3.getPhone());
                                addFromContactListResp2.setRecipientPalmPayTag(recipientBeanV3.getPalmPayTag());
                                arrayList3.add(addFromContactListResp2);
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
                        QueryRecipientMemberInfoResp queryRecipientMemberInfoResp = (QueryRecipientMemberInfoResp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        ScheduleTransferPaymentToPalmPayFragment.a aVar2 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                        scheduleTransferPaymentToPalmPayFragment.w(queryRecipientMemberInfoResp, false);
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str2 = ((com.transsnet.palmpay.core.base.n) it4).f27358a;
                        ScheduleTransferPaymentToPalmPayFragment.a aVar3 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                        p223od.p pVar2 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                        if (pVar2 != null && (searchRecipientAccountToPalmPayView = pVar2.f40448f) != null) {
                            searchRecipientAccountToPalmPayView.b(str2);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryRecipientMemberInfoResp queryRecipientMemberInfoResp2 = (QueryRecipientMemberInfoResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        ScheduleTransferPaymentToPalmPayFragment.a aVar4 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                        scheduleTransferPaymentToPalmPayFragment.w(queryRecipientMemberInfoResp2, true);
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str3 = ((com.transsnet.palmpay.core.base.n) it5).f27358a;
                        ScheduleTransferPaymentToPalmPayFragment.a aVar5 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                        p223od.p pVar3 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                        if (pVar3 != null && (searchRecipientAccountToPalmPayView2 = pVar3.f40448f) != null) {
                            searchRecipientAccountToPalmPayView2.b(str3);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}

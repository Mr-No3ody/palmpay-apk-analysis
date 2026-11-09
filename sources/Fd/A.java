package Fd;

import B6.ViewOnClickListenerC0087i;
import Ed.S;
import Pa.C0525w;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CashBoxTrialCashEntryResp;
import com.transsnet.palmpay.core.ui.widget.CashBoxTrialCashEntryLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.bean.resp.BenefitsBean;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.bean.resp.TopEntranceBean;
import com.transsnet.palmpay.send_money.bean.resp.TransferToPalmPayHomeConfigResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFragment f2649b;

    public /* synthetic */ A(TransferToPalmPayHomeFragment transferToPalmPayHomeFragment, int i7) {
        this.f2648a = i7;
        this.f2649b = transferToPalmPayHomeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp;
        p223od.r rVar;
        String content;
        p223od.r rVar2;
        p223od.r rVar3;
        Unit unit;
        String jumpUrl;
        ImageView rightImageView2;
        ImageView rightImageView3;
        int i7 = 7;
        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = this.f2649b;
        switch (this.f2648a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess() && (transferToPalmPayHomeConfigResp = (TransferToPalmPayHomeConfigResp) commonBeanResult.data) != null) {
                            transferToPalmPayHomeFragment.f33814A = transferToPalmPayHomeConfigResp;
                            CashBoxTrialCashEntryResp financeInfo = transferToPalmPayHomeConfigResp.getFinanceInfo();
                            Unit unit2 = null;
                            if (financeInfo != null) {
                                if (transferToPalmPayHomeFragment.f33816C == null) {
                                    ViewStub viewStub = (ViewStub) transferToPalmPayHomeFragment.f27318b.findViewById(p159kd.e.vs_cashbox_trial_cash);
                                    View viewInflate = viewStub != null ? viewStub.inflate() : null;
                                    transferToPalmPayHomeFragment.f33816C = viewInflate != null ? (CashBoxTrialCashEntryLayout) viewInflate.findViewById(p159kd.e.layout_cashbox_trial_cash) : null;
                                }
                                Integer num = financeInfo.showType;
                                if ((num != null ? num.intValue() : 0) > 0) {
                                    CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = transferToPalmPayHomeFragment.f33816C;
                                    if (cashBoxTrialCashEntryLayout != null) {
                                        cashBoxTrialCashEntryLayout.c(financeInfo, "Transfer", transferToPalmPayHomeFragment.m());
                                    }
                                    CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout2 = transferToPalmPayHomeFragment.f33816C;
                                    if (cashBoxTrialCashEntryLayout2 != null) {
                                        p220oa.h.C(cashBoxTrialCashEntryLayout2);
                                    }
                                } else {
                                    CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout3 = transferToPalmPayHomeFragment.f33816C;
                                    if (cashBoxTrialCashEntryLayout3 != null) {
                                        p220oa.h.c(cashBoxTrialCashEntryLayout3);
                                    }
                                }
                            }
                            if (transferToPalmPayHomeFragment.t) {
                                transferToPalmPayHomeFragment.t = false;
                                transferToPalmPayHomeFragment.w();
                            }
                            TopEntranceBean topEntrance = transferToPalmPayHomeConfigResp.getTopEntrance();
                            if (topEntrance != null && !TextUtils.isEmpty(topEntrance.getIcon()) && !TextUtils.isEmpty(topEntrance.getJumpUrl())) {
                                p223od.r rVar4 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                if (rVar4 != null && (rightImageView3 = rVar4.f40472B.getRightImageView2()) != null) {
                                    p220oa.h.s(rightImageView3, true);
                                }
                                p223od.r rVar5 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                r0.k1(rVar5 != null ? rVar5.f40472B.getRightImageView2() : null, topEntrance.getIcon(), topEntrance.getDarkIcon());
                                p223od.r rVar6 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                if (rVar6 != null && (rightImageView2 = rVar6.f40472B.getRightImageView2()) != null) {
                                    rightImageView2.setOnClickListener(new S(topEntrance, 1));
                                }
                            }
                            List<BenefitsBean> benefitsBannerList = transferToPalmPayHomeConfigResp.getBenefitsBannerList();
                            if (benefitsBannerList == null) {
                                benefitsBannerList = kotlin.collections.z.f38935a;
                            }
                            p223od.r rVar7 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                            if (rVar7 != null) {
                                ViewFlipper viewFlipper = rVar7.f40476M;
                                viewFlipper.setInAnimation(transferToPalmPayHomeFragment.requireContext(), com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in);
                                viewFlipper.setOutAnimation(transferToPalmPayHomeFragment.requireContext(), com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out);
                                viewFlipper.stopFlipping();
                                viewFlipper.removeAllViews();
                                ArrayList<BenefitsBean> arrayList = new ArrayList();
                                for (Object obj2 : benefitsBannerList) {
                                    if (Intrinsics.c(((BenefitsBean) obj2).getShow(), Boolean.TRUE)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                for (BenefitsBean benefitsBean : arrayList) {
                                    View viewInflate2 = LayoutInflater.from(transferToPalmPayHomeFragment.getContext()).inflate(p159kd.f.sm_layout_to_palmpay_home_view_flipper, (ViewGroup) null);
                                    ((TextView) viewInflate2.findViewById(p159kd.e.tvContent)).setText(benefitsBean.getContent());
                                    Integer picWidth = benefitsBean.getPicWidth();
                                    if (picWidth != null) {
                                        if (picWidth.intValue() <= 0) {
                                            picWidth = null;
                                        }
                                        if (picWidth != null) {
                                            ((ImageView) viewInflate2.findViewById(p159kd.e.ivLeft)).getLayoutParams().width = CommonViewExtKt.getDp(picWidth.intValue());
                                        }
                                    }
                                    r0.k1((ImageView) viewInflate2.findViewById(p159kd.e.ivLeft), benefitsBean.getPic(), benefitsBean.getDarkPic());
                                    String jumpUrl2 = benefitsBean.getJumpUrl();
                                    if (jumpUrl2 != null) {
                                        if (jumpUrl2.length() <= 0) {
                                            jumpUrl2 = null;
                                        }
                                        if (jumpUrl2 != null) {
                                            View viewFindViewById = viewInflate2.findViewById(p159kd.e.ivRight);
                                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                                            p220oa.h.C(viewFindViewById);
                                            viewInflate2.setOnClickListener(new A8.c(23, transferToPalmPayHomeFragment, jumpUrl2));
                                        }
                                    }
                                    viewFlipper.addView(viewInflate2);
                                }
                                if (viewFlipper.getChildCount() != 0) {
                                    p223od.r rVar8 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                    if (rVar8 != null) {
                                        p220oa.h.C(rVar8.f40485g);
                                    }
                                    transferToPalmPayHomeFragment.y();
                                } else {
                                    p223od.r rVar9 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                    if (rVar9 != null) {
                                        p220oa.h.c(rVar9.f40485g);
                                    }
                                }
                            }
                            BenefitsBean transferSafe = transferToPalmPayHomeConfigResp.getTransferSafe();
                            if (transferSafe == null || (content = transferSafe.getContent()) == null) {
                                rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                if (rVar != null) {
                                    p220oa.h.c(rVar.f40489p);
                                    Unit unit3 = Unit.f38893a;
                                }
                            } else {
                                if (!(content.length() > 0)) {
                                    content = null;
                                }
                                if (content == null) {
                                    rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                    if (rVar != null) {
                                        p220oa.h.c(rVar.f40489p);
                                        Unit unit4 = Unit.f38893a;
                                    }
                                } else {
                                    p223od.r rVar10 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                    if (rVar10 != null) {
                                        p220oa.h.C(rVar10.f40489p);
                                    }
                                    p223od.r rVar11 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                    if (rVar11 != null) {
                                        rVar11.f40474H.setText(content);
                                    }
                                    BenefitsBean transferSafe2 = transferToPalmPayHomeConfigResp.getTransferSafe();
                                    if (transferSafe2 == null || (jumpUrl = transferSafe2.getJumpUrl()) == null) {
                                        rVar2 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                        if (rVar2 != null) {
                                            p220oa.h.c(rVar2.f40486i);
                                        }
                                        rVar3 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                        if (rVar3 != null) {
                                            rVar3.f40489p.setOnClickListener(null);
                                            unit2 = Unit.f38893a;
                                        }
                                        unit = unit2;
                                    } else {
                                        if (!(jumpUrl.length() > 0)) {
                                            jumpUrl = null;
                                        }
                                        if (jumpUrl == null) {
                                            rVar2 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                            if (rVar2 != null) {
                                                p220oa.h.c(rVar2.f40486i);
                                            }
                                            rVar3 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                            if (rVar3 != null) {
                                                rVar3.f40489p.setOnClickListener(null);
                                                unit2 = Unit.f38893a;
                                            }
                                            unit = unit2;
                                        } else {
                                            p223od.r rVar12 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                            if (rVar12 != null) {
                                                p220oa.h.C(rVar12.f40486i);
                                            }
                                            p223od.r rVar13 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                            if (rVar13 != null) {
                                                rVar13.f40489p.setOnClickListener(new ViewOnClickListenerC0087i(transferToPalmPayHomeConfigResp, i7, transferToPalmPayHomeFragment, jumpUrl));
                                                unit = Unit.f38893a;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                rVar2 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                                if (rVar2 != null) {
                                                    p220oa.h.c(rVar2.f40486i);
                                                }
                                                rVar3 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                                if (rVar3 != null) {
                                                    rVar3.f40489p.setOnClickListener(null);
                                                    unit2 = Unit.f38893a;
                                                }
                                                unit = unit2;
                                            }
                                        }
                                    }
                                    if (unit == null) {
                                        rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                                        if (rVar != null) {
                                            p220oa.h.c(rVar.f40489p);
                                            Unit unit5 = Unit.f38893a;
                                        }
                                    }
                                }
                            }
                            p223od.r rVar14 = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                            if (rVar14 != null) {
                                rVar14.f40473C.a(transferToPalmPayHomeConfigResp.getBannerEntranceList(), new Ba.a(transferToPalmPayHomeFragment, i7));
                            }
                            TransferTrackingUtils transferTrackingUtils = TransferTrackingUtils.INSTANCE;
                            List<BannerEntranceBean> bannerEntranceList = transferToPalmPayHomeConfigResp.getBannerEntranceList();
                            if (bannerEntranceList == null) {
                                bannerEntranceList = kotlin.collections.z.f38935a;
                            }
                            transferTrackingUtils.logGridShow(TransferTrackingUtils.PAGE_TYPE_TO_PALMPAY, bannerEntranceList);
                            RecentlyScheduleTransferBean recentlyScheduleTransfer = transferToPalmPayHomeConfigResp.getRecentlyScheduleTransfer();
                            if (recentlyScheduleTransfer != null) {
                                transferToPalmPayHomeFragment.x(recentlyScheduleTransfer);
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    transferToPalmPayHomeFragment.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    transferToPalmPayHomeFragment.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    C0525w c0525wF = C0525w.f();
                    ArrayList arrayList2 = (ArrayList) commonBeanResult2.data;
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList2 != null ? arrayList2 : ""));
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    transferToPalmPayHomeFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToPalmPayHomeFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                }
                return Unit.f38893a;
        }
    }
}

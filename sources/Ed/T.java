package Ed;

import Ab.ViewOnClickListenerC0053e;
import B6.ViewOnClickListenerC0087i;
import Gd.C0297a;
import Kd.L0;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.RecentlyCompensationBean;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.bean.resp.BenefitsBean;
import com.transsnet.palmpay.send_money.bean.resp.IsBookTransferResp;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.bean.resp.ToBankConfigResp;
import com.transsnet.palmpay.send_money.bean.resp.TopEntranceBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2345b;

    public /* synthetic */ T(TransferToBankHomeFragment transferToBankHomeFragment, int i7) {
        this.f2344a = i7;
        this.f2345b = transferToBankHomeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:172:0x0329  */
    /* JADX WARN: Code duplicated, block: B:174:0x032f  */
    /* JADX WARN: Code duplicated, block: B:177:0x033a  */
    /* JADX WARN: Code duplicated, block: B:235:0x041f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0421  */
    /* JADX WARN: Code duplicated, block: B:249:0x0444  */
    /* JADX WARN: Code duplicated, block: B:251:0x0448  */
    /* JADX WARN: Code duplicated, block: B:253:0x044c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToBankConfigResp newData;
        p223od.q qVar;
        p223od.q qVar2;
        p223od.q qVar3;
        C0297a c0297a;
        View view;
        Unit unit;
        View view2;
        Long remainTime;
        p223od.q qVar4;
        String jumpUrl;
        Unit unit2;
        String string;
        ImageView rightImageView2;
        ImageView rightImageView3;
        Object obj2;
        int i7 = 4;
        String str = "";
        TransferToBankHomeFragment transferToBankHomeFragment = this.f2345b;
        switch (this.f2344a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess() && (newData = (ToBankConfigResp) commonBeanResult.data) != null) {
                            SPUtils sPUtils = SPUtils.get();
                            Boolean showTransferUssd = newData.getShowTransferUssd();
                            sPUtils.put("show_transfer_via_ussd", showTransferUssd != null ? showTransferUssd.booleanValue() : false);
                            SPUtils sPUtils2 = SPUtils.get();
                            String ussdDialCode = newData.getUssdDialCode();
                            String str2 = str;
                            if (ussdDialCode != null) {
                                str2 = ussdDialCode;
                            }
                            sPUtils2.put("ussd_dial_code", str2);
                            transferToBankHomeFragment.f33776C = newData.getTopBanners();
                            L0 l5 = (L0) transferToBankHomeFragment.t.getValue();
                            l5.getClass();
                            Intrinsics.checkNotNullParameter(newData, "newData");
                            l5.f5080j.k(newData);
                            IsBookTransferResp bookTransfer = newData.getBookTransfer();
                            if (bookTransfer != null) {
                                Integer hasPreBookTransfer = bookTransfer.getHasPreBookTransfer();
                                if (hasPreBookTransfer != null && hasPreBookTransfer.intValue() == 1) {
                                    p223od.q qVar5 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar5 != null) {
                                        p220oa.h.C(qVar5.f40452H);
                                    }
                                    p223od.q qVar6 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar6 != null) {
                                        qVar6.f40452H.setText(bookTransfer.getEntranceContent());
                                    }
                                    p223od.q qVar7 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar7 != null) {
                                        qVar7.f40452H.setOnClickListener(new ViewOnClickListenerC0053e(10));
                                    }
                                    p223od.q qVar8 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar8 != null) {
                                        p220oa.h.c(qVar8.f40461d);
                                    }
                                } else {
                                    p223od.q qVar9 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar9 != null) {
                                        p220oa.h.c(qVar9.f40452H);
                                    }
                                    p223od.q qVar10 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar10 != null) {
                                        qVar10.f40461d.setSlotId(transferToBankHomeFragment.getString(p025ba.k.ad_send_money_to_bank_green_ad));
                                    }
                                }
                            }
                            TopEntranceBean topEntrance = newData.getTopEntrance();
                            if (topEntrance != null && !TextUtils.isEmpty(topEntrance.getIcon()) && !TextUtils.isEmpty(topEntrance.getJumpUrl())) {
                                p223od.q qVar11 = (p223od.q) transferToBankHomeFragment.f27335j;
                                if (qVar11 != null && (rightImageView3 = qVar11.f40450B.getRightImageView2()) != null) {
                                    p220oa.h.s(rightImageView3, true);
                                }
                                p223od.q qVar12 = (p223od.q) transferToBankHomeFragment.f27335j;
                                r0.k1(qVar12 != null ? qVar12.f40450B.getRightImageView2() : null, topEntrance.getIcon(), topEntrance.getDarkIcon());
                                p223od.q qVar13 = (p223od.q) transferToBankHomeFragment.f27335j;
                                if (qVar13 != null && (rightImageView2 = qVar13.f40450B.getRightImageView2()) != null) {
                                    rightImageView2.setOnClickListener(new S(topEntrance, 0));
                                }
                            }
                            List<BenefitsBean> benefitsBannerList = newData.getBenefitsBannerList();
                            if (benefitsBannerList == null) {
                                qVar = (p223od.q) transferToBankHomeFragment.f27335j;
                                if (qVar != null) {
                                    p220oa.h.c(qVar.f40466j);
                                    Unit unit3 = Unit.f38893a;
                                }
                            } else {
                                if (benefitsBannerList.isEmpty()) {
                                    benefitsBannerList = null;
                                }
                                if (benefitsBannerList != null) {
                                    p223od.q qVar14 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar14 != null) {
                                        ViewFlipper viewFlipper = qVar14.f40455Q;
                                        int i10 = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in;
                                        int i11 = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out;
                                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(transferToBankHomeFragment.getContext(), i10);
                                        animationLoadAnimation.setDuration(1000L);
                                        p223od.q qVar15 = (p223od.q) transferToBankHomeFragment.f27335j;
                                        if (qVar15 != null) {
                                            qVar15.f40455Q.setInAnimation(animationLoadAnimation);
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(transferToBankHomeFragment.getContext(), i11);
                                        animationLoadAnimation2.setDuration(1000L);
                                        p223od.q qVar16 = (p223od.q) transferToBankHomeFragment.f27335j;
                                        if (qVar16 != null) {
                                            qVar16.f40455Q.setOutAnimation(animationLoadAnimation2);
                                        }
                                        viewFlipper.stopFlipping();
                                        viewFlipper.removeAllViews();
                                        for (BenefitsBean benefitsBean : benefitsBannerList) {
                                            if (Intrinsics.c(benefitsBean.getShow(), Boolean.TRUE)) {
                                                View viewInflate = LayoutInflater.from(transferToBankHomeFragment.getContext()).inflate(p159kd.f.sm_layout_to_bank_home_view_flipper, (ViewGroup) null);
                                                ((TextView) viewInflate.findViewById(p159kd.e.tvContent)).setText(benefitsBean.getContent());
                                                Integer picWidth = benefitsBean.getPicWidth();
                                                if (picWidth != null) {
                                                    if (picWidth.intValue() <= 0) {
                                                        picWidth = null;
                                                    }
                                                    if (picWidth != null) {
                                                        ((ImageView) viewInflate.findViewById(p159kd.e.ivLeft)).getLayoutParams().width = CommonViewExtKt.getDp(picWidth.intValue());
                                                    }
                                                }
                                                r0.k1((ImageView) viewInflate.findViewById(p159kd.e.ivLeft), benefitsBean.getPic(), benefitsBean.getDarkPic());
                                                String jumpUrl2 = benefitsBean.getJumpUrl();
                                                if (jumpUrl2 != null) {
                                                    if (jumpUrl2.length() <= 0) {
                                                        jumpUrl2 = null;
                                                    }
                                                    if (jumpUrl2 != null) {
                                                        View viewFindViewById = viewInflate.findViewById(p159kd.e.ivRight);
                                                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                                                        p220oa.h.C(viewFindViewById);
                                                        viewInflate.setOnClickListener(new A8.c(19, transferToBankHomeFragment, jumpUrl2));
                                                    }
                                                }
                                                viewFlipper.addView(viewInflate);
                                            }
                                        }
                                        if (viewFlipper.getChildCount() != 0) {
                                            p223od.q qVar17 = (p223od.q) transferToBankHomeFragment.f27335j;
                                            if (qVar17 != null) {
                                                p220oa.h.C(qVar17.f40466j);
                                            }
                                            if (viewFlipper.getChildCount() > 1) {
                                                viewFlipper.startFlipping();
                                            }
                                        } else {
                                            p223od.q qVar18 = (p223od.q) transferToBankHomeFragment.f27335j;
                                            if (qVar18 != null) {
                                                p220oa.h.c(qVar18.f40466j);
                                            }
                                        }
                                    }
                                } else {
                                    qVar = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar != null) {
                                        p220oa.h.c(qVar.f40466j);
                                        Unit unit4 = Unit.f38893a;
                                    }
                                }
                            }
                            p223od.q qVar19 = (p223od.q) transferToBankHomeFragment.f27335j;
                            if (qVar19 != null) {
                                p220oa.h.s(qVar19.t, newData.getTransferSafe() != null);
                            }
                            p223od.q qVar20 = (p223od.q) transferToBankHomeFragment.f27335j;
                            if (qVar20 != null) {
                                TextView textView = qVar20.f40453L;
                                BenefitsBean transferSafe = newData.getTransferSafe();
                                if (transferSafe == null || (string = transferSafe.getContent()) == null) {
                                    string = transferToBankHomeFragment.getString(p159kd.h.sm_transfer_protection_in_progress);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                } else {
                                    if (string.length() <= 0) {
                                        string = null;
                                    }
                                    if (string == null) {
                                        string = transferToBankHomeFragment.getString(p159kd.h.sm_transfer_protection_in_progress);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    }
                                }
                                textView.setText(string);
                            }
                            BenefitsBean transferSafe2 = newData.getTransferSafe();
                            if (transferSafe2 == null || (jumpUrl = transferSafe2.getJumpUrl()) == null) {
                                qVar2 = (p223od.q) transferToBankHomeFragment.f27335j;
                                if (qVar2 != null) {
                                    p220oa.h.c(qVar2.f40467o);
                                }
                                qVar3 = (p223od.q) transferToBankHomeFragment.f27335j;
                                if (qVar3 != null) {
                                    qVar3.t.setOnClickListener(null);
                                    Unit unit5 = Unit.f38893a;
                                }
                            } else {
                                if (jumpUrl.length() <= 0) {
                                    jumpUrl = null;
                                }
                                if (jumpUrl == null) {
                                    qVar2 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar2 != null) {
                                        p220oa.h.c(qVar2.f40467o);
                                    }
                                    qVar3 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar3 != null) {
                                        qVar3.t.setOnClickListener(null);
                                        Unit unit6 = Unit.f38893a;
                                    }
                                } else {
                                    p223od.q qVar21 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar21 != null) {
                                        p220oa.h.C(qVar21.f40467o);
                                    }
                                    p223od.q qVar22 = (p223od.q) transferToBankHomeFragment.f27335j;
                                    if (qVar22 != null) {
                                        qVar22.t.setOnClickListener(new ViewOnClickListenerC0087i(newData, i7, transferToBankHomeFragment, jumpUrl));
                                        unit2 = Unit.f38893a;
                                    } else {
                                        unit2 = null;
                                    }
                                    if (unit2 == null) {
                                        qVar2 = (p223od.q) transferToBankHomeFragment.f27335j;
                                        if (qVar2 != null) {
                                            p220oa.h.c(qVar2.f40467o);
                                        }
                                        qVar3 = (p223od.q) transferToBankHomeFragment.f27335j;
                                        if (qVar3 != null) {
                                            qVar3.t.setOnClickListener(null);
                                            Unit unit7 = Unit.f38893a;
                                        }
                                    }
                                }
                            }
                            RecentlyCompensationBean recentlyCompensation = newData.getRecentlyCompensation();
                            if (recentlyCompensation == null) {
                                c0297a = transferToBankHomeFragment.f33781w;
                                if (c0297a != null) {
                                    view = c0297a.f3328b;
                                    if (view != null) {
                                        p220oa.h.c(view);
                                    }
                                    c0297a.f3336j = null;
                                    Unit unit8 = Unit.f38893a;
                                }
                            } else {
                                if (transferToBankHomeFragment.f33781w == null && (qVar4 = (p223od.q) transferToBankHomeFragment.f27335j) != null) {
                                    transferToBankHomeFragment.f33781w = new C0297a(qVar4.f40469v, new Dg.a(transferToBankHomeFragment, 9));
                                }
                                C0297a c0297a2 = transferToBankHomeFragment.f33781w;
                                if (c0297a2 != null) {
                                    CountDownTimer countDownTimer = c0297a2.f3337k;
                                    if (countDownTimer != null) {
                                        countDownTimer.cancel();
                                    }
                                    c0297a2.f3337k = null;
                                    c0297a2.f3336j = recentlyCompensation;
                                    r0.k1(c0297a2.f3329c, recentlyCompensation.getCompensationIcon(), recentlyCompensation.getDarkCompensationIcon());
                                    Long remainTime2 = recentlyCompensation.getRemainTime();
                                    long jLongValue = 0;
                                    if ((remainTime2 != null ? remainTime2.longValue() : 0L) > 0) {
                                        RecentlyCompensationBean recentlyCompensationBean = c0297a2.f3336j;
                                        if (recentlyCompensationBean != null && (remainTime = recentlyCompensationBean.getRemainTime()) != null) {
                                            jLongValue = remainTime.longValue();
                                        }
                                        c0297a2.f3337k = new Gb.L(c0297a2, jLongValue).start();
                                    } else {
                                        TextView textView2 = c0297a2.f3333g;
                                        if (textView2 != null) {
                                            textView2.setText(recentlyCompensation.getRemainingTimeDesc());
                                        }
                                    }
                                    String darkPointColor = i0.T() ? recentlyCompensation.getDarkPointColor() : recentlyCompensation.getPointColor();
                                    if (darkPointColor != null && CommonViewExtKt.isValidHexColor(darkPointColor) && (view2 = c0297a2.f3335i) != null) {
                                        p220oa.h.n(view2, Color.parseColor(darkPointColor), CommonViewExtKt.getDp(8.0f), null, null, 124);
                                    }
                                    TextView textView3 = c0297a2.f3332f;
                                    if (textView3 != null) {
                                        textView3.setText(recentlyCompensation.getPayeeName());
                                    }
                                    TextView textView4 = c0297a2.f3330d;
                                    if (textView4 != null) {
                                        textView4.setText(recentlyCompensation.getTitle());
                                    }
                                    TextView textView5 = c0297a2.f3331e;
                                    if (textView5 != null) {
                                        textView5.setText(recentlyCompensation.getDesc());
                                    }
                                    String buttonDesc = recentlyCompensation.getButtonDesc();
                                    TextView textView6 = c0297a2.f3334h;
                                    if (buttonDesc != null) {
                                        if (buttonDesc.length() <= 0) {
                                            buttonDesc = null;
                                        }
                                        if (buttonDesc != null) {
                                            if (textView6 != null) {
                                                p220oa.h.C(textView6);
                                            }
                                            if (textView6 != null) {
                                                textView6.setText(buttonDesc);
                                            }
                                        } else if (textView6 != null) {
                                            p220oa.h.c(textView6);
                                        }
                                    } else if (textView6 != null) {
                                        p220oa.h.c(textView6);
                                    }
                                    String jumpUrl3 = recentlyCompensation.getJumpUrl();
                                    if (jumpUrl3 != null) {
                                        if (jumpUrl3.length() <= 0) {
                                            jumpUrl3 = null;
                                        }
                                        if (jumpUrl3 != null && textView6 != null) {
                                            textView6.setOnClickListener(new Gb.T(1, c0297a2, jumpUrl3));
                                        }
                                    }
                                    unit = Unit.f38893a;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    c0297a = transferToBankHomeFragment.f33781w;
                                    if (c0297a != null) {
                                        view = c0297a.f3328b;
                                        if (view != null) {
                                            p220oa.h.c(view);
                                        }
                                        c0297a.f3336j = null;
                                        Unit unit9 = Unit.f38893a;
                                    }
                                }
                            }
                            p223od.q qVar23 = (p223od.q) transferToBankHomeFragment.f27335j;
                            if (qVar23 != null) {
                                qVar23.f40451C.a(newData.getBannerEntranceList(), new Ba.a(transferToBankHomeFragment, i7));
                            }
                            TransferTrackingUtils transferTrackingUtils = TransferTrackingUtils.INSTANCE;
                            List<BannerEntranceBean> bannerEntranceList = newData.getBannerEntranceList();
                            if (bannerEntranceList == null) {
                                bannerEntranceList = kotlin.collections.z.f38935a;
                            }
                            transferTrackingUtils.logGridShow(TransferTrackingUtils.PAGE_TYPE_TO_BANK, bannerEntranceList);
                            RecentlyScheduleTransferBean recentlyScheduleTransfer = newData.getRecentlyScheduleTransfer();
                            if (recentlyScheduleTransfer != null) {
                                transferToBankHomeFragment.v(recentlyScheduleTransfer);
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
                    transferToBankHomeFragment.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    transferToBankHomeFragment.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    C0525w c0525wF = C0525w.f();
                    ArrayList arrayList = (ArrayList) commonBeanResult2.data;
                    if (arrayList != null) {
                        obj2 = str;
                        obj2 = arrayList;
                    }
                    obj2 = str;
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(obj2));
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    transferToBankHomeFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToBankHomeFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                }
                return Unit.f38893a;
        }
    }
}

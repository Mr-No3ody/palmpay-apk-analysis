package p282s9;

import Pa.C0525w;
import Pd.c;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.gson.Gson;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRaceScheduleView;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.teller.bean.resp.BettingInfoConfigData;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p140j8.f;
import p220oa.h;
import p355xf.l;
import x9.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42085b;

    public /* synthetic */ j(BettingHomeActivity bettingHomeActivity, int i7) {
        this.f42084a = i7;
        this.f42085b = bettingHomeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView;
        BettingHomeActivity bettingHomeActivity = this.f42085b;
        switch (this.f42084a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            BettingInfoConfigData bettingInfoConfigData = (BettingInfoConfigData) commonBeanResult.data;
                            if (bettingInfoConfigData != null) {
                                Integer competitionSwitch = bettingInfoConfigData.getCompetitionSwitch();
                                if (competitionSwitch != null && competitionSwitch.intValue() == 1) {
                                    KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                                    BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
                                    if (bettingDepositViewModel != null) {
                                        f.s(bettingDepositViewModel, new n(1, null), bettingDepositViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                }
                                String disclaimer = bettingInfoConfigData.getDisclaimer();
                                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                                if (disclaimer != null && disclaimer.length() != 0) {
                                    if (bettingHomeActivity.f26667M != null) {
                                        textView = bettingHomeActivity.f26667M;
                                        if (textView != null) {
                                            textView.setText(disclaimer);
                                            h.s(textView, true);
                                        }
                                    } else {
                                        ViewStub viewStub = bettingHomeActivity.f26666L;
                                        if ((viewStub != null ? viewStub.getParent() : null) != null) {
                                            try {
                                                ViewStub viewStub2 = bettingHomeActivity.f26666L;
                                                View viewInflate = viewStub2 != null ? viewStub2.inflate() : null;
                                                bettingHomeActivity.f26667M = viewInflate != null ? (TextView) viewInflate.findViewById(c.tvDisclaimer) : null;
                                                bettingHomeActivity.f26666L = null;
                                                textView = bettingHomeActivity.f26667M;
                                                if (textView != null) {
                                                    textView.setText(disclaimer);
                                                    h.s(textView, true);
                                                }
                                            } catch (Exception e10) {
                                                e10.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                modelBettingRootView.setCustomerId((String) commonBeanResult2.data);
                            }
                        } else {
                            ToastUtils.showLong(commonBeanResult2.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult3.isSuccess()) {
                            ModelBettingRaceScheduleView modelBettingRaceScheduleView = bettingHomeActivity.f26685w;
                            if (modelBettingRaceScheduleView != null) {
                                modelBettingRaceScheduleView.b(commonBeanResult3);
                            }
                        } else {
                            ModelBettingRaceScheduleView modelBettingRaceScheduleView2 = bettingHomeActivity.f26685w;
                            if (modelBettingRaceScheduleView2 != null) {
                                h.s(modelBettingRaceScheduleView2, false);
                            }
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    bettingHomeActivity.showLoadingDialog(true, true);
                } else {
                    if (it4 instanceof p) {
                        bettingHomeActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((p) it4).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult4.data;
                        d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it4 instanceof m) {
                        bettingHomeActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new l();
                        }
                        bettingHomeActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                        d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
            default:
                BettingQuickILotHomeBean data = (BettingQuickILotHomeBean) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                if (modelQuickBettingView != null) {
                    modelQuickBettingView.i(data);
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ j(BettingHomeActivity bettingHomeActivity, BettingHomeActivity bettingHomeActivity2, int i7) {
        this.f42084a = i7;
        this.f42085b = bettingHomeActivity2;
    }
}

package p207ne;

import Ac.b;
import Ac.h;
import Bc.C0106c;
import Bc.j;
import P8.a;
import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRspV2;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.main.export.bean.rsp.MinorAccountBean;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountResultActivity;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MinorAccountDetailActivity f39941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MinorAccountDetailActivity f39942c;

    public /* synthetic */ d(MinorAccountDetailActivity minorAccountDetailActivity, MinorAccountDetailActivity minorAccountDetailActivity2, int i7) {
        this.f39940a = i7;
        this.f39941b = minorAccountDetailActivity;
        this.f39942c = minorAccountDetailActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MinorAccountBean minorAccountBean;
        String str;
        MinorAccountDetailActivity minorAccountDetailActivity = this.f39942c;
        MinorAccountDetailActivity minorAccountDetailActivity2 = this.f39941b;
        int i7 = 0;
        int i10 = 1;
        switch (this.f39940a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    j jVar = minorAccountDetailActivity.f34762e;
                    if (jVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((VerticalSwipeRefreshLayout) jVar.f743o).setRefreshing(false);
                    if (commonBeanResult.isSuccess() && (minorAccountBean = (MinorAccountBean) commonBeanResult.data) != null) {
                        j jVar2 = minorAccountDetailActivity.f34762e;
                        if (jVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        C0106c c0106c = (C0106c) jVar2.f737d;
                        ImageView imageView = (ImageView) c0106c.f670c;
                        imageView.setVisibility(0);
                        r0.m1(minorAccountBean.teenMemberHeadPoint, imageView);
                        ((TextView) c0106c.f674g).setText(minorAccountBean.teenMemberFullName);
                        c0106c.f669b.setText(minorAccountBean.teenPhone);
                        TextView textView = (TextView) c0106c.f676j;
                        textView.setVisibility(0);
                        ((IconicsTextView) c0106c.t).setVisibility(8);
                        textView.setText(minorAccountDetailActivity.getString(h.main_valid_until_remark, TimeUtils.millis2String(minorAccountBean.expireTime, new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH))));
                        textView.setTextColor(minorAccountDetailActivity.getResources().getColor(b.main_color_858a8f));
                        ((Group) c0106c.f671d).setVisibility(8);
                        j jVar3 = minorAccountDetailActivity.f34762e;
                        if (jVar3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        ((Group) jVar3.f742j).setVisibility(minorAccountBean.showSwitch ? 0 : 8);
                        j jVar4 = minorAccountDetailActivity.f34762e;
                        if (jVar4 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        ((IconicsTextView) jVar4.f746w).setOnClickListener(new e(minorAccountDetailActivity, i7));
                        j jVar5 = minorAccountDetailActivity.f34762e;
                        if (jVar5 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        ((IconicsTextView) jVar5.f732B).setOnClickListener(new e(minorAccountDetailActivity, i10));
                        j jVar6 = minorAccountDetailActivity.f34762e;
                        if (jVar6 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        ((IconicsTextView) jVar6.f745v).setOnClickListener(new e(minorAccountDetailActivity, 2));
                    }
                } else if (it instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    ((n) it).getClass();
                    j jVar7 = minorAccountDetailActivity.f34762e;
                    if (jVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((VerticalSwipeRefreshLayout) jVar7.f743o).setRefreshing(false);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    TransHistoryRspV2 transHistoryRspV2 = (TransHistoryRspV2) ((p) it2).f27360a;
                    if (transHistoryRspV2.isSuccess()) {
                        TransHistoryRspV2.DataBean dataBean = transHistoryRspV2.data;
                        List<TransHistoryItemBean> list = dataBean != null ? dataBean.list : null;
                        if (list == null || list.isEmpty()) {
                            j jVar8 = minorAccountDetailActivity.f34762e;
                            if (jVar8 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((EmptyView) jVar8.f741i).setVisibility(0);
                            j jVar9 = minorAccountDetailActivity.f34762e;
                            if (jVar9 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            ((TextView) jVar9.f733C).setVisibility(8);
                        } else {
                            a aVar = minorAccountDetailActivity.f34763f;
                            if (aVar == null) {
                                Intrinsics.n("mCashBoxTransactionAdapter");
                                throw null;
                            }
                            aVar.setList(transHistoryRspV2.data.list);
                        }
                    }
                } else if (it2 instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    ((n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    CommonBooleanResult commonBooleanResult = (CommonBooleanResult) ((p) it3).f27360a;
                    if (commonBooleanResult.isSuccess()) {
                        String string = minorAccountDetailActivity.getString(h.main_revoke_success);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        MinorAccountResultActivity.f34771f.startAct(minorAccountDetailActivity, 0, string, "");
                    } else if (!TextUtils.isEmpty(commonBooleanResult.getRespMsg())) {
                        p220oa.h.x(minorAccountDetailActivity, commonBooleanResult.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    String str2 = ((n) it3).f27358a;
                    if (!TextUtils.isEmpty(str2)) {
                        p220oa.h.x(minorAccountDetailActivity, str2);
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    CommonStringResult commonStringResult = (CommonStringResult) ((p) it4).f27360a;
                    if (commonStringResult.isSuccess()) {
                        String str3 = commonStringResult.data;
                        if (str3 != null) {
                            str = str3.length() > 0 ? str3 : null;
                            if (str != null) {
                                int i11 = MinorAccountDetailActivity.f34759g;
                                minorAccountDetailActivity.n(1, str);
                            }
                        }
                    } else if (!TextUtils.isEmpty(commonStringResult.getRespMsg())) {
                        p220oa.h.x(minorAccountDetailActivity, commonStringResult.getRespMsg());
                    }
                } else if (it4 instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    String str4 = ((n) it4).f27358a;
                    if (!TextUtils.isEmpty(str4)) {
                        p220oa.h.x(minorAccountDetailActivity, str4);
                    }
                }
                return Unit.f38893a;
            case 4:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5 instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it5 instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    CommonStringResult commonStringResult2 = (CommonStringResult) ((p) it5).f27360a;
                    if (commonStringResult2.isSuccess()) {
                        String str5 = commonStringResult2.data;
                        if (str5 != null) {
                            str = str5.length() > 0 ? str5 : null;
                            if (str != null) {
                                int i12 = MinorAccountDetailActivity.f34759g;
                                minorAccountDetailActivity.n(0, str);
                            }
                        }
                    } else if (!TextUtils.isEmpty(commonStringResult2.getRespMsg())) {
                        p220oa.h.x(minorAccountDetailActivity, commonStringResult2.getRespMsg());
                    }
                } else if (it5 instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it5 instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    String str6 = ((n) it5).f27358a;
                    if (!TextUtils.isEmpty(str6)) {
                        p220oa.h.x(minorAccountDetailActivity, str6);
                    }
                }
                return Unit.f38893a;
            default:
                q it6 = (q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (it6 instanceof o) {
                    minorAccountDetailActivity2.showLoadingDialog(true, true);
                } else if (it6 instanceof p) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it6).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        int i13 = h.main_valid_until_remark;
                        T data = commonBeanResult2.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        String string2 = minorAccountDetailActivity.getString(i13, TimeUtils.millis2String(((Number) data).longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = minorAccountDetailActivity.getString(h.main_extend_success);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        MinorAccountResultActivity.f34771f.startAct(minorAccountDetailActivity, 1, string3, string2);
                    } else if (!TextUtils.isEmpty(commonBeanResult2.getRespMsg())) {
                        p220oa.h.x(minorAccountDetailActivity, commonBeanResult2.getRespMsg());
                    }
                } else if (it6 instanceof m) {
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it6 instanceof n)) {
                        throw new l();
                    }
                    minorAccountDetailActivity2.showLoadingDialog(false, true);
                    String str7 = ((n) it6).f27358a;
                    if (!TextUtils.isEmpty(str7)) {
                        p220oa.h.x(minorAccountDetailActivity, str7);
                    }
                }
                return Unit.f38893a;
        }
    }
}

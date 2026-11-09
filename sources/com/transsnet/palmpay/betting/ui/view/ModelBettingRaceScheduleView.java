package com.transsnet.palmpay.betting.ui.view;

import Bc.p;
import M1.j;
import Pa.F;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Xd.x;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BettingMatchDetailBean;
import com.transsnet.palmpay.teller.bean.resp.BettingRaceScheduleData;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p270rd.C1976t;
import p355xf.C2131j;
import p355xf.t;
import t9.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelBettingRaceScheduleView;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lt9/f;", "d", "Lkotlin/Lazy;", "getMAdapter", "()Lt9/f;", "mAdapter", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelBettingRaceScheduleView extends BaseLinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26738e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f26739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26740d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRaceScheduleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ModelBettingRaceScheduleView modelBettingRaceScheduleView, CommonBeanResult commonBeanResult, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        BettingMatchDetailBean bettingMatchDetailBean = (BettingMatchDetailBean) modelBettingRaceScheduleView.getMAdapter().getItem(i7);
        if (r0.U0()) {
            return;
        }
        if (view.getId() == c.raceContentLayout && !TextUtils.isEmpty(bettingMatchDetailBean.getAndroidLink())) {
            ActivityUtils.startActivity(F.a(modelBettingRaceScheduleView.getContext(), bettingMatchDetailBean.getAndroidLink()));
        } else if (view.getId() == c.tvMore) {
            BettingRaceScheduleData bettingRaceScheduleData = (BettingRaceScheduleData) commonBeanResult.data;
            if (!TextUtils.isEmpty(bettingRaceScheduleData != null ? bettingRaceScheduleData.getAndroidLink() : null)) {
                Context context = modelBettingRaceScheduleView.getContext();
                BettingRaceScheduleData bettingRaceScheduleData2 = (BettingRaceScheduleData) commonBeanResult.data;
                ActivityUtils.startActivity(F.a(context, bettingRaceScheduleData2 != null ? bettingRaceScheduleData2.getAndroidLink() : null));
            }
        }
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_RaceSchedule_Click");
        String matchName = bettingMatchDetailBean.getMatchName();
        if (matchName == null) {
            matchName = "";
        }
        n0VarG.k(clickEvent.add("element_name", matchName));
    }

    private final f getMAdapter() {
        return (f) this.f26740d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(CommonBeanResult resp) {
        List<BettingMatchDetailBean> matchDetailV2s;
        List<BettingMatchDetailBean> matchDetailV2s2;
        Intrinsics.checkNotNullParameter(resp, "resp");
        BettingRaceScheduleData bettingRaceScheduleData = (BettingRaceScheduleData) resp.data;
        if (((bettingRaceScheduleData == null || (matchDetailV2s2 = bettingRaceScheduleData.getMatchDetailV2s()) == null) ? 0 : matchDetailV2s2.size()) > 0) {
            h.s(this, true);
            f mAdapter = getMAdapter();
            BettingRaceScheduleData bettingRaceScheduleData2 = (BettingRaceScheduleData) resp.data;
            mAdapter.f42361a = !TextUtils.isEmpty(bettingRaceScheduleData2 != null ? bettingRaceScheduleData2.getAndroidLink() : null);
            f mAdapter2 = getMAdapter();
            BettingRaceScheduleData bettingRaceScheduleData3 = (BettingRaceScheduleData) resp.data;
            mAdapter2.setList(bettingRaceScheduleData3 != null ? bettingRaceScheduleData3.getMatchDetailV2s() : null);
            getMAdapter().setOnItemChildClickListener(new b(15, this, resp));
            BettingRaceScheduleData bettingRaceScheduleData4 = (BettingRaceScheduleData) resp.data;
            int size = (bettingRaceScheduleData4 == null || (matchDetailV2s = bettingRaceScheduleData4.getMatchDetailV2s()) == null) ? 0 : matchDetailV2s.size();
            p pVar = this.f26739c;
            if (size > 1) {
                x xVar = new x(size);
                if (pVar != null) {
                    ((RecyclerView) pVar.f812c).setAdapter(xVar);
                }
                C1548f c1548f = new C1548f(getContext().getColor(com.transsnet.palmpay.custom_view.p.transparent), CommonViewExtKt.getDp(1), CommonViewExtKt.getDp(2), CommonViewExtKt.getDp(2));
                c1548f.f31336e = false;
                if (pVar != null) {
                    ((RecyclerView) pVar.f812c).addItemDecoration(c1548f);
                }
                if (pVar != null) {
                    ((RecyclerView) pVar.f813d).addOnScrollListener(new p338w9.a(xVar));
                }
            } else if (pVar != null) {
                h.s((RecyclerView) pVar.f812c, false);
            }
            n0.g().v("PPay_Betting_Btn_RaceSchedule");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRaceScheduleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBettingRaceScheduleView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBettingRaceScheduleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26740d = C2131j.b(new C1976t(23));
        View viewInflate = View.inflate(context, d.qt_layout_betting_race_schedule, this);
        int i10 = c.indicatorRv;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
        if (recyclerView != null) {
            i10 = c.qlbrsRecyclerView;
            RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i10, viewInflate);
            if (recyclerView2 != null) {
                this.f26739c = new p((LinearLayout) viewInflate, recyclerView, recyclerView2, 14);
                setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(115)));
                recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
                recyclerView2.setAdapter(getMAdapter());
                new PagerSnapHelper().attachToRecyclerView(recyclerView2);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                h.s(this, false);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}

package Ie;

import Ad.V;
import N8.q0;
import Pa.r0;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModul;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModuleResp;
import face.security.device.api.FaceSecCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f4330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f4331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f4332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f4335j;

    public e(LinearLayout linearLayout) {
        this.f4326a = linearLayout;
        p355xf.t tVarB = C2131j.b(new G9.j(18));
        this.f4332g = tVarB;
        this.f4334i = new ArrayList();
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, linearLayout != null ? linearLayout.getContext() : null), 1);
        View viewInflate = LayoutInflater.from(linearLayout != null ? linearLayout.getContext() : null).inflate(Ac.f.main_saving_mutual_fund_layout, (ViewGroup) null);
        this.f4327b = viewInflate;
        if (viewInflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(Ac.e.ctl_title);
            this.f4328c = (TextView) viewInflate.findViewById(Ac.e.tvTitle);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Ac.e.rl_stock);
            this.f4330e = (LinearLayout) viewInflate.findViewById(Ac.e.llRank);
            this.f4331f = (LinearLayout) viewInflate.findViewById(Ac.e.llRecommend);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new Ha.d(this, 9));
            }
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
            }
            if (recyclerView != null) {
                recyclerView.addItemDecoration(c1548f);
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((p385ze.e) tVarB.getValue());
            }
            viewInflate.setVisibility(8);
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
            LinearLayout linearLayout2 = new LinearLayout(linearLayout != null ? linearLayout.getContext() : null);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(12)));
            if (linearLayout != null) {
                linearLayout.addView(linearLayout2);
            }
            ((p385ze.e) tVarB.getValue()).setOnItemClickListener(new B8.d(5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void a(QueryRankFundModuleResp queryRankFundModuleResp) {
        ?? r10;
        ViewGroup viewGroup;
        TextView textView;
        Context context;
        Resources resources;
        TextView textView2;
        TextView textView3;
        List<QueryRankFundModul> list = queryRankFundModuleResp.rankingListTypeList;
        this.f4335j = list;
        ArrayList arrayList = this.f4334i;
        arrayList.clear();
        ?? r11 = this.f4330e;
        if (r11 != 0) {
            r11.removeAllViews();
        }
        ViewGroup viewGroup2 = null;
        int i7 = 0;
        if (list != null) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C1850q.k();
                    throw null;
                }
                String str = ((QueryRankFundModul) obj).name;
                if (str != null) {
                    LinearLayout linearLayout = this.f4326a;
                    TextView textView4 = new TextView(linearLayout != null ? linearLayout.getContext() : null);
                    textView4.setText(str);
                    textView4.setTextColor(textView4.getResources().getColor(Ac.b.main_saving_fund_tab_text_selector));
                    textView4.setTextSize(12.0f);
                    textView4.setGravity(17);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(CommonViewExtKt.getDp(8.0f));
                    textView4.setLayoutParams(layoutParams);
                    int dp = CommonViewExtKt.getDp(4.0f);
                    int dp2 = CommonViewExtKt.getDp(12.0f);
                    textView4.setPadding(dp2, dp, dp2, dp);
                    textView4.setOnClickListener(new V(this, i10, 2));
                    arrayList.add(textView4);
                    if (r11 != 0) {
                        r11.addView(textView4);
                    }
                }
                i10 = i11;
            }
        }
        b(this.f4333h);
        List<QueryFundModuleResp> list2 = queryRankFundModuleResp.recommendedFundInfoList;
        LinearLayout linearLayout2 = this.f4331f;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                for (Object obj2 : list2) {
                    int i12 = i7 + 1;
                    if (i7 < 0) {
                        ?? r16 = viewGroup2;
                        C1850q.k();
                        throw r16;
                    }
                    QueryFundModuleResp queryFundModuleResp = (QueryFundModuleResp) obj2;
                    View view = this.f4327b;
                    View viewInflate = LayoutInflater.from(view != null ? view.getContext() : viewGroup2).inflate(Ac.f.main_item_saving_recommend_fund, viewGroup2);
                    if (viewInflate != null) {
                        textView3 = (TextView) viewInflate.findViewById(Ac.e.tvChangePercent);
                    } else {
                        r10 = viewGroup2;
                    }
                    if (viewInflate != null) {
                        r10 = textView3;
                        viewInflate.setOnClickListener(new Ha.d(queryFundModuleResp, 8));
                    }
                    if (viewInflate != null && (textView2 = (TextView) viewInflate.findViewById(Ac.e.tvTitle)) != null) {
                        textView2.setText(queryFundModuleResp.fundName);
                    }
                    Double d2 = queryFundModuleResp.returnRate;
                    if (d2 != null) {
                        double dDoubleValue = d2.doubleValue();
                        String strN = com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) Nf.b.a(Math.abs(dDoubleValue) * ((double) FaceSecCode.SC_SUCCESS))) / 100.0d)}, 1, "%.2f", "format(...)");
                        viewGroup = viewGroup2;
                        String strK = dDoubleValue < 0.0d ? q0.k("-", strN, "%") : dDoubleValue > 0.0d ? q0.k("+", strN, "%") : strN.concat("%");
                        if (r10 != 0) {
                            r10.setText(strK);
                        }
                        if (view != null && (context = view.getContext()) != null && (resources = context.getResources()) != null && r10 != 0) {
                            Double d10 = queryFundModuleResp.returnRate;
                            Intrinsics.e(d10);
                            r10.setTextColor(resources.getColor(d10.doubleValue() < 0.0d ? L6.b.ppColorError : L6.b.ppColorSuccess));
                        }
                    } else {
                        viewGroup = viewGroup2;
                    }
                    r0.R1(r10, "fonts/PalmPayNum-Bold.ttf");
                    if (viewInflate != null && (textView = (TextView) viewInflate.findViewById(Ac.e.tvRemark)) != null) {
                        textView.setText(queryFundModuleResp.returnType);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.addView(viewInflate);
                    }
                    i7 = i12;
                    viewGroup2 = viewGroup;
                }
            }
        }
        View view2 = this.f4327b;
        if (view2 != null) {
            p220oa.h.s(view2, true);
        }
    }

    public final void b(int i7) {
        QueryRankFundModul queryRankFundModul;
        List<QueryFundModuleResp> list;
        Context context;
        this.f4333h = i7;
        View view = this.f4327b;
        if (view != null && (context = view.getContext()) != null) {
            int i10 = 0;
            for (Object obj : this.f4334i) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C1850q.k();
                    throw null;
                }
                TextView textView = (TextView) obj;
                textView.setSelected(i10 == i7);
                textView.setBackground(context.getDrawable(i10 != i7 ? com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_16_bg_dark : com.transsnet.palmpay.custom_view.r.cv_rect_corner_16_bg_second_stroke_primary));
                textView.setTextColor(context.getColor(i10 != i7 ? L6.b.ppColorTextPrimary : L6.b.ppColorPrimary));
                i10 = i11;
            }
        }
        List list2 = this.f4335j;
        if (list2 == null || (queryRankFundModul = (QueryRankFundModul) list2.get(this.f4333h)) == null || (list = queryRankFundModul.fundInfoList) == null) {
            return;
        }
        ((p385ze.e) this.f4332g.getValue()).setList(list);
    }
}

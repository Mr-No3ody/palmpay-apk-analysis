package Ce;

import Ad.C0058e;
import Pe.C0549v;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.main.export.bean.rsp.AccountData;
import com.transsnet.palmpay.main.export.bean.rsp.FinanceSavingsV1HomeResp;
import com.transsnet.palmpay.main.export.bean.rsp.HotProductBean;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHotProductModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModul;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QuerySavingTaskModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModul;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.RecommendProduct;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeSavingsUserV2Fragment f1463b;

    public /* synthetic */ a0(HomeSavingsUserV2Fragment homeSavingsUserV2Fragment, int i7) {
        this.f1462a = i7;
        this.f1463b = homeSavingsUserV2Fragment;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0174  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ff A[PHI: r13
      0x01ff: PHI (r13v106 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v103 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v105 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v115 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:167:0x021f, B:162:0x020d, B:157:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:193:0x0270 A[PHI: r13
      0x0270: PHI (r13v89 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v86 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v88 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v95 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:202:0x0290, B:197:0x027e, B:192:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x02db  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ee A[PHI: r13
      0x02ee: PHI (r13v64 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v61 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v63 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v71 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:244:0x030e, B:239:0x02fc, B:234:0x02ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x036a A[PHI: r13
      0x036a: PHI (r13v45 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v42 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v44 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v54 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:283:0x038a, B:278:0x0378, B:273:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[PHI: r13
      0x0067: PHI (r13v149 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v146 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v148 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v158 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:39:0x0087, B:34:0x0075, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:316:0x03e8 A[PHI: r13
      0x03e8: PHI (r13v26 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v23 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v25 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v35 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:325:0x0408, B:320:0x03f6, B:315:0x03e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:521:0x076d A[PHI: r13
      0x076d: PHI (r13v9 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v6 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v8 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v15 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:530:0x078d, B:525:0x077b, B:520:0x076b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9 A[PHI: r13
      0x00d9: PHI (r13v132 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r13v129 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v131 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r13v138 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:74:0x00f9, B:69:0x00e7, B:64:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX;
        p385ze.b bVar;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX2;
        View view;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX3;
        View view2;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX4;
        Ie.e eVar;
        View view3;
        List<QueryFundModuleResp> list;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX5;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX6;
        Ie.d dVar;
        View view4;
        List<HotProductBean> list2;
        View view5;
        Context context;
        List<Object> data;
        Unit unit;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX7;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX8;
        View view6;
        QueryTargetSavingsModuleResp queryTargetSavingsModuleResp;
        int i7 = 6;
        data = null;
        List<QueryTargetSavingsModul> data2 = null;
        HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1463b;
        switch (this.f1462a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        FinanceSavingsV1HomeResp financeSavingsV1HomeResp = commonBeanResult != null ? (FinanceSavingsV1HomeResp) commonBeanResult.data : null;
                        homeSavingsUserV2Fragment.f35175s0 = financeSavingsV1HomeResp;
                        if (financeSavingsV1HomeResp != null) {
                            String str = financeSavingsV1HomeResp.totalYesterdayEarnings;
                            if (str != null) {
                                TextView textViewY = homeSavingsUserV2Fragment.y();
                                if (textViewY != null) {
                                    textViewY.setTextSize(StringsKt.E(str, "update", 0, false, 6) > -1 ? 16.0f : 20.0f);
                                }
                                if (StringsKt.E(str, "update", 0, false, 6) > -1) {
                                    TextView textViewY2 = homeSavingsUserV2Fragment.y();
                                    if (textViewY2 != null) {
                                        textViewY2.setTypeface(Typeface.create("sans-serif", 1));
                                    }
                                } else {
                                    Pa.r0.R1(homeSavingsUserV2Fragment.y(), "fonts/PalmPayNum-Bold.ttf");
                                }
                            }
                            TextView textView = (TextView) homeSavingsUserV2Fragment.f35164H.getValue();
                            if (textView != null) {
                                textView.setText(Pa.r0.B(financeSavingsV1HomeResp.totalAsserts, true));
                            }
                            TextView textViewY3 = homeSavingsUserV2Fragment.y();
                            if (textViewY3 != null) {
                                textViewY3.setText(financeSavingsV1HomeResp.totalYesterdayEarnings);
                            }
                            List<AccountData> list3 = financeSavingsV1HomeResp.accountList;
                            if (list3 != null && !list3.isEmpty() && (bVar = homeSavingsUserV2Fragment.f35177u0) != null) {
                                bVar.f44692b = financeSavingsV1HomeResp.accountList;
                                bVar.notifyDataSetChanged();
                            }
                            List<ProductData> list4 = financeSavingsV1HomeResp.productList;
                            p355xf.t tVar = homeSavingsUserV2Fragment.f35163E0;
                            if (list4 == null || list4.isEmpty()) {
                                RecyclerView recyclerView = (RecyclerView) homeSavingsUserV2Fragment.f35171k0.getValue();
                                if (recyclerView != null) {
                                    recyclerView.setVisibility(8);
                                }
                                ArrayList arrayList = (ArrayList) tVar.getValue();
                                if (arrayList != null) {
                                    arrayList.clear();
                                }
                            } else {
                                ArrayList arrayList2 = (ArrayList) tVar.getValue();
                                if (arrayList2 != null) {
                                    arrayList2.clear();
                                }
                                ArrayList arrayList3 = (ArrayList) tVar.getValue();
                                if (arrayList3 != null) {
                                    List<ProductData> list5 = financeSavingsV1HomeResp.productList;
                                    Intrinsics.e(list5);
                                    arrayList3.addAll(list5);
                                }
                            }
                            p385ze.h hVar = homeSavingsUserV2Fragment.f35176t0;
                            if (hVar != null) {
                                hVar.f4985b = (ArrayList) tVar.getValue();
                            }
                            p385ze.h hVar2 = homeSavingsUserV2Fragment.f35176t0;
                            if (hVar2 != null) {
                                hVar2.notifyDataSetChanged();
                            }
                            List<ProductData> list6 = financeSavingsV1HomeResp.productList;
                            if (list6 != null && !list6.isEmpty()) {
                                List<ProductData> list7 = financeSavingsV1HomeResp.productList;
                                Intrinsics.e(list7);
                                int size = list7.size();
                                p355xf.t tVar2 = homeSavingsUserV2Fragment.f35170Z;
                                if (size > 8) {
                                    LinearLayout linearLayout = (LinearLayout) tVar2.getValue();
                                    if (linearLayout != null) {
                                        p220oa.h.s(linearLayout, true);
                                    }
                                    LinearLayout linearLayout2 = (LinearLayout) tVar2.getValue();
                                    if (homeSavingsUserV2Fragment.f35179v0 == null) {
                                        homeSavingsUserV2Fragment.f35179v0 = new ArrayList();
                                    }
                                    ArrayList arrayList4 = homeSavingsUserV2Fragment.f35179v0;
                                    if (arrayList4 != null) {
                                        arrayList4.clear();
                                    }
                                    if (linearLayout2 != null) {
                                        linearLayout2.removeAllViews();
                                    }
                                    int iDp2px = SizeUtils.dp2px(1.0f);
                                    int i10 = 0;
                                    while (i10 < 2) {
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                        layoutParams.setMargins(iDp2px, 0, iDp2px, 0);
                                        ImageView imageView = new ImageView(homeSavingsUserV2Fragment.requireContext());
                                        imageView.setLayoutParams(layoutParams);
                                        imageView.setImageResource(Ac.d.main_indicator_dot_1);
                                        imageView.setAdjustViewBounds(true);
                                        imageView.setSelected(i10 == 0);
                                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                        F6.d.h(homeSavingsUserV2Fragment.f27317a, 3, "initIndicator: " + Thread.currentThread().getName() + " " + (linearLayout2 != null ? Integer.valueOf(linearLayout2.getChildCount()) : null));
                                        if (linearLayout2 != null) {
                                            linearLayout2.addView(imageView);
                                        }
                                        ArrayList arrayList5 = homeSavingsUserV2Fragment.f35179v0;
                                        if (arrayList5 != null) {
                                            arrayList5.add(imageView);
                                        }
                                        i10++;
                                    }
                                } else {
                                    LinearLayout linearLayout3 = (LinearLayout) tVar2.getValue();
                                    if (linearLayout3 != null) {
                                        linearLayout3.removeAllViews();
                                    }
                                    homeSavingsUserV2Fragment.f35179v0 = null;
                                    LinearLayout linearLayout4 = (LinearLayout) tVar2.getValue();
                                    if (linearLayout4 != null) {
                                        p220oa.h.s(linearLayout4, false);
                                    }
                                }
                            }
                            List<RecommendProduct> list8 = financeSavingsV1HomeResp.recommendList;
                            if (list8 == null || list8.isEmpty()) {
                                LinearLayout linearLayoutW = homeSavingsUserV2Fragment.w();
                                if (linearLayoutW != null) {
                                    linearLayoutW.removeAllViews();
                                }
                            } else {
                                List<RecommendProduct> list9 = financeSavingsV1HomeResp.recommendList;
                                if (list9 != null) {
                                    int i11 = 0;
                                    for (Object obj2 : list9) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            C1850q.k();
                                            throw null;
                                        }
                                        RecommendProduct recommendProduct = (RecommendProduct) obj2;
                                        String str2 = recommendProduct.productName;
                                        if (Intrinsics.c(str2, HomeSavingsUserV2Fragment.f35150G0)) {
                                            Pa.n0.g().v("FinanceTab_FixedSavings_View");
                                            if (homeSavingsUserV2Fragment.f35182x0 == null) {
                                                homeSavingsUserV2Fragment.f35182x0 = new Ie.d(homeSavingsUserV2Fragment.w());
                                            }
                                            Ie.d dVar2 = homeSavingsUserV2Fragment.f35182x0;
                                            if (dVar2 != null) {
                                                dVar2.a(recommendProduct.title, recommendProduct.desc, recommendProduct.androidIndexUrl, true);
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
                                            homeSavingsViewModel.getClass();
                                            p140j8.f.s(homeSavingsViewModel, new C0549v(1, null), homeSavingsViewModel.f35369j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, HomeSavingsUserV2Fragment.f35151H0)) {
                                            Pa.n0.g().v("FinanceTab_Insurance_View");
                                            if (homeSavingsUserV2Fragment.f35181w0 == null) {
                                                homeSavingsUserV2Fragment.f35181w0 = new Ie.o(homeSavingsUserV2Fragment.w());
                                            }
                                            Ie.o oVar = homeSavingsUserV2Fragment.f35181w0;
                                            if (oVar != null) {
                                                String str3 = recommendProduct.title;
                                                String str4 = recommendProduct.desc;
                                                TextView textView2 = oVar.f4385b;
                                                if (textView2 != null) {
                                                    textView2.setText(str3);
                                                }
                                                TextView textView3 = oVar.f4386c;
                                                if (textView3 != null) {
                                                    textView3.setText(str4);
                                                }
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel2 = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
                                            homeSavingsViewModel2.getClass();
                                            p140j8.f.s(homeSavingsViewModel2, new Pe.E(1, null), homeSavingsViewModel2.f35366f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, HomeSavingsUserV2Fragment.f35153J0)) {
                                            if (homeSavingsUserV2Fragment.f35157A0 == null) {
                                                homeSavingsUserV2Fragment.f35157A0 = new Ie.v(homeSavingsUserV2Fragment.w());
                                            }
                                            Ie.v vVar = homeSavingsUserV2Fragment.f35157A0;
                                            if (vVar != null) {
                                                String str5 = recommendProduct.title;
                                                String str6 = recommendProduct.desc;
                                                String str7 = recommendProduct.androidIndexUrl;
                                                TextView textView4 = vVar.f4406b;
                                                if (textView4 != null) {
                                                    textView4.setText(str5);
                                                }
                                                TextView textView5 = vVar.f4407c;
                                                if (textView5 != null) {
                                                    textView5.setText(str6);
                                                }
                                                vVar.f4408d = str7;
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel3 = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
                                            homeSavingsViewModel3.getClass();
                                            p140j8.f.s(homeSavingsViewModel3, new Pe.D(1, null), homeSavingsViewModel3.f35367g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, HomeSavingsUserV2Fragment.f35154K0)) {
                                            Pa.n0.g().v("FinanceTab_MutualFunds_View");
                                            if (homeSavingsUserV2Fragment.f35159B0 == null) {
                                                homeSavingsUserV2Fragment.f35159B0 = new Ie.e(homeSavingsUserV2Fragment.w());
                                            }
                                            Ie.e eVar2 = homeSavingsUserV2Fragment.f35159B0;
                                            if (eVar2 != null) {
                                                String str8 = recommendProduct.title;
                                                String str9 = recommendProduct.androidIndexUrl;
                                                TextView textView6 = eVar2.f4328c;
                                                if (textView6 != null) {
                                                    textView6.setText(str8);
                                                }
                                                eVar2.f4329d = str9;
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel4 = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
                                            homeSavingsViewModel4.getClass();
                                            p140j8.f.s(homeSavingsViewModel4, new Pe.B(1, null), homeSavingsViewModel4.f35372v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, HomeSavingsUserV2Fragment.f35155L0)) {
                                            Pa.n0.g().v("FinanceTab_TargetSavings_View");
                                            if (homeSavingsUserV2Fragment.f35161C0 == null) {
                                                homeSavingsUserV2Fragment.f35161C0 = new Ie.w(homeSavingsUserV2Fragment.w());
                                            }
                                            Ie.w wVar = homeSavingsUserV2Fragment.f35161C0;
                                            if (wVar != null) {
                                                String str10 = recommendProduct.title;
                                                String str11 = recommendProduct.desc;
                                                String str12 = recommendProduct.androidIndexUrl;
                                                TextView textView7 = wVar.f4411b;
                                                if (textView7 != null) {
                                                    textView7.setText(str10);
                                                }
                                                TextView textView8 = wVar.f4412c;
                                                if (textView8 != null) {
                                                    textView8.setText(str11);
                                                }
                                                wVar.f4413d = str12;
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel5 = (HomeSavingsViewModel) homeSavingsUserV2Fragment.f27327p;
                                            homeSavingsViewModel5.getClass();
                                            p140j8.f.s(homeSavingsViewModel5, new Pe.G(1, null), homeSavingsViewModel5.f35373w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                        i11 = i12;
                                    }
                                }
                            }
                            homeSavingsUserV2Fragment.z(financeSavingsV1HomeResp);
                        }
                        verticalSwipeRefreshLayoutX = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX != null) {
                            verticalSwipeRefreshLayoutX.setRefreshing(false);
                        }
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX != null) {
                            verticalSwipeRefreshLayoutX.setRefreshing(false);
                        }
                    } else {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX != null) {
                            verticalSwipeRefreshLayoutX.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        Collection<Object> data3 = commonListResultV2 != null ? commonListResultV2.data : null;
                        HomeSavingsUserV2Fragment.a aVar3 = HomeSavingsUserV2Fragment.f35149F0;
                        Collection<Object> collection = data3;
                        if (collection == null || collection.isEmpty()) {
                            Ie.o oVar2 = homeSavingsUserV2Fragment.f35181w0;
                            if (oVar2 != null && (view = oVar2.f4384a) != null) {
                                p220oa.h.s(view, false);
                            }
                        } else {
                            Ie.o oVar3 = homeSavingsUserV2Fragment.f35181w0;
                            if (oVar3 != null) {
                                Intrinsics.checkNotNullParameter(data3, "data");
                                p385ze.f fVar = (p385ze.f) oVar3.f4387d.getValue();
                                if (fVar != null) {
                                    fVar.setList(collection);
                                }
                                View view7 = oVar3.f4384a;
                                if (view7 != null) {
                                    p220oa.h.s(view7, true);
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX2 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX2 != null) {
                            verticalSwipeRefreshLayoutX2.setRefreshing(false);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar4 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX2 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX2 != null) {
                            verticalSwipeRefreshLayoutX2.setRefreshing(false);
                        }
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        HomeSavingsUserV2Fragment.a aVar5 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX2 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX2 != null) {
                            verticalSwipeRefreshLayoutX2.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV3 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        Collection<Object> data4 = commonListResultV3 != null ? commonListResultV3.data : null;
                        HomeSavingsUserV2Fragment.a aVar6 = HomeSavingsUserV2Fragment.f35149F0;
                        Collection<Object> collection2 = data4;
                        if (collection2 == null || collection2.isEmpty()) {
                            Ie.v vVar2 = homeSavingsUserV2Fragment.f35157A0;
                            if (vVar2 != null && (view2 = vVar2.f4405a) != null) {
                                p220oa.h.s(view2, false);
                            }
                        } else {
                            Ie.v vVar3 = homeSavingsUserV2Fragment.f35157A0;
                            if (vVar3 != null) {
                                Intrinsics.checkNotNullParameter(data4, "data");
                                ((p385ze.i) vVar3.f4409e.getValue()).setList(collection2);
                                View view8 = vVar3.f4405a;
                                if (view8 != null) {
                                    p220oa.h.s(view8, true);
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX3 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX3 != null) {
                            verticalSwipeRefreshLayoutX3.setRefreshing(false);
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar7 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX3 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX3 != null) {
                            verticalSwipeRefreshLayoutX3.setRefreshing(false);
                        }
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                        HomeSavingsUserV2Fragment.a aVar8 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX3 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX3 != null) {
                            verticalSwipeRefreshLayoutX3.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        QueryRankFundModuleResp queryRankFundModuleResp = commonBeanResult2 != null ? (QueryRankFundModuleResp) commonBeanResult2.data : null;
                        if (queryRankFundModuleResp != null) {
                            HomeSavingsUserV2Fragment.a aVar9 = HomeSavingsUserV2Fragment.f35149F0;
                            List<QueryRankFundModul> list10 = queryRankFundModuleResp.rankingListTypeList;
                            if ((list10 == null || list10.isEmpty()) && ((list = queryRankFundModuleResp.recommendedFundInfoList) == null || list.isEmpty())) {
                                eVar = homeSavingsUserV2Fragment.f35159B0;
                                if (eVar != null && (view3 = eVar.f4327b) != null) {
                                    p220oa.h.s(view3, false);
                                }
                            } else {
                                Ie.e eVar3 = homeSavingsUserV2Fragment.f35159B0;
                                if (eVar3 != null) {
                                    eVar3.a(queryRankFundModuleResp);
                                }
                            }
                        } else {
                            eVar = homeSavingsUserV2Fragment.f35159B0;
                            if (eVar != null) {
                                p220oa.h.s(view3, false);
                            }
                        }
                        HomeSavingsUserV2Fragment.a aVar10 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX4 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX4 != null) {
                            verticalSwipeRefreshLayoutX4.setRefreshing(false);
                        }
                    } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar11 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX4 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX4 != null) {
                            verticalSwipeRefreshLayoutX4.setRefreshing(false);
                        }
                    } else {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                        HomeSavingsUserV2Fragment.a aVar12 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX4 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX4 != null) {
                            verticalSwipeRefreshLayoutX4.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        QueryRecommendModuleResp queryRecommendModuleResp = commonBeanResult3 != null ? (QueryRecommendModuleResp) commonBeanResult3.data : null;
                        if (homeSavingsUserV2Fragment.f35183y0 == null) {
                            View view9 = homeSavingsUserV2Fragment.f27318b;
                            AsyncViewStub asyncViewStub = view9 != null ? (AsyncViewStub) view9.findViewById(Ac.e.asyncRecomend) : null;
                            if (asyncViewStub != null) {
                                C0058e c0058e = new C0058e(i7, homeSavingsUserV2Fragment, queryRecommendModuleResp);
                                int i13 = AsyncViewStub.f31184d;
                                asyncViewStub.b(true, c0058e);
                            }
                        }
                        Ie.u uVar = homeSavingsUserV2Fragment.f35183y0;
                        if (uVar != null) {
                            uVar.a(queryRecommendModuleResp);
                        }
                        verticalSwipeRefreshLayoutX5 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    } else if (it5 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar13 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX5 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    } else {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                        HomeSavingsUserV2Fragment.a aVar14 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX5 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 5:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        QueryHotProductModuleResp data5 = commonBeanResult4 != null ? (QueryHotProductModuleResp) commonBeanResult4.data : null;
                        if (data5 != null) {
                            HomeSavingsUserV2Fragment.a aVar15 = HomeSavingsUserV2Fragment.f35149F0;
                            List<HotProductBean> list11 = data5.productList;
                            if ((list11 == null || list11.isEmpty()) && ((list2 = data5.exclusiveList) == null || list2.isEmpty())) {
                                dVar = homeSavingsUserV2Fragment.f35182x0;
                                if (dVar != null && (view4 = dVar.f4315a) != null) {
                                    p220oa.h.s(view4, false);
                                }
                            } else {
                                Ie.d dVar3 = homeSavingsUserV2Fragment.f35182x0;
                                if (dVar3 != null) {
                                    Intrinsics.checkNotNullParameter(data5, "data");
                                    List<HotProductBean> list12 = data5.productList;
                                    RecyclerView recyclerView2 = dVar3.f4318d;
                                    if (list12 != null) {
                                        if (list12.isEmpty()) {
                                            list12 = null;
                                        }
                                        if (list12 != null) {
                                            if (recyclerView2 != null) {
                                                recyclerView2.setVisibility(0);
                                            }
                                            p385ze.d dVar4 = (p385ze.d) dVar3.f4324j.getValue();
                                            if (dVar4 != null) {
                                                dVar4.setList(list12);
                                                unit = Unit.f38893a;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                if (recyclerView2 != null) {
                                                    recyclerView2.setVisibility(8);
                                                }
                                            }
                                        } else if (recyclerView2 != null) {
                                            recyclerView2.setVisibility(8);
                                        }
                                    } else if (recyclerView2 != null) {
                                        recyclerView2.setVisibility(8);
                                    }
                                    p355xf.t tVar3 = dVar3.f4325k;
                                    p385ze.d dVar5 = (p385ze.d) tVar3.getValue();
                                    if (dVar5 != null && (data = dVar5.getData()) != null) {
                                        data.clear();
                                    }
                                    List<HotProductBean> list13 = data5.exclusiveList;
                                    ConstraintLayout constraintLayout = dVar3.f4319e;
                                    ConstraintLayout constraintLayout2 = dVar3.f4320f;
                                    if (list13 == null) {
                                        if (constraintLayout2 != null) {
                                            constraintLayout2.setVisibility(8);
                                        }
                                        if (constraintLayout != null) {
                                            constraintLayout.setVisibility(0);
                                        }
                                    } else {
                                        List<HotProductBean> list14 = list13.isEmpty() ? null : list13;
                                        if (list14 != null) {
                                            ((p385ze.d) tVar3.getValue()).setList(list14);
                                            if (constraintLayout2 != null) {
                                                constraintLayout2.setVisibility(0);
                                            }
                                            if (constraintLayout != null) {
                                                constraintLayout.setVisibility(8);
                                            }
                                        } else {
                                            if (constraintLayout2 != null) {
                                                constraintLayout2.setVisibility(8);
                                            }
                                            if (constraintLayout != null) {
                                                constraintLayout.setVisibility(0);
                                            }
                                        }
                                    }
                                    String str13 = data5.hotProductTitle;
                                    TextView textView9 = dVar3.f4322h;
                                    if (str13 != null && textView9 != null) {
                                        textView9.setText(str13);
                                    }
                                    if (Pa.i0.T() && (view5 = dVar3.f4315a) != null && (context = view5.getContext()) != null && textView9 != null) {
                                        textView9.setTextColor(context.getColor(com.transsnet.palmpay.custom_view.p.cv_color_ffffff));
                                    }
                                    View view10 = dVar3.f4315a;
                                    if (view10 != null) {
                                        p220oa.h.s(view10, true);
                                    }
                                }
                            }
                        } else {
                            dVar = homeSavingsUserV2Fragment.f35182x0;
                            if (dVar != null) {
                                p220oa.h.s(view4, false);
                            }
                        }
                        HomeSavingsUserV2Fragment.a aVar16 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX6 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX6 != null) {
                            verticalSwipeRefreshLayoutX6.setRefreshing(false);
                        }
                    } else if (it6 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar17 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX6 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX6 != null) {
                            verticalSwipeRefreshLayoutX6.setRefreshing(false);
                        }
                    } else {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                        HomeSavingsUserV2Fragment.a aVar18 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX6 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX6 != null) {
                            verticalSwipeRefreshLayoutX6.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 6:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult5 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                        QuerySavingTaskModuleResp querySavingTaskModuleResp = commonBeanResult5 != null ? (QuerySavingTaskModuleResp) commonBeanResult5.data : null;
                        if (homeSavingsUserV2Fragment.f35184z0 == null) {
                            View view11 = homeSavingsUserV2Fragment.f27318b;
                            AsyncViewStub asyncViewStub2 = view11 != null ? (AsyncViewStub) view11.findViewById(Ac.e.asyncTask) : null;
                            if (asyncViewStub2 != null) {
                                C0058e c0058e2 = new C0058e(5, homeSavingsUserV2Fragment, querySavingTaskModuleResp);
                                int i14 = AsyncViewStub.f31184d;
                                asyncViewStub2.b(true, c0058e2);
                            }
                        }
                        O2.a aVar19 = homeSavingsUserV2Fragment.f35184z0;
                        if (aVar19 != null) {
                            aVar19.d(querySavingTaskModuleResp);
                        }
                        verticalSwipeRefreshLayoutX7 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX7 != null) {
                            verticalSwipeRefreshLayoutX7.setRefreshing(false);
                        }
                    } else if (it7 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar20 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX7 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX7 != null) {
                            verticalSwipeRefreshLayoutX7.setRefreshing(false);
                        }
                    } else {
                        if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it7).getClass();
                        HomeSavingsUserV2Fragment.a aVar21 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX7 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX7 != null) {
                            verticalSwipeRefreshLayoutX7.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult6 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                        if (commonBeanResult6 != null && (queryTargetSavingsModuleResp = (QueryTargetSavingsModuleResp) commonBeanResult6.data) != null) {
                            data2 = queryTargetSavingsModuleResp.trendingTarget;
                        }
                        HomeSavingsUserV2Fragment.a aVar22 = HomeSavingsUserV2Fragment.f35149F0;
                        List<QueryTargetSavingsModul> list15 = data2;
                        if (list15 == null || list15.isEmpty()) {
                            Ie.w wVar2 = homeSavingsUserV2Fragment.f35161C0;
                            if (wVar2 != null && (view6 = wVar2.f4410a) != null) {
                                p220oa.h.s(view6, false);
                            }
                        } else {
                            Ie.w wVar3 = homeSavingsUserV2Fragment.f35161C0;
                            if (wVar3 != null) {
                                Intrinsics.checkNotNullParameter(data2, "data");
                                ((p385ze.j) wVar3.f4414e.getValue()).setList(list15);
                                View view12 = wVar3.f4410a;
                                if (view12 != null) {
                                    p220oa.h.s(view12, true);
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX8 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX8 != null) {
                            verticalSwipeRefreshLayoutX8.setRefreshing(false);
                        }
                    } else if (it8 instanceof com.transsnet.palmpay.core.base.m) {
                        HomeSavingsUserV2Fragment.a aVar23 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX8 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX8 != null) {
                            verticalSwipeRefreshLayoutX8.setRefreshing(false);
                        }
                    } else {
                        if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it8).getClass();
                        HomeSavingsUserV2Fragment.a aVar24 = HomeSavingsUserV2Fragment.f35149F0;
                        verticalSwipeRefreshLayoutX8 = homeSavingsUserV2Fragment.x();
                        if (verticalSwipeRefreshLayoutX8 != null) {
                            verticalSwipeRefreshLayoutX8.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}

package Ce;

import Ab.ViewOnClickListenerC0053e;
import Ad.C0058e;
import Pe.C0550w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.CashBoxIntroductionView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.InvestGuideBeanRsp;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRankFundModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.RecommendProduct;
import com.transsnet.palmpay.main.export.bean.rsp.SavingMainBodyResultBean;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvestGuideFragment f1478b;

    public /* synthetic */ e0(InvestGuideFragment investGuideFragment, int i7) {
        this.f1477a = i7;
        this.f1478b = investGuideFragment;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0189 A[PHI: r1
      0x0189: PHI (r1v76 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r1v73 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v75 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v82 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:130:0x01a9, B:125:0x0197, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x020b A[PHI: r1
      0x020b: PHI (r1v56 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r1v53 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v55 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v65 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:172:0x022b, B:167:0x0219, B:162:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:233:0x0319  */
    /* JADX WARN: Code duplicated, block: B:235:0x0323  */
    /* JADX WARN: Code duplicated, block: B:486:0x07e5 A[PHI: r1
      0x07e5: PHI (r1v9 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r1v6 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v8 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v10 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:495:0x0805, B:490:0x07f3, B:485:0x07e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[PHI: r1
      0x00db: PHI (r1v110 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r1v107 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v109 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v118 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:76:0x00fb, B:71:0x00e9, B:66:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0124 A[PHI: r1
      0x0124: PHI (r1v95 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout) = 
      (r1v92 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v94 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
      (r1v100 com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout)
     binds: [B:97:0x0144, B:92:0x0132, B:87:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45, types: [com.transsnet.palmpay.custom_view.async.AsyncViewStub] */
    /* JADX WARN: Type inference failed for: r7v51 */
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
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        ?? r10;
        AsyncViewStub asyncViewStub;
        Object obj2;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX2;
        View view;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX3;
        View view2;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX4;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutX5;
        View view3;
        CashBoxIntroductionView cashBoxIntroductionView;
        int i7 = 8;
        ViewGroup viewGroup2 = null;
        InvestGuideFragment investGuideFragment = this.f1478b;
        switch (this.f1477a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        InvestGuideBeanRsp investGuideBeanRsp = commonBeanResult != null ? (InvestGuideBeanRsp) commonBeanResult.data : null;
                        if (investGuideBeanRsp != null) {
                            List<InvestGuideBeanRsp.LabelList> list = investGuideBeanRsp.labelList;
                            p355xf.t tVar = investGuideFragment.f35193B;
                            LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                            if (linearLayout2 != null) {
                                linearLayout2.removeAllViews();
                            }
                            if (list == null) {
                                viewGroup = null;
                                linearLayout = (LinearLayout) tVar.getValue();
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                            } else {
                                List<InvestGuideBeanRsp.LabelList> list2 = !list.isEmpty() ? list : null;
                                if (list2 != null) {
                                    List<InvestGuideBeanRsp.LabelList> list3 = list2;
                                    ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list3, 10));
                                    int i10 = 0;
                                    for (Object obj3 : list3) {
                                        int i11 = i10 + 1;
                                        if (i10 < 0) {
                                            ?? r16 = viewGroup2;
                                            C1850q.k();
                                            throw r16;
                                        }
                                        InvestGuideBeanRsp.LabelList labelList = (InvestGuideBeanRsp.LabelList) obj3;
                                        View viewInflate = LayoutInflater.from(investGuideFragment.getContext()).inflate(Ac.f.main_item_saving_top_tag, viewGroup2);
                                        Pa.r0.l1(investGuideFragment.m() ? labelList.iconDarkModeUrl : labelList.iconUrl, (ImageView) viewInflate.findViewById(Ac.e.ivIcon));
                                        TextView textView = (TextView) viewInflate.findViewById(Ac.e.tvTagName);
                                        if (textView != null) {
                                            String str = labelList.title;
                                            if (str == null) {
                                                str = "";
                                            }
                                            textView.setText(str);
                                        }
                                        View viewFindViewById = viewInflate.findViewById(Ac.e.vLeft);
                                        if (viewFindViewById != null) {
                                            viewFindViewById.setVisibility(i10 == 0 ? 8 : 0);
                                        }
                                        View viewFindViewById2 = viewInflate.findViewById(Ac.e.vLine);
                                        if (viewFindViewById2 != null) {
                                            viewFindViewById2.setVisibility(i10 == list.size() - 1 ? 8 : 0);
                                        }
                                        LinearLayout linearLayout3 = (LinearLayout) tVar.getValue();
                                        if (linearLayout3 != null) {
                                            linearLayout3.addView(viewInflate);
                                            obj2 = Unit.f38893a;
                                        } else {
                                            obj2 = viewGroup2;
                                        }
                                        arrayList.add(obj2);
                                        i10 = i11;
                                        viewGroup2 = viewGroup2;
                                    }
                                    viewGroup = viewGroup2;
                                } else {
                                    viewGroup = null;
                                    linearLayout = (LinearLayout) tVar.getValue();
                                    if (linearLayout != null) {
                                        linearLayout.setVisibility(8);
                                    }
                                }
                            }
                            QueryRecommendModuleResp queryRecommendModuleResp = investGuideBeanRsp.savingRecommendContentInfo;
                            if (investGuideFragment.f35199X == null) {
                                View view4 = investGuideFragment.f27318b;
                                if (view4 != null) {
                                    asyncViewStub = (AsyncViewStub) view4.findViewById(Ac.e.asyncRecomend);
                                } else {
                                    r10 = viewGroup;
                                }
                                if (r10 != 0) {
                                    r10 = asyncViewStub;
                                    C0058e c0058e = new C0058e(7, investGuideFragment, queryRecommendModuleResp);
                                    int i12 = AsyncViewStub.f31184d;
                                    r10.b(true, c0058e);
                                }
                            }
                            r10 = asyncViewStub;
                            Ie.u uVar = investGuideFragment.f35199X;
                            if (uVar != null) {
                                uVar.a(queryRecommendModuleResp);
                            }
                            List<ProductData> list4 = investGuideBeanRsp.productList;
                            p355xf.t tVar2 = investGuideFragment.f35206s0;
                            if (list4 == null || list4.isEmpty()) {
                                RecyclerView recyclerView = (RecyclerView) investGuideFragment.f35208w.getValue();
                                if (recyclerView != null) {
                                    recyclerView.setVisibility(8);
                                }
                                ArrayList arrayList2 = (ArrayList) tVar2.getValue();
                                if (arrayList2 != null) {
                                    arrayList2.clear();
                                }
                            } else {
                                ArrayList arrayList3 = (ArrayList) tVar2.getValue();
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                ArrayList arrayList4 = (ArrayList) tVar2.getValue();
                                if (arrayList4 != null) {
                                    List<ProductData> list5 = investGuideBeanRsp.productList;
                                    Intrinsics.e(list5);
                                    arrayList4.addAll(list5);
                                }
                            }
                            p385ze.h hVar = investGuideFragment.f35195H;
                            if (hVar != null) {
                                hVar.f4985b = (ArrayList) tVar2.getValue();
                            }
                            p385ze.h hVar2 = investGuideFragment.f35195H;
                            if (hVar2 != null) {
                                hVar2.notifyDataSetChanged();
                            }
                            List<ProductData> list6 = investGuideBeanRsp.productList;
                            if (list6 != null && !list6.isEmpty()) {
                                List<ProductData> list7 = investGuideBeanRsp.productList;
                                Intrinsics.e(list7);
                                int size = list7.size();
                                p355xf.t tVar3 = investGuideFragment.f35207v;
                                if (size > 4) {
                                    LinearLayout linearLayout4 = (LinearLayout) tVar3.getValue();
                                    if (linearLayout4 != null) {
                                        p220oa.h.s(linearLayout4, true);
                                    }
                                    LinearLayout linearLayout5 = (LinearLayout) tVar3.getValue();
                                    if (investGuideFragment.f35196L == null) {
                                        investGuideFragment.f35196L = new ArrayList();
                                    }
                                    ArrayList arrayList5 = investGuideFragment.f35196L;
                                    if (arrayList5 != null) {
                                        arrayList5.clear();
                                    }
                                    if (linearLayout5 != null) {
                                        linearLayout5.removeAllViews();
                                    }
                                    int iDp2px = SizeUtils.dp2px(1.0f);
                                    int i13 = 0;
                                    while (i13 < 2) {
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                        layoutParams.setMargins(iDp2px, 0, iDp2px, 0);
                                        ImageView imageView = new ImageView(investGuideFragment.requireContext());
                                        imageView.setLayoutParams(layoutParams);
                                        imageView.setImageResource(Ac.d.main_indicator_dot_1);
                                        imageView.setAdjustViewBounds(true);
                                        imageView.setSelected(i13 == 0);
                                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                        F6.d.h(investGuideFragment.f27317a, 3, "initIndicator: " + Thread.currentThread().getName() + " " + (linearLayout5 != null ? Integer.valueOf(linearLayout5.getChildCount()) : viewGroup));
                                        if (linearLayout5 != null) {
                                            linearLayout5.addView(imageView);
                                        }
                                        ArrayList arrayList6 = investGuideFragment.f35196L;
                                        if (arrayList6 != null) {
                                            arrayList6.add(imageView);
                                        }
                                        i13++;
                                    }
                                } else {
                                    LinearLayout linearLayout6 = (LinearLayout) tVar3.getValue();
                                    if (linearLayout6 != null) {
                                        linearLayout6.removeAllViews();
                                    }
                                    investGuideFragment.f35196L = viewGroup;
                                    LinearLayout linearLayout7 = (LinearLayout) tVar3.getValue();
                                    if (linearLayout7 != null) {
                                        p220oa.h.s(linearLayout7, false);
                                    }
                                }
                            }
                            List<InvestGuideBeanRsp.WealthCommentList> list8 = investGuideBeanRsp.wealthCommentList;
                            if (list8 != null) {
                                if ((!list8.isEmpty() ? list8 : null) != null) {
                                    if (investGuideFragment.f35201Z == null) {
                                        View view5 = investGuideFragment.f27318b;
                                        AsyncViewStub asyncViewStub2 = view5 != null ? (AsyncViewStub) view5.findViewById(Ac.e.asyncComment) : null;
                                        if (asyncViewStub2 != null) {
                                            C0058e c0058e2 = new C0058e(i7, investGuideFragment, list8);
                                            int i14 = AsyncViewStub.f31184d;
                                            asyncViewStub2.b(true, c0058e2);
                                        }
                                    }
                                    Ie.t tVar4 = investGuideFragment.f35201Z;
                                    if (tVar4 != null) {
                                        tVar4.a(list8);
                                    }
                                }
                            }
                            List<RecommendProduct> list9 = investGuideBeanRsp.recommendList;
                            if (list9 == null || list9.isEmpty()) {
                                LinearLayout linearLayoutW = investGuideFragment.w();
                                if (linearLayoutW != null) {
                                    linearLayoutW.removeAllViews();
                                }
                            } else {
                                List<RecommendProduct> list10 = investGuideBeanRsp.recommendList;
                                if (list10 != null) {
                                    int i15 = 0;
                                    for (Object obj4 : list10) {
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            C1850q.k();
                                            throw null;
                                        }
                                        RecommendProduct recommendProduct = (RecommendProduct) obj4;
                                        String str2 = recommendProduct.productName;
                                        if (Intrinsics.c(str2, InvestGuideFragment.f35186u0)) {
                                            if (investGuideFragment.f35200Y == null) {
                                                LinearLayout linearLayoutW2 = investGuideFragment.w();
                                                Ie.a aVar = new Ie.a();
                                                View viewInflate2 = LayoutInflater.from(linearLayoutW2 != null ? linearLayoutW2.getContext() : null).inflate(Ac.f.main_saving_cashbox_layout, (ViewGroup) null);
                                                aVar.f4308a = viewInflate2;
                                                if (viewInflate2 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2.findViewById(Ac.e.ctl_title);
                                                    aVar.f4309b = (TextView) viewInflate2.findViewById(Ac.e.tvTitle);
                                                    aVar.f4310c = (TextView) viewInflate2.findViewById(Ac.e.tvContent);
                                                    aVar.f4311d = (TextView) viewInflate2.findViewById(Ac.e.tvDesc);
                                                    RoundedTextView roundedTextView = (RoundedTextView) viewInflate2.findViewById(Ac.e.rtvGet);
                                                    viewInflate2.setVisibility(i7);
                                                    if (linearLayoutW2 != null) {
                                                        linearLayoutW2.addView(viewInflate2);
                                                    }
                                                    LinearLayout linearLayout8 = new LinearLayout(linearLayoutW2 != null ? linearLayoutW2.getContext() : null);
                                                    linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(12)));
                                                    if (linearLayoutW2 != null) {
                                                        linearLayoutW2.addView(linearLayout8);
                                                    }
                                                    if (roundedTextView != null) {
                                                        roundedTextView.setOnClickListener(new ViewOnClickListenerC0053e(23));
                                                    }
                                                    if (constraintLayout != null) {
                                                        constraintLayout.setOnClickListener(new Ha.d(aVar, 5));
                                                    }
                                                }
                                                investGuideFragment.f35200Y = aVar;
                                            }
                                            Ie.a aVar2 = investGuideFragment.f35200Y;
                                            if (aVar2 != null) {
                                                String str3 = recommendProduct.title;
                                                String str4 = recommendProduct.desc;
                                                String str5 = recommendProduct.productRate;
                                                TextView textView2 = aVar2.f4309b;
                                                if (textView2 != null) {
                                                    textView2.setText(str3);
                                                }
                                                TextView textView3 = aVar2.f4311d;
                                                if (textView3 != null) {
                                                    textView3.setText(str4);
                                                }
                                                TextView textView4 = aVar2.f4310c;
                                                if (textView4 != null) {
                                                    textView4.setText(str5);
                                                }
                                                View view6 = aVar2.f4308a;
                                                if (view6 != null) {
                                                    p220oa.h.s(view6, true);
                                                }
                                            }
                                        } else if (Intrinsics.c(str2, InvestGuideFragment.f35187v0)) {
                                            Pa.n0.g().v("FinanceTab_FixedSavings_View");
                                            if (investGuideFragment.f35198Q == null) {
                                                investGuideFragment.f35198Q = new Ie.d(investGuideFragment.w());
                                            }
                                            Ie.d dVar = investGuideFragment.f35198Q;
                                            if (dVar != null) {
                                                dVar.a(recommendProduct.title, recommendProduct.desc, recommendProduct.androidIndexUrl, false);
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) investGuideFragment.f27327p;
                                            homeSavingsViewModel.getClass();
                                            p140j8.f.s(homeSavingsViewModel, new C0550w(1, null), homeSavingsViewModel.f35369j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, InvestGuideFragment.f35190y0)) {
                                            if (investGuideFragment.f35202k0 == null) {
                                                investGuideFragment.f35202k0 = new Ie.x(investGuideFragment.w());
                                            }
                                            Ie.x xVar = investGuideFragment.f35202k0;
                                            if (xVar != null) {
                                                String str6 = recommendProduct.title;
                                                String str7 = recommendProduct.desc;
                                                TextView textView5 = xVar.f4416b;
                                                if (textView5 != null) {
                                                    textView5.setText(str6);
                                                }
                                                TextView textView6 = xVar.f4417c;
                                                if (textView6 != null) {
                                                    textView6.setText(str7);
                                                }
                                                View view7 = xVar.f4415a;
                                                if (view7 != null) {
                                                    p220oa.h.s(view7, true);
                                                }
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel2 = (HomeSavingsViewModel) investGuideFragment.f27327p;
                                            homeSavingsViewModel2.getClass();
                                            p140j8.f.s(homeSavingsViewModel2, new Pe.A(1, null), homeSavingsViewModel2.f35371p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else if (Intrinsics.c(str2, InvestGuideFragment.f35191z0)) {
                                            if (investGuideFragment.f35203p0 == null) {
                                                LinearLayout linearLayoutW3 = investGuideFragment.w();
                                                Ie.a aVar3 = new Ie.a();
                                                View viewInflate3 = LayoutInflater.from(linearLayoutW3 != null ? linearLayoutW3.getContext() : null).inflate(Ac.f.main_saving_spend_save_layout, (ViewGroup) null);
                                                aVar3.f4308a = viewInflate3;
                                                if (viewInflate3 != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3.findViewById(Ac.e.ctl_title);
                                                    aVar3.f4309b = (TextView) viewInflate3.findViewById(Ac.e.tvTitle);
                                                    TextView textView7 = (TextView) viewInflate3.findViewById(Ac.e.tvSaveTitle);
                                                    aVar3.f4310c = textView7;
                                                    aVar3.f4311d = (TextView) viewInflate3.findViewById(Ac.e.tvDesc);
                                                    RoundedTextView roundedTextView2 = (RoundedTextView) viewInflate3.findViewById(Ac.e.rtvGet);
                                                    viewInflate3.setVisibility(i7);
                                                    if (linearLayoutW3 != null) {
                                                        linearLayoutW3.addView(viewInflate3);
                                                    }
                                                    LinearLayout linearLayout9 = new LinearLayout(linearLayoutW3 != null ? linearLayoutW3.getContext() : null);
                                                    linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(12)));
                                                    if (linearLayoutW3 != null) {
                                                        linearLayoutW3.addView(linearLayout9);
                                                    }
                                                    if (roundedTextView2 != null) {
                                                        roundedTextView2.setOnClickListener(new ViewOnClickListenerC0053e(25));
                                                    }
                                                    if (constraintLayout2 != null) {
                                                        constraintLayout2.setOnClickListener(new Ha.d(aVar3, 15));
                                                    }
                                                    if (textView7 != null) {
                                                        if (linearLayoutW3 == null || linearLayoutW3.getContext() == null) {
                                                            textView7 = null;
                                                        }
                                                        if (textView7 != null) {
                                                            SpanUtils spanUtilsAppend = new SpanUtils().append("Save ").append("5%");
                                                            Intrinsics.e(linearLayoutW3);
                                                            textView7.setText(spanUtilsAppend.setForegroundColor(linearLayoutW3.getContext().getColor(L6.b.ppColorPrimary)).setFontSize(SizeUtils.sp2px(14.0f)).append(" of spend after every purchase").create());
                                                        }
                                                    }
                                                }
                                                investGuideFragment.f35203p0 = aVar3;
                                            }
                                            Ie.a aVar4 = investGuideFragment.f35203p0;
                                            if (aVar4 != null) {
                                                String str8 = recommendProduct.title;
                                                String str9 = recommendProduct.desc;
                                                TextView textView8 = aVar4.f4309b;
                                                if (textView8 != null) {
                                                    textView8.setText(str8);
                                                }
                                                TextView textView9 = aVar4.f4311d;
                                                if (textView9 != null) {
                                                    textView9.setText(str9);
                                                }
                                                View view8 = aVar4.f4308a;
                                                if (view8 != null) {
                                                    p220oa.h.s(view8, true);
                                                }
                                            }
                                        } else if (Intrinsics.c(str2, InvestGuideFragment.f35188w0)) {
                                            Pa.n0.g().v("FinanceTab_Insurance_View");
                                            if (investGuideFragment.f35197M == null) {
                                                investGuideFragment.f35197M = new Ie.o(investGuideFragment.w());
                                            }
                                            Ie.o oVar = investGuideFragment.f35197M;
                                            if (oVar != null) {
                                                String str10 = recommendProduct.title;
                                                String str11 = recommendProduct.desc;
                                                TextView textView10 = oVar.f4385b;
                                                if (textView10 != null) {
                                                    textView10.setText(str10);
                                                }
                                                TextView textView11 = oVar.f4386c;
                                                if (textView11 != null) {
                                                    textView11.setText(str11);
                                                }
                                            }
                                            HomeSavingsViewModel homeSavingsViewModel3 = (HomeSavingsViewModel) investGuideFragment.f27327p;
                                            homeSavingsViewModel3.getClass();
                                            p140j8.f.s(homeSavingsViewModel3, new Pe.F(1, null), homeSavingsViewModel3.f35366f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        } else {
                                            if (Intrinsics.c(str2, InvestGuideFragment.f35189x0)) {
                                                Pa.n0.g().v("FinanceTab_MutualFunds_View");
                                                if (investGuideFragment.f35204q0 == null) {
                                                    investGuideFragment.f35204q0 = new Ie.e(investGuideFragment.w());
                                                }
                                                Ie.e eVar = investGuideFragment.f35204q0;
                                                if (eVar != null) {
                                                    String str12 = recommendProduct.title;
                                                    String str13 = recommendProduct.androidIndexUrl;
                                                    TextView textView12 = eVar.f4328c;
                                                    if (textView12 != null) {
                                                        textView12.setText(str12);
                                                    }
                                                    eVar.f4329d = str13;
                                                }
                                                HomeSavingsViewModel homeSavingsViewModel4 = (HomeSavingsViewModel) investGuideFragment.f27327p;
                                                homeSavingsViewModel4.getClass();
                                                p140j8.f.s(homeSavingsViewModel4, new Pe.C(1, null), homeSavingsViewModel4.f35372v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                            }
                                            i15 = i16;
                                            i7 = 8;
                                        }
                                        i15 = i16;
                                        i7 = 8;
                                    }
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX != null) {
                            verticalSwipeRefreshLayoutX.setRefreshing(false);
                        }
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        InvestGuideFragment.a aVar5 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX != null) {
                            verticalSwipeRefreshLayoutX.setRefreshing(false);
                        }
                    } else {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        InvestGuideFragment.a aVar6 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX = investGuideFragment.x();
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
                        Collection<Object> data = commonListResultV2 != null ? commonListResultV2.data : null;
                        InvestGuideFragment.a aVar7 = InvestGuideFragment.f35185t0;
                        Collection<Object> collection = data;
                        if (collection == null || collection.isEmpty()) {
                            Ie.o oVar2 = investGuideFragment.f35197M;
                            if (oVar2 != null && (view = oVar2.f4384a) != null) {
                                p220oa.h.s(view, false);
                            }
                        } else {
                            Ie.o oVar3 = investGuideFragment.f35197M;
                            if (oVar3 != null) {
                                Intrinsics.checkNotNullParameter(data, "data");
                                p385ze.f fVar = (p385ze.f) oVar3.f4387d.getValue();
                                if (fVar != null) {
                                    fVar.setList(collection);
                                }
                                View view9 = oVar3.f4384a;
                                if (view9 != null) {
                                    p220oa.h.s(view9, true);
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX2 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX2 != null) {
                            verticalSwipeRefreshLayoutX2.setRefreshing(false);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        InvestGuideFragment.a aVar8 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX2 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX2 != null) {
                            verticalSwipeRefreshLayoutX2.setRefreshing(false);
                        }
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        InvestGuideFragment.a aVar9 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX2 = investGuideFragment.x();
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
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        QueryRankFundModuleResp queryRankFundModuleResp = commonBeanResult2 != null ? (QueryRankFundModuleResp) commonBeanResult2.data : null;
                        if (queryRankFundModuleResp == null) {
                            Ie.e eVar2 = investGuideFragment.f35204q0;
                            if (eVar2 != null && (view2 = eVar2.f4327b) != null) {
                                p220oa.h.s(view2, false);
                            }
                        } else {
                            Ie.e eVar3 = investGuideFragment.f35204q0;
                            if (eVar3 != null) {
                                eVar3.a(queryRankFundModuleResp);
                            }
                        }
                        InvestGuideFragment.a aVar10 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX3 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX3 != null) {
                            verticalSwipeRefreshLayoutX3.setRefreshing(false);
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        InvestGuideFragment.a aVar11 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX3 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX3 != null) {
                            verticalSwipeRefreshLayoutX3.setRefreshing(false);
                        }
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                        InvestGuideFragment.a aVar12 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX3 = investGuideFragment.x();
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
                        InvestGuideFragment.a aVar13 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX4 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX4 != null) {
                            verticalSwipeRefreshLayoutX4.setRefreshing(false);
                        }
                    } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                        InvestGuideFragment.a aVar14 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX4 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX4 != null) {
                            verticalSwipeRefreshLayoutX4.setRefreshing(false);
                        }
                    } else {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                        InvestGuideFragment.a aVar15 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX4 = investGuideFragment.x();
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
                        CommonListResultV2 commonListResultV3 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        Collection<Object> targetList = commonListResultV3 != null ? commonListResultV3.data : null;
                        InvestGuideFragment.a aVar16 = InvestGuideFragment.f35185t0;
                        Collection<Object> collection2 = targetList;
                        if (collection2 == null || collection2.isEmpty()) {
                            Ie.x xVar2 = investGuideFragment.f35202k0;
                            if (xVar2 != null && (view3 = xVar2.f4415a) != null) {
                                p220oa.h.s(view3, false);
                            }
                        } else {
                            Ie.x xVar3 = investGuideFragment.f35202k0;
                            if (xVar3 != null) {
                                Intrinsics.checkNotNullParameter(targetList, "targetList");
                                if ((collection2.isEmpty() ? null : targetList) != null) {
                                    ((p385ze.k) xVar3.f4418d.getValue()).setList(collection2);
                                }
                            }
                        }
                        verticalSwipeRefreshLayoutX5 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    } else if (it5 instanceof com.transsnet.palmpay.core.base.m) {
                        InvestGuideFragment.a aVar17 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX5 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    } else {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                        InvestGuideFragment.a aVar18 = InvestGuideFragment.f35185t0;
                        verticalSwipeRefreshLayoutX5 = investGuideFragment.x();
                        if (verticalSwipeRefreshLayoutX5 != null) {
                            verticalSwipeRefreshLayoutX5.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        SavingMainBodyResultBean savingMainBodyResultBean = (SavingMainBodyResultBean) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a).data;
                        if (savingMainBodyResultBean != null && (cashBoxIntroductionView = (CashBoxIntroductionView) investGuideFragment.f35194C.getValue()) != null) {
                            Group group = cashBoxIntroductionView.f30947d;
                            if (group != null) {
                                group.setVisibility(0);
                            }
                            cashBoxIntroductionView.setFundLicenseText(SPUtils.getInstance().getString("cash_box_fund_license"));
                            String str14 = savingMainBodyResultBean.fundMainbody;
                            if (str14 != null) {
                                if (str14.length() <= 0) {
                                    str14 = null;
                                }
                                if (str14 != null) {
                                    cashBoxIntroductionView.setFundLicenseText(str14);
                                }
                            }
                            String str15 = savingMainBodyResultBean.savingMainbody;
                            if (str15 != null) {
                                String str16 = str15.length() > 0 ? str15 : null;
                                if (str16 != null) {
                                    cashBoxIntroductionView.d(str16);
                                }
                            }
                        }
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}

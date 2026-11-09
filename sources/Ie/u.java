package Ie;

import Ac.e;
import Gb.T;
import Ie.u;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4404i;

    public u(ViewStub viewStub) {
        this.f4396a = null;
        final int i7 = 0;
        this.f4397b = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f4398c = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f4399d = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f4400e = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f4401f = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f4402g = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f4403h = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f4404i = C2131j.b(new Function0(this) { // from class: Le.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f5658b;

            {
                this.f5658b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        View view = (View) this.f5658b.f4396a;
                        if (view != null) {
                            return view.findViewById(e.mp_view_bottom_line);
                        }
                        return null;
                    case 1:
                        View view2 = (View) this.f5658b.f4396a;
                        if (view2 != null) {
                            return view2.findViewById(e.mp_view_top_line);
                        }
                        return null;
                    case 2:
                        View view3 = (View) this.f5658b.f4396a;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.mp_tv_right);
                        }
                        return null;
                    case 3:
                        View view4 = (View) this.f5658b.f4396a;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(e.imageViewAvatar);
                        }
                        return null;
                    case 4:
                        View view5 = (View) this.f5658b.f4396a;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(e.imageViewNext);
                        }
                        return null;
                    case 5:
                        View view6 = (View) this.f5658b.f4396a;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.mp_tv_left2);
                        }
                        return null;
                    case 6:
                        View view7 = (View) this.f5658b.f4396a;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.mp_tv_new_tag);
                        }
                        return null;
                    default:
                        View view8 = (View) this.f5658b.f4396a;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.mp_tv_left1);
                        }
                        return null;
                }
            }
        });
        if (viewStub != null) {
            this.f4396a = viewStub.inflate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public void a(QueryRecommendModuleResp queryRecommendModuleResp) {
        boolean z3;
        String string;
        Resources resources;
        boolean z8 = true;
        View view = (View) this.f4396a;
        if (queryRecommendModuleResp != null) {
            try {
                if (Intrinsics.c(queryRecommendModuleResp.isShow, Boolean.TRUE)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Exception e10) {
                F6.d.c("SavingRecommend", "savingRecommend", e10.getMessage());
                if (view != null) {
                    p220oa.h.s(view, false);
                    return;
                }
                return;
            }
        } else {
            z3 = false;
        }
        if (view != null) {
            p220oa.h.s(view, z3);
        }
        if (queryRecommendModuleResp != null) {
            QueryRecommendModuleResp queryRecommendModuleResp2 = z3 ? queryRecommendModuleResp : null;
            if (queryRecommendModuleResp2 != null) {
                n0 n0VarG = n0.g();
                ViewEvent viewEvent = new ViewEvent("FinanceTab_HotContent_View");
                Integer num = queryRecommendModuleResp2.contentId;
                if (num == null || (string = num.toString()) == null) {
                    string = "";
                }
                n0VarG.u(viewEvent.add("element_name", string));
                TextView textView = (TextView) this.f4400e;
                if (textView != null) {
                    String str = queryRecommendModuleResp2.contentTitle;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                    String str2 = queryRecommendModuleResp2.contentTitle;
                    textView.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                }
                TextView textView2 = (TextView) this.f4401f;
                if (textView2 != null) {
                    String str3 = queryRecommendModuleResp2.keyContent;
                    if (str3 == null) {
                        str3 = "";
                    }
                    textView2.setText(str3);
                    String str4 = queryRecommendModuleResp2.keyContent;
                    textView2.setVisibility((str4 == null || str4.length() == 0) ? 8 : 0);
                }
                TextView textView3 = (TextView) this.f4402g;
                if (textView3 != null) {
                    String str5 = queryRecommendModuleResp2.contentSubtitle;
                    textView3.setText(str5 != null ? str5 : "");
                    String str6 = queryRecommendModuleResp2.contentSubtitle;
                    textView3.setVisibility((str6 == null || str6.length() == 0) ? 8 : 0);
                }
                boolean zIsEmpty = TextUtils.isEmpty(queryRecommendModuleResp2.topPicUrl);
                ImageView imageView = (ImageView) this.f4397b;
                if (!zIsEmpty) {
                    r0.l1(i0.T() ? queryRecommendModuleResp2.topPicDarkModeUr : queryRecommendModuleResp2.topPicUrl, imageView);
                } else if (imageView != null) {
                    imageView.setImageDrawable((view == null || (resources = view.getResources()) == null) ? null : resources.getDrawable(Ac.d.main_icon_hot_product));
                }
                String str7 = queryRecommendModuleResp2.buttonContent;
                if (str7 != null && str7.length() != 0) {
                    z8 = false;
                }
                int i7 = !z8 ? 0 : 8;
                ImageView imageView2 = (ImageView) this.f4398c;
                if (imageView2 != null) {
                    imageView2.setVisibility(i7);
                }
                RoundedTextView roundedTextView = (RoundedTextView) this.f4404i;
                if (roundedTextView != null) {
                    roundedTextView.setVisibility(i7);
                    if (!z8) {
                        roundedTextView.setText(queryRecommendModuleResp2.buttonContent);
                    }
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f4399d;
                if (constraintLayout != null) {
                    constraintLayout.setOnClickListener(new T(6, queryRecommendModuleResp, this));
                }
                LinearLayout linearLayout = (LinearLayout) this.f4403h;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                List<String> list = queryRecommendModuleResp2.contentTagList;
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        List<String> list2 = list;
                        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
                        for (String str8 : list2) {
                            TextView textView4 = new TextView(view != null ? view.getContext() : null);
                            textView4.setTextSize(12.0f);
                            textView4.setGravity(17);
                            textView4.setPadding(CommonViewExtKt.getDp(4), 0, CommonViewExtKt.getDp(4), 0);
                            textView4.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, view != null ? view.getContext() : null));
                            textView4.setText(str8);
                            p220oa.h.n(textView4, CommonViewExtKt.colorInt(L6.b.pp_transparent, view != null ? view.getContext() : null), CommonViewExtKt.getDp(4.0f), null, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, view != null ? view.getContext() : null)), 100);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            int dp = CommonViewExtKt.getDp(12);
                            Intrinsics.e(linearLayout);
                            if (linearLayout.getChildCount() > 0) {
                                layoutParams.leftMargin = dp;
                            }
                            linearLayout.addView(textView4, layoutParams);
                            arrayList.add(Unit.f38893a);
                        }
                    }
                }
                String str9 = queryRecommendModuleResp2.backgroundUrl;
                if (str9 != null) {
                    r0.l1(str9, constraintLayout != null ? (ImageView) constraintLayout.findViewById(Ac.e.ivBg) : null);
                }
            }
        }
    }

    public void b(View.OnClickListener onClickListener) {
        View view = (View) this.f4396a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void c(String str, String str2) {
        TextView textView;
        TextView textView2 = (TextView) ((p355xf.t) this.f4404i).getValue();
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (str2 == null || (textView = (TextView) ((p355xf.t) this.f4399d).getValue()) == null) {
            return;
        }
        textView.setText(str2);
    }

    public void d(boolean z3) {
        View view = (View) ((p355xf.t) this.f4397b).getValue();
        if (view != null) {
            p220oa.h.s(view, z3);
        }
    }

    public void e() {
        ImageView imageView = (ImageView) ((p355xf.t) this.f4401f).getValue();
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void f() {
        TextView textView = (TextView) ((p355xf.t) this.f4399d).getValue();
        if (textView != null) {
            textView.setVisibility(0);
        }
        ImageView imageView = (ImageView) ((p355xf.t) this.f4400e).getValue();
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void g(boolean z3) {
        View view = (View) ((p355xf.t) this.f4398c).getValue();
        if (view != null) {
            p220oa.h.s(view, z3);
        }
    }

    public u(View view) {
        this.f4396a = view;
        this.f4397b = view != null ? (ImageView) view.findViewById(Ac.e.ivHotProduct) : null;
        this.f4399d = view != null ? (ConstraintLayout) view.findViewById(Ac.e.cslHotContent) : null;
        this.f4400e = view != null ? (TextView) view.findViewById(Ac.e.tvTitle) : null;
        this.f4403h = view != null ? (LinearLayout) view.findViewById(Ac.e.llTag) : null;
        this.f4401f = view != null ? (TextView) view.findViewById(Ac.e.tvRate) : null;
        this.f4402g = view != null ? (TextView) view.findViewById(Ac.e.tvSec) : null;
        this.f4404i = view != null ? (RoundedTextView) view.findViewById(Ac.e.rtvSave) : null;
        this.f4398c = view != null ? (ImageView) view.findViewById(Ac.e.ivFinger) : null;
    }
}

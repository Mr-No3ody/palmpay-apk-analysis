package Ke;

import Ab.C;
import Bc.B;
import Gb.T;
import N8.q0;
import Pa.F;
import Pa.k0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.mtn.sdk.MTN;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.StateImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.TransactionHistoryBean;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f5449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MeTabTotalAssetInfo f5450d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f5452f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5454i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f5451e = C2131j.b(new G9.j(27));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5453g = new ArrayList();

    public i(View view) {
        View viewM;
        if (view != null) {
            ViewStub viewStub = (ViewStub) view.findViewById(Ac.e.layoutAssetsStub);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            if (viewInflate != null) {
                this.f5447a = viewInflate.getContext();
                this.f5448b = viewInflate;
                int i7 = Ac.e.barrier;
                if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = Ac.e.bottomBarrier;
                    if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = Ac.e.bottomGroup;
                        Group group = (Group) p059e1.a.m(i7, viewInflate);
                        if (group != null && (viewM = p059e1.a.m((i7 = Ac.e.dividerView), viewInflate)) != null) {
                            i7 = Ac.e.groupNotNetwork;
                            Group group2 = (Group) p059e1.a.m(i7, viewInflate);
                            if (group2 != null) {
                                i7 = Ac.e.ivAmountArrow;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = Ac.e.ivArrow;
                                    IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                    if (iconicsImageView2 != null) {
                                        i7 = Ac.e.ivBg;
                                        if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                            i7 = Ac.e.ivEye;
                                            StateImageView stateImageView = (StateImageView) p059e1.a.m(i7, viewInflate);
                                            if (stateImageView != null) {
                                                i7 = Ac.e.ivTipsBg;
                                                if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = Ac.e.layoutAssets;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                    if (constraintLayout != null) {
                                                        i7 = Ac.e.layoutTransHistory;
                                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                        if (linearLayout != null) {
                                                            i7 = Ac.e.layoutUserLevelStub;
                                                            ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                            if (viewStub2 != null) {
                                                                i7 = Ac.e.ll_monthly_overview;
                                                                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                if (linearLayout2 != null) {
                                                                    i7 = Ac.e.loadingView;
                                                                    ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) p059e1.a.m(i7, viewInflate);
                                                                    if (contentLoadingProgressBar != null) {
                                                                        i7 = Ac.e.transItem1Stub;
                                                                        ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                        if (viewStub3 != null) {
                                                                            i7 = Ac.e.transItem2Stub;
                                                                            ViewStub viewStub4 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                            if (viewStub4 != null) {
                                                                                i7 = Ac.e.tvAmount;
                                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView != null) {
                                                                                    i7 = Ac.e.tvAmount2;
                                                                                    ImageTextView imageTextView = (ImageTextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (imageTextView != null) {
                                                                                        i7 = Ac.e.tvNetworkTips;
                                                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView2 != null) {
                                                                                            i7 = Ac.e.tvTitle;
                                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView3 != null) {
                                                                                                i7 = Ac.e.tvTitle1;
                                                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView4 != null) {
                                                                                                    i7 = Ac.e.tvTransHistory;
                                                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                    if (textView5 != null) {
                                                                                                        this.f5449c = new B((ConstraintLayout) viewInflate, group, viewM, group2, iconicsImageView, iconicsImageView2, stateImageView, constraintLayout, linearLayout, viewStub2, linearLayout2, contentLoadingProgressBar, viewStub3, viewStub4, textView, imageTextView, textView2, textView3, textView4, textView5);
                                                                                                        stateImageView.setOnClickListener(this);
                                                                                                        textView.setOnClickListener(this);
                                                                                                        textView3.setOnClickListener(this);
                                                                                                        textView5.setOnClickListener(this);
                                                                                                        iconicsImageView2.setOnClickListener(this);
                                                                                                        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                                                                                                        this.f5452f = new j(viewStub2, constraintLayout);
                                                                                                        ViewStub[] elements = {viewStub3, viewStub4};
                                                                                                        Intrinsics.checkNotNullParameter(elements, "elements");
                                                                                                        Iterator it = C1847n.r(elements).iterator();
                                                                                                        while (it.hasNext()) {
                                                                                                            this.f5453g.add(new a((ViewStub) it.next()));
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
            }
        }
    }

    public final void a(boolean z3) {
        B b7 = this.f5449c;
        if (b7 != null) {
            p220oa.h.s((ContentLoadingProgressBar) b7.f600p, z3);
        }
        boolean z8 = !z3;
        B b10 = this.f5449c;
        if (b10 != null) {
            IconicsImageView iconicsImageView = (IconicsImageView) b10.f598j;
            boolean z10 = false;
            if (!z3 && p059e1.a.C("main_sp_show_balance", false)) {
                z10 = true;
            }
            p220oa.h.s(iconicsImageView, z10);
        }
        if (b7 != null) {
            p220oa.h.s((StateImageView) b7.f599o, z8);
        }
        this.f5454i = z3;
        c(!NQEManager.INSTANCE.isNetworkOffline());
    }

    public final void b(boolean z3) {
        View view = this.f5448b;
        if (view != null) {
            p220oa.h.s(view, z3);
        }
    }

    public final void c(boolean z3) {
        ImageTextView imageTextView;
        AppCompatTextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Group group;
        B b7 = this.f5449c;
        if (b7 != null && (group = (Group) b7.f596g) != null) {
            p220oa.h.s(group, !z3);
        }
        if (!z3) {
            if (TextUtils.isEmpty((b7 == null || (textView4 = (TextView) b7.t) == null) ? null : textView4.getText()) && b7 != null && (textView3 = (TextView) b7.t) != null) {
                textView3.setText(Ac.h.main_not_network_amount_tips);
            }
        }
        if (z3) {
            return;
        }
        if (b7 != null && (textView2 = b7.f594e) != null) {
            textView2.setText("--");
        }
        if (b7 == null || (imageTextView = (ImageTextView) b7.f589B) == null || (textView = imageTextView.getTextView()) == null) {
            return;
        }
        textView.setText("--");
    }

    public final void d(List list) {
        t tVar = this.f5451e;
        ((List) tVar.getValue()).clear();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ((List) tVar.getValue()).addAll(list2);
        }
        e((List) tVar.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    public final void e(List list) {
        int iColorInt;
        int inflatedId;
        View viewFindViewById;
        List list2 = list;
        B b7 = this.f5449c;
        if (list2 == null || list2.isEmpty()) {
            if (b7 != null) {
                p220oa.h.s((LinearLayout) b7.f591b, false);
                return;
            }
            return;
        }
        if (b7 != null) {
            p220oa.h.s((LinearLayout) b7.f591b, true);
        }
        n0.g().l("Me_TxnHistory_View");
        if (list == null) {
            list = z.f38935a;
        }
        int i7 = 0;
        for (Object obj : this.f5453g) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            a aVar = (a) obj;
            TransactionHistoryBean transactionHistoryBean = (TransactionHistoryBean) CollectionsKt.G(i7, list);
            if (transactionHistoryBean == null) {
                View view = aVar.f5417b;
                if (view != null) {
                    p220oa.h.s(view, false);
                }
            } else {
                if (aVar.f5417b == null) {
                    ViewStub viewStub = aVar.f5416a;
                    if (viewStub != null) {
                        try {
                            viewFindViewById = viewStub.inflate();
                        } catch (Exception unused) {
                            ViewParent parent = viewStub.getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup == null || (inflatedId = viewStub.getInflatedId()) == -1) {
                                viewFindViewById = null;
                            } else {
                                viewFindViewById = viewGroup.findViewById(inflatedId);
                            }
                        }
                    } else {
                        viewFindViewById = null;
                    }
                    aVar.f5417b = viewFindViewById;
                    if (viewFindViewById != null) {
                        aVar.f5418c = (ImageView) viewFindViewById.findViewById(Ac.e.ivIcon);
                        aVar.f5419d = (TextView) viewFindViewById.findViewById(Ac.e.tvDesc);
                        aVar.f5420e = (TextView) viewFindViewById.findViewById(Ac.e.tvAmount);
                        aVar.f5421f = (TextView) viewFindViewById.findViewById(Ac.e.tvTime);
                        aVar.f5422g = (TextView) viewFindViewById.findViewById(Ac.e.tvStatus);
                        viewFindViewById.setOnClickListener(new K8.a(5));
                    }
                }
                boolean zC = p059e1.a.C("main_sp_show_balance", false);
                View view2 = aVar.f5417b;
                if (view2 != null) {
                    p220oa.h.s(view2, true);
                }
                TextView textView = aVar.f5419d;
                if (textView != null) {
                    textView.setText(transactionHistoryBean.transTypeDesc);
                }
                TextView textView2 = aVar.f5420e;
                if (textView2 != null) {
                    textView2.setText(!zC ? "****" : transactionHistoryBean.displayAmount);
                }
                TextView textView3 = aVar.f5421f;
                if (textView3 != null) {
                    textView3.setText(new SimpleDateFormat("MMM dd, h:mm aa", Locale.ENGLISH).format(Long.valueOf(transactionHistoryBean.updateTime)));
                }
                String str = transactionHistoryBean.orderStatus;
                if ("Pending".equalsIgnoreCase(str)) {
                    str = "Processing";
                }
                TextView textView4 = aVar.f5422g;
                if (textView4 != null) {
                    String str2 = transactionHistoryBean.orderStatus;
                    if (str2 == null) {
                        str2 = "";
                    }
                    textView4.setText(str2);
                }
                Intrinsics.e(str);
                View view3 = aVar.f5417b;
                Context context = view3 != null ? view3.getContext() : null;
                if ("Waiting to receive".equalsIgnoreCase(str) || "Waiting to pay".equalsIgnoreCase(str) || "Pending".equalsIgnoreCase(str) || "Processing".equalsIgnoreCase(str)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorWarning, context);
                } else if ("Successful".equalsIgnoreCase(str)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorSuccess, context);
                } else if ("Failed".equalsIgnoreCase(str) || "Declined".equalsIgnoreCase(str)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorError, context);
                } else if ("Cancelled".equalsIgnoreCase(str) || "Expired".equalsIgnoreCase(str) || "Closed".equalsIgnoreCase(str)) {
                    iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, context);
                } else {
                    iColorInt = "Refunded".equalsIgnoreCase(str) ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, context) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context);
                }
                if (iColorInt != -1) {
                    TextView textView5 = aVar.f5422g;
                    if (textView5 != null) {
                        textView5.setTextColor(iColorInt);
                    }
                } else {
                    TextView textView6 = aVar.f5422g;
                    if (textView6 != null) {
                        int i11 = L6.b.ppColorTextNormal;
                        View view4 = aVar.f5417b;
                        textView6.setTextColor(CommonViewExtKt.colorInt(i11, view4 != null ? view4.getContext() : null));
                    }
                }
                if (TextUtils.isEmpty(transactionHistoryBean.companyIconUrl)) {
                    ImageView imageView = aVar.f5418c;
                    Uri iconUriByTransType = transactionHistoryBean.getIconUriByTransType();
                    int iconIdByTransType = transactionHistoryBean.getIconIdByTransType();
                    r0.g1(imageView, iconUriByTransType, (G1.d) G1.d.O(iconIdByTransType).j(iconIdByTransType));
                } else {
                    ImageView imageView2 = aVar.f5418c;
                    String str3 = transactionHistoryBean.companyIconUrl;
                    r0.u1(imageView2, str3 != null ? str3 : "", transactionHistoryBean.getIconIdByTransType());
                }
            }
            i7 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02a3  */
    public final void f(MeTabTotalAssetInfo meTabTotalAssetInfo) {
        String str;
        TextView textView;
        int inflatedId;
        View viewFindViewById;
        String str2;
        AppCompatImageView imageView;
        AppCompatTextView textView2;
        SpannableStringBuilder spannableStringBuilderB;
        AppCompatImageView imageView2;
        this.f5450d = meTabTotalAssetInfo;
        j jVar = this.f5452f;
        B b7 = this.f5449c;
        boolean z3 = false;
        if (meTabTotalAssetInfo == null || !BaseApplication.hasLogin() || d0.t()) {
            if (b7 != null) {
                p220oa.h.c((StateImageView) b7.f599o);
            }
            if (b7 != null) {
                b7.f594e.setText("--");
            }
            if (b7 != null) {
                p220oa.h.c((Group) b7.f595f);
            }
            if (b7 != null) {
                ((LinearLayout) b7.f592c).setVisibility(8);
            }
            b(BaseApplication.hasLogin());
            if (jVar != null) {
                jVar.a(false);
            }
            e(null);
        } else {
            boolean zC = p059e1.a.C("main_sp_show_balance", false);
            Context context = this.f5447a;
            CharSequence charSequenceCreate = "****";
            if (context != null) {
                if (b7 != null) {
                    p220oa.h.C((StateImageView) b7.f599o);
                }
                if (b7 != null) {
                    StateImageView stateImageView = (StateImageView) b7.f599o;
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(context, zC ? S6.a.pay_Show : S6.a.pay_Hide);
                    iconicsDrawable.a(new C(this, 21));
                    stateImageView.setImageDrawable(iconicsDrawable);
                }
                if (b7 != null) {
                    p220oa.h.C((Group) b7.f595f);
                }
                if (b7 != null) {
                    ((LinearLayout) b7.f592c).setVisibility(com.transsnet.palmpay.core.config.d.s() ? 0 : 8);
                }
                if (b7 != null) {
                    ((LinearLayout) b7.f592c).setOnClickListener(new K8.a(7));
                }
                if (b7 != null) {
                    ((TextView) b7.f602w).setText(meTabTotalAssetInfo.operationTitle);
                }
                String str3 = meTabTotalAssetInfo.operationContent;
                if (zC || str3 == null || str3.length() == 0) {
                    if (b7 != null && (imageView = ((ImageTextView) b7.f589B).getImageView()) != null) {
                        p220oa.h.C(imageView);
                    }
                    str2 = str3;
                } else {
                    if (b7 != null && (imageView2 = ((ImageTextView) b7.f589B).getImageView()) != null) {
                        p220oa.h.c(imageView2);
                    }
                    str2 = "****";
                }
                if (b7 != null && (textView2 = ((ImageTextView) b7.f589B).getTextView()) != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    ConstraintLayout constraintLayout = (ConstraintLayout) b7.f593d;
                    if (zIsEmpty) {
                        spannableStringBuilderB = p220oa.h.B("To be update", constraintLayout.getContext(), null, null, 18, null, Typeface.create("sans-serif-medium", 0), MTN.RESULT_CANCEL);
                    } else {
                        Intrinsics.e(str2);
                        spannableStringBuilderB = p220oa.h.B(str2, constraintLayout.getContext(), null, null, 18, null, null, 918);
                    }
                    textView2.setText(spannableStringBuilderB);
                }
                if (!TextUtils.isEmpty(meTabTotalAssetInfo.operationButtonContent) && b7 != null) {
                    ((ImageTextView) b7.f589B).setOnClickListener(new T(11, context, meTabTotalAssetInfo));
                }
            }
            if (b7 != null) {
                TextView textView3 = b7.f594e;
                Long l5 = meTabTotalAssetInfo.totalAssets;
                long jLongValue = l5 != null ? l5.longValue() : 0L;
                String str4 = meTabTotalAssetInfo.fallbackText;
                if (zC) {
                    if (TextUtils.isEmpty(str4)) {
                        String strB = jLongValue >= 0 ? r0.B(jLongValue, true) : "--";
                        Intrinsics.e(strB);
                        charSequenceCreate = strB;
                    } else {
                        SpanUtils spanUtils = new SpanUtils();
                        Intrinsics.e(str4);
                        charSequenceCreate = spanUtils.append(str4).setFontFamily("sans-serif").create();
                        Intrinsics.checkNotNullExpressionValue(charSequenceCreate, "create(...)");
                    }
                }
                textView3.setText(charSequenceCreate);
            }
            if (jVar != null) {
                User user = BaseApplication.get().getUser();
                String str5 = meTabTotalAssetInfo.authAndroidLinkUrl;
                if (user != null) {
                    jVar.getClass();
                    if (user.isTier0User() || user.isTier3User()) {
                        jVar.a(false);
                    } else {
                        jVar.f5461g = str5;
                        jVar.f5462i = user.getMobileMoneyAccountTier();
                        if (jVar.f5457c == null) {
                            ViewStub viewStub = jVar.f5455a;
                            try {
                                viewFindViewById = viewStub.inflate();
                            } catch (Exception unused) {
                                ViewParent parent = viewStub.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                viewFindViewById = (viewGroup == null || (inflatedId = viewStub.getInflatedId()) == -1) ? null : viewGroup.findViewById(inflatedId);
                            }
                            jVar.f5457c = viewFindViewById;
                            if (viewFindViewById != null) {
                                jVar.f5458d = (TextView) viewFindViewById.findViewById(Ac.e.tvUpgrade);
                                jVar.f5459e = (PpButton) viewFindViewById.findViewById(Ac.e.btnUpgrade);
                                jVar.f5460f = (LottieAnimationView) viewFindViewById.findViewById(Ac.e.ivUpgrade);
                                PpButton ppButton = jVar.f5459e;
                                if (ppButton != null) {
                                    ppButton.setOnClickListener(jVar);
                                }
                                TextView textView4 = jVar.f5458d;
                                if (textView4 != null) {
                                    textView4.setOnClickListener(jVar);
                                }
                                LottieAnimationView lottieAnimationView = jVar.f5460f;
                                if (lottieAnimationView != null) {
                                    lottieAnimationView.setRepeatCount(5);
                                    lottieAnimationView.setAnimation(Ac.g.main_upgrade);
                                    lottieAnimationView.e();
                                }
                            }
                        }
                        jVar.a(true);
                        if ("2".equals(user.getMobileMoneyAccountTier())) {
                            str = "Tier 3";
                        } else {
                            str = "1".equals(user.getMobileMoneyAccountTier()) ? "Tier 2" : null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            jVar.a(false);
                        } else {
                            if ("2".equals(user.getMobileMoneyAccountTier())) {
                                TextView textView5 = jVar.f5458d;
                                if (textView5 != null) {
                                    SpannableString spannableString = new SpannableString(q0.k("Upgrade to ", str, " for unlimited limits"));
                                    int i7 = L6.b.ppColorPrimary;
                                    View view = jVar.f5457c;
                                    k0.d(spannableString, str, CommonViewExtKt.colorInt(i7, view != null ? view.getContext() : null), CommonViewExtKt.getDp(12.0f), "sans-serif-medium");
                                    textView5.setText(spannableString);
                                }
                            } else if ("1".equals(user.getMobileMoneyAccountTier()) && (textView = jVar.f5458d) != null) {
                                SpannableString spannableString2 = new SpannableString(q0.k("Upgrade to ", str, " for higher limit"));
                                int i10 = L6.b.ppColorPrimary;
                                View view2 = jVar.f5457c;
                                k0.d(spannableString2, str, CommonViewExtKt.colorInt(i10, view2 != null ? view2.getContext() : null), CommonViewExtKt.getDp(12.0f), "sans-serif-medium");
                                textView.setText(spannableString2);
                            }
                            HashMap map = new HashMap();
                            map.put("currentLevel", user.getMobileMoneyAccountTier());
                            n0.g().n("Me_KYCUpgrade_View", map);
                        }
                    }
                } else {
                    jVar.a(false);
                }
            }
            e((List) this.f5451e.getValue());
        }
        if (b7 != null) {
            p220oa.h.s((ContentLoadingProgressBar) b7.f600p, this.f5454i);
        }
        boolean z8 = this.f5454i;
        B b10 = this.f5449c;
        if (b10 != null) {
            IconicsImageView iconicsImageView = (IconicsImageView) b10.f598j;
            if (!z8 && p059e1.a.C("main_sp_show_balance", false)) {
                z3 = true;
            }
            p220oa.h.s(iconicsImageView, z3);
        }
        c(!NQEManager.INSTANCE.isNetworkOffline());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = Ac.e.tvAmount;
        if (numValueOf == null || numValueOf.intValue() != i7) {
            int i10 = Ac.e.tvTitle;
            if (numValueOf == null || numValueOf.intValue() != i10) {
                int i11 = Ac.e.ivEye;
                if (numValueOf != null && numValueOf.intValue() == i11) {
                    p059e1.a.X("main_sp_show_balance", !p059e1.a.C("main_sp_show_balance", false));
                    MeTabTotalAssetInfo meTabTotalAssetInfo = this.f5450d;
                    if (meTabTotalAssetInfo != null) {
                        f(meTabTotalAssetInfo);
                    }
                    r0.P1(MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
                    return;
                }
                int i12 = Ac.e.tvTransHistory;
                if (numValueOf == null || numValueOf.intValue() != i12) {
                    int i13 = Ac.e.ivArrow;
                    if (numValueOf == null || numValueOf.intValue() != i13) {
                        return;
                    }
                }
                n0.g().l("Me_TxnHistory_Click");
                com.palmpay.lib.apm.launchcounter.util.d.F("/main/trans_history");
                return;
            }
        }
        MeTabTotalAssetInfo meTabTotalAssetInfo2 = this.f5450d;
        if (TextUtils.isEmpty(meTabTotalAssetInfo2 != null ? meTabTotalAssetInfo2.totalAssetsAndroidLinkUrl : null)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/my_assets_page");
            return;
        }
        View view2 = this.f5448b;
        Context context = view2 != null ? view2.getContext() : null;
        MeTabTotalAssetInfo meTabTotalAssetInfo3 = this.f5450d;
        ActivityUtils.startActivity(F.a(context, meTabTotalAssetInfo3 != null ? meTabTotalAssetInfo3.totalAssetsAndroidLinkUrl : null));
    }
}

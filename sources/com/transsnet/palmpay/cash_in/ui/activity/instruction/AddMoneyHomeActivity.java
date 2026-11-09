package com.transsnet.palmpay.cash_in.ui.activity.instruction;

import Aa.a;
import Ab.ViewOnClickListenerC0053e;
import Ae.j;
import Bc.f;
import Bc.y;
import C9.C0144k;
import C9.C0158z;
import Ce.ViewOnClickListenerC0159a;
import D9.c;
import H9.b;
import J9.C0317a;
import J9.C0318b;
import J9.C0319c;
import J9.C0320d;
import J9.C0321e;
import L6.d;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.cash_in.bean.response.CashHomeRewardsInfo;
import com.transsnet.palmpay.cash_in.ui.viewmodel.AddMoneyViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.widget.CashBoxTrialCashEntryLayout;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin_out/add_money")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/instruction/AddMoneyHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/AddMoneyViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "D9/b", "D9/c", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddMoneyHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMoneyHomeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/instruction/AddMoneyHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n115#2,8:528\n145#2:536\n115#2,8:537\n145#2:545\n115#2,8:546\n145#2:554\n115#2,8:555\n145#2:563\n115#2,8:564\n145#2:572\n1#3:573\n*S KotlinDebug\n*F\n+ 1 AddMoneyHomeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/instruction/AddMoneyHomeActivity\n*L\n208#1:528,8\n208#1:536\n218#1:537,8\n218#1:545\n231#1:546,8\n231#1:554\n239#1:555,8\n239#1:563\n257#1:564,8\n257#1:572\n*E\n"})
public final class AddMoneyHomeActivity extends BaseMvvmActivity<AddMoneyViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f26973o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f26974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26975d = C2131j.b(new a(20));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26976e = C2131j.b(new j(this, 10));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CashBoxTrialCashEntryLayout f26977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f26978g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f26979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f26980j;

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    public static final void m(AddMoneyHomeActivity addMoneyHomeActivity, CashHomeRewardsInfo cashHomeRewardsInfo) {
        String showIcon;
        String moduleBackgroundUrl;
        View viewInflate;
        if (cashHomeRewardsInfo == null) {
            View view = addMoneyHomeActivity.f26979i;
            if (view != null) {
                h.c(view);
                return;
            }
            return;
        }
        if (addMoneyHomeActivity.f26978g == null) {
            f fVar = addMoneyHomeActivity.f26980j;
            if (fVar == null || (viewInflate = ((ViewStub) fVar.f702i).inflate()) == null) {
                return;
            }
            addMoneyHomeActivity.f26979i = viewInflate;
            addMoneyHomeActivity.f26978g = new b(viewInflate, addMoneyHomeActivity.isDarkMode());
        }
        View view2 = addMoneyHomeActivity.f26979i;
        if (view2 != null) {
            h.C(view2);
        }
        b bVar = addMoneyHomeActivity.f26978g;
        if (bVar != null) {
            y yVar = bVar.f3770c;
            TextView textView = yVar.f885j;
            String showTitle = cashHomeRewardsInfo.getShowTitle();
            if (showTitle == null) {
                showTitle = "";
            }
            textView.setText(showTitle);
            String showContent = cashHomeRewardsInfo.getShowContent();
            if (showContent == null) {
                showContent = "";
            }
            TextView textView2 = yVar.f883g;
            textView2.setText(showContent);
            int i7 = L6.b.ppColorTextNormal;
            View view3 = bVar.f3768a;
            textView2.setTextColor(CommonViewExtKt.colorInt(i7, view3.getContext()));
            textView2.setOnClickListener(null);
            RoundedTextView tvLabel = yVar.f884i;
            Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
            String showLabel = cashHomeRewardsInfo.getShowLabel();
            if (TextUtils.isEmpty(showLabel)) {
                h.s(tvLabel, false);
                tvLabel.setCompoundDrawablesRelative(null, null, null, null);
            } else {
                h.s(tvLabel, true);
                tvLabel.setText(showLabel);
            }
            n0 n0VarG = n0.g();
            ViewEvent viewEventAdd = new ViewEvent("AddMoney_RewardTask_View").add("buttonContent", cashHomeRewardsInfo.getButtonContent());
            String taskNo = cashHomeRewardsInfo.getTaskNo();
            if (taskNo == null) {
                taskNo = "";
            }
            n0VarG.u(viewEventAdd.add("taskNo", taskNo));
            boolean z3 = bVar.f3769b;
            if (z3) {
                showIcon = cashHomeRewardsInfo.getDarkShowIcon();
                if (showIcon == null) {
                    showIcon = cashHomeRewardsInfo.getShowIcon();
                    if (showIcon != null || showIcon.length() <= 0) {
                        showIcon = null;
                    }
                } else {
                    if (showIcon.length() <= 0) {
                        showIcon = null;
                    }
                    if (showIcon == null) {
                        showIcon = cashHomeRewardsInfo.getShowIcon();
                        if (showIcon != null) {
                            showIcon = null;
                        } else {
                            showIcon = null;
                        }
                    }
                }
            } else {
                showIcon = cashHomeRewardsInfo.getShowIcon();
                if (showIcon == null || showIcon.length() <= 0) {
                    showIcon = null;
                }
            }
            if (showIcon != null) {
                if (showIcon.length() <= 0) {
                    showIcon = null;
                }
                if (showIcon != null) {
                    r0.h1(yVar.f882f, showIcon, r.cv_default_palmpay_icon_gray);
                }
            }
            if (z3) {
                moduleBackgroundUrl = cashHomeRewardsInfo.getDarkModeModuleBackgroundUrl();
                if (moduleBackgroundUrl == null) {
                    moduleBackgroundUrl = cashHomeRewardsInfo.getModuleBackgroundUrl();
                    if (moduleBackgroundUrl != null || moduleBackgroundUrl.length() <= 0) {
                        moduleBackgroundUrl = null;
                    }
                } else {
                    if (moduleBackgroundUrl.length() <= 0) {
                        moduleBackgroundUrl = null;
                    }
                    if (moduleBackgroundUrl == null) {
                        moduleBackgroundUrl = cashHomeRewardsInfo.getModuleBackgroundUrl();
                        if (moduleBackgroundUrl != null) {
                            moduleBackgroundUrl = null;
                        } else {
                            moduleBackgroundUrl = null;
                        }
                    }
                }
            } else {
                moduleBackgroundUrl = cashHomeRewardsInfo.getModuleBackgroundUrl();
                if (moduleBackgroundUrl == null || moduleBackgroundUrl.length() <= 0) {
                    moduleBackgroundUrl = null;
                }
            }
            if (moduleBackgroundUrl != null) {
                String str = moduleBackgroundUrl.length() > 0 ? moduleBackgroundUrl : null;
                if (str != null) {
                    r0.h1(yVar.f881e, str, r.cv_shape_rect_corner_12_bg_white);
                }
            }
            PpButton btnRight = yVar.f879c;
            btnRight.b(false);
            String buttonContent = cashHomeRewardsInfo.getButtonContent();
            btnRight.setText(buttonContent != null ? buttonContent : "");
            Intrinsics.checkNotNullExpressionValue(btnRight, "btnRight");
            Context context = view3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(btnRight, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            btnRight.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, context));
            btnRight.setBackgroundResource(d.lib_ui_button_bg_corner_primary_4);
            View view4 = yVar.f880d;
            view4.setTag(cashHomeRewardsInfo);
            view4.setOnClickListener(bVar.f3771d);
        }
    }

    public static String n(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (TextUtils.isEmpty(number)) {
            return number;
        }
        if (number.length() == 11) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = number.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append("  ");
            String strSubstring2 = number.substring(3, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            sb2.append("  ");
            String strSubstring3 = number.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            sb2.append(strSubstring3);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (number.length() != 10 && number.length() != 9) {
            return number;
        }
        StringBuilder sb3 = new StringBuilder();
        String strSubstring4 = number.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        sb3.append(strSubstring4);
        sb3.append("  ");
        String strSubstring5 = number.substring(3, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        sb3.append(strSubstring5);
        sb3.append("  ");
        String strSubstring6 = number.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
        sb3.append(strSubstring6);
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String strN;
        String displayAccountNumber = BaseApplication.getInstance().getUser().getDisplayAccountNumber();
        String phoneNumber = BaseApplication.getInstance().getUser().getPhoneNumber();
        if (!TextUtils.isEmpty(displayAccountNumber) && !Intrinsics.c(displayAccountNumber, phoneNumber) && com.transsnet.palmpay.core.config.d.u()) {
            Intrinsics.e(displayAccountNumber);
            strN = n(displayAccountNumber);
        } else if (TextUtils.isEmpty(phoneNumber) || phoneNumber.length() <= 5) {
            strN = "";
        } else {
            String strSubstring = phoneNumber.substring(5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            strN = n(strSubstring);
        }
        c cVar = this.f26974c;
        if (cVar != null) {
            int i7 = r.cv_bank_transfer;
            int i10 = p366y9.d.ci_fund_with_bank;
            int i11 = p366y9.d.ci_msg_fund_with_bank;
            D9.a aVar = new D9.a(this, 1);
            cVar.f1706b.setImageResource(i7);
            cVar.f1709e.setText(i10);
            cVar.f1710f.setText(i11);
            User user = BaseApplication.get().getUser();
            boolean z3 = !TextUtils.isEmpty(user.getUserLevel());
            IconicsTextView iconicsTextView = cVar.f1712h;
            h.s(iconicsTextView, z3);
            h.s(cVar.f1708d, !TextUtils.isEmpty(user.getUserLevel()));
            if (user.isTier3User()) {
                iconicsTextView.setText(user.getUserLevel());
            } else if (user.isTier2User()) {
                iconicsTextView.setText("Upgrade Tier 3");
            } else if (user.isTier0User()) {
                iconicsTextView.setText("Verify Your Identity");
            } else {
                iconicsTextView.setText("Upgrade Tier 2");
            }
            cVar.f1711g.setText(strN);
            cVar.f1716l.setOnClickListener(aVar);
            ViewOnClickListenerC0053e viewOnClickListenerC0053e = new ViewOnClickListenerC0053e(6);
            IconicsTextView iconicsTextView2 = cVar.f1715k;
            iconicsTextView2.setOnClickListener(viewOnClickListenerC0053e);
            h.s(iconicsTextView2, com.transsnet.palmpay.core.config.d.u());
            cVar.f1713i.setOnClickListener(new ViewOnClickListenerC0159a(cVar, 5));
            cVar.f1714j.setOnClickListener(new A8.c(14, cVar.f1717m, cVar));
        }
        f fVar = this.f26980j;
        if (fVar != null) {
            ((RecyclerView) fVar.f700f).setLayoutManager(new LinearLayoutManager(this));
        }
        f fVar2 = this.f26980j;
        if (fVar2 != null) {
            RecyclerView recyclerView = (RecyclerView) fVar2.f700f;
            C1548f c1548f = new C1548f(getColor(p.transparent), DensityUtil.dp2px(12.0f));
            c1548f.f31336e = false;
            recyclerView.addItemDecoration(c1548f);
        }
        f fVar3 = this.f26980j;
        if (fVar3 != null) {
            ((RecyclerView) fVar3.f700f).setAdapter((D9.b) this.f26975d.getValue());
        }
        f fVar4 = this.f26980j;
        if (fVar4 != null) {
            BannerAdView bannerAdView = (BannerAdView) fVar4.f698d;
            bannerAdView.setAdListener(new com.chuanyi.ad.a(bannerAdView, this.TAG));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
        BarUtils.setStatusBarLightMode(this, true ^ isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(p366y9.c.ci_activity_add_money_home, (ViewGroup) null, false);
        int i7 = p366y9.b.adView;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = p366y9.b.ca_bottom_ad;
            if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = p366y9.b.layoutInterBank), viewInflate)) != null) {
                int i10 = p366y9.b.cl_account_info;
                if (((ConstraintLayout) p059e1.a.m(i10, viewM)) != null) {
                    i10 = p366y9.b.csl_top;
                    if (((ConstraintLayout) p059e1.a.m(i10, viewM)) != null) {
                        i10 = p366y9.b.ivCopy;
                        if (((IconicsImageView) p059e1.a.m(i10, viewM)) != null) {
                            i10 = p366y9.b.ivCorner;
                            if (((ImageView) p059e1.a.m(i10, viewM)) != null) {
                                i10 = p366y9.b.ivExchange;
                                if (((IconicsTextView) p059e1.a.m(i10, viewM)) != null) {
                                    i10 = p366y9.b.ivIcon;
                                    if (((ImageView) p059e1.a.m(i10, viewM)) != null) {
                                        i10 = p366y9.b.ivLevel;
                                        if (((ImageView) p059e1.a.m(i10, viewM)) != null) {
                                            i10 = p366y9.b.ivLogo;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i10, viewM);
                                            if (appCompatImageView != null) {
                                                i10 = p366y9.b.ivNext;
                                                if (((IconicsImageView) p059e1.a.m(i10, viewM)) != null) {
                                                    i10 = p366y9.b.llSourceView;
                                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewM);
                                                    if (linearLayout != null) {
                                                        i10 = p366y9.b.rtvCopy;
                                                        if (((PpButton) p059e1.a.m(i10, viewM)) != null) {
                                                            i10 = p366y9.b.rtvShare;
                                                            if (((PpButton) p059e1.a.m(i10, viewM)) != null) {
                                                                i10 = p366y9.b.tvAccountNo;
                                                                TextView textView = (TextView) p059e1.a.m(i10, viewM);
                                                                if (textView != null) {
                                                                    i10 = p366y9.b.tvContent;
                                                                    TextView textView2 = (TextView) p059e1.a.m(i10, viewM);
                                                                    if (textView2 != null) {
                                                                        i10 = p366y9.b.tvLevel;
                                                                        if (((IconicsTextView) p059e1.a.m(i10, viewM)) != null) {
                                                                            i10 = p366y9.b.tvLine1;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i10, viewM);
                                                                            if (textView3 != null) {
                                                                                i10 = p366y9.b.tvLine2;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i10, viewM);
                                                                                if (textView4 != null) {
                                                                                    i10 = p366y9.b.tv_top_tip;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i10, viewM);
                                                                                    if (textView5 != null) {
                                                                                        f fVar = new f((ConstraintLayout) viewM, appCompatImageView, linearLayout, textView, textView2, textView3, textView4, textView5);
                                                                                        i7 = p366y9.b.rvMenuList;
                                                                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                                                        if (recyclerView != null) {
                                                                                            i7 = p366y9.b.titleBar;
                                                                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                                            if (ppTitleBar != null) {
                                                                                                i7 = p366y9.b.viewMarquee;
                                                                                                MarqueeView marqueeView = (MarqueeView) p059e1.a.m(i7, viewInflate);
                                                                                                if (marqueeView != null) {
                                                                                                    i7 = p366y9.b.vs_cashbox_trial_cash;
                                                                                                    ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                    if (viewStub != null) {
                                                                                                        i7 = p366y9.b.vsRewardsCommon;
                                                                                                        ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                        if (viewStub2 != null) {
                                                                                                            f fVar2 = new f((LinearLayout) viewInflate, bannerAdView, fVar, recyclerView, ppTitleBar, marqueeView, viewStub, viewStub2);
                                                                                                            this.f26980j = fVar2;
                                                                                                            return fVar2;
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
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        int eventType = messageEvent.getEventType();
        if (eventType != 4) {
            if (eventType != 7) {
                return;
            }
            finish();
        } else {
            c cVar = this.f26974c;
            if (cVar != null) {
                cVar.f1711g.setText(BaseApplication.getInstance().getUser().getFormatAccountNumber());
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        AddMoneyViewModel addMoneyViewModel;
        super.onResume();
        AddMoneyViewModel addMoneyViewModel2 = (AddMoneyViewModel) l();
        addMoneyViewModel2.getClass();
        p140j8.f.s(addMoneyViewModel2, new C0319c(1, null), addMoneyViewModel2.f27089e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        AddMoneyViewModel addMoneyViewModel3 = (AddMoneyViewModel) l();
        addMoneyViewModel3.getClass();
        p140j8.f.s(addMoneyViewModel3, new C0320d(1, null), addMoneyViewModel3.f27090f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        AddMoneyViewModel addMoneyViewModel4 = (AddMoneyViewModel) l();
        addMoneyViewModel4.getClass();
        p140j8.f.s(addMoneyViewModel4, new C0318b(1, null), addMoneyViewModel4.f27091g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        AddMoneyViewModel addMoneyViewModel5 = (AddMoneyViewModel) l();
        addMoneyViewModel5.getClass();
        p140j8.f.s(addMoneyViewModel5, new C0321e(1, null), addMoneyViewModel5.f27092i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        t tVar = this.f26976e;
        String sence = (String) tVar.getValue();
        if (sence != null) {
            if (TextUtils.isEmpty((String) tVar.getValue())) {
                sence = null;
            }
            if (sence == null || (addMoneyViewModel = (AddMoneyViewModel) l()) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(sence, "sence");
            p140j8.f.s(addMoneyViewModel, new C0317a(sence, null), addMoneyViewModel.f27093j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((AddMoneyViewModel) l()).f27089e;
        if (lVar != null) {
            lVar.e(this, new C0144k(new D9.d(this, 0), 13));
        }
        l lVar2 = ((AddMoneyViewModel) l()).f27090f;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new D9.d(this, 1), 13));
        }
        l lVar3 = ((AddMoneyViewModel) l()).f27092i;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new D9.d(this, 2), 13));
        }
        l lVar4 = ((AddMoneyViewModel) l()).f27091g;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new D9.d(this, 3), 13));
        }
        l lVar5 = ((AddMoneyViewModel) l()).f27093j;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new D9.d(this, 4), 13));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        org.greenrobot.eventbus.c.b().j(this);
        f fVar = this.f26980j;
        if (fVar != null) {
            this.f26974c = new c(this, (ConstraintLayout) ((f) fVar.f699e).f698d);
        }
        n0.g().v("View_Fund");
        f fVar2 = this.f26980j;
        if (fVar2 != null) {
            ((PpTitleBar) fVar2.f703j).setRightImageView1ClickListener(new ViewOnClickListenerC0053e(5));
        }
        f fVar3 = this.f26980j;
        if (fVar3 != null) {
            ((PpTitleBar) fVar3.f703j).setBackButtonClickListener(new D9.a(this, 2));
        }
        f fVar4 = this.f26980j;
        if (fVar4 != null) {
            ((MarqueeView) fVar4.f701g).setAdListener(new C0158z(this, 8));
        }
    }
}

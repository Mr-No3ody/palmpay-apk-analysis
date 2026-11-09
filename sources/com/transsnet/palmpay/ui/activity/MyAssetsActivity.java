package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Bc.m;
import L6.b;
import Pa.n0;
import Pa.r0;
import Pe.X;
import Pe.Y;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.AssetsBalanceItem;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountV2Resp;
import com.transsnet.palmpay.main.export.bean.rsp.SavingMonthReport;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.constant.RegexConstants;
import com.transsnet.palmpay.viewmodule.MyAssetsViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p054dd.n;
import p054dd.q;
import p059e1.a;
import p1.d;
import p102ge.G;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "用户资产页/Total Assets", path = "/main/my_assets_page")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/MyAssetsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MyAssetsViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyAssetsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAssetsActivity.kt\ncom/transsnet/palmpay/ui/activity/MyAssetsActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n562#2,10:406\n260#3,10:416\n296#3:426\n260#3,10:427\n296#3:437\n1869#4:438\n1869#4,2:439\n1870#4:441\n1869#4,2:442\n1869#4,2:444\n*S KotlinDebug\n*F\n+ 1 MyAssetsActivity.kt\ncom/transsnet/palmpay/ui/activity/MyAssetsActivity\n*L\n109#1:406,10\n129#1:416,10\n129#1:426\n140#1:427,10\n140#1:437\n207#1:438\n208#1:439,2\n207#1:441\n256#1:442,2\n283#1:444,2\n*E\n"})
public final class MyAssetsActivity extends BaseMvvmActivity<MyAssetsViewModel> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34499i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f34500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GetUserAssetsAmountV2Resp f34501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f34502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f34503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f34504g = C2131j.b(new c(16));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((MyAssetsViewModel) l()).f35385e;
        if (lVar != null) {
            lVar.e(this, new q(new G(this, this, 0), 4));
        }
        l lVar2 = ((MyAssetsViewModel) l()).f35386f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new G(this, this, 1), 4));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_my_assets, (ViewGroup) null, false);
        int i7 = e.adViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = e.aivCompliance;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = e.bottomStub;
                ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub2 != null) {
                    i7 = e.csl_saving_report;
                    ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                    if (constraintLayout != null) {
                        i7 = e.itemContainer;
                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout != null) {
                            i7 = e.itemContainer2;
                            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout2 != null) {
                                i7 = e.itemPointsStub;
                                ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                if (viewStub3 != null) {
                                    i7 = e.ivLogo;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = e.ivNetworkTips;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                                        if (appCompatImageView2 != null) {
                                            i7 = e.ivShield;
                                            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                            if (imageView2 != null) {
                                                i7 = e.ivToggleShowBalance;
                                                ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                                                if (imageView3 != null) {
                                                    i7 = e.layoutSecurityGuaranteed;
                                                    FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                                                    if (frameLayout != null) {
                                                        i7 = e.layoutSecurityGuaranteedStub;
                                                        ViewStub viewStub4 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                        if (viewStub4 != null) {
                                                            i7 = e.loadingView;
                                                            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) p059e1.a.m(i7, viewInflate);
                                                            if (contentLoadingProgressBar != null) {
                                                                i7 = e.refreshLayout;
                                                                VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                                                                if (verticalSwipeRefreshLayout != null) {
                                                                    i7 = e.titleBar;
                                                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                    if (ppTitleBar != null) {
                                                                        i7 = e.tvEarningsAmount;
                                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                        if (iconicsTextView != null) {
                                                                            i7 = e.tvNetworkTips;
                                                                            RoundedTextView roundedTextView = (RoundedTextView) p059e1.a.m(i7, viewInflate);
                                                                            if (roundedTextView != null) {
                                                                                i7 = e.tvTitle;
                                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView != null) {
                                                                                    i7 = e.tvTotalAssets;
                                                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView2 != null) {
                                                                                        i7 = e.tvTotalAssetsAmount;
                                                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView3 != null) {
                                                                                            i7 = e.tvYesterdayReturn;
                                                                                            IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (iconicsTextView2 != null) {
                                                                                                i7 = e.vsAdCompliance;
                                                                                                ViewStub viewStub5 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                if (viewStub5 != null) {
                                                                                                    m mVar = new m((LinearLayout) viewInflate, viewStub, appCompatImageView, viewStub2, constraintLayout, linearLayout, linearLayout2, viewStub3, imageView, appCompatImageView2, imageView2, imageView3, frameLayout, viewStub4, contentLoadingProgressBar, verticalSwipeRefreshLayout, ppTitleBar, iconicsTextView, roundedTextView, textView, textView2, textView3, iconicsTextView2, viewStub5);
                                                                                                    this.f34503f = mVar;
                                                                                                    return mVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:190:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0140  */
    public final void m(GetUserAssetsAmountV2Resp getUserAssetsAmountV2Resp) {
        m mVar;
        m mVar2;
        m mVar3;
        String str;
        String str2;
        String str3;
        int color;
        String str4;
        int color2;
        String str5;
        SpanUtils foregroundColor;
        String str6;
        String str7;
        int i7;
        m mVar4;
        m mVar5;
        List<AssetsBalanceItem> list;
        List<AssetsBalanceItem> list2;
        int i10;
        int i11;
        int i12;
        List<AssetsBalanceItem> list3;
        P0 p3;
        int i13;
        boolean z3;
        List<AssetsBalanceItem> list4;
        m mVar6;
        List<AssetsBalanceItem> list5;
        m mVar7;
        CharSequence charSequenceB;
        m mVar8 = this.f34503f;
        ViewGroup viewGroup = null;
        Drawable drawable = mVar8 != null ? mVar8.t.getDrawable() : null;
        Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
        LevelListDrawable levelListDrawable = (LevelListDrawable) drawable;
        int i14 = 0;
        boolean zC = p059e1.a.C("main_sp_show_balance", false);
        boolean z8 = true;
        if (zC) {
            levelListDrawable.setLevel(0);
            m mVar9 = this.f34503f;
            if (mVar9 != null) {
                TextView textView = mVar9.f763X;
                long j6 = getUserAssetsAmountV2Resp != null ? getUserAssetsAmountV2Resp.totalAssets : -1L;
                String str8 = getUserAssetsAmountV2Resp != null ? getUserAssetsAmountV2Resp.fallbackText : null;
                if (!zC) {
                    charSequenceB = "****";
                } else if (TextUtils.isEmpty(str8)) {
                    charSequenceB = j6 < 0 ? "--" : r0.B(j6, true);
                    Intrinsics.e(charSequenceB);
                } else {
                    SpanUtils spanUtils = new SpanUtils();
                    Intrinsics.e(str8);
                    charSequenceB = spanUtils.append(str8).setFontFamily("sans-serif").create();
                    Intrinsics.checkNotNullExpressionValue(charSequenceB, "create(...)");
                }
                textView.setText(charSequenceB);
            }
        } else {
            levelListDrawable.setLevel(1);
            m mVar10 = this.f34503f;
            if (mVar10 != null) {
                mVar10.f763X.setText("****");
            }
        }
        if (NQEManager.INSTANCE.isNetworkOffline() && (mVar7 = this.f34503f) != null) {
            mVar7.f763X.setText("--");
        }
        if (!TextUtils.isEmpty(getUserAssetsAmountV2Resp != null ? getUserAssetsAmountV2Resp.yesterdayEarningsContentTitle : null)) {
            mVar = this.f34503f;
            if (mVar != null) {
                h.s(mVar.f764Y, true);
            }
            mVar2 = this.f34503f;
            if (mVar2 != null) {
                IconicsTextView iconicsTextView = mVar2.f764Y;
                if (getUserAssetsAmountV2Resp != null) {
                    str = getUserAssetsAmountV2Resp.yesterdayEarningsContentValue;
                } else {
                    str = null;
                }
                str2 = (!zC || TextUtils.isEmpty(str)) ? str : "****";
                if (getUserAssetsAmountV2Resp != null) {
                    str3 = getUserAssetsAmountV2Resp.yesterdayEarningsContentTitleColor;
                } else {
                    str3 = null;
                }
                if (RegexUtils.isMatch(RegexConstants.REGEX_VALID_COLOR, str3)) {
                    if (getUserAssetsAmountV2Resp != null) {
                        str7 = getUserAssetsAmountV2Resp.yesterdayEarningsContentTitleColor;
                    } else {
                        str7 = null;
                    }
                    color = Color.parseColor(str7);
                } else {
                    color = getColor(b.ppColorTextNormal);
                }
                if (getUserAssetsAmountV2Resp != null) {
                    str4 = getUserAssetsAmountV2Resp.yesterdayEarningsContentValueColor;
                } else {
                    str4 = null;
                }
                if (RegexUtils.isMatch(RegexConstants.REGEX_VALID_COLOR, str4)) {
                    if (getUserAssetsAmountV2Resp != null) {
                        str6 = getUserAssetsAmountV2Resp.yesterdayEarningsContentValueColor;
                    } else {
                        str6 = null;
                    }
                    color2 = Color.parseColor(str6);
                } else {
                    color2 = getColor(b.ppColorSuccess);
                }
                SpanUtils spanUtils2 = new SpanUtils();
                if (getUserAssetsAmountV2Resp != null || (str5 = getUserAssetsAmountV2Resp.yesterdayEarningsContentTitle) == null) {
                    str5 = "";
                }
                foregroundColor = spanUtils2.append(str5).setForegroundColor(color);
                if (!TextUtils.isEmpty(str2)) {
                    Intrinsics.e(str2);
                    foregroundColor.append(str2).setForegroundColor(color2);
                }
                iconicsTextView.setText(foregroundColor.create());
            }
            mVar3 = this.f34503f;
            if (mVar3 != null) {
                mVar3.f764Y.setOnClickListener(new n(6, this, getUserAssetsAmountV2Resp));
            }
        } else if (TextUtils.isEmpty(getUserAssetsAmountV2Resp != null ? getUserAssetsAmountV2Resp.yesterdayEarningsContentValue : null)) {
            m mVar11 = this.f34503f;
            if (mVar11 != null) {
                h.c(mVar11.f764Y);
            }
        } else {
            mVar = this.f34503f;
            if (mVar != null) {
                h.s(mVar.f764Y, true);
            }
            mVar2 = this.f34503f;
            if (mVar2 != null) {
                IconicsTextView iconicsTextView2 = mVar2.f764Y;
                if (getUserAssetsAmountV2Resp != null) {
                    str = getUserAssetsAmountV2Resp.yesterdayEarningsContentValue;
                } else {
                    str = null;
                }
                if (zC) {
                }
                if (getUserAssetsAmountV2Resp != null) {
                    str3 = getUserAssetsAmountV2Resp.yesterdayEarningsContentTitleColor;
                } else {
                    str3 = null;
                }
                if (RegexUtils.isMatch(RegexConstants.REGEX_VALID_COLOR, str3)) {
                    if (getUserAssetsAmountV2Resp != null) {
                        str7 = getUserAssetsAmountV2Resp.yesterdayEarningsContentTitleColor;
                    } else {
                        str7 = null;
                    }
                    color = Color.parseColor(str7);
                } else {
                    color = getColor(b.ppColorTextNormal);
                }
                if (getUserAssetsAmountV2Resp != null) {
                    str4 = getUserAssetsAmountV2Resp.yesterdayEarningsContentValueColor;
                } else {
                    str4 = null;
                }
                if (RegexUtils.isMatch(RegexConstants.REGEX_VALID_COLOR, str4)) {
                    if (getUserAssetsAmountV2Resp != null) {
                        str6 = getUserAssetsAmountV2Resp.yesterdayEarningsContentValueColor;
                    } else {
                        str6 = null;
                    }
                    color2 = Color.parseColor(str6);
                } else {
                    color2 = getColor(b.ppColorSuccess);
                }
                SpanUtils spanUtils3 = new SpanUtils();
                if (getUserAssetsAmountV2Resp != null) {
                    str5 = "";
                } else {
                    str5 = "";
                }
                foregroundColor = spanUtils3.append(str5).setForegroundColor(color);
                if (!TextUtils.isEmpty(str2)) {
                    Intrinsics.e(str2);
                    foregroundColor.append(str2).setForegroundColor(color2);
                }
                iconicsTextView2.setText(foregroundColor.create());
            }
            mVar3 = this.f34503f;
            if (mVar3 != null) {
                mVar3.f764Y.setOnClickListener(new n(6, this, getUserAssetsAmountV2Resp));
            }
        }
        int size = (getUserAssetsAmountV2Resp == null || (list5 = getUserAssetsAmountV2Resp.assetsItems) == null) ? 0 : list5.size();
        int i15 = -1;
        int i16 = -2;
        if (size > 0) {
            if (getUserAssetsAmountV2Resp != null && (list2 = getUserAssetsAmountV2Resp.assetsItems) != null) {
                int i17 = 0;
                for (AssetsBalanceItem assetsBalanceItem : list2) {
                    if (assetsBalanceItem.itemType == 0) {
                        m mVar12 = this.f34503f;
                        View itemView = (i17 >= (mVar12 != null ? mVar12.f771f.getChildCount() : i14) || (mVar6 = this.f34503f) == null) ? viewGroup : com.palmpay.lib.apm.launchcounter.util.d.q(mVar6.f771f, i17);
                        if (itemView == null) {
                            itemView = LayoutInflater.from(this).inflate(f.main_layout_my_asset_balance_views, viewGroup);
                            Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
                            m mVar13 = this.f34503f;
                            if (mVar13 != null) {
                                mVar13.f771f.addView(itemView, new LinearLayout.LayoutParams(i15, i16));
                            }
                        }
                        Intrinsics.checkNotNullParameter(itemView, "itemView");
                        TextView textView2 = (TextView) itemView.findViewById(e.tvTotalTitle);
                        TextView textView3 = (TextView) itemView.findViewById(e.tvMsg);
                        LinearLayout linearLayout = (LinearLayout) itemView.findViewById(e.layoutViews);
                        r0.R1(textView2, "fonts/PalmPayNum-Bold.ttf");
                        if (textView2 != null) {
                            textView2.setText(assetsBalanceItem.title);
                        }
                        if (textView3 != null) {
                            textView3.setText(assetsBalanceItem.tips);
                        }
                        if (textView3 != null) {
                            h.s(textView3, TextUtils.isEmpty(assetsBalanceItem.tips) ^ z8);
                        }
                        List<AssetsBalanceItem> list6 = assetsBalanceItem.subItems;
                        int size2 = list6 != null ? list6.size() : 0;
                        if (size2 > 0) {
                            List<AssetsBalanceItem> list7 = assetsBalanceItem.subItems;
                            if (list7 != null) {
                                int i18 = 0;
                                for (AssetsBalanceItem assetsBalanceItem2 : list7) {
                                    View viewQ = (i18 >= (linearLayout != null ? linearLayout.getChildCount() : 0) || linearLayout == null) ? viewGroup : com.palmpay.lib.apm.launchcounter.util.d.q(linearLayout, i18);
                                    if (viewQ == null) {
                                        viewQ = LayoutInflater.from(itemView.getContext()).inflate(f.main_layout_my_asset_balance_item, viewGroup);
                                        Intrinsics.checkNotNullExpressionValue(viewQ, "inflate(...)");
                                        if (linearLayout != null) {
                                            linearLayout.addView(viewQ, new LinearLayout.LayoutParams(-1, i16));
                                        }
                                    }
                                    P0 p10 = new P0(viewQ, 1);
                                    p10.n(assetsBalanceItem2, i18 != size2 + (-1));
                                    int size3 = (assetsBalanceItem2 == null || (list4 = assetsBalanceItem2.subItems) == null) ? 0 : list4.size();
                                    LinearLayout linearLayout2 = (LinearLayout) p10.f13251f;
                                    if (size3 > 0) {
                                        if (linearLayout2 != null) {
                                            h.s(linearLayout2, true);
                                        }
                                        if (assetsBalanceItem2 != null && (list3 = assetsBalanceItem2.subItems) != null) {
                                            int i19 = 0;
                                            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                                                int i20 = size;
                                                AssetsBalanceItem assetsBalanceItem3 = (AssetsBalanceItem) it.next();
                                                View viewQ2 = (i19 >= (linearLayout2 != null ? linearLayout2.getChildCount() : 0) || linearLayout2 == null) ? null : com.palmpay.lib.apm.launchcounter.util.d.q(linearLayout2, i19);
                                                if (viewQ2 == null) {
                                                    p3 = p10;
                                                    i13 = size2;
                                                    viewQ2 = LayoutInflater.from(((View) p10.f13246a).getContext()).inflate(f.main_layout_my_asset_balance_sub_item, (ViewGroup) null);
                                                    Intrinsics.checkNotNullExpressionValue(viewQ2, "inflate(...)");
                                                    if (linearLayout2 != null) {
                                                        linearLayout2.addView(viewQ2, new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(24)));
                                                    }
                                                    P0 p11 = new P0(viewQ2, 1);
                                                    if (i19 != size3 - 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    p11.n(assetsBalanceItem3, z3);
                                                    i19++;
                                                    size3 = size3;
                                                    size = i20;
                                                    p10 = p3;
                                                    size2 = i13;
                                                } else {
                                                    p3 = p10;
                                                    i13 = size2;
                                                }
                                                P0 p12 = new P0(viewQ2, 1);
                                                if (i19 != size3 - 1) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                p12.n(assetsBalanceItem3, z3);
                                                i19++;
                                                size3 = size3;
                                                size = i20;
                                                p10 = p3;
                                                size2 = i13;
                                            }
                                        }
                                        i11 = size;
                                        i12 = size2;
                                    } else {
                                        i11 = size;
                                        i12 = size2;
                                        if (linearLayout2 != null) {
                                            h.s(linearLayout2, false);
                                        }
                                        if (linearLayout2 != null) {
                                            linearLayout2.removeAllViews();
                                        }
                                    }
                                    i18++;
                                    size = i11;
                                    size2 = i12;
                                    viewGroup = null;
                                    i16 = -2;
                                }
                            }
                            i10 = size;
                        } else {
                            i10 = size;
                            if (linearLayout != null) {
                                linearLayout.removeAllViews();
                            }
                        }
                        i17++;
                    } else {
                        i10 = size;
                    }
                    size = i10;
                    viewGroup = null;
                    i15 = -1;
                    i14 = 0;
                    z8 = true;
                    i16 = -2;
                }
            }
            i7 = size;
        } else {
            i7 = size;
            m mVar14 = this.f34503f;
            if (mVar14 != null) {
                mVar14.f771f.removeAllViews();
            }
        }
        m mVar15 = this.f34503f;
        if (mVar15 != null) {
            h.s(mVar15.f771f, i7 > 0);
        }
        m mVar16 = this.f34503f;
        if (mVar16 != null) {
            mVar16.f772g.removeAllViews();
        }
        if (getUserAssetsAmountV2Resp != null && (list = getUserAssetsAmountV2Resp.assetsItems) != null) {
            for (AssetsBalanceItem assetsBalanceItem4 : list) {
                int i21 = assetsBalanceItem4.itemType;
                if (i21 == 1) {
                    if (this.f34502e == null) {
                        m mVar17 = this.f34503f;
                        this.f34502e = new d(mVar17 != null ? mVar17.f773i : null, (View) null);
                    }
                    d dVar = this.f34502e;
                    if (dVar != null) {
                        dVar.k(assetsBalanceItem4);
                    }
                } else if (i21 == 2) {
                    View viewInflate = LayoutInflater.from(this).inflate(f.main_layout_total_asset_item_2, (ViewGroup) null);
                    m mVar18 = this.f34503f;
                    if (mVar18 != null) {
                        mVar18.f772g.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
                    }
                    Intrinsics.e(viewInflate);
                    h.k(viewInflate, null, null, null, Integer.valueOf(CommonViewExtKt.getDp(12.0f)), 7);
                    new d((ViewStub) null, viewInflate).k(assetsBalanceItem4);
                }
            }
        }
        boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
        m mVar19 = this.f34503f;
        if (mVar19 != null) {
            h.s(mVar19.f760L, zIsNetworkOffline);
        }
        m mVar20 = this.f34503f;
        if (mVar20 != null) {
            h.s(mVar20.f775o, zIsNetworkOffline);
        }
        if (zIsNetworkOffline) {
            m mVar21 = this.f34503f;
            if (TextUtils.isEmpty(mVar21 != null ? mVar21.f760L.getText() : null) && (mVar5 = this.f34503f) != null) {
                mVar5.f760L.setText(Ac.h.main_not_network_amount_tips);
            }
        }
        if (!zIsNetworkOffline || (mVar4 = this.f34503f) == null) {
            return;
        }
        h.s(mVar4.f764Y, false);
    }

    public final void n(SavingMonthReport savingMonthReport) {
        ConstraintLayout constraintLayout;
        IconicsTextView iconicsTextView;
        IconicsTextView iconicsTextView2;
        TextView textView;
        ConstraintLayout constraintLayout2;
        if (savingMonthReport != null) {
            m mVar = this.f34503f;
            if (mVar != null && (constraintLayout2 = mVar.f770e) != null) {
                constraintLayout2.setVisibility(0);
            }
            m mVar2 = this.f34503f;
            if (mVar2 != null && (textView = mVar2.f761M) != null) {
                String str = savingMonthReport.title;
                if (str == null) {
                    str = "September Earnings";
                }
                textView.setText(str);
            }
            m mVar3 = this.f34503f;
            if (mVar3 != null && (iconicsTextView2 = mVar3.f759H) != null) {
                String str2 = savingMonthReport.content;
                if (str2 == null) {
                    str2 = "--";
                }
                iconicsTextView2.setText(str2);
            }
            try {
                String str3 = savingMonthReport.contentColor;
                if (str3 != null && CommonViewExtKt.isValidHexColor(str3)) {
                    int color = Color.parseColor(str3);
                    m mVar4 = this.f34503f;
                    if (mVar4 != null && (iconicsTextView = mVar4.f759H) != null) {
                        iconicsTextView.setTextColor(color);
                    }
                }
            } catch (Exception unused) {
            }
            m mVar5 = this.f34503f;
            if (mVar5 == null || (constraintLayout = mVar5.f770e) == null) {
                return;
            }
            constraintLayout.setOnClickListener(new p054dd.d(10));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 392 || eventType == 407) {
            MyAssetsViewModel myAssetsViewModel = (MyAssetsViewModel) l();
            myAssetsViewModel.getClass();
            p140j8.f.s(myAssetsViewModel, new X(1, null), myAssetsViewModel.f35385e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            MyAssetsViewModel myAssetsViewModel2 = (MyAssetsViewModel) l();
            myAssetsViewModel2.getClass();
            p140j8.f.s(myAssetsViewModel2, new Y(1, null), myAssetsViewModel2.f35386f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        MyAssetsViewModel myAssetsViewModel = (MyAssetsViewModel) l();
        myAssetsViewModel.getClass();
        p140j8.f.s(myAssetsViewModel, new X(1, null), myAssetsViewModel.f35385e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        MyAssetsViewModel myAssetsViewModel2 = (MyAssetsViewModel) l();
        myAssetsViewModel2.getClass();
        p140j8.f.s(myAssetsViewModel2, new Y(1, null), myAssetsViewModel2.f35386f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        m mVar = this.f34503f;
        if (mVar != null) {
            final int i7 = 0;
            mVar.f758C.setBackButtonClickListener(new View.OnClickListener(this) { // from class: ge.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MyAssetsActivity f37184b;

                {
                    this.f37184b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageView imageView;
                    MyAssetsActivity myAssetsActivity = this.f37184b;
                    switch (i7) {
                        case 0:
                            int i10 = MyAssetsActivity.f34499i;
                            myAssetsActivity.onBackPressed();
                            break;
                        default:
                            int i11 = MyAssetsActivity.f34499i;
                            n0.g().l("PalmPay_Assets_Eye_See_Click");
                            m mVar2 = myAssetsActivity.f34503f;
                            Drawable drawable = (mVar2 == null || (imageView = mVar2.t) == null) ? null : imageView.getDrawable();
                            Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
                            LevelListDrawable levelListDrawable = (LevelListDrawable) drawable;
                            levelListDrawable.setLevel(levelListDrawable.getLevel() == 0 ? 1 : 0);
                            a.X("main_sp_show_balance", levelListDrawable.getLevel() == 0);
                            r0.P1(MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
                            myAssetsActivity.m(myAssetsActivity.f34501d);
                            break;
                    }
                }
            });
        }
        m mVar2 = this.f34503f;
        if (mVar2 != null) {
            final int i10 = 1;
            mVar2.t.setOnClickListener(new View.OnClickListener(this) { // from class: ge.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MyAssetsActivity f37184b;

                {
                    this.f37184b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageView imageView;
                    MyAssetsActivity myAssetsActivity = this.f37184b;
                    switch (i10) {
                        case 0:
                            int i11 = MyAssetsActivity.f34499i;
                            myAssetsActivity.onBackPressed();
                            break;
                        default:
                            int i12 = MyAssetsActivity.f34499i;
                            n0.g().l("PalmPay_Assets_Eye_See_Click");
                            m mVar3 = myAssetsActivity.f34503f;
                            Drawable drawable = (mVar3 == null || (imageView = mVar3.t) == null) ? null : imageView.getDrawable();
                            Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
                            LevelListDrawable levelListDrawable = (LevelListDrawable) drawable;
                            levelListDrawable.setLevel(levelListDrawable.getLevel() == 0 ? 1 : 0);
                            a.X("main_sp_show_balance", levelListDrawable.getLevel() == 0);
                            r0.P1(MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
                            myAssetsActivity.m(myAssetsActivity.f34501d);
                            break;
                    }
                }
            });
        }
        m mVar3 = this.f34503f;
        r0.R1(mVar3 != null ? mVar3.f763X : null, "fonts/PalmPayNum-Bold.ttf");
        m mVar4 = this.f34503f;
        r0.R1(mVar4 != null ? mVar4.f764Y : null, "fonts/PalmPayNum-Regular.ttf");
        m(this.f34501d);
        getWindow().getDecorView().post(new androidx.core.provider.m(17, (Handler) this.f34504g.getValue(), this));
        m mVar5 = this.f34503f;
        if (mVar5 != null) {
            mVar5.f757B.setOnRefreshListener(new Z(this, 27));
        }
    }
}

package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.C0104a;
import C0.G;
import N8.q0;
import O6.c;
import Pa.i0;
import Pa.n0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.RateAppActivity;
import com.transsnet.palmpay.ui.view.SettingItem;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import io.reactivex.disposables.Disposable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p059e1.a;
import p285sc.x;
import p367ya.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/about")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/AboutActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f34944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0104a f34945c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_about, (ViewGroup) null, false);
        int i7 = e.imageViewAvatar;
        if (((ImageView) a.m(i7, viewInflate)) != null) {
            i7 = e.ivArrow;
            if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                i7 = e.key_legal;
                SettingItem settingItem = (SettingItem) a.m(i7, viewInflate);
                if (settingItem != null) {
                    i7 = e.key_palmpay_official;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
                    if (constraintLayout != null) {
                        i7 = e.key_privacy;
                        SettingItem settingItem2 = (SettingItem) a.m(i7, viewInflate);
                        if (settingItem2 != null) {
                            i7 = e.key_rate_us;
                            SettingItem settingItem3 = (SettingItem) a.m(i7, viewInflate);
                            if (settingItem3 != null) {
                                i7 = e.key_to_score;
                                SettingItem settingItem4 = (SettingItem) a.m(i7, viewInflate);
                                if (settingItem4 != null) {
                                    i7 = e.textViewName;
                                    TextView textView = (TextView) a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = e.titleBar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = e.tvSummery;
                                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                                            if (textView2 != null) {
                                                i7 = e.tvTitle;
                                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                                if (textView3 != null && (viewM = a.m((i7 = e.viewDivider), viewInflate)) != null) {
                                                    i7 = e.viewHeader;
                                                    LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                                                    if (linearLayout != null) {
                                                        C0104a c0104a = new C0104a((LinearLayout) viewInflate, settingItem, constraintLayout, settingItem2, settingItem3, settingItem4, textView, ppTitleBar, textView2, textView3, viewM, linearLayout);
                                                        this.f34945c = c0104a;
                                                        return c0104a;
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

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        boolean z3;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = e.key_palmpay_official;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            d.Q(com.transsnet.palmpay.core.config.d.g("/settings/guide/office-address?nLoad=true&sDark=true"));
            return;
        }
        int i10 = e.key_legal;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/palmpay?showTitle=true"), getString(h.main_terms_and_conditions));
            return;
        }
        int i11 = e.key_privacy;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            d.R(com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/palmpay?showTitle=true"), getString(h.main_privacy_policy));
            return;
        }
        int i12 = e.key_to_score;
        if (numValueOf == null || numValueOf.intValue() != i12) {
            int i13 = e.key_rate_us;
            if (numValueOf != null && numValueOf.intValue() == i13) {
                ActivityUtils.startActivity((Class<?>) RateAppActivity.class);
                return;
            }
            return;
        }
        n0.g().l("PalmPay_UpgradeVersionClick");
        if (!b.b()) {
            c cVar = new c(this);
            cVar.f6598d = "Your app is already up-to-date.";
            cVar.d(k.core_got_it, null);
            cVar.g();
            return;
        }
        AppUpdate.VersionBean versionBeanC = b.c();
        Intrinsics.checkNotNullExpressionValue(versionBeanC, "readVersionBean(...)");
        F6.d.h("handleToScoreClick", 3, G.o("handleToScoreClick:", versionBeanC.apkLink));
        if (TextUtils.isEmpty(versionBeanC.apkLink)) {
            i0.O(this);
            return;
        }
        if (new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()).equals(a.I("upgrade_click_date", ""))) {
            int iD = a.D(0, "upgrade_click_count");
            long jE = a.E(0L, "upgrade_first_click_time");
            z3 = iD >= 2 && jE != 0 && System.currentTimeMillis() - jE >= 60000;
        } else {
            z3 = false;
        }
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        if (!str.equals(a.I("upgrade_click_date", ""))) {
            a.U(0, "upgrade_click_count");
            a.V(0L, "upgrade_first_click_time");
            a.W("upgrade_click_date", str);
        }
        int iD2 = a.D(0, "upgrade_click_count");
        a.E(0L, "upgrade_first_click_time");
        if (iD2 == 0) {
            a.V(System.currentTimeMillis(), "upgrade_first_click_time");
        }
        a.U(iD2 + 1, "upgrade_click_count");
        F6.d.h("handleToScoreClick", 3, "handleToScoreClick1:" + z3);
        if (z3) {
            i0.c0(versionBeanC.apkLink);
        } else {
            i0.O(this);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        p367ya.c.b().putLong("last_check_time", 0L);
        com.facebook.imagepipeline.nativecode.b.d();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        String strY = q0.y(AppUtils.getAppName(), " ", BaseApplication.get().getVersionName());
        C0104a c0104a = this.f34945c;
        if (c0104a != null) {
            ((TextView) c0104a.f658o).setText(strY);
        }
        C0104a c0104a2 = this.f34945c;
        if (c0104a2 != null) {
            ((TextView) c0104a2.f658o).setOnClickListener(new x(this, 3));
        }
        try {
            C0104a c0104a3 = this.f34945c;
            if (c0104a3 != null) {
                ((PpTitleBar) c0104a3.f651c).setTitle(CommonViewExtKt.string(h.main_about, this));
            }
            C0104a c0104a4 = this.f34945c;
            if (c0104a4 != null) {
                ((LinearLayout) c0104a4.f653e).setVisibility(0);
            }
            C0104a c0104a5 = this.f34945c;
            if (c0104a5 != null) {
                ((SettingItem) c0104a5.f657j).setOnClickListener(this);
            }
            C0104a c0104a6 = this.f34945c;
            if (c0104a6 != null) {
                ((SettingItem) c0104a6.f654f).setOnClickListener(this);
            }
            C0104a c0104a7 = this.f34945c;
            if (c0104a7 != null) {
                ((SettingItem) c0104a7.f655g).setOnClickListener(this);
            }
            C0104a c0104a8 = this.f34945c;
            if (c0104a8 != null) {
                ((ConstraintLayout) c0104a8.f650b).setOnClickListener(this);
            }
            C0104a c0104a9 = this.f34945c;
            if (c0104a9 != null) {
                ((SettingItem) c0104a9.f656i).setOnClickListener(this);
            }
            if (!b.b()) {
                C0104a c0104a10 = this.f34945c;
                if (c0104a10 != null) {
                    ((SettingItem) c0104a10.f657j).c(false);
                    return;
                }
                return;
            }
            C0104a c0104a11 = this.f34945c;
            if (c0104a11 != null) {
                ((SettingItem) c0104a11.f657j).setSummary(b.c().version + "  ");
            }
            C0104a c0104a12 = this.f34945c;
            if (c0104a12 != null) {
                ((SettingItem) c0104a12.f657j).c(true);
            }
        } catch (Exception e10) {
            F6.d.c(this.TAG, "setupSettings: ", e10);
        }
    }
}

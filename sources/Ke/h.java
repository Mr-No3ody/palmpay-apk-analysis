package Ke;

import Bc.q;
import C0.G;
import Me.A;
import N8.C0475t;
import Pa.i0;
import Pa.n0;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.device.SetDeviceNotificationReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.lang.ref.WeakReference;
import kotlin.text.y;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5446d;

    public /* synthetic */ h(int i7) {
        this.f5443a = i7;
    }

    public void a() {
        AppCompatImageView appCompatImageView;
        IconicsTextView iconicsTextView;
        TextView textView;
        IconicsTextView iconicsTextView2;
        q qVar = (q) this.f5446d;
        if (qVar != null && (iconicsTextView2 = (IconicsTextView) qVar.f823o) != null) {
            p220oa.h.C(iconicsTextView2);
        }
        if (qVar != null && (textView = qVar.f816c) != null) {
            p220oa.h.c(textView);
        }
        if (qVar != null && (iconicsTextView = (IconicsTextView) qVar.f822j) != null) {
            p220oa.h.c(iconicsTextView);
        }
        if (qVar == null || (appCompatImageView = (AppCompatImageView) qVar.f819f) == null) {
            return;
        }
        p220oa.h.c(appCompatImageView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeFragmentHomeTab homeFragmentHomeTab;
        HomeFragment homeFragment;
        switch (this.f5443a) {
            case 0:
                Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
                int i7 = Ac.e.ivSettings;
                if (numValueOf != null && numValueOf.intValue() == i7) {
                    if (!d0.t()) {
                        n0.g().l("PalmPay_Me_Setting_Click");
                        com.palmpay.lib.apm.launchcounter.util.d.F("/main/settings");
                    } else {
                        com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                    }
                    break;
                } else {
                    int i10 = Ac.e.ivScan;
                    if (numValueOf != null && numValueOf.intValue() == i10) {
                        if (!d0.t()) {
                            n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Scan"));
                            com.palmpay.lib.apm.launchcounter.util.d.F("/qrcode/scan");
                        } else {
                            com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                        }
                        break;
                    } else {
                        int i11 = Ac.e.imageViewAvatar;
                        if (numValueOf == null || numValueOf.intValue() != i11) {
                            int i12 = Ac.e.tvName;
                            if (numValueOf == null || numValueOf.intValue() != i12) {
                                int i13 = Ac.e.tvLevel;
                                if (numValueOf == null || numValueOf.intValue() != i13) {
                                    int i14 = Ac.e.tvSignUpLogin;
                                    if (numValueOf != null && numValueOf.intValue() == i14 && !BaseApplication.hasLogin()) {
                                        n0.g().l("MesignUpClick");
                                        i0.K(null, null);
                                    }
                                    break;
                                } else if (!d0.t()) {
                                    n0.g().l("MeKycUpgradeClick");
                                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/palmpayLevel");
                                    break;
                                }
                            }
                        }
                        if (!d0.t()) {
                            n0.g().l("PalmPay_Me_Profile_Click");
                            com.palmpay.lib.apm.launchcounter.util.d.F("/main/personal_info");
                            break;
                        }
                    }
                }
                break;
            case 1:
                Integer numValueOf2 = view != null ? Integer.valueOf(view.getId()) : null;
                int i15 = Ac.e.tvCopy;
                if (numValueOf2 == null || numValueOf2.intValue() != i15) {
                    int i16 = Ac.e.tvPrivacyAccount;
                    if (numValueOf2 == null || numValueOf2.intValue() != i16) {
                        int i17 = Ac.e.ivPremium;
                        if (numValueOf2 != null && numValueOf2.intValue() == i17) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "PalmPayPremium");
                        }
                    } else {
                        com.palmpay.lib.apm.launchcounter.util.d.F("/account/privacy_account_no_settings");
                    }
                } else {
                    n0.g().k((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Copy"));
                    Bc.i iVar = (Bc.i) this.f5446d;
                    ClipboardUtils.copyText(y.k(String.valueOf(iVar != null ? ((TextView) iVar.f728f).getText() : null), " ", ""));
                    ToastUtils.showShort(k.core_copy_success);
                }
                break;
            case 2:
                WeakReference weakReference = (WeakReference) this.f5446d;
                if (weakReference != null && (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) != null && (homeFragment = (HomeFragment) homeFragmentHomeTab.getParentFragment()) != null) {
                    HomePalmZoneTabV2 homePalmZoneTabV2B = homeFragment.B();
                    if (homePalmZoneTabV2B != null) {
                        A a3 = homePalmZoneTabV2B.f35147v;
                        if (a3 == null) {
                            homePalmZoneTabV2B.f35144j = true;
                        } else {
                            a3.t();
                        }
                    }
                    homeFragment.H(homeFragment.E());
                    break;
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) this.f5445c).booleanValue();
                com.transsnet.palmpay.core.viewmodel.a aVar = (com.transsnet.palmpay.core.viewmodel.a) this.f5446d;
                if (!zBooleanValue) {
                    AppUtils.gotoNotificationSettingPage(aVar.f28574a.getContext());
                }
                if (!((Boolean) this.f5444b).booleanValue()) {
                    ((PayApiService) p324va.c.f43141a.f14621b).enableDeviceNotification(new SetDeviceNotificationReq(true)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0475t(1));
                }
                break;
        }
    }

    public h(com.transsnet.palmpay.core.viewmodel.a aVar, Boolean bool, Boolean bool2) {
        this.f5443a = 3;
        this.f5446d = aVar;
        this.f5445c = bool;
        this.f5444b = bool2;
    }
}

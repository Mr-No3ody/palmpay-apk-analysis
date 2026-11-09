package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import Fd.G;
import I8.b;
import N8.L;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.PrivacyAccountNoSettingsActivity;
import com.transsnet.palmpay.account.ui.viewmodel.PrivacyAccountNoSettingsViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p097g9.T;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/privacy_account_no_settings")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PrivacyAccountNoSettingsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PrivacyAccountNoSettingsViewModel;", "LI8/b;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyAccountNoSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyAccountNoSettingsActivity.kt\ncom/transsnet/palmpay/account/ui/activity/PrivacyAccountNoSettingsActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,129:1\n171#2,12:130\n215#2:142\n171#2,12:143\n215#2:155\n*S KotlinDebug\n*F\n+ 1 PrivacyAccountNoSettingsActivity.kt\ncom/transsnet/palmpay/account/ui/activity/PrivacyAccountNoSettingsActivity\n*L\n97#1:130,12\n97#1:142\n113#1:143,12\n113#1:155\n*E\n"})
public final class PrivacyAccountNoSettingsActivity extends BaseMvvmVBActivity<PrivacyAccountNoSettingsViewModel, b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25966d = 0;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        b bVar = (b) this.f27334c;
        if (bVar != null) {
            bVar.f4045g.setText(r0.Z(BaseApplication.get().getUser().getPhoneNumber()));
        }
        b bVar2 = (b) this.f27334c;
        if (bVar2 != null) {
            final int i7 = 0;
            bVar2.f4040b.setOnClickListener(new View.OnClickListener(this) { // from class: N8.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PrivacyAccountNoSettingsActivity f6160b;

                {
                    this.f6160b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppCompatCheckBox appCompatCheckBox;
                    AppCompatCheckBox appCompatCheckBox2;
                    AppCompatCheckBox appCompatCheckBox3;
                    AppCompatCheckBox appCompatCheckBox4;
                    PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity = this.f6160b;
                    switch (i7) {
                        case 0:
                            int i10 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar3 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar3 != null && bVar3.f4041c.isChecked()) {
                                PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                privacyAccountNoSettingsViewModel.getClass();
                                p140j8.f.s(privacyAccountNoSettingsViewModel, new p097g9.U(1, null), privacyAccountNoSettingsViewModel.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                break;
                            } else {
                                I8.b bVar4 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                                if (bVar4 != null && bVar4.f4042d.isChecked()) {
                                    PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel2 = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                    privacyAccountNoSettingsViewModel2.getClass();
                                    p140j8.f.s(privacyAccountNoSettingsViewModel2, new p097g9.U(2, null), privacyAccountNoSettingsViewModel2.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            int i11 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar5 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar5 != null && (appCompatCheckBox2 = bVar5.f4041c) != null) {
                                appCompatCheckBox2.setChecked(true);
                            }
                            I8.b bVar6 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar6 != null && (appCompatCheckBox = bVar6.f4042d) != null) {
                                appCompatCheckBox.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i12 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar7 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar7 != null && (appCompatCheckBox4 = bVar7.f4041c) != null) {
                                appCompatCheckBox4.setChecked(false);
                            }
                            I8.b bVar8 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar8 != null && (appCompatCheckBox3 = bVar8.f4042d) != null) {
                                appCompatCheckBox3.setChecked(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        b bVar3 = (b) this.f27334c;
        if (bVar3 != null) {
            final int i10 = 1;
            bVar3.f4043e.setOnClickListener(new View.OnClickListener(this) { // from class: N8.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PrivacyAccountNoSettingsActivity f6160b;

                {
                    this.f6160b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppCompatCheckBox appCompatCheckBox;
                    AppCompatCheckBox appCompatCheckBox2;
                    AppCompatCheckBox appCompatCheckBox3;
                    AppCompatCheckBox appCompatCheckBox4;
                    PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity = this.f6160b;
                    switch (i10) {
                        case 0:
                            int i11 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar4 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar4 != null && bVar4.f4041c.isChecked()) {
                                PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                privacyAccountNoSettingsViewModel.getClass();
                                p140j8.f.s(privacyAccountNoSettingsViewModel, new p097g9.U(1, null), privacyAccountNoSettingsViewModel.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                break;
                            } else {
                                I8.b bVar5 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                                if (bVar5 != null && bVar5.f4042d.isChecked()) {
                                    PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel2 = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                    privacyAccountNoSettingsViewModel2.getClass();
                                    p140j8.f.s(privacyAccountNoSettingsViewModel2, new p097g9.U(2, null), privacyAccountNoSettingsViewModel2.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            int i12 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar6 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar6 != null && (appCompatCheckBox2 = bVar6.f4041c) != null) {
                                appCompatCheckBox2.setChecked(true);
                            }
                            I8.b bVar7 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar7 != null && (appCompatCheckBox = bVar7.f4042d) != null) {
                                appCompatCheckBox.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i13 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar8 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar8 != null && (appCompatCheckBox4 = bVar8.f4041c) != null) {
                                appCompatCheckBox4.setChecked(false);
                            }
                            I8.b bVar9 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar9 != null && (appCompatCheckBox3 = bVar9.f4042d) != null) {
                                appCompatCheckBox3.setChecked(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        b bVar4 = (b) this.f27334c;
        if (bVar4 != null) {
            final int i11 = 2;
            bVar4.f4044f.setOnClickListener(new View.OnClickListener(this) { // from class: N8.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PrivacyAccountNoSettingsActivity f6160b;

                {
                    this.f6160b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppCompatCheckBox appCompatCheckBox;
                    AppCompatCheckBox appCompatCheckBox2;
                    AppCompatCheckBox appCompatCheckBox3;
                    AppCompatCheckBox appCompatCheckBox4;
                    PrivacyAccountNoSettingsActivity privacyAccountNoSettingsActivity = this.f6160b;
                    switch (i11) {
                        case 0:
                            int i12 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar5 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar5 != null && bVar5.f4041c.isChecked()) {
                                PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                privacyAccountNoSettingsViewModel.getClass();
                                p140j8.f.s(privacyAccountNoSettingsViewModel, new p097g9.U(1, null), privacyAccountNoSettingsViewModel.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                break;
                            } else {
                                I8.b bVar6 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                                if (bVar6 != null && bVar6.f4042d.isChecked()) {
                                    PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel2 = (PrivacyAccountNoSettingsViewModel) privacyAccountNoSettingsActivity.l();
                                    privacyAccountNoSettingsViewModel2.getClass();
                                    p140j8.f.s(privacyAccountNoSettingsViewModel2, new p097g9.U(2, null), privacyAccountNoSettingsViewModel2.f26438f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            int i13 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar7 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar7 != null && (appCompatCheckBox2 = bVar7.f4041c) != null) {
                                appCompatCheckBox2.setChecked(true);
                            }
                            I8.b bVar8 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar8 != null && (appCompatCheckBox = bVar8.f4042d) != null) {
                                appCompatCheckBox.setChecked(false);
                                break;
                            }
                            break;
                        default:
                            int i14 = PrivacyAccountNoSettingsActivity.f25966d;
                            I8.b bVar9 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar9 != null && (appCompatCheckBox4 = bVar9.f4041c) != null) {
                                appCompatCheckBox4.setChecked(false);
                            }
                            I8.b bVar10 = (I8.b) privacyAccountNoSettingsActivity.f27334c;
                            if (bVar10 != null && (appCompatCheckBox3 = bVar10.f4042d) != null) {
                                appCompatCheckBox3.setChecked(true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_privacy_account_no_settings, (ViewGroup) null, false);
        int i7 = d.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.check1;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) p059e1.a.m(i7, viewInflate);
            if (appCompatCheckBox != null) {
                i7 = d.check2;
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) p059e1.a.m(i7, viewInflate);
                if (appCompatCheckBox2 != null) {
                    i7 = d.layout1;
                    ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                    if (constraintLayout != null) {
                        i7 = d.layout2;
                        CardView cardView = (CardView) p059e1.a.m(i7, viewInflate);
                        if (cardView != null) {
                            i7 = d.titleBar;
                            if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = d.tvNo1;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = d.tvNo2;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = d.tvPrefer2;
                                        if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                            b bVar = new b((LinearLayout) viewInflate, ppButton, appCompatCheckBox, appCompatCheckBox2, constraintLayout, cardView, textView, textView2);
                                            Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                            return bVar;
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

    public final void n() {
        b bVar = (b) this.f27334c;
        if (bVar != null) {
            bVar.f4046i.setText(i0.n(BaseApplication.get().getUser().getAccountNumber(), false));
        }
        User user = BaseApplication.get().getUser();
        if (user != null) {
            if (TextUtils.isEmpty(user.getAccountNumber())) {
                b bVar2 = (b) this.f27334c;
                if (bVar2 != null) {
                    h.s(bVar2.f4044f, false);
                }
                b bVar3 = (b) this.f27334c;
                if (bVar3 != null) {
                    bVar3.f4041c.setChecked(true);
                }
                b bVar4 = (b) this.f27334c;
                if (bVar4 != null) {
                    bVar4.f4042d.setChecked(false);
                    return;
                }
                return;
            }
            b bVar5 = (b) this.f27334c;
            if (bVar5 != null) {
                h.s(bVar5.f4044f, true);
            }
            if (!TextUtils.isEmpty(user.getDisplayAccountNumber())) {
                String phoneNumber = user.getPhoneNumber();
                Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber(...)");
                String displayAccountNumber = user.getDisplayAccountNumber();
                Intrinsics.checkNotNullExpressionValue(displayAccountNumber, "getDisplayAccountNumber(...)");
                if (!y.g(phoneNumber, displayAccountNumber, false)) {
                    b bVar6 = (b) this.f27334c;
                    if (bVar6 != null) {
                        bVar6.f4041c.setChecked(false);
                    }
                    b bVar7 = (b) this.f27334c;
                    if (bVar7 != null) {
                        bVar7.f4042d.setChecked(true);
                        return;
                    }
                    return;
                }
            }
            b bVar8 = (b) this.f27334c;
            if (bVar8 != null) {
                bVar8.f4041c.setChecked(true);
            }
            b bVar9 = (b) this.f27334c;
            if (bVar9 != null) {
                bVar9.f4042d.setChecked(false);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PrivacyAccountNoSettingsViewModel) l()).f26437e;
        if (lVar != null) {
            lVar.e(this, new G(new L(this, this, 0), 8));
        }
        l lVar2 = ((PrivacyAccountNoSettingsViewModel) l()).f26438f;
        if (lVar2 != null) {
            lVar2.e(this, new G(new L(this, this, 1), 8));
        }
        if (TextUtils.isEmpty(BaseApplication.get().getUser().getAccountNumber())) {
            PrivacyAccountNoSettingsViewModel privacyAccountNoSettingsViewModel = (PrivacyAccountNoSettingsViewModel) l();
            privacyAccountNoSettingsViewModel.getClass();
            f.s(privacyAccountNoSettingsViewModel, new T(1, null), privacyAccountNoSettingsViewModel.f26437e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}

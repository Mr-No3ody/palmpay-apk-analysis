package com.transsnet.palmpay.account.ui.activity;

import Bc.f;
import C9.Q;
import Ed.U;
import F8.d;
import F8.e;
import Fd.G;
import Gb.T;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p097g9.S;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/add_extra_result")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddUserExtraInfoResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddUserExtraInfoResultActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,192:1\n1#2:193\n115#3,8:194\n145#3:202\n171#3,12:203\n215#3:215\n*S KotlinDebug\n*F\n+ 1 AddUserExtraInfoResultActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoResultActivity\n*L\n73#1:194,8\n73#1:202\n82#1:203,12\n82#1:215\n*E\n"})
public final class AddUserExtraInfoResultActivity extends BaseMvvmActivity<PalmPayLevelViewModel> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25822d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f25823c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull AddUserExtraActionRsp it) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(it, "it");
            Intent intent = new Intent(context, (Class<?>) AddUserExtraInfoResultActivity.class);
            intent.putExtra("extra_data", ((Gson) C0525w.f().f7166b).toJson(it));
            ActivityUtils.startActivity(intent);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra;
        String stringExtra2;
        Intent intent = getIntent();
        if (intent != null && (stringExtra2 = intent.getStringExtra("extra_data")) != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = null;
            }
            if (stringExtra2 != null) {
                m(stringExtra2);
            }
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra = intent2.getStringExtra("kycPreCheckResults")) != null) {
            String str = TextUtils.isEmpty(stringExtra) ? null : stringExtra;
            if (str != null) {
                m(str);
            }
        }
        l lVar = ((PalmPayLevelViewModel) l()).f26435o;
        if (lVar != null) {
            lVar.e(this, new G(new U(1), 6));
        }
        l lVar2 = ((PalmPayLevelViewModel) l()).f26434j;
        if (lVar2 != null) {
            lVar2.e(this, new G(new Q(20, this, this), 6));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_add_user_extra_info_result, (ViewGroup) null, false);
        int i7 = d.adView;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i7 = d.ivBanner;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = d.ivIcon;
                ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView2 != null) {
                    i7 = d.tvComplete;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvConfirm;
                        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                        if (ppButton != null) {
                            i7 = d.tvMsg;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = d.tvTitle;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    f fVar = new f(linearLayout, singleAdView, imageView, imageView2, textView, ppButton, textView2, textView3, 3);
                                    this.f25823c = fVar;
                                    return fVar;
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

    public final void m(String str) {
        f fVar;
        AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) d0.l(AddUserExtraActionRsp.class, str);
        if (addUserExtraActionRsp != null) {
            f fVar2 = this.f25823c;
            if (fVar2 != null) {
                ((TextView) fVar2.f703j).setText(addUserExtraActionRsp.submitPopUpBody);
            }
            if (!TextUtils.isEmpty(addUserExtraActionRsp.submitPopUpTitle) && (fVar = this.f25823c) != null) {
                ((TextView) fVar.f696b).setText(addUserExtraActionRsp.submitPopUpTitle);
            }
            String str2 = addUserExtraActionRsp.mobileMoneyAccountTier;
            if (Intrinsics.c(str2, "1")) {
                f fVar3 = this.f25823c;
                if (fVar3 != null) {
                    ((PpButton) fVar3.f702i).setText("Upgrade to Tier 2");
                }
                f fVar4 = this.f25823c;
                if (fVar4 != null) {
                    ((SingleAdView) fVar4.f698d).setSlotId("6CF5FC647EA44251B09847DC610820C1");
                }
            } else if (Intrinsics.c(str2, "2")) {
                f fVar5 = this.f25823c;
                if (fVar5 != null) {
                    ((PpButton) fVar5.f702i).setText("Upgrade to Tier 3");
                }
                f fVar6 = this.f25823c;
                if (fVar6 != null) {
                    ((SingleAdView) fVar6.f698d).setSlotId("9D53398C73C14DEAAD05C4D2C4EE8EE9");
                }
            }
            f fVar7 = this.f25823c;
            if (fVar7 != null) {
                ((PpButton) fVar7.f702i).setOnClickListener(new T(15, str2, this));
            }
            if (!TextUtils.isEmpty(addUserExtraActionRsp.transactionLimitUrl)) {
                f fVar8 = this.f25823c;
                if (i0.V(fVar8 != null ? (LinearLayout) fVar8.f697c : null)) {
                    f fVar9 = this.f25823c;
                    r0.l1(addUserExtraActionRsp.transactionLimitDarkUrl, fVar9 != null ? (ImageView) fVar9.f699e : null);
                } else {
                    f fVar10 = this.f25823c;
                    r0.l1(addUserExtraActionRsp.transactionLimitUrl, fVar10 != null ? (ImageView) fVar10.f699e : null);
                }
            }
            f fVar11 = this.f25823c;
            if (fVar11 != null) {
                ((TextView) fVar11.f701g).setOnClickListener(new T(16, addUserExtraActionRsp, this));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) l();
        palmPayLevelViewModel.getClass();
        p140j8.f.s(palmPayLevelViewModel, new S(1, null), palmPayLevelViewModel.f26435o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        f fVar = this.f25823c;
        r0.l1("https://static.chuanyinet.com/images/icon-Congratulations4b76201e-56b3-4a.png", fVar != null ? (ImageView) fVar.f700f : null);
        f fVar2 = this.f25823c;
        org.chromium.support_lib_boundary.util.b.c(fVar2 != null ? (SingleAdView) fVar2.f698d : null);
    }
}

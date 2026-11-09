package com.transsnet.palmpay.account.ui.activity;

import Bc.C0107d;
import Bc.i;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import N8.T;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p042cg.f;
import p115ha.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/settinglockpin")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SetSafeLockPinActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetSafeLockPinActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26008d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f26011c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f26009a = r0.o0();
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(e.ac_set_auto_logout_activity, (ViewGroup) null, false);
        int i7 = d.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null && (viewM = p059e1.a.m((i7 = d.llClose), viewInflate)) != null) {
            C0107d c0107dB = C0107d.b(viewM);
            i7 = d.llEvery;
            View viewM2 = p059e1.a.m(i7, viewInflate);
            if (viewM2 != null) {
                C0107d c0107dB2 = C0107d.b(viewM2);
                i7 = d.llHalf;
                View viewM3 = p059e1.a.m(i7, viewInflate);
                if (viewM3 != null) {
                    C0107d c0107dB3 = C0107d.b(viewM3);
                    i7 = d.scrollContent;
                    if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = d.titleBar;
                        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = d.tvLogoutSubtitle;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = d.tvLogoutTitle;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i iVar = new i((ConstraintLayout) viewInflate, frameLayout, c0107dB, c0107dB2, c0107dB3, textView, textView2, 14);
                                    this.f26011c = iVar;
                                    return iVar;
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

    public final void l(int i7) {
        if (this.f26009a != i7) {
            this.f26009a = i7;
            if (this.f26010b == 0) {
                ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).withInt("extra_mode", 3).navigation(this, 257);
            } else {
                n();
            }
        }
    }

    public final void m() {
        i iVar = this.f26011c;
        if (iVar != null) {
            C0107d c0107d = (C0107d) iVar.f727e;
            boolean z3 = this.f26009a == 3;
            ((ConstraintLayout) c0107d.f680b).setSelected(z3);
            ((IconicsCheckBox) c0107d.f681c).setChecked(z3);
        }
        i iVar2 = this.f26011c;
        if (iVar2 != null) {
            C0107d c0107d2 = (C0107d) iVar2.f725c;
            boolean z8 = this.f26009a == 2;
            ((ConstraintLayout) c0107d2.f680b).setSelected(z8);
            ((IconicsCheckBox) c0107d2.f681c).setChecked(z8);
        }
        i iVar3 = this.f26011c;
        if (iVar3 != null) {
            C0107d c0107d3 = (C0107d) iVar3.f730i;
            boolean z10 = this.f26009a == 1;
            ((ConstraintLayout) c0107d3.f680b).setSelected(z10);
            ((IconicsCheckBox) c0107d3.f681c).setChecked(z10);
        }
        int i7 = this.f26009a;
        if (i7 == 0 || i7 == 3) {
            o(false);
        } else {
            o(true);
        }
    }

    public final void n() {
        int i7 = this.f26009a;
        SPUtils.getInstance().put(BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PIN_SETTING", i7);
        int i10 = this.f26009a;
        o((i10 == 3 || i10 == 0) ? false : true);
        String strH = com.transsnet.palmpay.core.config.d.h();
        Intrinsics.checkNotNullExpressionValue(strH, "getKeyLastPinTime(...)");
        p059e1.a.U(0, strH);
        m();
        String strH2 = com.transsnet.palmpay.core.config.d.h();
        Intrinsics.checkNotNullExpressionValue(strH2, "getKeyLastPinTime(...)");
        p059e1.a.U(0, strH2);
        c cVar = p115ha.b.f37362a;
        cVar.a(0L);
        int i11 = this.f26009a;
        cVar.f37367e = i11;
        String strValueOf = i11 == 0 ? "3" : String.valueOf(i11);
        n0.g().m("PalmPay_AutologoutSettingClickON", strValueOf, strValueOf);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new T(strValueOf, this, null), 2);
    }

    public final void o(boolean z3) {
        FrameLayout frameLayout;
        i iVar = this.f26011c;
        if (iVar == null || (frameLayout = (FrameLayout) iVar.f726d) == null) {
            return;
        }
        frameLayout.setVisibility(z3 ? 0 : 8);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 257) {
            if (i10 != -1) {
                this.f26009a = r0.o0();
            } else {
                this.f26010b = 1;
                n();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        i iVar = this.f26011c;
        if (iVar != null) {
            C0107d c0107d = (C0107d) iVar.f727e;
            int i7 = h.ac_password_free_login;
            int i10 = h.ac_password_free_login_desc;
            ((TextView) c0107d.f683e).setText(i7);
            ((TextView) c0107d.f682d).setText(i10);
        }
        i iVar2 = this.f26011c;
        if (iVar2 != null) {
            C0107d c0107d2 = (C0107d) iVar2.f730i;
            int i11 = h.ac_no_password_login_5mins;
            int i12 = h.ac_no_password_login_5mins_desc;
            ((TextView) c0107d2.f683e).setText(i11);
            ((TextView) c0107d2.f682d).setText(i12);
        }
        i iVar3 = this.f26011c;
        if (iVar3 != null) {
            C0107d c0107d3 = (C0107d) iVar3.f725c;
            int i13 = h.ac_password_on_each_login;
            int i14 = h.ac_password_on_each_login_desc;
            ((TextView) c0107d3.f683e).setText(i13);
            ((TextView) c0107d3.f682d).setText(i14);
        }
        i iVar4 = this.f26011c;
        if (iVar4 != null) {
            final int i15 = 0;
            ((ConstraintLayout) ((C0107d) iVar4.f727e).f680b).setOnClickListener(new View.OnClickListener(this) { // from class: N8.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SetSafeLockPinActivity f6174b;

                {
                    this.f6174b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetSafeLockPinActivity setSafeLockPinActivity = this.f6174b;
                    switch (i15) {
                        case 0:
                            int i16 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(3);
                                break;
                            }
                            break;
                        case 1:
                            int i17 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(2);
                                break;
                            }
                            break;
                        default:
                            int i18 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        i iVar5 = this.f26011c;
        if (iVar5 != null) {
            final int i16 = 1;
            ((ConstraintLayout) ((C0107d) iVar5.f725c).f680b).setOnClickListener(new View.OnClickListener(this) { // from class: N8.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SetSafeLockPinActivity f6174b;

                {
                    this.f6174b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetSafeLockPinActivity setSafeLockPinActivity = this.f6174b;
                    switch (i16) {
                        case 0:
                            int i17 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(3);
                                break;
                            }
                            break;
                        case 1:
                            int i18 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(2);
                                break;
                            }
                            break;
                        default:
                            int i19 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        i iVar6 = this.f26011c;
        if (iVar6 != null) {
            final int i17 = 2;
            ((ConstraintLayout) ((C0107d) iVar6.f730i).f680b).setOnClickListener(new View.OnClickListener(this) { // from class: N8.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SetSafeLockPinActivity f6174b;

                {
                    this.f6174b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetSafeLockPinActivity setSafeLockPinActivity = this.f6174b;
                    switch (i17) {
                        case 0:
                            int i18 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(3);
                                break;
                            }
                            break;
                        case 1:
                            int i19 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(2);
                                break;
                            }
                            break;
                        default:
                            int i110 = SetSafeLockPinActivity.f26008d;
                            if (!r0.U0()) {
                                setSafeLockPinActivity.l(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}

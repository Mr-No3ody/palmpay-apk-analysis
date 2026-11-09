package com.transsnet.palmpay.account.ui.fragment.security;

import Bc.f;
import F8.d;
import F8.h;
import Pa.C0521s;
import Pa.i0;
import Pa.r0;
import V9.q;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity;
import com.transsnet.palmpay.account.ui.fragment.security.SecurityModeSettingsFragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p038ca.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/security/SecurityModeSettingsFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityModeSettingsFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26245p = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p131id.a f26246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f26247j = new e(this, null, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f26248o;

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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(F8.e.ac_auto_logout_fragment, viewGroup, false);
        int i7 = d.clFingerprint;
        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = d.cl_pattern;
            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = d.cl_pattern_change;
                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                if (constraintLayout != null) {
                    i7 = d.cl_pattern_forgot;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                    if (constraintLayout2 != null) {
                        i7 = d.clPatternGroup;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = d.iivChangeArrow;
                            if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = d.iivForgotArrow;
                                if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = d.ivFingerSwitch;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = d.iv_pattern_switch;
                                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView2 != null) {
                                            i7 = d.tvFingerprint;
                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView != null) {
                                                i7 = d.tvVerifySubtitle;
                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView2 != null) {
                                                    i7 = d.tvVerifyTitle;
                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView3 != null) {
                                                        f fVar = new f((ConstraintLayout) viewInflate, constraintLayout, constraintLayout2, imageView, imageView2, textView, textView2, textView3, 5);
                                                        this.f26248o = fVar;
                                                        return fVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26246i = new p131id.a(getContext());
        f fVar = this.f26248o;
        if (fVar != null) {
            ((ConstraintLayout) fVar.f698d).setOnClickListener(this);
        }
        f fVar2 = this.f26248o;
        if (fVar2 != null) {
            ((ConstraintLayout) fVar2.f699e).setOnClickListener(this);
        }
        f fVar3 = this.f26248o;
        if (fVar3 != null) {
            ((ImageView) fVar3.f701g).setOnClickListener(this);
        }
        f fVar4 = this.f26248o;
        if (fVar4 != null) {
            ((ImageView) fVar4.f700f).setOnClickListener(this);
        }
        v();
        x();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 57 || i7 == 65) {
            if (i10 != -1) {
                u();
                return;
            }
            E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity");
            ((SetSafeLockPinActivity) activity).f26010b = 1;
            f fVar = this.f26248o;
            if (fVar != null) {
                r0.Q1(((ImageView) fVar.f701g).isSelected());
            }
            w();
            if (i7 == 65) {
                r0.o();
                return;
            } else {
                n.v(h.ac_pattern_turned_on);
                return;
            }
        }
        if (i7 == 67) {
            if (i10 == -1) {
                ARouter.getInstance().build("/account/set_pattern_pin").withBoolean("extra_use_night_mode", true).navigation();
                return;
            }
            return;
        }
        if (i7 == 146) {
            if (i10 != -1) {
                u();
                return;
            }
            E activity2 = getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity");
            ((SetSafeLockPinActivity) activity2).f26010b = 1;
            f fVar2 = this.f26248o;
            if (fVar2 != null) {
                r0.Q1(((ImageView) fVar2.f701g).isSelected());
            }
            w();
            return;
        }
        if (i7 == 69) {
            if (i10 == -1) {
                ARouter.getInstance().build("/account/set_pattern_pin").withBoolean("extra_use_night_mode", true).withInt("jump_source", 1).navigation();
            }
        } else {
            if (i7 != 70) {
                return;
            }
            if (i10 != -1) {
                x();
                return;
            }
            E activity3 = getActivity();
            Intrinsics.f(activity3, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity");
            ((SetSafeLockPinActivity) activity3).f26010b = 1;
            try {
                Intent intent2 = new Intent("com.transsnet.palmpay.action.SET_PATTERN_PIN");
                Context context = getContext();
                intent2.setPackage(context != null ? context.getPackageName() : null);
                intent2.putExtra("extra_use_night_mode", true);
                startActivityForResult(intent2, 57);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i7 = 0;
        i7 = 0;
        final int i10 = 1;
        f fVar = this.f26248o;
        try {
            if (Intrinsics.c(view, fVar != null ? (ConstraintLayout) fVar.f698d : null)) {
                long j6 = SPUtils.getInstance().getLong(com.transsnet.palmpay.core.config.d.k());
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sbR = u.r(j6, "lockTime: ", ", nowTime: ");
                sbR.append(jElapsedRealtime);
                F6.d.h("PatternLockUtil", 3, sbR.toString());
                if (jElapsedRealtime - j6 < 600000) {
                    E activity = getActivity();
                    if (activity != null) {
                        io.fastkv.n.O(activity, 0, Integer.valueOf(k.core_verification_failed), null, null, null, null, CommonViewExtKt.string(h.ac_pattern_lock_hint, getActivity()), Integer.valueOf(k.core_use_pin), null, new View.OnClickListener(this) { // from class: Y8.a

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ SecurityModeSettingsFragment f11316b;

                            {
                                this.f11316b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                SecurityModeSettingsFragment securityModeSettingsFragment = this.f11316b;
                                switch (i7) {
                                    case 0:
                                        int i11 = SecurityModeSettingsFragment.f26245p;
                                        securityModeSettingsFragment.t(67);
                                        break;
                                    case 1:
                                        int i12 = SecurityModeSettingsFragment.f26245p;
                                        io.fastkv.n.M(false);
                                        D3.a.N("disable", "success", null);
                                        securityModeSettingsFragment.v();
                                        break;
                                    default:
                                        int i13 = SecurityModeSettingsFragment.f26245p;
                                        securityModeSettingsFragment.v();
                                        break;
                                }
                            }
                        }, Integer.valueOf(k.core_cancel), null, null, null, false, 0, 8385149);
                        return;
                    }
                    return;
                }
                Intent intent = new Intent("com.transsnet.palmpay.action.CHECK_PATTERN_PIN");
                Context context = getContext();
                intent.setPackage(context != null ? context.getPackageName() : null);
                intent.putExtra("extra_use_night_mode", true);
                startActivityForResult(intent, 67);
                return;
            }
            f fVar2 = this.f26248o;
            if (Intrinsics.c(view, fVar2 != null ? (ConstraintLayout) fVar2.f699e : null)) {
                t(69);
                return;
            }
            f fVar3 = this.f26248o;
            if (Intrinsics.c(view, fVar3 != null ? (ImageView) fVar3.f701g : null)) {
                u();
                f fVar4 = this.f26248o;
                if (fVar4 != null ? ((ImageView) fVar4.f701g).isSelected() : false) {
                    t(70);
                    return;
                } else {
                    t(65);
                    return;
                }
            }
            f fVar5 = this.f26248o;
            if (!Intrinsics.c(view, fVar5 != null ? (ImageView) fVar5.f700f : null) || r0.U0()) {
                return;
            }
            p131id.a aVar = this.f26246i;
            if (aVar != null && !aVar.W()) {
                C0521s c0521s = C0521s.f7158a;
                C0521s.i(getContext());
                return;
            }
            f fVar6 = this.f26248o;
            if (fVar6 != null && ((ImageView) fVar6.f700f).isSelected()) {
                i7 = 1;
            }
            if (i7 != 0) {
                Context context2 = getContext();
                if (context2 != null) {
                    final int i11 = 2;
                    io.fastkv.n.O(context2, 0, null, getString(h.ac_disable_touch_id_login), null, null, null, getString(h.ac_disable_fingerprint_login_msg), Integer.valueOf(k.core_later), null, new View.OnClickListener(this) { // from class: Y8.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ SecurityModeSettingsFragment f11316b;

                        {
                            this.f11316b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SecurityModeSettingsFragment securityModeSettingsFragment = this.f11316b;
                            switch (i11) {
                                case 0:
                                    int i12 = SecurityModeSettingsFragment.f26245p;
                                    securityModeSettingsFragment.t(67);
                                    break;
                                case 1:
                                    int i13 = SecurityModeSettingsFragment.f26245p;
                                    io.fastkv.n.M(false);
                                    D3.a.N("disable", "success", null);
                                    securityModeSettingsFragment.v();
                                    break;
                                default:
                                    int i14 = SecurityModeSettingsFragment.f26245p;
                                    securityModeSettingsFragment.v();
                                    break;
                            }
                        }
                    }, null, getString(h.ac_disable), new View.OnClickListener(this) { // from class: Y8.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ SecurityModeSettingsFragment f11316b;

                        {
                            this.f11316b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SecurityModeSettingsFragment securityModeSettingsFragment = this.f11316b;
                            switch (i10) {
                                case 0:
                                    int i12 = SecurityModeSettingsFragment.f26245p;
                                    securityModeSettingsFragment.t(67);
                                    break;
                                case 1:
                                    int i13 = SecurityModeSettingsFragment.f26245p;
                                    io.fastkv.n.M(false);
                                    D3.a.N("disable", "success", null);
                                    securityModeSettingsFragment.v();
                                    break;
                                default:
                                    int i14 = SecurityModeSettingsFragment.f26245p;
                                    securityModeSettingsFragment.v();
                                    break;
                            }
                        }
                    }, null, true, 0, 8292987);
                    return;
                }
                return;
            }
            Intent intentQ = i0.q(getActivity());
            intentQ.putExtra("extra_mode", 1);
            intentQ.putExtra("extra_scene", "_scene_login_with_touch");
            intentQ.putExtra("_encrypt", true);
            intentQ.putExtra("extra_use_night_mode", true);
            this.f26247j.f(intentQ, new q(this, 18));
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v();
        x();
    }

    public final void t(int i7) {
        E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity");
        try {
            if (((SetSafeLockPinActivity) activity).f26010b > 0 && i7 == 70) {
                Intent intent = new Intent("com.transsnet.palmpay.action.SET_PATTERN_PIN");
                Context context = getContext();
                intent.setPackage(context != null ? context.getPackageName() : null);
                intent.putExtra("extra_use_night_mode", true);
                startActivityForResult(intent, 57);
                return;
            }
            E activity2 = getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.SetSafeLockPinActivity");
            if (((SetSafeLockPinActivity) activity2).f26010b <= 0 || i7 != 65) {
                Intent intentQ = i0.q(getActivity());
                Context context2 = getContext();
                intentQ.setPackage(context2 != null ? context2.getPackageName() : null);
                intentQ.putExtra("extra_use_night_mode", true);
                startActivityForResult(intentQ, i7);
                return;
            }
            f fVar = this.f26248o;
            if (fVar != null) {
                r0.Q1(((ImageView) fVar.f701g).isSelected());
            }
            w();
            r0.o();
        } catch (Exception unused) {
        }
    }

    public final void u() {
        ImageView imageView;
        f fVar = this.f26248o;
        if (fVar == null || (imageView = (ImageView) fVar.f701g) == null) {
            return;
        }
        imageView.setSelected(!imageView.isSelected());
    }

    public final void v() {
        ImageView imageView;
        f fVar = this.f26248o;
        if (fVar == null || (imageView = (ImageView) fVar.f700f) == null) {
            return;
        }
        imageView.setSelected(io.fastkv.n.v());
    }

    public final void w() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ImageView imageView;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        if (!i0.W(getActivity()) || isDetached()) {
            return;
        }
        f fVar = this.f26248o;
        if (fVar == null || (imageView = (ImageView) fVar.f701g) == null || !imageView.isSelected()) {
            f fVar2 = this.f26248o;
            if (fVar2 != null && (constraintLayout2 = (ConstraintLayout) fVar2.f699e) != null) {
                constraintLayout2.setVisibility(8);
            }
            f fVar3 = this.f26248o;
            if (fVar3 == null || (constraintLayout = (ConstraintLayout) fVar3.f698d) == null) {
                return;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        f fVar4 = this.f26248o;
        if (fVar4 != null && (constraintLayout4 = (ConstraintLayout) fVar4.f699e) != null) {
            constraintLayout4.setVisibility(0);
        }
        f fVar5 = this.f26248o;
        if (fVar5 == null || (constraintLayout3 = (ConstraintLayout) fVar5.f698d) == null) {
            return;
        }
        constraintLayout3.setVisibility(0);
    }

    public final void x() {
        ImageView imageView;
        f fVar = this.f26248o;
        if (fVar != null && (imageView = (ImageView) fVar.f701g) != null) {
            imageView.setSelected(SPUtils.getInstance().getBoolean(com.transsnet.palmpay.core.config.d.l(), false));
        }
        w();
    }
}

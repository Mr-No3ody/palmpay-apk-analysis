package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import C0.G;
import Fe.Y;
import Ie.u;
import Ke.h;
import L6.b;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.settings.AccountNumberActivity;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.ui.dialog.EditNameDialogFragment;
import com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.greenrobot.eventbus.c;
import p025ba.k;
import p183m6.n;
import p270rd.C1976t;
import p284sb.A;
import p355xf.C2131j;
import p355xf.t;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "个人信息/My Profile", path = "/main/personal_info")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/PersonalActivityV2;", "Lcom/transsnet/palmpay/core/base/i;", "LFe/Y;", "Lcom/transsnet/palmpay/ui/mvp/contract/PersonalActivityContract$View;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersonalActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalActivityV2.kt\ncom/transsnet/palmpay/ui/activity/settings/PersonalActivityV2\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,568:1\n562#2,10:569\n*S KotlinDebug\n*F\n+ 1 PersonalActivityV2.kt\ncom/transsnet/palmpay/ui/activity/settings/PersonalActivityV2\n*L\n91#1:569,10\n*E\n"})
public final class PersonalActivityV2 extends i implements PersonalActivityContract.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f34952C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public u f34953A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public User f34954B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f34955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34956c = C2131j.b(new C1976t(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f34957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f34958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m1 f34959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f34960g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f34961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f34962j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f34963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f34964p;
    public u t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u f34965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f34966w;

    public static int m() {
        try {
            return n.f39523a.instance().c("ProfileAccountStatus", 0).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_personal_activity_v2;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract.View
    public final void handleCheckUpdateNameLimit(CommonResult response) {
        User user;
        User user2;
        User user3;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccess()) {
            if (!"CFRONT_800118".equals(response.getRespCode())) {
                String respMsg = response.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                p220oa.h.z(this, respMsg, null, null, 45);
                return;
            } else {
                String respMsg2 = response.getRespMsg();
                if (respMsg2 != null) {
                    io.fastkv.n.O(this, 0, Integer.valueOf(k.core_title_attention), null, null, null, null, respMsg2, Integer.valueOf(k.core_confirm), null, null, null, null, null, null, false, 0, 8388221).show();
                    return;
                }
                return;
            }
        }
        User user4 = this.f34954B;
        if ((user4 == null || !user4.isAuthenticated()) && (((user = this.f34954B) == null || !user.isTier2User()) && (((user2 = this.f34954B) == null || !user2.isTier3User()) && ((user3 = this.f34954B) == null || !user3.isMobileRealNameAuth())))) {
            d.F("/account/edit_name");
        } else {
            i0.b0("/#/modify/information");
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x016b A[PHI: r6
      0x016b: PHI (r6v2 long) = (r6v1 long), (r6v0 long), (r6v7 long) binds: [B:105:0x016b, B:77:0x014c, B:82:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract.View
    public final void handleMemberInfo(MemberInfo rsp) {
        View view;
        ImageView imageView;
        TextView textViewA;
        TextView textViewA2;
        TextView textViewA3;
        m1 m1Var;
        TextView textViewA4;
        boolean z3;
        TextView textViewA5;
        String email;
        m1 m1Var2;
        TextView textViewA6;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        n();
        String str = rsp.mailAuthstatus;
        if (Intrinsics.c(str, "1")) {
            m1 m1Var3 = this.f34959f;
            if (m1Var3 != null) {
                IconicsDrawable drawable = p059e1.a.h(this, S6.a.pay_Security, null, CommonViewExtKt.colorInt(b.ppColorSuccess, this), 16.0f);
                Intrinsics.checkNotNullExpressionValue(drawable, "buildIconDrawable(...)");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                t tVar = (t) m1Var3.f12975e;
                ImageView imageView2 = (ImageView) tVar.getValue();
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ImageView imageView3 = (ImageView) tVar.getValue();
                if (imageView3 != null) {
                    imageView3.setImageDrawable(drawable);
                }
            }
            User user = this.f34954B;
            if (user != null && (email = user.getEmail()) != null && (m1Var2 = this.f34959f) != null && (textViewA6 = m1Var2.a()) != null) {
                textViewA6.setText(email);
            }
            m1 m1Var4 = this.f34959f;
            if (m1Var4 != null && (textViewA5 = m1Var4.a()) != null) {
                textViewA5.setTextColor(getColor(b.ppColorTextAssist));
            }
        } else if (Intrinsics.c(str, "2")) {
            String str2 = rsp.mailAuthDesc;
            if (str2 != null && (m1Var = this.f34959f) != null && (textViewA4 = m1Var.a()) != null) {
                textViewA4.setText(str2);
            }
            m1 m1Var5 = this.f34959f;
            if (m1Var5 != null) {
                int i7 = r.cv_icon_warning_yellow;
                t tVar2 = (t) m1Var5.f12975e;
                ImageView imageView4 = (ImageView) tVar2.getValue();
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
                ImageView imageView5 = (ImageView) tVar2.getValue();
                if (imageView5 != null) {
                    imageView5.setImageResource(i7);
                }
            }
            m1 m1Var6 = this.f34959f;
            if (m1Var6 != null && (textViewA3 = m1Var6.a()) != null) {
                textViewA3.setTextColor(getColor(b.ppColorWarning));
            }
        } else {
            m1 m1Var7 = this.f34959f;
            if (m1Var7 != null && (textViewA2 = m1Var7.a()) != null) {
                textViewA2.setText(TextUtils.isEmpty(rsp.mailAuthDesc) ? "Add Email" : rsp.mailAuthDesc);
            }
            m1 m1Var8 = this.f34959f;
            if (m1Var8 != null && (textViewA = m1Var8.a()) != null) {
                textViewA.setTextColor(getColor(b.ppColorTextAssist));
            }
            m1 m1Var9 = this.f34959f;
            if (m1Var9 != null && (imageView = (ImageView) ((t) m1Var9.f12975e).getValue()) != null) {
                imageView.setVisibility(8);
            }
            m1 m1Var10 = this.f34959f;
            if (m1Var10 != null && (view = (View) ((t) m1Var10.f12977g).getValue()) != null) {
                view.setVisibility(0);
            }
        }
        h hVar = this.f34955b;
        if (hVar != null) {
            long j6 = rsp.lastLoginTime;
            long j10 = 0;
            Bc.i iVar = (Bc.i) hVar.f5446d;
            if (j6 <= 0) {
                if (iVar != null) {
                    p220oa.h.c((TextView) iVar.f729g);
                }
                if (iVar != null) {
                    p220oa.h.s((Group) iVar.f726d, true);
                    return;
                }
                return;
            }
            try {
                String string = SPUtils.getInstance().getString(com.transsnet.palmpay.core.config.d.i());
                Intrinsics.e(string);
                ArrayList arrayListZ = CollectionsKt.Z(StringsKt__StringsKt.split$default(string, new String[]{"||"}, false, 0, 6, null));
                if (arrayListZ.size() > 0) {
                    j10 = TextUtils.isEmpty((CharSequence) arrayListZ.get(0)) ? 0L : Long.parseLong((String) arrayListZ.get(0));
                    z3 = arrayListZ.size() > 1;
                }
            } catch (Exception unused) {
            }
            if (!z3) {
                long j11 = rsp.currentLoginTime;
                j10 = j10 > j11 ? j11 : rsp.lastLoginTime;
            }
            if (iVar != null) {
                p220oa.h.C((TextView) iVar.f729g);
            }
            if (iVar != null) {
                TextView textView = (TextView) iVar.f729g;
                Context context = (Context) hVar.f5445c;
                textView.setText(context != null ? context.getString(Ac.h.main_last_login_time, TimeUtils.millis2String(j10, new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"))) : null);
            }
            if (iVar != null) {
                p220oa.h.s((Group) iVar.f726d, false);
            }
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract.View
    public final void handlePersonalInfo(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f34954B = user;
        o(user);
        G.u(4, c.b());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new Y();
    }

    public final void n() {
        View view;
        View view2;
        ImageView imageView;
        if (this.f34959f == null) {
            ViewStub viewStub = (ViewStub) findViewById(e.emailItemStub);
            final m1 m1Var = new m1();
            m1Var.f12972b = null;
            final int i7 = 0;
            m1Var.f12971a = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i10 = 1;
            m1Var.f12973c = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i11 = 2;
            m1Var.f12974d = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i12 = 3;
            m1Var.f12975e = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i13 = 4;
            C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i14 = 5;
            m1Var.f12976f = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            final int i15 = 6;
            m1Var.f12977g = C2131j.b(new Function0() { // from class: Le.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            View view3 = (View) m1Var.f12972b;
                            if (view3 != null) {
                                return view3.findViewById(e.mp_view_bottom_line);
                            }
                            return null;
                        case 1:
                            View view4 = (View) m1Var.f12972b;
                            if (view4 != null) {
                                return view4.findViewById(e.mp_view_top_line);
                            }
                            return null;
                        case 2:
                            View view5 = (View) m1Var.f12972b;
                            if (view5 != null) {
                                return (TextView) view5.findViewById(e.mp_tv_right);
                            }
                            return null;
                        case 3:
                            View view6 = (View) m1Var.f12972b;
                            if (view6 != null) {
                                return (ImageView) view6.findViewById(e.imageViewRight);
                            }
                            return null;
                        case 4:
                            View view7 = (View) m1Var.f12972b;
                            if (view7 != null) {
                                return (TextView) view7.findViewById(e.mp_tv_left2);
                            }
                            return null;
                        case 5:
                            View view8 = (View) m1Var.f12972b;
                            if (view8 != null) {
                                return (TextView) view8.findViewById(e.mp_tv_left1);
                            }
                            return null;
                        default:
                            View view9 = (View) m1Var.f12972b;
                            if (view9 != null) {
                                return view9.findViewById(e.ivNew);
                            }
                            return null;
                    }
                }
            });
            if (viewStub != null) {
                m1Var.f12972b = viewStub.inflate();
            }
            this.f34959f = m1Var;
            String string = getString(k.core_email);
            TextView textView = (TextView) ((t) m1Var.f12976f).getValue();
            if (textView != null) {
                textView.setText(string);
            }
            TextView textViewA = m1Var.a();
            if (textViewA != null) {
                textViewA.setText("");
            }
            m1 m1Var2 = this.f34959f;
            if (m1Var2 != null && (imageView = (ImageView) ((t) m1Var2.f12975e).getValue()) != null) {
                imageView.setVisibility(8);
            }
            m1 m1Var3 = this.f34959f;
            if (m1Var3 != null && (view2 = (View) ((t) m1Var3.f12971a).getValue()) != null) {
                p220oa.h.s(view2, true);
            }
            m1 m1Var4 = this.f34959f;
            if (m1Var4 != null && (view = (View) ((t) m1Var4.f12973c).getValue()) != null) {
                p220oa.h.s(view, false);
            }
            m1 m1Var5 = this.f34959f;
            if (m1Var5 != null) {
                A a3 = new A(6);
                View view3 = (View) m1Var5.f12972b;
                if (view3 != null) {
                    view3.setOnClickListener(a3);
                }
            }
        }
    }

    public final void o(User user) {
        TextView textView;
        TextView textView2;
        u uVar;
        TextView textView3;
        String string;
        Context context;
        View viewInflate;
        View viewFindViewById;
        if (user == null) {
            return;
        }
        if (this.f34966w == null) {
            u uVar2 = new u((ViewStub) findViewById(e.accountMgrItemStub));
            this.f34966w = uVar2;
            uVar2.c("Management of Accounts", "");
            u uVar3 = this.f34966w;
            if (uVar3 != null) {
                Intrinsics.checkNotNullParameter("main_sp_account_mgr_show", "key");
                boolean z3 = SPUtils.getInstance(p059e1.a.G("main_sp_account_mgr_show")).getBoolean(p367ya.a.d().e("main_sp_account_mgr_show"), true);
                View view = (View) uVar3.f4396a;
                if (view != null && (viewFindViewById = view.findViewById(e.ivNewDot)) != null) {
                    p220oa.h.s(viewFindViewById, z3);
                }
            }
            u uVar4 = this.f34966w;
            if (uVar4 != null) {
                uVar4.g(false);
            }
            u uVar5 = this.f34966w;
            if (uVar5 != null) {
                final int i7 = 5;
                uVar5.b(new View.OnClickListener(this) { // from class: se.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PersonalActivityV2 f42246b;

                    {
                        this.f42246b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        View view3;
                        View viewFindViewById2;
                        PersonalActivityV2 personalActivityV2 = this.f42246b;
                        switch (i7) {
                            case 0:
                                int i10 = PersonalActivityV2.f34952C;
                                AccountNumberActivity.f34946b.start(personalActivityV2);
                                break;
                            case 1:
                                int i11 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                                if (!BaseApplication.get().getUser().isAuthenticated()) {
                                    ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                                } else {
                                    try {
                                        d.n();
                                        ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                    } catch (Exception e10) {
                                        F6.d.c("RouterManager", "jumpToPath: ", e10);
                                        return;
                                    }
                                }
                                break;
                            case 2:
                                int i12 = PersonalActivityV2.f34952C;
                                O6.c cVar = new O6.c(personalActivityV2);
                                cVar.f6596b = O6.d.f("Update Information");
                                cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                                cVar.d(k.core_got_it, null);
                                cVar.g();
                                break;
                            case 3:
                                int i13 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                                personalActivityV2.getClass();
                                Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                                p038ca.e f28604i = personalActivityV2.getF28604i();
                                Intrinsics.e(intentC);
                                f28604i.f(intentC, new d(personalActivityV2, 0));
                                break;
                            case 4:
                                int i14 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                                EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("nickname", true);
                                editNameDialogFragment.setArguments(bundle);
                                personalActivityV2.showDialogFragment(editNameDialogFragment);
                                break;
                            case 5:
                                int i15 = PersonalActivityV2.f34952C;
                                p059e1.a.Z("main_sp_account_mgr_show", false);
                                u uVar6 = personalActivityV2.f34966w;
                                if (uVar6 != null && (view3 = (View) uVar6.f4396a) != null && (viewFindViewById2 = view3.findViewById(e.ivNewDot)) != null) {
                                    p220oa.h.s(viewFindViewById2, false);
                                }
                                i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                                break;
                            default:
                                int i16 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                                User user2 = personalActivityV2.f34954B;
                                if (user2 != null) {
                                    if (!user2.shouldApplyForBalance()) {
                                        d.F("/account/palmpayLevel");
                                    } else {
                                        d.F("/account/ask_apply_for_balance");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (this.f34955b == null) {
            ViewStub viewStub = (ViewStub) findViewById(e.userInfoStub);
            h hVar = new h(1);
            if (viewStub != null) {
                try {
                    viewInflate = viewStub.inflate();
                } catch (Exception unused) {
                }
            } else {
                viewInflate = null;
            }
            hVar.f5444b = viewInflate;
            View view2 = (View) hVar.f5444b;
            if (view2 != null) {
                hVar.f5445c = view2.getContext();
                int i10 = e.groupAccountNo;
                Group group = (Group) p059e1.a.m(i10, view2);
                if (group != null) {
                    i10 = e.ivAvatar;
                    RoundImageView roundImageView = (RoundImageView) p059e1.a.m(i10, view2);
                    if (roundImageView != null) {
                        i10 = e.ivPremium;
                        ImageView imageView = (ImageView) p059e1.a.m(i10, view2);
                        if (imageView != null) {
                            i10 = e.tvAccountNo;
                            TextView textView4 = (TextView) p059e1.a.m(i10, view2);
                            if (textView4 != null) {
                                i10 = e.tvCopy;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, view2);
                                if (iconicsImageView != null) {
                                    i10 = e.tvLastLogin;
                                    TextView textView5 = (TextView) p059e1.a.m(i10, view2);
                                    if (textView5 != null) {
                                        i10 = e.tvPrivacyAccount;
                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i10, view2);
                                        if (iconicsTextView != null) {
                                            i10 = e.tvTitle;
                                            TextView textView6 = (TextView) p059e1.a.m(i10, view2);
                                            if (textView6 != null) {
                                                hVar.f5446d = new Bc.i((ConstraintLayout) view2, group, roundImageView, imageView, textView4, iconicsImageView, textView5, iconicsTextView, textView6);
                                                boolean zU = com.transsnet.palmpay.core.config.d.u();
                                                iconicsImageView.setOnClickListener(hVar);
                                                p220oa.h.s(iconicsImageView, !zU);
                                                iconicsTextView.setOnClickListener(hVar);
                                                p220oa.h.s(iconicsTextView, zU);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
            }
            this.f34955b = hVar;
            final int i11 = 3;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: se.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PersonalActivityV2 f42246b;

                {
                    this.f42246b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    View view4;
                    View viewFindViewById2;
                    PersonalActivityV2 personalActivityV2 = this.f42246b;
                    switch (i11) {
                        case 0:
                            int i12 = PersonalActivityV2.f34952C;
                            AccountNumberActivity.f34946b.start(personalActivityV2);
                            break;
                        case 1:
                            int i13 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                            if (!BaseApplication.get().getUser().isAuthenticated()) {
                                ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                            } else {
                                try {
                                    d.n();
                                    ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                } catch (Exception e10) {
                                    F6.d.c("RouterManager", "jumpToPath: ", e10);
                                    return;
                                }
                            }
                            break;
                        case 2:
                            int i14 = PersonalActivityV2.f34952C;
                            O6.c cVar = new O6.c(personalActivityV2);
                            cVar.f6596b = O6.d.f("Update Information");
                            cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                            cVar.d(k.core_got_it, null);
                            cVar.g();
                            break;
                        case 3:
                            int i15 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                            personalActivityV2.getClass();
                            Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                            p038ca.e f28604i = personalActivityV2.getF28604i();
                            Intrinsics.e(intentC);
                            f28604i.f(intentC, new d(personalActivityV2, 0));
                            break;
                        case 4:
                            int i16 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                            EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("nickname", true);
                            editNameDialogFragment.setArguments(bundle);
                            personalActivityV2.showDialogFragment(editNameDialogFragment);
                            break;
                        case 5:
                            int i17 = PersonalActivityV2.f34952C;
                            p059e1.a.Z("main_sp_account_mgr_show", false);
                            u uVar6 = personalActivityV2.f34966w;
                            if (uVar6 != null && (view4 = (View) uVar6.f4396a) != null && (viewFindViewById2 = view4.findViewById(e.ivNewDot)) != null) {
                                p220oa.h.s(viewFindViewById2, false);
                            }
                            i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                            break;
                        default:
                            int i18 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                            User user2 = personalActivityV2.f34954B;
                            if (user2 != null) {
                                if (!user2.shouldApplyForBalance()) {
                                    d.F("/account/palmpayLevel");
                                } else {
                                    d.F("/account/ask_apply_for_balance");
                                }
                                break;
                            }
                            break;
                    }
                }
            };
            Bc.i iVar = (Bc.i) hVar.f5446d;
            if (iVar != null) {
                ((RoundImageView) iVar.f725c).setOnClickListener(onClickListener);
            }
        }
        h hVar2 = this.f34955b;
        if (hVar2 != null) {
            Bc.i iVar2 = (Bc.i) hVar2.f5446d;
            if (iVar2 != null) {
                TextView textView7 = (TextView) iVar2.f730i;
                if (TextUtils.isEmpty(user.getDisplayName())) {
                    string = "Hi";
                } else {
                    View view3 = (View) hVar2.f5444b;
                    string = (view3 == null || (context = view3.getContext()) == null) ? null : context.getString(k.core_hi, user.getDisplayName());
                }
                textView7.setText(string);
            }
            r0.h1(iVar2 != null ? (RoundImageView) iVar2.f725c : null, user.getAvatar(), r.cv_avatar_default);
            if (user.isPalmPayPremium()) {
                if (iVar2 != null) {
                    p220oa.h.s((ImageView) iVar2.f727e, true);
                }
                if (iVar2 != null) {
                    ((ImageView) iVar2.f727e).setOnClickListener(hVar2);
                }
                r0.d1(iVar2 != null ? (ImageView) iVar2.f727e : null, Ac.d.main_icon_premium);
            } else if (iVar2 != null) {
                p220oa.h.s((ImageView) iVar2.f727e, false);
            }
            if (iVar2 != null) {
                ((TextView) iVar2.f728f).setText(user.getFormatAccountNumber());
            }
        }
        n();
        if (this.f34957d == null) {
            u uVar6 = new u((ViewStub) findViewById(e.nickNameItemStub));
            this.f34957d = uVar6;
            final int i12 = 4;
            uVar6.b(new View.OnClickListener(this) { // from class: se.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PersonalActivityV2 f42246b;

                {
                    this.f42246b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    View view5;
                    View viewFindViewById2;
                    PersonalActivityV2 personalActivityV2 = this.f42246b;
                    switch (i12) {
                        case 0:
                            int i13 = PersonalActivityV2.f34952C;
                            AccountNumberActivity.f34946b.start(personalActivityV2);
                            break;
                        case 1:
                            int i14 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                            if (!BaseApplication.get().getUser().isAuthenticated()) {
                                ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                            } else {
                                try {
                                    d.n();
                                    ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                } catch (Exception e10) {
                                    F6.d.c("RouterManager", "jumpToPath: ", e10);
                                    return;
                                }
                            }
                            break;
                        case 2:
                            int i15 = PersonalActivityV2.f34952C;
                            O6.c cVar = new O6.c(personalActivityV2);
                            cVar.f6596b = O6.d.f("Update Information");
                            cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                            cVar.d(k.core_got_it, null);
                            cVar.g();
                            break;
                        case 3:
                            int i16 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                            personalActivityV2.getClass();
                            Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                            p038ca.e f28604i = personalActivityV2.getF28604i();
                            Intrinsics.e(intentC);
                            f28604i.f(intentC, new d(personalActivityV2, 0));
                            break;
                        case 4:
                            int i17 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                            EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("nickname", true);
                            editNameDialogFragment.setArguments(bundle);
                            personalActivityV2.showDialogFragment(editNameDialogFragment);
                            break;
                        case 5:
                            int i18 = PersonalActivityV2.f34952C;
                            p059e1.a.Z("main_sp_account_mgr_show", false);
                            u uVar7 = personalActivityV2.f34966w;
                            if (uVar7 != null && (view5 = (View) uVar7.f4396a) != null && (viewFindViewById2 = view5.findViewById(e.ivNewDot)) != null) {
                                p220oa.h.s(viewFindViewById2, false);
                            }
                            i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                            break;
                        default:
                            int i19 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                            User user2 = personalActivityV2.f34954B;
                            if (user2 != null) {
                                if (!user2.shouldApplyForBalance()) {
                                    d.F("/account/palmpayLevel");
                                } else {
                                    d.F("/account/ask_apply_for_balance");
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        u uVar7 = this.f34957d;
        if (uVar7 != null) {
            uVar7.c(getString(Ac.h.main_nick_name), user.getNickName());
        }
        if (this.f34958e == null) {
            u uVar8 = new u((ViewStub) findViewById(e.fullNameItemStub));
            this.f34958e = uVar8;
            final int i13 = 1;
            uVar8.b(new View.OnClickListener(this) { // from class: se.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PersonalActivityV2 f42246b;

                {
                    this.f42246b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    View view5;
                    View viewFindViewById2;
                    PersonalActivityV2 personalActivityV2 = this.f42246b;
                    switch (i13) {
                        case 0:
                            int i14 = PersonalActivityV2.f34952C;
                            AccountNumberActivity.f34946b.start(personalActivityV2);
                            break;
                        case 1:
                            int i15 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                            if (!BaseApplication.get().getUser().isAuthenticated()) {
                                ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                            } else {
                                try {
                                    d.n();
                                    ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                } catch (Exception e10) {
                                    F6.d.c("RouterManager", "jumpToPath: ", e10);
                                    return;
                                }
                            }
                            break;
                        case 2:
                            int i16 = PersonalActivityV2.f34952C;
                            O6.c cVar = new O6.c(personalActivityV2);
                            cVar.f6596b = O6.d.f("Update Information");
                            cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                            cVar.d(k.core_got_it, null);
                            cVar.g();
                            break;
                        case 3:
                            int i17 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                            personalActivityV2.getClass();
                            Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                            p038ca.e f28604i = personalActivityV2.getF28604i();
                            Intrinsics.e(intentC);
                            f28604i.f(intentC, new d(personalActivityV2, 0));
                            break;
                        case 4:
                            int i18 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                            EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("nickname", true);
                            editNameDialogFragment.setArguments(bundle);
                            personalActivityV2.showDialogFragment(editNameDialogFragment);
                            break;
                        case 5:
                            int i19 = PersonalActivityV2.f34952C;
                            p059e1.a.Z("main_sp_account_mgr_show", false);
                            u uVar9 = personalActivityV2.f34966w;
                            if (uVar9 != null && (view5 = (View) uVar9.f4396a) != null && (viewFindViewById2 = view5.findViewById(e.ivNewDot)) != null) {
                                p220oa.h.s(viewFindViewById2, false);
                            }
                            i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                            break;
                        default:
                            int i110 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                            User user2 = personalActivityV2.f34954B;
                            if (user2 != null) {
                                if (!user2.shouldApplyForBalance()) {
                                    d.F("/account/palmpayLevel");
                                } else {
                                    d.F("/account/ask_apply_for_balance");
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            u uVar9 = this.f34958e;
            if (uVar9 != null) {
                uVar9.g(false);
            }
            u uVar10 = this.f34958e;
            if (uVar10 != null) {
                uVar10.d(true);
            }
            if (BaseApplication.get().getUser().isAuthenticated() && (uVar = this.f34958e) != null && (textView3 = (TextView) ((t) uVar.f4404i).getValue()) != null) {
                textView3.setCompoundDrawables(null, null, G8.a.x(this, S6.a.pay_InformationOutline, null, Integer.valueOf(b.ppColorTextAssist), 14.0f, 114), null);
                final int i14 = 2;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: se.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PersonalActivityV2 f42246b;

                    {
                        this.f42246b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        View view5;
                        View viewFindViewById2;
                        PersonalActivityV2 personalActivityV2 = this.f42246b;
                        switch (i14) {
                            case 0:
                                int i15 = PersonalActivityV2.f34952C;
                                AccountNumberActivity.f34946b.start(personalActivityV2);
                                break;
                            case 1:
                                int i16 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                                if (!BaseApplication.get().getUser().isAuthenticated()) {
                                    ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                                } else {
                                    try {
                                        d.n();
                                        ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                    } catch (Exception e10) {
                                        F6.d.c("RouterManager", "jumpToPath: ", e10);
                                        return;
                                    }
                                }
                                break;
                            case 2:
                                int i17 = PersonalActivityV2.f34952C;
                                O6.c cVar = new O6.c(personalActivityV2);
                                cVar.f6596b = O6.d.f("Update Information");
                                cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                                cVar.d(k.core_got_it, null);
                                cVar.g();
                                break;
                            case 3:
                                int i18 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                                personalActivityV2.getClass();
                                Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                                p038ca.e f28604i = personalActivityV2.getF28604i();
                                Intrinsics.e(intentC);
                                f28604i.f(intentC, new d(personalActivityV2, 0));
                                break;
                            case 4:
                                int i19 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                                EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("nickname", true);
                                editNameDialogFragment.setArguments(bundle);
                                personalActivityV2.showDialogFragment(editNameDialogFragment);
                                break;
                            case 5:
                                int i110 = PersonalActivityV2.f34952C;
                                p059e1.a.Z("main_sp_account_mgr_show", false);
                                u uVar11 = personalActivityV2.f34966w;
                                if (uVar11 != null && (view5 = (View) uVar11.f4396a) != null && (viewFindViewById2 = view5.findViewById(e.ivNewDot)) != null) {
                                    p220oa.h.s(viewFindViewById2, false);
                                }
                                i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                                break;
                            default:
                                int i111 = PersonalActivityV2.f34952C;
                                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                                User user2 = personalActivityV2.f34954B;
                                if (user2 != null) {
                                    if (!user2.shouldApplyForBalance()) {
                                        d.F("/account/palmpayLevel");
                                    } else {
                                        d.F("/account/ask_apply_for_balance");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        u uVar11 = this.f34958e;
        if (uVar11 != null) {
            uVar11.c(getString(Ac.h.main_full_name), user.getFullName());
        }
        if (this.f34964p == null) {
            u uVar12 = new u((ViewStub) findViewById(e.genderItemStub));
            this.f34964p = uVar12;
            uVar12.f();
            u uVar13 = this.f34964p;
            if (uVar13 != null) {
                uVar13.e();
            }
            u uVar14 = this.f34964p;
            if (uVar14 != null) {
                uVar14.d(true);
            }
        }
        u uVar15 = this.f34964p;
        if (uVar15 != null) {
            uVar15.c(getString(k.core_gender), user.getDisplayGender());
        }
        if (this.t == null) {
            u uVar16 = new u((ViewStub) findViewById(e.birthdayItemStub));
            this.t = uVar16;
            uVar16.f();
            u uVar17 = this.t;
            if (uVar17 != null) {
                uVar17.e();
            }
            u uVar18 = this.t;
            if (uVar18 != null) {
                uVar18.d(true);
            }
        }
        u uVar19 = this.t;
        if (uVar19 != null) {
            uVar19.c(getString(k.core_date_of_birth), user.getBirthdayHide());
        }
        if (this.f34963o == null) {
            u uVar20 = new u((ViewStub) findViewById(e.addressItemStub));
            this.f34963o = uVar20;
            uVar20.c(getString(k.core_address), "");
            u uVar21 = this.f34963o;
            if (uVar21 != null) {
                uVar21.b(new A(5));
            }
        }
        if (this.f34960g == null) {
            u uVar22 = new u((ViewStub) findViewById(e.mobileItemStub));
            this.f34960g = uVar22;
            uVar22.d(true);
        }
        u uVar23 = this.f34960g;
        if (uVar23 != null) {
            uVar23.c(getString(k.core_mobile_number), !TextUtils.isEmpty(user.getAccountMobile()) ? user.getAccountMobile() : "To be updated");
        }
        u uVar24 = this.f34960g;
        if (uVar24 != null) {
            uVar24.e();
        }
        if (this.f34962j == null) {
            View viewFindViewById2 = findViewById(e.clPersonalKycLevelRow);
            this.f34962j = new a(viewFindViewById2, 11);
            final int i15 = 6;
            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: se.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PersonalActivityV2 f42246b;

                {
                    this.f42246b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    View view5;
                    View viewFindViewById3;
                    PersonalActivityV2 personalActivityV2 = this.f42246b;
                    switch (i15) {
                        case 0:
                            int i16 = PersonalActivityV2.f34952C;
                            AccountNumberActivity.f34946b.start(personalActivityV2);
                            break;
                        case 1:
                            int i17 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                            if (!BaseApplication.get().getUser().isAuthenticated()) {
                                ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                            } else {
                                try {
                                    d.n();
                                    ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                } catch (Exception e10) {
                                    F6.d.c("RouterManager", "jumpToPath: ", e10);
                                    return;
                                }
                            }
                            break;
                        case 2:
                            int i18 = PersonalActivityV2.f34952C;
                            O6.c cVar = new O6.c(personalActivityV2);
                            cVar.f6596b = O6.d.f("Update Information");
                            cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                            cVar.d(k.core_got_it, null);
                            cVar.g();
                            break;
                        case 3:
                            int i19 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                            personalActivityV2.getClass();
                            Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                            p038ca.e f28604i = personalActivityV2.getF28604i();
                            Intrinsics.e(intentC);
                            f28604i.f(intentC, new d(personalActivityV2, 0));
                            break;
                        case 4:
                            int i110 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                            EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("nickname", true);
                            editNameDialogFragment.setArguments(bundle);
                            personalActivityV2.showDialogFragment(editNameDialogFragment);
                            break;
                        case 5:
                            int i111 = PersonalActivityV2.f34952C;
                            p059e1.a.Z("main_sp_account_mgr_show", false);
                            u uVar110 = personalActivityV2.f34966w;
                            if (uVar110 != null && (view5 = (View) uVar110.f4396a) != null && (viewFindViewById3 = view5.findViewById(e.ivNewDot)) != null) {
                                p220oa.h.s(viewFindViewById3, false);
                            }
                            i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                            break;
                        default:
                            int i112 = PersonalActivityV2.f34952C;
                            n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                            User user2 = personalActivityV2.f34954B;
                            if (user2 != null) {
                                if (!user2.shouldApplyForBalance()) {
                                    d.F("/account/palmpayLevel");
                                } else {
                                    d.F("/account/ask_apply_for_balance");
                                }
                                break;
                            }
                            break;
                    }
                }
            };
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnClickListener(onClickListener2);
            }
        }
        a aVar = this.f34962j;
        if (aVar != null) {
            String userLevel = user.getUserLevel();
            boolean zIsEmpty = TextUtils.isEmpty(userLevel);
            IconicsTextView iconicsTextView2 = (IconicsTextView) aVar.f42646c;
            if (!zIsEmpty) {
                if (iconicsTextView2 != null) {
                    p220oa.h.C(iconicsTextView2);
                }
                if (iconicsTextView2 != null) {
                    iconicsTextView2.setText(userLevel);
                }
            } else if (iconicsTextView2 != null) {
                p220oa.h.c(iconicsTextView2);
            }
            boolean zIsTier3User = user.isTier3User();
            TextView textView8 = (TextView) aVar.f42647d;
            if (zIsTier3User) {
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else if (textView8 != null) {
                textView8.setVisibility(0);
            }
        }
        int iM = m();
        if (!TextUtils.isEmpty(user.getPhoneNumber()) && iM > 0) {
            if (this.f34961i == null) {
                this.f34961i = new u((ViewStub) findViewById(e.accountMobileItemStub));
                if (m() == 1) {
                    u uVar25 = this.f34961i;
                    if (uVar25 != null) {
                        uVar25.b(new A(2));
                    }
                } else {
                    u uVar26 = this.f34961i;
                    if (uVar26 != null) {
                        final int i16 = 0;
                        uVar26.b(new View.OnClickListener(this) { // from class: se.c

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ PersonalActivityV2 f42246b;

                            {
                                this.f42246b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                View view5;
                                View viewFindViewById3;
                                PersonalActivityV2 personalActivityV2 = this.f42246b;
                                switch (i16) {
                                    case 0:
                                        int i17 = PersonalActivityV2.f34952C;
                                        AccountNumberActivity.f34946b.start(personalActivityV2);
                                        break;
                                    case 1:
                                        int i18 = PersonalActivityV2.f34952C;
                                        n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Full Name"));
                                        if (!BaseApplication.get().getUser().isAuthenticated()) {
                                            ((Y) personalActivityV2.f27350a).checkUpdateNameLimit();
                                        } else {
                                            try {
                                                d.n();
                                                ARouter.getInstance().build("/account/palmpayLevel").withBoolean("extra_flag", true).navigation();
                                            } catch (Exception e10) {
                                                F6.d.c("RouterManager", "jumpToPath: ", e10);
                                                return;
                                            }
                                        }
                                        break;
                                    case 2:
                                        int i19 = PersonalActivityV2.f34952C;
                                        O6.c cVar = new O6.c(personalActivityV2);
                                        cVar.f6596b = O6.d.f("Update Information");
                                        cVar.f6598d = "If you have updated your personal information at the bank where you registered your BVN, please go to KYC Levels> KYC Details > Update Information to update your details";
                                        cVar.d(k.core_got_it, null);
                                        cVar.g();
                                        break;
                                    case 3:
                                        int i110 = PersonalActivityV2.f34952C;
                                        n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Selfie"));
                                        personalActivityV2.getClass();
                                        Intent intentC = F.c(personalActivityV2, ARouter.getInstance().build("/account/setUserPhoto").withString("photoType", "1"));
                                        p038ca.e f28604i = personalActivityV2.getF28604i();
                                        Intrinsics.e(intentC);
                                        f28604i.f(intentC, new d(personalActivityV2, 0));
                                        break;
                                    case 4:
                                        int i111 = PersonalActivityV2.f34952C;
                                        n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "NickName"));
                                        EditNameDialogFragment editNameDialogFragment = new EditNameDialogFragment();
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean("nickname", true);
                                        editNameDialogFragment.setArguments(bundle);
                                        personalActivityV2.showDialogFragment(editNameDialogFragment);
                                        break;
                                    case 5:
                                        int i112 = PersonalActivityV2.f34952C;
                                        p059e1.a.Z("main_sp_account_mgr_show", false);
                                        u uVar110 = personalActivityV2.f34966w;
                                        if (uVar110 != null && (view5 = (View) uVar110.f4396a) != null && (viewFindViewById3 = view5.findViewById(e.ivNewDot)) != null) {
                                            p220oa.h.s(viewFindViewById3, false);
                                        }
                                        i0.b0("/settings/upgrape-kyc/accounts-management?channelName=MyProfile");
                                        break;
                                    default:
                                        int i113 = PersonalActivityV2.f34952C;
                                        n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "KYC level"));
                                        User user2 = personalActivityV2.f34954B;
                                        if (user2 != null) {
                                            if (!user2.shouldApplyForBalance()) {
                                                d.F("/account/palmpayLevel");
                                            } else {
                                                d.F("/account/ask_apply_for_balance");
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
                u uVar27 = this.f34961i;
                if (uVar27 != null) {
                    uVar27.g(true);
                }
                u uVar28 = this.f34961i;
                if (uVar28 != null) {
                    uVar28.d(true);
                }
            }
            u uVar29 = this.f34961i;
            if (uVar29 != null) {
                uVar29.c(iM == 2 ? "Account Number" : "Account Mobile Number", iM == 2 ? user.getFormatAccountNumber() : r0.Y(user.getPhoneNumber()));
            }
        }
        if (this.f34965v == null) {
            u uVar30 = new u((ViewStub) findViewById(e.friendItemStub));
            this.f34965v = uVar30;
            uVar30.c(getString(Ac.h.main_friends), "");
            u uVar31 = this.f34965v;
            if (uVar31 != null) {
                String string2 = getString(Ac.h.main_msg_friend);
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                t tVar = (t) uVar31.f4402g;
                if (zIsEmpty2) {
                    TextView textView9 = (TextView) tVar.getValue();
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                } else {
                    TextView textView10 = (TextView) tVar.getValue();
                    if (textView10 != null) {
                        textView10.setVisibility(0);
                    }
                }
                TextView textView11 = (TextView) tVar.getValue();
                if (textView11 != null) {
                    textView11.setText(string2);
                }
            }
            u uVar32 = this.f34965v;
            if (uVar32 != null && (textView2 = (TextView) ((t) uVar32.f4403h).getValue()) != null) {
                p220oa.h.s(textView2, false);
            }
            u uVar33 = this.f34965v;
            if (uVar33 != null) {
                uVar33.d(false);
            }
            u uVar34 = this.f34965v;
            if (uVar34 != null) {
                uVar34.b(new A(4));
            }
        }
        if (this.f34953A == null) {
            u uVar35 = new u((ViewStub) findViewById(e.professionItemStub));
            this.f34953A = uVar35;
            uVar35.c("Occupation", "");
            u uVar36 = this.f34953A;
            if (uVar36 != null && (textView = (TextView) ((t) uVar36.f4403h).getValue()) != null) {
                p220oa.h.s(textView, false);
            }
            u uVar37 = this.f34953A;
            if (uVar37 != null) {
                uVar37.g(true);
            }
            u uVar38 = this.f34953A;
            if (uVar38 != null) {
                uVar38.d(false);
            }
            u uVar39 = this.f34953A;
            if (uVar39 != null) {
                uVar39.b(new A(3));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((Y) this.f27350a).loadPersonalInfo();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34954B = BaseApplication.getInstance().getUser();
        getWindow().getDecorView().post(new p7.h((Handler) this.f34956c.getValue(), 7, this, false));
        n0 n0VarG = n0.g();
        ViewEvent viewEvent = new ViewEvent("MyProfile_Show");
        User user = this.f34954B;
        n0VarG.u(viewEvent.add("Tier", user != null ? user.getMobileMoneyAccountTier() : null));
    }
}

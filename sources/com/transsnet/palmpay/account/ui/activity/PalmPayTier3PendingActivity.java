package com.transsnet.palmpay.account.ui.activity;

import Bc.i;
import C0.G;
import F8.d;
import F8.e;
import Gb.T;
import L6.b;
import N8.B;
import Pa.C0525w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.gson.Gson;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckApplyTier3Rsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/upgrade_tier3_result")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayTier3PendingActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "N8/B", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayTier3PendingActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25938i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f25939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PreCheckApplyTier3Rsp f25943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Tier3ApplyStatusRsp f25944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RealNameAuthInfoRsp f25945g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(a aVar, Context context, PreCheckApplyTier3Rsp preCheckApplyTier3Rsp, Tier3ApplyStatusRsp tier3ApplyStatusRsp, RealNameAuthInfoRsp realNameAuthInfoRsp, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                preCheckApplyTier3Rsp = null;
            }
            if ((i7 & 4) != 0) {
                tier3ApplyStatusRsp = null;
            }
            if ((i7 & 8) != 0) {
                realNameAuthInfoRsp = null;
            }
            aVar.launch(context, preCheckApplyTier3Rsp, tier3ApplyStatusRsp, realNameAuthInfoRsp);
        }

        public final void launch(@NotNull Context context, @Nullable PreCheckApplyTier3Rsp preCheckApplyTier3Rsp, @Nullable Tier3ApplyStatusRsp tier3ApplyStatusRsp, @Nullable RealNameAuthInfoRsp realNameAuthInfoRsp) {
            Intent intentE = G.e(context, "context", context, PalmPayTier3PendingActivity.class);
            if (preCheckApplyTier3Rsp != null) {
                intentE.putExtra("extra_data", ((Gson) C0525w.f().f7166b).toJson(preCheckApplyTier3Rsp));
            }
            if (realNameAuthInfoRsp != null) {
                intentE.putExtra("extra_data_1", ((Gson) C0525w.f().f7166b).toJson(realNameAuthInfoRsp));
            }
            if (tier3ApplyStatusRsp != null) {
                intentE.putExtra("extra_data_2", ((Gson) C0525w.f().f7166b).toJson(tier3ApplyStatusRsp));
            }
            context.startActivity(intentE);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0206  */
    /* JADX WARN: Code duplicated, block: B:68:0x0211  */
    /* JADX WARN: Code duplicated, block: B:70:0x0219  */
    /* JADX WARN: Code duplicated, block: B:72:0x021d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0228  */
    /* JADX WARN: Code duplicated, block: B:78:0x0233  */
    /* JADX WARN: Code duplicated, block: B:81:0x0245  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        final PalmPayTier3PendingActivity palmPayTier3PendingActivity;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        i iVar7;
        i iVar8;
        i iVar9;
        View viewFindViewById = findViewById(d.layoutT3Review);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        B b7 = new B(this, viewFindViewById);
        i iVar10 = this.f25939a;
        if (iVar10 != null) {
            final int i7 = 0;
            ((TextView) iVar10.f728f).setOnClickListener(new View.OnClickListener(this) { // from class: N8.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayTier3PendingActivity f6268b;

                {
                    this.f6268b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Tier3ApplyStatusRsp tier3ApplyStatusRsp;
                    PalmPayTier3PendingActivity palmPayTier3PendingActivity2 = this.f6268b;
                    switch (i7) {
                        case 0:
                            PalmPayTier3PendingActivity.a aVar = PalmPayTier3PendingActivity.f25938i;
                            palmPayTier3PendingActivity2.getClass();
                            PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(palmPayTier3PendingActivity2);
                            break;
                        case 1:
                            PalmPayTier3PendingActivity.a aVar2 = PalmPayTier3PendingActivity.f25938i;
                            p220oa.h.g(palmPayTier3PendingActivity2, "KycEmailClick");
                            Pa.i0.b0("/settings/verify-email/home");
                            break;
                        default:
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = palmPayTier3PendingActivity2.f25943e;
                            if ((preCheckApplyTier3Rsp != null && preCheckApplyTier3Rsp.isApplyFailed()) || ((tier3ApplyStatusRsp = palmPayTier3PendingActivity2.f25944f) != null && tier3ApplyStatusRsp.isApplyFailed())) {
                                Pa.n0.g().l("KYC_KycResubmitVerify_Click");
                                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayTier3PendingActivity2.f25943e;
                                if (preCheckApplyTier3Rsp2 != null) {
                                    preCheckApplyTier3Rsp2.applyTier3(palmPayTier3PendingActivity2.f25945g);
                                } else {
                                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade_tier3_export");
                                }
                                palmPayTier3PendingActivity2.finish();
                            } else {
                                Pa.n0.g().l("KYC_AddressSubmit_Click");
                                palmPayTier3PendingActivity2.finish();
                            }
                            break;
                    }
                }
            });
        }
        i iVar11 = this.f25939a;
        if (iVar11 != null) {
            final int i10 = 1;
            ((TextView) iVar11.f729g).setOnClickListener(new View.OnClickListener(this) { // from class: N8.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayTier3PendingActivity f6268b;

                {
                    this.f6268b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Tier3ApplyStatusRsp tier3ApplyStatusRsp;
                    PalmPayTier3PendingActivity palmPayTier3PendingActivity2 = this.f6268b;
                    switch (i10) {
                        case 0:
                            PalmPayTier3PendingActivity.a aVar = PalmPayTier3PendingActivity.f25938i;
                            palmPayTier3PendingActivity2.getClass();
                            PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(palmPayTier3PendingActivity2);
                            break;
                        case 1:
                            PalmPayTier3PendingActivity.a aVar2 = PalmPayTier3PendingActivity.f25938i;
                            p220oa.h.g(palmPayTier3PendingActivity2, "KycEmailClick");
                            Pa.i0.b0("/settings/verify-email/home");
                            break;
                        default:
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = palmPayTier3PendingActivity2.f25943e;
                            if ((preCheckApplyTier3Rsp != null && preCheckApplyTier3Rsp.isApplyFailed()) || ((tier3ApplyStatusRsp = palmPayTier3PendingActivity2.f25944f) != null && tier3ApplyStatusRsp.isApplyFailed())) {
                                Pa.n0.g().l("KYC_KycResubmitVerify_Click");
                                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayTier3PendingActivity2.f25943e;
                                if (preCheckApplyTier3Rsp2 != null) {
                                    preCheckApplyTier3Rsp2.applyTier3(palmPayTier3PendingActivity2.f25945g);
                                } else {
                                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade_tier3_export");
                                }
                                palmPayTier3PendingActivity2.finish();
                            } else {
                                Pa.n0.g().l("KYC_AddressSubmit_Click");
                                palmPayTier3PendingActivity2.finish();
                            }
                            break;
                    }
                }
            });
        }
        i iVar12 = this.f25939a;
        if (iVar12 != null) {
            h.c((TextView) iVar12.f729g);
        }
        i iVar13 = this.f25939a;
        boolean z3 = false;
        if (iVar13 != null) {
            ((TextView) iVar13.f729g).setText(Html.fromHtml(getString(F8.h.ac_msg_verify_email_for_t3), 0));
        }
        Tier3ApplyStatusRsp tier3ApplyStatusRsp = this.f25944f;
        if (tier3ApplyStatusRsp == null) {
            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = this.f25943e;
            tier3ApplyStatusRsp = preCheckApplyTier3Rsp != null ? preCheckApplyTier3Rsp.lastApplyOrder : null;
        }
        Tier3ApplyStatusRsp tier3ApplyStatusRsp2 = tier3ApplyStatusRsp;
        SimpleDateFormat simpleDateFormat = B.f6121o;
        TextView textView = b7.f6123b;
        ImageView imageView = b7.f6131j;
        if (tier3ApplyStatusRsp2 != null) {
            textView.setText(TimeUtils.millis2String(tier3ApplyStatusRsp2.createTime, simpleDateFormat));
            String strMillis2String = TimeUtils.millis2String(tier3ApplyStatusRsp2.updateTime, simpleDateFormat);
            TextView textView2 = b7.f6124c;
            textView2.setText(strMillis2String);
            String str = tier3ApplyStatusRsp2.titleMsg;
            TextView textView3 = b7.f6125d;
            textView3.setText(str);
            boolean zIsApplyFailed = tier3ApplyStatusRsp2.isApplyFailed();
            View view = b7.f6134m;
            TextView textView4 = b7.f6127f;
            TextView textView5 = b7.f6129h;
            if (zIsApplyFailed) {
                textView3.setText("Declined");
                ImageView imageView2 = (ImageView) viewFindViewById.findViewById(d.ivHeader);
                S6.a aVar = S6.a.pay_CloseFill;
                imageView2.setImageDrawable(G8.a.x(this, aVar, null, Integer.valueOf(b.ppColorError), 56.0f, 114));
                imageView.setImageDrawable(G8.a.x(this, S6.a.pay_SelectedFill, null, Integer.valueOf(b.ppColorSuccess), 20.0f, 114));
                b7.f6132k.setImageDrawable(G8.a.x(this, aVar, null, Integer.valueOf(b.ppColorError), 20.0f, 114));
                textView4.setText(h.B("Review Completion", this, null, Integer.valueOf(b.ppColorTextNormal), null, "sans-serif-medium", null, 1002));
                b7.f6128g.setText(h.B("Declined", this, null, Integer.valueOf(b.ppColorTextPrimary), null, "sans-serif-medium", null, 1002));
                h.s(textView2, true);
                h.s(textView5, false);
                TextView textView6 = b7.f6130i;
                h.s(textView6, true);
                h.s(view, true);
                StringBuilder sb2 = new StringBuilder();
                List<Tier3ApplyStatusRsp.ReasonsBean> list = tier3ApplyStatusRsp2.reasons;
                if (list != null) {
                    int i11 = 1;
                    for (Tier3ApplyStatusRsp.ReasonsBean reasonsBean : list) {
                        if (!TextUtils.isEmpty(reasonsBean.reason)) {
                            if (i11 > 1) {
                                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                            List<Tier3ApplyStatusRsp.ReasonsBean> list2 = tier3ApplyStatusRsp2.reasons;
                            if ((list2 != null ? list2.size() : 0) > 1) {
                                sb2.append(i11);
                                sb2.append(". ");
                            }
                            sb2.append(reasonsBean.reason);
                            i11++;
                        }
                    }
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                b7.f6135n.setText(string);
                textView6.setText("Please provide the correct information and try again. The reason for the verification failure is:");
            } else {
                if (TextUtils.isEmpty(tier3ApplyStatusRsp2.subMsg)) {
                    textView5.setText(F8.h.ac_feedback_t3_manual_review);
                } else {
                    textView5.setText(tier3ApplyStatusRsp2.subMsg);
                }
                palmPayTier3PendingActivity = this;
                imageView.setImageDrawable(G8.a.x(palmPayTier3PendingActivity, S6.a.pay_Schedule, null, Integer.valueOf(b.ppColorWarning), 20.0f, 114));
                h.s(textView2, true);
                h.s(view, false);
                textView4.setText(F8.h.ac_manual_review);
            }
            if (tier3ApplyStatusRsp2 != null && tier3ApplyStatusRsp2.isApplyFailed()) {
                z3 = true;
            }
            if (z3) {
                iVar = palmPayTier3PendingActivity.f25939a;
                if (iVar != null) {
                    h.c((PpButton) iVar.f727e);
                }
                iVar2 = palmPayTier3PendingActivity.f25939a;
                if (iVar2 != null) {
                    h.C((PpButton) iVar2.f725c);
                }
                iVar3 = palmPayTier3PendingActivity.f25939a;
                if (iVar3 != null) {
                    ((PpButton) iVar3.f725c).setOnClickListener(new T(21, tier3ApplyStatusRsp2, palmPayTier3PendingActivity));
                }
                iVar4 = palmPayTier3PendingActivity.f25939a;
                if (iVar4 != null) {
                    h.c((TextView) iVar4.f729g);
                    return;
                }
                return;
            }
            iVar5 = palmPayTier3PendingActivity.f25939a;
            if (iVar5 != null) {
                ((PpButton) iVar5.f727e).setText(palmPayTier3PendingActivity.getString(F8.h.ac_resubmit));
            }
            iVar6 = palmPayTier3PendingActivity.f25939a;
            if (iVar6 != null) {
                final int i12 = 2;
                ((PpButton) iVar6.f727e).setOnClickListener(new View.OnClickListener(palmPayTier3PendingActivity) { // from class: N8.z

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PalmPayTier3PendingActivity f6268b;

                    {
                        this.f6268b = palmPayTier3PendingActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Tier3ApplyStatusRsp tier3ApplyStatusRsp3;
                        PalmPayTier3PendingActivity palmPayTier3PendingActivity2 = this.f6268b;
                        switch (i12) {
                            case 0:
                                PalmPayTier3PendingActivity.a aVar2 = PalmPayTier3PendingActivity.f25938i;
                                palmPayTier3PendingActivity2.getClass();
                                PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(palmPayTier3PendingActivity2);
                                break;
                            case 1:
                                PalmPayTier3PendingActivity.a aVar3 = PalmPayTier3PendingActivity.f25938i;
                                p220oa.h.g(palmPayTier3PendingActivity2, "KycEmailClick");
                                Pa.i0.b0("/settings/verify-email/home");
                                break;
                            default:
                                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayTier3PendingActivity2.f25943e;
                                if ((preCheckApplyTier3Rsp2 != null && preCheckApplyTier3Rsp2.isApplyFailed()) || ((tier3ApplyStatusRsp3 = palmPayTier3PendingActivity2.f25944f) != null && tier3ApplyStatusRsp3.isApplyFailed())) {
                                    Pa.n0.g().l("KYC_KycResubmitVerify_Click");
                                    PreCheckApplyTier3Rsp preCheckApplyTier3Rsp3 = palmPayTier3PendingActivity2.f25943e;
                                    if (preCheckApplyTier3Rsp3 != null) {
                                        preCheckApplyTier3Rsp3.applyTier3(palmPayTier3PendingActivity2.f25945g);
                                    } else {
                                        com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade_tier3_export");
                                    }
                                    palmPayTier3PendingActivity2.finish();
                                } else {
                                    Pa.n0.g().l("KYC_AddressSubmit_Click");
                                    palmPayTier3PendingActivity2.finish();
                                }
                                break;
                        }
                    }
                });
            }
            iVar7 = palmPayTier3PendingActivity.f25939a;
            if (iVar7 != null) {
                h.c((TextView) iVar7.f729g);
            }
            iVar8 = palmPayTier3PendingActivity.f25939a;
            if (iVar8 != null) {
                h.C((PpButton) iVar8.f727e);
            }
            iVar9 = palmPayTier3PendingActivity.f25939a;
            if (iVar9 != null) {
                h.c((PpButton) iVar9.f725c);
            }
        }
        textView.setText(TimeUtils.millis2String(System.currentTimeMillis(), simpleDateFormat));
        imageView.setImageDrawable(G8.a.x(this, S6.a.pay_Schedule, null, Integer.valueOf(b.ppColorWarning), 20.0f, 114));
        palmPayTier3PendingActivity = this;
        if (tier3ApplyStatusRsp2 != null) {
            z3 = true;
        }
        if (z3) {
            iVar = palmPayTier3PendingActivity.f25939a;
            if (iVar != null) {
                h.c((PpButton) iVar.f727e);
            }
            iVar2 = palmPayTier3PendingActivity.f25939a;
            if (iVar2 != null) {
                h.C((PpButton) iVar2.f725c);
            }
            iVar3 = palmPayTier3PendingActivity.f25939a;
            if (iVar3 != null) {
                ((PpButton) iVar3.f725c).setOnClickListener(new T(21, tier3ApplyStatusRsp2, palmPayTier3PendingActivity));
            }
            iVar4 = palmPayTier3PendingActivity.f25939a;
            if (iVar4 != null) {
                h.c((TextView) iVar4.f729g);
                return;
            }
            return;
        }
        iVar5 = palmPayTier3PendingActivity.f25939a;
        if (iVar5 != null) {
            ((PpButton) iVar5.f727e).setText(palmPayTier3PendingActivity.getString(F8.h.ac_resubmit));
        }
        iVar6 = palmPayTier3PendingActivity.f25939a;
        if (iVar6 != null) {
            final int i13 = 2;
            ((PpButton) iVar6.f727e).setOnClickListener(new View.OnClickListener(palmPayTier3PendingActivity) { // from class: N8.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalmPayTier3PendingActivity f6268b;

                {
                    this.f6268b = palmPayTier3PendingActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Tier3ApplyStatusRsp tier3ApplyStatusRsp3;
                    PalmPayTier3PendingActivity palmPayTier3PendingActivity2 = this.f6268b;
                    switch (i13) {
                        case 0:
                            PalmPayTier3PendingActivity.a aVar2 = PalmPayTier3PendingActivity.f25938i;
                            palmPayTier3PendingActivity2.getClass();
                            PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(palmPayTier3PendingActivity2);
                            break;
                        case 1:
                            PalmPayTier3PendingActivity.a aVar3 = PalmPayTier3PendingActivity.f25938i;
                            p220oa.h.g(palmPayTier3PendingActivity2, "KycEmailClick");
                            Pa.i0.b0("/settings/verify-email/home");
                            break;
                        default:
                            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = palmPayTier3PendingActivity2.f25943e;
                            if ((preCheckApplyTier3Rsp2 != null && preCheckApplyTier3Rsp2.isApplyFailed()) || ((tier3ApplyStatusRsp3 = palmPayTier3PendingActivity2.f25944f) != null && tier3ApplyStatusRsp3.isApplyFailed())) {
                                Pa.n0.g().l("KYC_KycResubmitVerify_Click");
                                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp3 = palmPayTier3PendingActivity2.f25943e;
                                if (preCheckApplyTier3Rsp3 != null) {
                                    preCheckApplyTier3Rsp3.applyTier3(palmPayTier3PendingActivity2.f25945g);
                                } else {
                                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade_tier3_export");
                                }
                                palmPayTier3PendingActivity2.finish();
                            } else {
                                Pa.n0.g().l("KYC_AddressSubmit_Click");
                                palmPayTier3PendingActivity2.finish();
                            }
                            break;
                    }
                }
            });
        }
        iVar7 = palmPayTier3PendingActivity.f25939a;
        if (iVar7 != null) {
            h.c((TextView) iVar7.f729g);
        }
        iVar8 = palmPayTier3PendingActivity.f25939a;
        if (iVar8 != null) {
            h.C((PpButton) iVar8.f727e);
        }
        iVar9 = palmPayTier3PendingActivity.f25939a;
        if (iVar9 != null) {
            h.c((PpButton) iVar9.f725c);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_palm_pay_tier3_pending, (ViewGroup) null, false);
        int i7 = d.bottomAd;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null && (viewM = p059e1.a.m((i7 = d.layoutT3Review), viewInflate)) != null) {
            i7 = d.tvComplete;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.tvSubmit;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = d.tvVerifyEmail;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = d.tvView;
                        PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                        if (ppButton2 != null) {
                            i iVar = new i((ConstraintLayout) viewInflate, singleAdView, viewM, textView, ppButton, textView2, ppButton2);
                            this.f25939a = iVar;
                            return iVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        if (!TextUtils.isEmpty(this.f25940b)) {
            C0525w c0525wF = C0525w.f();
            String str = this.f25940b;
            c0525wF.getClass();
            this.f25943e = (PreCheckApplyTier3Rsp) C0525w.d(str, PreCheckApplyTier3Rsp.class);
        }
        if (!TextUtils.isEmpty(this.f25941c)) {
            C0525w c0525wF2 = C0525w.f();
            String str2 = this.f25941c;
            c0525wF2.getClass();
            this.f25945g = (RealNameAuthInfoRsp) C0525w.d(str2, RealNameAuthInfoRsp.class);
        }
        if (!TextUtils.isEmpty(this.f25942d)) {
            C0525w c0525wF3 = C0525w.f();
            String str3 = this.f25942d;
            c0525wF3.getClass();
            this.f25944f = (Tier3ApplyStatusRsp) C0525w.d(str3, Tier3ApplyStatusRsp.class);
            i iVar = this.f25939a;
            if (iVar != null) {
                ((SingleAdView) iVar.f726d).setSlotId("03F6D4F739754B7899FCB7BA470F75CA");
            }
        }
        i iVar2 = this.f25939a;
        org.chromium.support_lib_boundary.util.b.c(iVar2 != null ? (SingleAdView) iVar2.f726d : null);
    }
}

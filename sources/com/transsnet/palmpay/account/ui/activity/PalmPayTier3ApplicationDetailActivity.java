package com.transsnet.palmpay.account.ui.activity;

import B6.RunnableC0085g;
import Bc.q;
import C0.G;
import F8.d;
import F8.e;
import Gb.T;
import L6.b;
import Pa.C0525w;
import Pa.r0;
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
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayTier3ApplicationDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayTier3ApplicationDetailActivity extends BaseActivity implements CompleteCallback<File> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25934d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Tier3ApplyStatusRsp f25936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f25937c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @Nullable Tier3ApplyStatusRsp tier3ApplyStatusRsp) {
            Intent intentPutExtra = G.e(context, "context", context, PalmPayTier3ApplicationDetailActivity.class).putExtra("extra_data", ((Gson) C0525w.f().f7166b).toJson(tier3ApplyStatusRsp));
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            context.startActivity(intentPutExtra);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PalmPayTier3ApplicationDetailActivity palmPayTier3ApplicationDetailActivity;
        Tier3ApplyStatusRsp tier3ApplyStatusRsp = this.f25936b;
        if (tier3ApplyStatusRsp != null) {
            q qVar = this.f25937c;
            if (qVar != null) {
                ((PpFormVertical) qVar.f815b).setEditContent(tier3ApplyStatusRsp.stateName);
            }
            q qVar2 = this.f25937c;
            if (qVar2 != null) {
                ((PpFormVertical) qVar2.f818e).setEditContent(tier3ApplyStatusRsp.areaName);
            }
            q qVar3 = this.f25937c;
            if (qVar3 != null) {
                ((PpFormVertical) qVar3.f819f).setEditContent(tier3ApplyStatusRsp.lgaName);
            }
            q qVar4 = this.f25937c;
            if (qVar4 != null) {
                ((PpFormVertical) qVar4.f821i).setEditContent(tier3ApplyStatusRsp.homeAddress);
            }
            q qVar5 = this.f25937c;
            if (qVar5 != null) {
                palmPayTier3ApplicationDetailActivity = this;
                ((PpFormVertical) qVar5.f821i).setTitle(h.B(r0.H0(F8.h.ac_street_address), palmPayTier3ApplicationDetailActivity, null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
            } else {
                palmPayTier3ApplicationDetailActivity = this;
            }
            q qVar6 = palmPayTier3ApplicationDetailActivity.f25937c;
            if (qVar6 != null) {
                ((PpFormVertical) qVar6.f815b).setTitle(h.B(r0.H0(F8.h.ac_address_level1_name), palmPayTier3ApplicationDetailActivity, null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
            }
            q qVar7 = palmPayTier3ApplicationDetailActivity.f25937c;
            if (qVar7 != null) {
                ((PpFormVertical) qVar7.f818e).setTitle(h.B(r0.H0(F8.h.ac_address_level2_name), palmPayTier3ApplicationDetailActivity, null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
            }
            q qVar8 = palmPayTier3ApplicationDetailActivity.f25937c;
            if (qVar8 != null) {
                ((PpFormVertical) qVar8.f819f).setTitle(h.B(r0.H0(F8.h.ac_address_level3_name), palmPayTier3ApplicationDetailActivity, null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
            }
            if (TextUtils.isEmpty(tier3ApplyStatusRsp.homeAddressImg)) {
                return;
            }
            showLoadingDialog(true);
            r0.E1(this, tier3ApplyStatusRsp.homeAddressImg, this);
            q qVar9 = palmPayTier3ApplicationDetailActivity.f25937c;
            if (qVar9 != null) {
                ((RoundImageView) qVar9.f823o).setOnClickListener(new T(20, this, tier3ApplyStatusRsp));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_palmpay_tier3_application_detail, (ViewGroup) null, false);
        int i7 = d.bottomView;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            Pb.a.bind(viewM);
            i7 = d.inputAddressLevel1;
            PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
            if (ppFormVertical != null) {
                i7 = d.inputAddressLevel2;
                PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical2 != null) {
                    i7 = d.inputAddressLevel3;
                    PpFormVertical ppFormVertical3 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                    if (ppFormVertical3 != null) {
                        i7 = d.inputStreet;
                        PpFormVertical ppFormVertical4 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                        if (ppFormVertical4 != null) {
                            i7 = d.ivImage;
                            RoundImageView roundImageView = (RoundImageView) p059e1.a.m(i7, viewInflate);
                            if (roundImageView != null) {
                                i7 = d.ivPhotoFrame;
                                if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = d.textViewConfirm;
                                    if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = d.titleBar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = d.tvLine1;
                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView != null) {
                                                i7 = d.tvSubtitle;
                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView2 != null) {
                                                    q qVar = new q((ConstraintLayout) viewInflate, ppFormVertical, ppFormVertical2, ppFormVertical3, ppFormVertical4, roundImageView, ppTitleBar, textView, textView2);
                                                    this.f25937c = qVar;
                                                    return qVar;
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

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        runOnUiThread(new RunnableC0085g(15, this, objects));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        if (!TextUtils.isEmpty(this.f25935a)) {
            C0525w c0525wF = C0525w.f();
            String str = this.f25935a;
            c0525wF.getClass();
            this.f25936b = (Tier3ApplyStatusRsp) C0525w.d(str, Tier3ApplyStatusRsp.class);
        }
        q qVar = this.f25937c;
        if (qVar != null) {
            ((PpTitleBar) qVar.f820g).setRightImageView2ClickListener(new K8.a(10));
        }
        q qVar2 = this.f25937c;
        if (qVar2 != null) {
            qVar2.f822j.setText(Html.fromHtml(getString(F8.h.ac_msg_application_details), 0));
        }
    }
}

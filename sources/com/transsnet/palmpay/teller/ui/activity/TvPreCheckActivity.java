package com.transsnet.palmpay.teller.ui.activity;

import Ba.a;
import J1.g;
import M3.f;
import Pa.C0522t;
import Pa.n0;
import Pa.r0;
import Pd.d;
import Rd.C;
import S3.c;
import Xd.F;
import android.R;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.teller.viewmodel.TvPreCheckViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import io.fastkv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import p086fe.T0;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/TV Pre-check", path = "/quick_teller/tv_home_pre", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/TvPreCheckActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/TvPreCheckViewModel;", "LRd/C;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTvPreCheckActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TvPreCheckActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/TvPreCheckActivity\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,518:1\n33#2,3:519\n*S KotlinDebug\n*F\n+ 1 TvPreCheckActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/TvPreCheckActivity\n*L\n71#1:519,3\n*E\n"})
public final class TvPreCheckActivity extends BaseMvvmVBActivity<TvPreCheckViewModel, C> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f34231j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TvRenewDataInfoBean f34232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34233e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34235g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34234f = C2131j.b(new f(this, 29));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f34236i = new c(this);

    static {
        r rVar = new r("payAmount", "getPayAmount()J", TvPreCheckActivity.class);
        G.f38952a.getClass();
        f34231j = new KProperty[]{rVar};
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        n.B(this, ((TvPreCheckViewModel) l()).f34432e, this, new a(this, 18), new Wd.G(5), true, null, 224);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(Color.parseColor("#8036C0"));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_tv_pre_check, (ViewGroup) null, false);
        int i7 = Pd.c.cb_select_new_bouquet;
        CheckBox checkBox = (CheckBox) p059e1.a.m(i7, viewInflate);
        if (checkBox != null) {
            i7 = Pd.c.cb_select_renew_bouquet;
            CheckBox checkBox2 = (CheckBox) p059e1.a.m(i7, viewInflate);
            if (checkBox2 != null) {
                i7 = Pd.c.cv_renew_card;
                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = Pd.c.iv_biller_icon;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = Pd.c.iv_renew_unexpired_arrow;
                        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                        if (iconicsImageView != null) {
                            i7 = Pd.c.iv_view_logo;
                            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView2 != null) {
                                i7 = Pd.c.ll_bundle_view;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                if (linearLayout != null) {
                                    i7 = Pd.c.ll_new_bouquet;
                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout2 != null) {
                                        i7 = Pd.c.ll_renew_expired;
                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout3 != null) {
                                            i7 = Pd.c.ll_renew_unexpired;
                                            LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout4 != null) {
                                                i7 = Pd.c.ns_tv_pre_check;
                                                NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                                if (nestedScrollView != null) {
                                                    i7 = Pd.c.rv_renew_expired;
                                                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                    if (recyclerView != null) {
                                                        i7 = Pd.c.rv_renew_unexpired;
                                                        RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                        if (recyclerView2 != null) {
                                                            i7 = Pd.c.select_bouquet_amount_tv;
                                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView != null) {
                                                                i7 = Pd.c.select_bouquet_name_tv;
                                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView2 != null) {
                                                                    i7 = Pd.c.tv_account_name;
                                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i7 = Pd.c.tv_account_name_title;
                                                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i7 = Pd.c.tv_biller_name;
                                                                            TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i7 = Pd.c.tv_bundle_view;
                                                                                TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i7 = Pd.c.tv_error;
                                                                                    TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        i7 = Pd.c.tv_new_bouquet_title;
                                                                                        TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView8 != null) {
                                                                                            i7 = Pd.c.tv_number;
                                                                                            TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView9 != null) {
                                                                                                i7 = Pd.c.tv_number_title;
                                                                                                TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView10 != null) {
                                                                                                    i7 = Pd.c.tv_pre_title_bar;
                                                                                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                                                    if (ppTitleBar != null) {
                                                                                                        i7 = Pd.c.tv_renew_pay;
                                                                                                        TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                        if (textView11 != null) {
                                                                                                            i7 = Pd.c.tv_view_desc;
                                                                                                            TextView textView12 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                            if (textView12 != null) {
                                                                                                                C c6 = new C((FrameLayout) viewInflate, checkBox, checkBox2, imageView, iconicsImageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, nestedScrollView, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, ppTitleBar, textView11, textView12);
                                                                                                                Intrinsics.checkNotNullExpressionValue(c6, "inflate(...)");
                                                                                                                return c6;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final long n() {
        return ((Number) this.f34236i.getValue(this, f34231j[0])).longValue();
    }

    public final TvRenewDataInfoBean o() {
        return (TvRenewDataInfoBean) this.f34234f.getValue();
    }

    public final void p() {
        LinearLayout linearLayout;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        TextView textView2;
        LinearLayout linearLayout2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C c6 = (C) this.f27334c;
        if (c6 != null && (textView5 = c6.f7988A) != null) {
            textView5.setText(o().getPaymentItemName());
        }
        C c10 = (C) this.f27334c;
        if (c10 != null && (textView4 = c10.f8012w) != null) {
            Long accountAmount = o().getAccountAmount();
            textView4.setText(r0.C(r0.E(accountAmount != null ? accountAmount.longValue() : 0L), false));
        }
        if (TextUtils.isEmpty(o().getViewDoc())) {
            C c11 = (C) this.f27334c;
            if (c11 != null && (imageView = c11.f8003f) != null) {
                h.s(imageView, false);
            }
            C c12 = (C) this.f27334c;
            if (c12 != null && (textView = c12.f7992L) != null) {
                h.s(textView, false);
            }
            C c13 = (C) this.f27334c;
            if (c13 == null || (linearLayout = c13.f8004g) == null) {
                return;
            }
            h.s(linearLayout, false);
            return;
        }
        C c14 = (C) this.f27334c;
        if (c14 != null && (textView3 = c14.f7992L) != null) {
            h.s(textView3, true);
        }
        C c15 = (C) this.f27334c;
        if (c15 != null && (linearLayout2 = c15.f8004g) != null) {
            h.s(linearLayout2, true);
        }
        C c16 = (C) this.f27334c;
        if (c16 != null && (textView2 = c16.f8010p0) != null) {
            textView2.setText(o().getViewDoc());
        }
        if (TextUtils.isEmpty(o().getViewPic())) {
            return;
        }
        C c17 = (C) this.f27334c;
        if (c17 != null && (imageView2 = c17.f8003f) != null) {
            h.s(imageView2, true);
        }
        C c18 = (C) this.f27334c;
        r0.l1(o().getViewPic(), c18 != null ? c18.f8003f : null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void setPayAmount(long j6) {
        this.f34236i.setValue(this, f34231j[0], Long.valueOf(j6));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        n0.g().v("View_TV_Pre");
        if (this.f34232d == null) {
            finish();
            return;
        }
        C c6 = (C) this.f27334c;
        if ((c6 != null ? c6.f7997Z : null) == null) {
            n0.g().getClass();
            return;
        }
        if (c6 != null) {
            c6.f7997Z.setBackgroundColor(getColor(R.color.transparent));
        }
        C c10 = (C) this.f27334c;
        if (c10 != null) {
            c10.f7996Y.setText(o().getAccountNmberTitleName());
        }
        C c11 = (C) this.f27334c;
        if (c11 != null) {
            c11.f7991H.setText(o().getBillerName());
        }
        C c12 = (C) this.f27334c;
        if (c12 != null) {
            c12.f7989B.setText(TextUtils.isEmpty(o().getFullName()) ? "Unknown" : o().getFullName());
        }
        C c13 = (C) this.f27334c;
        if (c13 != null) {
            c13.f7995X.setText(o().getAccountNumber());
        }
        C c14 = (C) this.f27334c;
        if (c14 != null) {
            final int i7 = 0;
            c14.f8007k0.setOnClickListener(new View.OnClickListener(this) { // from class: Wd.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPreCheckActivity f10734b;

                {
                    this.f10734b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox;
                    CheckBox checkBox2;
                    CheckBox checkBox3;
                    CheckBox checkBox4;
                    CheckBox checkBox5;
                    CheckBox checkBox6;
                    TvPreCheckActivity tvPreCheckActivity = this.f10734b;
                    switch (i7) {
                        case 0:
                            KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                            CreateTellerOrderReq req = new CreateTellerOrderReq();
                            req.businessAmount = tvPreCheckActivity.n();
                            req.customerDisplayName = tvPreCheckActivity.o().getAccountNmberTitleName();
                            req.customerId = tvPreCheckActivity.o().getAccountNumber();
                            req.renewal = tvPreCheckActivity.f34235g;
                            req.fullName = tvPreCheckActivity.o().getFullName();
                            req.businessType = 3;
                            req.billerName = tvPreCheckActivity.o().getBillerName();
                            req.billerId = tvPreCheckActivity.o().getBillerId();
                            req.categoryId = "2";
                            req.referenceId = tvPreCheckActivity.o().getReferenceId();
                            req.address = tvPreCheckActivity.o().getAddress();
                            req.icon = tvPreCheckActivity.o().getBillerIcon();
                            req.paymentItemId = tvPreCheckActivity.o().getPaymentItemId();
                            req.paymentItemName = tvPreCheckActivity.o().getPaymentItemName();
                            req.verifyNetwork = false;
                            req.transType = p070ee.b.b("2");
                            req.outSourceId = tvPreCheckActivity.f34233e;
                            TvPreCheckViewModel tvPreCheckViewModel = (TvPreCheckViewModel) tvPreCheckActivity.l();
                            tvPreCheckViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            T0 t1 = new T0(req, null);
                            com.transsnet.palmpay.core.base.l lVar = tvPreCheckViewModel.f34432e;
                            lVar.f27356m = req;
                            Unit unit = Unit.f38893a;
                            p140j8.f.v(tvPreCheckViewModel, t1, lVar, 0L);
                            tvPreCheckActivity.n();
                            n0.g().l("TV_Pre_click_Next");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                            Rd.C c15 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c15 != null && c15.f8011v.getVisibility() == 8) {
                                Rd.C c16 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c16 != null) {
                                    c16.f8011v.setVisibility(0);
                                }
                                Rd.C c17 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c17 != null) {
                                    c17.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_ArrowUp, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                                Rd.C c18 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c18 != null) {
                                    c18.f8009p.post(new W8.o(tvPreCheckActivity, 3));
                                }
                            } else {
                                Rd.C c19 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c19 != null) {
                                    c19.f8011v.setVisibility(8);
                                }
                                Rd.C c20 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c20 != null) {
                                    c20.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                            }
                            break;
                        case 2:
                            tvPreCheckActivity.f34235g = true;
                            Rd.C c21 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c21 == null || (checkBox2 = c21.f8000c) == null || !checkBox2.isChecked()) {
                                Rd.C c22 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c22 != null && (checkBox = c22.f8000c) != null) {
                                    checkBox.setChecked(true);
                                    break;
                                }
                            } else {
                                Long needReNewPayAmount = tvPreCheckActivity.o().getNeedReNewPayAmount();
                                tvPreCheckActivity.setPayAmount(needReNewPayAmount != null ? needReNewPayAmount.longValue() : 0L);
                                Rd.C c23 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c23 != null && (checkBox3 = c23.f7999b) != null) {
                                    checkBox3.setChecked(false);
                                    break;
                                }
                            }
                            break;
                        default:
                            tvPreCheckActivity.f34235g = false;
                            Rd.C c24 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c24 == null || (checkBox5 = c24.f7999b) == null || !checkBox5.isChecked()) {
                                Rd.C c25 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c25 != null && (checkBox4 = c25.f7999b) != null) {
                                    checkBox4.setChecked(true);
                                    break;
                                }
                            } else {
                                Long accountAmount = tvPreCheckActivity.o().getAccountAmount();
                                tvPreCheckActivity.setPayAmount(accountAmount != null ? accountAmount.longValue() : 0L);
                                Rd.C c26 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c26 != null && (checkBox6 = c26.f8000c) != null) {
                                    checkBox6.setChecked(false);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (!TextUtils.isEmpty(o().getBillerIcon())) {
            m mVar = (m) ((m) b.c(this).e(this).load(o().getBillerIcon()).a((G1.d) new G1.d().I(new Sa.d(this, SizeUtils.dp2px(4.0f), Color.parseColor("#FFCAD4DC"), SizeUtils.dp2px(2.0f)), true)).x(Pd.b.qt_icon_default_biller_history)).j(Pd.b.qt_icon_default_biller_history);
            mVar.T(new C0522t(this, 1), null, mVar, g.f4461a);
        }
        if (Intrinsics.c(o().getOnlyRenewal(), Boolean.TRUE)) {
            C c15 = (C) this.f27334c;
            if (c15 != null) {
                c15.f8006j.setVisibility(0);
            }
            C c16 = (C) this.f27334c;
            if (c16 != null) {
                c16.f8008o.setVisibility(8);
            }
            C c17 = (C) this.f27334c;
            if (c17 != null) {
                c17.f8005i.setVisibility(8);
            }
            p();
            C c18 = (C) this.f27334c;
            if (c18 != null) {
                c18.f7999b.setVisibility(8);
            }
            C c19 = (C) this.f27334c;
            if (c19 != null) {
                c19.f8000c.setVisibility(8);
            }
            C c20 = (C) this.f27334c;
            if (c20 != null) {
                c20.f8000c.setChecked(true);
            }
            this.f34235g = true;
            Long renewalAmount = o().getRenewalAmount();
            long jLongValue = renewalAmount != null ? renewalAmount.longValue() : 0L;
            Long minAmount = o().getMinAmount();
            if (jLongValue < (minAmount != null ? minAmount.longValue() : 0L)) {
                Long minAmount2 = o().getMinAmount();
                setPayAmount(minAmount2 != null ? minAmount2.longValue() : 0L);
                o().setNeedReNewPayAmount(o().getMinAmount());
                C c21 = (C) this.f27334c;
                if (c21 != null) {
                    c21.f7993M.setVisibility(0);
                }
                C c22 = (C) this.f27334c;
                if (c22 != null) {
                    c22.f7993M.setText(getString(Pd.f.qt_msg_you_have_to_pay_minimum_amount, r0.C(r0.E(n()), false)));
                }
            } else {
                Long renewalAmount2 = o().getRenewalAmount();
                setPayAmount(renewalAmount2 != null ? renewalAmount2.longValue() : 0L);
                o().setNeedReNewPayAmount(o().getRenewalAmount());
            }
            C c23 = (C) this.f27334c;
            if (c23 != null) {
                c23.t.setLayoutManager(new LinearLayoutManager(this, 1, false));
            }
            F f10 = new F();
            C c24 = (C) this.f27334c;
            if (c24 != null) {
                c24.t.setAdapter(f10);
            }
            final int i10 = 0;
            f10.setOnItemChildClickListener(new OnItemChildClickListener(this) { // from class: Wd.T

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPreCheckActivity f10736b;

                {
                    this.f10736b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
                public final void onItemChildClick(M1.j jVar, View v3, int i11) {
                    TvRenewDataInfoBean.Item item;
                    TvRenewDataInfoBean.Item item2;
                    TvRenewDataInfoBean.Item item3;
                    switch (i10) {
                        case 0:
                            KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items = tvPreCheckActivity.o().getItems();
                                if (items != null && (item = items.get(i11)) != null) {
                                    String value = item.getValue();
                                    CommonViewExtKt.showBalloon(v3, value != null ? value : "", tvPreCheckActivity, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity2 = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items2 = tvPreCheckActivity2.o().getItems();
                                if (items2 != null && (item2 = items2.get(i11)) != null) {
                                    String value2 = item2.getValue();
                                    CommonViewExtKt.showBalloon(v3, value2 != null ? value2 : "", tvPreCheckActivity2, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr3 = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity3 = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items3 = tvPreCheckActivity3.o().getItems();
                                if (items3 != null && (item3 = items3.get(i11)) != null) {
                                    String value3 = item3.getValue();
                                    CommonViewExtKt.showBalloon(v3, value3 != null ? value3 : "", tvPreCheckActivity3, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            ArrayList<TvRenewDataInfoBean.Item> items = o().getItems();
            if (items != null) {
                f10.setList(items);
                return;
            }
            return;
        }
        ArrayList<TvRenewDataInfoBean.Item> items2 = o().getItems();
        if (items2 == null || items2.isEmpty()) {
            C c25 = (C) this.f27334c;
            if (c25 != null) {
                c25.f8006j.setVisibility(8);
            }
            C c26 = (C) this.f27334c;
            if (c26 != null) {
                c26.f8008o.setVisibility(8);
            }
            p();
            Long accountAmount = o().getAccountAmount();
            setPayAmount(accountAmount != null ? accountAmount.longValue() : 0L);
            C c27 = (C) this.f27334c;
            if (c27 != null) {
                c27.f7999b.setVisibility(4);
            }
            C c28 = (C) this.f27334c;
            if (c28 != null) {
                c28.f7994Q.setText(getString(Pd.f.qt_bouquet_details));
                return;
            }
            return;
        }
        Long renewalAmount3 = o().getRenewalAmount();
        if ((renewalAmount3 != null ? renewalAmount3.longValue() : 0L) <= 0) {
            Long accountAmount2 = o().getAccountAmount();
            setPayAmount(accountAmount2 != null ? accountAmount2.longValue() : 0L);
            p();
            C c29 = (C) this.f27334c;
            if (c29 != null) {
                c29.f7999b.setVisibility(4);
            }
            C c30 = (C) this.f27334c;
            if (c30 != null) {
                c30.f7994Q.setText(getString(Pd.f.qt_bouquet_details));
            }
            C c31 = (C) this.f27334c;
            if (c31 != null) {
                c31.f8011v.setLayoutManager(new LinearLayoutManager(this, 1, false));
            }
            Xd.G g7 = new Xd.G(d.qt_layout_item_info_2, null);
            g7.addChildClickViewIds(Pd.c.iv_more);
            C c32 = (C) this.f27334c;
            if (c32 != null) {
                c32.f8011v.setAdapter(g7);
            }
            g7.setList(o().getItems());
            C c33 = (C) this.f27334c;
            if (c33 != null) {
                c33.f8011v.setVisibility(8);
            }
            C c34 = (C) this.f27334c;
            if (c34 != null) {
                final int i11 = 1;
                c34.f8002e.setOnClickListener(new View.OnClickListener(this) { // from class: Wd.S

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TvPreCheckActivity f10734b;

                    {
                        this.f10734b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckBox checkBox;
                        CheckBox checkBox2;
                        CheckBox checkBox3;
                        CheckBox checkBox4;
                        CheckBox checkBox5;
                        CheckBox checkBox6;
                        TvPreCheckActivity tvPreCheckActivity = this.f10734b;
                        switch (i11) {
                            case 0:
                                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                                CreateTellerOrderReq req = new CreateTellerOrderReq();
                                req.businessAmount = tvPreCheckActivity.n();
                                req.customerDisplayName = tvPreCheckActivity.o().getAccountNmberTitleName();
                                req.customerId = tvPreCheckActivity.o().getAccountNumber();
                                req.renewal = tvPreCheckActivity.f34235g;
                                req.fullName = tvPreCheckActivity.o().getFullName();
                                req.businessType = 3;
                                req.billerName = tvPreCheckActivity.o().getBillerName();
                                req.billerId = tvPreCheckActivity.o().getBillerId();
                                req.categoryId = "2";
                                req.referenceId = tvPreCheckActivity.o().getReferenceId();
                                req.address = tvPreCheckActivity.o().getAddress();
                                req.icon = tvPreCheckActivity.o().getBillerIcon();
                                req.paymentItemId = tvPreCheckActivity.o().getPaymentItemId();
                                req.paymentItemName = tvPreCheckActivity.o().getPaymentItemName();
                                req.verifyNetwork = false;
                                req.transType = p070ee.b.b("2");
                                req.outSourceId = tvPreCheckActivity.f34233e;
                                TvPreCheckViewModel tvPreCheckViewModel = (TvPreCheckViewModel) tvPreCheckActivity.l();
                                tvPreCheckViewModel.getClass();
                                Intrinsics.checkNotNullParameter(req, "req");
                                T0 t1 = new T0(req, null);
                                com.transsnet.palmpay.core.base.l lVar = tvPreCheckViewModel.f34432e;
                                lVar.f27356m = req;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(tvPreCheckViewModel, t1, lVar, 0L);
                                tvPreCheckActivity.n();
                                n0.g().l("TV_Pre_click_Next");
                                break;
                            case 1:
                                KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                                Rd.C c110 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c110 != null && c110.f8011v.getVisibility() == 8) {
                                    Rd.C c111 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c111 != null) {
                                        c111.f8011v.setVisibility(0);
                                    }
                                    Rd.C c112 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c112 != null) {
                                        c112.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_ArrowUp, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                    }
                                    Rd.C c113 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c113 != null) {
                                        c113.f8009p.post(new W8.o(tvPreCheckActivity, 3));
                                    }
                                } else {
                                    Rd.C c114 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c114 != null) {
                                        c114.f8011v.setVisibility(8);
                                    }
                                    Rd.C c210 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c210 != null) {
                                        c210.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                    }
                                }
                                break;
                            case 2:
                                tvPreCheckActivity.f34235g = true;
                                Rd.C c211 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c211 == null || (checkBox2 = c211.f8000c) == null || !checkBox2.isChecked()) {
                                    Rd.C c212 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c212 != null && (checkBox = c212.f8000c) != null) {
                                        checkBox.setChecked(true);
                                        break;
                                    }
                                } else {
                                    Long needReNewPayAmount = tvPreCheckActivity.o().getNeedReNewPayAmount();
                                    tvPreCheckActivity.setPayAmount(needReNewPayAmount != null ? needReNewPayAmount.longValue() : 0L);
                                    Rd.C c213 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c213 != null && (checkBox3 = c213.f7999b) != null) {
                                        checkBox3.setChecked(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                tvPreCheckActivity.f34235g = false;
                                Rd.C c214 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c214 == null || (checkBox5 = c214.f7999b) == null || !checkBox5.isChecked()) {
                                    Rd.C c215 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c215 != null && (checkBox4 = c215.f7999b) != null) {
                                        checkBox4.setChecked(true);
                                        break;
                                    }
                                } else {
                                    Long accountAmount3 = tvPreCheckActivity.o().getAccountAmount();
                                    tvPreCheckActivity.setPayAmount(accountAmount3 != null ? accountAmount3.longValue() : 0L);
                                    Rd.C c216 = (Rd.C) tvPreCheckActivity.f27334c;
                                    if (c216 != null && (checkBox6 = c216.f8000c) != null) {
                                        checkBox6.setChecked(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            final int i12 = 1;
            g7.setOnItemChildClickListener(new OnItemChildClickListener(this) { // from class: Wd.T

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPreCheckActivity f10736b;

                {
                    this.f10736b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
                public final void onItemChildClick(M1.j jVar, View v3, int i13) {
                    TvRenewDataInfoBean.Item item;
                    TvRenewDataInfoBean.Item item2;
                    TvRenewDataInfoBean.Item item3;
                    switch (i12) {
                        case 0:
                            KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items3 = tvPreCheckActivity.o().getItems();
                                if (items3 != null && (item = items3.get(i13)) != null) {
                                    String value = item.getValue();
                                    CommonViewExtKt.showBalloon(v3, value != null ? value : "", tvPreCheckActivity, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity2 = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items4 = tvPreCheckActivity2.o().getItems();
                                if (items4 != null && (item2 = items4.get(i13)) != null) {
                                    String value2 = item2.getValue();
                                    CommonViewExtKt.showBalloon(v3, value2 != null ? value2 : "", tvPreCheckActivity2, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                        default:
                            KProperty[] kPropertyArr3 = TvPreCheckActivity.f34231j;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(v3, "v");
                            if (v3.getId() == Pd.c.iv_more) {
                                TvPreCheckActivity tvPreCheckActivity3 = this.f10736b;
                                ArrayList<TvRenewDataInfoBean.Item> items5 = tvPreCheckActivity3.o().getItems();
                                if (items5 != null && (item3 = items5.get(i13)) != null) {
                                    String value3 = item3.getValue();
                                    CommonViewExtKt.showBalloon(v3, value3 != null ? value3 : "", tvPreCheckActivity3, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            C c35 = (C) this.f27334c;
            if (c35 != null) {
                c35.f8006j.setVisibility(8);
            }
            C c36 = (C) this.f27334c;
            if (c36 != null) {
                c36.f8008o.setVisibility(0);
                return;
            }
            return;
        }
        p();
        C c37 = (C) this.f27334c;
        if (c37 != null) {
            c37.f7999b.setVisibility(0);
        }
        C c38 = (C) this.f27334c;
        if (c38 != null) {
            c38.f8000c.setVisibility(0);
        }
        Long renewalAmount4 = o().getRenewalAmount();
        long jLongValue2 = renewalAmount4 != null ? renewalAmount4.longValue() : 0L;
        Long minAmount3 = o().getMinAmount();
        if (jLongValue2 < (minAmount3 != null ? minAmount3.longValue() : 0L)) {
            Long minAmount4 = o().getMinAmount();
            setPayAmount(minAmount4 != null ? minAmount4.longValue() : 0L);
            o().setNeedReNewPayAmount(o().getMinAmount());
            C c39 = (C) this.f27334c;
            if (c39 != null) {
                c39.f7993M.setVisibility(0);
            }
            C c40 = (C) this.f27334c;
            if (c40 != null) {
                c40.f7993M.setText(getString(Pd.f.qt_msg_you_have_to_pay_minimum_amount, r0.C(r0.E(n()), false)));
            }
        } else {
            Long renewalAmount5 = o().getRenewalAmount();
            setPayAmount(renewalAmount5 != null ? renewalAmount5.longValue() : 0L);
            o().setNeedReNewPayAmount(o().getRenewalAmount());
        }
        C c41 = (C) this.f27334c;
        if (c41 != null) {
            c41.f8000c.setChecked(true);
        }
        this.f34235g = true;
        C c42 = (C) this.f27334c;
        if (c42 != null) {
            final int i13 = 2;
            c42.f8000c.setOnClickListener(new View.OnClickListener(this) { // from class: Wd.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPreCheckActivity f10734b;

                {
                    this.f10734b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox;
                    CheckBox checkBox2;
                    CheckBox checkBox3;
                    CheckBox checkBox4;
                    CheckBox checkBox5;
                    CheckBox checkBox6;
                    TvPreCheckActivity tvPreCheckActivity = this.f10734b;
                    switch (i13) {
                        case 0:
                            KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                            CreateTellerOrderReq req = new CreateTellerOrderReq();
                            req.businessAmount = tvPreCheckActivity.n();
                            req.customerDisplayName = tvPreCheckActivity.o().getAccountNmberTitleName();
                            req.customerId = tvPreCheckActivity.o().getAccountNumber();
                            req.renewal = tvPreCheckActivity.f34235g;
                            req.fullName = tvPreCheckActivity.o().getFullName();
                            req.businessType = 3;
                            req.billerName = tvPreCheckActivity.o().getBillerName();
                            req.billerId = tvPreCheckActivity.o().getBillerId();
                            req.categoryId = "2";
                            req.referenceId = tvPreCheckActivity.o().getReferenceId();
                            req.address = tvPreCheckActivity.o().getAddress();
                            req.icon = tvPreCheckActivity.o().getBillerIcon();
                            req.paymentItemId = tvPreCheckActivity.o().getPaymentItemId();
                            req.paymentItemName = tvPreCheckActivity.o().getPaymentItemName();
                            req.verifyNetwork = false;
                            req.transType = p070ee.b.b("2");
                            req.outSourceId = tvPreCheckActivity.f34233e;
                            TvPreCheckViewModel tvPreCheckViewModel = (TvPreCheckViewModel) tvPreCheckActivity.l();
                            tvPreCheckViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            T0 t1 = new T0(req, null);
                            com.transsnet.palmpay.core.base.l lVar = tvPreCheckViewModel.f34432e;
                            lVar.f27356m = req;
                            Unit unit = Unit.f38893a;
                            p140j8.f.v(tvPreCheckViewModel, t1, lVar, 0L);
                            tvPreCheckActivity.n();
                            n0.g().l("TV_Pre_click_Next");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                            Rd.C c110 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c110 != null && c110.f8011v.getVisibility() == 8) {
                                Rd.C c111 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c111 != null) {
                                    c111.f8011v.setVisibility(0);
                                }
                                Rd.C c112 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c112 != null) {
                                    c112.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_ArrowUp, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                                Rd.C c113 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c113 != null) {
                                    c113.f8009p.post(new W8.o(tvPreCheckActivity, 3));
                                }
                            } else {
                                Rd.C c114 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c114 != null) {
                                    c114.f8011v.setVisibility(8);
                                }
                                Rd.C c210 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c210 != null) {
                                    c210.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                            }
                            break;
                        case 2:
                            tvPreCheckActivity.f34235g = true;
                            Rd.C c211 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c211 == null || (checkBox2 = c211.f8000c) == null || !checkBox2.isChecked()) {
                                Rd.C c212 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c212 != null && (checkBox = c212.f8000c) != null) {
                                    checkBox.setChecked(true);
                                    break;
                                }
                            } else {
                                Long needReNewPayAmount = tvPreCheckActivity.o().getNeedReNewPayAmount();
                                tvPreCheckActivity.setPayAmount(needReNewPayAmount != null ? needReNewPayAmount.longValue() : 0L);
                                Rd.C c213 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c213 != null && (checkBox3 = c213.f7999b) != null) {
                                    checkBox3.setChecked(false);
                                    break;
                                }
                            }
                            break;
                        default:
                            tvPreCheckActivity.f34235g = false;
                            Rd.C c214 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c214 == null || (checkBox5 = c214.f7999b) == null || !checkBox5.isChecked()) {
                                Rd.C c215 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c215 != null && (checkBox4 = c215.f7999b) != null) {
                                    checkBox4.setChecked(true);
                                    break;
                                }
                            } else {
                                Long accountAmount3 = tvPreCheckActivity.o().getAccountAmount();
                                tvPreCheckActivity.setPayAmount(accountAmount3 != null ? accountAmount3.longValue() : 0L);
                                Rd.C c216 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c216 != null && (checkBox6 = c216.f8000c) != null) {
                                    checkBox6.setChecked(false);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        C c43 = (C) this.f27334c;
        if (c43 != null) {
            final int i14 = 3;
            c43.f7999b.setOnClickListener(new View.OnClickListener(this) { // from class: Wd.S

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPreCheckActivity f10734b;

                {
                    this.f10734b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox;
                    CheckBox checkBox2;
                    CheckBox checkBox3;
                    CheckBox checkBox4;
                    CheckBox checkBox5;
                    CheckBox checkBox6;
                    TvPreCheckActivity tvPreCheckActivity = this.f10734b;
                    switch (i14) {
                        case 0:
                            KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                            CreateTellerOrderReq req = new CreateTellerOrderReq();
                            req.businessAmount = tvPreCheckActivity.n();
                            req.customerDisplayName = tvPreCheckActivity.o().getAccountNmberTitleName();
                            req.customerId = tvPreCheckActivity.o().getAccountNumber();
                            req.renewal = tvPreCheckActivity.f34235g;
                            req.fullName = tvPreCheckActivity.o().getFullName();
                            req.businessType = 3;
                            req.billerName = tvPreCheckActivity.o().getBillerName();
                            req.billerId = tvPreCheckActivity.o().getBillerId();
                            req.categoryId = "2";
                            req.referenceId = tvPreCheckActivity.o().getReferenceId();
                            req.address = tvPreCheckActivity.o().getAddress();
                            req.icon = tvPreCheckActivity.o().getBillerIcon();
                            req.paymentItemId = tvPreCheckActivity.o().getPaymentItemId();
                            req.paymentItemName = tvPreCheckActivity.o().getPaymentItemName();
                            req.verifyNetwork = false;
                            req.transType = p070ee.b.b("2");
                            req.outSourceId = tvPreCheckActivity.f34233e;
                            TvPreCheckViewModel tvPreCheckViewModel = (TvPreCheckViewModel) tvPreCheckActivity.l();
                            tvPreCheckViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            T0 t1 = new T0(req, null);
                            com.transsnet.palmpay.core.base.l lVar = tvPreCheckViewModel.f34432e;
                            lVar.f27356m = req;
                            Unit unit = Unit.f38893a;
                            p140j8.f.v(tvPreCheckViewModel, t1, lVar, 0L);
                            tvPreCheckActivity.n();
                            n0.g().l("TV_Pre_click_Next");
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                            Rd.C c110 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c110 != null && c110.f8011v.getVisibility() == 8) {
                                Rd.C c111 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c111 != null) {
                                    c111.f8011v.setVisibility(0);
                                }
                                Rd.C c112 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c112 != null) {
                                    c112.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_ArrowUp, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                                Rd.C c113 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c113 != null) {
                                    c113.f8009p.post(new W8.o(tvPreCheckActivity, 3));
                                }
                            } else {
                                Rd.C c114 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c114 != null) {
                                    c114.f8011v.setVisibility(8);
                                }
                                Rd.C c210 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c210 != null) {
                                    c210.f8002e.setImageDrawable(G8.a.x(D3.a.c(tvPreCheckActivity), S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorTextNormal), 20.0f, 114));
                                }
                            }
                            break;
                        case 2:
                            tvPreCheckActivity.f34235g = true;
                            Rd.C c211 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c211 == null || (checkBox2 = c211.f8000c) == null || !checkBox2.isChecked()) {
                                Rd.C c212 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c212 != null && (checkBox = c212.f8000c) != null) {
                                    checkBox.setChecked(true);
                                    break;
                                }
                            } else {
                                Long needReNewPayAmount = tvPreCheckActivity.o().getNeedReNewPayAmount();
                                tvPreCheckActivity.setPayAmount(needReNewPayAmount != null ? needReNewPayAmount.longValue() : 0L);
                                Rd.C c213 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c213 != null && (checkBox3 = c213.f7999b) != null) {
                                    checkBox3.setChecked(false);
                                    break;
                                }
                            }
                            break;
                        default:
                            tvPreCheckActivity.f34235g = false;
                            Rd.C c214 = (Rd.C) tvPreCheckActivity.f27334c;
                            if (c214 == null || (checkBox5 = c214.f7999b) == null || !checkBox5.isChecked()) {
                                Rd.C c215 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c215 != null && (checkBox4 = c215.f7999b) != null) {
                                    checkBox4.setChecked(true);
                                    break;
                                }
                            } else {
                                Long accountAmount3 = tvPreCheckActivity.o().getAccountAmount();
                                tvPreCheckActivity.setPayAmount(accountAmount3 != null ? accountAmount3.longValue() : 0L);
                                Rd.C c216 = (Rd.C) tvPreCheckActivity.f27334c;
                                if (c216 != null && (checkBox6 = c216.f8000c) != null) {
                                    checkBox6.setChecked(false);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        C c44 = (C) this.f27334c;
        if (c44 != null) {
            c44.t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        F f11 = new F();
        C c45 = (C) this.f27334c;
        if (c45 != null) {
            c45.t.setAdapter(f11);
        }
        final int i15 = 2;
        f11.setOnItemChildClickListener(new OnItemChildClickListener(this) { // from class: Wd.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvPreCheckActivity f10736b;

            {
                this.f10736b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
            public final void onItemChildClick(M1.j jVar, View v3, int i16) {
                TvRenewDataInfoBean.Item item;
                TvRenewDataInfoBean.Item item2;
                TvRenewDataInfoBean.Item item3;
                switch (i15) {
                    case 0:
                        KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(v3, "v");
                        if (v3.getId() == Pd.c.iv_more) {
                            TvPreCheckActivity tvPreCheckActivity = this.f10736b;
                            ArrayList<TvRenewDataInfoBean.Item> items3 = tvPreCheckActivity.o().getItems();
                            if (items3 != null && (item = items3.get(i16)) != null) {
                                String value = item.getValue();
                                CommonViewExtKt.showBalloon(v3, value != null ? value : "", tvPreCheckActivity, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        KProperty[] kPropertyArr2 = TvPreCheckActivity.f34231j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(v3, "v");
                        if (v3.getId() == Pd.c.iv_more) {
                            TvPreCheckActivity tvPreCheckActivity2 = this.f10736b;
                            ArrayList<TvRenewDataInfoBean.Item> items4 = tvPreCheckActivity2.o().getItems();
                            if (items4 != null && (item2 = items4.get(i16)) != null) {
                                String value2 = item2.getValue();
                                CommonViewExtKt.showBalloon(v3, value2 != null ? value2 : "", tvPreCheckActivity2, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                break;
                            }
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr3 = TvPreCheckActivity.f34231j;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(v3, "v");
                        if (v3.getId() == Pd.c.iv_more) {
                            TvPreCheckActivity tvPreCheckActivity3 = this.f10736b;
                            ArrayList<TvRenewDataInfoBean.Item> items5 = tvPreCheckActivity3.o().getItems();
                            if (items5 != null && (item3 = items5.get(i16)) != null) {
                                String value3 = item3.getValue();
                                CommonViewExtKt.showBalloon(v3, value3 != null ? value3 : "", tvPreCheckActivity3, (2089452 & 4) != 0 ? v3 : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 0.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? v3.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ArrayList<TvRenewDataInfoBean.Item> items3 = o().getItems();
        if (items3 != null) {
            f11.setList(items3);
        }
        C c46 = (C) this.f27334c;
        if (c46 != null) {
            c46.f8006j.setVisibility(0);
        }
        C c47 = (C) this.f27334c;
        if (c47 != null) {
            c47.f8008o.setVisibility(8);
        }
    }
}

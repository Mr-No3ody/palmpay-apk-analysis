package com.transsnet.palmpay.airtime.ui;

import L6.b;
import Pa.i0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.E;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.AirtimeDownTimeOrderBean;
import com.transsnet.palmpay.airtime.bean.req.AirtimeDownTimeOrderUpdateReq;
import com.transsnet.palmpay.airtime.ui.ConfirmAirtimeDownTimeActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeDownTimeViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.C1898c;
import o9.C1899d;
import p054dd.q;
import p140j8.f;
import p141j9.C1804l;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/维护期确认", path = "/airtime/down_time_top_up_airtime", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/ConfirmAirtimeDownTimeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeDownTimeViewModel;", "LRd/E;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConfirmAirtimeDownTimeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmAirtimeDownTimeActivity.kt\ncom/transsnet/palmpay/airtime/ui/ConfirmAirtimeDownTimeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,198:1\n260#2,10:199\n296#2:209\n260#2,10:210\n296#2:220\n*S KotlinDebug\n*F\n+ 1 ConfirmAirtimeDownTimeActivity.kt\ncom/transsnet/palmpay/airtime/ui/ConfirmAirtimeDownTimeActivity\n*L\n114#1:199,10\n114#1:209\n144#1:210,10\n144#1:220\n*E\n"})
public final class ConfirmAirtimeDownTimeActivity extends BaseMvvmVBActivity<AirTimeDownTimeViewModel, E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26466f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26467d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AirtimeDownTimeOrderBean f26468e;

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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((AirTimeDownTimeViewModel) l()).f26607e;
        if (lVar != null) {
            lVar.e(this, new q(new C1804l(this, this, 0), 6));
        }
        l lVar2 = ((AirTimeDownTimeViewModel) l()).f26608f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new C1804l(this, this, 1), 6));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewM2;
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_activity_confirm_downtime_order, (ViewGroup) null, false);
        int i7 = c.card_view_payment_method;
        if (((CardView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = c.iv_close;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = c.iv_payment_method_balance_icon;
                if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = c.iv_payment_method_balance_selected;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView2 != null) {
                        i7 = c.iv_payment_method_flexi_icon;
                        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = c.iv_payment_method_flexi_selected;
                            ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView3 != null) {
                                i7 = c.layout_ll_downtime_msg_item;
                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = c.layout_ll_payment_method;
                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = c.layout_payment_method_item_balance;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                        if (constraintLayout != null) {
                                            i7 = c.layout_payment_method_item_ok_card;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                            if (constraintLayout2 != null) {
                                                i7 = c.layout_payment_method_update;
                                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                if (linearLayout != null) {
                                                    i7 = c.model_amount;
                                                    ModelItemFee modelItemFee = (ModelItemFee) p059e1.a.m(i7, viewInflate);
                                                    if (modelItemFee != null) {
                                                        i7 = c.model_biller_name;
                                                        ModelItemFee modelItemFee2 = (ModelItemFee) p059e1.a.m(i7, viewInflate);
                                                        if (modelItemFee2 != null) {
                                                            i7 = c.model_phone;
                                                            ModelItemFee modelItemFee3 = (ModelItemFee) p059e1.a.m(i7, viewInflate);
                                                            if (modelItemFee3 != null) {
                                                                i7 = c.qaacd_agree_text;
                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView != null) {
                                                                    i7 = c.tv_operator_msg;
                                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i7 = c.tv_operator_msg_tips;
                                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView3 != null) {
                                                                            i7 = c.tv_payment_method_balance_desc;
                                                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView4 != null) {
                                                                                i7 = c.tv_payment_method_balance_title;
                                                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView5 != null) {
                                                                                    i7 = c.tv_payment_method_flexi_desc;
                                                                                    TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView6 != null) {
                                                                                        i7 = c.tv_payment_method_flexi_title;
                                                                                        TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i7 = c.tv_payment_method_title;
                                                                                            TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i7 = c.tv_title;
                                                                                                TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView9 != null && (viewM = p059e1.a.m((i7 = c.view_body), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = c.view_divider_line), viewInflate)) != null) {
                                                                                                    E e10 = new E((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, linearLayout, modelItemFee, modelItemFee2, modelItemFee3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewM, viewM2);
                                                                                                    Intrinsics.checkNotNullExpressionValue(e10, "inflate(...)");
                                                                                                    return e10;
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

    public final void n(int i7, int i10) {
        this.f26467d = i10;
        if (i7 == 28) {
            E e10 = (E) this.f27334c;
            if (e10 != null) {
                e10.f8031d.setImageResource(r.cv_checked_purple);
            }
            E e11 = (E) this.f27334c;
            if (e11 != null) {
                e11.f8030c.setImageResource(r.cv_circle_unchecked);
                return;
            }
            return;
        }
        E e12 = (E) this.f27334c;
        if (e12 != null) {
            e12.f8031d.setImageResource(r.cv_circle_unchecked);
        }
        E e13 = (E) this.f27334c;
        if (e13 != null) {
            e13.f8030c.setImageResource(r.cv_checked_purple);
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 && i10 == -1) {
            AirtimeDownTimeOrderUpdateReq req = new AirtimeDownTimeOrderUpdateReq();
            AirtimeDownTimeOrderBean airtimeDownTimeOrderBean = this.f26468e;
            req.setOrderNo(airtimeDownTimeOrderBean != null ? airtimeDownTimeOrderBean.getOrderNo() : null);
            req.setPayType(this.f26467d);
            AirTimeDownTimeViewModel airTimeDownTimeViewModel = (AirTimeDownTimeViewModel) l();
            airTimeDownTimeViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(airTimeDownTimeViewModel, new C1899d(req, null), airTimeDownTimeViewModel.f26608f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AirTimeDownTimeViewModel airTimeDownTimeViewModel = (AirTimeDownTimeViewModel) l();
        airTimeDownTimeViewModel.getClass();
        f.v(airTimeDownTimeViewModel, new C1898c(1, null), airTimeDownTimeViewModel.f26607e, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String mobileNo;
        String billerName;
        String billerName2;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getResources().getColor(p.transparent_30), true);
        E e10 = (E) this.f27334c;
        String str = "";
        if (e10 != null) {
            TextView textView = e10.f8039v;
            int i7 = Pd.f.qt_airtime_down_time_operator_tips;
            AirtimeDownTimeOrderBean airtimeDownTimeOrderBean = this.f26468e;
            if (airtimeDownTimeOrderBean == null || (billerName2 = airtimeDownTimeOrderBean.getBillerName()) == null) {
                billerName2 = "";
            }
            textView.setText(getString(i7, billerName2));
        }
        AirtimeDownTimeOrderBean airtimeDownTimeOrderBean2 = this.f26468e;
        if (airtimeDownTimeOrderBean2 == null || (mobileNo = airtimeDownTimeOrderBean2.getMobileNo()) == null) {
            mobileNo = "";
        }
        String strD = i0.D(mobileNo);
        E e11 = (E) this.f27334c;
        if (e11 != null) {
            e11.f8037o.setContent(strD);
        }
        E e12 = (E) this.f27334c;
        if (e12 != null) {
            ModelItemFee modelItemFee = e12.f8036j;
            AirtimeDownTimeOrderBean airtimeDownTimeOrderBean3 = this.f26468e;
            if (airtimeDownTimeOrderBean3 != null && (billerName = airtimeDownTimeOrderBean3.getBillerName()) != null) {
                str = billerName;
            }
            modelItemFee.setContent(str);
        }
        E e13 = (E) this.f27334c;
        if (e13 != null) {
            ModelItemFee modelItemFee2 = e13.f8035i;
            AirtimeDownTimeOrderBean airtimeDownTimeOrderBean4 = this.f26468e;
            modelItemFee2.setContent(r0.B(airtimeDownTimeOrderBean4 != null ? airtimeDownTimeOrderBean4.getAmount() : 0L, false));
        }
        n(1, 1);
        E e14 = (E) this.f27334c;
        if (e14 != null) {
            final int i10 = 0;
            e14.f8033f.setOnClickListener(new View.OnClickListener(this) { // from class: j9.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConfirmAirtimeDownTimeActivity f38411b;

                {
                    this.f38411b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmAirtimeDownTimeActivity confirmAirtimeDownTimeActivity = this.f38411b;
                    switch (i10) {
                        case 0:
                            int i11 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(28, 18);
                            break;
                        case 1:
                            int i12 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(1, 1);
                            break;
                        case 2:
                            int i13 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.finish();
                            break;
                        default:
                            int i14 = ConfirmAirtimeDownTimeActivity.f26466f;
                            ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).navigation(confirmAirtimeDownTimeActivity, 100);
                            break;
                    }
                }
            });
        }
        E e15 = (E) this.f27334c;
        if (e15 != null) {
            final int i11 = 1;
            e15.f8032e.setOnClickListener(new View.OnClickListener(this) { // from class: j9.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConfirmAirtimeDownTimeActivity f38411b;

                {
                    this.f38411b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmAirtimeDownTimeActivity confirmAirtimeDownTimeActivity = this.f38411b;
                    switch (i11) {
                        case 0:
                            int i12 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(28, 18);
                            break;
                        case 1:
                            int i13 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(1, 1);
                            break;
                        case 2:
                            int i14 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.finish();
                            break;
                        default:
                            int i15 = ConfirmAirtimeDownTimeActivity.f26466f;
                            ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).navigation(confirmAirtimeDownTimeActivity, 100);
                            break;
                    }
                }
            });
        }
        E e16 = (E) this.f27334c;
        if (e16 != null) {
            final int i12 = 2;
            e16.f8029b.setOnClickListener(new View.OnClickListener(this) { // from class: j9.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConfirmAirtimeDownTimeActivity f38411b;

                {
                    this.f38411b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmAirtimeDownTimeActivity confirmAirtimeDownTimeActivity = this.f38411b;
                    switch (i12) {
                        case 0:
                            int i13 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(28, 18);
                            break;
                        case 1:
                            int i14 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(1, 1);
                            break;
                        case 2:
                            int i15 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.finish();
                            break;
                        default:
                            int i16 = ConfirmAirtimeDownTimeActivity.f26466f;
                            ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).navigation(confirmAirtimeDownTimeActivity, 100);
                            break;
                    }
                }
            });
        }
        E e17 = (E) this.f27334c;
        if (e17 != null) {
            final int i13 = 3;
            e17.f8034g.setOnClickListener(new View.OnClickListener(this) { // from class: j9.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConfirmAirtimeDownTimeActivity f38411b;

                {
                    this.f38411b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmAirtimeDownTimeActivity confirmAirtimeDownTimeActivity = this.f38411b;
                    switch (i13) {
                        case 0:
                            int i14 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(28, 18);
                            break;
                        case 1:
                            int i15 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.n(1, 1);
                            break;
                        case 2:
                            int i16 = ConfirmAirtimeDownTimeActivity.f26466f;
                            confirmAirtimeDownTimeActivity.finish();
                            break;
                        default:
                            int i17 = ConfirmAirtimeDownTimeActivity.f26466f;
                            ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).navigation(confirmAirtimeDownTimeActivity, 100);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(getString(Pd.f.qt_airtime_str_book_agree1)).setForegroundColor(getResources().getColor(b.ppColorTextPrimary)).setFontFamily("sans-serif").append(getString(Pd.f.qt_airtime_str_book_agree2)).setForegroundColor(getResources().getColor(b.ppColorPrimary)).setFontFamily("sans-serif-medium").append(getString(Pd.f.qt_airtime_str_book_agree3)).setForegroundColor(getResources().getColor(b.ppColorTextPrimary)).setFontFamily("sans-serif").create();
        E e18 = (E) this.f27334c;
        if (e18 != null) {
            e18.f8038p.setText(spannableStringBuilderCreate);
        }
        E e19 = (E) this.f27334c;
        if (e19 != null) {
            e19.f8038p.setOnClickListener(new p054dd.d(15));
        }
    }
}

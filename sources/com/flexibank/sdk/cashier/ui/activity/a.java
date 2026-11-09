package com.flexibank.sdk.cashier.ui.activity;

import Bc.B;
import Bc.C0107d;
import Bc.i;
import Fd.G;
import Fe.h0;
import O3.k;
import P3.c;
import P3.f;
import P3.j;
import U3.h;
import V3.g;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.b;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcOfPaymentMethodResultBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentFeeInfoBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCoreCashierPaymentExtra;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierCouponListDialog$CallBack;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentInfoItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionLayout;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCoreCashierViewModel;
import com.flexibank.sdk.core.bean.FlexiBankPaymentMethod;
import com.flexibank.sdk.m;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.util.ScreenUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c implements FlexiBankCashierCouponListDialog$CallBack {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public FlexiBankModelPaymentPromotionLayout f21980A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f21981B0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public FlexiBankCalcOfPaymentMethodResultBean f21989s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public FlexiBankCashierCouponItem f21990t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public FlexiBankCashierPaymentMethodBean f21991u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f21992v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public FlexiBankModelPaymentInfoItem f21993w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public FlexiBankModelPaymentInfoItem f21994x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public FlexiBankModelPaymentInfoItem f21995y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public FlexiBankModelPaymentInfoItem f21996z0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final g f21984Z = new g(this);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ArrayList f21985k0 = new ArrayList();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f21986p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f21987q0 = C2131j.b(new f(this, 1));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f21988r0 = new ArrayList();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f21982C0 = C2131j.b(new f(this, 2));

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f21983D0 = C2131j.b(new f(this, 3));

    static {
        new j(null);
    }

    public static final void h(a aVar) {
        aVar.getClass();
        P3.g gVar = new P3.g(aVar, 2);
        x4.a aVar2 = (x4.a) aVar.f4917e;
        if (aVar2 != null) {
            ((IconicsImageView) ((C0107d) aVar2.f43572d.f593d).f681c).setOnClickListener(gVar);
        }
        x4.a aVar3 = (x4.a) aVar.f4917e;
        if (aVar3 != null) {
            ((TextView) ((C0107d) aVar3.f43572d.f593d).f683e).setOnClickListener(gVar);
        }
        x4.a aVar4 = (x4.a) aVar.f4917e;
        if (aVar4 != null) {
            ((IconicsImageView) aVar4.f43572d.f598j).setOnClickListener(new P3.g(aVar, 3));
        }
        x4.a aVar5 = (x4.a) aVar.f4917e;
        if (aVar5 != null) {
            aVar5.f43573e.setOnClickListener(new P3.g(aVar, 4));
        }
    }

    @Override // K3.d
    public final ViewBinding f() {
        View viewM;
        View viewM2;
        View viewM3;
        View viewInflate = getLayoutInflater().inflate(q.fb_activity_cashier_preview, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = p.fb_ll_cashier_confirm_to_pay;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null && (viewM = p059e1.a.m((i7 = p.fb_previewBodyLayout), viewInflate)) != null) {
            int i10 = p.fb_iv_close;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewM);
            if (iconicsImageView != null) {
                i10 = p.fb_layoutMiddle;
                if (((LinearLayout) p059e1.a.m(i10, viewM)) != null && (viewM2 = p059e1.a.m((i10 = p.fb_layoutPaymentMethodHeader), viewM)) != null) {
                    int i11 = p.fb_iv_payment_method_arrow;
                    IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i11, viewM2);
                    if (iconicsImageView2 != null) {
                        i11 = p.fb_tv_payment_method;
                        TextView textView = (TextView) p059e1.a.m(i11, viewM2);
                        if (textView != null) {
                            i11 = p.fb_tv_payment_method_all;
                            TextView textView2 = (TextView) p059e1.a.m(i11, viewM2);
                            if (textView2 != null) {
                                C0107d c0107d = new C0107d((ConstraintLayout) viewM2, iconicsImageView2, textView, textView2, 20);
                                i10 = p.fb_llCashierCalculationDtoEmpty;
                                ViewStub viewStub = (ViewStub) p059e1.a.m(i10, viewM);
                                if (viewStub != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewM;
                                    i10 = p.fb_ll_payment_info;
                                    LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i10, viewM);
                                    if (linearLayout3 != null) {
                                        i10 = p.fb_ll_payment_info_body;
                                        if (((LinearLayout) p059e1.a.m(i10, viewM)) != null) {
                                            i10 = p.fb_model_payment_earn_layout;
                                            FlexiBankModelPaymentEarnLayout flexiBankModelPaymentEarnLayout = (FlexiBankModelPaymentEarnLayout) p059e1.a.m(i10, viewM);
                                            if (flexiBankModelPaymentEarnLayout != null) {
                                                i10 = p.fb_nsv_payment_info;
                                                NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i10, viewM);
                                                if (nestedScrollView != null) {
                                                    i10 = p.fb_previewEarlyRefundItemStub;
                                                    ViewStub viewStub2 = (ViewStub) p059e1.a.m(i10, viewM);
                                                    if (viewStub2 != null) {
                                                        i10 = p.fb_previewFeeAmountItemStub;
                                                        ViewStub viewStub3 = (ViewStub) p059e1.a.m(i10, viewM);
                                                        if (viewStub3 != null) {
                                                            i10 = p.fb_previewOrderAmountItemStub;
                                                            ViewStub viewStub4 = (ViewStub) p059e1.a.m(i10, viewM);
                                                            if (viewStub4 != null) {
                                                                i10 = p.fb_previewPromotionItemStub;
                                                                ViewStub viewStub5 = (ViewStub) p059e1.a.m(i10, viewM);
                                                                if (viewStub5 != null) {
                                                                    i10 = p.fb_previewTaxesAmountItemStub;
                                                                    ViewStub viewStub6 = (ViewStub) p059e1.a.m(i10, viewM);
                                                                    if (viewStub6 != null) {
                                                                        i10 = p.fb_ry_payment_method;
                                                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewM);
                                                                        if (recyclerView != null) {
                                                                            i10 = p.fb_tv_pay_amount;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i10, viewM);
                                                                            if (textView3 != null) {
                                                                                i10 = p.fb_tv_save_amount;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i10, viewM);
                                                                                if (textView4 != null) {
                                                                                    i10 = p.fb_vs_extra_layout;
                                                                                    if (((ViewStub) p059e1.a.m(i10, viewM)) != null) {
                                                                                        B b7 = new B(linearLayout2, iconicsImageView, c0107d, viewStub, linearLayout3, flexiBankModelPaymentEarnLayout, nestedScrollView, viewStub2, viewStub3, viewStub4, viewStub5, viewStub6, recyclerView, textView3, textView4);
                                                                                        i7 = p.fb_tv_confirm_to_pay;
                                                                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView5 != null && (viewM3 = p059e1.a.m((i7 = p.fb_view_top_transparent_bg), viewInflate)) != null) {
                                                                                            x4.a aVar = new x4.a(constraintLayout, constraintLayout, linearLayout, b7, textView5, viewM3);
                                                                                            Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                                                                                            return aVar;
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
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM2.getResources().getResourceName(i11)));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final k i(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        k params = new k();
        params.e(Long.valueOf(this.f6880H));
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout == null || (bool = flexiBankModelPaymentPromotionLayout.isUsedPoint) == null) {
            bool = Boolean.FALSE;
        }
        params.i(bool);
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout2 = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout2 == null || (bool2 = flexiBankModelPaymentPromotionLayout2.isUsedDiscount) == null) {
            bool2 = Boolean.FALSE;
        }
        params.n(bool2);
        params.h(str);
        String stringExtra = ((FlexiBankCashierCommonPreviewActivity) this).getIntent().getStringExtra("mPayeeAccountType");
        if (stringExtra == null) {
            stringExtra = "";
        }
        params.g(stringExtra);
        params.f(this.f6877A);
        params.k(this.f6878B);
        params.j(this.f6879C);
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout3 = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout3 == null || (bool3 = flexiBankModelPaymentPromotionLayout3.isUsedCoupon) == null) {
            bool3 = Boolean.FALSE;
        }
        params.m(bool3);
        if (Intrinsics.c(params.getIsUseCoupon(), Boolean.TRUE)) {
            FlexiBankCashierCouponItem flexiBankCashierCouponItem = this.f21990t0;
            params.d(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponId() : null);
            FlexiBankCashierCouponItem flexiBankCashierCouponItem2 = this.f21990t0;
            params.c(flexiBankCashierCouponItem2 != null ? flexiBankCashierCouponItem2.getNominaValue() : null);
        }
        params.o();
        if (!TextUtils.isEmpty(this.f6881L)) {
            params.b(this.f6881L);
        }
        Intrinsics.checkNotNullParameter(params, "params");
        return params;
    }

    @Override // K3.d
    public final void initData() {
        String string;
        Intent intent = getIntent();
        if (intent != null) {
            this.f6877A = intent.getStringExtra("mOrderNo");
            this.f6878B = intent.getStringExtra("mTransType");
            this.f6879C = intent.getStringExtra("mSubTransType");
            intent.getStringExtra("mCustomerId");
            this.f6880H = intent.getLongExtra("mOrderAmount", 0L);
            this.f6881L = intent.getStringExtra("mCalculationExtInfo");
            this.f21992v0 = intent.getParcelableArrayListExtra("mExtras");
            Intrinsics.checkNotNullParameter(intent, "intent");
        }
        AttributeSet attributeSet = null;
        s(null);
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL = l();
        if (flexiBankModelPaymentInfoItemL != null) {
            flexiBankModelPaymentInfoItemL.g(1);
        }
        x4.a aVar = (x4.a) this.f4917e;
        if (aVar != null) {
            ((LinearLayout) aVar.f43572d.f592c).removeAllViews();
        }
        ArrayList arrayList = this.f21992v0;
        int i7 = 0;
        if (arrayList != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                FlexiBankCoreCashierPaymentExtra flexiBankCoreCashierPaymentExtra = (FlexiBankCoreCashierPaymentExtra) next;
                FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItem = new FlexiBankModelPaymentInfoItem(this, attributeSet, 6, i7);
                flexiBankModelPaymentInfoItem.d(flexiBankCoreCashierPaymentExtra.getKey());
                flexiBankModelPaymentInfoItem.f(flexiBankCoreCashierPaymentExtra.getValue());
                Integer style = flexiBankCoreCashierPaymentExtra.getStyle();
                flexiBankModelPaymentInfoItem.g(style != null ? style.intValue() : 2);
                if (!TextUtils.isEmpty(flexiBankCoreCashierPaymentExtra.getSubValue())) {
                    flexiBankModelPaymentInfoItem.e(flexiBankCoreCashierPaymentExtra.getSubValue());
                }
                Uri tagIvValue = flexiBankCoreCashierPaymentExtra.getTagIvValue();
                if (tagIvValue != null && (string = tagIvValue.toString()) != null) {
                    if (StringsKt.F(string)) {
                        string = null;
                    }
                    if (string != null) {
                        i iVar = flexiBankModelPaymentInfoItem.f22052a;
                        if (iVar != null) {
                            ((ImageView) iVar.f724b).setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(string) && iVar != null) {
                            b.e(flexiBankModelPaymentInfoItem.getContext()).load(string).S((ImageView) iVar.f724b);
                        }
                    }
                }
                TextView itemValueTv = flexiBankModelPaymentInfoItem.getItemValueTv();
                if (itemValueTv != null) {
                    itemValueTv.setMaxLines(2);
                }
                x4.a aVar2 = (x4.a) this.f4917e;
                if (aVar2 != null) {
                    ((LinearLayout) aVar2.f43572d.f592c).addView(flexiBankModelPaymentInfoItem, layoutParams);
                }
            }
        }
        x4.a aVar3 = (x4.a) this.f4917e;
        if (aVar3 != null) {
            RecyclerView recyclerView = (RecyclerView) aVar3.f43572d.f589B;
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            p168l4.a aVar4 = new p168l4.a(getColor(m.fb_transparent), ScreenUtils.dip2px(8));
            aVar4.f39272c = false;
            recyclerView.addItemDecoration(aVar4);
            recyclerView.setAdapter(k());
            k().setOnItemClickListener(new P3.i(this));
        }
        j();
    }

    @Override // K3.d
    public final void initStatusBar() {
        initStatusBar(0);
    }

    public final void j() {
        O3.f req = new O3.f();
        req.h(this.f6878B);
        FlexiBankCashierCommonPreviewActivity flexiBankCashierCommonPreviewActivity = (FlexiBankCashierCommonPreviewActivity) this;
        String stringExtra = flexiBankCashierCommonPreviewActivity.getIntent().getStringExtra("mPayeeAccountType");
        if (stringExtra == null) {
            stringExtra = "";
        }
        req.d(stringExtra);
        req.b(this.f6880H);
        req.f();
        req.i();
        req.c(this.f6877A);
        req.g(this.f6879C);
        req.j();
        if (!TextUtils.isEmpty(this.f6881L)) {
            req.a(this.f6881L);
        }
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(req, "req");
        req.e(!((Boolean) flexiBankCashierCommonPreviewActivity.f21970E0.getValue()).booleanValue());
        FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel = (FlexiBankCoreCashierViewModel) e();
        Intrinsics.checkNotNullParameter(req, "req");
        p118hf.a.A(flexiBankCoreCashierViewModel, new h(req, null), flexiBankCoreCashierViewModel.f22088f);
    }

    public final M3.g k() {
        return (M3.g) this.f21987q0.getValue();
    }

    public final FlexiBankModelPaymentInfoItem l() {
        B b7;
        ViewStub viewStub;
        if (this.f21994x0 == null) {
            try {
                x4.a aVar = (x4.a) this.f4917e;
                View viewInflate = (aVar == null || (b7 = aVar.f43572d) == null || (viewStub = (ViewStub) b7.f600p) == null) ? null : viewStub.inflate();
                if (viewInflate != null) {
                    this.f21994x0 = (FlexiBankModelPaymentInfoItem) viewInflate.findViewById(p.fb_previewFeeAmountItem);
                }
            } catch (Exception e10) {
                Log.e(this.f4914b, "getPreviewFeeItem: ", e10);
            }
        }
        return this.f21994x0;
    }

    public final FlexiBankModelPaymentInfoItem m() {
        B b7;
        ViewStub viewStub;
        if (this.f21996z0 == null) {
            try {
                x4.a aVar = (x4.a) this.f4917e;
                View viewInflate = (aVar == null || (b7 = aVar.f43572d) == null || (viewStub = (ViewStub) b7.f601v) == null) ? null : viewStub.inflate();
                if (viewInflate != null) {
                    this.f21996z0 = (FlexiBankModelPaymentInfoItem) viewInflate.findViewById(p.fb_previewOrderAmountItem);
                }
            } catch (Exception e10) {
                Log.e(this.f4914b, "getPreviewOrderAmountItem: ", e10);
            }
        }
        return this.f21996z0;
    }

    public final FlexiBankModelPaymentInfoItem n() {
        B b7;
        ViewStub viewStub;
        if (this.f21995y0 == null) {
            try {
                x4.a aVar = (x4.a) this.f4917e;
                View viewInflate = (aVar == null || (b7 = aVar.f43572d) == null || (viewStub = (ViewStub) b7.f588A) == null) ? null : viewStub.inflate();
                if (viewInflate != null) {
                    this.f21995y0 = (FlexiBankModelPaymentInfoItem) viewInflate.findViewById(p.fb_previewFeeAmountItem);
                }
            } catch (Exception e10) {
                Log.e(this.f4914b, "getPreviewTaxesItem: ", e10);
            }
        }
        return this.f21995y0;
    }

    public final void o() {
        View viewFindViewById;
        View viewFindViewById2 = findViewById(p.fb_cl_cashier_preview);
        if (viewFindViewById2 != null) {
            p062e4.a.d(viewFindViewById2, true);
        }
        x4.a aVar = (x4.a) this.f4917e;
        if (aVar != null) {
            p062e4.a.a((NestedScrollView) aVar.f43572d.f597i);
        }
        x4.a aVar2 = (x4.a) this.f4917e;
        if (aVar2 != null) {
            p062e4.a.a(aVar2.f43571c);
        }
        if (this.f21981B0 == null) {
            try {
                x4.a aVar3 = (x4.a) this.f4917e;
                View viewInflate = aVar3 != null ? ((ViewStub) aVar3.f43572d.f595f).inflate() : null;
                if (viewInflate != null) {
                    this.f21981B0 = viewInflate.findViewById(p.fb_llCashierCalculationDtoEmptyBody);
                }
            } catch (Exception e10) {
                Log.e(this.f4914b, "initPromotionLayout: ", e10);
            }
        }
        View view = this.f21981B0;
        if (view != null) {
            p062e4.a.e(view);
        }
        View view2 = this.f21981B0;
        if (view2 == null || (viewFindViewById = view2.findViewById(p.fb_tvConfirmToCancel)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new P3.g(this, 0));
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean;
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1001 && i10 == -1) {
            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = this.f21991u0;
            if ((flexiBankCashierPaymentMethodBean2 == null || 28 != flexiBankCashierPaymentMethodBean2.getSenderAccountType()) && ((flexiBankCashierPaymentMethodBean = this.f21991u0) == null || flexiBankCashierPaymentMethodBean.getPayType() != 36)) {
                return;
            }
            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean3 = this.f21991u0;
            if (flexiBankCashierPaymentMethodBean3 != null) {
                flexiBankCashierPaymentMethodBean3.z();
            }
            u();
        }
    }

    @Override // K3.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        View viewFindViewById = findViewById(p.fb_cl_cashier_preview);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
            finish();
        }
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierCouponListDialog$CallBack
    public final void onCouponClick(FlexiBankCashierCouponItem flexiBankCashierCouponItem) {
        this.f21990t0 = flexiBankCashierCouponItem;
        q();
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout != null) {
            FlexiBankCashierCouponItem flexiBankCashierCouponItem2 = this.f21990t0;
            FlexiBankModelPaymentPromotionLayout.b(flexiBankModelPaymentPromotionLayout, null, null, Boolean.valueOf((flexiBankCashierCouponItem2 == null || flexiBankCashierCouponItem2.getCouponId() == null) ? false : true), 59);
        }
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = this.f21991u0;
        if (flexiBankCashierPaymentMethodBean != null) {
            r(flexiBankCashierPaymentMethodBean);
        }
    }

    @Override // K3.d, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull Y3.a event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType != 7) {
            if (eventType == 275 || eventType == 283 || eventType == 291) {
                String eventContent = event.getEventContent();
                if ((TextUtils.isEmpty(eventContent) || Intrinsics.c(getLocalClassName(), eventContent)) && (event.getEventObj() instanceof FlexiBankPaymentMethod)) {
                    Object eventObj = event.getEventObj();
                    Intrinsics.f(eventObj, "null cannot be cast to non-null type com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean");
                    FlexiBankCashierPaymentMethodBean paymentMethod = (FlexiBankCashierPaymentMethodBean) eventObj;
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    ArrayList arrayList = this.f21988r0;
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!n.c(paymentMethod, (FlexiBankCashierPaymentMethodBean) next));
                    if (((FlexiBankCashierPaymentMethodBean) next) == null) {
                        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) CollectionsKt.G(0, arrayList);
                        if (flexiBankCashierPaymentMethodBean == null || flexiBankCashierPaymentMethodBean.getSenderAccountType() != 1) {
                            arrayList.add(0, paymentMethod);
                        } else {
                            arrayList.add(1, paymentMethod);
                        }
                    }
                    r(paymentMethod);
                    return;
                }
                return;
            }
            if (eventType != 344) {
                return;
            }
        }
        j();
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack
    public final void onPaymentMethodClick(FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean) {
        if (flexiBankCashierPaymentMethodBean != null) {
            r(flexiBankCashierPaymentMethodBean);
        }
    }

    public final void p() {
        LinearLayout linearLayout;
        B b7;
        NestedScrollView nestedScrollView;
        B b10;
        RecyclerView recyclerView;
        B b11;
        FlexiBankModelPaymentEarnLayout flexiBankModelPaymentEarnLayout;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout != null) {
            p062e4.a.e(flexiBankModelPaymentPromotionLayout);
        }
        View view = this.f21981B0;
        if (view != null) {
            p062e4.a.a(view);
        }
        x4.a aVar = (x4.a) this.f4917e;
        if (aVar != null && (b11 = aVar.f43572d) != null && (flexiBankModelPaymentEarnLayout = (FlexiBankModelPaymentEarnLayout) b11.f596g) != null) {
            p062e4.a.e(flexiBankModelPaymentEarnLayout);
        }
        x4.a aVar2 = (x4.a) this.f4917e;
        if (aVar2 != null && (b10 = aVar2.f43572d) != null && (recyclerView = (RecyclerView) b10.f589B) != null) {
            p062e4.a.e(recyclerView);
        }
        x4.a aVar3 = (x4.a) this.f4917e;
        if (aVar3 != null && (b7 = aVar3.f43572d) != null && (nestedScrollView = (NestedScrollView) b7.f597i) != null) {
            p062e4.a.e(nestedScrollView);
        }
        x4.a aVar4 = (x4.a) this.f4917e;
        if (aVar4 == null || (linearLayout = aVar4.f43571c) == null) {
            return;
        }
        p062e4.a.e(linearLayout);
    }

    @Override // K3.d
    public final void processLogic(Bundle bundle) {
        FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel = (FlexiBankCoreCashierViewModel) e();
        final int i7 = 0;
        l.q(this, flexiBankCoreCashierViewModel.f22089g, this, new Function2(this) { // from class: P3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6890b;

            {
                this.f6890b = this;
            }

            /* JADX WARN: Code duplicated, block: B:97:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:99:0x02ee  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 java.lang.Object, still in use, count: 2, list:
                  (r5v5 java.lang.Object) from 0x02de: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v5 java.lang.Object) binds: [B:94:0x02dd, B:126:0x02de] A[DONT_GENERATE, DONT_INLINE]
                  (r5v5 java.lang.Object) from 0x02d4: CHECK_CAST (com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean) (r5v5 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: P3.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new h0(15), 224);
        K3.j jVar = ((FlexiBankCoreCashierViewModel) e()).f22088f;
        if (jVar != null) {
            jVar.e(this, new G(new P3.l(this, this, 0), 5));
        }
        K3.j jVar2 = ((FlexiBankCoreCashierViewModel) e()).f22087e;
        if (jVar2 != null) {
            jVar2.e(this, new G(new P3.l(this, this, 1), 5));
        }
        FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel2 = (FlexiBankCoreCashierViewModel) e();
        final int i10 = 1;
        l.q(this, flexiBankCoreCashierViewModel2.f22090i, this, new Function2(this) { // from class: P3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6890b;

            {
                this.f6890b = this;
            }

            /* JADX WARN: Code duplicated, block: B:97:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:99:0x02ee  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 java.lang.Object, still in use, count: 2, list:
                  (r5v5 java.lang.Object) from 0x02de: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v5 java.lang.Object) binds: [B:94:0x02dd, B:126:0x02de] A[DONT_GENERATE, DONT_INLINE]
                  (r5v5 java.lang.Object) from 0x02d4: CHECK_CAST (com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean) (r5v5 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: P3.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new h0(16), 224);
    }

    public final void q() {
        if (this.f21980A0 != null) {
            return;
        }
        try {
            x4.a aVar = (x4.a) this.f4917e;
            View viewInflate = aVar != null ? ((ViewStub) aVar.f43572d.f602w).inflate() : null;
            if (viewInflate != null) {
                this.f21980A0 = (FlexiBankModelPaymentPromotionLayout) viewInflate.findViewById(p.fb_model_payment_promotion_layout);
            }
        } catch (Exception e10) {
            Log.e(this.f4914b, "initPromotionLayout: ", e10);
        }
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout != null) {
            flexiBankModelPaymentPromotionLayout.getPromotionInfoLayout().addView(flexiBankModelPaymentPromotionLayout.getPointPromotionItem());
            flexiBankModelPaymentPromotionLayout.getPromotionInfoLayout().addView(flexiBankModelPaymentPromotionLayout.getDiscountPromotionItem());
            flexiBankModelPaymentPromotionLayout.getPromotionInfoLayout().addView(flexiBankModelPaymentPromotionLayout.getCouponPromotionItem());
        }
        final FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout2 = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout2 != null) {
            final int i7 = 0;
            flexiBankModelPaymentPromotionLayout2.getPointPromotionItem().setPromotionListener(new FlexiBankModelPaymentPromotionItem.OnPromotionItemListener() { // from class: P3.d
                @Override // com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem.OnPromotionItemListener
                public final void onPromotionItemClick() {
                    switch (i7) {
                        case 0:
                            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout3 = flexiBankModelPaymentPromotionLayout2;
                            Boolean bool = flexiBankModelPaymentPromotionLayout3.isUsedPoint;
                            FlexiBankModelPaymentPromotionLayout.b(flexiBankModelPaymentPromotionLayout3, Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)), null, null, 62);
                            com.flexibank.sdk.cashier.ui.activity.a aVar2 = this;
                            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = aVar2.f21991u0;
                            if (flexiBankCashierPaymentMethodBean != null) {
                                aVar2.r(flexiBankCashierPaymentMethodBean);
                            }
                            break;
                        default:
                            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout4 = flexiBankModelPaymentPromotionLayout2;
                            Boolean bool2 = flexiBankModelPaymentPromotionLayout4.isUsedDiscount;
                            FlexiBankModelPaymentPromotionLayout.b(flexiBankModelPaymentPromotionLayout4, null, Boolean.valueOf(!(bool2 != null ? bool2.booleanValue() : false)), null, 61);
                            com.flexibank.sdk.cashier.ui.activity.a aVar3 = this;
                            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = aVar3.f21991u0;
                            if (flexiBankCashierPaymentMethodBean2 != null) {
                                aVar3.r(flexiBankCashierPaymentMethodBean2);
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            flexiBankModelPaymentPromotionLayout2.getDiscountPromotionItem().setPromotionListener(new FlexiBankModelPaymentPromotionItem.OnPromotionItemListener() { // from class: P3.d
                @Override // com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem.OnPromotionItemListener
                public final void onPromotionItemClick() {
                    switch (i10) {
                        case 0:
                            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout3 = flexiBankModelPaymentPromotionLayout2;
                            Boolean bool = flexiBankModelPaymentPromotionLayout3.isUsedPoint;
                            FlexiBankModelPaymentPromotionLayout.b(flexiBankModelPaymentPromotionLayout3, Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)), null, null, 62);
                            com.flexibank.sdk.cashier.ui.activity.a aVar2 = this;
                            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = aVar2.f21991u0;
                            if (flexiBankCashierPaymentMethodBean != null) {
                                aVar2.r(flexiBankCashierPaymentMethodBean);
                            }
                            break;
                        default:
                            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout4 = flexiBankModelPaymentPromotionLayout2;
                            Boolean bool2 = flexiBankModelPaymentPromotionLayout4.isUsedDiscount;
                            FlexiBankModelPaymentPromotionLayout.b(flexiBankModelPaymentPromotionLayout4, null, Boolean.valueOf(!(bool2 != null ? bool2.booleanValue() : false)), null, 61);
                            com.flexibank.sdk.cashier.ui.activity.a aVar3 = this;
                            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = aVar3.f21991u0;
                            if (flexiBankCashierPaymentMethodBean2 != null) {
                                aVar3.r(flexiBankCashierPaymentMethodBean2);
                            }
                            break;
                    }
                }
            });
            flexiBankModelPaymentPromotionLayout2.getCouponPromotionItem().setPromotionListener(new P3.i(this));
        }
    }

    public final void r(FlexiBankCashierPaymentMethodBean paymentMethod) {
        String string;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel = (FlexiBankCoreCashierViewModel) e();
        if (paymentMethod == null || (string = Integer.valueOf(paymentMethod.getSenderAccountType()).toString()) == null) {
            string = "1";
        }
        k req = i(string);
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        U3.i iVar = new U3.i(req, null);
        K3.j jVar = flexiBankCoreCashierViewModel.f22089g;
        jVar.f4932m = paymentMethod;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCoreCashierViewModel, iVar, jVar);
    }

    public final void s(FlexiBankCalcOfPaymentMethodResultBean flexiBankCalcOfPaymentMethodResultBean) {
        Long discountPackageAmount;
        if (flexiBankCalcOfPaymentMethodResultBean != null && (discountPackageAmount = flexiBankCalcOfPaymentMethodResultBean.getDiscountPackageAmount()) != null) {
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItem = null;
            if (discountPackageAmount.longValue() <= 0) {
                discountPackageAmount = null;
            }
            if (discountPackageAmount != null) {
                long jLongValue = discountPackageAmount.longValue();
                FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemM = m();
                if (flexiBankModelPaymentInfoItemM != null) {
                    int i7 = r.fb_amount;
                    i iVar = flexiBankModelPaymentInfoItemM.f22052a;
                    if (iVar != null) {
                        ((TextView) iVar.f728f).setText(flexiBankModelPaymentInfoItemM.getContext().getResources().getText(i7));
                    }
                    flexiBankModelPaymentInfoItemM.f(p118hf.a.t(jLongValue, true));
                    flexiBankModelPaymentInfoItemM.e(p118hf.a.t(this.f6880H, true));
                    flexiBankModelPaymentInfoItem = flexiBankModelPaymentInfoItemM;
                }
                if (flexiBankModelPaymentInfoItem != null) {
                    return;
                }
            }
        }
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemM2 = m();
        if (flexiBankModelPaymentInfoItemM2 != null) {
            int i10 = r.fb_amount;
            i iVar2 = flexiBankModelPaymentInfoItemM2.f22052a;
            if (iVar2 != null) {
                ((TextView) iVar2.f728f).setText(flexiBankModelPaymentInfoItemM2.getContext().getResources().getText(i10));
            }
            flexiBankModelPaymentInfoItemM2.f(p118hf.a.t(this.f6880H, true));
        }
    }

    @Override // K3.d
    public final void setupView() {
        ConstraintLayout constraintLayout;
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(m.fb_preview_window_bg)));
        org.greenrobot.eventbus.c.b().j(this);
        x4.a aVar = (x4.a) this.f4917e;
        if (aVar != null && (constraintLayout = aVar.f43570b) != null) {
            p062e4.a.d(constraintLayout, false);
        }
        getWindow().getDecorView().post(new androidx.camera.core.impl.utils.futures.i(11, new Handler(Looper.getMainLooper()), this));
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f21980A0;
        if (flexiBankModelPaymentPromotionLayout != null) {
            p062e4.a.a(flexiBankModelPaymentPromotionLayout);
        }
        x4.a aVar2 = (x4.a) this.f4917e;
        if (aVar2 != null) {
            p062e4.a.a((FlexiBankModelPaymentEarnLayout) aVar2.f43572d.f596g);
        }
        x4.a aVar3 = (x4.a) this.f4917e;
        if (aVar3 != null) {
            p062e4.a.a((RecyclerView) aVar3.f43572d.f589B);
        }
    }

    public final void t() {
        t tVar = this.f21983D0;
        Q3.i iVar = (Q3.i) tVar.getValue();
        if (iVar != null) {
            iVar.c().getClass();
            ArrayList paymentMethods = this.f21988r0;
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            t tVar2 = iVar.f7613p;
            ((List) tVar2.getValue()).clear();
            ((List) tVar2.getValue()).addAll(paymentMethods);
            iVar.c().setList((List) tVar2.getValue());
            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = this.f21991u0;
            if (flexiBankCashierPaymentMethodBean != null) {
                iVar.f7614v = flexiBankCashierPaymentMethodBean;
                FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = iVar.c().f5754b;
                if (flexiBankCashierPaymentMethodBean2 != null) {
                    n.c(flexiBankCashierPaymentMethodBean2, flexiBankCashierPaymentMethodBean);
                }
            }
            long j6 = this.f6882M;
            if (j6 < 0) {
                long j10 = this.f6880H;
                iVar.f7612o = j10;
                iVar.c().f5755c = j10;
            } else {
                iVar.f7612o = j6;
                iVar.c().f5755c = j6;
            }
            ArrayList arrayList = this.f21985k0;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = iVar.t;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
            }
        }
        Q3.i iVar2 = (Q3.i) tVar.getValue();
        if (iVar2 != null) {
            iVar2.show();
        }
    }

    public final void u() {
        FlexiBankCalcPaymentFeeInfoBean feeInfo;
        Long fee;
        O3.i req = new O3.i();
        req.c(this.f6882M);
        com.flexibank.sdk.k kVar = com.flexibank.sdk.k.f22317a;
        req.e();
        req.g(this.f6877A);
        req.r(this.f6878B);
        req.d(this.f6883Q);
        FlexiBankCalcOfPaymentMethodResultBean flexiBankCalcOfPaymentMethodResultBean = this.f21989s0;
        req.f((flexiBankCalcOfPaymentMethodResultBean == null || (feeInfo = flexiBankCalcOfPaymentMethodResultBean.getFeeInfo()) == null || (fee = feeInfo.getFee()) == null) ? 0L : fee.longValue());
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = this.f21991u0;
        if (flexiBankCashierPaymentMethodBean != null) {
            req.h(flexiBankCashierPaymentMethodBean.getPayType());
            req.i(flexiBankCashierPaymentMethodBean.getAccountId());
            req.l(flexiBankCashierPaymentMethodBean.getCvv());
            req.p(flexiBankCashierPaymentMethodBean.getCardPin());
            req.m(flexiBankCashierPaymentMethodBean.getExpiryMonth());
            req.n(flexiBankCashierPaymentMethodBean.getExpiryYear());
            req.o(flexiBankCashierPaymentMethodBean.getCardNo());
            req.j(flexiBankCashierPaymentMethodBean.getBankCode());
            req.k(flexiBankCashierPaymentMethodBean.getBankName());
            req.q(flexiBankCashierPaymentMethodBean.getReUseable());
            if (flexiBankCashierPaymentMethodBean.getPayType() == 11) {
                req.s(flexiBankCashierPaymentMethodBean.getBankCode());
                req.t(flexiBankCashierPaymentMethodBean.getBankAccountNo());
            }
        }
        Intrinsics.checkNotNullParameter(req, "params");
        FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel = (FlexiBankCoreCashierViewModel) e();
        Intrinsics.checkNotNullParameter(req, "req");
        U3.j jVar = new U3.j(req, null);
        K3.j jVar2 = flexiBankCoreCashierViewModel.f22090i;
        jVar2.f4932m = req;
        Unit unit = Unit.f38893a;
        p118hf.a.B(flexiBankCoreCashierViewModel, jVar, jVar2);
    }

    public abstract void v(FlexiBankCalcOfPaymentMethodResultBean flexiBankCalcOfPaymentMethodResultBean, boolean z3);
}

package com.transsnet.palmpay.airtime.ui.dialog;

import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.K;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.airtime.ui.dialog.AirtimeCouponRetentionDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/dialog/AirtimeCouponRetentionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;", FirebaseAnalytics.Param.COUPON, "Lkotlin/Function0;", "", "onGiveUp", "onUse", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bindCouponInfo", "()V", "", "buildCouponTypeText", "()Ljava/lang/String;", "getSingleInstitution", "initViews", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;", "Lkotlin/jvm/functions/Function0;", "LRd/K;", "binding", "LRd/K;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirtimeCouponRetentionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirtimeCouponRetentionDialog.kt\ncom/transsnet/palmpay/airtime/ui/dialog/AirtimeCouponRetentionDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class AirtimeCouponRetentionDialog extends b {
    private K binding;

    @NotNull
    private final BillerCouponRetentionBean coupon;

    @NotNull
    private final Function0<Unit> onGiveUp;

    @NotNull
    private final Function0<Unit> onUse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirtimeCouponRetentionDialog(@NotNull Context context, @NotNull BillerCouponRetentionBean coupon, @NotNull Function0<Unit> onGiveUp, @NotNull Function0<Unit> onUse) {
        super(context, d.qt_airtime_coupon_retention_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        Intrinsics.checkNotNullParameter(onGiveUp, "onGiveUp");
        Intrinsics.checkNotNullParameter(onUse, "onUse");
        this.coupon = coupon;
        this.onGiveUp = onGiveUp;
        this.onUse = onUse;
    }

    private final void bindCouponInfo() {
        Long nominaValue = this.coupon.getNominaValue();
        String strA = r0.A(nominaValue != null ? nominaValue.longValue() : 0L);
        Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
        String strK = y.k(strA, ".00", "");
        K k2 = this.binding;
        if (k2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String tips = this.coupon.getTips();
        k2.f8095g.setText(tips != null ? tips : "");
        K k8 = this.binding;
        if (k8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        k8.f8094f.setText(buildCouponTypeText());
        K k10 = this.binding;
        if (k10 != null) {
            k10.f8093e.setText(new SpanUtils().append(getContext().getString(k.core_currency_char_nig)).setFontSize(CommonViewExtKt.getDp(20)).append(strK).setFontSize(CommonViewExtKt.getDp(30)).create());
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    private final String buildCouponTypeText() {
        String string;
        String singleInstitution = getSingleInstitution();
        if (singleInstitution != null && (string = getContext().getString(f.qt_airtime_coupon_institution_type, singleInstitution)) != null) {
            return string;
        }
        String string2 = getContext().getString(k.core_coupon);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getSingleInstitution() {
        String str;
        List<String> institutionIdList = this.coupon.getInstitutionIdList();
        if (institutionIdList != null) {
            if (institutionIdList.size() != 1) {
                institutionIdList = null;
            }
            if (institutionIdList != null && (str = (String) CollectionsKt.firstOrNull(institutionIdList)) != null && !StringsKt.F(str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(AirtimeCouponRetentionDialog airtimeCouponRetentionDialog, View view) {
        if (r0.U0()) {
            return;
        }
        airtimeCouponRetentionDialog.dismiss();
        airtimeCouponRetentionDialog.onGiveUp.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(AirtimeCouponRetentionDialog airtimeCouponRetentionDialog, View view) {
        if (r0.U0()) {
            return;
        }
        airtimeCouponRetentionDialog.dismiss();
        airtimeCouponRetentionDialog.onUse.invoke();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.btnGiveUp;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = c.btnUse;
            PpButton ppButton2 = (PpButton) a.m(i7, viewFindViewById);
            if (ppButton2 != null) {
                i7 = c.couponContent;
                if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                    i7 = c.couponTypeGuide;
                    if (((Guideline) a.m(i7, viewFindViewById)) != null) {
                        i7 = c.ivClose;
                        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                        if (iconicsImageView != null) {
                            i7 = c.ivCouponBackground;
                            if (((ImageView) a.m(i7, viewFindViewById)) != null) {
                                i7 = c.tvCouponAmount;
                                TextView textView = (TextView) a.m(i7, viewFindViewById);
                                if (textView != null) {
                                    i7 = c.tvCouponType;
                                    TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView2 != null) {
                                        i7 = c.tvDescription;
                                        TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView3 != null) {
                                            i7 = c.tvTitle;
                                            TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView4 != null) {
                                                this.binding = new K((ConstraintLayout) viewFindViewById, ppButton, ppButton2, iconicsImageView, textView, textView2, textView3, textView4);
                                                showAtCenter(getWindow(), w.Animation_CommonDialog, ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48));
                                                bindCouponInfo();
                                                K k2 = this.binding;
                                                if (k2 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                final int i10 = 0;
                                                k2.f8092d.setOnClickListener(new View.OnClickListener(this) { // from class: l9.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ AirtimeCouponRetentionDialog f39286b;

                                                    {
                                                        this.f39286b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i10) {
                                                            case 0:
                                                                this.f39286b.dismiss();
                                                                break;
                                                            case 1:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$1(this.f39286b, view);
                                                                break;
                                                            default:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$2(this.f39286b, view);
                                                                break;
                                                        }
                                                    }
                                                });
                                                K k8 = this.binding;
                                                if (k8 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                final int i11 = 1;
                                                k8.f8090b.setOnClickListener(new View.OnClickListener(this) { // from class: l9.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ AirtimeCouponRetentionDialog f39286b;

                                                    {
                                                        this.f39286b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i11) {
                                                            case 0:
                                                                this.f39286b.dismiss();
                                                                break;
                                                            case 1:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$1(this.f39286b, view);
                                                                break;
                                                            default:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$2(this.f39286b, view);
                                                                break;
                                                        }
                                                    }
                                                });
                                                K k10 = this.binding;
                                                if (k10 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                final int i12 = 2;
                                                k10.f8091c.setOnClickListener(new View.OnClickListener(this) { // from class: l9.a

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ AirtimeCouponRetentionDialog f39286b;

                                                    {
                                                        this.f39286b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i12) {
                                                            case 0:
                                                                this.f39286b.dismiss();
                                                                break;
                                                            case 1:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$1(this.f39286b, view);
                                                                break;
                                                            default:
                                                                AirtimeCouponRetentionDialog.initViews$lambda$2(this.f39286b, view);
                                                                break;
                                                        }
                                                    }
                                                });
                                                return;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }
}

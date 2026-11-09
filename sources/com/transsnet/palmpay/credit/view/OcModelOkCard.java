package com.transsnet.palmpay.credit.view;

import C0.G;
import E.AbstractC0198c;
import N8.q0;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.view.OcModelOkCard;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\u001f\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0015R\u001b\u0010\"\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0015R\u001b\u0010%\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0015R\u001b\u0010(\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010\u0015R\u001b\u0010+\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0015R\u001b\u0010.\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0015R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/transsnet/palmpay/credit/view/OcModelOkCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/text/SpannableStringBuilder;", "getDueTodayContent", "()Landroid/text/SpannableStringBuilder;", "getDueInTomorrowContent", "Landroid/widget/ImageView;", "a", "Lkotlin/Lazy;", "getIvInfo", "()Landroid/widget/ImageView;", "ivInfo", "Landroid/widget/TextView;", "b", "getTvState", "()Landroid/widget/TextView;", "tvState", "c", "getTvAmount2", "tvAmount2", "d", "getTvAction", "tvAction", "e", "getMain_installment_label_tv", "main_installment_label_tv", "f", "getDiscount_tv", "discount_tv", "g", "getTvTotalCredit", "tvTotalCredit", "i", "getTvAmount1", "tvAmount1", "j", "getTvCardState", "tvCardState", "o", "getTvTitle1", "tvTitle1", "Landroidx/constraintlayout/widget/Group;", "p", "getTopGroup", "()Landroidx/constraintlayout/widget/Group;", "topGroup", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcModelOkCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcModelOkCard.kt\ncom/transsnet/palmpay/credit/view/OcModelOkCard\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,378:1\n746#2,47:379\n*S KotlinDebug\n*F\n+ 1 OcModelOkCard.kt\ncom/transsnet/palmpay/credit/view/OcModelOkCard\n*L\n116#1:379,47\n*E\n"})
public final class OcModelOkCard extends ConstraintLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f30827v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f30834g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30836j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30838p;
    public OkCardMainPageRspData t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcModelOkCard(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30828a = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i7) {
                    case 0:
                        int i10 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i11 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i12 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i13 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i14 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i15 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i18 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i10 = 9;
        this.f30829b = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i10) {
                    case 0:
                        int i11 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i12 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i13 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i14 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i15 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i19 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i11 = 10;
        this.f30830c = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i11) {
                    case 0:
                        int i12 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i13 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i14 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i15 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i110 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i12 = 1;
        this.f30831d = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i12) {
                    case 0:
                        int i13 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i14 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i15 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i111 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i13 = 2;
        this.f30832e = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i13) {
                    case 0:
                        int i14 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i15 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i112 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i14 = 3;
        this.f30833f = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i14) {
                    case 0:
                        int i15 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i16 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i113 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i114 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i15 = 4;
        this.f30834g = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i15) {
                    case 0:
                        int i16 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i17 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i114 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i115 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i16 = 5;
        this.f30835i = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i16) {
                    case 0:
                        int i17 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i18 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i114 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i115 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i116 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i17 = 6;
        this.f30836j = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i17) {
                    case 0:
                        int i18 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i19 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i114 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i115 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i116 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i117 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i18 = 7;
        this.f30837o = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i18) {
                    case 0:
                        int i19 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i110 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i114 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i115 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i116 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i117 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i118 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        final int i19 = 8;
        this.f30838p = C2131j.b(new Function0(this) { // from class: Gb.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3230b;

            {
                this.f3230b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcModelOkCard ocModelOkCard = this.f3230b;
                switch (i19) {
                    case 0:
                        int i110 = OcModelOkCard.f30827v;
                        return (ImageView) ocModelOkCard.findViewById(Ya.e.ivInfo);
                    case 1:
                        int i111 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAction);
                    case 2:
                        int i112 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.main_installment_label_tv);
                    case 3:
                        int i113 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.discount_tv);
                    case 4:
                        int i114 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTotalCredit);
                    case 5:
                        int i115 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount1);
                    case 6:
                        int i116 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvCardState);
                    case 7:
                        int i117 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvTitle1);
                    case 8:
                        int i118 = OcModelOkCard.f30827v;
                        return (Group) ocModelOkCard.findViewById(Ya.e.topGroup);
                    case 9:
                        int i119 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvState);
                    default:
                        int i20 = OcModelOkCard.f30827v;
                        return (TextView) ocModelOkCard.findViewById(Ya.e.tvAmount2);
                }
            }
        });
        View.inflate(context, f.cs_layout_ok_card, this);
        setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        final int i20 = 0;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i20) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i21 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i22 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i21);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i22, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, getTvAction());
        final int i21 = 1;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i21) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i22 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i23 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i22);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i23, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, this);
        final int i22 = 2;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i22) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i23 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i24 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i23);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i24, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, getTopGroup());
        final int i23 = 3;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i23) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i24 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i25 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i24);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i25, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, getTvAmount1());
        final int i24 = 4;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i24) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i25 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i26 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i25);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i26, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, getTvAmount2());
        final int i25 = 5;
        h.l(new View.OnClickListener(this) { // from class: Gb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcModelOkCard f3232b;

            {
                this.f3232b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applyStatus;
                Integer userType;
                Long outstandingBillId;
                Long billId;
                Integer accountStatus;
                Integer userType2;
                Integer applyStatus2;
                Integer applyStatus3;
                Integer userType3;
                Integer applyStatus4;
                Integer applyStatus5;
                Integer userType4;
                Integer applyStatus6;
                Integer applyStatus7;
                Integer userType5;
                Integer applyStatus8;
                Long outstandingBillId2;
                Long billId2;
                Integer applyStatus9;
                Integer userType6;
                Integer applyStatus10;
                Integer applyStatus11;
                switch (i25) {
                    case 0:
                        OcModelOkCard ocModelOkCard = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData = ocModelOkCard.t;
                        if (okCardMainPageRspData != null) {
                            Integer applyStatus12 = okCardMainPageRspData.getApplyStatus();
                            if ((applyStatus12 == null || applyStatus12.intValue() != 1) && (((applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 0) && (userType = okCardMainPageRspData.getUserType()) != null && userType.intValue() == 2)) {
                                OcModelOkCard.d();
                                break;
                            } else {
                                OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
                                if (okCardMainPageRspData2 != null && (accountStatus = okCardMainPageRspData2.getAccountStatus()) != null && accountStatus.intValue() == 5) {
                                    OcModelOkCard.d();
                                    break;
                                } else {
                                    OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
                                    if (okCardMainPageRspData3 != null) {
                                        Integer applyStatus13 = okCardMainPageRspData3.getApplyStatus();
                                        if (applyStatus13 == null || applyStatus13.intValue() != 0) {
                                            Integer outstandingBillCount = okCardMainPageRspData3.getOutstandingBillCount();
                                            long jLongValue = 0;
                                            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) != 0) {
                                                Integer outstandingBillCount2 = okCardMainPageRspData3.getOutstandingBillCount();
                                                if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                                                    postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData4 != null ? okCardMainPageRspData4.getCardNo() : null).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                } else {
                                                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                    OkCardMainPageRspData okCardMainPageRspData5 = ocModelOkCard.t;
                                                    Postcard postcardWithString = postcardBuild2.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null);
                                                    OkCardMainPageRspData okCardMainPageRspData6 = ocModelOkCard.t;
                                                    if (okCardMainPageRspData6 != null && (outstandingBillId = okCardMainPageRspData6.getOutstandingBillId()) != null) {
                                                        jLongValue = outstandingBillId.longValue();
                                                    }
                                                    postcardWithString.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                                }
                                            } else {
                                                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                                                OkCardMainPageRspData okCardMainPageRspData7 = ocModelOkCard.t;
                                                Postcard postcardWithString2 = postcardBuild3.withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null);
                                                OkCardMainPageRspData okCardMainPageRspData8 = ocModelOkCard.t;
                                                if (okCardMainPageRspData8 != null && (billId = okCardMainPageRspData8.getBillId()) != null) {
                                                    jLongValue = billId.longValue();
                                                }
                                                postcardWithString2.withLong("oc_repay_bill_id", jLongValue).withString("oc_repay_order_no", null).navigation(ocModelOkCard.getContext());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        OkCardMainPageRspData okCardMainPageRspData9 = this.f3232b.t;
                        if (okCardMainPageRspData9 == null || (applyStatus3 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
                            if ((okCardMainPageRspData9 == null || (applyStatus2 = okCardMainPageRspData9.getApplyStatus()) == null || applyStatus2.intValue() != 0) && okCardMainPageRspData9 != null && (userType2 = okCardMainPageRspData9.getUserType()) != null && userType2.intValue() == 2) {
                                OcModelOkCard.d();
                            }
                        }
                        break;
                    case 2:
                        OkCardMainPageRspData okCardMainPageRspData10 = this.f3232b.t;
                        if (!(okCardMainPageRspData10 == null || (applyStatus5 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus5.intValue() != 1) || (!(okCardMainPageRspData10 == null || (applyStatus4 = okCardMainPageRspData10.getApplyStatus()) == null || applyStatus4.intValue() != 0) || okCardMainPageRspData10 == null || (userType3 = okCardMainPageRspData10.getUserType()) == null || userType3.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 3:
                        OkCardMainPageRspData okCardMainPageRspData11 = this.f3232b.t;
                        if (!(okCardMainPageRspData11 == null || (applyStatus7 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus7.intValue() != 1) || (!(okCardMainPageRspData11 == null || (applyStatus6 = okCardMainPageRspData11.getApplyStatus()) == null || applyStatus6.intValue() != 0) || okCardMainPageRspData11 == null || (userType4 = okCardMainPageRspData11.getUserType()) == null || userType4.intValue() != 2)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceManager");
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                    case 4:
                        OcModelOkCard ocModelOkCard2 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData12 = ocModelOkCard2.t;
                        if ((okCardMainPageRspData12 == null || (applyStatus9 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus9.intValue() != 1) && ((okCardMainPageRspData12 == null || (applyStatus8 = okCardMainPageRspData12.getApplyStatus()) == null || applyStatus8.intValue() != 0) && okCardMainPageRspData12 != null && (userType5 = okCardMainPageRspData12.getUserType()) != null && userType5.intValue() == 2)) {
                            OcModelOkCard.d();
                            break;
                        } else {
                            OkCardMainPageRspData okCardMainPageRspData13 = ocModelOkCard2.t;
                            if (okCardMainPageRspData13 != null) {
                                Integer applyStatus14 = okCardMainPageRspData13.getApplyStatus();
                                if (applyStatus14 == null || applyStatus14.intValue() != 0) {
                                    Integer outstandingBillCount3 = okCardMainPageRspData13.getOutstandingBillCount();
                                    if ((outstandingBillCount3 != null ? outstandingBillCount3.intValue() : 0) != 0) {
                                        Integer outstandingBillCount4 = okCardMainPageRspData13.getOutstandingBillCount();
                                        if ((outstandingBillCount4 != null ? outstandingBillCount4.intValue() : 0) != 1) {
                                            Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData14 = ocModelOkCard2.t;
                                            postcardBuild4.withString("oc_card_no", okCardMainPageRspData14 != null ? okCardMainPageRspData14.getCardNo() : null).withString("oc_bill_list_type", "oc_due_bill").navigation(ocModelOkCard2.getContext());
                                        } else {
                                            Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                            OkCardMainPageRspData okCardMainPageRspData15 = ocModelOkCard2.t;
                                            Postcard postcardWithString3 = postcardBuild5.withString("oc_card_no", okCardMainPageRspData15 != null ? okCardMainPageRspData15.getCardNo() : null);
                                            OkCardMainPageRspData okCardMainPageRspData16 = ocModelOkCard2.t;
                                            postcardWithString3.withLong("oc_bill_id", (okCardMainPageRspData16 == null || (outstandingBillId2 = okCardMainPageRspData16.getOutstandingBillId()) == null) ? 0L : outstandingBillId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                        }
                                    } else {
                                        Postcard postcardBuild6 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                                        OkCardMainPageRspData okCardMainPageRspData17 = ocModelOkCard2.t;
                                        Postcard postcardWithString4 = postcardBuild6.withString("oc_card_no", okCardMainPageRspData17 != null ? okCardMainPageRspData17.getCardNo() : null);
                                        OkCardMainPageRspData okCardMainPageRspData18 = ocModelOkCard2.t;
                                        postcardWithString4.withLong("oc_bill_id", (okCardMainPageRspData18 == null || (billId2 = okCardMainPageRspData18.getBillId()) == null) ? 0L : billId2.longValue()).withLong("oc_future_repayment_date", 0L).navigation(ocModelOkCard2.getContext());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        OcModelOkCard ocModelOkCard3 = this.f3232b;
                        OkCardMainPageRspData okCardMainPageRspData19 = ocModelOkCard3.t;
                        if (!(okCardMainPageRspData19 == null || (applyStatus11 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus11.intValue() != 1) || (!(okCardMainPageRspData19 == null || (applyStatus10 = okCardMainPageRspData19.getApplyStatus()) == null || applyStatus10.intValue() != 0) || okCardMainPageRspData19 == null || (userType6 = okCardMainPageRspData19.getUserType()) == null || userType6.intValue() != 2)) {
                            SpannableStringBuilder spannableStringBuilderCreate = d0.i(ocModelOkCard3.getContext(), Ya.b.cs_oc_flex_base_color, d0.i(ocModelOkCard3.getContext(), L6.b.ppColorTextDisable, C0.G.i("The fixed repayment dates for the Flexi Credit Limit are the "), "1st and 16th of each month."), " Repay before the due date to enjoy interest free.").setForegroundColor(ocModelOkCard3.getContext().getColor(L6.b.ppColorTextDisable)).create();
                            Context context2 = ocModelOkCard3.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            int i26 = Ya.g.cs_bw_repayment_date;
                            Intrinsics.e(spannableStringBuilderCreate);
                            int i27 = p025ba.k.core_got_it;
                            O6.c cVar = new O6.c(context2);
                            cVar.f6614u = 1;
                            cVar.e(i26);
                            cVar.f6598d = spannableStringBuilderCreate;
                            cVar.d(i27, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            cVar.f6615v = L6.i.ppFlexiDialogTheme;
                            C0.G.v(cVar, false, false);
                        } else {
                            OcModelOkCard.d();
                        }
                        break;
                }
            }
        }, getIvInfo());
    }

    public static void d() {
        q0.v("/credit_score/oc_protocol_activity", "oc_apply_enter_point", "HOME");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0201  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213  */
    public static void e(OcModelOkCard ocModelOkCard, OkCardMainPageRspData data) {
        Integer userType;
        Integer applyStatus;
        OkCardMainPageRspData okCardMainPageRspData;
        boolean zC;
        SpannableStringBuilder spannableStringBuilderCreate;
        Integer applyStatus2;
        Integer applyStatus3;
        Integer applyStatus4;
        ocModelOkCard.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        ocModelOkCard.t = data;
        Integer userType2 = data.getUserType();
        if (userType2 != null && userType2.intValue() == 1 && (((applyStatus3 = data.getApplyStatus()) != null && applyStatus3.intValue() == -1) || ((applyStatus4 = data.getApplyStatus()) != null && applyStatus4.intValue() == 2))) {
            h.s(ocModelOkCard, false);
            return;
        }
        h.s(ocModelOkCard, true);
        h.s(ocModelOkCard.getTopGroup(), true);
        h.s(ocModelOkCard.getIvInfo(), false);
        h.s(ocModelOkCard.getTvState(), false);
        ocModelOkCard.c(true);
        ocModelOkCard.getTvAmount1().setText(r0.B(data.getAvailableBalance(), true));
        ocModelOkCard.getTvAmount2().setText(r0.B(data.getBillOutstandingAmount(), true));
        r0.R1(ocModelOkCard.getTvAmount1(), "fonts/PalmPayNum-Bold.ttf");
        r0.R1(ocModelOkCard.getTvAmount2(), "fonts/PalmPayNum-Bold.ttf");
        ocModelOkCard.getTvTotalCredit().setText(ocModelOkCard.getContext().getString(g.cs_total_credit_limit_format, r0.B(data.getCreditQuota(), true)));
        Integer applyStatus5 = data.getApplyStatus();
        if (applyStatus5 != null && applyStatus5.intValue() == 0) {
            ocModelOkCard.getTvTotalCredit().setVisibility(4);
            ocModelOkCard.getTvAmount1().setText(new SpanUtils().append(ocModelOkCard.getContext().getString(g.cs_limit_calculating)).setFontSize(26, true).create());
        } else {
            h.s(ocModelOkCard.getTvTotalCredit(), true);
        }
        OkCardMainPageRspData okCardMainPageRspData2 = ocModelOkCard.t;
        if ((okCardMainPageRspData2 == null || (applyStatus2 = okCardMainPageRspData2.getApplyStatus()) == null || applyStatus2.intValue() != 1) && (okCardMainPageRspData2 == null || (applyStatus = okCardMainPageRspData2.getApplyStatus()) == null || applyStatus.intValue() != 0) && okCardMainPageRspData2 != null && (userType = okCardMainPageRspData2.getUserType()) != null && userType.intValue() == 2) {
            ocModelOkCard.getDiscount_tv().setText(ocModelOkCard.getContext().getString(g.cs_oc_discount, r0.B(9000L, true)));
            h.s(ocModelOkCard.getDiscount_tv(), true);
            h.s(ocModelOkCard.getTvState(), true);
            ocModelOkCard.getTvState().setBackground(null);
            ocModelOkCard.getTvState().setText(ocModelOkCard.getContext().getString(g.cs_no_outstanding_bill));
            h.s(ocModelOkCard.getIvInfo(), false);
            h.s(ocModelOkCard.getTvAction(), true);
            ocModelOkCard.getTvAction().setText(ocModelOkCard.getContext().getString(g.cs_oc_spend_now));
        } else if (data.getBillOutstandingAmount() <= 0) {
            h.s(ocModelOkCard.getTvState(), false);
            ocModelOkCard.getTvState().setBackground(null);
            ocModelOkCard.getTvState().setText(ocModelOkCard.getContext().getString(g.cs_no_outstanding_bill));
            h.s(ocModelOkCard.getIvInfo(), false);
            h.s(ocModelOkCard.getTvAction(), false);
        } else {
            h.s(ocModelOkCard.getTvAction(), true);
            OkCardMainPageRspData okCardMainPageRspData3 = ocModelOkCard.t;
            if (okCardMainPageRspData3 != null ? Intrinsics.c(okCardMainPageRspData3.getSpreadAvailable(), Boolean.TRUE) : false) {
                ocModelOkCard.getMain_installment_label_tv().setVisibility(0);
                okCardMainPageRspData = ocModelOkCard.t;
                if (okCardMainPageRspData != null) {
                    zC = Intrinsics.c(okCardMainPageRspData.getSpreadAvailable(), Boolean.TRUE);
                } else {
                    zC = false;
                }
                if (zC) {
                    ocModelOkCard.getMain_installment_label_tv().setText(ocModelOkCard.getContext().getString(g.cs_oc_installment_repayment_available));
                } else {
                    ocModelOkCard.getMain_installment_label_tv().setText(ocModelOkCard.getContext().getString(g.cs_oc_mini_repayment_available));
                }
            } else {
                OkCardMainPageRspData okCardMainPageRspData4 = ocModelOkCard.t;
                if (okCardMainPageRspData4 != null ? Intrinsics.c(okCardMainPageRspData4.getExtensionAvailable(), Boolean.TRUE) : false) {
                    ocModelOkCard.getMain_installment_label_tv().setVisibility(0);
                    okCardMainPageRspData = ocModelOkCard.t;
                    if (okCardMainPageRspData != null) {
                        zC = Intrinsics.c(okCardMainPageRspData.getSpreadAvailable(), Boolean.TRUE);
                    } else {
                        zC = false;
                    }
                    if (zC) {
                        ocModelOkCard.getMain_installment_label_tv().setText(ocModelOkCard.getContext().getString(g.cs_oc_installment_repayment_available));
                    } else {
                        ocModelOkCard.getMain_installment_label_tv().setText(ocModelOkCard.getContext().getString(g.cs_oc_mini_repayment_available));
                    }
                } else {
                    ocModelOkCard.getMain_installment_label_tv().setVisibility(8);
                }
            }
            Integer accountStatus = data.getAccountStatus();
            if (accountStatus != null && accountStatus.intValue() == 1) {
                h.s(ocModelOkCard.getIvInfo(), false);
                long jD = AbstractC0198c.D(data.getRepaymentDateStamp());
                ocModelOkCard.getTvState().setBackgroundResource(d.cs_btn_overdue_state_2);
                ocModelOkCard.getTvState().setTextColor(ocModelOkCard.getContext().getColor(b.cs_cl_overdue_txt_color));
                TextView tvState = ocModelOkCard.getTvState();
                if (jD > 1) {
                    spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(ocModelOkCard.getContext().getColor(b.cs_overdue_txt_color)).setBold().append(" days overdue. Auto Repay is taking place").setForegroundColor(ocModelOkCard.getContext().getColor(b.cs_overdue_txt_color)).create();
                    Intrinsics.e(spannableStringBuilderCreate);
                } else {
                    spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(ocModelOkCard.getContext().getColor(b.cs_overdue_txt_color)).setBold().append(" day overdue. Auto Repay is taking place").setForegroundColor(ocModelOkCard.getContext().getColor(b.cs_overdue_txt_color)).create();
                    Intrinsics.e(spannableStringBuilderCreate);
                }
                tvState.setText(spannableStringBuilderCreate);
                h.s(ocModelOkCard.getTvState(), true);
            } else {
                h.s(ocModelOkCard.getIvInfo(), false);
                long jZ = AbstractC0198c.z(data.getRepaymentDateStamp());
                if (DateUtils.isToday(data.getRepaymentDateStamp())) {
                    ocModelOkCard.getTvState().setBackgroundResource(d.cs_btn_overdue_state_2);
                    ocModelOkCard.getTvState().setTextColor(ocModelOkCard.getContext().getColor(b.cs_cl_overdue_txt_color));
                    ocModelOkCard.getTvState().setText(ocModelOkCard.getDueTodayContent());
                } else if (jZ == 1) {
                    ocModelOkCard.getTvState().setBackgroundResource(d.cs_btn_overdue_state_1);
                    ocModelOkCard.getTvState().setTextColor(ocModelOkCard.getContext().getColor(b.cs_overdue_today_txt_color));
                    ocModelOkCard.getTvState().setText(ocModelOkCard.getDueInTomorrowContent());
                } else if (jZ <= 3) {
                    ocModelOkCard.getTvState().setBackgroundResource(d.cs_btn_overdue_state_1);
                    ocModelOkCard.getTvState().setTextColor(ocModelOkCard.getContext().getColor(b.cs_overdue_today_txt_color));
                    TextView tvState2 = ocModelOkCard.getTvState();
                    SpannableStringBuilder spannableStringBuilderCreate2 = new SpanUtils().append("Auto Repay Occurs on Due Date (" + jZ + " days)").setForegroundColor(ocModelOkCard.getContext().getColor(b.cs_overdue_today_txt_color)).create();
                    Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate2, "create(...)");
                    tvState2.setText(spannableStringBuilderCreate2);
                } else {
                    ocModelOkCard.getTvState().setTextColor(ocModelOkCard.getContext().getColor(L6.b.ppColorTextDisable));
                    ocModelOkCard.getTvState().setBackgroundResource(r.cv_shape_rect_corner_8_bg_dark);
                    TextView tvState3 = ocModelOkCard.getTvState();
                    SpannableStringBuilder spannableStringBuilderCreate3 = d0.j("Due on: ", r0.X1(Long.valueOf(data.getRepaymentDateStamp()), "dd MMM"), new SpanUtils()).setForegroundColor(ocModelOkCard.getContext().getColor(L6.b.ppColorTextPrimary)).create();
                    Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate3, "create(...)");
                    tvState3.setText(spannableStringBuilderCreate3);
                }
                h.s(ocModelOkCard.getTvState(), true);
            }
        }
        Integer accountStatus2 = data.getAccountStatus();
        if (accountStatus2 != null && accountStatus2.intValue() == 5) {
            h.s(ocModelOkCard.getTvCardState(), true);
            ocModelOkCard.c(false);
            ocModelOkCard.getTvCardState().setText(g.cs_disabled);
            ocModelOkCard.getTvAction().setText(g.cs_cl_active_now);
            h.s(ocModelOkCard.getTvAction(), true);
            return;
        }
        Integer accountStatus3 = data.getAccountStatus();
        if (accountStatus3 == null || accountStatus3.intValue() != 4) {
            h.s(ocModelOkCard.getTvCardState(), false);
            return;
        }
        ocModelOkCard.getTvCardState().setText(g.cs_frozen);
        ocModelOkCard.c(false);
        h.s(ocModelOkCard.getTvCardState(), true);
    }

    private final TextView getDiscount_tv() {
        Object value = this.f30833f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final SpannableStringBuilder getDueInTomorrowContent() {
        SpannableStringBuilder spannableStringBuilderCreate = G.i("Auto Repay Occurs on Due Date (Tomorrow)").setForegroundColor(getContext().getColor(b.cs_overdue_today_txt_color)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    private final SpannableStringBuilder getDueTodayContent() {
        SpannableStringBuilder spannableStringBuilderCreate = G.i("Auto Repay Occurs on Due Date (Today)").setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    private final ImageView getIvInfo() {
        Object value = this.f30828a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getMain_installment_label_tv() {
        Object value = this.f30832e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final Group getTopGroup() {
        Object value = this.f30838p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    private final TextView getTvAction() {
        Object value = this.f30831d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvAmount1() {
        Object value = this.f30835i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvAmount2() {
        Object value = this.f30830c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvCardState() {
        Object value = this.f30836j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvState() {
        Object value = this.f30829b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvTitle1() {
        Object value = this.f30837o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvTotalCredit() {
        Object value = this.f30834g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c(boolean z3) {
        getTvTitle1().setTextColor(getContext().getColor(z3 ? b.cs_color_amount : b.cs_color_frozen));
        getTvAmount1().setTextColor(getContext().getColor(z3 ? b.cs_color_amount : b.cs_color_frozen));
        getTvTotalCredit().setTextColor(getContext().getColor(z3 ? b.cs_color_amount : b.cs_color_frozen));
    }
}

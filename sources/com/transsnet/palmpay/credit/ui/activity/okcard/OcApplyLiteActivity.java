package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import C9.C0155w;
import Db.m;
import Db.n;
import Pa.r0;
import Ya.e;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.bean.req.CLInitReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.OcApplyLiteViewModel;
import com.transsnet.palmpay.custom_view.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p140j8.f;
import p284sb.C2023v;
import p310ub.C2086l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_apply_lite_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyLiteActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/OcApplyLiteViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcApplyLiteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcApplyLiteActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyLiteActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n152#2:311\n169#2:312\n260#2,10:313\n296#2:323\n171#2,12:324\n215#2:336\n1#3:337\n*S KotlinDebug\n*F\n+ 1 OcApplyLiteActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyLiteActivity\n*L\n88#1:311\n88#1:312\n104#1:313,10\n104#1:323\n138#1:324,12\n138#1:336\n*E\n"})
public final class OcApplyLiteActivity extends BaseMvvmActivity<OcApplyLiteViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f29262C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29263A = "8 million";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f29264B = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f29265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29269g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29271j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29273p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f29274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f29275w;

    public OcApplyLiteActivity() {
        final int i7 = 4;
        this.f29265c = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i7) {
                    case 0:
                        int i10 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i11 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i12 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i13 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i14 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i10 = 5;
        this.f29266d = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i10) {
                    case 0:
                        int i11 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i12 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i13 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i14 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i11 = 6;
        this.f29267e = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i11) {
                    case 0:
                        int i12 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i13 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i14 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i12 = 7;
        this.f29268f = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i12) {
                    case 0:
                        int i13 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i14 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i13 = 8;
        this.f29269g = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i13) {
                    case 0:
                        int i14 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i14 = 9;
        this.f29270i = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i14) {
                    case 0:
                        int i15 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i114 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i15 = 0;
        this.f29271j = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i15) {
                    case 0:
                        int i16 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i114 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i115 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i16 = 1;
        this.f29272o = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i16) {
                    case 0:
                        int i17 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i114 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i115 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i116 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i17 = 2;
        this.f29273p = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i17) {
                    case 0:
                        int i18 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i114 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i115 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i116 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i117 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
        final int i18 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: ub.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42869b;

            {
                this.f42869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42869b;
                switch (i18) {
                    case 0:
                        int i19 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.increase_amount_tv);
                    case 1:
                        int i110 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAmount);
                    case 2:
                        int i111 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivClose);
                    case 3:
                        int i112 = OcApplyLiteActivity.f29262C;
                        return (ImageView) ocApplyLiteActivity.findViewById(e.ivBack);
                    case 4:
                        int i113 = OcApplyLiteActivity.f29262C;
                        return (CardView) ocApplyLiteActivity.findViewById(e.loadingView);
                    case 5:
                        int i114 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_amount_tv);
                    case 6:
                        int i115 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvApply);
                    case 7:
                        int i116 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.tvAgreement);
                    case 8:
                        int i117 = OcApplyLiteActivity.f29262C;
                        return (AppCompatCheckBox) ocApplyLiteActivity.findViewById(e.checkboxAgreement);
                    default:
                        int i118 = OcApplyLiteActivity.f29262C;
                        return (TextView) ocApplyLiteActivity.findViewById(e.discount_payment_amount_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_activity_oc_apply_lite;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ARouter.getInstance().inject(this);
        requestLayoutFullScreen();
        org.greenrobot.eventbus.c.b().j(this);
        l lVar = ((OcApplyLiteViewModel) l()).f30689f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new C2086l(this, 1), 5));
        }
        l lVar2 = ((OcApplyLiteViewModel) l()).f30688e;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new C2086l(this, this), 5));
        }
        l lVar3 = ((OcApplyLiteViewModel) l()).f30690g;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new p141j9.t(this, this, 22), 5));
        }
        Object value = this.f29269g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((AppCompatCheckBox) value).setOnCheckedChangeListener(new A8.g(this, 14));
        Object value2 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42876b;

            {
                this.f42876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42876b;
                switch (i7) {
                    case 0:
                        int i10 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    case 1:
                        int i11 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    default:
                        int i12 = OcApplyLiteActivity.f29262C;
                        if (!Intrinsics.c(ocApplyLiteActivity.getIntent().getStringExtra("CORE_FROM"), "BasePreviewActivity")) {
                            ocApplyLiteActivity.showLoadingDialog(true);
                            OcApplyLiteViewModel ocApplyLiteViewModel = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            CLInitReq req = new CLInitReq("CASHIER_PAGE", "OK_CARD", ocApplyLiteActivity.f29264B, "", Boolean.FALSE, null, 32, null);
                            ocApplyLiteViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            f.s(ocApplyLiteViewModel, new m(req, null), ocApplyLiteViewModel.f30689f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            OcApplyLiteViewModel ocApplyLiteViewModel2 = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            ocApplyLiteViewModel2.getClass();
                            f.s(ocApplyLiteViewModel2, new n(1, null), ocApplyLiteViewModel2.f30690g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        }, (ImageView) value2);
        Object value3 = this.f29273p.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42876b;

            {
                this.f42876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42876b;
                switch (i10) {
                    case 0:
                        int i11 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    case 1:
                        int i12 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    default:
                        int i13 = OcApplyLiteActivity.f29262C;
                        if (!Intrinsics.c(ocApplyLiteActivity.getIntent().getStringExtra("CORE_FROM"), "BasePreviewActivity")) {
                            ocApplyLiteActivity.showLoadingDialog(true);
                            OcApplyLiteViewModel ocApplyLiteViewModel = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            CLInitReq req = new CLInitReq("CASHIER_PAGE", "OK_CARD", ocApplyLiteActivity.f29264B, "", Boolean.FALSE, null, 32, null);
                            ocApplyLiteViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            f.s(ocApplyLiteViewModel, new m(req, null), ocApplyLiteViewModel.f30689f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            OcApplyLiteViewModel ocApplyLiteViewModel2 = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            ocApplyLiteViewModel2.getClass();
                            f.s(ocApplyLiteViewModel2, new n(1, null), ocApplyLiteViewModel2.f30690g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        }, (ImageView) value3);
        Object value4 = this.f29267e.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyLiteActivity f42876b;

            {
                this.f42876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcApplyLiteActivity ocApplyLiteActivity = this.f42876b;
                switch (i11) {
                    case 0:
                        int i12 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    case 1:
                        int i13 = OcApplyLiteActivity.f29262C;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        ocApplyLiteActivity.finish();
                        break;
                    default:
                        int i14 = OcApplyLiteActivity.f29262C;
                        if (!Intrinsics.c(ocApplyLiteActivity.getIntent().getStringExtra("CORE_FROM"), "BasePreviewActivity")) {
                            ocApplyLiteActivity.showLoadingDialog(true);
                            OcApplyLiteViewModel ocApplyLiteViewModel = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            CLInitReq req = new CLInitReq("CASHIER_PAGE", "OK_CARD", ocApplyLiteActivity.f29264B, "", Boolean.FALSE, null, 32, null);
                            ocApplyLiteViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            f.s(ocApplyLiteViewModel, new m(req, null), ocApplyLiteViewModel.f30689f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            OcApplyLiteViewModel ocApplyLiteViewModel2 = (OcApplyLiteViewModel) ocApplyLiteActivity.l();
                            ocApplyLiteViewModel2.getClass();
                            f.s(ocApplyLiteViewModel2, new n(1, null), ocApplyLiteViewModel2.f30690g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        }, (TextView) value4);
        ArrayList arrayList = new ArrayList();
        ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and consented ");
        ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, "Flexi Terms & conditions, Privacy Policy");
        ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, "Flexi Cash Terms&Conditions");
        ApplyProtoContent applyProtoContent5 = new ApplyProtoContent(2, ",");
        ApplyProtoContent applyProtoContent6 = new ApplyProtoContent(3, "Loan Application agreement");
        arrayList.add(applyProtoContent);
        arrayList.add(applyProtoContent2);
        arrayList.add(applyProtoContent3);
        arrayList.add(applyProtoContent4);
        arrayList.add(applyProtoContent5);
        arrayList.add(applyProtoContent6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int length = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ApplyProtoContent applyProtoContent7 = (ApplyProtoContent) next;
            spannableStringBuilder.append((CharSequence) applyProtoContent7.content);
            Integer num = applyProtoContent7.clickType;
            if (num == null || num.intValue() != 0) {
                spannableStringBuilder.setSpan(new C0155w(3, this, applyProtoContent7), length, spannableStringBuilder.length(), 33);
            }
            length = spannableStringBuilder.length() - 1;
        }
        t tVar = this.f29268f;
        Object value5 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setText(spannableStringBuilder);
        Object value6 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setHighlightColor(getColor(p.transparent));
        Object value7 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setMovementMethod(LinkMovementMethod.getInstance());
        Object value8 = this.f29272o.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((TextView) value8).setText(r0.B(this.f29274v, false));
        Object value9 = this.f29271j.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((TextView) value9).setText(getString(Ya.g.cs_oc_up_to_amount, r0.F(1000000L)));
        Object value10 = this.f29270i.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        ((TextView) value10).setText(getString(Ya.g.cs_oc_up_to_amount, r0.F(100000L)));
        long j6 = this.f29275w;
        t tVar2 = this.f29266d;
        if (j6 <= 0) {
            Object value11 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            ((TextView) value11).setVisibility(8);
            return;
        }
        G.i("Get ").setForegroundColor(getResources().getColor(L6.b.ppColorTextPrimary)).append(r0.B(this.f29275w, false)).setForegroundColor(Color.parseColor("#38D79F")).append(" Off with Flexi Credit").setForegroundColor(getResources().getColor(L6.b.ppColorTextPrimary)).create();
        Object value12 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((TextView) value12).setText(r0.B(this.f29275w, true));
        Object value13 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((TextView) value13).setVisibility(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        showLoadingDialog(false);
        if (PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED.equalsIgnoreCase(pushMessage.content.messageType)) {
            p220oa.h.x(this, getString(Ya.g.cs_msg_apply_okcard_fail));
            finish();
        } else if (PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType)) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_ACTIVE_FINISH));
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        Object value = this.f29265c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        CardView cardView = (CardView) value;
        if (cardView != null) {
            p220oa.h.s(cardView, z3);
        }
    }
}

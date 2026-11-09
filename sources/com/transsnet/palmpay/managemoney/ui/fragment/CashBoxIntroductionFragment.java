package com.transsnet.palmpay.managemoney.ui.fragment;

import Qc.C0568i;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxIntroductionFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxIntroductionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxIntroductionFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxIntroductionFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,271:1\n171#2,12:272\n215#2:284\n260#2,10:285\n296#2:295\n171#2,12:296\n215#2:308\n*S KotlinDebug\n*F\n+ 1 CashBoxIntroductionFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxIntroductionFragment\n*L\n179#1:272,12\n179#1:284\n198#1:285,10\n198#1:295\n232#1:296,12\n232#1:308\n*E\n"})
public final class CashBoxIntroductionFragment extends BaseMvvmFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f32374H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32376B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32377C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32378j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32380p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32382w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxIntroductionFragment newInstance() {
            return new CashBoxIntroductionFragment();
        }

        private a() {
        }
    }

    public CashBoxIntroductionFragment() {
        final int i7 = 0;
        this.f32378j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i7) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32379o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i10) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32380p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i11) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i12) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f32381v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i13) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f32382w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i14) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f32375A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i15) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f32376B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i16) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
        final int i17 = 8;
        this.f32377C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxIntroductionFragment f32629b;

            {
                this.f32629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32629b;
                switch (i17) {
                    case 0:
                        CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                        View view = cashBoxIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSaveNow);
                        }
                        return null;
                    case 1:
                        CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                        View view2 = cashBoxIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (LinearLayout) view2.findViewById(Jc.c.layoutBottom);
                        }
                        return null;
                    case 2:
                        CashBoxIntroductionFragment.a aVar3 = CashBoxIntroductionFragment.f32374H;
                        View view3 = cashBoxIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(Jc.c.ivheaderBanner);
                        }
                        return null;
                    case 3:
                        CashBoxIntroductionFragment.a aVar4 = CashBoxIntroductionFragment.f32374H;
                        View view4 = cashBoxIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(Jc.c.ivBanner);
                        }
                        return null;
                    case 4:
                        CashBoxIntroductionFragment.a aVar5 = CashBoxIntroductionFragment.f32374H;
                        View view5 = cashBoxIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (NestedScrollView) view5.findViewById(Jc.c.nsv);
                        }
                        return null;
                    case 5:
                        CashBoxIntroductionFragment.a aVar6 = CashBoxIntroductionFragment.f32374H;
                        View view6 = cashBoxIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (PpTitleBar) view6.findViewById(Jc.c.mtb);
                        }
                        return null;
                    case 6:
                        CashBoxIntroductionFragment.a aVar7 = CashBoxIntroductionFragment.f32374H;
                        return (TextView) cashBoxIntroductionFragment.f27318b.findViewById(Jc.c.tvAgreementContent);
                    case 7:
                        CashBoxIntroductionFragment.a aVar8 = CashBoxIntroductionFragment.f32374H;
                        View view7 = cashBoxIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (CheckBox) view7.findViewById(Jc.c.ckProtocol);
                        }
                        return null;
                    default:
                        CashBoxIntroductionFragment.a aVar9 = CashBoxIntroductionFragment.f32374H;
                        View view8 = cashBoxIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (AppCompatImageView) view8.findViewById(Jc.c.ivCheckAgreement);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_cash_box_introduction_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel != null ? cashBoxViewModel.f32743e : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1590l(this, this, 0), 18));
        }
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = cashBoxViewModel2 != null ? cashBoxViewModel2.f32746i : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1590l(this, this, 2), 18));
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = cashBoxViewModel3 != null ? cashBoxViewModel3.f32761x0 : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1590l(this, this, 1), 18));
        }
        androidx.fragment.app.E activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity");
        ((CashBoxMainActivity) activity).f32041c = true;
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        CashBoxViewModel cashBoxViewModel;
        String stringExtra;
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel2 != null) {
            p140j8.f.s(cashBoxViewModel2, new Qc.B(1, null), cashBoxViewModel2.f32743e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        androidx.fragment.app.E activity = getActivity();
        if (activity == null || !(activity instanceof CashBoxMainActivity)) {
            return;
        }
        Intent intent = ((CashBoxMainActivity) activity).getIntent();
        if (!Intrinsics.c((intent == null || (stringExtra = intent.getStringExtra("business")) == null) ? null : Boolean.valueOf(stringExtra.equals("CashCoupon")), Boolean.TRUE) || (cashBoxViewModel = (CashBoxViewModel) this.f27333i) == null) {
            return;
        }
        p140j8.f.s(cashBoxViewModel, new C0568i(Boolean.FALSE, null), cashBoxViewModel.f32761x0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Pa.n0.g().v("CashBox_New_View");
        p355xf.t tVar = this.f32382w;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
            ViewGroup.LayoutParams layoutParams = ppTitleBar2 != null ? ppTitleBar2.getLayoutParams() : null;
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = BarUtils.getStatusBarHeight();
            ppTitleBar.setLayoutParams(layoutParams2);
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            final int i7 = 1;
            ppTitleBar3.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxIntroductionFragment f32632b;

                {
                    this.f32632b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32632b;
                    switch (i7) {
                        case 0:
                            CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                            Pa.n0.g().l("PalmPay_CashBoxNew_SaveNow_Click");
                            CheckBox checkBox = (CheckBox) cashBoxIntroductionFragment.f32376B.getValue();
                            if (checkBox != null && checkBox.isChecked()) {
                                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxIntroductionFragment.f27333i;
                                if (cashBoxViewModel != null) {
                                    p140j8.f.s(cashBoxViewModel, new Qc.G(1, null), cashBoxViewModel.f32746i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            } else {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) cashBoxIntroductionFragment.f32377C.getValue();
                                if (appCompatImageView != null) {
                                    appCompatImageView.setVisibility(0);
                                }
                            }
                            break;
                        default:
                            CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                            androidx.fragment.app.E activity = cashBoxIntroductionFragment.getActivity();
                            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity");
                            ((CashBoxMainActivity) activity).onBackPressed();
                            break;
                    }
                }
            });
        }
        CheckBox checkBox = (CheckBox) this.f32376B.getValue();
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new A8.g(this, 10));
        }
        PpTitleBar ppTitleBar4 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar4 != null) {
            ppTitleBar4.c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f32378j.getValue();
        if (roundedTextView != null) {
            final int i10 = 0;
            roundedTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxIntroductionFragment f32632b;

                {
                    this.f32632b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CashBoxIntroductionFragment cashBoxIntroductionFragment = this.f32632b;
                    switch (i10) {
                        case 0:
                            CashBoxIntroductionFragment.a aVar = CashBoxIntroductionFragment.f32374H;
                            Pa.n0.g().l("PalmPay_CashBoxNew_SaveNow_Click");
                            CheckBox checkBox2 = (CheckBox) cashBoxIntroductionFragment.f32376B.getValue();
                            if (checkBox2 != null && checkBox2.isChecked()) {
                                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxIntroductionFragment.f27333i;
                                if (cashBoxViewModel != null) {
                                    p140j8.f.s(cashBoxViewModel, new Qc.G(1, null), cashBoxViewModel.f32746i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            } else {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) cashBoxIntroductionFragment.f32377C.getValue();
                                if (appCompatImageView != null) {
                                    appCompatImageView.setVisibility(0);
                                }
                            }
                            break;
                        default:
                            CashBoxIntroductionFragment.a aVar2 = CashBoxIntroductionFragment.f32374H;
                            androidx.fragment.app.E activity = cashBoxIntroductionFragment.getActivity();
                            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity");
                            ((CashBoxMainActivity) activity).onBackPressed();
                            break;
                    }
                }
            });
        }
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, requireContext());
        p355xf.t tVar2 = this.f32375A;
        TextView textView = (TextView) tVar2.getValue();
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView2 = (TextView) tVar2.getValue();
        if (textView2 != null) {
            textView2.setText(C0.G.i("I agree to").appendSpace(SizeUtils.dp2px(2.0f)).append("Terms & Conditions").setForegroundColor(iColorInt).setClickSpan(new C1591m(this, 0)).appendSpace(SizeUtils.dp2px(2.0f)).append("and").appendSpace(SizeUtils.dp2px(2.0f)).append("Privacy Policy").setForegroundColor(iColorInt).setClickSpan(new C1591m(this, 1)).appendSpace(SizeUtils.dp2px(2.0f)).append("to open a CashBox account. I also agree to the CashBox").appendSpace(SizeUtils.dp2px(2.0f)).append("Auto Save Agreement").setForegroundColor(iColorInt).setClickSpan(new C1591m(this, 2)).appendSpace(SizeUtils.dp2px(2.0f)).append("to enable Auto Save.").create());
        }
        super.o();
        return 0;
    }
}

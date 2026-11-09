package com.transsnet.palmpay.credit.ui.fragment.cashloan;

import Ab.w;
import Ab.x;
import Pa.i0;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradePendingFragment;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentUpGradePendingFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "Lgb/a;", "<init>", "()V", "a", "Ab/w", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLInstallmentUpGradePendingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLInstallmentUpGradePendingFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentUpGradePendingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1869#2,2:224\n*S KotlinDebug\n*F\n+ 1 CLInstallmentUpGradePendingFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentUpGradePendingFragment\n*L\n73#1:224,2\n*E\n"})
public final class CLInstallmentUpGradePendingFragment extends BaseMvvmVBFragment<OcEmptyViewModel, p099gb.a> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f30592L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30593A;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30596H;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30598p;
    public x t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30597o = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f30599v = C1850q.i("https://static.chuanyinet.com/images/loan_apply_result_instruction_1115ad4a9-7190-4d.webp", "https://static.chuanyinet.com/images/loan_apply_result_instruction_2601ab27d-3b45-4a.webp");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f30600w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f30594B = 10;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Handler f30595C = new Handler(Looper.getMainLooper());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLInstallmentUpGradePendingFragment newInstance() {
            Bundle bundle = new Bundle();
            CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment = new CLInstallmentUpGradePendingFragment();
            cLInstallmentUpGradePendingFragment.setArguments(bundle);
            return cLInstallmentUpGradePendingFragment;
        }

        private a() {
        }
    }

    public CLInstallmentUpGradePendingFragment() {
        final int i7 = 0;
        this.f30593A = C2131j.b(new Function0(this) { // from class: Ab.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradePendingFragment f143b;

            {
                this.f143b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment = this.f143b;
                switch (i7) {
                    case 0:
                        CLInstallmentUpGradePendingFragment.a aVar = CLInstallmentUpGradePendingFragment.f30592L;
                        final int i10 = 1;
                        return new Runnable() { // from class: Ab.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment2 = cLInstallmentUpGradePendingFragment;
                                switch (i10) {
                                    case 0:
                                        CLInstallmentUpGradePendingFragment.a aVar2 = CLInstallmentUpGradePendingFragment.f30592L;
                                        if (i0.W(cLInstallmentUpGradePendingFragment2.getActivity()) && !cLInstallmentUpGradePendingFragment2.isDetached() && cLInstallmentUpGradePendingFragment2.isAdded()) {
                                            p099gb.a aVar3 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar3 != null) {
                                                aVar3.f37041c.setText(new SpanUtils().append(String.valueOf(cLInstallmentUpGradePendingFragment2.f30594B)).append("S").setFontSize(24, true).create());
                                            }
                                            p099gb.a aVar4 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar4 != null) {
                                                aVar4.f37047j.b(cLInstallmentUpGradePendingFragment2.f30594B, 10);
                                            }
                                            int i11 = cLInstallmentUpGradePendingFragment2.f30594B;
                                            if (i11 != 0 && i11 != 1) {
                                                switch (i11) {
                                                    case 7:
                                                        p099gb.a aVar5 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar5 != null) {
                                                            aVar5.f37043e.setText(Ya.g.cs_oc_finalising_your_loan_amount_caculation);
                                                        }
                                                        break;
                                                    case 8:
                                                        p099gb.a aVar6 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar6 != null) {
                                                            aVar6.f37043e.setText(Ya.g.cs_oc_building_your_credit_profile);
                                                        }
                                                        break;
                                                    case 9:
                                                        p099gb.a aVar7 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar7 != null) {
                                                            aVar7.f37043e.setText(Ya.g.cs_oc_gathering_your_credit_history_data);
                                                        }
                                                        break;
                                                    case 10:
                                                        p099gb.a aVar8 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar8 != null) {
                                                            aVar8.f37042d.setVisibility(0);
                                                        }
                                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                                        rotateAnimation.setDuration(1000L);
                                                        rotateAnimation.setRepeatCount(-1);
                                                        rotateAnimation.setInterpolator(new LinearInterpolator());
                                                        p099gb.a aVar9 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar9 != null) {
                                                            aVar9.f37042d.startAnimation(rotateAnimation);
                                                        }
                                                        break;
                                                }
                                            } else {
                                                p099gb.a aVar10 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar10 != null) {
                                                    aVar10.f37040b.setText(cLInstallmentUpGradePendingFragment2.getString(Ya.g.cs_oc_unstable_network));
                                                }
                                            }
                                            int i12 = cLInstallmentUpGradePendingFragment2.f30594B - 1;
                                            cLInstallmentUpGradePendingFragment2.f30594B = i12;
                                            if (i12 >= 0) {
                                                cLInstallmentUpGradePendingFragment2.f30595C.postDelayed((Runnable) cLInstallmentUpGradePendingFragment2.f30596H.getValue(), 1000L);
                                            } else {
                                                p099gb.a aVar11 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar11 != null) {
                                                    aVar11.f37041c.setText((CharSequence) null);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        CLInstallmentUpGradePendingFragment.a aVar12 = CLInstallmentUpGradePendingFragment.f30592L;
                                        p099gb.a aVar13 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                        if (aVar13 != null) {
                                            ViewPager2 viewPager2 = aVar13.f37046i;
                                            ArrayList arrayList = cLInstallmentUpGradePendingFragment2.f30599v;
                                            if (arrayList.size() > 1) {
                                                viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % arrayList.size(), true);
                                                cLInstallmentUpGradePendingFragment2.u();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        CLInstallmentUpGradePendingFragment.a aVar2 = CLInstallmentUpGradePendingFragment.f30592L;
                        final int i11 = 0;
                        return new Runnable() { // from class: Ab.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment2 = cLInstallmentUpGradePendingFragment;
                                switch (i11) {
                                    case 0:
                                        CLInstallmentUpGradePendingFragment.a aVar3 = CLInstallmentUpGradePendingFragment.f30592L;
                                        if (i0.W(cLInstallmentUpGradePendingFragment2.getActivity()) && !cLInstallmentUpGradePendingFragment2.isDetached() && cLInstallmentUpGradePendingFragment2.isAdded()) {
                                            p099gb.a aVar4 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar4 != null) {
                                                aVar4.f37041c.setText(new SpanUtils().append(String.valueOf(cLInstallmentUpGradePendingFragment2.f30594B)).append("S").setFontSize(24, true).create());
                                            }
                                            p099gb.a aVar5 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar5 != null) {
                                                aVar5.f37047j.b(cLInstallmentUpGradePendingFragment2.f30594B, 10);
                                            }
                                            int i12 = cLInstallmentUpGradePendingFragment2.f30594B;
                                            if (i12 != 0 && i12 != 1) {
                                                switch (i12) {
                                                    case 7:
                                                        p099gb.a aVar6 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar6 != null) {
                                                            aVar6.f37043e.setText(Ya.g.cs_oc_finalising_your_loan_amount_caculation);
                                                        }
                                                        break;
                                                    case 8:
                                                        p099gb.a aVar7 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar7 != null) {
                                                            aVar7.f37043e.setText(Ya.g.cs_oc_building_your_credit_profile);
                                                        }
                                                        break;
                                                    case 9:
                                                        p099gb.a aVar8 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar8 != null) {
                                                            aVar8.f37043e.setText(Ya.g.cs_oc_gathering_your_credit_history_data);
                                                        }
                                                        break;
                                                    case 10:
                                                        p099gb.a aVar9 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar9 != null) {
                                                            aVar9.f37042d.setVisibility(0);
                                                        }
                                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                                        rotateAnimation.setDuration(1000L);
                                                        rotateAnimation.setRepeatCount(-1);
                                                        rotateAnimation.setInterpolator(new LinearInterpolator());
                                                        p099gb.a aVar10 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar10 != null) {
                                                            aVar10.f37042d.startAnimation(rotateAnimation);
                                                        }
                                                        break;
                                                }
                                            } else {
                                                p099gb.a aVar11 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar11 != null) {
                                                    aVar11.f37040b.setText(cLInstallmentUpGradePendingFragment2.getString(Ya.g.cs_oc_unstable_network));
                                                }
                                            }
                                            int i13 = cLInstallmentUpGradePendingFragment2.f30594B - 1;
                                            cLInstallmentUpGradePendingFragment2.f30594B = i13;
                                            if (i13 >= 0) {
                                                cLInstallmentUpGradePendingFragment2.f30595C.postDelayed((Runnable) cLInstallmentUpGradePendingFragment2.f30596H.getValue(), 1000L);
                                            } else {
                                                p099gb.a aVar12 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar12 != null) {
                                                    aVar12.f37041c.setText((CharSequence) null);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        CLInstallmentUpGradePendingFragment.a aVar13 = CLInstallmentUpGradePendingFragment.f30592L;
                                        p099gb.a aVar14 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                        if (aVar14 != null) {
                                            ViewPager2 viewPager2 = aVar14.f37046i;
                                            ArrayList arrayList = cLInstallmentUpGradePendingFragment2.f30599v;
                                            if (arrayList.size() > 1) {
                                                viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % arrayList.size(), true);
                                                cLInstallmentUpGradePendingFragment2.u();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        final int i10 = 1;
        this.f30596H = C2131j.b(new Function0(this) { // from class: Ab.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentUpGradePendingFragment f143b;

            {
                this.f143b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment = this.f143b;
                switch (i10) {
                    case 0:
                        CLInstallmentUpGradePendingFragment.a aVar = CLInstallmentUpGradePendingFragment.f30592L;
                        final int i11 = 1;
                        return new Runnable() { // from class: Ab.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment2 = cLInstallmentUpGradePendingFragment;
                                switch (i11) {
                                    case 0:
                                        CLInstallmentUpGradePendingFragment.a aVar3 = CLInstallmentUpGradePendingFragment.f30592L;
                                        if (i0.W(cLInstallmentUpGradePendingFragment2.getActivity()) && !cLInstallmentUpGradePendingFragment2.isDetached() && cLInstallmentUpGradePendingFragment2.isAdded()) {
                                            p099gb.a aVar4 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar4 != null) {
                                                aVar4.f37041c.setText(new SpanUtils().append(String.valueOf(cLInstallmentUpGradePendingFragment2.f30594B)).append("S").setFontSize(24, true).create());
                                            }
                                            p099gb.a aVar5 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar5 != null) {
                                                aVar5.f37047j.b(cLInstallmentUpGradePendingFragment2.f30594B, 10);
                                            }
                                            int i12 = cLInstallmentUpGradePendingFragment2.f30594B;
                                            if (i12 != 0 && i12 != 1) {
                                                switch (i12) {
                                                    case 7:
                                                        p099gb.a aVar6 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar6 != null) {
                                                            aVar6.f37043e.setText(Ya.g.cs_oc_finalising_your_loan_amount_caculation);
                                                        }
                                                        break;
                                                    case 8:
                                                        p099gb.a aVar7 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar7 != null) {
                                                            aVar7.f37043e.setText(Ya.g.cs_oc_building_your_credit_profile);
                                                        }
                                                        break;
                                                    case 9:
                                                        p099gb.a aVar8 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar8 != null) {
                                                            aVar8.f37043e.setText(Ya.g.cs_oc_gathering_your_credit_history_data);
                                                        }
                                                        break;
                                                    case 10:
                                                        p099gb.a aVar9 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar9 != null) {
                                                            aVar9.f37042d.setVisibility(0);
                                                        }
                                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                                        rotateAnimation.setDuration(1000L);
                                                        rotateAnimation.setRepeatCount(-1);
                                                        rotateAnimation.setInterpolator(new LinearInterpolator());
                                                        p099gb.a aVar10 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar10 != null) {
                                                            aVar10.f37042d.startAnimation(rotateAnimation);
                                                        }
                                                        break;
                                                }
                                            } else {
                                                p099gb.a aVar11 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar11 != null) {
                                                    aVar11.f37040b.setText(cLInstallmentUpGradePendingFragment2.getString(Ya.g.cs_oc_unstable_network));
                                                }
                                            }
                                            int i13 = cLInstallmentUpGradePendingFragment2.f30594B - 1;
                                            cLInstallmentUpGradePendingFragment2.f30594B = i13;
                                            if (i13 >= 0) {
                                                cLInstallmentUpGradePendingFragment2.f30595C.postDelayed((Runnable) cLInstallmentUpGradePendingFragment2.f30596H.getValue(), 1000L);
                                            } else {
                                                p099gb.a aVar12 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar12 != null) {
                                                    aVar12.f37041c.setText((CharSequence) null);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        CLInstallmentUpGradePendingFragment.a aVar13 = CLInstallmentUpGradePendingFragment.f30592L;
                                        p099gb.a aVar14 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                        if (aVar14 != null) {
                                            ViewPager2 viewPager2 = aVar14.f37046i;
                                            ArrayList arrayList = cLInstallmentUpGradePendingFragment2.f30599v;
                                            if (arrayList.size() > 1) {
                                                viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % arrayList.size(), true);
                                                cLInstallmentUpGradePendingFragment2.u();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        CLInstallmentUpGradePendingFragment.a aVar2 = CLInstallmentUpGradePendingFragment.f30592L;
                        final int i12 = 0;
                        return new Runnable() { // from class: Ab.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment2 = cLInstallmentUpGradePendingFragment;
                                switch (i12) {
                                    case 0:
                                        CLInstallmentUpGradePendingFragment.a aVar3 = CLInstallmentUpGradePendingFragment.f30592L;
                                        if (i0.W(cLInstallmentUpGradePendingFragment2.getActivity()) && !cLInstallmentUpGradePendingFragment2.isDetached() && cLInstallmentUpGradePendingFragment2.isAdded()) {
                                            p099gb.a aVar4 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar4 != null) {
                                                aVar4.f37041c.setText(new SpanUtils().append(String.valueOf(cLInstallmentUpGradePendingFragment2.f30594B)).append("S").setFontSize(24, true).create());
                                            }
                                            p099gb.a aVar5 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                            if (aVar5 != null) {
                                                aVar5.f37047j.b(cLInstallmentUpGradePendingFragment2.f30594B, 10);
                                            }
                                            int i13 = cLInstallmentUpGradePendingFragment2.f30594B;
                                            if (i13 != 0 && i13 != 1) {
                                                switch (i13) {
                                                    case 7:
                                                        p099gb.a aVar6 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar6 != null) {
                                                            aVar6.f37043e.setText(Ya.g.cs_oc_finalising_your_loan_amount_caculation);
                                                        }
                                                        break;
                                                    case 8:
                                                        p099gb.a aVar7 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar7 != null) {
                                                            aVar7.f37043e.setText(Ya.g.cs_oc_building_your_credit_profile);
                                                        }
                                                        break;
                                                    case 9:
                                                        p099gb.a aVar8 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar8 != null) {
                                                            aVar8.f37043e.setText(Ya.g.cs_oc_gathering_your_credit_history_data);
                                                        }
                                                        break;
                                                    case 10:
                                                        p099gb.a aVar9 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar9 != null) {
                                                            aVar9.f37042d.setVisibility(0);
                                                        }
                                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                                        rotateAnimation.setDuration(1000L);
                                                        rotateAnimation.setRepeatCount(-1);
                                                        rotateAnimation.setInterpolator(new LinearInterpolator());
                                                        p099gb.a aVar10 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                        if (aVar10 != null) {
                                                            aVar10.f37042d.startAnimation(rotateAnimation);
                                                        }
                                                        break;
                                                }
                                            } else {
                                                p099gb.a aVar11 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar11 != null) {
                                                    aVar11.f37040b.setText(cLInstallmentUpGradePendingFragment2.getString(Ya.g.cs_oc_unstable_network));
                                                }
                                            }
                                            int i14 = cLInstallmentUpGradePendingFragment2.f30594B - 1;
                                            cLInstallmentUpGradePendingFragment2.f30594B = i14;
                                            if (i14 >= 0) {
                                                cLInstallmentUpGradePendingFragment2.f30595C.postDelayed((Runnable) cLInstallmentUpGradePendingFragment2.f30596H.getValue(), 1000L);
                                            } else {
                                                p099gb.a aVar12 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                                if (aVar12 != null) {
                                                    aVar12.f37041c.setText((CharSequence) null);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        CLInstallmentUpGradePendingFragment.a aVar13 = CLInstallmentUpGradePendingFragment.f30592L;
                                        p099gb.a aVar14 = (p099gb.a) cLInstallmentUpGradePendingFragment2.f27335j;
                                        if (aVar14 != null) {
                                            ViewPager2 viewPager2 = aVar14.f37046i;
                                            ArrayList arrayList = cLInstallmentUpGradePendingFragment2.f30599v;
                                            if (arrayList.size() > 1) {
                                                viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % arrayList.size(), true);
                                                cLInstallmentUpGradePendingFragment2.u();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Iterator it = this.f30599v.iterator();
        while (it.hasNext()) {
            r0.D1(getActivity(), (String) it.next());
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        if (this.f30597o) {
            this.f30597o = false;
            this.f30595C.post((Runnable) this.f30596H.getValue());
            p099gb.a aVar = (p099gb.a) this.f27335j;
            if (aVar != null) {
                ViewPager2 viewPager2 = aVar.f37046i;
                if (!this.f30598p) {
                    viewPager2.setAdapter(new w(this.f30599v));
                    viewPager2.setOffscreenPageLimit(1);
                    x xVar = new x(this);
                    viewPager2.registerOnPageChangeCallback(xVar);
                    this.t = xVar;
                    v(viewPager2.getCurrentItem());
                    this.f30598p = true;
                }
                u();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f30595C.removeCallbacks((Runnable) this.f30596H.getValue());
        super.onDestroy();
        p099gb.a aVar = (p099gb.a) this.f27335j;
        if (aVar != null) {
            ViewPager2 viewPager2 = aVar.f37046i;
            x xVar = this.t;
            if (xVar != null) {
                viewPager2.unregisterOnPageChangeCallback(xVar);
            }
        }
        this.f30600w.removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        View viewM2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(f.cs_cl_install_upgrade_pending_result_layout, viewGroup, false);
        int i7 = e.apply_pending_ll;
        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.countdown_tips_tv;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = e.countdown_tv;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = e.pending_first_start_iv;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = e.pending_first_tips_tv;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null && (viewM = p059e1.a.m((i7 = e.pending_risk_dot_first), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = e.pending_risk_dot_second), viewInflate)) != null) {
                            i7 = e.pending_risk_indicator_ll;
                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.pending_risk_vp;
                                ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i7, viewInflate);
                                if (viewPager2 != null) {
                                    i7 = e.progressBar;
                                    CircleProgressView circleProgressView = (CircleProgressView) p059e1.a.m(i7, viewInflate);
                                    if (circleProgressView != null) {
                                        p099gb.a aVar = new p099gb.a((LinearLayout) viewInflate, textView, textView2, imageView, textView3, viewM, viewM2, viewPager2, circleProgressView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u() {
        if (this.f30599v.size() <= 1) {
            return;
        }
        Handler handler = this.f30600w;
        t tVar = this.f30593A;
        handler.removeCallbacks((Runnable) tVar.getValue());
        handler.postDelayed((Runnable) tVar.getValue(), 5000L);
    }

    public final void v(int i7) {
        boolean z3 = i7 % this.f30599v.size() == 0;
        p099gb.a aVar = (p099gb.a) this.f27335j;
        if (aVar != null) {
            aVar.f37044f.setBackgroundResource(z3 ? d.cs_cl_pending_dot_selected_bg : d.cs_cl_pending_dot_unselected_bg);
        }
        p099gb.a aVar2 = (p099gb.a) this.f27335j;
        if (aVar2 != null) {
            aVar2.f37045g.setBackgroundResource(z3 ? d.cs_cl_pending_dot_unselected_bg : d.cs_cl_pending_dot_selected_bg);
        }
    }
}

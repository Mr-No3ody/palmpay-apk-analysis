package com.transsnet.palmpay.managemoney.ui.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C1161a;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.viewmodel.NewUserIntroductionViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/new_user_introduction_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/NewUserIntroductionFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/NewUserIntroductionViewModel;", "<init>", "()V", "a", "Ic/a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewUserIntroductionFragment extends BaseMvvmFragment<NewUserIntroductionViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f32487L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32488A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32489B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32490C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32491H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32492j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32494p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32496w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NewUserIntroductionFragment newInstance(int i7) {
            NewUserIntroductionFragment newUserIntroductionFragment = new NewUserIntroductionFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("identity_type", i7);
            newUserIntroductionFragment.setArguments(bundle);
            return newUserIntroductionFragment;
        }

        private a() {
        }
    }

    public NewUserIntroductionFragment() {
        final int i7 = 4;
        this.f32492j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i7) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i10 = 5;
        this.f32493o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i10) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i11 = 6;
        this.f32494p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i11) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i12 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i12) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i13 = 8;
        this.f32495v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i13) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i14 = 9;
        this.f32496w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i14) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i15 = 0;
        this.f32488A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i15) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i16 = 1;
        this.f32489B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i16) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i17 = 2;
        this.f32490C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i17) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
        final int i18 = 3;
        this.f32491H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserIntroductionFragment f32545b;

            {
                this.f32545b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserIntroductionFragment newUserIntroductionFragment = this.f32545b;
                switch (i18) {
                    case 0:
                        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                        View view = newUserIntroductionFragment.f27318b;
                        if (view != null) {
                            return (RoundedTextView) view.findViewById(Jc.c.rtvSignIn);
                        }
                        return null;
                    case 1:
                        NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                        View view2 = newUserIntroductionFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(Jc.c.tvSkip);
                        }
                        return null;
                    case 2:
                        NewUserIntroductionFragment.a aVar3 = NewUserIntroductionFragment.f32487L;
                        View view3 = newUserIntroductionFragment.f27318b;
                        if (view3 != null) {
                            return (RadioGroup) view3.findViewById(Jc.c.rgIndicator);
                        }
                        return null;
                    case 3:
                        NewUserIntroductionFragment.a aVar4 = NewUserIntroductionFragment.f32487L;
                        View view4 = newUserIntroductionFragment.f27318b;
                        if (view4 != null) {
                            return (ViewPager) view4.findViewById(Jc.c.viewPager);
                        }
                        return null;
                    case 4:
                        NewUserIntroductionFragment.a aVar5 = NewUserIntroductionFragment.f32487L;
                        View view5 = newUserIntroductionFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(Jc.c.tvDesc);
                        }
                        return null;
                    case 5:
                        NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                        View view6 = newUserIntroductionFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(Jc.c.tvTitle);
                        }
                        return null;
                    case 6:
                        NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                        View view7 = newUserIntroductionFragment.f27318b;
                        if (view7 != null) {
                            return (AppCompatImageView) view7.findViewById(Jc.c.ivLoading);
                        }
                        return null;
                    case 7:
                        NewUserIntroductionFragment.a aVar8 = NewUserIntroductionFragment.f32487L;
                        View view8 = newUserIntroductionFragment.f27318b;
                        if (view8 != null) {
                            return (RoundedTextView) view8.findViewById(Jc.c.rtvNext);
                        }
                        return null;
                    case 8:
                        NewUserIntroductionFragment.a aVar9 = NewUserIntroductionFragment.f32487L;
                        View view9 = newUserIntroductionFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(Jc.c.groupUnLogin);
                        }
                        return null;
                    default:
                        NewUserIntroductionFragment.a aVar10 = NewUserIntroductionFragment.f32487L;
                        View view10 = newUserIntroductionFragment.f27318b;
                        if (view10 != null) {
                            return (RoundedTextView) view10.findViewById(Jc.c.rtvCreateAccount);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_new_user_introduction_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        p059e1.a.X("new_user_introduction", false);
        ArrayList arrayList = new ArrayList();
        int i7 = Jc.b.mm_icon_loading_page_1;
        String string = getResources().getString(Jc.f.mm_loading_first_page_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getResources().getString(Jc.f.mm_loading_first_page_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(t(i7, string, string2));
        int i10 = Jc.b.mm_icon_loading_page_2;
        String string3 = getResources().getString(Jc.f.mm_loading_second_page_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getResources().getString(Jc.f.mm_loading_second_page_desc);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(t(i10, string3, string4));
        int i11 = Jc.b.mm_icon_loading_page_3;
        String string5 = getResources().getString(Jc.f.mm_loading_third_page_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getResources().getString(Jc.f.mm_loading_third_page_desc);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(t(i11, string5, string6));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            RadioGroup radioGroup = (RadioGroup) this.f32490C.getValue();
            if (radioGroup != null) {
                RadioButton radioButton = new RadioButton(requireContext());
                radioButton.setId(i12);
                radioButton.setBackgroundResource(Jc.b.mm_bg_loading_indicator);
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setChecked(i12 == 0);
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(DensityUtil.dp2px(8.0f), DensityUtil.dp2px(8.0f)));
                radioGroup.addView(radioButton);
            }
            i12++;
        }
        ViewPager viewPager = (ViewPager) this.f32491H.getValue();
        if (viewPager != null) {
            viewPager.setAdapter(new Ic.a(arrayList));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        final int i7 = arguments != null ? arguments.getInt("identity_type", 1) : 1;
        Group group = (Group) this.f32495v.getValue();
        if (group != null) {
            group.setVisibility(BaseApplication.hasLogin() ? 8 : 0);
        }
        p355xf.t tVar = this.t;
        RoundedTextView roundedTextView = (RoundedTextView) tVar.getValue();
        if (roundedTextView != null) {
            roundedTextView.setVisibility(BaseApplication.hasLogin() ? 0 : 8);
        }
        p355xf.t tVar2 = this.f32491H;
        ViewPager viewPager = (ViewPager) tVar2.getValue();
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
        }
        ViewPager viewPager2 = (ViewPager) tVar2.getValue();
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new U(this));
        }
        RoundedTextView roundedTextView2 = (RoundedTextView) this.f32488A.getValue();
        if (roundedTextView2 != null) {
            roundedTextView2.setOnClickListener(new ViewOnClickListenerC1478l(23));
        }
        RoundedTextView roundedTextView3 = (RoundedTextView) this.f32496w.getValue();
        if (roundedTextView3 != null) {
            roundedTextView3.setOnClickListener(new ViewOnClickListenerC1478l(24));
        }
        RoundedTextView roundedTextView4 = (RoundedTextView) tVar.getValue();
        if (roundedTextView4 != null) {
            final int i10 = 0;
            roundedTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.T

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NewUserIntroductionFragment f32547b;

                {
                    this.f32547b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = i7;
                    NewUserIntroductionFragment newUserIntroductionFragment = this.f32547b;
                    switch (i10) {
                        case 0:
                            NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                            ViewPager viewPager3 = (ViewPager) newUserIntroductionFragment.f32491H.getValue();
                            if (viewPager3 != null) {
                                if (viewPager3.getCurrentItem() >= viewPager3.getChildCount() - 1) {
                                    androidx.fragment.app.E activity = newUserIntroductionFragment.getActivity();
                                    if (activity != null) {
                                        UserFixedSavingActivity userFixedSavingActivity = (UserFixedSavingActivity) activity;
                                        androidx.fragment.app.Z supportFragmentManager = userFixedSavingActivity.getSupportFragmentManager();
                                        supportFragmentManager.getClass();
                                        C1161a c1161a = new C1161a(supportFragmentManager);
                                        c1161a.m(newUserIntroductionFragment);
                                        c1161a.h(true);
                                        int i12 = UserFixedSavingActivity.f32209g;
                                        userFixedSavingActivity.n(i11);
                                    }
                                } else {
                                    viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
                                }
                            }
                            break;
                        default:
                            NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                            androidx.fragment.app.E activity2 = newUserIntroductionFragment.getActivity();
                            if (activity2 != null) {
                                UserFixedSavingActivity userFixedSavingActivity2 = (UserFixedSavingActivity) activity2;
                                androidx.fragment.app.Z supportFragmentManager2 = userFixedSavingActivity2.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                C1161a c1161a2 = new C1161a(supportFragmentManager2);
                                c1161a2.m(newUserIntroductionFragment);
                                c1161a2.h(true);
                                int i13 = UserFixedSavingActivity.f32209g;
                                userFixedSavingActivity2.n(i11);
                            }
                            break;
                    }
                }
            });
        }
        TextView textView = (TextView) this.f32489B.getValue();
        if (textView != null) {
            final int i11 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.T

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NewUserIntroductionFragment f32547b;

                {
                    this.f32547b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i7;
                    NewUserIntroductionFragment newUserIntroductionFragment = this.f32547b;
                    switch (i11) {
                        case 0:
                            NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
                            ViewPager viewPager3 = (ViewPager) newUserIntroductionFragment.f32491H.getValue();
                            if (viewPager3 != null) {
                                if (viewPager3.getCurrentItem() >= viewPager3.getChildCount() - 1) {
                                    androidx.fragment.app.E activity = newUserIntroductionFragment.getActivity();
                                    if (activity != null) {
                                        UserFixedSavingActivity userFixedSavingActivity = (UserFixedSavingActivity) activity;
                                        androidx.fragment.app.Z supportFragmentManager = userFixedSavingActivity.getSupportFragmentManager();
                                        supportFragmentManager.getClass();
                                        C1161a c1161a = new C1161a(supportFragmentManager);
                                        c1161a.m(newUserIntroductionFragment);
                                        c1161a.h(true);
                                        int i13 = UserFixedSavingActivity.f32209g;
                                        userFixedSavingActivity.n(i12);
                                    }
                                } else {
                                    viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
                                }
                            }
                            break;
                        default:
                            NewUserIntroductionFragment.a aVar2 = NewUserIntroductionFragment.f32487L;
                            androidx.fragment.app.E activity2 = newUserIntroductionFragment.getActivity();
                            if (activity2 != null) {
                                UserFixedSavingActivity userFixedSavingActivity2 = (UserFixedSavingActivity) activity2;
                                androidx.fragment.app.Z supportFragmentManager2 = userFixedSavingActivity2.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                C1161a c1161a2 = new C1161a(supportFragmentManager2);
                                c1161a2.m(newUserIntroductionFragment);
                                c1161a2.h(true);
                                int i14 = UserFixedSavingActivity.f32209g;
                                userFixedSavingActivity2.n(i12);
                            }
                            break;
                    }
                }
            });
        }
        super.o();
        return 0;
    }

    public final View t(int i7, String str, String str2) {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(Jc.d.mm_loading_page_item, (ViewGroup) null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f32494p.getValue();
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i7);
        }
        TextView textView = (TextView) this.f32493o.getValue();
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) this.f32492j.getValue();
        if (textView2 != null) {
            textView2.setText(str2);
        }
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}

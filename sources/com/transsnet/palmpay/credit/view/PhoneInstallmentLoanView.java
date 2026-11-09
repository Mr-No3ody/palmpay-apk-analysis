package com.transsnet.palmpay.credit.view;

import Gb.L;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.model.layer.d;
import com.google.android.material.timepicker.TimeModel;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p099gb.e;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/view/PhoneInstallmentLoanView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "", "e", "Lkotlin/jvm/functions/Function0;", "getOnUnlockCountDownFinished", "()Lkotlin/jvm/functions/Function0;", "setOnUnlockCountDownFinished", "(Lkotlin/jvm/functions/Function0;)V", "onUnlockCountDownFinished", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhoneInstallmentLoanView extends LinearLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30868f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L f30871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Function0 onUnlockCountDownFinished;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long resolveDeviceActiveTimeMs(@Nullable Long l5) {
            long jLongValue = l5 != null ? l5.longValue() : 0L;
            if (jLongValue <= 0) {
                return 0L;
            }
            return jLongValue < 1000000000000L ? jLongValue * 1000 : jLongValue;
        }

        public final boolean shouldShowUnlockInfoCountdown(@Nullable MobileInstallmentCardData mobileInstallmentCardData) {
            if (mobileInstallmentCardData == null) {
                return false;
            }
            Integer overDueStatus = mobileInstallmentCardData.getOverDueStatus();
            if (overDueStatus != null && overDueStatus.intValue() == 0) {
                return false;
            }
            return !Intrinsics.c(mobileInstallmentCardData.getLocked(), Boolean.TRUE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneInstallmentLoanView(@NotNull Context context, @NotNull AttributeSet attrs) {
        View viewM;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = View.inflate(context, f.cs_cl_phone_installment_loan_layout, this);
        setOrientation(1);
        int i7 = Ya.e.btnExpireTime;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = Ya.e.btnRepay;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = Ya.e.btnUnlock;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = Ya.e.clMobileInstallment;
                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout2 != null) {
                        i7 = Ya.e.ivBillBottow;
                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView != null) {
                            i7 = Ya.e.ivBrand;
                            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView2 != null) {
                                i7 = Ya.e.ivBrandIcon;
                                ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                                if (imageView3 != null) {
                                    i7 = Ya.e.ivBrandIcon2;
                                    ImageView imageView4 = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView4 != null) {
                                        i7 = Ya.e.ivExemptionBadge;
                                        ImageView imageView5 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView5 != null) {
                                            i7 = Ya.e.ivLock;
                                            ImageView imageView6 = (ImageView) p059e1.a.m(i7, viewInflate);
                                            if (imageView6 != null) {
                                                i7 = Ya.e.ivLockV2;
                                                if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = Ya.e.ivPhoneInstallmentTips3;
                                                    ImageView imageView7 = (ImageView) p059e1.a.m(i7, viewInflate);
                                                    if (imageView7 != null) {
                                                        i7 = Ya.e.ivRefreshLockTime;
                                                        ImageView imageView8 = (ImageView) p059e1.a.m(i7, viewInflate);
                                                        if (imageView8 != null) {
                                                            i7 = Ya.e.layoutDeviceActiveTime;
                                                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = Ya.e.layoutDeviceInfo;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                                if (constraintLayout != null) {
                                                                    i7 = Ya.e.layoutRepayOnTimeBanner;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                                    if (constraintLayout2 != null) {
                                                                        i7 = Ya.e.llCurrentOutstandingTitle;
                                                                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                            i7 = Ya.e.llDailyPayment;
                                                                            LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                            if (linearLayout3 != null) {
                                                                                i7 = Ya.e.llDeviceInfo;
                                                                                LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                if (linearLayout4 != null) {
                                                                                    i7 = Ya.e.llMonthlyPayment;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                    if (linearLayout5 != null) {
                                                                                        i7 = Ya.e.llPaymentFrequencyRow;
                                                                                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                            i7 = Ya.e.llPhoneInstallmentExemption;
                                                                                            LinearLayout linearLayout6 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                            if (linearLayout6 != null) {
                                                                                                i7 = Ya.e.llTotalOutstanding;
                                                                                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                    i7 = Ya.e.llUnlockCountdownDays;
                                                                                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                        i7 = Ya.e.llUnlockInfo;
                                                                                                        LinearLayout linearLayout7 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                                        if (linearLayout7 != null) {
                                                                                                            i7 = Ya.e.llWeeklyPayment;
                                                                                                            LinearLayout linearLayout8 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                                            if (linearLayout8 != null) {
                                                                                                                i7 = Ya.e.rlPhoneInstallmentTips3;
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) p059e1.a.m(i7, viewInflate);
                                                                                                                if (relativeLayout != null) {
                                                                                                                    i7 = Ya.e.tvBrand;
                                                                                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                    if (textView3 != null) {
                                                                                                                        i7 = Ya.e.tvCurrentOutstandingAmount;
                                                                                                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i7 = Ya.e.tvCurrentOutstandingTitle;
                                                                                                                            TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i7 = Ya.e.tvDailyPaymentAmount;
                                                                                                                                TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i7 = Ya.e.tvDailyPaymentTitle;
                                                                                                                                    TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        i7 = Ya.e.tvDeviceActiveTime;
                                                                                                                                        TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            i7 = Ya.e.tvDeviceActiveTitle;
                                                                                                                                            TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                i7 = Ya.e.tvExemptionColon1;
                                                                                                                                                if (((AppCompatTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                                                                    i7 = Ya.e.tvExemptionColon2;
                                                                                                                                                    if (((AppCompatTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                                                                        i7 = Ya.e.tvExemptionMinutes;
                                                                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                        if (appCompatTextView != null) {
                                                                                                                                                            i7 = Ya.e.tvExemptionSecond;
                                                                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                                                i7 = Ya.e.tvExemptionYearsOld;
                                                                                                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                                                                    i7 = Ya.e.tvExpireColon;
                                                                                                                                                                    TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                        i7 = Ya.e.tvExpireIn;
                                                                                                                                                                        TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                            i7 = Ya.e.tvExpireMinute;
                                                                                                                                                                            TextView textView12 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                                i7 = Ya.e.tvExpireSecond;
                                                                                                                                                                                TextView textView13 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                                    i7 = Ya.e.tvLockV2;
                                                                                                                                                                                    TextView textView14 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                                        i7 = Ya.e.tvMonthlyPaymentAmount;
                                                                                                                                                                                        TextView textView15 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                                            i7 = Ya.e.tvMonthlyPaymentTitle;
                                                                                                                                                                                            TextView textView16 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                i7 = Ya.e.tvPhoneInstallmentTips;
                                                                                                                                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                if (appCompatTextView4 != null) {
                                                                                                                                                                                                    i7 = Ya.e.tvPhoneInstallmentTips2;
                                                                                                                                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                    if (appCompatTextView5 != null) {
                                                                                                                                                                                                        i7 = Ya.e.tvPhoneInstallmentTips3;
                                                                                                                                                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                        if (appCompatTextView6 != null) {
                                                                                                                                                                                                            i7 = Ya.e.tvTotalOutstandingAmount;
                                                                                                                                                                                                            IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                            if (iconicsTextView != null) {
                                                                                                                                                                                                                i7 = Ya.e.tvTotalOutstandingTitle;
                                                                                                                                                                                                                TextView textView17 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                                                                    i7 = Ya.e.tvUnlockCountdownDays;
                                                                                                                                                                                                                    TextView textView18 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                                        i7 = Ya.e.tvUnlockCountdownHours;
                                                                                                                                                                                                                        TextView textView19 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                                                            i7 = Ya.e.tvUnlockCountdownMinutes;
                                                                                                                                                                                                                            TextView textView20 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                                                                i7 = Ya.e.tvUnlockCountdownSeconds;
                                                                                                                                                                                                                                TextView textView21 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                                    i7 = Ya.e.tvWeeklyPaymentAmount;
                                                                                                                                                                                                                                    TextView textView22 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                                        i7 = Ya.e.tvWeeklyPaymentTitle;
                                                                                                                                                                                                                                        TextView textView23 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                                                                                                                                        if (textView23 != null && (viewM = p059e1.a.m((i7 = Ya.e.viewBillTop), viewInflate)) != null) {
                                                                                                                                                                                                                                            this.f30869a = new e(viewInflate, linearLayout, textView, textView2, linearLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, constraintLayout, constraintLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, relativeLayout, textView3, textView4, textView5, textView6, textView7, textView8, textView9, appCompatTextView, appCompatTextView2, appCompatTextView3, textView10, textView11, textView12, textView13, textView14, textView15, textView16, appCompatTextView4, appCompatTextView5, appCompatTextView6, iconicsTextView, textView17, textView18, textView19, textView20, textView21, textView22, textView23, viewM);
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

    public final String a(int i7, String str) {
        String string = str != null ? StringsKt.V(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            return string;
        }
        String string2 = getContext().getString(i7);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final void b() {
        L l5 = this.f30871c;
        if (l5 != null) {
            l5.cancel();
        }
        this.f30871c = null;
    }

    public final void c(MobileInstallmentCardData mobileInstallmentCardData) {
        if (mobileInstallmentCardData == null) {
            b();
            return;
        }
        a aVar = f30868f;
        boolean zShouldShowUnlockInfoCountdown = aVar.shouldShowUnlockInfoCountdown(mobileInstallmentCardData);
        e eVar = this.f30869a;
        if (!zShouldShowUnlockInfoCountdown) {
            b();
            if (eVar != null) {
                h.C(eVar.f37098C);
            }
            if (eVar != null) {
                h.c(eVar.f37111M);
            }
            if (eVar != null) {
                h.C(eVar.f37126i);
            }
            if (eVar != null) {
                h.c(eVar.f37127j);
                return;
            }
            return;
        }
        if (eVar != null) {
            h.c(eVar.f37098C);
        }
        if (eVar != null) {
            h.C(eVar.f37111M);
        }
        if (eVar != null) {
            h.c(eVar.f37126i);
        }
        if (eVar != null) {
            h.C(eVar.f37127j);
        }
        if (eVar != null) {
            eVar.f37134s0.setText(mobileInstallmentCardData.getTempLockActiveTitle());
        }
        long jResolveDeviceActiveTimeMs = aVar.resolveDeviceActiveTimeMs(mobileInstallmentCardData.getDeviceActiveTime());
        b();
        this.f30870b = jResolveDeviceActiveTimeMs;
        this.f30872d = false;
        e(jResolveDeviceActiveTimeMs);
        if (jResolveDeviceActiveTimeMs <= 0) {
            return;
        }
        long jCurrentTimeMillis = jResolveDeviceActiveTimeMs - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            L l5 = new L(1, jCurrentTimeMillis, this);
            this.f30871c = l5;
            l5.start();
        } else {
            if (this.f30872d) {
                return;
            }
            this.f30872d = true;
            Function0 function0 = this.onUnlockCountDownFinished;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void d(Long l5) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        long jLongValue = (l5 != null ? l5.longValue() : 0L) - System.currentTimeMillis();
        long j6 = (jLongValue >= 0 ? jLongValue : 0L) / ((long) 1000);
        long j10 = 3600;
        long j11 = j6 / j10;
        long j12 = 60;
        long j13 = (j6 % j10) / j12;
        long j14 = j6 % j12;
        e eVar = this.f30869a;
        if (eVar != null && (appCompatTextView3 = eVar.f37138v0) != null) {
            appCompatTextView3.setText(d.o(new Object[]{Long.valueOf(j11)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (eVar != null && (appCompatTextView2 = eVar.f37135t0) != null) {
            appCompatTextView2.setText(d.o(new Object[]{Long.valueOf(j13)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (eVar == null || (appCompatTextView = eVar.f37136u0) == null) {
            return;
        }
        appCompatTextView.setText(d.o(new Object[]{Long.valueOf(j14)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
    }

    public final void e(long j6) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        long jCurrentTimeMillis = j6 - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        long j10 = jCurrentTimeMillis / ((long) 1000);
        long j11 = 86400;
        long j12 = j10 / j11;
        long j13 = 3600;
        long j14 = (j10 % j11) / j13;
        long j15 = 60;
        long j16 = (j10 % j13) / j15;
        long j17 = j10 % j15;
        e eVar = this.f30869a;
        if (eVar != null && (textView4 = eVar.f37106I0) != null) {
            textView4.setText(d.o(new Object[]{Long.valueOf(j12)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (eVar != null && (textView3 = eVar.f37107J0) != null) {
            textView3.setText(d.o(new Object[]{Long.valueOf(j14)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (eVar != null && (textView2 = eVar.f37108K0) != null) {
            textView2.setText(d.o(new Object[]{Long.valueOf(j16)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (eVar == null || (textView = eVar.f37110L0) == null) {
            return;
        }
        textView.setText(d.o(new Object[]{Long.valueOf(j17)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
    }

    @Nullable
    public final Function0<Unit> getOnUnlockCountDownFinished() {
        return this.onUnlockCountDownFinished;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    public final void setOnUnlockCountDownFinished(@Nullable Function0<Unit> function0) {
        this.onUnlockCountDownFinished = function0;
    }
}

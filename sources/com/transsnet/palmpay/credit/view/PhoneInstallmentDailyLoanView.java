package com.transsnet.palmpay.credit.view;

import Ce.O;
import Fb.j;
import Gb.K;
import Gb.L;
import L6.b;
import N8.q0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.credit.bean.style.MobileInstallmentDailyStyleConfig;
import com.transsnet.palmpay.credit.bean.style.StyleConfigConstant;
import com.transsnet.palmpay.credit.view.PhoneInstallmentDailyLoanView;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p099gb.d;
import p220oa.h;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/view/PhoneInstallmentDailyLoanView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "styleKeyFromCard", "", "setViewStyleConfig", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getOnUnlockCountDownFinished", "()Lkotlin/jvm/functions/Function0;", "setOnUnlockCountDownFinished", "(Lkotlin/jvm/functions/Function0;)V", "onUnlockCountDownFinished", "a", "Gb/K", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneInstallmentDailyLoanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneInstallmentDailyLoanView.kt\ncom/transsnet/palmpay/credit/view/PhoneInstallmentDailyLoanView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,540:1\n1#2:541\n774#3:542\n865#3,2:543\n1869#3,2:545\n1869#3,2:547\n1869#3,2:549\n*S KotlinDebug\n*F\n+ 1 PhoneInstallmentDailyLoanView.kt\ncom/transsnet/palmpay/credit/view/PhoneInstallmentDailyLoanView\n*L\n274#1:542\n274#1:543,2\n446#1:545,2\n453#1:547,2\n469#1:549,2\n*E\n"})
public final class PhoneInstallmentDailyLoanView extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f30860i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f30862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MobileInstallmentCardData f30865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MobileInstallmentDailyStyleConfig f30866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
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

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInstallmentDailyLoanView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Integer f(String str) {
        if (str == null || StringsKt.F(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000d  */
    private final void setViewStyleConfig(String styleKeyFromCard) {
        if (styleKeyFromCard == null) {
            styleKeyFromCard = StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_DAILY;
        } else {
            if (StringsKt.F(styleKeyFromCard)) {
                styleKeyFromCard = null;
            }
            if (styleKeyFromCard == null) {
                styleKeyFromCard = StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_DAILY;
            }
        }
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig = (MobileInstallmentDailyStyleConfig) l.l(styleKeyFromCard, "getMobileInstallmentDailyStyleConfig", MobileInstallmentDailyStyleConfig.class);
        if (mobileInstallmentDailyStyleConfig == null) {
            return;
        }
        this.f30866f = mobileInstallmentDailyStyleConfig;
        d dVar = this.f30861a;
        if (dVar == null) {
            return;
        }
        j.a(dVar.f37084o, mobileInstallmentDailyStyleConfig.deviceHeaderBg);
        j.c(dVar.f37073Z, mobileInstallmentDailyStyleConfig.deviceModel);
        j.c(dVar.f37066C, mobileInstallmentDailyStyleConfig.activeUntil);
        j.c(dVar.f37083k0, mobileInstallmentDailyStyleConfig.lockedDays);
        j.c(dVar.f37086p0, mobileInstallmentDailyStyleConfig.lockedDaysSubtitle);
        j.a(dVar.f37085p, mobileInstallmentDailyStyleConfig.paymentCardBg);
        j.c(dVar.f37088r0, mobileInstallmentDailyStyleConfig.nextPaymentTitle);
        j.c(dVar.f37087q0, mobileInstallmentDailyStyleConfig.nextPaymentAmount);
        j.a(dVar.f37077d, mobileInstallmentDailyStyleConfig.overdueTitleDot);
        j.a(dVar.f37078e, mobileInstallmentDailyStyleConfig.legendPaidDot);
        j.a(dVar.f37076c, mobileInstallmentDailyStyleConfig.legendBalanceDot);
        j.c(dVar.f37090t0, mobileInstallmentDailyStyleConfig.totalPaid);
        j.c(dVar.f37067H, mobileInstallmentDailyStyleConfig.balance);
        j.a(dVar.f37064A, mobileInstallmentDailyStyleConfig.unlockTipBg);
        j.c(dVar.f37091u0, mobileInstallmentDailyStyleConfig.unlockTipText);
        j.c(dVar.f37075b, mobileInstallmentDailyStyleConfig.btnDailyRepay);
        j.c(dVar.f37072Y, mobileInstallmentDailyStyleConfig.historyEntry);
        TextStyleConfig textStyleConfig = mobileInstallmentDailyStyleConfig.historyEntry;
        Integer numF = f(textStyleConfig != null ? textStyleConfig.getTextColor() : null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            IconicsImageView iconicsImageView = dVar.f37080g;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_ArrowCenterRight);
            iconicsDrawable.a(new O(iIntValue, 3));
            iconicsImageView.setIcon(iconicsDrawable);
        }
        c(dVar.f37065B);
    }

    public final void a(d dVar) {
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig = this.f30866f;
        if ((mobileInstallmentDailyStyleConfig != null ? mobileInstallmentDailyStyleConfig.statusTagActiveBg : null) != null) {
            j.a(dVar.f37093w, mobileInstallmentDailyStyleConfig.statusTagActiveBg);
        } else {
            dVar.f37093w.setBackgroundResource(Ya.d.cs_mi_daily_tag_active_bg);
        }
        dVar.f37089s0.setText(g.cs_daily_repay_tag_active);
        TextStyleConfig textStyleConfig = mobileInstallmentDailyStyleConfig != null ? mobileInstallmentDailyStyleConfig.statusTagActiveText : null;
        IconicsImageView iconicsImageView = dVar.f37082j;
        TextView textView = dVar.f37089s0;
        if (textStyleConfig == null) {
            textView.setTextColor(getContext().getColor(b.ppColorSuccess));
            h(iconicsImageView, S6.a.pay_SelectedFill, getContext().getColor(b.ppColorSuccess));
        } else {
            j.c(textView, mobileInstallmentDailyStyleConfig.statusTagActiveText);
            S6.a aVar = S6.a.pay_SelectedFill;
            TextStyleConfig textStyleConfig2 = mobileInstallmentDailyStyleConfig.statusTagActiveText;
            h(iconicsImageView, aVar, e(b.ppColorSuccess, textStyleConfig2 != null ? textStyleConfig2.getTextColor() : null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    public final void b(boolean z3) {
        TextStyleConfig textStyleConfig;
        TextStyleConfig textStyleConfig2;
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig = this.f30866f;
        if (z3) {
            if (mobileInstallmentDailyStyleConfig != null) {
                textStyleConfig = mobileInstallmentDailyStyleConfig.countdownBoxError;
            } else {
                textStyleConfig = null;
            }
        } else if (mobileInstallmentDailyStyleConfig != null) {
            textStyleConfig = mobileInstallmentDailyStyleConfig.countdownBox;
        } else {
            textStyleConfig = null;
        }
        if (z3) {
            if (mobileInstallmentDailyStyleConfig != null) {
                textStyleConfig2 = mobileInstallmentDailyStyleConfig.countdownLabelError;
            } else {
                textStyleConfig2 = null;
            }
        } else if (mobileInstallmentDailyStyleConfig != null) {
            textStyleConfig2 = mobileInstallmentDailyStyleConfig.countdownLabel;
        } else {
            textStyleConfig2 = null;
        }
        d dVar = this.f30861a;
        if (dVar != null) {
            TextView textView = dVar.f37068L;
            TextView textView2 = dVar.f37069M;
            TextView textView3 = dVar.f37070Q;
            TextView textView4 = dVar.f37071X;
            List listH = C1850q.h(textView, textView2, textView3, textView4);
            if (textStyleConfig != null) {
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    j.c((TextView) it.next(), textStyleConfig);
                }
            } else {
                int i7 = z3 ? Ya.d.cs_mi_daily_countdown_box_error : Ya.d.cs_mi_daily_countdown_box;
                Iterator it2 = listH.iterator();
                while (it2.hasNext()) {
                    ((TextView) it2.next()).setBackgroundResource(i7);
                }
            }
            Integer numF = f(textStyleConfig2 != null ? textStyleConfig2.getTextColor() : null);
            int iIntValue = numF != null ? numF.intValue() : getContext().getColor(z3 ? b.ppColorError : b.ppColorTextPrimary);
            ViewParent parent = textView.getParent();
            LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
            ViewParent parent2 = textView2.getParent();
            LinearLayout linearLayout2 = parent2 instanceof LinearLayout ? (LinearLayout) parent2 : null;
            ViewParent parent3 = textView3.getParent();
            LinearLayout linearLayout3 = parent3 instanceof LinearLayout ? (LinearLayout) parent3 : null;
            ViewParent parent4 = textView4.getParent();
            for (LinearLayout linearLayout4 : C1850q.h(linearLayout, linearLayout2, linearLayout3, parent4 instanceof LinearLayout ? (LinearLayout) parent4 : null)) {
                View childAt = linearLayout4 != null ? linearLayout4.getChildAt(1) : null;
                TextView textView5 = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView5 != null) {
                    textView5.setTextColor(iIntValue);
                }
            }
        }
    }

    public final void c(ProgressBar progressBar) {
        BaseStyleConfig baseStyleConfig;
        BaseStyleConfig baseStyleConfig2;
        BaseStyleConfig baseStyleConfig3;
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig = this.f30866f;
        String bgColor = null;
        int iE = e(Ya.b.cs_cl_home_installment_daily_repayment_bg, (mobileInstallmentDailyStyleConfig == null || (baseStyleConfig3 = mobileInstallmentDailyStyleConfig.progressTrack) == null) ? null : baseStyleConfig3.getBgColor());
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig2 = this.f30866f;
        int iE2 = e(Ya.b.cs_cl_home_installment_daily_repayment_secondary_progress, (mobileInstallmentDailyStyleConfig2 == null || (baseStyleConfig2 = mobileInstallmentDailyStyleConfig2.progressSecondary) == null) ? null : baseStyleConfig2.getBgColor());
        MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig3 = this.f30866f;
        if (mobileInstallmentDailyStyleConfig3 != null && (baseStyleConfig = mobileInstallmentDailyStyleConfig3.progressPrimary) != null) {
            bgColor = baseStyleConfig.getBgColor();
        }
        int iE3 = e(Ya.b.cs_cl_home_installment_daily_repayment_progress, bgColor);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(999.0f);
        gradientDrawable.setColor(iE);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new K(iE2), new K(iE3)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        progressBar.setProgressDrawable(layerDrawable);
    }

    public final String d(int i7, long j6, String str) {
        String strB = r0.B(j6, false);
        if (str == null || StringsKt.F(str)) {
            str = null;
        }
        if (str != null) {
            return q0.y(str, " ", strB);
        }
        String string = getContext().getString(i7, strB);
        Intrinsics.e(string);
        return string;
    }

    public final int e(int i7, String str) {
        Integer numF = f(str);
        return numF != null ? numF.intValue() : getContext().getColor(i7);
    }

    public final void g(long j6) {
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
        d dVar = this.f30861a;
        if (dVar != null && (textView4 = dVar.f37068L) != null) {
            textView4.setText(com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j12)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (dVar != null && (textView3 = dVar.f37069M) != null) {
            textView3.setText(com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j14)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (dVar != null && (textView2 = dVar.f37070Q) != null) {
            textView2.setText(com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j16)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
        }
        if (dVar == null || (textView = dVar.f37071X) == null) {
            return;
        }
        textView.setText(com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j17)}, 1, Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"));
    }

    @Nullable
    public final Function0<Unit> getOnUnlockCountDownFinished() {
        return this.onUnlockCountDownFinished;
    }

    public final void h(IconicsImageView iconicsImageView, S6.a aVar, int i7) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, aVar);
        iconicsDrawable.a(new O(i7, 4));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    public final void i() {
        L l5 = this.f30862b;
        if (l5 != null) {
            l5.cancel();
        }
        this.f30862b = null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0213  */
    /* JADX WARN: Code duplicated, block: B:121:0x023b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:180:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x0369  */
    /* JADX WARN: Code duplicated, block: B:193:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    public final void j(MobileInstallmentCardData mobileInstallmentCardData) {
        String string;
        String brand;
        String type;
        ArrayList arrayList;
        if (mobileInstallmentCardData == null) {
            this.f30865e = null;
            this.f30866f = null;
            i();
            return;
        }
        this.f30865e = mobileInstallmentCardData;
        setViewStyleConfig(mobileInstallmentCardData.getItemStyle());
        d dVar = this.f30861a;
        if (dVar != null) {
            r0.k1(dVar.f37081i, mobileInstallmentCardData.getPhoneBrandIocUrl(), mobileInstallmentCardData.getPhoneBrandIocUrlDark());
            String marketName = mobileInstallmentCardData.getMarketName();
            String string2 = "";
            if (marketName == null) {
                brand = mobileInstallmentCardData.getBrand();
                if (brand == null) {
                    brand = "";
                }
                type = mobileInstallmentCardData.getType();
                if (type == null) {
                    type = "";
                }
                List listH = C1850q.h(brand, type);
                arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (!StringsKt.F((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                marketName = CollectionsKt.J(arrayList, " ", null, null, null, 62);
                if (StringsKt.F(marketName)) {
                    marketName = "—";
                }
            } else {
                if (StringsKt.F(marketName)) {
                    marketName = null;
                }
                if (marketName == null) {
                    brand = mobileInstallmentCardData.getBrand();
                    if (brand == null) {
                        brand = "";
                    }
                    type = mobileInstallmentCardData.getType();
                    if (type == null) {
                        type = "";
                    }
                    List listH2 = C1850q.h(brand, type);
                    arrayList = new ArrayList();
                    while (r8.hasNext()) {
                        if (!StringsKt.F((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    marketName = CollectionsKt.J(arrayList, " ", null, null, null, 62);
                    if (StringsKt.F(marketName)) {
                        marketName = "—";
                    }
                }
            }
            dVar.f37073Z.setText(marketName);
            long jResolveDeviceActiveTimeMs = f30860i.resolveDeviceActiveTimeMs(mobileInstallmentCardData.getDeviceActiveTime());
            String strMillis2String = jResolveDeviceActiveTimeMs > 0 ? TimeUtils.millis2String(jResolveDeviceActiveTimeMs, new SimpleDateFormat("MMM d, h:mm a", Locale.ENGLISH)) : "";
            Intrinsics.e(strMillis2String);
            if (strMillis2String.length() > 0) {
                string2 = getContext().getString(g.cs_daily_repay_active_until, strMillis2String);
            } else {
                String deviceActiveTitle = mobileInstallmentCardData.getDeviceActiveTitle();
                if (deviceActiveTitle != null) {
                    string2 = deviceActiveTitle;
                }
            }
            dVar.f37066C.setText(string2);
            Integer overDueStatus = mobileInstallmentCardData.getOverDueStatus();
            boolean z3 = overDueStatus != null && overDueStatus.intValue() == 1;
            boolean zC = Intrinsics.c(mobileInstallmentCardData.getLocked(), Boolean.TRUE);
            LinearLayout llLockedDays = dVar.f37092v;
            LinearLayout llCountdown = dVar.t;
            if (z3 && zC) {
                MobileInstallmentDailyStyleConfig mobileInstallmentDailyStyleConfig = this.f30866f;
                BaseStyleConfig baseStyleConfig = mobileInstallmentDailyStyleConfig != null ? mobileInstallmentDailyStyleConfig.statusTagLockedBg : null;
                LinearLayout linearLayout = dVar.f37093w;
                if (baseStyleConfig != null) {
                    j.a(linearLayout, mobileInstallmentDailyStyleConfig.statusTagLockedBg);
                } else {
                    linearLayout.setBackgroundResource(Ya.d.cs_mi_daily_tag_locked_bg);
                }
                int i7 = g.cs_daily_repay_tag_locked;
                TextView textView = dVar.f37089s0;
                textView.setText(i7);
                TextStyleConfig textStyleConfig = mobileInstallmentDailyStyleConfig != null ? mobileInstallmentDailyStyleConfig.statusTagLockedText : null;
                IconicsImageView iconicsImageView = dVar.f37082j;
                if (textStyleConfig != null) {
                    j.c(textView, mobileInstallmentDailyStyleConfig.statusTagLockedText);
                    S6.a aVar = S6.a.pay_LockFill;
                    TextStyleConfig textStyleConfig2 = mobileInstallmentDailyStyleConfig.statusTagLockedText;
                    h(iconicsImageView, aVar, e(b.ppColorError, textStyleConfig2 != null ? textStyleConfig2.getTextColor() : null));
                } else {
                    textView.setTextColor(getContext().getColor(b.ppColorError));
                    h(iconicsImageView, S6.a.pay_LockFill, getContext().getColor(b.ppColorError));
                }
                Intrinsics.checkNotNullExpressionValue(llCountdown, "llCountdown");
                h.c(llCountdown);
                Intrinsics.checkNotNullExpressionValue(llLockedDays, "llLockedDays");
                h.C(llLockedDays);
                Integer lockDay = mobileInstallmentCardData.getLockDay();
                int iIntValue = (lockDay == null && (lockDay = mobileInstallmentCardData.getOverdueDays()) == null) ? 0 : lockDay.intValue();
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                dVar.f37083k0.setText(getContext().getString(g.cs_daily_repay_locked_days, Integer.valueOf(iIntValue)));
                i();
            } else {
                if (z3) {
                    a(dVar);
                    b(true);
                } else {
                    a(dVar);
                    b(false);
                }
                Intrinsics.checkNotNullExpressionValue(llLockedDays, "llLockedDays");
                h.c(llLockedDays);
                Intrinsics.checkNotNullExpressionValue(llCountdown, "llCountdown");
                h.C(llCountdown);
                i();
                this.f30863c = jResolveDeviceActiveTimeMs;
                g(jResolveDeviceActiveTimeMs);
                if (jResolveDeviceActiveTimeMs > 0 && jResolveDeviceActiveTimeMs > System.currentTimeMillis()) {
                    this.f30864d = false;
                    L l5 = new L(0, jResolveDeviceActiveTimeMs - System.currentTimeMillis(), this);
                    l5.start();
                    this.f30862b = l5;
                }
            }
        }
        if (dVar == null) {
            return;
        }
        Integer overDueStatus2 = mobileInstallmentCardData.getOverDueStatus();
        boolean z8 = overDueStatus2 != null && overDueStatus2.intValue() == 1;
        boolean zC2 = Intrinsics.c(mobileInstallmentCardData.getLocked(), Boolean.TRUE);
        TextView textView2 = dVar.f37088r0;
        View dotPaymentTitle = dVar.f37077d;
        if (z8) {
            Intrinsics.checkNotNullExpressionValue(dotPaymentTitle, "dotPaymentTitle");
            h.C(dotPaymentTitle);
            String unpaidAmountTitle = mobileInstallmentCardData.getUnpaidAmountTitle();
            if (unpaidAmountTitle == null) {
                unpaidAmountTitle = getContext().getString(g.cs_daily_repay_late_on_payments);
                Intrinsics.checkNotNullExpressionValue(unpaidAmountTitle, "getString(...)");
            } else {
                if (StringsKt.F(unpaidAmountTitle)) {
                    unpaidAmountTitle = null;
                }
                if (unpaidAmountTitle == null) {
                    unpaidAmountTitle = getContext().getString(g.cs_daily_repay_late_on_payments);
                    Intrinsics.checkNotNullExpressionValue(unpaidAmountTitle, "getString(...)");
                }
            }
            textView2.setText(unpaidAmountTitle);
        } else {
            Intrinsics.checkNotNullExpressionValue(dotPaymentTitle, "dotPaymentTitle");
            h.c(dotPaymentTitle);
            String unpaidAmountTitle2 = mobileInstallmentCardData.getUnpaidAmountTitle();
            if (unpaidAmountTitle2 == null) {
                unpaidAmountTitle2 = getContext().getString(g.cs_daily_repay_next_payment);
                Intrinsics.checkNotNullExpressionValue(unpaidAmountTitle2, "getString(...)");
            } else {
                if (StringsKt.F(unpaidAmountTitle2)) {
                    unpaidAmountTitle2 = null;
                }
                if (unpaidAmountTitle2 == null) {
                    unpaidAmountTitle2 = getContext().getString(g.cs_daily_repay_next_payment);
                    Intrinsics.checkNotNullExpressionValue(unpaidAmountTitle2, "getString(...)");
                }
            }
            textView2.setText(unpaidAmountTitle2);
        }
        Long unpaidAmount = mobileInstallmentCardData.getUnpaidAmount();
        dVar.f37087q0.setText(r0.B(unpaidAmount != null ? unpaidAmount.longValue() : 0L, false));
        Long paidAmount = mobileInstallmentCardData.getPaidAmount();
        long jLongValue = paidAmount != null ? paidAmount.longValue() : 0L;
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        Long totalOutstandingAmount = mobileInstallmentCardData.getTotalOutstandingAmount();
        long jLongValue2 = totalOutstandingAmount != null ? totalOutstandingAmount.longValue() : 0L;
        if (jLongValue2 < 0) {
            jLongValue2 = 0;
        }
        Long backWardAmount = mobileInstallmentCardData.getBackWardAmount();
        long jLongValue3 = backWardAmount != null ? backWardAmount.longValue() : 0L;
        if (jLongValue3 < 0) {
            jLongValue3 = 0;
        }
        dVar.f37090t0.setText(d(g.cs_daily_repay_total_paid, jLongValue, mobileInstallmentCardData.getPaidAmountTitle()));
        dVar.f37067H.setText(d(g.cs_daily_repay_balance, jLongValue2, mobileInstallmentCardData.getTotalOutstandingAmountTitle()));
        long j6 = jLongValue2 + jLongValue;
        ProgressBar progressBar = dVar.f37065B;
        if (j6 <= 0) {
            progressBar.setProgress(0);
            progressBar.setSecondaryProgress(0);
        } else {
            int iC = kotlin.ranges.b.c((int) ((jLongValue * 100) / j6), 0, 100);
            int iC2 = kotlin.ranges.b.c((int) (((jLongValue + jLongValue3) * 100) / j6), iC, 100);
            progressBar.setProgress(iC);
            progressBar.setSecondaryProgress(iC2);
        }
        String repaymentReminderContent = mobileInstallmentCardData.getRepaymentReminderContent();
        if (repaymentReminderContent == null || StringsKt.F(repaymentReminderContent)) {
            repaymentReminderContent = null;
        }
        TextView textView3 = dVar.f37075b;
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        LinearLayout llUnlockTip = dVar.f37064A;
        if (z8 && zC2 && repaymentReminderContent != null) {
            Intrinsics.checkNotNullExpressionValue(llUnlockTip, "llUnlockTip");
            h.C(llUnlockTip);
            dVar.f37091u0.setText(repaymentReminderContent);
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) (30 * getResources().getDisplayMetrics().density);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(llUnlockTip, "llUnlockTip");
            h.c(llUnlockTip);
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
            }
        }
        textView3.setLayoutParams(marginLayoutParams);
        textView3.requestLayout();
        String btnRepayContent = mobileInstallmentCardData.getBtnRepayContent();
        if (btnRepayContent == null) {
            btnRepayContent = getContext().getString(g.cs_daily_repay_repay_now);
            Intrinsics.checkNotNullExpressionValue(btnRepayContent, "getString(...)");
        } else {
            if (StringsKt.F(btnRepayContent)) {
                btnRepayContent = null;
            }
            if (btnRepayContent == null) {
                btnRepayContent = getContext().getString(g.cs_daily_repay_repay_now);
                Intrinsics.checkNotNullExpressionValue(btnRepayContent, "getString(...)");
            }
        }
        textView3.setText(btnRepayContent);
        String repayHistoryTitle = mobileInstallmentCardData.getRepayHistoryTitle();
        if (repayHistoryTitle == null) {
            string = getContext().getString(g.cs_daily_repay_history_entry);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = !StringsKt.F(repayHistoryTitle) ? repayHistoryTitle : null;
            if (string == null) {
                string = getContext().getString(g.cs_daily_repay_history_entry);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        dVar.f37072Y.setText(string);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i();
        super.onDetachedFromWindow();
    }

    public final void setOnUnlockCountDownFinished(@Nullable Function0<Unit> function0) {
        this.onUnlockCountDownFinished = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInstallmentDailyLoanView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        View viewM;
        View viewM2;
        View viewM3;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View viewInflate = View.inflate(context, f.cs_cl_phone_installment_daily_loan_layout, this);
        int i7 = e.btnDailyRepay;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null && (viewM = p059e1.a.m((i7 = e.dotBalance), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = e.dotPaymentTitle), viewInflate)) != null && (viewM3 = p059e1.a.m((i7 = e.dotTotalPaid), viewInflate)) != null) {
            i7 = e.flTipAndRepay;
            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
            if (frameLayout != null) {
                i7 = e.ivDailyRepaymentHistoryArrow;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = e.ivPhoneThumb;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = e.ivStatusTag;
                        IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                        if (iconicsImageView2 != null) {
                            i7 = e.ivUnlockTip;
                            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.layoutDeviceHeader;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                if (linearLayout != null) {
                                    i7 = e.layoutPaymentCard;
                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout2 != null) {
                                        i7 = e.llCountdown;
                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout3 != null) {
                                            i7 = e.llDailyRepaymentHistory;
                                            LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout4 != null) {
                                                i7 = e.llLockedDays;
                                                LinearLayout linearLayout5 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                if (linearLayout5 != null) {
                                                    i7 = e.llStatusTag;
                                                    LinearLayout linearLayout6 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                    if (linearLayout6 != null) {
                                                        i7 = e.llUnlockTip;
                                                        LinearLayout linearLayout7 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                        if (linearLayout7 != null) {
                                                            i7 = e.pbPaidProgress;
                                                            ProgressBar progressBar = (ProgressBar) p059e1.a.m(i7, viewInflate);
                                                            if (progressBar != null) {
                                                                i7 = e.tvActiveUntil;
                                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView2 != null) {
                                                                    i7 = e.tvBalance;
                                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i7 = e.tvCdDays;
                                                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i7 = e.tvCdHrs;
                                                                            TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i7 = e.tvCdMins;
                                                                                TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i7 = e.tvCdSecs;
                                                                                    TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        i7 = e.tvDailyRepaymentHistoryLabel;
                                                                                        TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView8 != null) {
                                                                                            i7 = e.tvDeviceModel;
                                                                                            TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView9 != null) {
                                                                                                i7 = e.tvLockedDays;
                                                                                                TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView10 != null) {
                                                                                                    i7 = e.tvLockedDaysSubtitle;
                                                                                                    TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i7 = e.tvNextPaymentAmount;
                                                                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                                                        if (iconicsTextView != null) {
                                                                                                            i7 = e.tvNextPaymentTitle;
                                                                                                            TextView textView12 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                            if (textView12 != null) {
                                                                                                                i7 = e.tvStatusTag;
                                                                                                                TextView textView13 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                if (textView13 != null) {
                                                                                                                    i7 = e.tvTotalPaid;
                                                                                                                    TextView textView14 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i7 = e.tvUnlockTip;
                                                                                                                        TextView textView15 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                                        if (textView15 != null) {
                                                                                                                            this.f30861a = new d(viewInflate, textView, viewM, viewM2, viewM3, frameLayout, iconicsImageView, imageView, iconicsImageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, progressBar, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, iconicsTextView, textView12, textView13, textView14, textView15);
                                                                                                                            c(progressBar);
                                                                                                                            final int i10 = 0;
                                                                                                                            textView.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.J

                                                                                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ PhoneInstallmentDailyLoanView f3236b;

                                                                                                                                {
                                                                                                                                    this.f3236b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    switch (i10) {
                                                                                                                                        case 0:
                                                                                                                                            D3.a.w(this.f3236b.f30865e);
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            MobileInstallmentCardData mobileInstallmentCardData = this.f3236b.f30865e;
                                                                                                                                            Bundle bundle = new Bundle();
                                                                                                                                            String loanNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getLoanNo() : null;
                                                                                                                                            if (loanNo == null) {
                                                                                                                                                loanNo = "";
                                                                                                                                            }
                                                                                                                                            bundle.putString("loanNo", loanNo);
                                                                                                                                            String cardNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getCardNo() : null;
                                                                                                                                            bundle.putString("cardNo", cardNo != null ? cardNo : "");
                                                                                                                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "MobileInstallmentDailyRepaymentHistory");
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            final int i11 = 1;
                                                                                                                            linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.J

                                                                                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ PhoneInstallmentDailyLoanView f3236b;

                                                                                                                                {
                                                                                                                                    this.f3236b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    switch (i11) {
                                                                                                                                        case 0:
                                                                                                                                            D3.a.w(this.f3236b.f30865e);
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            MobileInstallmentCardData mobileInstallmentCardData = this.f3236b.f30865e;
                                                                                                                                            Bundle bundle = new Bundle();
                                                                                                                                            String loanNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getLoanNo() : null;
                                                                                                                                            if (loanNo == null) {
                                                                                                                                                loanNo = "";
                                                                                                                                            }
                                                                                                                                            bundle.putString("loanNo", loanNo);
                                                                                                                                            String cardNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getCardNo() : null;
                                                                                                                                            bundle.putString("cardNo", cardNo != null ? cardNo : "");
                                                                                                                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "MobileInstallmentDailyRepaymentHistory");
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
}

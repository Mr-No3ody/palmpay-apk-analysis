package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.timepicker.TimeModel;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001d\u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R#\u0010 \u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R#\u0010#\u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R#\u0010&\u001a\n \u0015*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/transsnet/palmpay/custom_view/CountDownView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "", "setView", "(Landroid/widget/TextView;)V", "", "remainingTime", "setRemainingTime", "(J)V", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_cd_second", "()Landroid/widget/TextView;", "tv_cd_second", "b", "getTv_colon_minute", "tv_colon_minute", "c", "getTv_cd_minute", "tv_cd_minute", "d", "getTv_colon_hour", "tv_colon_hour", "e", "getTv_cd_hour", "tv_cd_hour", "Lcom/transsnet/palmpay/custom_view/CountDownView$OnCountdownListener;", "f", "Lcom/transsnet/palmpay/custom_view/CountDownView$OnCountdownListener;", "getListener", "()Lcom/transsnet/palmpay/custom_view/CountDownView$OnCountdownListener;", "setListener", "(Lcom/transsnet/palmpay/custom_view/CountDownView$OnCountdownListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "w", "Z", "getUserHour", "()Z", "setUserHour", "(Z)V", "userHour", "OnCountdownListener", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCountDownView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountDownView.kt\ncom/transsnet/palmpay/custom_view/CountDownView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,212:1\n176#2,2:213\n*S KotlinDebug\n*F\n+ 1 CountDownView.kt\ncom/transsnet/palmpay/custom_view/CountDownView\n*L\n131#1:213,2\n*E\n"})
public final class CountDownView extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f30981A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f30982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f30983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f30984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f30985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f30986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public OnCountdownListener listener;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30988g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f30989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f30990j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f30991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f30992p;
    public final Drawable t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f30993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean userHour;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/custom_view/CountDownView$OnCountdownListener;", "", "onStart", "", "onTick", "remainingTime", "", "onCompletion", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCountdownListener {
        void onCompletion();

        void onStart();

        void onTick(long remainingTime);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTv_cd_hour() {
        return (TextView) this.f30986e.getValue();
    }

    private final TextView getTv_cd_minute() {
        return (TextView) this.f30984c.getValue();
    }

    private final TextView getTv_cd_second() {
        return (TextView) this.f30982a.getValue();
    }

    private final TextView getTv_colon_hour() {
        return (TextView) this.f30985d.getValue();
    }

    private final TextView getTv_colon_minute() {
        return (TextView) this.f30983b.getValue();
    }

    private final void setView(TextView textView) {
        textView.setBackground(this.t);
        textView.setTextColor(this.f30988g);
        textView.setTextSize(0, this.f30989i);
        int i7 = this.f30990j;
        textView.setPadding(i7, i7, i7, i7);
        textView.setMinWidth(this.f30993v);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = this.f30993v;
        textView.setLayoutParams(layoutParams2);
    }

    @Nullable
    public final OnCountdownListener getListener() {
        return this.listener;
    }

    public final boolean getUserHour() {
        return this.userHour;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setListener(@Nullable OnCountdownListener onCountdownListener) {
        this.listener = onCountdownListener;
    }

    public final void setRemainingTime(long remainingTime) {
        if (!this.userHour) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(remainingTime);
            long seconds = timeUnit.toSeconds(remainingTime) % ((long) 60);
            if (getTv_cd_hour().getVisibility() == 0) {
                getTv_cd_hour().setVisibility(8);
                getTv_colon_hour().setVisibility(8);
            }
            TextView tv_cd_minute = getTv_cd_minute();
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            tv_cd_minute.setText(str);
            TextView tv_cd_second = getTv_cd_second();
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            tv_cd_second.setText(str2);
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long hours = timeUnit2.toHours(remainingTime);
        long j6 = 60;
        long minutes2 = timeUnit2.toMinutes(remainingTime) % j6;
        long seconds2 = timeUnit2.toSeconds(remainingTime) % j6;
        if (getTv_cd_hour().getVisibility() == 8) {
            getTv_cd_hour().setVisibility(0);
            getTv_colon_hour().setVisibility(0);
        }
        TextView tv_cd_hour = getTv_cd_hour();
        String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        tv_cd_hour.setText(str3);
        TextView tv_cd_minute2 = getTv_cd_minute();
        String str4 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(minutes2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        tv_cd_minute2.setText(str4);
        TextView tv_cd_second2 = getTv_cd_second();
        String str5 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(seconds2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        tv_cd_second2.setText(str5);
    }

    public final void setUserHour(boolean z3) {
        this.userHour = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f30982a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownView f31331b;

            {
                this.f31331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CountDownView countDownView = this.f31331b;
                switch (i10) {
                    case 0:
                        int i11 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_second);
                    case 1:
                        int i12 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_minute);
                    case 2:
                        int i13 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_minute);
                    case 3:
                        int i14 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_hour);
                    default:
                        int i15 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_hour);
                }
            }
        });
        final int i11 = 1;
        this.f30983b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownView f31331b;

            {
                this.f31331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CountDownView countDownView = this.f31331b;
                switch (i11) {
                    case 0:
                        int i12 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_second);
                    case 1:
                        int i13 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_minute);
                    case 2:
                        int i14 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_minute);
                    case 3:
                        int i15 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_hour);
                    default:
                        int i16 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_hour);
                }
            }
        });
        final int i12 = 2;
        this.f30984c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownView f31331b;

            {
                this.f31331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CountDownView countDownView = this.f31331b;
                switch (i12) {
                    case 0:
                        int i13 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_second);
                    case 1:
                        int i14 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_minute);
                    case 2:
                        int i15 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_minute);
                    case 3:
                        int i16 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_hour);
                    default:
                        int i17 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_hour);
                }
            }
        });
        final int i13 = 3;
        this.f30985d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownView f31331b;

            {
                this.f31331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CountDownView countDownView = this.f31331b;
                switch (i13) {
                    case 0:
                        int i14 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_second);
                    case 1:
                        int i15 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_minute);
                    case 2:
                        int i16 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_minute);
                    case 3:
                        int i17 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_hour);
                    default:
                        int i18 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_hour);
                }
            }
        });
        final int i14 = 4;
        this.f30986e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountDownView f31331b;

            {
                this.f31331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CountDownView countDownView = this.f31331b;
                switch (i14) {
                    case 0:
                        int i15 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_second);
                    case 1:
                        int i16 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_minute);
                    case 2:
                        int i17 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_minute);
                    case 3:
                        int i18 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_colon_hour);
                    default:
                        int i19 = CountDownView.f30981A;
                        return (TextView) countDownView.findViewById(s.tv_cd_hour);
                }
            }
        });
        this.f30988g = -1;
        this.f30989i = ScreenUtils.dip2px(12.0f);
        this.f30990j = ScreenUtils.dip2px(2.0f);
        this.f30991o = Color.parseColor("#202046");
        this.f30992p = ScreenUtils.dip2px(12.0f);
        this.f30993v = ScreenUtils.dip2px(20.0f);
        this.userHour = true;
        LayoutInflater.from(getContext()).inflate(t.cv_layout_countdown, this);
        setOrientation(0);
        setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CountDownView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes.hasValue(x.CountDownView_cd_square_bg)) {
            this.t = typedArrayObtainStyledAttributes.getDrawable(x.CountDownView_cd_square_bg);
        }
        if (this.t == null) {
            this.t = getContext().getDrawable(r.cv_shape_rect_corner_4_bg_text_primary);
        }
        this.f30988g = typedArrayObtainStyledAttributes.getColor(x.CountDownView_cd_text_color, -1);
        this.f30989i = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CountDownView_cd_text_size, ScreenUtils.dip2px(12.0f));
        this.f30990j = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CountDownView_cd_text_padding, ScreenUtils.dip2px(2.0f));
        this.f30992p = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CountDownView_cd_colon_size, ScreenUtils.dip2px(12.0f));
        this.f30991o = typedArrayObtainStyledAttributes.getColor(x.CountDownView_cd_colon_color, Color.parseColor("#202046"));
        this.f30993v = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CountDownView_cd_square_size, ScreenUtils.dip2px(20.0f));
        typedArrayObtainStyledAttributes.recycle();
        TextView tv_cd_hour = getTv_cd_hour();
        Intrinsics.checkNotNullExpressionValue(tv_cd_hour, "<get-tv_cd_hour>(...)");
        setView(tv_cd_hour);
        TextView tv_cd_minute = getTv_cd_minute();
        Intrinsics.checkNotNullExpressionValue(tv_cd_minute, "<get-tv_cd_minute>(...)");
        setView(tv_cd_minute);
        TextView tv_cd_second = getTv_cd_second();
        Intrinsics.checkNotNullExpressionValue(tv_cd_second, "<get-tv_cd_second>(...)");
        setView(tv_cd_second);
        getTv_colon_hour().setTextColor(this.f30991o);
        getTv_colon_hour().setTextSize(0, this.f30992p);
        getTv_colon_minute().setTextColor(this.f30991o);
        getTv_colon_minute().setTextSize(0, this.f30992p);
    }
}

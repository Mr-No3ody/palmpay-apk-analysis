package com.transsnet.palmpay.cash_in.ui.view;

import Pa.n0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.cash_in.ui.view.ModelUssdInfo;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0019\u000bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/view/ModelUssdInfo;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getUssd_call_bt", "()Landroid/widget/TextView;", "ussd_call_bt", "b", "getUssd_phone_num_tv", "ussd_phone_num_tv", "c", "getUssd_countdown", "ussd_countdown", "d", "getUssd_desc_tv", "ussd_desc_tv", "com/transsnet/palmpay/cash_in/ui/view/a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelUssdInfo extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27081g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f27082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f27083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f27084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f27085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.transsnet.palmpay.cash_in.ui.view.a f27087f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateCountdownTime(TextView textView, long j6) {
            if (j6 <= System.currentTimeMillis()) {
                if (textView != null) {
                    textView.setText(d.ci_ussd_code_expired);
                }
            } else if (textView != null) {
                Context context = textView.getContext();
                textView.setText(context != null ? context.getString(d.ci_ussd_code_expire_in, TimeUtils.millis2String(j6 - System.currentTimeMillis(), new SimpleDateFormat("mm:ss", Locale.ENGLISH))) : null);
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelUssdInfo(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelUssdInfo modelUssdInfo, View view) {
        n0.g().l("Fund_USSD_click_Call");
        Intent intent = new Intent("android.intent.action.DIAL");
        TextView ussd_phone_num_tv = modelUssdInfo.getUssd_phone_num_tv();
        Uri uri = Uri.parse("tel:" + Uri.encode(String.valueOf(ussd_phone_num_tv != null ? ussd_phone_num_tv.getText() : null)));
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        intent.setData(uri);
        ActivityUtils.startActivity(intent);
        if (modelUssdInfo.getContext() instanceof View.OnClickListener) {
            Object context = modelUssdInfo.getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type android.view.View.OnClickListener");
            ((View.OnClickListener) context).onClick(view);
        }
    }

    public static void d(ModelUssdInfo modelUssdInfo) {
        TextView ussd_phone_num_tv = modelUssdInfo.getUssd_phone_num_tv();
        ClipboardUtils.copyText(ussd_phone_num_tv != null ? ussd_phone_num_tv.getText() : null);
        ToastUtils.showLong(k.core_copy_success);
    }

    private final TextView getUssd_call_bt() {
        return (TextView) this.f27082a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getUssd_countdown() {
        return (TextView) this.f27084c.getValue();
    }

    private final TextView getUssd_desc_tv() {
        return (TextView) this.f27085d.getValue();
    }

    private final TextView getUssd_phone_num_tv() {
        return (TextView) this.f27083b.getValue();
    }

    public final void f(long j6) {
        TextView ussd_countdown;
        this.f27086e = j6;
        f27081g.updateCountdownTime(getUssd_countdown(), j6);
        if (j6 <= System.currentTimeMillis() || (ussd_countdown = getUssd_countdown()) == null) {
            return;
        }
        ussd_countdown.postDelayed(this.f27087f, 1000L);
    }

    public final void g(String str) {
        TextView ussd_phone_num_tv = getUssd_phone_num_tv();
        if (ussd_phone_num_tv != null) {
            ussd_phone_num_tv.setText(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        TextView ussd_countdown;
        super.onDetachedFromWindow();
        this.f27086e = 0L;
        com.transsnet.palmpay.cash_in.ui.view.a aVar = this.f27087f;
        if (aVar != null && (ussd_countdown = getUssd_countdown()) != null) {
            ussd_countdown.removeCallbacks(aVar);
        }
        f27081g.updateCountdownTime(getUssd_countdown(), this.f27086e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelUssdInfo(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelUssdInfo(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelUssdInfo(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f27082a = C2131j.b(new Function0(this) { // from class: I9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelUssdInfo f4289b;

            {
                this.f4289b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelUssdInfo modelUssdInfo = this.f4289b;
                switch (i10) {
                    case 0:
                        ModelUssdInfo.a aVar = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_call_bt);
                    case 1:
                        ModelUssdInfo.a aVar2 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_phone_num_tv);
                    case 2:
                        ModelUssdInfo.a aVar3 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_countdown);
                    default:
                        ModelUssdInfo.a aVar4 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_desc_tv);
                }
            }
        });
        final int i11 = 1;
        this.f27083b = C2131j.b(new Function0(this) { // from class: I9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelUssdInfo f4289b;

            {
                this.f4289b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelUssdInfo modelUssdInfo = this.f4289b;
                switch (i11) {
                    case 0:
                        ModelUssdInfo.a aVar = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_call_bt);
                    case 1:
                        ModelUssdInfo.a aVar2 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_phone_num_tv);
                    case 2:
                        ModelUssdInfo.a aVar3 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_countdown);
                    default:
                        ModelUssdInfo.a aVar4 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_desc_tv);
                }
            }
        });
        final int i12 = 2;
        this.f27084c = C2131j.b(new Function0(this) { // from class: I9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelUssdInfo f4289b;

            {
                this.f4289b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelUssdInfo modelUssdInfo = this.f4289b;
                switch (i12) {
                    case 0:
                        ModelUssdInfo.a aVar = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_call_bt);
                    case 1:
                        ModelUssdInfo.a aVar2 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_phone_num_tv);
                    case 2:
                        ModelUssdInfo.a aVar3 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_countdown);
                    default:
                        ModelUssdInfo.a aVar4 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_desc_tv);
                }
            }
        });
        final int i13 = 3;
        this.f27085d = C2131j.b(new Function0(this) { // from class: I9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelUssdInfo f4289b;

            {
                this.f4289b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelUssdInfo modelUssdInfo = this.f4289b;
                switch (i13) {
                    case 0:
                        ModelUssdInfo.a aVar = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_call_bt);
                    case 1:
                        ModelUssdInfo.a aVar2 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_phone_num_tv);
                    case 2:
                        ModelUssdInfo.a aVar3 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_countdown);
                    default:
                        ModelUssdInfo.a aVar4 = ModelUssdInfo.f27081g;
                        return (TextView) modelUssdInfo.findViewById(p366y9.b.ussd_desc_tv);
                }
            }
        });
        View.inflate(getContext(), c.ci_layout_ussd_info, this);
        TextView ussd_call_bt = getUssd_call_bt();
        if (ussd_call_bt != null) {
            final int i14 = 0;
            ussd_call_bt.setOnClickListener(new View.OnClickListener(this) { // from class: I9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelUssdInfo f4291b;

                {
                    this.f4291b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ModelUssdInfo.c(this.f4291b, view);
                            break;
                        default:
                            ModelUssdInfo.d(this.f4291b);
                            break;
                    }
                }
            });
        }
        TextView ussd_phone_num_tv = getUssd_phone_num_tv();
        if (ussd_phone_num_tv != null) {
            final int i15 = 1;
            ussd_phone_num_tv.setOnClickListener(new View.OnClickListener(this) { // from class: I9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelUssdInfo f4291b;

                {
                    this.f4291b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            ModelUssdInfo.c(this.f4291b, view);
                            break;
                        default:
                            ModelUssdInfo.d(this.f4291b);
                            break;
                    }
                }
            });
        }
        this.f27087f = new com.transsnet.palmpay.cash_in.ui.view.a(this);
    }
}

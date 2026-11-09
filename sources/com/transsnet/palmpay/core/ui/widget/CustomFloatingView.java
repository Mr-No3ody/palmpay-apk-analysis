package com.transsnet.palmpay.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.imuxuan.floatingview.FloatingMagnetView;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView;", "Lcom/imuxuan/floatingview/FloatingMagnetView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "w", "Lkotlin/Lazy;", "getCfv_tv1", "()Landroid/widget/TextView;", "cfv_tv1", "", "B", "Ljava/lang/String;", "getReqJsonStr", "()Ljava/lang/String;", "setReqJsonStr", "(Ljava/lang/String;)V", "reqJsonStr", "C", "getOriginPath", "setOriginPath", "originPath", "", "H", "J", "getCountDownSeconds", "()J", "setCountDownSeconds", "(J)V", "countDownSeconds", "", "Q", "Z", "getCountDownFinished", "()Z", "setCountDownFinished", "(Z)V", "countDownFinished", "Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView$Callback15;", "k0", "Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView$Callback15;", "getCallBack", "()Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView$Callback15;", "setCallBack", "(Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView$Callback15;)V", "callBack", "Callback15", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomFloatingView extends FloatingMagnetView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f28117p0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p103gf.a f28118A;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public String reqJsonStr;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public String originPath;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public long countDownSeconds;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Context f28122L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public a f28123M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public boolean countDownFinished;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public Callback15 callBack;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28126w;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/CustomFloatingView$Callback15;", "", "onCountDownFinish", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback15 {
        void onCountDownFinish();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFloatingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f28126w = C2131j.b(new Function0(this) { // from class: Oa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomFloatingView f6703b;

            {
                this.f6703b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomFloatingView customFloatingView = this.f6703b;
                switch (i7) {
                    case 0:
                        int i10 = CustomFloatingView.f28117p0;
                        break;
                    default:
                        int i11 = CustomFloatingView.f28117p0;
                        break;
                }
                return (TextView) customFloatingView.findViewById(p025ba.e.cfv_tv1);
            }
        });
        this.reqJsonStr = "";
        this.originPath = "";
        this.countDownSeconds = 10L;
        this.f28122L = context;
        View.inflate(context, p025ba.g.core_float_view, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getCfv_tv1() {
        Object value = this.f28126w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c() {
        if (this.f28123M == null) {
            this.f28123M = new a(this, this.countDownSeconds * ((long) 1000));
        }
        a aVar = this.f28123M;
        if (aVar != null) {
            aVar.start();
        }
        this.countDownFinished = false;
    }

    @NotNull
    public final Callback15 getCallBack() {
        Callback15 callback15 = this.callBack;
        if (callback15 != null) {
            return callback15;
        }
        Intrinsics.n("callBack");
        throw null;
    }

    public final boolean getCountDownFinished() {
        return this.countDownFinished;
    }

    public final long getCountDownSeconds() {
        return this.countDownSeconds;
    }

    @NotNull
    public final String getOriginPath() {
        return this.originPath;
    }

    @NotNull
    public final String getReqJsonStr() {
        return this.reqJsonStr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28118A = new p103gf.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.f28118A;
        if (aVar != null) {
            aVar.dispose();
        }
        a aVar2 = this.f28123M;
        if (aVar2 != null) {
            aVar2.cancel();
        }
    }

    public final void setCallBack(@NotNull Callback15 callback15) {
        Intrinsics.checkNotNullParameter(callback15, "<set-?>");
        this.callBack = callback15;
    }

    public final void setCountDownFinished(boolean z3) {
        this.countDownFinished = z3;
    }

    public final void setCountDownSeconds(long j6) {
        this.countDownSeconds = j6;
    }

    public final void setOriginPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originPath = str;
    }

    public final void setReqJsonStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reqJsonStr = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFloatingView(Context context, String reqJsonStr) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reqJsonStr, "reqJsonStr");
        final int i7 = 1;
        this.f28126w = C2131j.b(new Function0(this) { // from class: Oa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomFloatingView f6703b;

            {
                this.f6703b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomFloatingView customFloatingView = this.f6703b;
                switch (i7) {
                    case 0:
                        int i10 = CustomFloatingView.f28117p0;
                        break;
                    default:
                        int i11 = CustomFloatingView.f28117p0;
                        break;
                }
                return (TextView) customFloatingView.findViewById(p025ba.e.cfv_tv1);
            }
        });
        this.reqJsonStr = "";
        this.originPath = "";
        this.countDownSeconds = 10L;
        this.f28122L = context;
        View.inflate(context, p025ba.g.core_float_view, this);
        this.reqJsonStr = reqJsonStr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFloatingView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f28126w = C2131j.b(new Function0(this) { // from class: Oa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomFloatingView f6703b;

            {
                this.f6703b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomFloatingView customFloatingView = this.f6703b;
                switch (i7) {
                    case 0:
                        int i10 = CustomFloatingView.f28117p0;
                        break;
                    default:
                        int i11 = CustomFloatingView.f28117p0;
                        break;
                }
                return (TextView) customFloatingView.findViewById(p025ba.e.cfv_tv1);
            }
        });
        this.reqJsonStr = "";
        this.originPath = "";
        this.countDownSeconds = 10L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFloatingView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i10 = 0;
        this.f28126w = C2131j.b(new Function0(this) { // from class: Oa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomFloatingView f6703b;

            {
                this.f6703b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomFloatingView customFloatingView = this.f6703b;
                switch (i10) {
                    case 0:
                        int i11 = CustomFloatingView.f28117p0;
                        break;
                    default:
                        int i12 = CustomFloatingView.f28117p0;
                        break;
                }
                return (TextView) customFloatingView.findViewById(p025ba.e.cfv_tv1);
            }
        });
        this.reqJsonStr = "";
        this.originPath = "";
        this.countDownSeconds = 10L;
        this.f28122L = context;
        View.inflate(context, p025ba.g.core_float_view, this);
    }
}

package com.transsnet.palmpay.credit.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/view/CountdownTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/credit/view/CountdownTextView$CountdownListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setCountdownListener", "(Lcom/transsnet/palmpay/credit/view/CountdownTextView$CountdownListener;)V", "CountdownListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CountdownTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30725f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f30726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountdownListener f30729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30730e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/view/CountdownTextView$CountdownListener;", "", "onCountdownFinished", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CountdownListener {
        void onCountdownFinished();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30730e = "";
    }

    public final void b(long j6) {
        String str;
        long j10 = j6 / ((long) 1000);
        if (j10 == 0) {
            str = this.f30730e;
        } else {
            str = this.f30730e + "(" + j10 + " s)";
        }
        setText(str);
    }

    public final void setCountdownListener(@NotNull CountdownListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30729d = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30730e = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30730e = "";
    }
}

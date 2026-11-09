package I9;

import Ab.ViewOnClickListenerC0053e;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.cash_in.ui.view.ModelFundPaymentResultProgress;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.util.SpanUtils;
import java.lang.ref.WeakReference;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f4281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4282d;

    public /* synthetic */ d(int i7) {
        this.f4279a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4279a) {
            case 0:
                WeakReference weakReference = this.f4280b;
                TextView textView = weakReference != null ? (TextView) weakReference.get() : null;
                WeakReference weakReference2 = this.f4281c;
                TextView textView2 = weakReference2 != null ? (TextView) weakReference2.get() : null;
                if (textView != null) {
                    long jCurrentTimeMillis = this.f4282d - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0) {
                        textView.setText(k.core_processing);
                        if (!TextUtils.equals(ModelFundPaymentResultProgress.f27074g, "01")) {
                            if (textView2 != null && !TextUtils.isEmpty(ModelFundPaymentResultProgress.f27075i)) {
                                SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(ModelFundPaymentResultProgress.f27075i).append(textView2.getContext().getString(k.core_view_overtime_rewards)).setForegroundColor(textView2.getContext().getColor(L6.b.ppColorPrimary)).create();
                                textView2.setText(spannableStringBuilderCreate);
                                F6.d.h("debug_tag", 3, "6 tvPendingMsg. setText, pendingMessage: " + ((Object) spannableStringBuilderCreate));
                                textView2.setOnClickListener(new ViewOnClickListenerC0053e(20));
                                break;
                            }
                        } else {
                            textView2.setText(ModelFundPaymentResultProgress.f27075i);
                            textView2.setOnClickListener(null);
                            break;
                        }
                    } else {
                        textView.setText((jCurrentTimeMillis / 1000) + "S");
                        textView.postDelayed(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                WeakReference weakReference3 = this.f4280b;
                TextView textView3 = weakReference3 != null ? (TextView) weakReference3.get() : null;
                WeakReference weakReference4 = this.f4281c;
                TextView textView4 = weakReference4 != null ? (TextView) weakReference4.get() : null;
                if (textView3 != null) {
                    long jCurrentTimeMillis2 = this.f4282d - System.currentTimeMillis();
                    if (jCurrentTimeMillis2 <= 0) {
                        textView3.setText(k.core_processing);
                        if (!TextUtils.equals(ModelPaymentResultProgress.f28400g, "01")) {
                            if (textView4 != null && !TextUtils.isEmpty(ModelPaymentResultProgress.f28401i)) {
                                SpannableStringBuilder spannableStringBuilderCreate2 = new SpanUtils().append(ModelPaymentResultProgress.f28401i).append(textView4.getContext().getString(k.core_view_overtime_rewards)).setForegroundColor(textView4.getContext().getColor(L6.b.ppColorPrimary)).create();
                                textView4.setText(spannableStringBuilderCreate2);
                                F6.d.h("debug_tag", 3, "6 tvPendingMsg. setText, pendingMessage: " + ((Object) spannableStringBuilderCreate2));
                                textView4.setOnClickListener(new K8.a(28));
                                break;
                            }
                        } else {
                            textView4.setText(ModelPaymentResultProgress.f28401i);
                            textView4.setOnClickListener(null);
                            break;
                        }
                    } else {
                        textView3.setText((jCurrentTimeMillis2 / 1000) + "S");
                        textView3.postDelayed(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}

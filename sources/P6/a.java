package P6;

import L6.f;
import android.content.Context;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends O6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6999e;

    @Override // O6.a
    public final void a(Context context) {
        this.f6590a = context;
        getWindow().setDimAmount(0.1f);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        if (this.f6999e != 1) {
            ((TextView) findViewById(f.loading_msg)).setText(this.f6998d);
        } else {
            try {
                ((LottieAnimationView) findViewById(f.loadingAnim)).e();
            } catch (Exception unused) {
            }
        }
    }
}

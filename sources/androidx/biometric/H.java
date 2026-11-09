package androidx.biometric;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.TextView;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FingerprintDialogFragment f13069b;

    public /* synthetic */ H(FingerprintDialogFragment fingerprintDialogFragment, int i7) {
        this.f13068a = i7;
        this.f13069b = fingerprintDialogFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i7;
        switch (this.f13068a) {
            case 0:
                Integer num = (Integer) obj;
                FingerprintDialogFragment fingerprintDialogFragment = this.f13069b;
                Handler handler = fingerprintDialogFragment.f13061a;
                RunnableC0912p runnableC0912p = fingerprintDialogFragment.f13062b;
                handler.removeCallbacks(runnableC0912p);
                int iIntValue = num.intValue();
                if (fingerprintDialogFragment.f13066f != null) {
                    int i10 = fingerprintDialogFragment.f13063c.f13053p0;
                    Context context = fingerprintDialogFragment.getContext();
                    Drawable drawable = null;
                    if (context != null) {
                        if (i10 == 0 && iIntValue == 1) {
                            i7 = P.fingerprint_dialog_fp_icon;
                        } else if (i10 == 1 && iIntValue == 2) {
                            i7 = P.fingerprint_dialog_error;
                        } else if (i10 == 2 && iIntValue == 1) {
                            i7 = P.fingerprint_dialog_fp_icon;
                        } else if (i10 == 1 && iIntValue == 3) {
                            i7 = P.fingerprint_dialog_fp_icon;
                        }
                        drawable = context.getDrawable(i7);
                    }
                    if (drawable != null) {
                        fingerprintDialogFragment.f13066f.setImageDrawable(drawable);
                        if ((i10 != 0 || iIntValue != 1) && ((i10 == 1 && iIntValue == 2) || (i10 == 2 && iIntValue == 1))) {
                            I.a(drawable);
                        }
                        fingerprintDialogFragment.f13063c.f13053p0 = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = fingerprintDialogFragment.f13067g;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.f13064d : fingerprintDialogFragment.f13065e);
                }
                handler.postDelayed(runnableC0912p, 2000L);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                FingerprintDialogFragment fingerprintDialogFragment2 = this.f13069b;
                Handler handler2 = fingerprintDialogFragment2.f13061a;
                RunnableC0912p runnableC0912p2 = fingerprintDialogFragment2.f13062b;
                handler2.removeCallbacks(runnableC0912p2);
                TextView textView2 = fingerprintDialogFragment2.f13067g;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(runnableC0912p2, 2000L);
                break;
        }
    }
}

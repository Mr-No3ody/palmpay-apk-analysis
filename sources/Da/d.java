package Da;

import android.R;
import android.os.Build;
import android.widget.TextView;
import android.widget.Toast;
import com.didiglobal.booster.instrument.ShadowToast;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.web.JsInterface;
import com.transsnet.palmpay.p2pcash.ui.atm.view.BookingDetailView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1740b;

    public /* synthetic */ d(String str, int i7) {
        this.f1739a = i7;
        this.f1740b = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Toast toast;
        String str = this.f1740b;
        switch (this.f1739a) {
            case 0:
                PPRNBridge.showShortToast$lambda$32(str);
                break;
            case 1:
                PPRNBridge.showLongToast$lambda$33(str);
                break;
            case 2:
                if ("black".equalsIgnoreCase(str)) {
                    BarUtils.setStatusBarLightMode(ActivityUtils.getTopActivity(), true);
                } else if ("white".equalsIgnoreCase(str)) {
                    BarUtils.setStatusBarLightMode(ActivityUtils.getTopActivity(), false);
                }
                break;
            case 3:
                HashSet hashSet = JsInterface.f28583f;
                if ("black".equalsIgnoreCase(str)) {
                    BarUtils.setStatusBarLightMode(ActivityUtils.getTopActivity(), true);
                } else if ("white".equalsIgnoreCase(str)) {
                    BarUtils.setStatusBarLightMode(ActivityUtils.getTopActivity(), false);
                }
                break;
            case 4:
                int i7 = BookingDetailView.f32964j;
                ClipboardUtils.copyText(str);
                ToastUtils.showLong(Sc.e.p2p_str_copied);
                break;
            case 5:
                p279s5.n.f42043a.w(str);
                break;
            case 6:
                AppearanceModule.setColorScheme$lambda$0(str);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 30) {
                    ShadowToast.show(Toast.makeText(D3.a.f1587c, str, 1));
                } else {
                    try {
                        WeakReference weakReference = vh.b.f43213b;
                        if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                            toast.cancel();
                            vh.b.f43213b = null;
                        }
                        Toast toastMakeText = Toast.makeText(D3.a.f1587c, str, 1);
                        vh.b.f43213b = new WeakReference(toastMakeText);
                        TextView textView = (TextView) toastMakeText.getView().findViewById(R.id.message);
                        int currentTextColor = textView.getCurrentTextColor();
                        textView.setTextAppearance(R.style.TextAppearance);
                        int i10 = vh.b.f43219h;
                        if (i10 != -16777217) {
                            textView.setTextColor(i10);
                        } else {
                            textView.setTextColor(currentTextColor);
                        }
                        int i11 = vh.b.f43220i;
                        if (i11 != -1) {
                            textView.setTextSize(i11);
                        }
                        int i12 = vh.b.f43214c;
                        int i13 = vh.b.f43216e;
                        int i14 = vh.b.f43215d;
                        if (i12 != -1 || i14 != -1 || i13 != -1) {
                            toastMakeText.setGravity(i12, i14, i13);
                        }
                        textView.setGravity(17);
                        vh.b.a(toastMakeText, textView);
                        ShadowToast.show(toastMakeText);
                    } catch (Exception unused) {
                        ShadowToast.show(Toast.makeText(D3.a.f1587c, str, 1));
                    }
                }
                break;
        }
    }
}

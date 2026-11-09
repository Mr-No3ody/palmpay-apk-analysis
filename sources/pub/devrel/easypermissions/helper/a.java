package pub.devrel.easypermissions.helper;

import D4.f;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.Z;
import pub.devrel.easypermissions.RationaleDialogFragment;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Activity activity, int i7) {
        super(activity, 9);
        this.f41345c = i7;
    }

    @Override // D4.f
    public final void k(int i7, String... strArr) {
        switch (this.f41345c) {
            case 0:
                AbstractC1032a.g((Activity) this.f1592b, strArr, i7);
                break;
            default:
                AbstractC1032a.g((Activity) this.f1592b, strArr, i7);
                break;
        }
    }

    @Override // D4.f
    public final Context o() {
        switch (this.f41345c) {
            case 0:
                break;
        }
        return (Activity) this.f1592b;
    }

    @Override // D4.f
    public final boolean s(String str) {
        switch (this.f41345c) {
            case 0:
                break;
        }
        return AbstractC1032a.h((Activity) this.f1592b, str);
    }

    @Override // D4.f
    public final void t(String str, String str2, String str3, int i7, int i10, String... strArr) {
        switch (this.f41345c) {
            case 0:
                FragmentManager fragmentManager = ((Activity) this.f1592b).getFragmentManager();
                if (!(fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof RationaleDialogFragment)) {
                    RationaleDialogFragment rationaleDialogFragment = new RationaleDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("positiveButton", str2);
                    bundle.putString("negativeButton", str3);
                    bundle.putString("rationaleMsg", str);
                    bundle.putInt("theme", i7);
                    bundle.putInt("requestCode", i10);
                    bundle.putStringArray("permissions", strArr);
                    rationaleDialogFragment.setArguments(bundle);
                    if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !rationaleDialogFragment.f41342c) {
                        rationaleDialogFragment.show(fragmentManager, "RationaleDialogFragment");
                    }
                    break;
                }
                break;
            default:
                Z supportFragmentManager = ((AbstractActivityC0837o) ((Activity) this.f1592b)).getSupportFragmentManager();
                if (!(supportFragmentManager.E("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat)) {
                    RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("positiveButton", str2);
                    bundle2.putString("negativeButton", str3);
                    bundle2.putString("rationaleMsg", str);
                    bundle2.putInt("theme", i7);
                    bundle2.putInt("requestCode", i10);
                    bundle2.putStringArray("permissions", strArr);
                    rationaleDialogFragmentCompat.setArguments(bundle2);
                    if (!supportFragmentManager.P()) {
                        rationaleDialogFragmentCompat.show(supportFragmentManager, "RationaleDialogFragmentCompat");
                        break;
                    }
                }
                break;
        }
    }
}

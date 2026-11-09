package pub.devrel.easypermissions;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.transsnet.palmpay.custom_view.dialog.y;
import p192n.c;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({c.f39800a})
public class RationaleDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EasyPermissions$PermissionCallbacks f41340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EasyPermissions$RationaleCallbacks f41341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41342c = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions$PermissionCallbacks) {
                this.f41340a = (EasyPermissions$PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions$RationaleCallbacks) {
                this.f41341b = (EasyPermissions$RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions$PermissionCallbacks) {
            this.f41340a = (EasyPermissions$PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions$RationaleCallbacks) {
            this.f41341b = (EasyPermissions$RationaleCallbacks) context;
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        y yVar = new y(getArguments());
        EasyPermissions$PermissionCallbacks easyPermissions$PermissionCallbacks = this.f41340a;
        EasyPermissions$RationaleCallbacks easyPermissions$RationaleCallbacks = this.f41341b;
        dh.c cVar = new dh.c();
        cVar.f35979a = getActivity();
        cVar.f35980b = yVar;
        cVar.f35981c = easyPermissions$PermissionCallbacks;
        cVar.f35982d = easyPermissions$RationaleCallbacks;
        Activity activity = getActivity();
        int i7 = yVar.f31325c;
        return (i7 > 0 ? new AlertDialog.Builder(activity, i7) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton((String) yVar.f31323a, cVar).setNegativeButton((String) yVar.f31324b, cVar).setMessage((String) yVar.f31327e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f41340a = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.f41342c = true;
        super.onSaveInstanceState(bundle);
    }
}

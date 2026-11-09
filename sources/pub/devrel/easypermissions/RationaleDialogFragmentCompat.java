package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.app.C0833k;
import com.transsnet.palmpay.custom_view.dialog.y;
import p192n.c;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({c.f39800a})
public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EasyPermissions$PermissionCallbacks f41343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EasyPermissions$RationaleCallbacks f41344b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions$PermissionCallbacks) {
                this.f41343a = (EasyPermissions$PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions$RationaleCallbacks) {
                this.f41344b = (EasyPermissions$RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions$PermissionCallbacks) {
            this.f41343a = (EasyPermissions$PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions$RationaleCallbacks) {
            this.f41344b = (EasyPermissions$RationaleCallbacks) context;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        y yVar = new y(getArguments());
        EasyPermissions$PermissionCallbacks easyPermissions$PermissionCallbacks = this.f41343a;
        EasyPermissions$RationaleCallbacks easyPermissions$RationaleCallbacks = this.f41344b;
        dh.c cVar = new dh.c();
        cVar.f35979a = getParentFragment() != null ? getParentFragment() : getActivity();
        cVar.f35980b = yVar;
        cVar.f35981c = easyPermissions$PermissionCallbacks;
        cVar.f35982d = easyPermissions$RationaleCallbacks;
        Context context = getContext();
        int i7 = yVar.f31325c;
        return (i7 > 0 ? new C0833k(context, i7) : new C0833k(context)).setCancelable(false).setPositiveButton((String) yVar.f31323a, cVar).setNegativeButton((String) yVar.f31324b, cVar).setMessage((String) yVar.f31327e).create();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f41343a = null;
        this.f41344b = null;
    }
}

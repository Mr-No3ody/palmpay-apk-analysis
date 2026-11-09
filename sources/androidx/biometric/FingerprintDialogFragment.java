package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public class FingerprintDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13061a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0912p f13062b = new RunnableC0912p(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f13063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f13066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f13067g;

    private FingerprintDialogFragment() {
    }

    public static FingerprintDialogFragment h(boolean z3) {
        FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z3);
        fingerprintDialogFragment.setArguments(bundle);
        return fingerprintDialogFragment;
    }

    public final int g(int i7) {
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i7});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        A a3 = this.f13063c;
        if (a3.f13050k0 == null) {
            a3.f13050k0 = new androidx.lifecycle.F();
        }
        A.i(a3.f13050k0, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A aD = w.d(this, getArguments().getBoolean("host_activity", true));
        this.f13063c = aD;
        if (aD.f13054q0 == null) {
            aD.f13054q0 = new androidx.lifecycle.F();
        }
        aD.f13054q0.e(this, new H(this, 0));
        A a3 = this.f13063c;
        if (a3.f13055r0 == null) {
            a3.f13055r0 = new androidx.lifecycle.F();
        }
        a3.f13055r0.e(this, new H(this, 1));
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13064d = g(J.a());
        } else {
            Context context = getContext();
            this.f13064d = context != null ? context.getColor(O.biometric_error_color) : 0;
        }
        this.f13065e = g(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        C0833k c0833k = new C0833k(requireContext());
        v vVar = this.f13063c.f13046f;
        String string = null;
        c0833k.setTitle(vVar != null ? vVar.f13097a : null);
        View viewInflate = LayoutInflater.from(c0833k.getContext()).inflate(S.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(Q.fingerprint_subtitle);
        if (textView != null) {
            v vVar2 = this.f13063c.f13046f;
            String str = vVar2 != null ? vVar2.f13098b : null;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(Q.fingerprint_description);
        if (textView2 != null) {
            this.f13063c.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f13066f = (ImageView) viewInflate.findViewById(Q.fingerprint_icon);
        this.f13067g = (TextView) viewInflate.findViewById(Q.fingerprint_error);
        if (com.palmpay.lib.apm.launchcounter.util.d.A(this.f13063c.d())) {
            string = getString(T.confirm_device_credential_password);
        } else {
            A a3 = this.f13063c;
            String str2 = a3.f13052p;
            if (str2 != null) {
                string = str2;
            } else {
                v vVar3 = a3.f13046f;
                if (vVar3 != null && (string = vVar3.f13099c) == null) {
                    string = "";
                }
            }
        }
        c0833k.setNegativeButton(string, new z(this));
        c0833k.setView(viewInflate);
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = c0833k.create();
        dialogInterfaceC0834lCreate.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0834lCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f13061a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        A a3 = this.f13063c;
        a3.f13053p0 = 0;
        a3.g(1);
        this.f13063c.f(getString(T.fingerprint_dialog_touch_sensor));
    }
}

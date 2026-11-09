package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f17576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f17577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f17578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f17579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f17580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BitmapDrawable f17582g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17583i;

    public final DialogPreference g() {
        if (this.f17576a == null) {
            this.f17576a = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f17576a;
    }

    public void h(View view) {
        int i7;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f17580e;
            if (TextUtils.isEmpty(charSequence)) {
                i7 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i7 = 0;
            }
            if (viewFindViewById.getVisibility() != i7) {
                viewFindViewById.setVisibility(i7);
            }
        }
    }

    public abstract void i(boolean z3);

    public void j(C0833k c0833k) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f17583i = i7;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f17577b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f17578c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f17579d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f17580e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f17581f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f17582g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.findPreference(string);
        this.f17576a = dialogPreference;
        this.f17577b = dialogPreference.f17510C0;
        this.f17578c = dialogPreference.f17513F0;
        this.f17579d = dialogPreference.f17514G0;
        this.f17580e = dialogPreference.f17511D0;
        this.f17581f = dialogPreference.f17515H0;
        Drawable drawable = dialogPreference.f17512E0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f17582g = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f17582g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.fragment.app.E activity = getActivity();
        this.f17583i = -2;
        C0833k c0833k = new C0833k(activity);
        c0833k.setTitle(this.f17577b);
        c0833k.setIcon(this.f17582g);
        c0833k.setPositiveButton(this.f17578c, this);
        c0833k.setNegativeButton(this.f17579d, this);
        int i7 = this.f17581f;
        View viewInflate = i7 != 0 ? LayoutInflater.from(activity).inflate(i7, (ViewGroup) null) : null;
        if (viewInflate != null) {
            h(viewInflate);
            c0833k.setView(viewInflate);
        } else {
            c0833k.setMessage(this.f17580e);
        }
        j(c0833k);
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = c0833k.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            dialogInterfaceC0834lCreate.getWindow().setSoftInputMode(5);
        }
        return dialogInterfaceC0834lCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i(this.f17583i == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f17577b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f17578c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f17579d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f17580e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f17581f);
        BitmapDrawable bitmapDrawable = this.f17582g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}

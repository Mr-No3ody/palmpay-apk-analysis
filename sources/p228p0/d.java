package p228p0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f41156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f41157b;

    public d(TextView textView) {
        this.f41156a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f41156a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i10);
                }
                return i.a().g(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        i iVarA = i.a();
        if (this.f41157b == null) {
            this.f41157b = new c(textView, this);
        }
        iVarA.h(this.f41157b);
        return charSequence;
    }
}

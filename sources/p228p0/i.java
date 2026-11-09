package p228p0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f41165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f41166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41167c = true;

    public i(EditText editText) {
        this.f41165a = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                iVarA.getClass();
                length = editableText.length();
            }
            iVarA.g(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) throws Throwable {
        EditText editText = this.f41165a;
        if (!editText.isInEditMode() && this.f41167c && androidx.emoji2.text.i.d() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int iB = androidx.emoji2.text.i.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    androidx.emoji2.text.i.a().g((Spannable) charSequence, i7, i11 + i7);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
            if (this.f41166b == null) {
                this.f41166b = new h(editText);
            }
            iVarA.h(this.f41166b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}

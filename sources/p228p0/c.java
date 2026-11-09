package p228p0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.g;
import androidx.emoji2.text.i;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f41154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f41155b;

    public c(TextView textView, d dVar) {
        this.f41154a = new WeakReference(textView);
        this.f41155b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.g
    public final void b() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f41154a.get();
        InputFilter inputFilter = (InputFilter) this.f41155b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    i iVarA = i.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        iVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceG = iVarA.g(text, 0, length);
                    if (text == charSequenceG) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceG);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                    textView.setText(charSequenceG);
                    if (charSequenceG instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceG;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}

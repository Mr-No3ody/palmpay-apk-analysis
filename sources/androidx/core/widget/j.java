package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1054f;
import androidx.core.view.OnReceiveContentListener;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j implements OnReceiveContentListener {
    @Override // androidx.core.view.OnReceiveContentListener
    public final C1054f onReceiveContent(View view, C1054f c1054f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c1054f);
        }
        if (c1054f.c() == 2) {
            return c1054f;
        }
        ClipData clipDataA = c1054f.a();
        int iB = c1054f.b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i7 = 0; i7 < clipDataA.getItemCount(); i7++) {
            ClipData.Item itemAt = clipDataA.getItemAt(i7);
            if ((iB & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z3 = true;
                }
            }
        }
        return null;
    }
}

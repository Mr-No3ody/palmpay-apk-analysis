package p228p0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.f;
import androidx.emoji2.text.i;
import java.nio.ByteBuffer;
import org.sufficientlysecure.htmltextview.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f41152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f41153b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        h hVar = new h(10);
        super(inputConnection, false);
        this.f41152a = editText;
        this.f41153b = hVar;
        if (i.d()) {
            i iVarA = i.a();
            if (iVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            f fVar = iVarA.f16893e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) fVar.f16886c.f6553a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f348d).getInt(iA + bVar.f345a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f16884a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f41152a.getEditableText();
        this.f41153b.getClass();
        return h.a(this, editableText, i7, i10, false) || super.deleteSurroundingText(i7, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f41152a.getEditableText();
        this.f41153b.getClass();
        return h.a(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10);
    }
}

package org.sufficientlysecure.htmltextview;

import android.text.Editable;
import androidx.annotation.Nullable;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes4.dex */
public interface WrapperTagHandler {
    boolean handleTag(boolean z3, String str, Editable editable, @Nullable Attributes attributes);
}

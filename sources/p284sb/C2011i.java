package p284sb;

import F6.d;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sb.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2011i implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
        d.h("beforeTextChanged: " + ((Object) s3), 3, new Object[0]);
        s3.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
        d.h("onTextChanged: " + ((Object) s3), 3, new Object[0]);
    }
}

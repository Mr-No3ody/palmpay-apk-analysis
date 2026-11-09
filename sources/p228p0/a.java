package p228p0;

import android.text.Editable;
import androidx.emoji2.text.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41149a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f41150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f41151c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41151c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}

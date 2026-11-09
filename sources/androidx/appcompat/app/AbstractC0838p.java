package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0838p {
    @DoNotInline
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }
}

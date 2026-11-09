package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i implements LocaleListInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f16099a;

    public i(LocaleList localeList) {
        this.f16099a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.f16099a.equals(((LocaleListInterface) obj).getLocaleList());
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale get(int i7) {
        return this.f16099a.get(i7);
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale getFirstMatch(String[] strArr) {
        return this.f16099a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return this.f16099a;
    }

    public final int hashCode() {
        return this.f16099a.hashCode();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int indexOf(Locale locale) {
        return this.f16099a.indexOf(locale);
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean isEmpty() {
        return this.f16099a.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int size() {
        return this.f16099a.size();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final String toLanguageTags() {
        return this.f16099a.toLanguageTags();
    }

    public final String toString() {
        return this.f16099a.toString();
    }
}

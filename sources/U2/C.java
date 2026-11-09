package U2;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.facebook.hermes.intl.ILocaleObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C implements ILocaleObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ULocale f9108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ULocale.Builder f9109b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9110c = false;

    public C(ULocale uLocale) {
        this.f9108a = uLocale;
    }

    public final void a() throws B {
        if (this.f9110c) {
            try {
                this.f9108a = this.f9109b.build();
                this.f9110c = false;
            } catch (RuntimeException e10) {
                throw new B(e10.getMessage(), 0);
            }
        }
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final ILocaleObject cloneObject() throws B {
        a();
        return new C(this.f9108a);
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final Object getLocale() throws B {
        a();
        return this.f9108a;
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final Object getLocaleWithoutExtensions() throws B {
        a();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f9108a);
        builder.clearExtensions();
        return builder.build();
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final ArrayList getUnicodeExtensions(String str) throws B {
        a();
        G.h hVar = E.f9111a;
        if (hVar.containsKey(str)) {
            str = (String) hVar.get(str);
        }
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f9108a.getKeywordValue(str);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final void setUnicodeExtensions(String str, ArrayList arrayList) throws B {
        a();
        if (this.f9109b == null) {
            this.f9109b = new ULocale.Builder().setLocale(this.f9108a);
        }
        try {
            this.f9109b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f9110c = true;
        } catch (RuntimeException e10) {
            throw new B(e10.getMessage(), 0);
        }
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final String toCanonicalTag() throws B {
        a();
        return this.f9108a.toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final String toCanonicalTagWithoutExtensions() throws B {
        a();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f9108a);
        builder.clearExtensions();
        return builder.build().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.ILocaleObject
    public final HashMap getUnicodeExtensions() throws B {
        a();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f9108a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                G.h hVar = E.f9112b;
                map.put(hVar.containsKey(next) ? (String) hVar.get(next) : next, this.f9108a.getKeywordValue(next));
            }
        }
        return map;
    }
}

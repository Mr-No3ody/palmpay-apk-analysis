package p314uf;

import Xe.d;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.AbstractMap;
import p134j.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f42997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Exception f42999c;

    public c(d dVar, Object obj, Exception exc) {
        this.f42997a = dVar;
        this.f42998b = obj;
        this.f42999c = exc;
    }

    @Override // p134j.e
    public final boolean a() {
        return this.f42999c == null;
    }

    @Override // p134j.e
    public final Exception b() {
        return this.f42999c;
    }

    @Override // p134j.e
    public final Object get() {
        return this.f42998b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        d dVar = this.f42997a;
        if (dVar != null) {
            for (String str : ((AbstractMap) dVar.f1592b).keySet()) {
                for (String str2 : dVar.i(str)) {
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(": ");
                    }
                    sb2.append(str2);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        }
        Object obj = this.f42998b;
        if (obj != null) {
            sb2.append(obj.toString());
        }
        return sb2.toString();
    }
}

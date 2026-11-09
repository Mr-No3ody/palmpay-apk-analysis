package P5;

import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6935b = new a(ViewProps.NONE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6936a;

    public a(String str) {
        this.f6936a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6936a.equals(((a) obj).f6936a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6936a.hashCode();
    }

    public final String toString() {
        return this.f6936a;
    }
}

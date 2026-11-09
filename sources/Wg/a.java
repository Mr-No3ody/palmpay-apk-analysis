package Wg;

import java.util.Date;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(new Class[]{Date.class, Number.class}),
    /* JADX INFO: Fake field, exist only in values array */
    NUMBER(new Class[]{Number.class});


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class[] f10924a;

    a(Class[] clsArr) {
        this.f10924a = clsArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(name());
        Class[] clsArr = this.f10924a;
        if (clsArr == null) {
            sb2.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class cls : clsArr) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb2.append(stringJoiner);
        }
        return sb2.toString();
    }
}

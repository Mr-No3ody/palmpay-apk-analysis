package C0;

import N8.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f998o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Class type) {
        super(type, 0);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.f998o = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // C0.c0, C0.d0
    public final String b() {
        String name = this.f998o.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // C0.c0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String value) {
        Object obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.f998o;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i7];
            if (kotlin.text.y.h(((Enum) obj).name(), value, true)) {
                break;
            }
            i7++;
        }
        Enum r10 = (Enum) obj;
        if (r10 != null) {
            return r10;
        }
        StringBuilder sbQ = q0.q("Enum value ", value, " not found for type ");
        sbQ.append(cls.getName());
        sbQ.append('.');
        throw new IllegalArgumentException(sbQ.toString());
    }
}

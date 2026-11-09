package androidx.camera.core.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14001a = Collections.unmodifiableSet(EnumSet.of(EnumC1009x.f14282d, EnumC1009x.f14283e, EnumC1009x.f14284f, EnumC1009x.f14285g));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f14002b = Collections.unmodifiableSet(EnumSet.of(EnumC1011z.f14302d, EnumC1011z.f14299a));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f14003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f14004d;

    static {
        EnumC1007v enumC1007v = EnumC1007v.f14268e;
        EnumC1007v enumC1007v2 = EnumC1007v.f14267d;
        EnumC1007v enumC1007v3 = EnumC1007v.f14264a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC1007v, enumC1007v2, enumC1007v3));
        f14003c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC1007v2);
        enumSetCopyOf.remove(enumC1007v3);
        f14004d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}

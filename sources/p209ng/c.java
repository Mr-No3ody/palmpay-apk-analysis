package p209ng;

import kotlin.collections.A;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39974a;

    static {
        A class2ContextualFactory = G.c();
        A polyBase2Serializers = G.c();
        A polyBase2DefaultSerializerProvider = G.c();
        A polyBase2NamedSerializers = G.c();
        A polyBase2DefaultDeserializerProvider = G.c();
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        f39974a = new a();
    }
}

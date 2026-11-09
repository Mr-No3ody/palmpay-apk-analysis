package g3;

import kotlin.jvm.internal.Intrinsics;
import p109h3.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, e encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f36841a = encodedImage;
    }
}

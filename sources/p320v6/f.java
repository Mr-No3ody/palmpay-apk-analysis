package p320v6;

import com.palmpay.lib.liveness.model.UploadRequest;
import com.palmpay.lib.liveness.model.UploadRequestV2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p184m8.b;
import retrofit2.AbstractC1989g;
import retrofit2.Converter;
import retrofit2.N;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC1989g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f43090a = new f();

    @Override // retrofit2.AbstractC1989g
    public final Converter a(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, N retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (Intrinsics.c(type, UploadRequest.class)) {
            return new b(19);
        }
        if (Intrinsics.c(type, UploadRequestV2.class)) {
            return new b(20);
        }
        return null;
    }
}

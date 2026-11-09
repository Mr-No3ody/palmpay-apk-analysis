package okhttp3;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class O {
    public /* synthetic */ O(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final P create(@NotNull c0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return create(null, body);
    }

    @JvmStatic
    @NotNull
    public final P createFormData(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return createFormData(name, null, b0.create$default(c0.Companion, value, (L) null, 1, (Object) null));
    }

    private O() {
    }

    @JvmStatic
    @NotNull
    public final P create(@Nullable F f10, @NotNull c0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        if ((f10 != null ? f10.a(HttpHeaders.CONTENT_TYPE) : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if ((f10 != null ? f10.a(HttpHeaders.CONTENT_LENGTH) : null) == null) {
            return new P(f10, body);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    @JvmStatic
    @NotNull
    public final P createFormData(@NotNull String name, @Nullable String str, @NotNull c0 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("form-data; name=");
        N n10 = Q.f40602e;
        n10.appendQuotedString$okhttp(sb2, name);
        if (str != null) {
            sb2.append("; filename=");
            n10.appendQuotedString$okhttp(sb2, str);
        }
        String value = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
        ArrayList arrayList = new ArrayList(20);
        Intrinsics.checkNotNullParameter(HttpHeaders.CONTENT_DISPOSITION, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        F.f40566b.checkName(HttpHeaders.CONTENT_DISPOSITION);
        Intrinsics.checkNotNullParameter(HttpHeaders.CONTENT_DISPOSITION, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        arrayList.add(HttpHeaders.CONTENT_DISPOSITION);
        arrayList.add(StringsKt.V(value).toString());
        return create(new F((String[]) arrayList.toArray(new String[0])), body);
    }
}

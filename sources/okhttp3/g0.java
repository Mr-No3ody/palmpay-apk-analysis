package okhttp3;

import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    public /* synthetic */ g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ h0 create$default(g0 g0Var, String str, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return g0Var.create(str, l5);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final h0 create(@NotNull String str, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charset = Charsets.UTF_8;
        if (l5 != null) {
            K k2 = L.f40589e;
            Charset charsetA = l5.a(null);
            if (charsetA == null) {
                l5 = L.f40589e.parse(l5 + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        Pg.k kVar = new Pg.k();
        kVar.t(str, charset);
        return create(kVar, l5, kVar.f7358b);
    }

    private g0() {
    }

    public static /* synthetic */ h0 create$default(g0 g0Var, byte[] bArr, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return g0Var.create(bArr, l5);
    }

    public static /* synthetic */ h0 create$default(g0 g0Var, Pg.m mVar, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return g0Var.create(mVar, l5);
    }

    public static /* synthetic */ h0 create$default(g0 g0Var, BufferedSource bufferedSource, L l5, long j6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        if ((i7 & 2) != 0) {
            j6 = -1;
        }
        return g0Var.create(bufferedSource, l5, j6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final h0 create(@NotNull byte[] bArr, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Pg.k kVar = new Pg.k();
        kVar.k(bArr);
        return create(kVar, l5, bArr.length);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final h0 create(@NotNull Pg.m mVar, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Pg.k kVar = new Pg.k();
        kVar.i(mVar);
        return create(kVar, l5, mVar.d());
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final h0 create(@NotNull BufferedSource bufferedSource, @Nullable L l5, long j6) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return new Hg.g(l5, j6, bufferedSource);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public final h0 create(@Nullable L l5, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public final h0 create(@Nullable L l5, @NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public final h0 create(@Nullable L l5, @NotNull Pg.m content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public final h0 create(@Nullable L l5, long j6, @NotNull BufferedSource content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5, j6);
    }
}

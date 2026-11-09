package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    public /* synthetic */ b0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ c0 create$default(b0 b0Var, String str, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return b0Var.create(str, l5);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public final c0 create(@Nullable L l5, @NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create$default(this, l5, content, 0, 0, 12, (Object) null);
    }

    private b0() {
    }

    public static /* synthetic */ c0 create$default(b0 b0Var, Pg.m mVar, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return b0Var.create(mVar, l5);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public final c0 create(@Nullable L l5, @NotNull byte[] content, int i7) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create$default(this, l5, content, i7, 0, 8, (Object) null);
    }

    public static /* synthetic */ c0 create$default(b0 b0Var, byte[] bArr, L l5, int i7, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l5 = null;
        }
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return b0Var.create(bArr, l5, i7, i10);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public final c0 create(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return create$default(this, bArr, (L) null, 0, 0, 7, (Object) null);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public final c0 create(@NotNull byte[] bArr, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return create$default(this, bArr, l5, 0, 0, 6, (Object) null);
    }

    public static /* synthetic */ c0 create$default(b0 b0Var, File file, L l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = null;
        }
        return b0Var.create(file, l5);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public final c0 create(@NotNull byte[] bArr, @Nullable L l5, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return create$default(this, bArr, l5, i7, 0, 4, (Object) null);
    }

    public static /* synthetic */ c0 create$default(b0 b0Var, L l5, byte[] bArr, int i7, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return b0Var.create(l5, bArr, i7, i10);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final c0 create(@NotNull String str, @Nullable L l5) {
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
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return create(bytes, l5, 0, bytes.length);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final c0 create(@NotNull Pg.m mVar, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new Z(l5, mVar, 1);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public final c0 create(@NotNull byte[] bArr, @Nullable L l5, int i7, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long length = bArr.length;
        long j6 = i7;
        long j10 = i10;
        byte[] bArr2 = Dg.c.f1879a;
        if ((j6 | j10) >= 0 && j6 <= length && length - j6 >= j10) {
            return new a0(l5, bArr, i10, i7);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public final c0 create(@NotNull File file, @Nullable L l5) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new Z(l5, file, 0);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public final c0 create(@Nullable L l5, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public final c0 create(@Nullable L l5, @NotNull Pg.m content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public final c0 create(@Nullable L l5, @NotNull byte[] content, int i7, int i10) {
        Intrinsics.checkNotNullParameter(content, "content");
        return create(content, l5, i7, i10);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public final c0 create(@Nullable L l5, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return create(file, l5);
    }
}

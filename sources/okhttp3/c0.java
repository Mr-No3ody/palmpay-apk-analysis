package okhttp3;

import java.io.File;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 {

    @NotNull
    public static final b0 Companion = new b0(null);

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final c0 create(@NotNull Pg.m mVar, @Nullable L l5) {
        return Companion.create(mVar, l5);
    }

    public abstract long contentLength();

    public abstract L contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final c0 create(@NotNull File file, @Nullable L l5) {
        return Companion.create(file, l5);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final c0 create(@NotNull String str, @Nullable L l5) {
        return Companion.create(str, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final c0 create(@Nullable L l5, @NotNull Pg.m mVar) {
        return Companion.create(l5, mVar);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final c0 create(@Nullable L l5, @NotNull File file) {
        return Companion.create(l5, file);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final c0 create(@Nullable L l5, @NotNull String str) {
        return Companion.create(l5, str);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final c0 create(@Nullable L l5, @NotNull byte[] bArr) {
        return Companion.create(l5, bArr);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final c0 create(@Nullable L l5, @NotNull byte[] bArr, int i7) {
        return Companion.create(l5, bArr, i7);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final c0 create(@Nullable L l5, @NotNull byte[] bArr, int i7, int i10) {
        return Companion.create(l5, bArr, i7, i10);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final c0 create(@NotNull byte[] bArr) {
        return Companion.create(bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final c0 create(@NotNull byte[] bArr, @Nullable L l5) {
        return Companion.create(bArr, l5);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final c0 create(@NotNull byte[] bArr, @Nullable L l5, int i7) {
        return Companion.create(bArr, l5, i7);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final c0 create(@NotNull byte[] bArr, @Nullable L l5, int i7, int i10) {
        return Companion.create(bArr, l5, i7, i10);
    }
}

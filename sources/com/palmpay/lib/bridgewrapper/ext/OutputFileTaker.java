package com.palmpay.lib.bridgewrapper.ext;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/ext/OutputFileTaker;", "", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "setFile", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OutputFileTaker {

    @Nullable
    private File file;

    /* JADX WARN: Multi-variable type inference failed */
    public OutputFileTaker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public OutputFileTaker(@Nullable File file) {
        this.file = file;
    }

    public /* synthetic */ OutputFileTaker(File file, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : file);
    }
}

package com.abedelazizshe.lightcompressorlibrary.config;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/abedelazizshe/lightcompressorlibrary/config/StorageConfiguration;", "", "createFileToSave", "Ljava/io/File;", "context", "Landroid/content/Context;", "videoFile", "fileName", "", "shouldSave", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface StorageConfiguration {
    @NotNull
    File createFileToSave(@NotNull Context context, @NotNull File videoFile, @NotNull String fileName, boolean shouldSave);
}

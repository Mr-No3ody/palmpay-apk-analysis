package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p381za.c;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    public LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public String getVersion(@NonNull String str) throws Throwable {
        IOException e10;
        String str2;
        InputStream resourceAsStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = LibraryVersion.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        GmsLogger gmsLogger = zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        gmsLogger.v("LibraryVersion", sb2.toString());
                    } else {
                        GmsLogger gmsLogger2 = zza;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        gmsLogger2.w("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    String str3 = property;
                    inputStream = resourceAsStream;
                    str2 = str3;
                    GmsLogger gmsLogger3 = zza;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    gmsLogger3.e("LibraryVersion", sb4.toString(), e10);
                    InputStream inputStream2 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
                str2 = null;
            }
            if (resourceAsStream != null) {
                IOUtils.closeQuietly(resourceAsStream);
            }
            if (property == null) {
                zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = c.UNKNOWN_PROCESS_NAME;
            }
            this.zzc.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

package com.google.maps.android;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "ZERO_RESULTS", "NOT_FOUND", "REQUEST_DENIED", "OVER_QUERY_LIMIT", "INVALID_REQUEST", "UNKNOWN_ERROR", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Status {
    OK,
    ZERO_RESULTS,
    NOT_FOUND,
    REQUEST_DENIED,
    OVER_QUERY_LIMIT,
    INVALID_REQUEST,
    UNKNOWN_ERROR;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.n(values());

    @NotNull
    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }
}

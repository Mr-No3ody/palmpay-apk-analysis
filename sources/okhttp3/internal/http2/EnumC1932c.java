package okhttp3.internal.http2;

/* JADX INFO: renamed from: okhttp3.internal.http2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1932c {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TIMEOUT(4),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CLOSED(5),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESSION_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_ERROR(10),
    /* JADX INFO: Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11),
    /* JADX INFO: Fake field, exist only in values array */
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1931b f40803b = new C1931b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40811a;

    EnumC1932c(int i7) {
        this.f40811a = i7;
    }
}

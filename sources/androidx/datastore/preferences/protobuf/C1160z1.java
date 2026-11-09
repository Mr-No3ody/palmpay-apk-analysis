package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1160z1 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16816a;

    public static C1160z1 a() {
        return new C1160z1("Protocol message contained an invalid tag (zero).");
    }

    public static C1160z1 b() {
        return new C1160z1("Protocol message had invalid UTF-8.");
    }

    public static C1157y1 c() {
        return new C1157y1("Protocol message tag had invalid wire type.");
    }

    public static C1160z1 d() {
        return new C1160z1("CodedInputStream encountered a malformed varint.");
    }

    public static C1160z1 e() {
        return new C1160z1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1160z1 f() {
        return new C1160z1("Failed to parse the message.");
    }

    public static C1160z1 g() {
        return new C1160z1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

package p121i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f37407a = {new a("READ_DECODE", 0), new a("READ_FILE", 1), new a("READ_FILE_NOT_FOUND", 2), new a("READ_INVALID_ENTRY", 3), new a("WRITE_ENCODE", 4), new a("WRITE_CREATE_TEMPFILE", 5), new a("WRITE_UPDATE_FILE_NOT_FOUND", 6), new a("WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND", 7), new a("WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND", 8), new a("WRITE_RENAME_FILE_OTHER", 9), new a("WRITE_CREATE_DIR", 10), new a("WRITE_CALLBACK_ERROR", 11), new a("WRITE_INVALID_ENTRY", 12), new a("DELETE_FILE", 13), new a("EVICTION", 14), new a("GENERIC_IO", 15), new a("OTHER", 16)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f37407a.clone();
    }
}

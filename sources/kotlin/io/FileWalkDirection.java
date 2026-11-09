package kotlin.io;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileWalkDirection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f38944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f38945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f38946c;

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        f38944a = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        f38945b = fileWalkDirection2;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        f38946c = fileWalkDirectionArr;
        b.n(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f38946c.clone();
    }
}

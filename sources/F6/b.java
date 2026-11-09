package F6;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2599a;

    public /* synthetic */ b(int i7) {
        this.f2599a = i7;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f2599a) {
            case 0:
                d.f2604d.getClass();
                return str.matches("^util_[0-9]{8}_.*$");
            default:
                return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }
}

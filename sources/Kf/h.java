package Kf;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f5470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f5472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f5472e = iVar;
    }

    @Override // Kf.j
    public final File a() {
        Function2 function2;
        boolean z3 = this.f5469b;
        i iVar = this.f5472e;
        File file = this.f5475a;
        if (z3) {
            File[] fileArr = this.f5470c;
            if (fileArr == null || this.f5471d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f5470c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = iVar.f5474d.f5480e) != null) {
                        function2.invoke(file, new a(this.f5475a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f5470c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = iVar.f5474d.f5479d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f5470c;
                Intrinsics.e(fileArr3);
                int i7 = this.f5471d;
                this.f5471d = i7 + 1;
                return fileArr3[i7];
            }
            Function1 function3 = iVar.f5474d.f5479d;
            if (function3 != null) {
                function3.invoke(file);
                return null;
            }
        } else {
            Function1 function4 = iVar.f5474d.f5478c;
            if (function4 == null || ((Boolean) function4.invoke(file)).booleanValue()) {
                this.f5469b = true;
                return file;
            }
        }
        return null;
    }
}

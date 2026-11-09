package Kf;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f5464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f5467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f5467f = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    @Override // Kf.j
    public final File a() {
        File[] fileArr;
        Function1 function1;
        boolean z3 = this.f5466e;
        i iVar = this.f5467f;
        File file = this.f5475a;
        if (z3 || this.f5464c != null) {
            fileArr = this.f5464c;
            if (fileArr == null && this.f5465d < fileArr.length) {
                Intrinsics.e(fileArr);
                int i7 = this.f5465d;
                this.f5465d = i7 + 1;
                return fileArr[i7];
            }
            if (!this.f5463b) {
                this.f5463b = true;
                return file;
            }
            function1 = iVar.f5474d.f5479d;
            if (function1 != null) {
                function1.invoke(file);
            }
        } else {
            Function1 function2 = iVar.f5474d.f5478c;
            if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
                File[] fileArrListFiles = file.listFiles();
                this.f5464c = fileArrListFiles;
                if (fileArrListFiles == null) {
                    Function2 function3 = iVar.f5474d.f5480e;
                    if (function3 != null) {
                        function3.invoke(file, new a(this.f5475a, null, "Cannot list files in a directory", 2, null));
                    }
                    this.f5466e = true;
                }
                fileArr = this.f5464c;
                if (fileArr == null) {
                }
                if (!this.f5463b) {
                    this.f5463b = true;
                    return file;
                }
                function1 = iVar.f5474d.f5479d;
                if (function1 != null) {
                    function1.invoke(file);
                }
            }
        }
        return null;
    }
}

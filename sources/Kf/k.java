package Kf;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f5477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f5478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f5479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f5480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5481f;

    public k(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i10 & 2) != 0 ? FileWalkDirection.f38944a : fileWalkDirection;
        i7 = (i10 & 32) != 0 ? Integer.MAX_VALUE : i7;
        this.f5476a = file;
        this.f5477b = fileWalkDirection;
        this.f5478c = function1;
        this.f5479d = function2;
        this.f5480e = function3;
        this.f5481f = i7;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i(this);
    }
}

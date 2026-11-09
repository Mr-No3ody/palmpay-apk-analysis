package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f17795a;

    public w(String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f17795a = tables;
    }

    public abstract void a(Set set);
}

package androidx.core.view;

import android.view.Menu;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: androidx.core.view.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064p implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Menu f16273a;

    public C1064p(Menu menu) {
        this.f16273a = menu;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new C1065q(this.f16273a);
    }
}

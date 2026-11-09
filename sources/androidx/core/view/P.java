package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f16175a;

    public P(ViewGroup viewGroup) {
        this.f16175a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new Q(this.f16175a);
    }
}

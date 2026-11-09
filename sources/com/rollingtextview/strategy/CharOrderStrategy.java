package com.rollingtextview.strategy;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import p365y7.a;
import p379z7.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\t\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\t\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005j\u0002`\bH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u00052\u0006\u0010\u0017\u001a\u00020\rH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/rollingtextview/strategy/CharOrderStrategy;", "", "", "sourceText", "targetText", "", "", "", "Lcom/rollingtextview/strategy/CharPool;", "charPool", "", "beforeCompute", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)V", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Pair;", "Lz7/b;", "findCharOrder", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/util/List;)Lkotlin/Pair;", "Ly7/b;", "previousProgress", "columnIndex", "columns", "charIndex", "Ly7/a;", "nextProgress", "(Ly7/b;ILjava/util/List;I)Ly7/a;", "afterCompute", "()V", "lib_rollingtextview_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface CharOrderStrategy {
    void afterCompute();

    void beforeCompute(@NotNull CharSequence sourceText, @NotNull CharSequence targetText, @NotNull List<? extends Collection<Character>> charPool);

    @NotNull
    Pair<List<Character>, b> findCharOrder(@NotNull CharSequence sourceText, @NotNull CharSequence targetText, int index, @NotNull List<? extends Collection<Character>> charPool);

    @NotNull
    a nextProgress(@NotNull p365y7.b previousProgress, int columnIndex, @NotNull List<? extends List<Character>> columns, int charIndex);
}

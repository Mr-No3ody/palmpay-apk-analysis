package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes4.dex */
public interface AppendOnlyLinkedArrayList$NonThrowingPredicate<T> extends Predicate<T> {
    @Override // io.reactivex.functions.Predicate
    boolean test(T t);
}

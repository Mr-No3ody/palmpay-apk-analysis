package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    private InstanceFactory(T instance) {
        this.instance = instance;
    }

    public static <T> Factory<T> create(T instance) {
        return new InstanceFactory(Preconditions.checkNotNull(instance, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T instance) {
        return instance == null ? nullInstanceFactory() : new InstanceFactory(instance);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.instance;
    }
}

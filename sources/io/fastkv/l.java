package io.fastkv;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f37641c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37643b;

    public l(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("path is empty");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.f37642a = str.endsWith("/") ? str : str.concat("/");
        this.f37643b = str2;
    }
}

package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f21460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkFetcher.Callback f21461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f21462c;

    public A(D d2, C c6, NetworkFetcher.Callback callback) {
        this.f21462c = d2;
        this.f21460a = c6;
        this.f21461b = callback;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:39:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.imagepipeline.producers.NetworkFetcher$Callback] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionA;
        C c6 = this.f21460a;
        ?? r3 = this.f21461b;
        D d2 = this.f21462c;
        ?? inputStream = 0;
        ?? r10 = 0;
        inputStream = 0;
        try {
            try {
                httpURLConnectionA = d2.a(c6.f21651b.getImageRequest().getSourceUri(), 5);
                try {
                    c6.f21466g = d2.f21470c.now();
                    if (httpURLConnectionA != null) {
                        inputStream = httpURLConnectionA.getInputStream();
                        r3.onResponse(inputStream, -1);
                    }
                    if (r10 != 0) {
                        try {
                            r10 = inputStream;
                            r10.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionA == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    r3.onFailure(e);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionA == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (0 != 0) {
                    throw th;
                }
                inputStream.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnectionA = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                inputStream.close();
            }
            if (0 != 0) {
                throw th;
            }
            inputStream.disconnect();
            throw th;
        }
        httpURLConnectionA.disconnect();
    }
}
